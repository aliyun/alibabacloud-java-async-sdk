// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSaslUserRequest} extends {@link RequestModel}
 *
 * <p>CreateSaslUserRequest</p>
 */
public class CreateSaslUserRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Password")
    @Validation(required = true)
    private String password;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Type")
    private String type;

    @Query
    @NameInMap("Username")
    @Validation(required = true)
    private String username;

    private CreateSaslUserRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
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
            this.password = request.password;
            this.regionId = request.regionId;
            this.type = request.type;
            this.username = request.username;
        } 

        /**
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The password of the SASL user.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The SASL mechanism. Valid values:
         * <p>
         * 
         * *   **plain**: a simple mechanism that uses usernames and passwords to verify user identities. Message Queue for Apache Kafka provides an optimized PLAIN mechanism that allows you to dynamically create SASL users for an instance without the need to restart the instance.
         * *   **scram**: a mechanism that uses usernames and passwords to verify user identities. This mechanism provides better security protection than the PLAIN mechanism. Message Queue for Apache Kafka uses SCRAM-SHA-256.
         * 
         * Default value: **plain**.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * The name of the SASL user.
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
