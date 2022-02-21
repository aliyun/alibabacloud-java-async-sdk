// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeChangesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeChangesResponseBody</p>
 */
public class DescribeChangesResponseBody extends TeaModel {
    @NameInMap("Changes")
    private Changes changes;

    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeChangesResponseBody(Builder builder) {
        this.changes = builder.changes;
        this.code = builder.code;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeChangesResponseBody create() {
        return builder().build();
    }

    /**
     * @return changes
     */
    public Changes getChanges() {
        return this.changes;
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Changes changes; 
        private String code; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Changes.
         */
        public Builder changes(Changes changes) {
            this.changes = changes;
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeChangesResponseBody build() {
            return new DescribeChangesResponseBody(this);
        } 

    } 

    public static class Change extends TeaModel {
        @NameInMap("ActionName")
        private String actionName;

        @NameInMap("ChangeAborted")
        private Boolean changeAborted;

        @NameInMap("ChangeDescription")
        private String changeDescription;

        @NameInMap("ChangeFinished")
        private Boolean changeFinished;

        @NameInMap("ChangeId")
        private String changeId;

        @NameInMap("ChangeMessage")
        private String changeMessage;

        @NameInMap("ChangeName")
        private String changeName;

        @NameInMap("ChangePaused")
        private Boolean changePaused;

        @NameInMap("ChangeSucceed")
        private Boolean changeSucceed;

        @NameInMap("ChangeTimedout")
        private Boolean changeTimedout;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("CreateUsername")
        private String createUsername;

        @NameInMap("EnvId")
        private String envId;

        @NameInMap("FinishTime")
        private Long finishTime;

        @NameInMap("UpdateTime")
        private Long updateTime;

        private Change(Builder builder) {
            this.actionName = builder.actionName;
            this.changeAborted = builder.changeAborted;
            this.changeDescription = builder.changeDescription;
            this.changeFinished = builder.changeFinished;
            this.changeId = builder.changeId;
            this.changeMessage = builder.changeMessage;
            this.changeName = builder.changeName;
            this.changePaused = builder.changePaused;
            this.changeSucceed = builder.changeSucceed;
            this.changeTimedout = builder.changeTimedout;
            this.createTime = builder.createTime;
            this.createUsername = builder.createUsername;
            this.envId = builder.envId;
            this.finishTime = builder.finishTime;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Change create() {
            return builder().build();
        }

        /**
         * @return actionName
         */
        public String getActionName() {
            return this.actionName;
        }

        /**
         * @return changeAborted
         */
        public Boolean getChangeAborted() {
            return this.changeAborted;
        }

        /**
         * @return changeDescription
         */
        public String getChangeDescription() {
            return this.changeDescription;
        }

        /**
         * @return changeFinished
         */
        public Boolean getChangeFinished() {
            return this.changeFinished;
        }

        /**
         * @return changeId
         */
        public String getChangeId() {
            return this.changeId;
        }

        /**
         * @return changeMessage
         */
        public String getChangeMessage() {
            return this.changeMessage;
        }

        /**
         * @return changeName
         */
        public String getChangeName() {
            return this.changeName;
        }

        /**
         * @return changePaused
         */
        public Boolean getChangePaused() {
            return this.changePaused;
        }

        /**
         * @return changeSucceed
         */
        public Boolean getChangeSucceed() {
            return this.changeSucceed;
        }

        /**
         * @return changeTimedout
         */
        public Boolean getChangeTimedout() {
            return this.changeTimedout;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createUsername
         */
        public String getCreateUsername() {
            return this.createUsername;
        }

        /**
         * @return envId
         */
        public String getEnvId() {
            return this.envId;
        }

        /**
         * @return finishTime
         */
        public Long getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String actionName; 
            private Boolean changeAborted; 
            private String changeDescription; 
            private Boolean changeFinished; 
            private String changeId; 
            private String changeMessage; 
            private String changeName; 
            private Boolean changePaused; 
            private Boolean changeSucceed; 
            private Boolean changeTimedout; 
            private Long createTime; 
            private String createUsername; 
            private String envId; 
            private Long finishTime; 
            private Long updateTime; 

            /**
             * ActionName.
             */
            public Builder actionName(String actionName) {
                this.actionName = actionName;
                return this;
            }

            /**
             * ChangeAborted.
             */
            public Builder changeAborted(Boolean changeAborted) {
                this.changeAborted = changeAborted;
                return this;
            }

            /**
             * ChangeDescription.
             */
            public Builder changeDescription(String changeDescription) {
                this.changeDescription = changeDescription;
                return this;
            }

            /**
             * ChangeFinished.
             */
            public Builder changeFinished(Boolean changeFinished) {
                this.changeFinished = changeFinished;
                return this;
            }

            /**
             * ChangeId.
             */
            public Builder changeId(String changeId) {
                this.changeId = changeId;
                return this;
            }

            /**
             * ChangeMessage.
             */
            public Builder changeMessage(String changeMessage) {
                this.changeMessage = changeMessage;
                return this;
            }

            /**
             * ChangeName.
             */
            public Builder changeName(String changeName) {
                this.changeName = changeName;
                return this;
            }

            /**
             * ChangePaused.
             */
            public Builder changePaused(Boolean changePaused) {
                this.changePaused = changePaused;
                return this;
            }

            /**
             * ChangeSucceed.
             */
            public Builder changeSucceed(Boolean changeSucceed) {
                this.changeSucceed = changeSucceed;
                return this;
            }

            /**
             * ChangeTimedout.
             */
            public Builder changeTimedout(Boolean changeTimedout) {
                this.changeTimedout = changeTimedout;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreateUsername.
             */
            public Builder createUsername(String createUsername) {
                this.createUsername = createUsername;
                return this;
            }

            /**
             * EnvId.
             */
            public Builder envId(String envId) {
                this.envId = envId;
                return this;
            }

            /**
             * FinishTime.
             */
            public Builder finishTime(Long finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Change build() {
                return new Change(this);
            } 

        } 

    }
    public static class Changes extends TeaModel {
        @NameInMap("Change")
        private java.util.List < Change> change;

        private Changes(Builder builder) {
            this.change = builder.change;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Changes create() {
            return builder().build();
        }

        /**
         * @return change
         */
        public java.util.List < Change> getChange() {
            return this.change;
        }

        public static final class Builder {
            private java.util.List < Change> change; 

            /**
             * Change.
             */
            public Builder change(java.util.List < Change> change) {
                this.change = change;
                return this;
            }

            public Changes build() {
                return new Changes(this);
            } 

        } 

    }
}
