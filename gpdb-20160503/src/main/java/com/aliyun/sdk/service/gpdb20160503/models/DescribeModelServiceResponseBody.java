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
 * {@link DescribeModelServiceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeModelServiceResponseBody</p>
 */
public class DescribeModelServiceResponseBody extends TeaModel {
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
    private java.util.Map<String, ?> modelParams;

    @com.aliyun.core.annotation.NameInMap("ModelServiceId")
    private String modelServiceId;

    @com.aliyun.core.annotation.NameInMap("PrivateConnectUrl")
    private String privateConnectUrl;

    @com.aliyun.core.annotation.NameInMap("PublicConnectUrl")
    private String publicConnectUrl;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityIpList")
    private String securityIpList;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribeModelServiceResponseBody(Builder builder) {
        this.aiNodes = builder.aiNodes;
        this.apiKey = builder.apiKey;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.modelName = builder.modelName;
        this.modelParams = builder.modelParams;
        this.modelServiceId = builder.modelServiceId;
        this.privateConnectUrl = builder.privateConnectUrl;
        this.publicConnectUrl = builder.publicConnectUrl;
        this.requestId = builder.requestId;
        this.securityIpList = builder.securityIpList;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeModelServiceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.Map<String, ?> getModelParams() {
        return this.modelParams;
    }

    /**
     * @return modelServiceId
     */
    public String getModelServiceId() {
        return this.modelServiceId;
    }

    /**
     * @return privateConnectUrl
     */
    public String getPrivateConnectUrl() {
        return this.privateConnectUrl;
    }

    /**
     * @return publicConnectUrl
     */
    public String getPublicConnectUrl() {
        return this.publicConnectUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return securityIpList
     */
    public String getSecurityIpList() {
        return this.securityIpList;
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
        private java.util.Map<String, ?> modelParams; 
        private String modelServiceId; 
        private String privateConnectUrl; 
        private String publicConnectUrl; 
        private String requestId; 
        private String securityIpList; 
        private String status; 

        private Builder() {
        } 

        private Builder(DescribeModelServiceResponseBody model) {
            this.aiNodes = model.aiNodes;
            this.apiKey = model.apiKey;
            this.createTime = model.createTime;
            this.description = model.description;
            this.modelName = model.modelName;
            this.modelParams = model.modelParams;
            this.modelServiceId = model.modelServiceId;
            this.privateConnectUrl = model.privateConnectUrl;
            this.publicConnectUrl = model.publicConnectUrl;
            this.requestId = model.requestId;
            this.securityIpList = model.securityIpList;
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
        public Builder modelParams(java.util.Map<String, ?> modelParams) {
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
         * PrivateConnectUrl.
         */
        public Builder privateConnectUrl(String privateConnectUrl) {
            this.privateConnectUrl = privateConnectUrl;
            return this;
        }

        /**
         * PublicConnectUrl.
         */
        public Builder publicConnectUrl(String publicConnectUrl) {
            this.publicConnectUrl = publicConnectUrl;
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
         * SecurityIpList.
         */
        public Builder securityIpList(String securityIpList) {
            this.securityIpList = securityIpList;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeModelServiceResponseBody build() {
            return new DescribeModelServiceResponseBody(this);
        } 

    } 

}
