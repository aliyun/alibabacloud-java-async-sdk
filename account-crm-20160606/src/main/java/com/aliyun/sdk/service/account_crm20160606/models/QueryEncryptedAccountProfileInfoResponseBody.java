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
 * {@link QueryEncryptedAccountProfileInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryEncryptedAccountProfileInfoResponseBody</p>
 */
public class QueryEncryptedAccountProfileInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EncryptedProfileInfo")
    private EncryptedProfileInfo encryptedProfileInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryEncryptedAccountProfileInfoResponseBody(Builder builder) {
        this.encryptedProfileInfo = builder.encryptedProfileInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryEncryptedAccountProfileInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return encryptedProfileInfo
     */
    public EncryptedProfileInfo getEncryptedProfileInfo() {
        return this.encryptedProfileInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private EncryptedProfileInfo encryptedProfileInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QueryEncryptedAccountProfileInfoResponseBody model) {
            this.encryptedProfileInfo = model.encryptedProfileInfo;
            this.requestId = model.requestId;
        } 

        /**
         * EncryptedProfileInfo.
         */
        public Builder encryptedProfileInfo(EncryptedProfileInfo encryptedProfileInfo) {
            this.encryptedProfileInfo = encryptedProfileInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryEncryptedAccountProfileInfoResponseBody build() {
            return new QueryEncryptedAccountProfileInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryEncryptedAccountProfileInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryEncryptedAccountProfileInfoResponseBody</p>
     */
    public static class EncryptedProfileInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EncryptedAliyunID")
        private String encryptedAliyunID;

        @com.aliyun.core.annotation.NameInMap("EncryptedEmail")
        private String encryptedEmail;

        @com.aliyun.core.annotation.NameInMap("EncryptedMobile")
        private String encryptedMobile;

        @com.aliyun.core.annotation.NameInMap("EncryptedSecurityMobile")
        private String encryptedSecurityMobile;

        @com.aliyun.core.annotation.NameInMap("IsAliyunIdAnEmail")
        private Boolean isAliyunIdAnEmail;

        @com.aliyun.core.annotation.NameInMap("pk")
        private String pk;

        private EncryptedProfileInfo(Builder builder) {
            this.encryptedAliyunID = builder.encryptedAliyunID;
            this.encryptedEmail = builder.encryptedEmail;
            this.encryptedMobile = builder.encryptedMobile;
            this.encryptedSecurityMobile = builder.encryptedSecurityMobile;
            this.isAliyunIdAnEmail = builder.isAliyunIdAnEmail;
            this.pk = builder.pk;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EncryptedProfileInfo create() {
            return builder().build();
        }

        /**
         * @return encryptedAliyunID
         */
        public String getEncryptedAliyunID() {
            return this.encryptedAliyunID;
        }

        /**
         * @return encryptedEmail
         */
        public String getEncryptedEmail() {
            return this.encryptedEmail;
        }

        /**
         * @return encryptedMobile
         */
        public String getEncryptedMobile() {
            return this.encryptedMobile;
        }

        /**
         * @return encryptedSecurityMobile
         */
        public String getEncryptedSecurityMobile() {
            return this.encryptedSecurityMobile;
        }

        /**
         * @return isAliyunIdAnEmail
         */
        public Boolean getIsAliyunIdAnEmail() {
            return this.isAliyunIdAnEmail;
        }

        /**
         * @return pk
         */
        public String getPk() {
            return this.pk;
        }

        public static final class Builder {
            private String encryptedAliyunID; 
            private String encryptedEmail; 
            private String encryptedMobile; 
            private String encryptedSecurityMobile; 
            private Boolean isAliyunIdAnEmail; 
            private String pk; 

            private Builder() {
            } 

            private Builder(EncryptedProfileInfo model) {
                this.encryptedAliyunID = model.encryptedAliyunID;
                this.encryptedEmail = model.encryptedEmail;
                this.encryptedMobile = model.encryptedMobile;
                this.encryptedSecurityMobile = model.encryptedSecurityMobile;
                this.isAliyunIdAnEmail = model.isAliyunIdAnEmail;
                this.pk = model.pk;
            } 

            /**
             * EncryptedAliyunID.
             */
            public Builder encryptedAliyunID(String encryptedAliyunID) {
                this.encryptedAliyunID = encryptedAliyunID;
                return this;
            }

            /**
             * EncryptedEmail.
             */
            public Builder encryptedEmail(String encryptedEmail) {
                this.encryptedEmail = encryptedEmail;
                return this;
            }

            /**
             * EncryptedMobile.
             */
            public Builder encryptedMobile(String encryptedMobile) {
                this.encryptedMobile = encryptedMobile;
                return this;
            }

            /**
             * EncryptedSecurityMobile.
             */
            public Builder encryptedSecurityMobile(String encryptedSecurityMobile) {
                this.encryptedSecurityMobile = encryptedSecurityMobile;
                return this;
            }

            /**
             * IsAliyunIdAnEmail.
             */
            public Builder isAliyunIdAnEmail(Boolean isAliyunIdAnEmail) {
                this.isAliyunIdAnEmail = isAliyunIdAnEmail;
                return this;
            }

            /**
             * pk.
             */
            public Builder pk(String pk) {
                this.pk = pk;
                return this;
            }

            public EncryptedProfileInfo build() {
                return new EncryptedProfileInfo(this);
            } 

        } 

    }
}
