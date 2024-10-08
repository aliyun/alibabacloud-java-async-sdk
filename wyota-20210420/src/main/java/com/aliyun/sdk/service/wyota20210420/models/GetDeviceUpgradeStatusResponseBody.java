// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDeviceUpgradeStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetDeviceUpgradeStatusResponseBody</p>
 */
public class GetDeviceUpgradeStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDeviceUpgradeStatusResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeviceUpgradeStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDeviceUpgradeStatusResponseBody build() {
            return new GetDeviceUpgradeStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDeviceUpgradeStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetDeviceUpgradeStatusResponseBody</p>
     */
    public static class AppOtaStatusDTOList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BaseVersion")
        private String baseVersion;

        @com.aliyun.core.annotation.NameInMap("ClientType")
        private Integer clientType;

        @com.aliyun.core.annotation.NameInMap("ClientUid")
        private String clientUid;

        @com.aliyun.core.annotation.NameInMap("Note")
        private String note;

        @com.aliyun.core.annotation.NameInMap("OsType")
        private String osType;

        @com.aliyun.core.annotation.NameInMap("Project")
        private String project;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TargetVersion")
        private String targetVersion;

        @com.aliyun.core.annotation.NameInMap("TaskUid")
        private String taskUid;

        private AppOtaStatusDTOList(Builder builder) {
            this.baseVersion = builder.baseVersion;
            this.clientType = builder.clientType;
            this.clientUid = builder.clientUid;
            this.note = builder.note;
            this.osType = builder.osType;
            this.project = builder.project;
            this.status = builder.status;
            this.targetVersion = builder.targetVersion;
            this.taskUid = builder.taskUid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppOtaStatusDTOList create() {
            return builder().build();
        }

        /**
         * @return baseVersion
         */
        public String getBaseVersion() {
            return this.baseVersion;
        }

        /**
         * @return clientType
         */
        public Integer getClientType() {
            return this.clientType;
        }

        /**
         * @return clientUid
         */
        public String getClientUid() {
            return this.clientUid;
        }

        /**
         * @return note
         */
        public String getNote() {
            return this.note;
        }

        /**
         * @return osType
         */
        public String getOsType() {
            return this.osType;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return targetVersion
         */
        public String getTargetVersion() {
            return this.targetVersion;
        }

        /**
         * @return taskUid
         */
        public String getTaskUid() {
            return this.taskUid;
        }

        public static final class Builder {
            private String baseVersion; 
            private Integer clientType; 
            private String clientUid; 
            private String note; 
            private String osType; 
            private String project; 
            private Integer status; 
            private String targetVersion; 
            private String taskUid; 

            /**
             * BaseVersion.
             */
            public Builder baseVersion(String baseVersion) {
                this.baseVersion = baseVersion;
                return this;
            }

            /**
             * ClientType.
             */
            public Builder clientType(Integer clientType) {
                this.clientType = clientType;
                return this;
            }

            /**
             * ClientUid.
             */
            public Builder clientUid(String clientUid) {
                this.clientUid = clientUid;
                return this;
            }

            /**
             * Note.
             */
            public Builder note(String note) {
                this.note = note;
                return this;
            }

            /**
             * OsType.
             */
            public Builder osType(String osType) {
                this.osType = osType;
                return this;
            }

            /**
             * Project.
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * TargetVersion.
             */
            public Builder targetVersion(String targetVersion) {
                this.targetVersion = targetVersion;
                return this;
            }

            /**
             * TaskUid.
             */
            public Builder taskUid(String taskUid) {
                this.taskUid = taskUid;
                return this;
            }

            public AppOtaStatusDTOList build() {
                return new AppOtaStatusDTOList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDeviceUpgradeStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetDeviceUpgradeStatusResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppOtaStatusDTOList")
        private java.util.List < AppOtaStatusDTOList> appOtaStatusDTOList;

        private Data(Builder builder) {
            this.appOtaStatusDTOList = builder.appOtaStatusDTOList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appOtaStatusDTOList
         */
        public java.util.List < AppOtaStatusDTOList> getAppOtaStatusDTOList() {
            return this.appOtaStatusDTOList;
        }

        public static final class Builder {
            private java.util.List < AppOtaStatusDTOList> appOtaStatusDTOList; 

            /**
             * AppOtaStatusDTOList.
             */
            public Builder appOtaStatusDTOList(java.util.List < AppOtaStatusDTOList> appOtaStatusDTOList) {
                this.appOtaStatusDTOList = appOtaStatusDTOList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
