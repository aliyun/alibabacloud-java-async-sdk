// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePlaybookResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePlaybookResponseBody</p>
 */
public class DescribePlaybookResponseBody extends TeaModel {
    @NameInMap("Playbook")
    private Playbook playbook;

    @NameInMap("RequestId")
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
         * Playbook.
         */
        public Builder playbook(Playbook playbook) {
            this.playbook = playbook;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("Creator")
        private String creator;

        @NameInMap("Description")
        private String description;

        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("FailExeNum")
        private Integer failExeNum;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("InputParams")
        private String inputParams;

        @NameInMap("LastExeTime")
        private Long lastExeTime;

        @NameInMap("Modifier")
        private String modifier;

        @NameInMap("OnlineActive")
        private Boolean onlineActive;

        @NameInMap("OnlineReleaseTaskflowMd5")
        private String onlineReleaseTaskflowMd5;

        @NameInMap("OwnType")
        private String ownType;

        @NameInMap("PlaybookUuid")
        private String playbookUuid;

        @NameInMap("SuccessExeNum")
        private Integer successExeNum;

        @NameInMap("Taskflow")
        private String taskflow;

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

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * FailExeNum.
             */
            public Builder failExeNum(Integer failExeNum) {
                this.failExeNum = failExeNum;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * InputParams.
             */
            public Builder inputParams(String inputParams) {
                this.inputParams = inputParams;
                return this;
            }

            /**
             * LastExeTime.
             */
            public Builder lastExeTime(Long lastExeTime) {
                this.lastExeTime = lastExeTime;
                return this;
            }

            /**
             * Modifier.
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * OnlineActive.
             */
            public Builder onlineActive(Boolean onlineActive) {
                this.onlineActive = onlineActive;
                return this;
            }

            /**
             * OnlineReleaseTaskflowMd5.
             */
            public Builder onlineReleaseTaskflowMd5(String onlineReleaseTaskflowMd5) {
                this.onlineReleaseTaskflowMd5 = onlineReleaseTaskflowMd5;
                return this;
            }

            /**
             * OwnType.
             */
            public Builder ownType(String ownType) {
                this.ownType = ownType;
                return this;
            }

            /**
             * PlaybookUuid.
             */
            public Builder playbookUuid(String playbookUuid) {
                this.playbookUuid = playbookUuid;
                return this;
            }

            /**
             * SuccessExeNum.
             */
            public Builder successExeNum(Integer successExeNum) {
                this.successExeNum = successExeNum;
                return this;
            }

            /**
             * Taskflow.
             */
            public Builder taskflow(String taskflow) {
                this.taskflow = taskflow;
                return this;
            }

            public Playbook build() {
                return new Playbook(this);
            } 

        } 

    }
}
