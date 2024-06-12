// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20200217.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUAIDApplyTokenSignRequest} extends {@link RequestModel}
 *
 * <p>GetUAIDApplyTokenSignRequest</p>
 */
public class GetUAIDApplyTokenSignRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Carrier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String carrier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Format")
    private String format;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParamKey")
    private String paramKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParamStr")
    private String paramStr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Time")
    @com.aliyun.core.annotation.Validation(required = true)
    private String time;

    private GetUAIDApplyTokenSignRequest(Builder builder) {
        super(builder);
        this.authCode = builder.authCode;
        this.carrier = builder.carrier;
        this.clientType = builder.clientType;
        this.format = builder.format;
        this.outId = builder.outId;
        this.ownerId = builder.ownerId;
        this.paramKey = builder.paramKey;
        this.paramStr = builder.paramStr;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.time = builder.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUAIDApplyTokenSignRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authCode
     */
    public String getAuthCode() {
        return this.authCode;
    }

    /**
     * @return carrier
     */
    public String getCarrier() {
        return this.carrier;
    }

    /**
     * @return clientType
     */
    public String getClientType() {
        return this.clientType;
    }

    /**
     * @return format
     */
    public String getFormat() {
        return this.format;
    }

    /**
     * @return outId
     */
    public String getOutId() {
        return this.outId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return paramKey
     */
    public String getParamKey() {
        return this.paramKey;
    }

    /**
     * @return paramStr
     */
    public String getParamStr() {
        return this.paramStr;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return time
     */
    public String getTime() {
        return this.time;
    }

    public static final class Builder extends Request.Builder<GetUAIDApplyTokenSignRequest, Builder> {
        private String authCode; 
        private String carrier; 
        private String clientType; 
        private String format; 
        private String outId; 
        private Long ownerId; 
        private String paramKey; 
        private String paramStr; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String time; 

        private Builder() {
            super();
        } 

        private Builder(GetUAIDApplyTokenSignRequest request) {
            super(request);
            this.authCode = request.authCode;
            this.carrier = request.carrier;
            this.clientType = request.clientType;
            this.format = request.format;
            this.outId = request.outId;
            this.ownerId = request.ownerId;
            this.paramKey = request.paramKey;
            this.paramStr = request.paramStr;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.time = request.time;
        } 

        /**
         * AuthCode.
         */
        public Builder authCode(String authCode) {
            this.putQueryParameter("AuthCode", authCode);
            this.authCode = authCode;
            return this;
        }

        /**
         * Carrier.
         */
        public Builder carrier(String carrier) {
            this.putQueryParameter("Carrier", carrier);
            this.carrier = carrier;
            return this;
        }

        /**
         * ClientType.
         */
        public Builder clientType(String clientType) {
            this.putQueryParameter("ClientType", clientType);
            this.clientType = clientType;
            return this;
        }

        /**
         * Format.
         */
        public Builder format(String format) {
            this.putQueryParameter("Format", format);
            this.format = format;
            return this;
        }

        /**
         * OutId.
         */
        public Builder outId(String outId) {
            this.putQueryParameter("OutId", outId);
            this.outId = outId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ParamKey.
         */
        public Builder paramKey(String paramKey) {
            this.putQueryParameter("ParamKey", paramKey);
            this.paramKey = paramKey;
            return this;
        }

        /**
         * ParamStr.
         */
        public Builder paramStr(String paramStr) {
            this.putQueryParameter("ParamStr", paramStr);
            this.paramStr = paramStr;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * Time.
         */
        public Builder time(String time) {
            this.putQueryParameter("Time", time);
            this.time = time;
            return this;
        }

        @Override
        public GetUAIDApplyTokenSignRequest build() {
            return new GetUAIDApplyTokenSignRequest(this);
        } 

    } 

}
