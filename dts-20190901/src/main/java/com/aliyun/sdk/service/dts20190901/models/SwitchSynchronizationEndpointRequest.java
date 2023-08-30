// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SwitchSynchronizationEndpointRequest} extends {@link RequestModel}
 *
 * <p>SwitchSynchronizationEndpointRequest</p>
 */
public class SwitchSynchronizationEndpointRequest extends Request {
    @Query
    @NameInMap("Endpoint")
    private Endpoint endpoint;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Query
    @NameInMap("SynchronizationDirection")
    private String synchronizationDirection;

    @Query
    @NameInMap("SynchronizationJobId")
    @Validation(required = true)
    private String synchronizationJobId;

    private SwitchSynchronizationEndpointRequest(Builder builder) {
        super(builder);
        this.endpoint = builder.endpoint;
        this.ownerId = builder.ownerId;
        this.synchronizationDirection = builder.synchronizationDirection;
        this.synchronizationJobId = builder.synchronizationJobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SwitchSynchronizationEndpointRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endpoint
     */
    public Endpoint getEndpoint() {
        return this.endpoint;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return synchronizationDirection
     */
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

    /**
     * @return synchronizationJobId
     */
    public String getSynchronizationJobId() {
        return this.synchronizationJobId;
    }

    public static final class Builder extends Request.Builder<SwitchSynchronizationEndpointRequest, Builder> {
        private Endpoint endpoint; 
        private String ownerId; 
        private String synchronizationDirection; 
        private String synchronizationJobId; 

        private Builder() {
            super();
        } 

        private Builder(SwitchSynchronizationEndpointRequest request) {
            super(request);
            this.endpoint = request.endpoint;
            this.ownerId = request.ownerId;
            this.synchronizationDirection = request.synchronizationDirection;
            this.synchronizationJobId = request.synchronizationJobId;
        } 

        /**
         * Endpoint.
         */
        public Builder endpoint(Endpoint endpoint) {
            this.putQueryParameter("Endpoint", endpoint);
            this.endpoint = endpoint;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * SynchronizationDirection.
         */
        public Builder synchronizationDirection(String synchronizationDirection) {
            this.putQueryParameter("SynchronizationDirection", synchronizationDirection);
            this.synchronizationDirection = synchronizationDirection;
            return this;
        }

        /**
         * SynchronizationJobId.
         */
        public Builder synchronizationJobId(String synchronizationJobId) {
            this.putQueryParameter("SynchronizationJobId", synchronizationJobId);
            this.synchronizationJobId = synchronizationJobId;
            return this;
        }

        @Override
        public SwitchSynchronizationEndpointRequest build() {
            return new SwitchSynchronizationEndpointRequest(this);
        } 

    } 

    public static class Endpoint extends TeaModel {
        @NameInMap("IP")
        private String ip;

        @NameInMap("InstanceId")
        @Validation(required = true)
        private String instanceId;

        @NameInMap("InstanceType")
        @Validation(required = true)
        private String instanceType;

        @NameInMap("Port")
        @Validation(required = true)
        private String port;

        @NameInMap("Type")
        @Validation(required = true)
        private String type;

        private Endpoint(Builder builder) {
            this.ip = builder.ip;
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
            this.port = builder.port;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Endpoint create() {
            return builder().build();
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String ip; 
            private String instanceId; 
            private String instanceType; 
            private String port; 
            private String type; 

            /**
             * IP.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Endpoint build() {
                return new Endpoint(this);
            } 

        } 

    }
}
