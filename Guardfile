guard :shell do
  watch /.*\.rb$/ do |m|
    `reveal-ck generate`
    puts 'Slides regenerated'
  end
end
