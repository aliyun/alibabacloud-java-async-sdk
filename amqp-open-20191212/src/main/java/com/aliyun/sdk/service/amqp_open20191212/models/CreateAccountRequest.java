// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

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
         * <p>The AccessKey ID of your Alibaba Cloud account or RAM user. For information about how to obtain an AccessKey pair, see <a href="https://help.aliyun.com/document_detail/116401.html">Create an AccessKey pair</a>.</p>
         * <blockquote>
         * <p> If you use the pair of static username and password that is created by using the Accesskey pair of a RAM user to access ApsaraMQ for RabbitMQ to send and receive messages, make sure that the RAM user is granted the required permissions. For more information, see <a href="https://help.aliyun.com/document_detail/146559.html">RAM policies</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>yourAccessKeyID</p>
         */
        public Builder accountAccessKey(String accountAccessKey) {
            this.putQueryParameter("accountAccessKey", accountAccessKey);
            this.accountAccessKey = accountAccessKey;
            return this;
        }

        /**
         * <p>The timestamp that indicates when the password is created. Unit: milliseconds.</p>
         * <blockquote>
         * <p> This timestamp is specified by you and is used to generate a static password. The timestamp is not the timestamp that indicates when the system generates the password.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1671175303522</p>
         */
        public Builder createTimestamp(Long createTimestamp) {
            this.putQueryParameter("createTimestamp", createTimestamp);
            this.createTimestamp = createTimestamp;
            return this;
        }

        /**
         * <p>The ID of the instance for which you want to create a pair of static username and password.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amqp-cn-*********</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The AccessKey secret signature. The system generates a static password based on the signature in the request, the AccessKey secret signature, and the username.</p>
         * <p>The system uses the HMAC-SHA1 algorithm to generate the AccessKey secret signature based on the timestamp that indicates when the username is created and the AccessKey ID. For more information, see the <strong>&quot;Sample code on how to generate a signature&quot;</strong> section of this topic.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4c1a6367ce4c4255e9617326f9133ac635******</p>
         */
        public Builder secretSign(String secretSign) {
            this.putQueryParameter("secretSign", secretSign);
            this.secretSign = secretSign;
            return this;
        }

        /**
         * <p>The signature. The system generates a static password based on the signature in the request, the AccessKey secret signature, and the username.</p>
         * <p>The system uses the HMAC-SHA1 algorithm to generate the signature based on the timestamp that indicates when the username is created and the AccessKey ID. For more information, see the <strong>&quot;Sample code on how to generate a signature&quot;</strong> section of this topic.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>22c2d7d1769cb53c5a6d9213248e2de524******</p>
         */
        public Builder signature(String signature) {
            this.putQueryParameter("signature", signature);
            this.signature = signature;
            return this;
        }

        /**
         * <p>The static username that you want to create.</p>
         * <p>The value of this parameter is a Base64-encoded string that is generated based on the instance ID and AccessKey ID. For more information, see the &quot;<strong>Sample code on how to generate a username</strong>&quot; section of this topic.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Mjo****************</p>
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
