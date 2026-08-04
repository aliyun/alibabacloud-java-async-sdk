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
 * {@link RegisterInternalAccountForBucResponseBody} extends {@link TeaModel}
 *
 * <p>RegisterInternalAccountForBucResponseBody</p>
 */
public class RegisterInternalAccountForBucResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("LocalizedMessage")
    private String localizedMessage;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RegisterInternalAccountForBucResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.localizedMessage = builder.localizedMessage;
        this.message = builder.message;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterInternalAccountForBucResponseBody create() {
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
     * @return localizedMessage
     */
    public String getLocalizedMessage() {
        return this.localizedMessage;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private String localizedMessage; 
        private String message; 
        private String msg; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(RegisterInternalAccountForBucResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.localizedMessage = model.localizedMessage;
            this.message = model.message;
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
         * LocalizedMessage.
         */
        public Builder localizedMessage(String localizedMessage) {
            this.localizedMessage = localizedMessage;
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

        public RegisterInternalAccountForBucResponseBody build() {
            return new RegisterInternalAccountForBucResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RegisterInternalAccountForBucResponseBody} extends {@link TeaModel}
     *
     * <p>RegisterInternalAccountForBucResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountStatus")
        private String accountStatus;

        @com.aliyun.core.annotation.NameInMap("AccountStructure")
        private String accountStructure;

        @com.aliyun.core.annotation.NameInMap("ExtendInfo")
        private String extendInfo;

        @com.aliyun.core.annotation.NameInMap("HavanaId")
        private String havanaId;

        @com.aliyun.core.annotation.NameInMap("LastLoginTime")
        private String lastLoginTime;

        @com.aliyun.core.annotation.NameInMap("OwnerBid")
        private String ownerBid;

        @com.aliyun.core.annotation.NameInMap("ParentPk")
        private String parentPk;

        @com.aliyun.core.annotation.NameInMap("PartnerPk")
        private String partnerPk;

        @com.aliyun.core.annotation.NameInMap("Pk")
        private String pk;

        @com.aliyun.core.annotation.NameInMap("Site")
        private String site;

        private Data(Builder builder) {
            this.accountStatus = builder.accountStatus;
            this.accountStructure = builder.accountStructure;
            this.extendInfo = builder.extendInfo;
            this.havanaId = builder.havanaId;
            this.lastLoginTime = builder.lastLoginTime;
            this.ownerBid = builder.ownerBid;
            this.parentPk = builder.parentPk;
            this.partnerPk = builder.partnerPk;
            this.pk = builder.pk;
            this.site = builder.site;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accountStatus
         */
        public String getAccountStatus() {
            return this.accountStatus;
        }

        /**
         * @return accountStructure
         */
        public String getAccountStructure() {
            return this.accountStructure;
        }

        /**
         * @return extendInfo
         */
        public String getExtendInfo() {
            return this.extendInfo;
        }

        /**
         * @return havanaId
         */
        public String getHavanaId() {
            return this.havanaId;
        }

        /**
         * @return lastLoginTime
         */
        public String getLastLoginTime() {
            return this.lastLoginTime;
        }

        /**
         * @return ownerBid
         */
        public String getOwnerBid() {
            return this.ownerBid;
        }

        /**
         * @return parentPk
         */
        public String getParentPk() {
            return this.parentPk;
        }

        /**
         * @return partnerPk
         */
        public String getPartnerPk() {
            return this.partnerPk;
        }

        /**
         * @return pk
         */
        public String getPk() {
            return this.pk;
        }

        /**
         * @return site
         */
        public String getSite() {
            return this.site;
        }

        public static final class Builder {
            private String accountStatus; 
            private String accountStructure; 
            private String extendInfo; 
            private String havanaId; 
            private String lastLoginTime; 
            private String ownerBid; 
            private String parentPk; 
            private String partnerPk; 
            private String pk; 
            private String site; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accountStatus = model.accountStatus;
                this.accountStructure = model.accountStructure;
                this.extendInfo = model.extendInfo;
                this.havanaId = model.havanaId;
                this.lastLoginTime = model.lastLoginTime;
                this.ownerBid = model.ownerBid;
                this.parentPk = model.parentPk;
                this.partnerPk = model.partnerPk;
                this.pk = model.pk;
                this.site = model.site;
            } 

            /**
             * AccountStatus.
             */
            public Builder accountStatus(String accountStatus) {
                this.accountStatus = accountStatus;
                return this;
            }

            /**
             * AccountStructure.
             */
            public Builder accountStructure(String accountStructure) {
                this.accountStructure = accountStructure;
                return this;
            }

            /**
             * ExtendInfo.
             */
            public Builder extendInfo(String extendInfo) {
                this.extendInfo = extendInfo;
                return this;
            }

            /**
             * HavanaId.
             */
            public Builder havanaId(String havanaId) {
                this.havanaId = havanaId;
                return this;
            }

            /**
             * LastLoginTime.
             */
            public Builder lastLoginTime(String lastLoginTime) {
                this.lastLoginTime = lastLoginTime;
                return this;
            }

            /**
             * OwnerBid.
             */
            public Builder ownerBid(String ownerBid) {
                this.ownerBid = ownerBid;
                return this;
            }

            /**
             * ParentPk.
             */
            public Builder parentPk(String parentPk) {
                this.parentPk = parentPk;
                return this;
            }

            /**
             * PartnerPk.
             */
            public Builder partnerPk(String partnerPk) {
                this.partnerPk = partnerPk;
                return this;
            }

            /**
             * Pk.
             */
            public Builder pk(String pk) {
                this.pk = pk;
                return this;
            }

            /**
             * Site.
             */
            public Builder site(String site) {
                this.site = site;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
