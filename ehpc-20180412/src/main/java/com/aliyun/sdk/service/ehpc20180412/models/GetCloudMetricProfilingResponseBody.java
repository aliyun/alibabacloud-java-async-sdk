// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCloudMetricProfilingResponseBody} extends {@link TeaModel}
 *
 * <p>GetCloudMetricProfilingResponseBody</p>
 */
public class GetCloudMetricProfilingResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SvgUrls")
    private SvgUrls svgUrls;

    private GetCloudMetricProfilingResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.svgUrls = builder.svgUrls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCloudMetricProfilingResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return svgUrls
     */
    public SvgUrls getSvgUrls() {
        return this.svgUrls;
    }

    public static final class Builder {
        private String requestId; 
        private SvgUrls svgUrls; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SvgUrls.
         */
        public Builder svgUrls(SvgUrls svgUrls) {
            this.svgUrls = svgUrls;
            return this;
        }

        public GetCloudMetricProfilingResponseBody build() {
            return new GetCloudMetricProfilingResponseBody(this);
        } 

    } 

    public static class SvgInfo extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Size")
        private Integer size;

        @NameInMap("Type")
        private String type;

        @NameInMap("Url")
        private String url;

        private SvgInfo(Builder builder) {
            this.name = builder.name;
            this.size = builder.size;
            this.type = builder.type;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SvgInfo create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String name; 
            private Integer size; 
            private String type; 
            private String url; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public SvgInfo build() {
                return new SvgInfo(this);
            } 

        } 

    }
    public static class SvgUrls extends TeaModel {
        @NameInMap("SvgInfo")
        private java.util.List < SvgInfo> svgInfo;

        private SvgUrls(Builder builder) {
            this.svgInfo = builder.svgInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SvgUrls create() {
            return builder().build();
        }

        /**
         * @return svgInfo
         */
        public java.util.List < SvgInfo> getSvgInfo() {
            return this.svgInfo;
        }

        public static final class Builder {
            private java.util.List < SvgInfo> svgInfo; 

            /**
             * SvgInfo.
             */
            public Builder svgInfo(java.util.List < SvgInfo> svgInfo) {
                this.svgInfo = svgInfo;
                return this;
            }

            public SvgUrls build() {
                return new SvgUrls(this);
            } 

        } 

    }
}
