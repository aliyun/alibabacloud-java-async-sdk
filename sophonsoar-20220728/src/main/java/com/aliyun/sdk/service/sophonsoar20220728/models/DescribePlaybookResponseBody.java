// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePlaybookResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePlaybookResponseBody</p>
 */
public class DescribePlaybookResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Playbook")
    private Playbook playbook;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePlaybookResponseBody(Builder builder) {
        this.playbook = builder.playbook;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePlaybookResponseBody create() {
        return builder().build();
    }

    /**
     * @return playbook
     */
    public Playbook getPlaybook() {
        return this.playbook;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Playbook playbook; 
        private String requestId; 

        /**
         * The configuration of the playbook.
         */
        public Builder playbook(Playbook playbook) {
            this.playbook = playbook;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePlaybookResponseBody build() {
            return new DescribePlaybookResponseBody(this);
        } 

    } 

    public static class Playbook extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("FailExeNum")
        private Integer failExeNum;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("InputParams")
        private String inputParams;

        @com.aliyun.core.annotation.NameInMap("LastExeTime")
        private Long lastExeTime;

        @com.aliyun.core.annotation.NameInMap("Modifier")
        private String modifier;

        @com.aliyun.core.annotation.NameInMap("OnlineActive")
        private Boolean onlineActive;

        @com.aliyun.core.annotation.NameInMap("OnlineReleaseTaskflowMd5")
        private String onlineReleaseTaskflowMd5;

        @com.aliyun.core.annotation.NameInMap("OwnType")
        private String ownType;

        @com.aliyun.core.annotation.NameInMap("PlaybookUuid")
        private String playbookUuid;

        @com.aliyun.core.annotation.NameInMap("SuccessExeNum")
        private Integer successExeNum;

        @com.aliyun.core.annotation.NameInMap("Taskflow")
        private String taskflow;

        @com.aliyun.core.annotation.NameInMap("TaskflowType")
        private String taskflowType;

        private Playbook(Builder builder) {
            this.creator = builder.creator;
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.failExeNum = builder.failExeNum;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.inputParams = builder.inputParams;
            this.lastExeTime = builder.lastExeTime;
            this.modifier = builder.modifier;
            this.onlineActive = builder.onlineActive;
            this.onlineReleaseTaskflowMd5 = builder.onlineReleaseTaskflowMd5;
            this.ownType = builder.ownType;
            this.playbookUuid = builder.playbookUuid;
            this.successExeNum = builder.successExeNum;
            this.taskflow = builder.taskflow;
            this.taskflowType = builder.taskflowType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Playbook create() {
            return builder().build();
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return failExeNum
         */
        public Integer getFailExeNum() {
            return this.failExeNum;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return inputParams
         */
        public String getInputParams() {
            return this.inputParams;
        }

        /**
         * @return lastExeTime
         */
        public Long getLastExeTime() {
            return this.lastExeTime;
        }

        /**
         * @return modifier
         */
        public String getModifier() {
            return this.modifier;
        }

        /**
         * @return onlineActive
         */
        public Boolean getOnlineActive() {
            return this.onlineActive;
        }

        /**
         * @return onlineReleaseTaskflowMd5
         */
        public String getOnlineReleaseTaskflowMd5() {
            return this.onlineReleaseTaskflowMd5;
        }

        /**
         * @return ownType
         */
        public String getOwnType() {
            return this.ownType;
        }

        /**
         * @return playbookUuid
         */
        public String getPlaybookUuid() {
            return this.playbookUuid;
        }

        /**
         * @return successExeNum
         */
        public Integer getSuccessExeNum() {
            return this.successExeNum;
        }

        /**
         * @return taskflow
         */
        public String getTaskflow() {
            return this.taskflow;
        }

        /**
         * @return taskflowType
         */
        public String getTaskflowType() {
            return this.taskflowType;
        }

        public static final class Builder {
            private String creator; 
            private String description; 
            private String displayName; 
            private Integer failExeNum; 
            private String gmtCreate; 
            private String gmtModified; 
            private String inputParams; 
            private Long lastExeTime; 
            private String modifier; 
            private Boolean onlineActive; 
            private String onlineReleaseTaskflowMd5; 
            private String ownType; 
            private String playbookUuid; 
            private Integer successExeNum; 
            private String taskflow; 
            private String taskflowType; 

            /**
             * The ID of the Alibaba Cloud account that is used to create the playbook.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * The description of the playbook.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The display name of the playbook.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * The number of times that the playbook failed to be run.
             */
            public Builder failExeNum(Integer failExeNum) {
                this.failExeNum = failExeNum;
                return this;
            }

            /**
             * The creation time of the playbook. The value is a 13-digit timestamp.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The modification time of the playbook. The value is a 13-digit timestamp.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The input parameter configuration of the playbook. The value is a JSON array.
             * <p>
             * 
             * >  For more information, see [DescribePlaybookInputOutput](~~DescribePlaybookInputOutput~~).
             */
            public Builder inputParams(String inputParams) {
                this.inputParams = inputParams;
                return this;
            }

            /**
             * The time when the playbook was last run. The value is a 13-digit timestamp.
             */
            public Builder lastExeTime(Long lastExeTime) {
                this.lastExeTime = lastExeTime;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account that is used to modify the playbook.
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * The status of the playbook. Valid values:
             * <p>
             * 
             * *   **0**: disabled
             * *   **1**: enabled
             */
            public Builder onlineActive(Boolean onlineActive) {
                this.onlineActive = onlineActive;
                return this;
            }

            /**
             * The MD5 hash value in the latest published version of the playbook.
             */
            public Builder onlineReleaseTaskflowMd5(String onlineReleaseTaskflowMd5) {
                this.onlineReleaseTaskflowMd5 = onlineReleaseTaskflowMd5;
                return this;
            }

            /**
             * The type of the playbook. Valid values:
             * <p>
             * 
             * *   **preset**: predefined playbook
             * *   **user**: custom playbook
             */
            public Builder ownType(String ownType) {
                this.ownType = ownType;
                return this;
            }

            /**
             * The UUID of the playbook.
             */
            public Builder playbookUuid(String playbookUuid) {
                this.playbookUuid = playbookUuid;
                return this;
            }

            /**
             * The number of times that the playbook was successfully run.
             */
            public Builder successExeNum(Integer successExeNum) {
                this.successExeNum = successExeNum;
                return this;
            }

            /**
             * The XML configuration of the playbook.
             */
            public Builder taskflow(String taskflow) {
                this.taskflow = taskflow;
                return this;
            }

            /**
             * The playbook configuration type.
             * <p>
             * *   **xml**: XML format.
             * *   **x6**: JSON format.
             */
            public Builder taskflowType(String taskflowType) {
                this.taskflowType = taskflowType;
                return this;
            }

            public Playbook build() {
                return new Playbook(this);
            } 

        } 

    }
}
