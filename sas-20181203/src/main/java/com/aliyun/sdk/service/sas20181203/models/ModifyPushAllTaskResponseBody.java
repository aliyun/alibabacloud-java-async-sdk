// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyPushAllTaskResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyPushAllTaskResponseBody</p>
 */
public class ModifyPushAllTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PushTaskRsp")
    private PushTaskRsp pushTaskRsp;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The results of security check tasks.</p>
         */
        public Builder pushTaskRsp(PushTaskRsp pushTaskRsp) {
            this.pushTaskRsp = pushTaskRsp;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>91EB4AC7-7FEF-4C72-BE49-4414E459AEC2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyPushAllTaskResponseBody build() {
            return new ModifyPushAllTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyPushAllTaskResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyPushAllTaskResponseBody</p>
     */
    public static class PushTaskResultList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupId")
        private Long groupId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Online")
        private Boolean online;

        @com.aliyun.core.annotation.NameInMap("OsVersion")
        private String osVersion;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("Uuid")
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
             * <p>The ID of the server group to which the server belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>226</p>
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The ID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>i-wz9f7wlklxqnvdk****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>TestInstance</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The IP address of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>127.XX.XX</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The message that describes the security check failure.</p>
             * 
             * <strong>example:</strong>
             * <p>successful</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>Indicates whether the Security Center agent is online. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * <blockquote>
             * <p> If the Security Center agent of the server is offline, Security Center does not protect the server.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder online(Boolean online) {
                this.online = online;
                return this;
            }

            /**
             * <p>The operating system version of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>linux</p>
             */
            public Builder osVersion(String osVersion) {
                this.osVersion = osVersion;
                return this;
            }

            /**
             * <p>The region in which the server resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>Indicates whether the security check task is successful. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            /**
             * <p>The UUID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>5493fe42-61f5-4627-9aa2-8c449bbe****</p>
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
    /**
     * 
     * {@link ModifyPushAllTaskResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyPushAllTaskResponseBody</p>
     */
    public static class PushTaskRsp extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PushTaskResultList")
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
             * <p>An array consisting of the servers on which security check tasks failed.</p>
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
