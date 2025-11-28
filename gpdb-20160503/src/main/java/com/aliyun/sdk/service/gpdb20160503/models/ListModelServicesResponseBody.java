// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link ListModelServicesResponseBody} extends {@link TeaModel}
 *
 * <p>ListModelServicesResponseBody</p>
 */
public class ListModelServicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ModelServices")
    private java.util.List<ModelServices> modelServices;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private ListModelServicesResponseBody(Builder builder) {
        this.modelServices = builder.modelServices;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModelServicesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modelServices
     */
    public java.util.List<ModelServices> getModelServices() {
        return this.modelServices;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private java.util.List<ModelServices> modelServices; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private Integer totalRecordCount; 

        private Builder() {
        } 

        private Builder(ListModelServicesResponseBody model) {
            this.modelServices = model.modelServices;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>Model services.</p>
         */
        public Builder modelServices(java.util.List<ModelServices> modelServices) {
            this.modelServices = modelServices;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public ListModelServicesResponseBody build() {
            return new ListModelServicesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListModelServicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListModelServicesResponseBody</p>
     */
    public static class ModelServices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AiNodes")
        private java.util.List<String> aiNodes;

        @com.aliyun.core.annotation.NameInMap("ApiKey")
        private String apiKey;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ModelName")
        private String modelName;

        @com.aliyun.core.annotation.NameInMap("ModelParams")
        private java.util.Map<String, String> modelParams;

        @com.aliyun.core.annotation.NameInMap("ModelServiceId")
        private String modelServiceId;

        @com.aliyun.core.annotation.NameInMap("PrivateConnUrl")
        private String privateConnUrl;

        @com.aliyun.core.annotation.NameInMap("PublicConnUrl")
        private String publicConnUrl;

        @com.aliyun.core.annotation.NameInMap("SecurityIPList")
        private String securityIPList;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ModelServices(Builder builder) {
            this.aiNodes = builder.aiNodes;
            this.apiKey = builder.apiKey;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.modelName = builder.modelName;
            this.modelParams = builder.modelParams;
            this.modelServiceId = builder.modelServiceId;
            this.privateConnUrl = builder.privateConnUrl;
            this.publicConnUrl = builder.publicConnUrl;
            this.securityIPList = builder.securityIPList;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelServices create() {
            return builder().build();
        }

        /**
         * @return aiNodes
         */
        public java.util.List<String> getAiNodes() {
            return this.aiNodes;
        }

        /**
         * @return apiKey
         */
        public String getApiKey() {
            return this.apiKey;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        /**
         * @return modelParams
         */
        public java.util.Map<String, String> getModelParams() {
            return this.modelParams;
        }

        /**
         * @return modelServiceId
         */
        public String getModelServiceId() {
            return this.modelServiceId;
        }

        /**
         * @return privateConnUrl
         */
        public String getPrivateConnUrl() {
            return this.privateConnUrl;
        }

        /**
         * @return publicConnUrl
         */
        public String getPublicConnUrl() {
            return this.publicConnUrl;
        }

        /**
         * @return securityIPList
         */
        public String getSecurityIPList() {
            return this.securityIPList;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List<String> aiNodes; 
            private String apiKey; 
            private String createTime; 
            private String description; 
            private String modelName; 
            private java.util.Map<String, String> modelParams; 
            private String modelServiceId; 
            private String privateConnUrl; 
            private String publicConnUrl; 
            private String securityIPList; 
            private String status; 

            private Builder() {
            } 

            private Builder(ModelServices model) {
                this.aiNodes = model.aiNodes;
                this.apiKey = model.apiKey;
                this.createTime = model.createTime;
                this.description = model.description;
                this.modelName = model.modelName;
                this.modelParams = model.modelParams;
                this.modelServiceId = model.modelServiceId;
                this.privateConnUrl = model.privateConnUrl;
                this.publicConnUrl = model.publicConnUrl;
                this.securityIPList = model.securityIPList;
                this.status = model.status;
            } 

            /**
             * <p>A list of AI nodes for model deployment.</p>
             */
            public Builder aiNodes(java.util.List<String> aiNodes) {
                this.aiNodes = aiNodes;
                return this;
            }

            /**
             * <p>The API key.</p>
             * 
             * <strong>example:</strong>
             * <p>mI3F7B18vgfqJjUtWmgITw==</p>
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-09-28T02:18:39Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>test description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The model name.</p>
             * 
             * <strong>example:</strong>
             * <p>sambert-zhiying-v1</p>
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * <p>Model service parameters (not available).</p>
             */
            public Builder modelParams(java.util.Map<String, String> modelParams) {
                this.modelParams = modelParams;
                return this;
            }

            /**
             * <p>Model service ID.</p>
             * 
             * <strong>example:</strong>
             * <p>mx-xxxxxxxxx</p>
             */
            public Builder modelServiceId(String modelServiceId) {
                this.modelServiceId = modelServiceId;
                return this;
            }

            /**
             * <p>Private Endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://ms-xxxxxxx.xxxx.rds.aliyuncs.com">http://ms-xxxxxxx.xxxx.rds.aliyuncs.com</a></p>
             */
            public Builder privateConnUrl(String privateConnUrl) {
                this.privateConnUrl = privateConnUrl;
                return this;
            }

            /**
             * <p>Public endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://ms-xxxxxxx-o.xxxx.rds.aliyuncs.com">http://ms-xxxxxxx-o.xxxx.rds.aliyuncs.com</a></p>
             */
            public Builder publicConnUrl(String publicConnUrl) {
                this.publicConnUrl = publicConnUrl;
                return this;
            }

            /**
             * <p>The IP addresses listed in the whitelist. Up to 1,000 IP addresses are contained in a whitelist and separated by commas (,). The IP addresses must use one of the following formats:</p>
             * <ul>
             * <li>0.0.0.0/0</li>
             * <li>10.23.12.24(IP)</li>
             * <li>10.23.12.24/24 (This is a CIDR block. The value<code>/24</code>indicates the network prefix length, which must be an integer and in the range of <code>[1,32]</code>.)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0.0.0.0/0</p>
             */
            public Builder securityIPList(String securityIPList) {
                this.securityIPList = securityIPList;
                return this;
            }

            /**
             * <p>The status of the operation. Valid values:</p>
             * <ul>
             * <li><strong>success</strong></li>
             * <li><strong>fail</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ModelServices build() {
                return new ModelServices(this);
            } 

        } 

    }
}
