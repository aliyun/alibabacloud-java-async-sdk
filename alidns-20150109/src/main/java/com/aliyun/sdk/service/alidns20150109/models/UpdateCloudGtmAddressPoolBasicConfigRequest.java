// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCloudGtmAddressPoolBasicConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateCloudGtmAddressPoolBasicConfigRequest</p>
 */
public class UpdateCloudGtmAddressPoolBasicConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddressPoolId")
    private String addressPoolId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddressPoolName")
    private String addressPoolName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthJudgement")
    private String healthJudgement;

    private UpdateCloudGtmAddressPoolBasicConfigRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.addressPoolId = builder.addressPoolId;
        this.addressPoolName = builder.addressPoolName;
        this.clientToken = builder.clientToken;
        this.healthJudgement = builder.healthJudgement;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCloudGtmAddressPoolBasicConfigRequest create() {
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
     * @return addressPoolId
     */
    public String getAddressPoolId() {
        return this.addressPoolId;
    }

    /**
     * @return addressPoolName
     */
    public String getAddressPoolName() {
        return this.addressPoolName;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return healthJudgement
     */
    public String getHealthJudgement() {
        return this.healthJudgement;
    }

    public static final class Builder extends Request.Builder<UpdateCloudGtmAddressPoolBasicConfigRequest, Builder> {
        private String acceptLanguage; 
        private String addressPoolId; 
        private String addressPoolName; 
        private String clientToken; 
        private String healthJudgement; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCloudGtmAddressPoolBasicConfigRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.addressPoolId = request.addressPoolId;
            this.addressPoolName = request.addressPoolName;
            this.clientToken = request.clientToken;
            this.healthJudgement = request.healthJudgement;
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
         * AddressPoolId.
         */
        public Builder addressPoolId(String addressPoolId) {
            this.putQueryParameter("AddressPoolId", addressPoolId);
            this.addressPoolId = addressPoolId;
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
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
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

        @Override
        public UpdateCloudGtmAddressPoolBasicConfigRequest build() {
            return new UpdateCloudGtmAddressPoolBasicConfigRequest(this);
        } 

    } 

}
