// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCorpAccomplishmentTasksResponseBody} extends {@link TeaModel}
 *
 * <p>GetCorpAccomplishmentTasksResponseBody</p>
 */
public class GetCorpAccomplishmentTasksResponseBody extends TeaModel {
    @NameInMap("data")
    private java.util.List < Data> data;

    @NameInMap("pageNumber")
    private Long pageNumber;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("totalCount")
    private Long totalCount;

    @NameInMap("vendorRequestId")
    private String vendorRequestId;

    @NameInMap("vendorType")
    private String vendorType;

    private GetCorpAccomplishmentTasksResponseBody(Builder builder) {
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

    public static GetCorpAccomplishmentTasksResponseBody create() {
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

        public GetCorpAccomplishmentTasksResponseBody build() {
            return new GetCorpAccomplishmentTasksResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("ActiveTimeGMT")
        private String activeTimeGMT;

        @NameInMap("ActualActionerId")
        private String actualActionerId;

        @NameInMap("AppType")
        private String appType;

        @NameInMap("CreateTimeGMT")
        private String createTimeGMT;

        @NameInMap("FinishTimeGMT")
        private String finishTimeGMT;

        @NameInMap("OriginatorEmail")
        private String originatorEmail;

        @NameInMap("OriginatorId")
        private String originatorId;

        @NameInMap("OriginatorName")
        private String originatorName;

        @NameInMap("OriginatorNameInEnglish")
        private String originatorNameInEnglish;

        @NameInMap("OriginatorNickName")
        private String originatorNickName;

        @NameInMap("OriginatorNickNameInEnglish")
        private String originatorNickNameInEnglish;

        @NameInMap("OriginatorPhoto")
        private String originatorPhoto;

        @NameInMap("OutResult")
        private String outResult;

        @NameInMap("OutResultName")
        private String outResultName;

        @NameInMap("ProcessInstanceId")
        private String processInstanceId;

        @NameInMap("Title")
        private String title;

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
            this.originatorNickNameInEnglish = builder.originatorNickNameInEnglish;
            this.originatorPhoto = builder.originatorPhoto;
            this.outResult = builder.outResult;
            this.outResultName = builder.outResultName;
            this.processInstanceId = builder.processInstanceId;
            this.title = builder.title;
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
         * @return title
         */
        public String getTitle() {
            return this.title;
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
            private String originatorNickNameInEnglish; 
            private String originatorPhoto; 
            private String outResult; 
            private String outResultName; 
            private String processInstanceId; 
            private String title; 

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
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
