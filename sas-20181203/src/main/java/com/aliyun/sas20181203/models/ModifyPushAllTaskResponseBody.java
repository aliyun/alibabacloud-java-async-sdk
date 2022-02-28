// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPushAllTaskResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyPushAllTaskResponseBody</p>
 */
public class ModifyPushAllTaskResponseBody extends TeaModel {
    @NameInMap("PushTaskRsp")
    private PushTaskRsp pushTaskRsp;

    @NameInMap("RequestId")
    private String requestId;

    private ModifyPushAllTaskResponseBody(Builder builder) {
        this.pushTaskRsp = builder.pushTaskRsp;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPushAllTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return pushTaskRsp
     */
    public PushTaskRsp getPushTaskRsp() {
        return this.pushTaskRsp;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PushTaskRsp pushTaskRsp; 
        private String requestId; 

        /**
         * PushTaskRsp.
         */
        public Builder pushTaskRsp(PushTaskRsp pushTaskRsp) {
            this.pushTaskRsp = pushTaskRsp;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyPushAllTaskResponseBody build() {
            return new ModifyPushAllTaskResponseBody(this);
        } 

    } 

    public static class PushTaskResultList extends TeaModel {
        @NameInMap("GroupId")
        private Long groupId;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("Message")
        private String message;

        @NameInMap("Online")
        private Boolean online;

        @NameInMap("OsVersion")
        private String osVersion;

        @NameInMap("Region")
        private String region;

        @NameInMap("Success")
        private Boolean success;

        @NameInMap("Uuid")
        private String uuid;

        private PushTaskResultList(Builder builder) {
            this.groupId = builder.groupId;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.ip = builder.ip;
            this.message = builder.message;
            this.online = builder.online;
            this.osVersion = builder.osVersion;
            this.region = builder.region;
            this.success = builder.success;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PushTaskResultList create() {
            return builder().build();
        }

        /**
         * @return groupId
         */
        public Long getGroupId() {
            return this.groupId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return online
         */
        public Boolean getOnline() {
            return this.online;
        }

        /**
         * @return osVersion
         */
        public String getOsVersion() {
            return this.osVersion;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private Long groupId; 
            private String instanceId; 
            private String instanceName; 
            private String ip; 
            private String message; 
            private Boolean online; 
            private String osVersion; 
            private String region; 
            private Boolean success; 
            private String uuid; 

            /**
             * GroupId.
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
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
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
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
             * Online.
             */
            public Builder online(Boolean online) {
                this.online = online;
                return this;
            }

            /**
             * OsVersion.
             */
            public Builder osVersion(String osVersion) {
                this.osVersion = osVersion;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public PushTaskResultList build() {
                return new PushTaskResultList(this);
            } 

        } 

    }
    public static class PushTaskRsp extends TeaModel {
        @NameInMap("PushTaskResultList")
        private java.util.List < PushTaskResultList> pushTaskResultList;

        private PushTaskRsp(Builder builder) {
            this.pushTaskResultList = builder.pushTaskResultList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PushTaskRsp create() {
            return builder().build();
        }

        /**
         * @return pushTaskResultList
         */
        public java.util.List < PushTaskResultList> getPushTaskResultList() {
            return this.pushTaskResultList;
        }

        public static final class Builder {
            private java.util.List < PushTaskResultList> pushTaskResultList; 

            /**
             * PushTaskResultList.
             */
            public Builder pushTaskResultList(java.util.List < PushTaskResultList> pushTaskResultList) {
                this.pushTaskResultList = pushTaskResultList;
                return this;
            }

            public PushTaskRsp build() {
                return new PushTaskRsp(this);
            } 

        } 

    }
}
