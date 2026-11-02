// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

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
 * {@link CreateSaslUserRequest} extends {@link RequestModel}
 *
 * <p>CreateSaslUserRequest</p>
 */
public class CreateSaslUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mechanism")
    private String mechanism;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    @com.aliyun.core.annotation.Validation(required = true)
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Username")
    @com.aliyun.core.annotation.Validation(required = true)
    private String username;

    private CreateSaslUserRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.mechanism = builder.mechanism;
        this.password = builder.password;
        this.regionId = builder.regionId;
        this.type = builder.type;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSaslUserRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return mechanism
     */
    public String getMechanism() {
        return this.mechanism;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<CreateSaslUserRequest, Builder> {
        private String instanceId; 
        private String mechanism; 
        private String password; 
        private String regionId; 
        private String type; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(CreateSaslUserRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.mechanism = request.mechanism;
            this.password = request.password;
            this.regionId = request.regionId;
            this.type = request.type;
            this.username = request.username;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alikafka_pre-cn-v0h1cng0****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The encryption method. Valid values:</p>
         * <ul>
         * <li><p>SCRAM-SHA-512 (default)</p>
         * </li>
         * <li><p>SCRAM-SHA-256</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is supported only for serverless instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SCRAM-SHA-256</p>
         */
        public Builder mechanism(String mechanism) {
            this.putQueryParameter("Mechanism", mechanism);
            this.mechanism = mechanism;
            return this;
        }

        /**
         * <p>The password.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12***</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The type. Valid values:</p>
         * <ul>
         * <li><p>plain: A simple username and password authentication mechanism. MSMQ for Apache Kafka optimizes the PLAIN mechanism and supports the dynamic increase of SASL users without restarting the instance.</p>
         * </li>
         * <li><p>scram: A username and password authentication mechanism that provides higher security than PLAIN. MSMQ for Apache Kafka uses SCRAM-SHA-256.</p>
         * </li>
         * <li><p>LDAP: Applicable only to new users of Confluent instances.</p>
         * </li>
         * </ul>
         * <p>Default value: plain.</p>
         * 
         * <strong>example:</strong>
         * <p>plain</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The username.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test***</p>
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        @Override
        public CreateSaslUserRequest build() {
            return new CreateSaslUserRequest(this);
        } 

    } 

}
