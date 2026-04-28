// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchplat20240529.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetImageObjectDetectionResponseBody} extends {@link TeaModel}
 *
 * <p>GetImageObjectDetectionResponseBody</p>
 */
public class GetImageObjectDetectionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("latency")
    private Integer latency;

    @com.aliyun.core.annotation.NameInMap("request_id")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("usage")
    private Usage usage;

    private GetImageObjectDetectionResponseBody(Builder builder) {
        this.latency = builder.latency;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.usage = builder.usage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetImageObjectDetectionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return latency
     */
    public Integer getLatency() {
        return this.latency;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return usage
     */
    public Usage getUsage() {
        return this.usage;
    }

    public static final class Builder {
        private Integer latency; 
        private String requestId; 
        private Result result; 
        private Usage usage; 

        private Builder() {
        } 

        private Builder(GetImageObjectDetectionResponseBody model) {
            this.latency = model.latency;
            this.requestId = model.requestId;
            this.result = model.result;
            this.usage = model.usage;
        } 

        /**
         * latency.
         */
        public Builder latency(Integer latency) {
            this.latency = latency;
            return this;
        }

        /**
         * request_id.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * usage.
         */
        public Builder usage(Usage usage) {
            this.usage = usage;
            return this;
        }

        public GetImageObjectDetectionResponseBody build() {
            return new GetImageObjectDetectionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetImageObjectDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageObjectDetectionResponseBody</p>
     */
    public static class Location extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("X")
        private Integer x;

        @com.aliyun.core.annotation.NameInMap("Y")
        private Integer y;

        @com.aliyun.core.annotation.NameInMap("height")
        private Integer height;

        @com.aliyun.core.annotation.NameInMap("width")
        private Integer width;

        private Location(Builder builder) {
            this.x = builder.x;
            this.y = builder.y;
            this.height = builder.height;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Location create() {
            return builder().build();
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
            private Integer x; 
            private Integer y; 
            private Integer height; 
            private Integer width; 

            private Builder() {
            } 

            private Builder(Location model) {
                this.x = model.x;
                this.y = model.y;
                this.height = model.height;
                this.width = model.width;
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

            /**
             * height.
             */
            public Builder height(Integer height) {
                this.height = height;
                return this;
            }

            /**
             * width.
             */
            public Builder width(Integer width) {
                this.width = width;
                return this;
            }

            public Location build() {
                return new Location(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetImageObjectDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageObjectDetectionResponseBody</p>
     */
    public static class Objects extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("confidence")
        private String confidence;

        @com.aliyun.core.annotation.NameInMap("location")
        private Location location;

        private Objects(Builder builder) {
            this.confidence = builder.confidence;
            this.location = builder.location;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Objects create() {
            return builder().build();
        }

        /**
         * @return confidence
         */
        public String getConfidence() {
            return this.confidence;
        }

        /**
         * @return location
         */
        public Location getLocation() {
            return this.location;
        }

        public static final class Builder {
            private String confidence; 
            private Location location; 

            private Builder() {
            } 

            private Builder(Objects model) {
                this.confidence = model.confidence;
                this.location = model.location;
            } 

            /**
             * confidence.
             */
            public Builder confidence(String confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * location.
             */
            public Builder location(Location location) {
                this.location = location;
                return this;
            }

            public Objects build() {
                return new Objects(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetImageObjectDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageObjectDetectionResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("objects")
        private java.util.List<Objects> objects;

        private Result(Builder builder) {
            this.objects = builder.objects;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return objects
         */
        public java.util.List<Objects> getObjects() {
            return this.objects;
        }

        public static final class Builder {
            private java.util.List<Objects> objects; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.objects = model.objects;
            } 

            /**
             * objects.
             */
            public Builder objects(java.util.List<Objects> objects) {
                this.objects = objects;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetImageObjectDetectionResponseBody} extends {@link TeaModel}
     *
     * <p>GetImageObjectDetectionResponseBody</p>
     */
    public static class Usage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("image")
        private Long image;

        private Usage(Builder builder) {
            this.image = builder.image;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Usage create() {
            return builder().build();
        }

        /**
         * @return image
         */
        public Long getImage() {
            return this.image;
        }

        public static final class Builder {
            private Long image; 

            private Builder() {
            } 

            private Builder(Usage model) {
                this.image = model.image;
            } 

            /**
             * image.
             */
            public Builder image(Long image) {
                this.image = image;
                return this;
            }

            public Usage build() {
                return new Usage(this);
            } 

        } 

    }
}
