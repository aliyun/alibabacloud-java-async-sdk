// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safe20220117.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SafeChangeQueryResponseBody} extends {@link TeaModel}
 *
 * <p>SafeChangeQueryResponseBody</p>
 */
public class SafeChangeQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private SafeChangeQueryResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SafeChangeQueryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(SafeChangeQueryResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public SafeChangeQueryResponseBody build() {
            return new SafeChangeQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SafeChangeQueryResponseBody} extends {@link TeaModel}
     *
     * <p>SafeChangeQueryResponseBody</p>
     */
    public static class ChangeTimes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChangeEndTime")
        private Long changeEndTime;

        @com.aliyun.core.annotation.NameInMap("ChangeStartTime")
        private Long changeStartTime;

        private ChangeTimes(Builder builder) {
            this.changeEndTime = builder.changeEndTime;
            this.changeStartTime = builder.changeStartTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChangeTimes create() {
            return builder().build();
        }

        /**
         * @return changeEndTime
         */
        public Long getChangeEndTime() {
            return this.changeEndTime;
        }

        /**
         * @return changeStartTime
         */
        public Long getChangeStartTime() {
            return this.changeStartTime;
        }

        public static final class Builder {
            private Long changeEndTime; 
            private Long changeStartTime; 

            private Builder() {
            } 

            private Builder(ChangeTimes model) {
                this.changeEndTime = model.changeEndTime;
                this.changeStartTime = model.changeStartTime;
            } 

            /**
             * ChangeEndTime.
             */
            public Builder changeEndTime(Long changeEndTime) {
                this.changeEndTime = changeEndTime;
                return this;
            }

            /**
             * ChangeStartTime.
             */
            public Builder changeStartTime(Long changeStartTime) {
                this.changeStartTime = changeStartTime;
                return this;
            }

            public ChangeTimes build() {
                return new ChangeTimes(this);
            } 

        } 

    }
    /**
     * 
     * {@link SafeChangeQueryResponseBody} extends {@link TeaModel}
     *
     * <p>SafeChangeQueryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApproveResultUrl")
        private String approveResultUrl;

        @com.aliyun.core.annotation.NameInMap("ApproveStatus")
        private String approveStatus;

        @com.aliyun.core.annotation.NameInMap("ChangeCancel")
        private String changeCancel;

        @com.aliyun.core.annotation.NameInMap("ChangeEndTime")
        private Long changeEndTime;

        @com.aliyun.core.annotation.NameInMap("ChangeObject")
        private String changeObject;

        @com.aliyun.core.annotation.NameInMap("ChangeOptType")
        private String changeOptType;

        @com.aliyun.core.annotation.NameInMap("ChangeResult")
        private String changeResult;

        @com.aliyun.core.annotation.NameInMap("ChangeStartTime")
        private Long changeStartTime;

        @com.aliyun.core.annotation.NameInMap("ChangeStatus")
        private String changeStatus;

        @com.aliyun.core.annotation.NameInMap("ChangeSystem")
        private String changeSystem;

        @com.aliyun.core.annotation.NameInMap("ChangeTimes")
        private java.util.List<ChangeTimes> changeTimes;

        @com.aliyun.core.annotation.NameInMap("ChangeTitle")
        private String changeTitle;

        @com.aliyun.core.annotation.NameInMap("CheckResultUrl")
        private String checkResultUrl;

        @com.aliyun.core.annotation.NameInMap("CheckStatus")
        private String checkStatus;

        @com.aliyun.core.annotation.NameInMap("CheckholdReason")
        private java.util.List<String> checkholdReason;

        @com.aliyun.core.annotation.NameInMap("ExecutorEmpId")
        private String executorEmpId;

        @com.aliyun.core.annotation.NameInMap("ExecutorEmpName")
        private String executorEmpName;

        @com.aliyun.core.annotation.NameInMap("SourceOrderId")
        private String sourceOrderId;

        private Data(Builder builder) {
            this.approveResultUrl = builder.approveResultUrl;
            this.approveStatus = builder.approveStatus;
            this.changeCancel = builder.changeCancel;
            this.changeEndTime = builder.changeEndTime;
            this.changeObject = builder.changeObject;
            this.changeOptType = builder.changeOptType;
            this.changeResult = builder.changeResult;
            this.changeStartTime = builder.changeStartTime;
            this.changeStatus = builder.changeStatus;
            this.changeSystem = builder.changeSystem;
            this.changeTimes = builder.changeTimes;
            this.changeTitle = builder.changeTitle;
            this.checkResultUrl = builder.checkResultUrl;
            this.checkStatus = builder.checkStatus;
            this.checkholdReason = builder.checkholdReason;
            this.executorEmpId = builder.executorEmpId;
            this.executorEmpName = builder.executorEmpName;
            this.sourceOrderId = builder.sourceOrderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return approveResultUrl
         */
        public String getApproveResultUrl() {
            return this.approveResultUrl;
        }

        /**
         * @return approveStatus
         */
        public String getApproveStatus() {
            return this.approveStatus;
        }

        /**
         * @return changeCancel
         */
        public String getChangeCancel() {
            return this.changeCancel;
        }

        /**
         * @return changeEndTime
         */
        public Long getChangeEndTime() {
            return this.changeEndTime;
        }

        /**
         * @return changeObject
         */
        public String getChangeObject() {
            return this.changeObject;
        }

        /**
         * @return changeOptType
         */
        public String getChangeOptType() {
            return this.changeOptType;
        }

        /**
         * @return changeResult
         */
        public String getChangeResult() {
            return this.changeResult;
        }

        /**
         * @return changeStartTime
         */
        public Long getChangeStartTime() {
            return this.changeStartTime;
        }

        /**
         * @return changeStatus
         */
        public String getChangeStatus() {
            return this.changeStatus;
        }

        /**
         * @return changeSystem
         */
        public String getChangeSystem() {
            return this.changeSystem;
        }

        /**
         * @return changeTimes
         */
        public java.util.List<ChangeTimes> getChangeTimes() {
            return this.changeTimes;
        }

        /**
         * @return changeTitle
         */
        public String getChangeTitle() {
            return this.changeTitle;
        }

        /**
         * @return checkResultUrl
         */
        public String getCheckResultUrl() {
            return this.checkResultUrl;
        }

        /**
         * @return checkStatus
         */
        public String getCheckStatus() {
            return this.checkStatus;
        }

        /**
         * @return checkholdReason
         */
        public java.util.List<String> getCheckholdReason() {
            return this.checkholdReason;
        }

        /**
         * @return executorEmpId
         */
        public String getExecutorEmpId() {
            return this.executorEmpId;
        }

        /**
         * @return executorEmpName
         */
        public String getExecutorEmpName() {
            return this.executorEmpName;
        }

        /**
         * @return sourceOrderId
         */
        public String getSourceOrderId() {
            return this.sourceOrderId;
        }

        public static final class Builder {
            private String approveResultUrl; 
            private String approveStatus; 
            private String changeCancel; 
            private Long changeEndTime; 
            private String changeObject; 
            private String changeOptType; 
            private String changeResult; 
            private Long changeStartTime; 
            private String changeStatus; 
            private String changeSystem; 
            private java.util.List<ChangeTimes> changeTimes; 
            private String changeTitle; 
            private String checkResultUrl; 
            private String checkStatus; 
            private java.util.List<String> checkholdReason; 
            private String executorEmpId; 
            private String executorEmpName; 
            private String sourceOrderId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.approveResultUrl = model.approveResultUrl;
                this.approveStatus = model.approveStatus;
                this.changeCancel = model.changeCancel;
                this.changeEndTime = model.changeEndTime;
                this.changeObject = model.changeObject;
                this.changeOptType = model.changeOptType;
                this.changeResult = model.changeResult;
                this.changeStartTime = model.changeStartTime;
                this.changeStatus = model.changeStatus;
                this.changeSystem = model.changeSystem;
                this.changeTimes = model.changeTimes;
                this.changeTitle = model.changeTitle;
                this.checkResultUrl = model.checkResultUrl;
                this.checkStatus = model.checkStatus;
                this.checkholdReason = model.checkholdReason;
                this.executorEmpId = model.executorEmpId;
                this.executorEmpName = model.executorEmpName;
                this.sourceOrderId = model.sourceOrderId;
            } 

            /**
             * ApproveResultUrl.
             */
            public Builder approveResultUrl(String approveResultUrl) {
                this.approveResultUrl = approveResultUrl;
                return this;
            }

            /**
             * ApproveStatus.
             */
            public Builder approveStatus(String approveStatus) {
                this.approveStatus = approveStatus;
                return this;
            }

            /**
             * ChangeCancel.
             */
            public Builder changeCancel(String changeCancel) {
                this.changeCancel = changeCancel;
                return this;
            }

            /**
             * ChangeEndTime.
             */
            public Builder changeEndTime(Long changeEndTime) {
                this.changeEndTime = changeEndTime;
                return this;
            }

            /**
             * ChangeObject.
             */
            public Builder changeObject(String changeObject) {
                this.changeObject = changeObject;
                return this;
            }

            /**
             * ChangeOptType.
             */
            public Builder changeOptType(String changeOptType) {
                this.changeOptType = changeOptType;
                return this;
            }

            /**
             * ChangeResult.
             */
            public Builder changeResult(String changeResult) {
                this.changeResult = changeResult;
                return this;
            }

            /**
             * ChangeStartTime.
             */
            public Builder changeStartTime(Long changeStartTime) {
                this.changeStartTime = changeStartTime;
                return this;
            }

            /**
             * ChangeStatus.
             */
            public Builder changeStatus(String changeStatus) {
                this.changeStatus = changeStatus;
                return this;
            }

            /**
             * ChangeSystem.
             */
            public Builder changeSystem(String changeSystem) {
                this.changeSystem = changeSystem;
                return this;
            }

            /**
             * ChangeTimes.
             */
            public Builder changeTimes(java.util.List<ChangeTimes> changeTimes) {
                this.changeTimes = changeTimes;
                return this;
            }

            /**
             * ChangeTitle.
             */
            public Builder changeTitle(String changeTitle) {
                this.changeTitle = changeTitle;
                return this;
            }

            /**
             * CheckResultUrl.
             */
            public Builder checkResultUrl(String checkResultUrl) {
                this.checkResultUrl = checkResultUrl;
                return this;
            }

            /**
             * CheckStatus.
             */
            public Builder checkStatus(String checkStatus) {
                this.checkStatus = checkStatus;
                return this;
            }

            /**
             * CheckholdReason.
             */
            public Builder checkholdReason(java.util.List<String> checkholdReason) {
                this.checkholdReason = checkholdReason;
                return this;
            }

            /**
             * ExecutorEmpId.
             */
            public Builder executorEmpId(String executorEmpId) {
                this.executorEmpId = executorEmpId;
                return this;
            }

            /**
             * ExecutorEmpName.
             */
            public Builder executorEmpName(String executorEmpName) {
                this.executorEmpName = executorEmpName;
                return this;
            }

            /**
             * SourceOrderId.
             */
            public Builder sourceOrderId(String sourceOrderId) {
                this.sourceOrderId = sourceOrderId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
