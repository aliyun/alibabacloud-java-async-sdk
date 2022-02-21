// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAiotStorageInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetAiotStorageInfoResponseBody</p>
 */
public class GetAiotStorageInfoResponseBody extends TeaModel {
    @NameInMap("AiotStorageInfo")
    private AiotStorageInfo aiotStorageInfo;

    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private GetAiotStorageInfoResponseBody(Builder builder) {
        this.aiotStorageInfo = builder.aiotStorageInfo;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAiotStorageInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return aiotStorageInfo
     */
    public AiotStorageInfo getAiotStorageInfo() {
        return this.aiotStorageInfo;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AiotStorageInfo aiotStorageInfo; 
        private String code; 
        private String message; 
        private String requestId; 

        /**
         * AiotStorageInfo.
         */
        public Builder aiotStorageInfo(AiotStorageInfo aiotStorageInfo) {
            this.aiotStorageInfo = aiotStorageInfo;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAiotStorageInfoResponseBody build() {
            return new GetAiotStorageInfoResponseBody(this);
        } 

    } 

    public static class EventAlarmMq extends TeaModel {
        @NameInMap("AlarmTopic")
        private String alarmTopic;

        @NameInMap("EventTopic")
        private String eventTopic;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("MqType")
        private String mqType;

        @NameInMap("RamArnRole")
        private String ramArnRole;

        @NameInMap("RegionId")
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
        private String bucket;

        @NameInMap("Endpoint")
        private String endpoint;

        @NameInMap("Path")
        private String path;

        @NameInMap("Proxy")
        private String proxy;

        @NameInMap("RamArnRole")
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
    public static class AiotStorageInfo extends TeaModel {
        @NameInMap("EventAlarmMq")
        private EventAlarmMq eventAlarmMq;

        @NameInMap("EventAlarmPictureStorage")
        private EventAlarmPictureStorage eventAlarmPictureStorage;

        private AiotStorageInfo(Builder builder) {
            this.eventAlarmMq = builder.eventAlarmMq;
            this.eventAlarmPictureStorage = builder.eventAlarmPictureStorage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AiotStorageInfo create() {
            return builder().build();
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

        public static final class Builder {
            private EventAlarmMq eventAlarmMq; 
            private EventAlarmPictureStorage eventAlarmPictureStorage; 

            /**
             * EventAlarmMq.
             */
            public Builder eventAlarmMq(EventAlarmMq eventAlarmMq) {
                this.eventAlarmMq = eventAlarmMq;
                return this;
            }

            /**
             * EventAlarmPictureStorage.
             */
            public Builder eventAlarmPictureStorage(EventAlarmPictureStorage eventAlarmPictureStorage) {
                this.eventAlarmPictureStorage = eventAlarmPictureStorage;
                return this;
            }

            public AiotStorageInfo build() {
                return new AiotStorageInfo(this);
            } 

        } 

    }
}
