// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RegisterDeviceGroupRequest} extends {@link RequestModel}
 *
 * <p>RegisterDeviceGroupRequest</p>
 */
public class RegisterDeviceGroupRequest extends Request {
    @Query
    @NameInMap("ApiVersion")
    @Validation(required = true)
    private String apiVersion;

    @Query
    @NameInMap("AuthorizeType")
    @Validation(required = true)
    private String authorizeType;

    @Query
    @NameInMap("BizChainId")
    @Validation(required = true)
    private String bizChainId;

    @Query
    @NameInMap("DeviceGroupName")
    @Validation(required = true)
    private String deviceGroupName;

    @Query
    @NameInMap("ProductKey")
    @Validation(required = true)
    private String productKey;

    @Query
    @NameInMap("Remark")
    private String remark;

    private RegisterDeviceGroupRequest(Builder builder) {
        super(builder);
        this.apiVersion = builder.apiVersion;
        this.authorizeType = builder.authorizeType;
        this.bizChainId = builder.bizChainId;
        this.deviceGroupName = builder.deviceGroupName;
        this.productKey = builder.productKey;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterDeviceGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiVersion
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * @return authorizeType
     */
    public String getAuthorizeType() {
        return this.authorizeType;
    }

    /**
     * @return bizChainId
     */
    public String getBizChainId() {
        return this.bizChainId;
    }

    /**
     * @return deviceGroupName
     */
    public String getDeviceGroupName() {
        return this.deviceGroupName;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    public static final class Builder extends Request.Builder<RegisterDeviceGroupRequest, Builder> {
        private String apiVersion; 
        private String authorizeType; 
        private String bizChainId; 
        private String deviceGroupName; 
        private String productKey; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(RegisterDeviceGroupRequest request) {
            super(request);
            this.apiVersion = request.apiVersion;
            this.authorizeType = request.authorizeType;
            this.bizChainId = request.bizChainId;
            this.deviceGroupName = request.deviceGroupName;
            this.productKey = request.productKey;
            this.remark = request.remark;
        } 

        /**
         * ApiVersion.
         */
        public Builder apiVersion(String apiVersion) {
            this.putQueryParameter("ApiVersion", apiVersion);
            this.apiVersion = apiVersion;
            return this;
        }

        /**
         * AuthorizeType.
         */
        public Builder authorizeType(String authorizeType) {
            this.putQueryParameter("AuthorizeType", authorizeType);
            this.authorizeType = authorizeType;
            return this;
        }

        /**
         * BizChainId.
         */
        public Builder bizChainId(String bizChainId) {
            this.putQueryParameter("BizChainId", bizChainId);
            this.bizChainId = bizChainId;
            return this;
        }

        /**
         * DeviceGroupName.
         */
        public Builder deviceGroupName(String deviceGroupName) {
            this.putQueryParameter("DeviceGroupName", deviceGroupName);
            this.deviceGroupName = deviceGroupName;
            return this;
        }

        /**
         * ProductKey.
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        @Override
        public RegisterDeviceGroupRequest build() {
            return new RegisterDeviceGroupRequest(this);
        } 

    } 

}
