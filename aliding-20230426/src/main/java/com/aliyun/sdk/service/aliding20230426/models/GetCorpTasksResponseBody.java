// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCorpTasksResponseBody} extends {@link TeaModel}
 *
 * <p>GetCorpTasksResponseBody</p>
 */
public class GetCorpTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private GetCorpTasksResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCorpTasksResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return vendorRequestId
     */
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private Long pageNumber; 
        private String requestId; 
        private Long totalCount; 
        private String vendorRequestId; 
        private String vendorType; 

        /**
         * data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * vendorRequestId.
         */
        public Builder vendorRequestId(String vendorRequestId) {
            this.vendorRequestId = vendorRequestId;
            return this;
        }

        /**
         * vendorType.
         */
        public Builder vendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }

        public GetCorpTasksResponseBody build() {
            return new GetCorpTasksResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveTimeGMT")
        private String activeTimeGMT;

        @com.aliyun.core.annotation.NameInMap("ActualActionerId")
        private String actualActionerId;

        @com.aliyun.core.annotation.NameInMap("AppType")
        private String appType;

        @com.aliyun.core.annotation.NameInMap("CreateTimeGMT")
        private String createTimeGMT;

        @com.aliyun.core.annotation.NameInMap("FinishTimeGMT")
        private String finishTimeGMT;

        @com.aliyun.core.annotation.NameInMap("OriginatorEmail")
        private String originatorEmail;

        @com.aliyun.core.annotation.NameInMap("OriginatorId")
        private String originatorId;

        @com.aliyun.core.annotation.NameInMap("OriginatorName")
        private String originatorName;

        @com.aliyun.core.annotation.NameInMap("OriginatorNameInEnglish")
        private String originatorNameInEnglish;

        @com.aliyun.core.annotation.NameInMap("OriginatorNickName")
        private String originatorNickName;

        @com.aliyun.core.annotation.NameInMap("OriginatorNickNameEn")
        private String originatorNickNameEn;

        @com.aliyun.core.annotation.NameInMap("OriginatorNickNameInEnglish")
        private String originatorNickNameInEnglish;

        @com.aliyun.core.annotation.NameInMap("OriginatorPhoto")
        private String originatorPhoto;

        @com.aliyun.core.annotation.NameInMap("OutResult")
        private String outResult;

        @com.aliyun.core.annotation.NameInMap("OutResultName")
        private String outResultName;

        @com.aliyun.core.annotation.NameInMap("ProcessInstanceId")
        private String processInstanceId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("TitleInEnglish")
        private String titleInEnglish;

        private Data(Builder builder) {
            this.activeTimeGMT = builder.activeTimeGMT;
            this.actualActionerId = builder.actualActionerId;
            this.appType = builder.appType;
            this.createTimeGMT = builder.createTimeGMT;
            this.finishTimeGMT = builder.finishTimeGMT;
            this.originatorEmail = builder.originatorEmail;
            this.originatorId = builder.originatorId;
            this.originatorName = builder.originatorName;
            this.originatorNameInEnglish = builder.originatorNameInEnglish;
            this.originatorNickName = builder.originatorNickName;
            this.originatorNickNameEn = builder.originatorNickNameEn;
            this.originatorNickNameInEnglish = builder.originatorNickNameInEnglish;
            this.originatorPhoto = builder.originatorPhoto;
            this.outResult = builder.outResult;
            this.outResultName = builder.outResultName;
            this.processInstanceId = builder.processInstanceId;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.taskType = builder.taskType;
            this.title = builder.title;
            this.titleInEnglish = builder.titleInEnglish;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return activeTimeGMT
         */
        public String getActiveTimeGMT() {
            return this.activeTimeGMT;
        }

        /**
         * @return actualActionerId
         */
        public String getActualActionerId() {
            return this.actualActionerId;
        }

        /**
         * @return appType
         */
        public String getAppType() {
            return this.appType;
        }

        /**
         * @return createTimeGMT
         */
        public String getCreateTimeGMT() {
            return this.createTimeGMT;
        }

        /**
         * @return finishTimeGMT
         */
        public String getFinishTimeGMT() {
            return this.finishTimeGMT;
        }

        /**
         * @return originatorEmail
         */
        public String getOriginatorEmail() {
            return this.originatorEmail;
        }

        /**
         * @return originatorId
         */
        public String getOriginatorId() {
            return this.originatorId;
        }

        /**
         * @return originatorName
         */
        public String getOriginatorName() {
            return this.originatorName;
        }

        /**
         * @return originatorNameInEnglish
         */
        public String getOriginatorNameInEnglish() {
            return this.originatorNameInEnglish;
        }

        /**
         * @return originatorNickName
         */
        public String getOriginatorNickName() {
            return this.originatorNickName;
        }

        /**
         * @return originatorNickNameEn
         */
        public String getOriginatorNickNameEn() {
            return this.originatorNickNameEn;
        }

        /**
         * @return originatorNickNameInEnglish
         */
        public String getOriginatorNickNameInEnglish() {
            return this.originatorNickNameInEnglish;
        }

        /**
         * @return originatorPhoto
         */
        public String getOriginatorPhoto() {
            return this.originatorPhoto;
        }

        /**
         * @return outResult
         */
        public String getOutResult() {
            return this.outResult;
        }

        /**
         * @return outResultName
         */
        public String getOutResultName() {
            return this.outResultName;
        }

        /**
         * @return processInstanceId
         */
        public String getProcessInstanceId() {
            return this.processInstanceId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return titleInEnglish
         */
        public String getTitleInEnglish() {
            return this.titleInEnglish;
        }

        public static final class Builder {
            private String activeTimeGMT; 
            private String actualActionerId; 
            private String appType; 
            private String createTimeGMT; 
            private String finishTimeGMT; 
            private String originatorEmail; 
            private String originatorId; 
            private String originatorName; 
            private String originatorNameInEnglish; 
            private String originatorNickName; 
            private String originatorNickNameEn; 
            private String originatorNickNameInEnglish; 
            private String originatorPhoto; 
            private String outResult; 
            private String outResultName; 
            private String processInstanceId; 
            private String status; 
            private String taskId; 
            private String taskType; 
            private String title; 
            private String titleInEnglish; 

            /**
             * ActiveTimeGMT.
             */
            public Builder activeTimeGMT(String activeTimeGMT) {
                this.activeTimeGMT = activeTimeGMT;
                return this;
            }

            /**
             * ActualActionerId.
             */
            public Builder actualActionerId(String actualActionerId) {
                this.actualActionerId = actualActionerId;
                return this;
            }

            /**
             * AppType.
             */
            public Builder appType(String appType) {
                this.appType = appType;
                return this;
            }

            /**
             * CreateTimeGMT.
             */
            public Builder createTimeGMT(String createTimeGMT) {
                this.createTimeGMT = createTimeGMT;
                return this;
            }

            /**
             * FinishTimeGMT.
             */
            public Builder finishTimeGMT(String finishTimeGMT) {
                this.finishTimeGMT = finishTimeGMT;
                return this;
            }

            /**
             * OriginatorEmail.
             */
            public Builder originatorEmail(String originatorEmail) {
                this.originatorEmail = originatorEmail;
                return this;
            }

            /**
             * OriginatorId.
             */
            public Builder originatorId(String originatorId) {
                this.originatorId = originatorId;
                return this;
            }

            /**
             * OriginatorName.
             */
            public Builder originatorName(String originatorName) {
                this.originatorName = originatorName;
                return this;
            }

            /**
             * OriginatorNameInEnglish.
             */
            public Builder originatorNameInEnglish(String originatorNameInEnglish) {
                this.originatorNameInEnglish = originatorNameInEnglish;
                return this;
            }

            /**
             * OriginatorNickName.
             */
            public Builder originatorNickName(String originatorNickName) {
                this.originatorNickName = originatorNickName;
                return this;
            }

            /**
             * OriginatorNickNameEn.
             */
            public Builder originatorNickNameEn(String originatorNickNameEn) {
                this.originatorNickNameEn = originatorNickNameEn;
                return this;
            }

            /**
             * OriginatorNickNameInEnglish.
             */
            public Builder originatorNickNameInEnglish(String originatorNickNameInEnglish) {
                this.originatorNickNameInEnglish = originatorNickNameInEnglish;
                return this;
            }

            /**
             * OriginatorPhoto.
             */
            public Builder originatorPhoto(String originatorPhoto) {
                this.originatorPhoto = originatorPhoto;
                return this;
            }

            /**
             * OutResult.
             */
            public Builder outResult(String outResult) {
                this.outResult = outResult;
                return this;
            }

            /**
             * OutResultName.
             */
            public Builder outResultName(String outResultName) {
                this.outResultName = outResultName;
                return this;
            }

            /**
             * ProcessInstanceId.
             */
            public Builder processInstanceId(String processInstanceId) {
                this.processInstanceId = processInstanceId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TaskType.
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * TitleInEnglish.
             */
            public Builder titleInEnglish(String titleInEnglish) {
                this.titleInEnglish = titleInEnglish;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
