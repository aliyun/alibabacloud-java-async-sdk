// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFlowResponseBody} extends {@link TeaModel}
 *
 * <p>GetFlowResponseBody</p>
 */
public class GetFlowResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Id of the request。
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
        @NameInMap("Categories")
        private java.util.List < String > categories;

        @NameInMap("DataApiVersion")
        private String dataApiVersion;

        @NameInMap("FlowId")
        private String flowId;

        @NameInMap("FlowName")
        private String flowName;

        @NameInMap("JSONVersion")
        private String JSONVersion;

        @NameInMap("PreviewUrl")
        private String previewUrl;

        @NameInMap("PreviewUrlExpires")
        private Long previewUrlExpires;

        @NameInMap("Status")
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
             * Categories.
             */
            public Builder categories(java.util.List < String > categories) {
                this.categories = categories;
                return this;
            }

            /**
             * DataApiVersion.
             */
            public Builder dataApiVersion(String dataApiVersion) {
                this.dataApiVersion = dataApiVersion;
                return this;
            }

            /**
             * flow ID。
             */
            public Builder flowId(String flowId) {
                this.flowId = flowId;
                return this;
            }

            /**
             * FlowName.
             */
            public Builder flowName(String flowName) {
                this.flowName = flowName;
                return this;
            }

            /**
             * JSONVersion.
             */
            public Builder JSONVersion(String JSONVersion) {
                this.JSONVersion = JSONVersion;
                return this;
            }

            /**
             * PreviewUrl.
             */
            public Builder previewUrl(String previewUrl) {
                this.previewUrl = previewUrl;
                return this;
            }

            /**
             * PreviewUrlExpires.
             */
            public Builder previewUrlExpires(Long previewUrlExpires) {
                this.previewUrlExpires = previewUrlExpires;
                return this;
            }

            /**
             * Status.
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
