// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAccountRequest} extends {@link RequestModel}
 *
 * <p>CreateAccountRequest</p>
 */
public class CreateAccountRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("accountAccessKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountAccessKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("createTimestamp")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long createTimestamp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("secretSign")
    @com.aliyun.core.annotation.Validation(required = true)
    private String secretSign;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("signature")
    @com.aliyun.core.annotation.Validation(required = true)
    private String signature;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("userName")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * The AccessKey ID of your Alibaba Cloud account or RAM user. For information about how to obtain an AccessKey pair, see [Create an AccessKey pair](~~116401~~).
         * <p>
         * 
         * >  If you use the pair of static username and password that is created by using the Accesskey pair of a RAM user to access ApsaraMQ for RabbitMQ to send and receive messages, make sure that the RAM user is granted the required permissions. For more information, see [RAM policies](~~146559~~).
         */
        public Builder accountAccessKey(String accountAccessKey) {
            this.putQueryParameter("accountAccessKey", accountAccessKey);
            this.accountAccessKey = accountAccessKey;
            return this;
        }

        /**
         * The timestamp that indicates when the password is created. Unit: milliseconds.
         * <p>
         * 
         * >  This timestamp is specified by you and is used to generate a static password. The timestamp is not the timestamp that indicates when the system generates the password.
         */
        public Builder createTimestamp(Long createTimestamp) {
            this.putQueryParameter("createTimestamp", createTimestamp);
            this.createTimestamp = createTimestamp;
            return this;
        }

        /**
         * The ID of the instance for which you want to create a pair of static username and password.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The AccessKey secret signature. The system generates a static password based on the signature in the request, the AccessKey secret signature, and the username.
         * <p>
         * 
         * The system uses the HMAC-SHA1 algorithm to generate the AccessKey secret signature based on the timestamp that indicates when the username is created and the AccessKey ID. For more information, see the **"Sample code on how to generate a signature"** section of this topic.
         */
        public Builder secretSign(String secretSign) {
            this.putQueryParameter("secretSign", secretSign);
            this.secretSign = secretSign;
            return this;
        }

        /**
         * The signature. The system generates a static password based on the signature in the request, the AccessKey secret signature, and the username.
         * <p>
         * 
         * The system uses the HMAC-SHA1 algorithm to generate the signature based on the timestamp that indicates when the username is created and the AccessKey ID. For more information, see the **"Sample code on how to generate a signature"** section of this topic.
         */
        public Builder signature(String signature) {
            this.putQueryParameter("signature", signature);
            this.signature = signature;
            return this;
        }

        /**
         * The static username that you want to create.
         * <p>
         * 
         * The value of this parameter is a Base64-encoded string that is generated based on the instance ID and AccessKey ID. For more information, see the "**Sample code on how to generate a username**" section of this topic.
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
