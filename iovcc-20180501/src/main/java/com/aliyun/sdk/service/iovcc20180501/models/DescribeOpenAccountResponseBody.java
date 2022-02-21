// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOpenAccountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOpenAccountResponseBody</p>
 */
public class DescribeOpenAccountResponseBody extends TeaModel {
    @NameInMap("OpenAccount")
    private OpenAccount openAccount;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeOpenAccountResponseBody(Builder builder) {
        this.openAccount = builder.openAccount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOpenAccountResponseBody create() {
        return builder().build();
    }

    /**
     * @return openAccount
     */
    public OpenAccount getOpenAccount() {
        return this.openAccount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private OpenAccount openAccount; 
        private String requestId; 

        /**
         * OpenAccount.
         */
        public Builder openAccount(OpenAccount openAccount) {
            this.openAccount = openAccount;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeOpenAccountResponseBody build() {
            return new DescribeOpenAccountResponseBody(this);
        } 

    } 

    public static class OpenAccount extends TeaModel {
        @NameInMap("AliyunId")
        private String aliyunId;

        @NameInMap("CreateAccessKey")
        private String createAccessKey;

        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("IdentityId")
        private String identityId;

        @NameInMap("Idp")
        private String idp;

        @NameInMap("LoginId")
        private String loginId;

        @NameInMap("Mobile")
        private String mobile;

        @NameInMap("OpenId")
        private String openId;

        @NameInMap("Region")
        private String region;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Type")
        private Integer type;

        private OpenAccount(Builder builder) {
            this.aliyunId = builder.aliyunId;
            this.createAccessKey = builder.createAccessKey;
            this.displayName = builder.displayName;
            this.identityId = builder.identityId;
            this.idp = builder.idp;
            this.loginId = builder.loginId;
            this.mobile = builder.mobile;
            this.openId = builder.openId;
            this.region = builder.region;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OpenAccount create() {
            return builder().build();
        }

        /**
         * @return aliyunId
         */
        public String getAliyunId() {
            return this.aliyunId;
        }

        /**
         * @return createAccessKey
         */
        public String getCreateAccessKey() {
            return this.createAccessKey;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return identityId
         */
        public String getIdentityId() {
            return this.identityId;
        }

        /**
         * @return idp
         */
        public String getIdp() {
            return this.idp;
        }

        /**
         * @return loginId
         */
        public String getLoginId() {
            return this.loginId;
        }

        /**
         * @return mobile
         */
        public String getMobile() {
            return this.mobile;
        }

        /**
         * @return openId
         */
        public String getOpenId() {
            return this.openId;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private String aliyunId; 
            private String createAccessKey; 
            private String displayName; 
            private String identityId; 
            private String idp; 
            private String loginId; 
            private String mobile; 
            private String openId; 
            private String region; 
            private Integer status; 
            private Integer type; 

            /**
             * AliyunId.
             */
            public Builder aliyunId(String aliyunId) {
                this.aliyunId = aliyunId;
                return this;
            }

            /**
             * CreateAccessKey.
             */
            public Builder createAccessKey(String createAccessKey) {
                this.createAccessKey = createAccessKey;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * IdentityId.
             */
            public Builder identityId(String identityId) {
                this.identityId = identityId;
                return this;
            }

            /**
             * Idp.
             */
            public Builder idp(String idp) {
                this.idp = idp;
                return this;
            }

            /**
             * LoginId.
             */
            public Builder loginId(String loginId) {
                this.loginId = loginId;
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
             * OpenId.
             */
            public Builder openId(String openId) {
                this.openId = openId;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
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
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public OpenAccount build() {
                return new OpenAccount(this);
            } 

        } 

    }
}
