// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

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
 * {@link GetFlowResponseBody} extends {@link TeaModel}
 *
 * <p>GetFlowResponseBody</p>
 */
public class GetFlowResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetFlowResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetFlowResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details about the access denial.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The error code. For more information, see <a href="https://help.aliyun.com/document_detail/196974.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DAC72B08-3327-33EF-BEDC-8EC3E83A6575</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetFlowResponseBody build() {
            return new GetFlowResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetFlowResponseBody} extends {@link TeaModel}
     *
     * <p>GetFlowResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Categories")
        private java.util.List<String> categories;

        @com.aliyun.core.annotation.NameInMap("DataApiVersion")
        private String dataApiVersion;

        @com.aliyun.core.annotation.NameInMap("EndpointUri")
        private String endpointUri;

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
            this.endpointUri = builder.endpointUri;
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
        public java.util.List<String> getCategories() {
            return this.categories;
        }

        /**
         * @return dataApiVersion
         */
        public String getDataApiVersion() {
            return this.dataApiVersion;
        }

        /**
         * @return endpointUri
         */
        public String getEndpointUri() {
            return this.endpointUri;
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
            private java.util.List<String> categories; 
            private String dataApiVersion; 
            private String endpointUri; 
            private String flowId; 
            private String flowName; 
            private String JSONVersion; 
            private String previewUrl; 
            private Long previewUrlExpires; 
            private String status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.categories = model.categories;
                this.dataApiVersion = model.dataApiVersion;
                this.endpointUri = model.endpointUri;
                this.flowId = model.flowId;
                this.flowName = model.flowName;
                this.JSONVersion = model.JSONVersion;
                this.previewUrl = model.previewUrl;
                this.previewUrlExpires = model.previewUrlExpires;
                this.status = model.status;
            } 

            /**
             * <p>The list of categories.</p>
             */
            public Builder categories(java.util.List<String> categories) {
                this.categories = categories;
                return this;
            }

            /**
             * <p>The API version information.</p>
             * 
             * <strong>example:</strong>
             * <p>3.0</p>
             */
            public Builder dataApiVersion(String dataApiVersion) {
                this.dataApiVersion = dataApiVersion;
                return this;
            }

            /**
             * <p>The URL of the WA Flow Endpoint</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://abc.com">http://abc.com</a></p>
             */
            public Builder endpointUri(String endpointUri) {
                this.endpointUri = endpointUri;
                return this;
            }

            /**
             * <p>Flow ID。</p>
             * 
             * <strong>example:</strong>
             * <p>92675332812643****</p>
             */
            public Builder flowId(String flowId) {
                this.flowId = flowId;
                return this;
            }

            /**
             * <p>The Flow name.</p>
             * 
             * <strong>example:</strong>
             * <p>flow_001</p>
             */
            public Builder flowName(String flowName) {
                this.flowName = flowName;
                return this;
            }

            /**
             * <p>The JSON version information.</p>
             * 
             * <strong>example:</strong>
             * <p>2.1</p>
             */
            public Builder JSONVersion(String JSONVersion) {
                this.JSONVersion = JSONVersion;
                return this;
            }

            /**
             * <p>The temporary preview URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://pre-url">https://pre-url</a></p>
             */
            public Builder previewUrl(String previewUrl) {
                this.previewUrl = previewUrl;
                return this;
            }

            /**
             * <p>The expiration time of the preview URL.</p>
             * 
             * <strong>example:</strong>
             * <p>1700617436633</p>
             */
            public Builder previewUrlExpires(Long previewUrlExpires) {
                this.previewUrlExpires = previewUrlExpires;
                return this;
            }

            /**
             * <p>The status of the Flow. Valid values:</p>
             * <ul>
             * <li>PUBLISHED: Published.</li>
             * <li>DRAFT: Draft.</li>
             * <li>DEPRECATED: Deprecated.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DRAFT</p>
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
