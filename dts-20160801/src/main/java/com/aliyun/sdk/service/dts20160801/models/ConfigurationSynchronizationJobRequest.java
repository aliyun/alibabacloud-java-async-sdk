// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConfigurationSynchronizationJobRequest} extends {@link RequestModel}
 *
 * <p>ConfigurationSynchronizationJobRequest</p>
 */
public class ConfigurationSynchronizationJobRequest extends Request {
    @Query
    @NameInMap("DestinationEndpoint")
    private DestinationEndpoint destinationEndpoint;

    @Query
    @NameInMap("Initialization")
    private Initialization initialization;

    @Query
    @NameInMap("SourceEndpoint")
    private SourceEndpoint sourceEndpoint;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Query
    @NameInMap("SynchronizationJobId")
    @Validation(required = true)
    private String synchronizationJobId;

    @Query
    @NameInMap("SynchronizationJobName")
    private String synchronizationJobName;

    @Query
    @NameInMap("SynchronizationObject")
    @Validation(required = true)
    private String synchronizationObject;

    private ConfigurationSynchronizationJobRequest(Builder builder) {
        super(builder);
        this.destinationEndpoint = builder.destinationEndpoint;
        this.initialization = builder.initialization;
        this.sourceEndpoint = builder.sourceEndpoint;
        this.ownerId = builder.ownerId;
        this.synchronizationJobId = builder.synchronizationJobId;
        this.synchronizationJobName = builder.synchronizationJobName;
        this.synchronizationObject = builder.synchronizationObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigurationSynchronizationJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return destinationEndpoint
     */
    public DestinationEndpoint getDestinationEndpoint() {
        return this.destinationEndpoint;
    }

    /**
     * @return initialization
     */
    public Initialization getInitialization() {
        return this.initialization;
    }

    /**
     * @return sourceEndpoint
     */
    public SourceEndpoint getSourceEndpoint() {
        return this.sourceEndpoint;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return synchronizationJobId
     */
    public String getSynchronizationJobId() {
        return this.synchronizationJobId;
    }

    /**
     * @return synchronizationJobName
     */
    public String getSynchronizationJobName() {
        return this.synchronizationJobName;
    }

    /**
     * @return synchronizationObject
     */
    public String getSynchronizationObject() {
        return this.synchronizationObject;
    }

    public static final class Builder extends Request.Builder<ConfigurationSynchronizationJobRequest, Builder> {
        private DestinationEndpoint destinationEndpoint; 
        private Initialization initialization; 
        private SourceEndpoint sourceEndpoint; 
        private String ownerId; 
        private String synchronizationJobId; 
        private String synchronizationJobName; 
        private String synchronizationObject; 

        private Builder() {
            super();
        } 

        private Builder(ConfigurationSynchronizationJobRequest request) {
            super(request);
            this.destinationEndpoint = request.destinationEndpoint;
            this.initialization = request.initialization;
            this.sourceEndpoint = request.sourceEndpoint;
            this.ownerId = request.ownerId;
            this.synchronizationJobId = request.synchronizationJobId;
            this.synchronizationJobName = request.synchronizationJobName;
            this.synchronizationObject = request.synchronizationObject;
        } 

        /**
         * DestinationEndpoint.
         */
        public Builder destinationEndpoint(DestinationEndpoint destinationEndpoint) {
            this.putQueryParameter("DestinationEndpoint", destinationEndpoint);
            this.destinationEndpoint = destinationEndpoint;
            return this;
        }

        /**
         * Initialization.
         */
        public Builder initialization(Initialization initialization) {
            this.putQueryParameter("Initialization", initialization);
            this.initialization = initialization;
            return this;
        }

        /**
         * SourceEndpoint.
         */
        public Builder sourceEndpoint(SourceEndpoint sourceEndpoint) {
            this.putQueryParameter("SourceEndpoint", sourceEndpoint);
            this.sourceEndpoint = sourceEndpoint;
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
         * SynchronizationJobId.
         */
        public Builder synchronizationJobId(String synchronizationJobId) {
            this.putQueryParameter("SynchronizationJobId", synchronizationJobId);
            this.synchronizationJobId = synchronizationJobId;
            return this;
        }

        /**
         * SynchronizationJobName.
         */
        public Builder synchronizationJobName(String synchronizationJobName) {
            this.putQueryParameter("SynchronizationJobName", synchronizationJobName);
            this.synchronizationJobName = synchronizationJobName;
            return this;
        }

        /**
         * SynchronizationObject.
         */
        public Builder synchronizationObject(String synchronizationObject) {
            this.putQueryParameter("SynchronizationObject", synchronizationObject);
            this.synchronizationObject = synchronizationObject;
            return this;
        }

        @Override
        public ConfigurationSynchronizationJobRequest build() {
            return new ConfigurationSynchronizationJobRequest(this);
        } 

    } 

    public static class DestinationEndpoint extends TeaModel {
        @NameInMap("InstanceID")
        private String instanceID;

        @NameInMap("InstanceType")
        @Validation(required = true)
        private String instanceType;

        private DestinationEndpoint(Builder builder) {
            this.instanceID = builder.instanceID;
            this.instanceType = builder.instanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DestinationEndpoint create() {
            return builder().build();
        }

        /**
         * @return instanceID
         */
        public String getInstanceID() {
            return this.instanceID;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        public static final class Builder {
            private String instanceID; 
            private String instanceType; 

            /**
             * InstanceID.
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            public DestinationEndpoint build() {
                return new DestinationEndpoint(this);
            } 

        } 

    }
    public static class Initialization extends TeaModel {
        @NameInMap("DataLoad")
        @Validation(required = true)
        private Boolean dataLoad;

        @NameInMap("StructureLoad")
        @Validation(required = true)
        private Boolean structureLoad;

        private Initialization(Builder builder) {
            this.dataLoad = builder.dataLoad;
            this.structureLoad = builder.structureLoad;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Initialization create() {
            return builder().build();
        }

        /**
         * @return dataLoad
         */
        public Boolean getDataLoad() {
            return this.dataLoad;
        }

        /**
         * @return structureLoad
         */
        public Boolean getStructureLoad() {
            return this.structureLoad;
        }

        public static final class Builder {
            private Boolean dataLoad; 
            private Boolean structureLoad; 

            /**
             * DataLoad.
             */
            public Builder dataLoad(Boolean dataLoad) {
                this.dataLoad = dataLoad;
                return this;
            }

            /**
             * StructureLoad.
             */
            public Builder structureLoad(Boolean structureLoad) {
                this.structureLoad = structureLoad;
                return this;
            }

            public Initialization build() {
                return new Initialization(this);
            } 

        } 

    }
    public static class SourceEndpoint extends TeaModel {
        @NameInMap("InstanceID")
        private String instanceID;

        @NameInMap("InstanceType")
        @Validation(required = true)
        private String instanceType;

        private SourceEndpoint(Builder builder) {
            this.instanceID = builder.instanceID;
            this.instanceType = builder.instanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceEndpoint create() {
            return builder().build();
        }

        /**
         * @return instanceID
         */
        public String getInstanceID() {
            return this.instanceID;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        public static final class Builder {
            private String instanceID; 
            private String instanceType; 

            /**
             * InstanceID.
             */
            public Builder instanceID(String instanceID) {
                this.instanceID = instanceID;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            public SourceEndpoint build() {
                return new SourceEndpoint(this);
            } 

        } 

    }
}
