// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCloudGtmAddressPoolRequest} extends {@link RequestModel}
 *
 * <p>CreateCloudGtmAddressPoolRequest</p>
 */
public class CreateCloudGtmAddressPoolRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddressPoolName")
    private String addressPoolName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddressPoolType")
    private String addressPoolType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableStatus")
    private String enableStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthJudgement")
    private String healthJudgement;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    private CreateCloudGtmAddressPoolRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.addressPoolName = builder.addressPoolName;
        this.addressPoolType = builder.addressPoolType;
        this.clientToken = builder.clientToken;
        this.enableStatus = builder.enableStatus;
        this.healthJudgement = builder.healthJudgement;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCloudGtmAddressPoolRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return addressPoolName
     */
    public String getAddressPoolName() {
        return this.addressPoolName;
    }

    /**
     * @return addressPoolType
     */
    public String getAddressPoolType() {
        return this.addressPoolType;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return enableStatus
     */
    public String getEnableStatus() {
        return this.enableStatus;
    }

    /**
     * @return healthJudgement
     */
    public String getHealthJudgement() {
        return this.healthJudgement;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    public static final class Builder extends Request.Builder<CreateCloudGtmAddressPoolRequest, Builder> {
        private String acceptLanguage; 
        private String addressPoolName; 
        private String addressPoolType; 
        private String clientToken; 
        private String enableStatus; 
        private String healthJudgement; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(CreateCloudGtmAddressPoolRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.addressPoolName = request.addressPoolName;
            this.addressPoolType = request.addressPoolType;
            this.clientToken = request.clientToken;
            this.enableStatus = request.enableStatus;
            this.healthJudgement = request.healthJudgement;
            this.remark = request.remark;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * AddressPoolName.
         */
        public Builder addressPoolName(String addressPoolName) {
            this.putQueryParameter("AddressPoolName", addressPoolName);
            this.addressPoolName = addressPoolName;
            return this;
        }

        /**
         * AddressPoolType.
         */
        public Builder addressPoolType(String addressPoolType) {
            this.putQueryParameter("AddressPoolType", addressPoolType);
            this.addressPoolType = addressPoolType;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * EnableStatus.
         */
        public Builder enableStatus(String enableStatus) {
            this.putQueryParameter("EnableStatus", enableStatus);
            this.enableStatus = enableStatus;
            return this;
        }

        /**
         * HealthJudgement.
         */
        public Builder healthJudgement(String healthJudgement) {
            this.putQueryParameter("HealthJudgement", healthJudgement);
            this.healthJudgement = healthJudgement;
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
        public CreateCloudGtmAddressPoolRequest build() {
            return new CreateCloudGtmAddressPoolRequest(this);
        } 

    } 

}
