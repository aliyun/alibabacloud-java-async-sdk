// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFlowResponseBody} extends {@link TeaModel}
 *
 * <p>GetFlowResponseBody</p>
 */
public class GetFlowResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetFlowResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFlowResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * If OK is returned, the request was successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetFlowResponseBody build() {
            return new GetFlowResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Categories")
        private java.util.List < String > categories;

        @com.aliyun.core.annotation.NameInMap("DataApiVersion")
        private String dataApiVersion;

        @com.aliyun.core.annotation.NameInMap("FlowId")
        private String flowId;

        @com.aliyun.core.annotation.NameInMap("FlowName")
        private String flowName;

        @com.aliyun.core.annotation.NameInMap("JSONVersion")
        private String JSONVersion;

        @com.aliyun.core.annotation.NameInMap("PreviewUrl")
        private String previewUrl;

        @com.aliyun.core.annotation.NameInMap("PreviewUrlExpires")
        private Long previewUrlExpires;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.categories = builder.categories;
            this.dataApiVersion = builder.dataApiVersion;
            this.flowId = builder.flowId;
            this.flowName = builder.flowName;
            this.JSONVersion = builder.JSONVersion;
            this.previewUrl = builder.previewUrl;
            this.previewUrlExpires = builder.previewUrlExpires;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return categories
         */
        public java.util.List < String > getCategories() {
            return this.categories;
        }

        /**
         * @return dataApiVersion
         */
        public String getDataApiVersion() {
            return this.dataApiVersion;
        }

        /**
         * @return flowId
         */
        public String getFlowId() {
            return this.flowId;
        }

        /**
         * @return flowName
         */
        public String getFlowName() {
            return this.flowName;
        }

        /**
         * @return JSONVersion
         */
        public String getJSONVersion() {
            return this.JSONVersion;
        }

        /**
         * @return previewUrl
         */
        public String getPreviewUrl() {
            return this.previewUrl;
        }

        /**
         * @return previewUrlExpires
         */
        public Long getPreviewUrlExpires() {
            return this.previewUrlExpires;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List < String > categories; 
            private String dataApiVersion; 
            private String flowId; 
            private String flowName; 
            private String JSONVersion; 
            private String previewUrl; 
            private Long previewUrlExpires; 
            private String status; 

            /**
             * The categories of the Flow.
             */
            public Builder categories(java.util.List < String > categories) {
                this.categories = categories;
                return this;
            }

            /**
             * The API version.
             */
            public Builder dataApiVersion(String dataApiVersion) {
                this.dataApiVersion = dataApiVersion;
                return this;
            }

            /**
             * The Flow ID.
             */
            public Builder flowId(String flowId) {
                this.flowId = flowId;
                return this;
            }

            /**
             * The name of the Flow.
             */
            public Builder flowName(String flowName) {
                this.flowName = flowName;
                return this;
            }

            /**
             * The JSON version.
             */
            public Builder JSONVersion(String JSONVersion) {
                this.JSONVersion = JSONVersion;
                return this;
            }

            /**
             * The temporary preview URL.
             */
            public Builder previewUrl(String previewUrl) {
                this.previewUrl = previewUrl;
                return this;
            }

            /**
             * The time when the preview URL expires. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder previewUrlExpires(Long previewUrlExpires) {
                this.previewUrlExpires = previewUrlExpires;
                return this;
            }

            /**
             * The state of the Flow.
             * <p>
             * 
             * Valid values:
             * 
             * *   PUBLISHED
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   DRAFT
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   DEPRECATED
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
