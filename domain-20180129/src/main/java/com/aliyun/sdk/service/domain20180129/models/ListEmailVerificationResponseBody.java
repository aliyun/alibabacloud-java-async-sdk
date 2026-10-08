// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

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
 * {@link ListEmailVerificationResponseBody} extends {@link TeaModel}
 *
 * <p>ListEmailVerificationResponseBody</p>
 */
public class ListEmailVerificationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPageNum")
    private Integer currentPageNum;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("NextPage")
    private Boolean nextPage;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("PrePage")
    private Boolean prePage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalItemNum")
    private Integer totalItemNum;

    @com.aliyun.core.annotation.NameInMap("TotalPageNum")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private Boolean nextPage; 
        private Integer pageSize; 
        private Boolean prePage; 
        private String requestId; 
        private Integer totalItemNum; 
        private Integer totalPageNum; 

        private Builder() {
        } 

        private Builder(ListEmailVerificationResponseBody model) {
            this.currentPageNum = model.currentPageNum;
            this.data = model.data;
            this.nextPage = model.nextPage;
            this.pageSize = model.pageSize;
            this.prePage = model.prePage;
            this.requestId = model.requestId;
            this.totalItemNum = model.totalItemNum;
            this.totalPageNum = model.totalPageNum;
        } 

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPageNum(Integer currentPageNum) {
            this.currentPageNum = currentPageNum;
            return this;
        }

        /**
         * <p>The email verification list.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Indicates whether there is a next page.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder nextPage(Boolean nextPage) {
            this.nextPage = nextPage;
            return this;
        }

        /**
         * <p>The paging size.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Indicates whether a previous page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder prePage(Boolean prePage) {
            this.prePage = prePage;
            return this;
        }

        /**
         * <p>The unique request access token.</p>
         * 
         * <strong>example:</strong>
         * <p>78C60CC3-FF0A-44E2-989A-DDE0597791C3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total number of domain records.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalItemNum(Integer totalItemNum) {
            this.totalItemNum = totalItemNum;
            return this;
        }

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalPageNum(Integer totalPageNum) {
            this.totalPageNum = totalPageNum;
            return this;
        }

        public ListEmailVerificationResponseBody build() {
            return new ListEmailVerificationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEmailVerificationResponseBody} extends {@link TeaModel}
     *
     * <p>ListEmailVerificationResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfirmIp")
        private String confirmIp;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("EmailVerificationNo")
        private String emailVerificationNo;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("SendIp")
        private String sendIp;

        @com.aliyun.core.annotation.NameInMap("TokenSendTime")
        private String tokenSendTime;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("VerificationStatus")
        private Integer verificationStatus;

        @com.aliyun.core.annotation.NameInMap("VerificationTime")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.confirmIp = model.confirmIp;
                this.email = model.email;
                this.emailVerificationNo = model.emailVerificationNo;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.sendIp = model.sendIp;
                this.tokenSendTime = model.tokenSendTime;
                this.userId = model.userId;
                this.verificationStatus = model.verificationStatus;
                this.verificationTime = model.verificationTime;
            } 

            /**
             * <p>The IP address of the computer that completed the email verification.</p>
             * 
             * <strong>example:</strong>
             * <p>127.0.0.1</p>
             */
            public Builder confirmIp(String confirmIp) {
                this.confirmIp = confirmIp;
                return this;
            }

            /**
             * <p>The email address used for verification.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:username@example.com">username@example.com</a></p>
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * <p>The email verification number (by default, a serial number automatically generated by the system).</p>
             * 
             * <strong>example:</strong>
             * <p>00000a21fd374da99d9c95b48500000</p>
             */
            public Builder emailVerificationNo(String emailVerificationNo) {
                this.emailVerificationNo = emailVerificationNo;
                return this;
            }

            /**
             * <p>The Creation Time of the database record.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-12-25 03:38:46</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The Update Time of the database record.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-12-25 03:41:11</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The IP address from which the user initiated the email verification.</p>
             * 
             * <strong>example:</strong>
             * <p>127.0.0.1</p>
             */
            public Builder sendIp(String sendIp) {
                this.sendIp = sendIp;
                return this;
            }

            /**
             * <p>The sending time of the email verification token.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-12-25 03:38:46</p>
             */
            public Builder tokenSendTime(String tokenSendTime) {
                this.tokenSendTime = tokenSendTime;
                return this;
            }

            /**
             * <p>The User ID.</p>
             * 
             * <strong>example:</strong>
             * <p>0000</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The email verification status. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Waiting for verification.</li>
             * <li><strong>1</strong>: Verification succeeded.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder verificationStatus(Integer verificationStatus) {
                this.verificationStatus = verificationStatus;
                return this;
            }

            /**
             * <p>The exact time when the email verification was completed.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-12-25 03:41:11</p>
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
