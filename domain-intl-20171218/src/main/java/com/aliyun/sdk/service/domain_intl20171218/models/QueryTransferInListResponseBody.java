// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain_intl20171218.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTransferInListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryTransferInListResponseBody</p>
 */
public class QueryTransferInListResponseBody extends TeaModel {
    @NameInMap("CurrentPageNum")
    private Integer currentPageNum;

    @NameInMap("Data")
    private Data data;

    @NameInMap("NextPage")
    private Boolean nextPage;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("PrePage")
    private Boolean prePage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalItemNum")
    private Integer totalItemNum;

    @NameInMap("TotalPageNum")
    private Integer totalPageNum;

    private QueryTransferInListResponseBody(Builder builder) {
        this.currentPageNum = builder.currentPageNum;
        this.data = builder.data;
        this.nextPage = builder.nextPage;
        this.pageSize = builder.pageSize;
        this.prePage = builder.prePage;
        this.requestId = builder.requestId;
        this.totalItemNum = builder.totalItemNum;
        this.totalPageNum = builder.totalPageNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTransferInListResponseBody create() {
        return builder().build();
    }

    /**
     * @return currentPageNum
     */
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return nextPage
     */
    public Boolean getNextPage() {
        return this.nextPage;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return prePage
     */
    public Boolean getPrePage() {
        return this.prePage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalItemNum
     */
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    /**
     * @return totalPageNum
     */
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static final class Builder {
        private Integer currentPageNum; 
        private Data data; 
        private Boolean nextPage; 
        private Integer pageSize; 
        private Boolean prePage; 
        private String requestId; 
        private Integer totalItemNum; 
        private Integer totalPageNum; 

        /**
         * CurrentPageNum.
         */
        public Builder currentPageNum(Integer currentPageNum) {
            this.currentPageNum = currentPageNum;
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
         * NextPage.
         */
        public Builder nextPage(Boolean nextPage) {
            this.nextPage = nextPage;
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
         * PrePage.
         */
        public Builder prePage(Boolean prePage) {
            this.prePage = prePage;
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
         * TotalItemNum.
         */
        public Builder totalItemNum(Integer totalItemNum) {
            this.totalItemNum = totalItemNum;
            return this;
        }

        /**
         * TotalPageNum.
         */
        public Builder totalPageNum(Integer totalPageNum) {
            this.totalPageNum = totalPageNum;
            return this;
        }

        public QueryTransferInListResponseBody build() {
            return new QueryTransferInListResponseBody(this);
        } 

    } 

    public static class TransferInInfo extends TeaModel {
        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("Email")
        private String email;

        @NameInMap("ExpirationDate")
        private String expirationDate;

        @NameInMap("ExpirationDateLong")
        private Long expirationDateLong;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("ModificationDate")
        private String modificationDate;

        @NameInMap("ModificationDateLong")
        private Long modificationDateLong;

        @NameInMap("NeedMailCheck")
        private Boolean needMailCheck;

        @NameInMap("ProgressBarType")
        private Integer progressBarType;

        @NameInMap("ResultCode")
        private String resultCode;

        @NameInMap("ResultDate")
        private String resultDate;

        @NameInMap("ResultDateLong")
        private Long resultDateLong;

        @NameInMap("ResultMsg")
        private String resultMsg;

        @NameInMap("SimpleTransferInStatus")
        private String simpleTransferInStatus;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("SubmissionDate")
        private String submissionDate;

        @NameInMap("SubmissionDateLong")
        private Long submissionDateLong;

        @NameInMap("TransferAuthorizationCodeSubmissionDate")
        private String transferAuthorizationCodeSubmissionDate;

        @NameInMap("TransferAuthorizationCodeSubmissionDateLong")
        private Long transferAuthorizationCodeSubmissionDateLong;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("WhoisMailStatus")
        private Boolean whoisMailStatus;

        private TransferInInfo(Builder builder) {
            this.domainName = builder.domainName;
            this.email = builder.email;
            this.expirationDate = builder.expirationDate;
            this.expirationDateLong = builder.expirationDateLong;
            this.instanceId = builder.instanceId;
            this.modificationDate = builder.modificationDate;
            this.modificationDateLong = builder.modificationDateLong;
            this.needMailCheck = builder.needMailCheck;
            this.progressBarType = builder.progressBarType;
            this.resultCode = builder.resultCode;
            this.resultDate = builder.resultDate;
            this.resultDateLong = builder.resultDateLong;
            this.resultMsg = builder.resultMsg;
            this.simpleTransferInStatus = builder.simpleTransferInStatus;
            this.status = builder.status;
            this.submissionDate = builder.submissionDate;
            this.submissionDateLong = builder.submissionDateLong;
            this.transferAuthorizationCodeSubmissionDate = builder.transferAuthorizationCodeSubmissionDate;
            this.transferAuthorizationCodeSubmissionDateLong = builder.transferAuthorizationCodeSubmissionDateLong;
            this.userId = builder.userId;
            this.whoisMailStatus = builder.whoisMailStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransferInInfo create() {
            return builder().build();
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return expirationDate
         */
        public String getExpirationDate() {
            return this.expirationDate;
        }

        /**
         * @return expirationDateLong
         */
        public Long getExpirationDateLong() {
            return this.expirationDateLong;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return modificationDate
         */
        public String getModificationDate() {
            return this.modificationDate;
        }

        /**
         * @return modificationDateLong
         */
        public Long getModificationDateLong() {
            return this.modificationDateLong;
        }

        /**
         * @return needMailCheck
         */
        public Boolean getNeedMailCheck() {
            return this.needMailCheck;
        }

        /**
         * @return progressBarType
         */
        public Integer getProgressBarType() {
            return this.progressBarType;
        }

        /**
         * @return resultCode
         */
        public String getResultCode() {
            return this.resultCode;
        }

        /**
         * @return resultDate
         */
        public String getResultDate() {
            return this.resultDate;
        }

        /**
         * @return resultDateLong
         */
        public Long getResultDateLong() {
            return this.resultDateLong;
        }

        /**
         * @return resultMsg
         */
        public String getResultMsg() {
            return this.resultMsg;
        }

        /**
         * @return simpleTransferInStatus
         */
        public String getSimpleTransferInStatus() {
            return this.simpleTransferInStatus;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return submissionDate
         */
        public String getSubmissionDate() {
            return this.submissionDate;
        }

        /**
         * @return submissionDateLong
         */
        public Long getSubmissionDateLong() {
            return this.submissionDateLong;
        }

        /**
         * @return transferAuthorizationCodeSubmissionDate
         */
        public String getTransferAuthorizationCodeSubmissionDate() {
            return this.transferAuthorizationCodeSubmissionDate;
        }

        /**
         * @return transferAuthorizationCodeSubmissionDateLong
         */
        public Long getTransferAuthorizationCodeSubmissionDateLong() {
            return this.transferAuthorizationCodeSubmissionDateLong;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return whoisMailStatus
         */
        public Boolean getWhoisMailStatus() {
            return this.whoisMailStatus;
        }

        public static final class Builder {
            private String domainName; 
            private String email; 
            private String expirationDate; 
            private Long expirationDateLong; 
            private String instanceId; 
            private String modificationDate; 
            private Long modificationDateLong; 
            private Boolean needMailCheck; 
            private Integer progressBarType; 
            private String resultCode; 
            private String resultDate; 
            private Long resultDateLong; 
            private String resultMsg; 
            private String simpleTransferInStatus; 
            private Integer status; 
            private String submissionDate; 
            private Long submissionDateLong; 
            private String transferAuthorizationCodeSubmissionDate; 
            private Long transferAuthorizationCodeSubmissionDateLong; 
            private String userId; 
            private Boolean whoisMailStatus; 

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * ExpirationDate.
             */
            public Builder expirationDate(String expirationDate) {
                this.expirationDate = expirationDate;
                return this;
            }

            /**
             * ExpirationDateLong.
             */
            public Builder expirationDateLong(Long expirationDateLong) {
                this.expirationDateLong = expirationDateLong;
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
             * ModificationDate.
             */
            public Builder modificationDate(String modificationDate) {
                this.modificationDate = modificationDate;
                return this;
            }

            /**
             * ModificationDateLong.
             */
            public Builder modificationDateLong(Long modificationDateLong) {
                this.modificationDateLong = modificationDateLong;
                return this;
            }

            /**
             * NeedMailCheck.
             */
            public Builder needMailCheck(Boolean needMailCheck) {
                this.needMailCheck = needMailCheck;
                return this;
            }

            /**
             * ProgressBarType.
             */
            public Builder progressBarType(Integer progressBarType) {
                this.progressBarType = progressBarType;
                return this;
            }

            /**
             * ResultCode.
             */
            public Builder resultCode(String resultCode) {
                this.resultCode = resultCode;
                return this;
            }

            /**
             * ResultDate.
             */
            public Builder resultDate(String resultDate) {
                this.resultDate = resultDate;
                return this;
            }

            /**
             * ResultDateLong.
             */
            public Builder resultDateLong(Long resultDateLong) {
                this.resultDateLong = resultDateLong;
                return this;
            }

            /**
             * ResultMsg.
             */
            public Builder resultMsg(String resultMsg) {
                this.resultMsg = resultMsg;
                return this;
            }

            /**
             * SimpleTransferInStatus.
             */
            public Builder simpleTransferInStatus(String simpleTransferInStatus) {
                this.simpleTransferInStatus = simpleTransferInStatus;
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
             * SubmissionDate.
             */
            public Builder submissionDate(String submissionDate) {
                this.submissionDate = submissionDate;
                return this;
            }

            /**
             * SubmissionDateLong.
             */
            public Builder submissionDateLong(Long submissionDateLong) {
                this.submissionDateLong = submissionDateLong;
                return this;
            }

            /**
             * TransferAuthorizationCodeSubmissionDate.
             */
            public Builder transferAuthorizationCodeSubmissionDate(String transferAuthorizationCodeSubmissionDate) {
                this.transferAuthorizationCodeSubmissionDate = transferAuthorizationCodeSubmissionDate;
                return this;
            }

            /**
             * TransferAuthorizationCodeSubmissionDateLong.
             */
            public Builder transferAuthorizationCodeSubmissionDateLong(Long transferAuthorizationCodeSubmissionDateLong) {
                this.transferAuthorizationCodeSubmissionDateLong = transferAuthorizationCodeSubmissionDateLong;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * WhoisMailStatus.
             */
            public Builder whoisMailStatus(Boolean whoisMailStatus) {
                this.whoisMailStatus = whoisMailStatus;
                return this;
            }

            public TransferInInfo build() {
                return new TransferInInfo(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("TransferInInfo")
        private java.util.List < TransferInInfo> transferInInfo;

        private Data(Builder builder) {
            this.transferInInfo = builder.transferInInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return transferInInfo
         */
        public java.util.List < TransferInInfo> getTransferInInfo() {
            return this.transferInInfo;
        }

        public static final class Builder {
            private java.util.List < TransferInInfo> transferInInfo; 

            /**
             * TransferInInfo.
             */
            public Builder transferInInfo(java.util.List < TransferInInfo> transferInInfo) {
                this.transferInInfo = transferInInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
