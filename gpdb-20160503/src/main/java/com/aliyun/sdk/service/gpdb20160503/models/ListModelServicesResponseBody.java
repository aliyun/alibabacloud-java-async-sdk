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
         * ModelServices.
         */
        public Builder modelServices(java.util.List<ModelServices> modelServices) {
            this.modelServices = modelServices;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageRecordCount.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
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
         * TotalRecordCount.
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
             * AiNodes.
             */
            public Builder aiNodes(java.util.List<String> aiNodes) {
                this.aiNodes = aiNodes;
                return this;
            }

            /**
             * ApiKey.
             */
            public Builder apiKey(String apiKey) {
                this.apiKey = apiKey;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * ModelName.
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * ModelParams.
             */
            public Builder modelParams(java.util.Map<String, String> modelParams) {
                this.modelParams = modelParams;
                return this;
            }

            /**
             * ModelServiceId.
             */
            public Builder modelServiceId(String modelServiceId) {
                this.modelServiceId = modelServiceId;
                return this;
            }

            /**
             * PrivateConnUrl.
             */
            public Builder privateConnUrl(String privateConnUrl) {
                this.privateConnUrl = privateConnUrl;
                return this;
            }

            /**
             * PublicConnUrl.
             */
            public Builder publicConnUrl(String publicConnUrl) {
                this.publicConnUrl = publicConnUrl;
                return this;
            }

            /**
             * SecurityIPList.
             */
            public Builder securityIPList(String securityIPList) {
                this.securityIPList = securityIPList;
                return this;
            }

            /**
             * Status.
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
