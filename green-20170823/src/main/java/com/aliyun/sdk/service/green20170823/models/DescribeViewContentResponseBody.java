// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeViewContentResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeViewContentResponseBody</p>
 */
public class DescribeViewContentResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("ViewContentList")
    private java.util.List < ViewContentList> viewContentList;

    private DescribeViewContentResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.viewContentList = builder.viewContentList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeViewContentResponseBody create() {
        return builder().build();
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return viewContentList
     */
    public java.util.List < ViewContentList> getViewContentList() {
        return this.viewContentList;
    }

    public static final class Builder {
        private Integer currentPage; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List < ViewContentList> viewContentList; 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * ViewContentList.
         */
        public Builder viewContentList(java.util.List < ViewContentList> viewContentList) {
            this.viewContentList = viewContentList;
            return this;
        }

        public DescribeViewContentResponseBody build() {
            return new DescribeViewContentResponseBody(this);
        } 

    } 

    public static class Age extends TeaModel {
        @NameInMap("Rate")
        private Float rate;

        @NameInMap("Value")
        private Integer value;

        private Age(Builder builder) {
            this.rate = builder.rate;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Age create() {
            return builder().build();
        }

        /**
         * @return rate
         */
        public Float getRate() {
            return this.rate;
        }

        /**
         * @return value
         */
        public Integer getValue() {
            return this.value;
        }

        public static final class Builder {
            private Float rate; 
            private Integer value; 

            /**
             * Rate.
             */
            public Builder rate(Float rate) {
                this.rate = rate;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Integer value) {
                this.value = value;
                return this;
            }

            public Age build() {
                return new Age(this);
            } 

        } 

    }
    public static class Bang extends TeaModel {
        @NameInMap("Rate")
        private Float rate;

        @NameInMap("Value")
        private String value;

        private Bang(Builder builder) {
            this.rate = builder.rate;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Bang create() {
            return builder().build();
        }

        /**
         * @return rate
         */
        public Float getRate() {
            return this.rate;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Float rate; 
            private String value; 

            /**
             * Rate.
             */
            public Builder rate(Float rate) {
                this.rate = rate;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Bang build() {
                return new Bang(this);
            } 

        } 

    }
    public static class Gender extends TeaModel {
        @NameInMap("Rate")
        private Float rate;

        @NameInMap("Value")
        private String value;

        private Gender(Builder builder) {
            this.rate = builder.rate;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Gender create() {
            return builder().build();
        }

        /**
         * @return rate
         */
        public Float getRate() {
            return this.rate;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Float rate; 
            private String value; 

            /**
             * Rate.
             */
            public Builder rate(Float rate) {
                this.rate = rate;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Gender build() {
                return new Gender(this);
            } 

        } 

    }
    public static class Glasses extends TeaModel {
        @NameInMap("Rate")
        private Float rate;

        @NameInMap("Value")
        private String value;

        private Glasses(Builder builder) {
            this.rate = builder.rate;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Glasses create() {
            return builder().build();
        }

        /**
         * @return rate
         */
        public Float getRate() {
            return this.rate;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Float rate; 
            private String value; 

            /**
             * Rate.
             */
            public Builder rate(Float rate) {
                this.rate = rate;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Glasses build() {
                return new Glasses(this);
            } 

        } 

    }
    public static class Hairstyle extends TeaModel {
        @NameInMap("Rate")
        private Float rate;

        @NameInMap("Value")
        private String value;

        private Hairstyle(Builder builder) {
            this.rate = builder.rate;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Hairstyle create() {
            return builder().build();
        }

        /**
         * @return rate
         */
        public Float getRate() {
            return this.rate;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Float rate; 
            private String value; 

            /**
             * Rate.
             */
            public Builder rate(Float rate) {
                this.rate = rate;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Hairstyle build() {
                return new Hairstyle(this);
            } 

        } 

    }
    public static class Hat extends TeaModel {
        @NameInMap("Rate")
        private Float rate;

        @NameInMap("Value")
        private String value;

        private Hat(Builder builder) {
            this.rate = builder.rate;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Hat create() {
            return builder().build();
        }

        /**
         * @return rate
         */
        public Float getRate() {
            return this.rate;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Float rate; 
            private String value; 

            /**
             * Rate.
             */
            public Builder rate(Float rate) {
                this.rate = rate;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Hat build() {
                return new Hat(this);
            } 

        } 

    }
    public static class Image extends TeaModel {
        @NameInMap("Height")
        private Integer height;

        @NameInMap("Width")
        private Integer width;

        private Image(Builder builder) {
            this.height = builder.height;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Image create() {
            return builder().build();
        }

        /**
         * @return height
         */
        public Integer getHeight() {
            return this.height;
        }

        /**
         * @return width
         */
        public Integer getWidth() {
            return this.width;
        }

        public static final class Builder {
            private Integer height; 
            private Integer width; 

            /**
             * Height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * Width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public Image build() {
                return new Image(this);
            } 

        } 

    }
    public static class Location extends TeaModel {
        @NameInMap("H")
        private Integer h;

        @NameInMap("W")
        private Integer w;

        @NameInMap("X")
        private Integer x;

        @NameInMap("Y")
        private Integer y;

        private Location(Builder builder) {
            this.h = builder.h;
            this.w = builder.w;
            this.x = builder.x;
            this.y = builder.y;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Location create() {
            return builder().build();
        }

        /**
         * @return h
         */
        public Integer getH() {
            return this.h;
        }

        /**
         * @return w
         */
        public Integer getW() {
            return this.w;
        }

        /**
         * @return x
         */
        public Integer getX() {
            return this.x;
        }

        /**
         * @return y
         */
        public Integer getY() {
            return this.y;
        }

        public static final class Builder {
            private Integer h; 
            private Integer w; 
            private Integer x; 
            private Integer y; 

            /**
             * H.
             */
            public Builder h(Integer h) {
                this.h = h;
                return this;
            }

            /**
             * W.
             */
            public Builder w(Integer w) {
                this.w = w;
                return this;
            }

            /**
             * X.
             */
            public Builder x(Integer x) {
                this.x = x;
                return this;
            }

            /**
             * Y.
             */
            public Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public Location build() {
                return new Location(this);
            } 

        } 

    }
    public static class Mustache extends TeaModel {
        @NameInMap("Rate")
        private Float rate;

        @NameInMap("Value")
        private String value;

        private Mustache(Builder builder) {
            this.rate = builder.rate;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Mustache create() {
            return builder().build();
        }

        /**
         * @return rate
         */
        public Float getRate() {
            return this.rate;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Float rate; 
            private String value; 

            /**
             * Rate.
             */
            public Builder rate(Float rate) {
                this.rate = rate;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Mustache build() {
                return new Mustache(this);
            } 

        } 

    }
    public static class Quality extends TeaModel {
        @NameInMap("Blur")
        private Float blur;

        @NameInMap("Pitch")
        private Float pitch;

        @NameInMap("Roll")
        private Float roll;

        @NameInMap("Yaw")
        private Float yaw;

        private Quality(Builder builder) {
            this.blur = builder.blur;
            this.pitch = builder.pitch;
            this.roll = builder.roll;
            this.yaw = builder.yaw;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Quality create() {
            return builder().build();
        }

        /**
         * @return blur
         */
        public Float getBlur() {
            return this.blur;
        }

        /**
         * @return pitch
         */
        public Float getPitch() {
            return this.pitch;
        }

        /**
         * @return roll
         */
        public Float getRoll() {
            return this.roll;
        }

        /**
         * @return yaw
         */
        public Float getYaw() {
            return this.yaw;
        }

        public static final class Builder {
            private Float blur; 
            private Float pitch; 
            private Float roll; 
            private Float yaw; 

            /**
             * Blur.
             */
            public Builder blur(Float blur) {
                this.blur = blur;
                return this;
            }

            /**
             * Pitch.
             */
            public Builder pitch(Float pitch) {
                this.pitch = pitch;
                return this;
            }

            /**
             * Roll.
             */
            public Builder roll(Float roll) {
                this.roll = roll;
                return this;
            }

            /**
             * Yaw.
             */
            public Builder yaw(Float yaw) {
                this.yaw = yaw;
                return this;
            }

            public Quality build() {
                return new Quality(this);
            } 

        } 

    }
    public static class Respirator extends TeaModel {
        @NameInMap("Rate")
        private Float rate;

        @NameInMap("Value")
        private String value;

        private Respirator(Builder builder) {
            this.rate = builder.rate;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Respirator create() {
            return builder().build();
        }

        /**
         * @return rate
         */
        public Float getRate() {
            return this.rate;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Float rate; 
            private String value; 

            /**
             * Rate.
             */
            public Builder rate(Float rate) {
                this.rate = rate;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Respirator build() {
                return new Respirator(this);
            } 

        } 

    }
    public static class Smile extends TeaModel {
        @NameInMap("Rate")
        private Float rate;

        @NameInMap("Value")
        private Float value;

        private Smile(Builder builder) {
            this.rate = builder.rate;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Smile create() {
            return builder().build();
        }

        /**
         * @return rate
         */
        public Float getRate() {
            return this.rate;
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private Float rate; 
            private Float value; 

            /**
             * Rate.
             */
            public Builder rate(Float rate) {
                this.rate = rate;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public Smile build() {
                return new Smile(this);
            } 

        } 

    }
    public static class FaceResults extends TeaModel {
        @NameInMap("Age")
        private Age age;

        @NameInMap("Bang")
        private Bang bang;

        @NameInMap("Bualified")
        private Boolean bualified;

        @NameInMap("Gender")
        private Gender gender;

        @NameInMap("Glasses")
        private Glasses glasses;

        @NameInMap("Hairstyle")
        private Hairstyle hairstyle;

        @NameInMap("Hat")
        private Hat hat;

        @NameInMap("Image")
        private Image image;

        @NameInMap("Location")
        private Location location;

        @NameInMap("Mustache")
        private Mustache mustache;

        @NameInMap("Quality")
        private Quality quality;

        @NameInMap("Respirator")
        private Respirator respirator;

        @NameInMap("Smile")
        private Smile smile;

        private FaceResults(Builder builder) {
            this.age = builder.age;
            this.bang = builder.bang;
            this.bualified = builder.bualified;
            this.gender = builder.gender;
            this.glasses = builder.glasses;
            this.hairstyle = builder.hairstyle;
            this.hat = builder.hat;
            this.image = builder.image;
            this.location = builder.location;
            this.mustache = builder.mustache;
            this.quality = builder.quality;
            this.respirator = builder.respirator;
            this.smile = builder.smile;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FaceResults create() {
            return builder().build();
        }

        /**
         * @return age
         */
        public Age getAge() {
            return this.age;
        }

        /**
         * @return bang
         */
        public Bang getBang() {
            return this.bang;
        }

        /**
         * @return bualified
         */
        public Boolean getBualified() {
            return this.bualified;
        }

        /**
         * @return gender
         */
        public Gender getGender() {
            return this.gender;
        }

        /**
         * @return glasses
         */
        public Glasses getGlasses() {
            return this.glasses;
        }

        /**
         * @return hairstyle
         */
        public Hairstyle getHairstyle() {
            return this.hairstyle;
        }

        /**
         * @return hat
         */
        public Hat getHat() {
            return this.hat;
        }

        /**
         * @return image
         */
        public Image getImage() {
            return this.image;
        }

        /**
         * @return location
         */
        public Location getLocation() {
            return this.location;
        }

        /**
         * @return mustache
         */
        public Mustache getMustache() {
            return this.mustache;
        }

        /**
         * @return quality
         */
        public Quality getQuality() {
            return this.quality;
        }

        /**
         * @return respirator
         */
        public Respirator getRespirator() {
            return this.respirator;
        }

        /**
         * @return smile
         */
        public Smile getSmile() {
            return this.smile;
        }

        public static final class Builder {
            private Age age; 
            private Bang bang; 
            private Boolean bualified; 
            private Gender gender; 
            private Glasses glasses; 
            private Hairstyle hairstyle; 
            private Hat hat; 
            private Image image; 
            private Location location; 
            private Mustache mustache; 
            private Quality quality; 
            private Respirator respirator; 
            private Smile smile; 

            /**
             * Age.
             */
            public Builder age(Age age) {
                this.age = age;
                return this;
            }

            /**
             * Bang.
             */
            public Builder bang(Bang bang) {
                this.bang = bang;
                return this;
            }

            /**
             * Bualified.
             */
            public Builder bualified(Boolean bualified) {
                this.bualified = bualified;
                return this;
            }

            /**
             * Gender.
             */
            public Builder gender(Gender gender) {
                this.gender = gender;
                return this;
            }

            /**
             * Glasses.
             */
            public Builder glasses(Glasses glasses) {
                this.glasses = glasses;
                return this;
            }

            /**
             * Hairstyle.
             */
            public Builder hairstyle(Hairstyle hairstyle) {
                this.hairstyle = hairstyle;
                return this;
            }

            /**
             * Hat.
             */
            public Builder hat(Hat hat) {
                this.hat = hat;
                return this;
            }

            /**
             * Image.
             */
            public Builder image(Image image) {
                this.image = image;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(Location location) {
                this.location = location;
                return this;
            }

            /**
             * Mustache.
             */
            public Builder mustache(Mustache mustache) {
                this.mustache = mustache;
                return this;
            }

            /**
             * Quality.
             */
            public Builder quality(Quality quality) {
                this.quality = quality;
                return this;
            }

            /**
             * Respirator.
             */
            public Builder respirator(Respirator respirator) {
                this.respirator = respirator;
                return this;
            }

            /**
             * Smile.
             */
            public Builder smile(Smile smile) {
                this.smile = smile;
                return this;
            }

            public FaceResults build() {
                return new FaceResults(this);
            } 

        } 

    }
    public static class FrameResults extends TeaModel {
        @NameInMap("Label")
        private String label;

        @NameInMap("Offset")
        private Integer offset;

        @NameInMap("Url")
        private String url;

        private FrameResults(Builder builder) {
            this.label = builder.label;
            this.offset = builder.offset;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FrameResults create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return offset
         */
        public Integer getOffset() {
            return this.offset;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String label; 
            private Integer offset; 
            private String url; 

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * Offset.
             */
            public Builder offset(Integer offset) {
                this.offset = offset;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public FrameResults build() {
                return new FrameResults(this);
            } 

        } 

    }
    public static class Results extends TeaModel {
        @NameInMap("Label")
        private String label;

        @NameInMap("Scene")
        private String scene;

        @NameInMap("Suggestion")
        private String suggestion;

        private Results(Builder builder) {
            this.label = builder.label;
            this.scene = builder.scene;
            this.suggestion = builder.suggestion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        public static final class Builder {
            private String label; 
            private String scene; 
            private String suggestion; 

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * Scene.
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * Suggestion.
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
    public static class ViewContentList extends TeaModel {
        @NameInMap("BizType")
        private String bizType;

        @NameInMap("Content")
        private String content;

        @NameInMap("DataId")
        private String dataId;

        @NameInMap("FaceResults")
        private java.util.List < FaceResults> faceResults;

        @NameInMap("FrameResults")
        private java.util.List < FrameResults> frameResults;

        @NameInMap("Id")
        private Long id;

        @NameInMap("NewUrl")
        private String newUrl;

        @NameInMap("RequestTime")
        private String requestTime;

        @NameInMap("Results")
        private java.util.List < Results> results;

        @NameInMap("ScanFinishedTime")
        private String scanFinishedTime;

        @NameInMap("ScanResult")
        private String scanResult;

        @NameInMap("Suggestion")
        private String suggestion;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("Thumbnail")
        private String thumbnail;

        @NameInMap("Url")
        private String url;

        private ViewContentList(Builder builder) {
            this.bizType = builder.bizType;
            this.content = builder.content;
            this.dataId = builder.dataId;
            this.faceResults = builder.faceResults;
            this.frameResults = builder.frameResults;
            this.id = builder.id;
            this.newUrl = builder.newUrl;
            this.requestTime = builder.requestTime;
            this.results = builder.results;
            this.scanFinishedTime = builder.scanFinishedTime;
            this.scanResult = builder.scanResult;
            this.suggestion = builder.suggestion;
            this.taskId = builder.taskId;
            this.thumbnail = builder.thumbnail;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ViewContentList create() {
            return builder().build();
        }

        /**
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return dataId
         */
        public String getDataId() {
            return this.dataId;
        }

        /**
         * @return faceResults
         */
        public java.util.List < FaceResults> getFaceResults() {
            return this.faceResults;
        }

        /**
         * @return frameResults
         */
        public java.util.List < FrameResults> getFrameResults() {
            return this.frameResults;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return newUrl
         */
        public String getNewUrl() {
            return this.newUrl;
        }

        /**
         * @return requestTime
         */
        public String getRequestTime() {
            return this.requestTime;
        }

        /**
         * @return results
         */
        public java.util.List < Results> getResults() {
            return this.results;
        }

        /**
         * @return scanFinishedTime
         */
        public String getScanFinishedTime() {
            return this.scanFinishedTime;
        }

        /**
         * @return scanResult
         */
        public String getScanResult() {
            return this.scanResult;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return thumbnail
         */
        public String getThumbnail() {
            return this.thumbnail;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String bizType; 
            private String content; 
            private String dataId; 
            private java.util.List < FaceResults> faceResults; 
            private java.util.List < FrameResults> frameResults; 
            private Long id; 
            private String newUrl; 
            private String requestTime; 
            private java.util.List < Results> results; 
            private String scanFinishedTime; 
            private String scanResult; 
            private String suggestion; 
            private String taskId; 
            private String thumbnail; 
            private String url; 

            /**
             * BizType.
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * DataId.
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * FaceResults.
             */
            public Builder faceResults(java.util.List < FaceResults> faceResults) {
                this.faceResults = faceResults;
                return this;
            }

            /**
             * FrameResults.
             */
            public Builder frameResults(java.util.List < FrameResults> frameResults) {
                this.frameResults = frameResults;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * NewUrl.
             */
            public Builder newUrl(String newUrl) {
                this.newUrl = newUrl;
                return this;
            }

            /**
             * RequestTime.
             */
            public Builder requestTime(String requestTime) {
                this.requestTime = requestTime;
                return this;
            }

            /**
             * Results.
             */
            public Builder results(java.util.List < Results> results) {
                this.results = results;
                return this;
            }

            /**
             * ScanFinishedTime.
             */
            public Builder scanFinishedTime(String scanFinishedTime) {
                this.scanFinishedTime = scanFinishedTime;
                return this;
            }

            /**
             * ScanResult.
             */
            public Builder scanResult(String scanResult) {
                this.scanResult = scanResult;
                return this;
            }

            /**
             * Suggestion.
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * Thumbnail.
             */
            public Builder thumbnail(String thumbnail) {
                this.thumbnail = thumbnail;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public ViewContentList build() {
                return new ViewContentList(this);
            } 

        } 

    }
}
