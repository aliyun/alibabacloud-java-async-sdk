// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link AuthAndActiveWithHidResponseBody} extends {@link TeaModel}
 *
 * <p>AuthAndActiveWithHidResponseBody</p>
 */
public class AuthAndActiveWithHidResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AuthAndActiveWithHidResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuthAndActiveWithHidResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return msg
     */
    public String getMsg() {
        return this.msg;
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
        private String msg; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(AuthAndActiveWithHidResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.msg = model.msg;
            this.requestId = model.requestId;
        } 

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
         * Msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AuthAndActiveWithHidResponseBody build() {
            return new AuthAndActiveWithHidResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AuthAndActiveWithHidResponseBody} extends {@link TeaModel}
     *
     * <p>AuthAndActiveWithHidResponseBody</p>
     */
    public static class AccountModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunId")
        private String aliyunId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("HavanaId")
        private Long havanaId;

        @com.aliyun.core.annotation.NameInMap("Mobile")
        private String mobile;

        @com.aliyun.core.annotation.NameInMap("PK")
        private String pk;

        private AccountModel(Builder builder) {
            this.aliyunId = builder.aliyunId;
            this.createTime = builder.createTime;
            this.email = builder.email;
            this.havanaId = builder.havanaId;
            this.mobile = builder.mobile;
            this.pk = builder.pk;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountModel create() {
            return builder().build();
        }

        /**
         * @return aliyunId
         */
        public String getAliyunId() {
            return this.aliyunId;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return havanaId
         */
        public Long getHavanaId() {
            return this.havanaId;
        }

        /**
         * @return mobile
         */
        public String getMobile() {
            return this.mobile;
        }

        /**
         * @return pk
         */
        public String getPk() {
            return this.pk;
        }

        public static final class Builder {
            private String aliyunId; 
            private Long createTime; 
            private String email; 
            private Long havanaId; 
            private String mobile; 
            private String pk; 

            private Builder() {
            } 

            private Builder(AccountModel model) {
                this.aliyunId = model.aliyunId;
                this.createTime = model.createTime;
                this.email = model.email;
                this.havanaId = model.havanaId;
                this.mobile = model.mobile;
                this.pk = model.pk;
            } 

            /**
             * AliyunId.
             */
            public Builder aliyunId(String aliyunId) {
                this.aliyunId = aliyunId;
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
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * HavanaId.
             */
            public Builder havanaId(Long havanaId) {
                this.havanaId = havanaId;
                return this;
            }

            /**
             * Mobile.
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * PK.
             */
            public Builder pk(String pk) {
                this.pk = pk;
                return this;
            }

            public AccountModel build() {
                return new AccountModel(this);
            } 

        } 

    }
    /**
     * 
     * {@link AuthAndActiveWithHidResponseBody} extends {@link TeaModel}
     *
     * <p>AuthAndActiveWithHidResponseBody</p>
     */
    public static class SessionModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunPK")
        private String aliyunPK;

        @com.aliyun.core.annotation.NameInMap("LoginTicket")
        private String loginTicket;

        private SessionModel(Builder builder) {
            this.aliyunPK = builder.aliyunPK;
            this.loginTicket = builder.loginTicket;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SessionModel create() {
            return builder().build();
        }

        /**
         * @return aliyunPK
         */
        public String getAliyunPK() {
            return this.aliyunPK;
        }

        /**
         * @return loginTicket
         */
        public String getLoginTicket() {
            return this.loginTicket;
        }

        public static final class Builder {
            private String aliyunPK; 
            private String loginTicket; 

            private Builder() {
            } 

            private Builder(SessionModel model) {
                this.aliyunPK = model.aliyunPK;
                this.loginTicket = model.loginTicket;
            } 

            /**
             * AliyunPK.
             */
            public Builder aliyunPK(String aliyunPK) {
                this.aliyunPK = aliyunPK;
                return this;
            }

            /**
             * LoginTicket.
             */
            public Builder loginTicket(String loginTicket) {
                this.loginTicket = loginTicket;
                return this;
            }

            public SessionModel build() {
                return new SessionModel(this);
            } 

        } 

    }
    /**
     * 
     * {@link AuthAndActiveWithHidResponseBody} extends {@link TeaModel}
     *
     * <p>AuthAndActiveWithHidResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountModel")
        private AccountModel accountModel;

        @com.aliyun.core.annotation.NameInMap("SessionModel")
        private SessionModel sessionModel;

        private Data(Builder builder) {
            this.accountModel = builder.accountModel;
            this.sessionModel = builder.sessionModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accountModel
         */
        public AccountModel getAccountModel() {
            return this.accountModel;
        }

        /**
         * @return sessionModel
         */
        public SessionModel getSessionModel() {
            return this.sessionModel;
        }

        public static final class Builder {
            private AccountModel accountModel; 
            private SessionModel sessionModel; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accountModel = model.accountModel;
                this.sessionModel = model.sessionModel;
            } 

            /**
             * AccountModel.
             */
            public Builder accountModel(AccountModel accountModel) {
                this.accountModel = accountModel;
                return this;
            }

            /**
             * SessionModel.
             */
            public Builder sessionModel(SessionModel sessionModel) {
                this.sessionModel = sessionModel;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
