// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link GetCloudMetricProfilingResponseBody} extends {@link TeaModel}
 *
 * <p>GetCloudMetricProfilingResponseBody</p>
 */
public class GetCloudMetricProfilingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SvgUrls")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetCloudMetricProfilingResponseBody model) {
            this.requestId = model.requestId;
            this.svgUrls = model.svgUrls;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0DD6F715-85EE-4EA6-BDC4-48A75B719068</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of profiling results.</p>
         */
        public Builder svgUrls(SvgUrls svgUrls) {
            this.svgUrls = svgUrls;
            return this;
        }

        public GetCloudMetricProfilingResponseBody build() {
            return new GetCloudMetricProfilingResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCloudMetricProfilingResponseBody} extends {@link TeaModel}
     *
     * <p>GetCloudMetricProfilingResponseBody</p>
     */
    public static class SvgInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Url")
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

            private Builder() {
            } 

            private Builder(SvgInfo model) {
                this.name = model.name;
                this.size = model.size;
                this.type = model.type;
                this.url = model.url;
            } 

            /**
             * <p>The name of the SVG file that contains the profiling results.</p>
             * 
             * <strong>example:</strong>
             * <p>ehpc-hz-faRavbPf6b_i-bdrftgyh890654****_21687_2019-09-09-02-37-40.bottomup.svg</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The size of the SVG file. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>648</p>
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The type of the SVG file.</p>
             * 
             * <strong>example:</strong>
             * <p>file</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The URL of the Object Storage Service (OSS) bucket where the scalable vector graphics (SVG) file is stored.</p>
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
    /**
     * 
     * {@link GetCloudMetricProfilingResponseBody} extends {@link TeaModel}
     *
     * <p>GetCloudMetricProfilingResponseBody</p>
     */
    public static class SvgUrls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SvgInfo")
        private java.util.List<SvgInfo> svgInfo;

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
        public java.util.List<SvgInfo> getSvgInfo() {
            return this.svgInfo;
        }

        public static final class Builder {
            private java.util.List<SvgInfo> svgInfo; 

            private Builder() {
            } 

            private Builder(SvgUrls model) {
                this.svgInfo = model.svgInfo;
            } 

            /**
             * SvgInfo.
             */
            public Builder svgInfo(java.util.List<SvgInfo> svgInfo) {
                this.svgInfo = svgInfo;
                return this;
            }

            public SvgUrls build() {
                return new SvgUrls(this);
            } 

        } 

    }
}
