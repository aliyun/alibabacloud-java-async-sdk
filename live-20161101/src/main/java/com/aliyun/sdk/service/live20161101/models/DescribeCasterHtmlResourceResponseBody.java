// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCasterHtmlResourceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCasterHtmlResourceResponseBody</p>
 */
public class DescribeCasterHtmlResourceResponseBody extends TeaModel {
    @NameInMap("HtmlResourceList")
    private HtmlResourceList htmlResourceList;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeCasterHtmlResourceResponseBody(Builder builder) {
        this.htmlResourceList = builder.htmlResourceList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCasterHtmlResourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return htmlResourceList
     */
    public HtmlResourceList getHtmlResourceList() {
        return this.htmlResourceList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private HtmlResourceList htmlResourceList; 
        private String requestId; 

        /**
         * HtmlResourceList.
         */
        public Builder htmlResourceList(HtmlResourceList htmlResourceList) {
            this.htmlResourceList = htmlResourceList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCasterHtmlResourceResponseBody build() {
            return new DescribeCasterHtmlResourceResponseBody(this);
        } 

    } 

    public static class HtmlResource extends TeaModel {
        @NameInMap("CasterId")
        private String casterId;

        @NameInMap("Config")
        private String config;

        @NameInMap("HtmlContent")
        private String htmlContent;

        @NameInMap("HtmlResourceId")
        private String htmlResourceId;

        @NameInMap("HtmlUrl")
        private String htmlUrl;

        @NameInMap("Status")
        private String status;

        @NameInMap("StreamId")
        private String streamId;

        private HtmlResource(Builder builder) {
            this.casterId = builder.casterId;
            this.config = builder.config;
            this.htmlContent = builder.htmlContent;
            this.htmlResourceId = builder.htmlResourceId;
            this.htmlUrl = builder.htmlUrl;
            this.status = builder.status;
            this.streamId = builder.streamId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HtmlResource create() {
            return builder().build();
        }

        /**
         * @return casterId
         */
        public String getCasterId() {
            return this.casterId;
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return htmlContent
         */
        public String getHtmlContent() {
            return this.htmlContent;
        }

        /**
         * @return htmlResourceId
         */
        public String getHtmlResourceId() {
            return this.htmlResourceId;
        }

        /**
         * @return htmlUrl
         */
        public String getHtmlUrl() {
            return this.htmlUrl;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return streamId
         */
        public String getStreamId() {
            return this.streamId;
        }

        public static final class Builder {
            private String casterId; 
            private String config; 
            private String htmlContent; 
            private String htmlResourceId; 
            private String htmlUrl; 
            private String status; 
            private String streamId; 

            /**
             * CasterId.
             */
            public Builder casterId(String casterId) {
                this.casterId = casterId;
                return this;
            }

            /**
             * Config.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * HtmlContent.
             */
            public Builder htmlContent(String htmlContent) {
                this.htmlContent = htmlContent;
                return this;
            }

            /**
             * HtmlResourceId.
             */
            public Builder htmlResourceId(String htmlResourceId) {
                this.htmlResourceId = htmlResourceId;
                return this;
            }

            /**
             * HtmlUrl.
             */
            public Builder htmlUrl(String htmlUrl) {
                this.htmlUrl = htmlUrl;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StreamId.
             */
            public Builder streamId(String streamId) {
                this.streamId = streamId;
                return this;
            }

            public HtmlResource build() {
                return new HtmlResource(this);
            } 

        } 

    }
    public static class HtmlResourceList extends TeaModel {
        @NameInMap("HtmlResource")
        private java.util.List < HtmlResource> htmlResource;

        private HtmlResourceList(Builder builder) {
            this.htmlResource = builder.htmlResource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HtmlResourceList create() {
            return builder().build();
        }

        /**
         * @return htmlResource
         */
        public java.util.List < HtmlResource> getHtmlResource() {
            return this.htmlResource;
        }

        public static final class Builder {
            private java.util.List < HtmlResource> htmlResource; 

            /**
             * HtmlResource.
             */
            public Builder htmlResource(java.util.List < HtmlResource> htmlResource) {
                this.htmlResource = htmlResource;
                return this;
            }

            public HtmlResourceList build() {
                return new HtmlResourceList(this);
            } 

        } 

    }
}
