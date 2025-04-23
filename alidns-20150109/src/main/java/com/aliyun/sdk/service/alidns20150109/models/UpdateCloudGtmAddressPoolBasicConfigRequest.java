// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh-CN: Chinese</li>
         * <li>en-US (default): English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>en-US</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The ID of the address pool. This ID uniquely identifies the address pool.</p>
         * 
         * <strong>example:</strong>
         * <p>pool-89528023225442**16</p>
         */
        public Builder addressPoolId(String addressPoolId) {
            this.putQueryParameter("AddressPoolId", addressPoolId);
            this.addressPoolId = addressPoolId;
            return this;
        }

        /**
         * <p>Address pool name, helping users distinguish the purpose of address pools.</p>
         * 
         * <strong>example:</strong>
         * <p>app</p>
         */
        public Builder addressPoolName(String addressPoolName) {
            this.putQueryParameter("AddressPoolName", addressPoolName);
            this.addressPoolName = addressPoolName;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>1ae05db4-10e7-11ef-b126-00163e24**22</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The condition for determining the health status of the address pool. Valid values:</p>
         * <ul>
         * <li>any_ok: At least one address in the address pool is available.</li>
         * <li>p30_ok: At least 30% of the addresses in the address pool are available.</li>
         * <li>p50_ok: At least 50% of the addresses in the address pool are available.</li>
         * <li>p70_ok: At least 70% of the addresses in the address pool are available.</li>
         * <li>all_ok: All addresses in the address pool are available.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>any_ok</p>
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
