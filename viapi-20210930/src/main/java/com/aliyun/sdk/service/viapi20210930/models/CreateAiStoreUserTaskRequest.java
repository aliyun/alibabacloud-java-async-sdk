// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.viapi20210930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAiStoreUserTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateAiStoreUserTaskRequest</p>
 */
public class CreateAiStoreUserTaskRequest extends Request {
    @Body
    @NameInMap("ApiName")
    private String apiName;

    @Body
    @NameInMap("BucketKeyPrefix")
    private String bucketKeyPrefix;

    @Body
    @NameInMap("BucketName")
    private String bucketName;

    @Body
    @NameInMap("CreateConfig")
    private String createConfig;

    @Body
    @NameInMap("Name")
    private String name;

    @Body
    @NameInMap("ParamInfo")
    private String paramInfo;

    @Body
    @NameInMap("Product")
    private String product;

    @Body
    @NameInMap("ReceiveConfig")
    private String receiveConfig;

    @Body
    @NameInMap("Remark")
    private String remark;

    @Body
    @NameInMap("Status")
    private String status;

    private CreateAiStoreUserTaskRequest(Builder builder) {
        super(builder);
        this.apiName = builder.apiName;
        this.bucketKeyPrefix = builder.bucketKeyPrefix;
        this.bucketName = builder.bucketName;
        this.createConfig = builder.createConfig;
        this.name = builder.name;
        this.paramInfo = builder.paramInfo;
        this.product = builder.product;
        this.receiveConfig = builder.receiveConfig;
        this.remark = builder.remark;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAiStoreUserTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiName
     */
    public String getApiName() {
        return this.apiName;
    }

    /**
     * @return bucketKeyPrefix
     */
    public String getBucketKeyPrefix() {
        return this.bucketKeyPrefix;
    }

    /**
     * @return bucketName
     */
    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * @return createConfig
     */
    public String getCreateConfig() {
        return this.createConfig;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return paramInfo
     */
    public String getParamInfo() {
        return this.paramInfo;
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    /**
     * @return receiveConfig
     */
    public String getReceiveConfig() {
        return this.receiveConfig;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<CreateAiStoreUserTaskRequest, Builder> {
        private String apiName; 
        private String bucketKeyPrefix; 
        private String bucketName; 
        private String createConfig; 
        private String name; 
        private String paramInfo; 
        private String product; 
        private String receiveConfig; 
        private String remark; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(CreateAiStoreUserTaskRequest request) {
            super(request);
            this.apiName = request.apiName;
            this.bucketKeyPrefix = request.bucketKeyPrefix;
            this.bucketName = request.bucketName;
            this.createConfig = request.createConfig;
            this.name = request.name;
            this.paramInfo = request.paramInfo;
            this.product = request.product;
            this.receiveConfig = request.receiveConfig;
            this.remark = request.remark;
            this.status = request.status;
        } 

        /**
         * ApiName.
         */
        public Builder apiName(String apiName) {
            this.putBodyParameter("ApiName", apiName);
            this.apiName = apiName;
            return this;
        }

        /**
         * BucketKeyPrefix.
         */
        public Builder bucketKeyPrefix(String bucketKeyPrefix) {
            this.putBodyParameter("BucketKeyPrefix", bucketKeyPrefix);
            this.bucketKeyPrefix = bucketKeyPrefix;
            return this;
        }

        /**
         * BucketName.
         */
        public Builder bucketName(String bucketName) {
            this.putBodyParameter("BucketName", bucketName);
            this.bucketName = bucketName;
            return this;
        }

        /**
         * CreateConfig.
         */
        public Builder createConfig(String createConfig) {
            this.putBodyParameter("CreateConfig", createConfig);
            this.createConfig = createConfig;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * ParamInfo.
         */
        public Builder paramInfo(String paramInfo) {
            this.putBodyParameter("ParamInfo", paramInfo);
            this.paramInfo = paramInfo;
            return this;
        }

        /**
         * Product.
         */
        public Builder product(String product) {
            this.putBodyParameter("Product", product);
            this.product = product;
            return this;
        }

        /**
         * ReceiveConfig.
         */
        public Builder receiveConfig(String receiveConfig) {
            this.putBodyParameter("ReceiveConfig", receiveConfig);
            this.receiveConfig = receiveConfig;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putBodyParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public CreateAiStoreUserTaskRequest build() {
            return new CreateAiStoreUserTaskRequest(this);
        } 

    } 

}
