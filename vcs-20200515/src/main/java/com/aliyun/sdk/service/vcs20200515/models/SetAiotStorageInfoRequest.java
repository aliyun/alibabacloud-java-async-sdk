// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetAiotStorageInfoRequest} extends {@link RequestModel}
 *
 * <p>SetAiotStorageInfoRequest</p>
 */
public class SetAiotStorageInfoRequest extends Request {
    @Body
    @NameInMap("EventAlarmMq")
    @Validation(required = true)
    private EventAlarmMq eventAlarmMq;

    @Body
    @NameInMap("EventAlarmPictureStorage")
    @Validation(required = true)
    private EventAlarmPictureStorage eventAlarmPictureStorage;

    private SetAiotStorageInfoRequest(Builder builder) {
        super(builder);
        this.eventAlarmMq = builder.eventAlarmMq;
        this.eventAlarmPictureStorage = builder.eventAlarmPictureStorage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetAiotStorageInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventAlarmMq
     */
    public EventAlarmMq getEventAlarmMq() {
        return this.eventAlarmMq;
    }

    /**
     * @return eventAlarmPictureStorage
     */
    public EventAlarmPictureStorage getEventAlarmPictureStorage() {
        return this.eventAlarmPictureStorage;
    }

    public static final class Builder extends Request.Builder<SetAiotStorageInfoRequest, Builder> {
        private EventAlarmMq eventAlarmMq; 
        private EventAlarmPictureStorage eventAlarmPictureStorage; 

        private Builder() {
            super();
        } 

        private Builder(SetAiotStorageInfoRequest response) {
            super(response);
            this.eventAlarmMq = response.eventAlarmMq;
            this.eventAlarmPictureStorage = response.eventAlarmPictureStorage;
        } 

        /**
         * EventAlarmMq.
         */
        public Builder eventAlarmMq(EventAlarmMq eventAlarmMq) {
            this.putBodyParameter("EventAlarmMq", eventAlarmMq);
            this.eventAlarmMq = eventAlarmMq;
            return this;
        }

        /**
         * EventAlarmPictureStorage.
         */
        public Builder eventAlarmPictureStorage(EventAlarmPictureStorage eventAlarmPictureStorage) {
            this.putBodyParameter("EventAlarmPictureStorage", eventAlarmPictureStorage);
            this.eventAlarmPictureStorage = eventAlarmPictureStorage;
            return this;
        }

        @Override
        public SetAiotStorageInfoRequest build() {
            return new SetAiotStorageInfoRequest(this);
        } 

    } 

    public static class EventAlarmMq extends TeaModel {
        @NameInMap("AlarmTopic")
        @Validation(required = true)
        private String alarmTopic;

        @NameInMap("EventTopic")
        @Validation(required = true)
        private String eventTopic;

        @NameInMap("InstanceId")
        @Validation(required = true)
        private String instanceId;

        @NameInMap("MqType")
        private String mqType;

        @NameInMap("RamArnRole")
        @Validation(required = true)
        private String ramArnRole;

        @NameInMap("RegionId")
        @Validation(required = true)
        private String regionId;

        private EventAlarmMq(Builder builder) {
            this.alarmTopic = builder.alarmTopic;
            this.eventTopic = builder.eventTopic;
            this.instanceId = builder.instanceId;
            this.mqType = builder.mqType;
            this.ramArnRole = builder.ramArnRole;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventAlarmMq create() {
            return builder().build();
        }

        /**
         * @return alarmTopic
         */
        public String getAlarmTopic() {
            return this.alarmTopic;
        }

        /**
         * @return eventTopic
         */
        public String getEventTopic() {
            return this.eventTopic;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return mqType
         */
        public String getMqType() {
            return this.mqType;
        }

        /**
         * @return ramArnRole
         */
        public String getRamArnRole() {
            return this.ramArnRole;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String alarmTopic; 
            private String eventTopic; 
            private String instanceId; 
            private String mqType; 
            private String ramArnRole; 
            private String regionId; 

            /**
             * AlarmTopic.
             */
            public Builder alarmTopic(String alarmTopic) {
                this.alarmTopic = alarmTopic;
                return this;
            }

            /**
             * EventTopic.
             */
            public Builder eventTopic(String eventTopic) {
                this.eventTopic = eventTopic;
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
             * MqType.
             */
            public Builder mqType(String mqType) {
                this.mqType = mqType;
                return this;
            }

            /**
             * RamArnRole.
             */
            public Builder ramArnRole(String ramArnRole) {
                this.ramArnRole = ramArnRole;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public EventAlarmMq build() {
                return new EventAlarmMq(this);
            } 

        } 

    }
    public static class EventAlarmPictureStorage extends TeaModel {
        @NameInMap("Bucket")
        @Validation(required = true)
        private String bucket;

        @NameInMap("Endpoint")
        @Validation(required = true)
        private String endpoint;

        @NameInMap("Path")
        private String path;

        @NameInMap("Proxy")
        private String proxy;

        @NameInMap("RamArnRole")
        @Validation(required = true)
        private String ramArnRole;

        @NameInMap("StorageType")
        private String storageType;

        private EventAlarmPictureStorage(Builder builder) {
            this.bucket = builder.bucket;
            this.endpoint = builder.endpoint;
            this.path = builder.path;
            this.proxy = builder.proxy;
            this.ramArnRole = builder.ramArnRole;
            this.storageType = builder.storageType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventAlarmPictureStorage create() {
            return builder().build();
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return proxy
         */
        public String getProxy() {
            return this.proxy;
        }

        /**
         * @return ramArnRole
         */
        public String getRamArnRole() {
            return this.ramArnRole;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        public static final class Builder {
            private String bucket; 
            private String endpoint; 
            private String path; 
            private String proxy; 
            private String ramArnRole; 
            private String storageType; 

            /**
             * Bucket.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * Endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * Proxy.
             */
            public Builder proxy(String proxy) {
                this.proxy = proxy;
                return this;
            }

            /**
             * RamArnRole.
             */
            public Builder ramArnRole(String ramArnRole) {
                this.ramArnRole = ramArnRole;
                return this;
            }

            /**
             * StorageType.
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            public EventAlarmPictureStorage build() {
                return new EventAlarmPictureStorage(this);
            } 

        } 

    }
}
