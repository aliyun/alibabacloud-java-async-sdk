// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEmailVerificationResponseBody} extends {@link TeaModel}
 *
 * <p>ListEmailVerificationResponseBody</p>
 */
public class ListEmailVerificationResponseBody extends TeaModel {
    @NameInMap("CurrentPageNum")
    private Integer currentPageNum;

    @NameInMap("Data")
    private java.util.List < Data> data;

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

    private ListEmailVerificationResponseBody(Builder builder) {
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

    public static ListEmailVerificationResponseBody create() {
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
    public java.util.List < Data> getData() {
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
        private java.util.List < Data> data; 
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
        public Builder data(java.util.List < Data> data) {
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

        public ListEmailVerificationResponseBody build() {
            return new ListEmailVerificationResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("ConfirmIp")
        private String confirmIp;

        @NameInMap("Email")
        private String email;

        @NameInMap("EmailVerificationNo")
        private String emailVerificationNo;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("SendIp")
        private String sendIp;

        @NameInMap("TokenSendTime")
        private String tokenSendTime;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("VerificationStatus")
        private Integer verificationStatus;

        @NameInMap("VerificationTime")
        private String verificationTime;

        private Data(Builder builder) {
            this.confirmIp = builder.confirmIp;
            this.email = builder.email;
            this.emailVerificationNo = builder.emailVerificationNo;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.sendIp = builder.sendIp;
            this.tokenSendTime = builder.tokenSendTime;
            this.userId = builder.userId;
            this.verificationStatus = builder.verificationStatus;
            this.verificationTime = builder.verificationTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return confirmIp
         */
        public String getConfirmIp() {
            return this.confirmIp;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return emailVerificationNo
         */
        public String getEmailVerificationNo() {
            return this.emailVerificationNo;
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
         * @return sendIp
         */
        public String getSendIp() {
            return this.sendIp;
        }

        /**
         * @return tokenSendTime
         */
        public String getTokenSendTime() {
            return this.tokenSendTime;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return verificationStatus
         */
        public Integer getVerificationStatus() {
            return this.verificationStatus;
        }

        /**
         * @return verificationTime
         */
        public String getVerificationTime() {
            return this.verificationTime;
        }

        public static final class Builder {
            private String confirmIp; 
            private String email; 
            private String emailVerificationNo; 
            private String gmtCreate; 
            private String gmtModified; 
            private String sendIp; 
            private String tokenSendTime; 
            private String userId; 
            private Integer verificationStatus; 
            private String verificationTime; 

            /**
             * ConfirmIp.
             */
            public Builder confirmIp(String confirmIp) {
                this.confirmIp = confirmIp;
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
             * EmailVerificationNo.
             */
            public Builder emailVerificationNo(String emailVerificationNo) {
                this.emailVerificationNo = emailVerificationNo;
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
             * SendIp.
             */
            public Builder sendIp(String sendIp) {
                this.sendIp = sendIp;
                return this;
            }

            /**
             * TokenSendTime.
             */
            public Builder tokenSendTime(String tokenSendTime) {
                this.tokenSendTime = tokenSendTime;
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
             * VerificationStatus.
             */
            public Builder verificationStatus(Integer verificationStatus) {
                this.verificationStatus = verificationStatus;
                return this;
            }

            /**
             * VerificationTime.
             */
            public Builder verificationTime(String verificationTime) {
                this.verificationTime = verificationTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
