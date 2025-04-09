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
 * {@link DeleteSaslUserRequest} extends {@link RequestModel}
 *
 * <p>DeleteSaslUserRequest</p>
 */
public class DeleteSaslUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mechanism")
    private String mechanism;

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

    private DeleteSaslUserRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.mechanism = builder.mechanism;
        this.regionId = builder.regionId;
        this.type = builder.type;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSaslUserRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteSaslUserRequest, Builder> {
        private String instanceId; 
        private String mechanism; 
        private String regionId; 
        private String type; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSaslUserRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.mechanism = request.mechanism;
            this.regionId = request.regionId;
            this.type = request.type;
            this.username = request.username;
        } 

        /**
         * <p>The ID of the instance.</p>
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
         * <li>SCRAM-SHA-512. This is the default value.</li>
         * <li>SCRAM-SHA-256</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is available only for serverless ApsaraMQ for Kafka instances.</p>
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
         * <p>The ID of the region.</p>
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
         * <p>The type of the Simple Authentication and Security Layer (SASL) user. Valid values:</p>
         * <ul>
         * <li><strong>plain</strong>: a simple mechanism that uses usernames and passwords to verify user identities. ApsaraMQ for Kafka provides an improved PLAIN mechanism that allows you to dynamically add SASL users without the need to restart an instance.</li>
         * <li><strong>SCRAM</strong>: a mechanism that uses usernames and passwords to verify user identities. Compared with the PLAIN mechanism, this mechanism provides better security protection. ApsaraMQ for Kafka uses the SCRAM-SHA-256 algorithm.</li>
         * <li><strong>LDAP</strong>: This value is available only for the SASL users of ApsaraMQ for Confluent instances.</li>
         * </ul>
         * <p>Default value: <strong>plain</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>scram</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The name of the user.</p>
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
        public DeleteSaslUserRequest build() {
            return new DeleteSaslUserRequest(this);
        } 

    } 

}
