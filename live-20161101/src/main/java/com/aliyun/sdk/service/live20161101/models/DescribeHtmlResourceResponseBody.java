// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHtmlResourceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHtmlResourceResponseBody</p>
 */
public class DescribeHtmlResourceResponseBody extends TeaModel {
    @NameInMap("HtmlResource")
    private HtmlResource htmlResource;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeHtmlResourceResponseBody(Builder builder) {
        this.htmlResource = builder.htmlResource;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHtmlResourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return htmlResource
     */
    public HtmlResource getHtmlResource() {
        return this.htmlResource;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private HtmlResource htmlResource; 
        private String requestId; 

        /**
         * HtmlResource.
         */
        public Builder htmlResource(HtmlResource htmlResource) {
            this.htmlResource = htmlResource;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeHtmlResourceResponseBody build() {
            return new DescribeHtmlResourceResponseBody(this);
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

        @NameInMap("StreamId")
        private String streamId;

        private HtmlResource(Builder builder) {
            this.casterId = builder.casterId;
            this.config = builder.config;
            this.htmlContent = builder.htmlContent;
            this.htmlResourceId = builder.htmlResourceId;
            this.htmlUrl = builder.htmlUrl;
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
}
