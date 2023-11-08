// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAccountRequest} extends {@link RequestModel}
 *
 * <p>CreateAccountRequest</p>
 */
public class CreateAccountRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("accountAccessKey")
    @Validation(required = true)
    private String accountAccessKey;

    @Query
    @NameInMap("createTimestamp")
    @Validation(required = true)
    private Long createTimestamp;

    @Query
    @NameInMap("instanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("secretSign")
    @Validation(required = true)
    private String secretSign;

    @Query
    @NameInMap("signature")
    @Validation(required = true)
    private String signature;

    @Query
    @NameInMap("userName")
    @Validation(required = true)
    private String userName;

    private CreateAccountRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.accountAccessKey = builder.accountAccessKey;
        this.createTimestamp = builder.createTimestamp;
        this.instanceId = builder.instanceId;
        this.secretSign = builder.secretSign;
        this.signature = builder.signature;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAccountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return accountAccessKey
     */
    public String getAccountAccessKey() {
        return this.accountAccessKey;
    }

    /**
     * @return createTimestamp
     */
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return secretSign
     */
    public String getSecretSign() {
        return this.secretSign;
    }

    /**
     * @return signature
     */
    public String getSignature() {
        return this.signature;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<CreateAccountRequest, Builder> {
        private String regionId; 
        private String accountAccessKey; 
        private Long createTimestamp; 
        private String instanceId; 
        private String secretSign; 
        private String signature; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(CreateAccountRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.accountAccessKey = request.accountAccessKey;
            this.createTimestamp = request.createTimestamp;
            this.instanceId = request.instanceId;
            this.secretSign = request.secretSign;
            this.signature = request.signature;
            this.userName = request.userName;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * accountAccessKey.
         */
        public Builder accountAccessKey(String accountAccessKey) {
            this.putQueryParameter("accountAccessKey", accountAccessKey);
            this.accountAccessKey = accountAccessKey;
            return this;
        }

        /**
         * createTimestamp.
         */
        public Builder createTimestamp(Long createTimestamp) {
            this.putQueryParameter("createTimestamp", createTimestamp);
            this.createTimestamp = createTimestamp;
            return this;
        }

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * secretSign.
         */
        public Builder secretSign(String secretSign) {
            this.putQueryParameter("secretSign", secretSign);
            this.secretSign = secretSign;
            return this;
        }

        /**
         * signature.
         */
        public Builder signature(String signature) {
            this.putQueryParameter("signature", signature);
            this.signature = signature;
            return this;
        }

        /**
         * userName.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("userName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public CreateAccountRequest build() {
            return new CreateAccountRequest(this);
        } 

    } 

}
