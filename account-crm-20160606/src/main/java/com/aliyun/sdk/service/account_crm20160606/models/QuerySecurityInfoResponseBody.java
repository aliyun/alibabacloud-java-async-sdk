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
 * {@link QuerySecurityInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySecurityInfoResponseBody</p>
 */
public class QuerySecurityInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccountSecurityInfoDto")
    private AccountSecurityInfoDto accountSecurityInfoDto;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QuerySecurityInfoResponseBody(Builder builder) {
        this.accountSecurityInfoDto = builder.accountSecurityInfoDto;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySecurityInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountSecurityInfoDto
     */
    public AccountSecurityInfoDto getAccountSecurityInfoDto() {
        return this.accountSecurityInfoDto;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
        private AccountSecurityInfoDto accountSecurityInfoDto; 
        private String code; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QuerySecurityInfoResponseBody model) {
            this.accountSecurityInfoDto = model.accountSecurityInfoDto;
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * AccountSecurityInfoDto.
         */
        public Builder accountSecurityInfoDto(AccountSecurityInfoDto accountSecurityInfoDto) {
            this.accountSecurityInfoDto = accountSecurityInfoDto;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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

        public QuerySecurityInfoResponseBody build() {
            return new QuerySecurityInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySecurityInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySecurityInfoResponseBody</p>
     */
    public static class AccountSecurityInfoDto extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunId")
        private String aliyunId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NationalityCode")
        private String nationalityCode;

        @com.aliyun.core.annotation.NameInMap("Pk")
        private String pk;

        @com.aliyun.core.annotation.NameInMap("ProfileType")
        private String profileType;

        @com.aliyun.core.annotation.NameInMap("SecurityEmail")
        private String securityEmail;

        @com.aliyun.core.annotation.NameInMap("SecurityMobile")
        private String securityMobile;

        private AccountSecurityInfoDto(Builder builder) {
            this.aliyunId = builder.aliyunId;
            this.name = builder.name;
            this.nationalityCode = builder.nationalityCode;
            this.pk = builder.pk;
            this.profileType = builder.profileType;
            this.securityEmail = builder.securityEmail;
            this.securityMobile = builder.securityMobile;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountSecurityInfoDto create() {
            return builder().build();
        }

        /**
         * @return aliyunId
         */
        public String getAliyunId() {
            return this.aliyunId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nationalityCode
         */
        public String getNationalityCode() {
            return this.nationalityCode;
        }

        /**
         * @return pk
         */
        public String getPk() {
            return this.pk;
        }

        /**
         * @return profileType
         */
        public String getProfileType() {
            return this.profileType;
        }

        /**
         * @return securityEmail
         */
        public String getSecurityEmail() {
            return this.securityEmail;
        }

        /**
         * @return securityMobile
         */
        public String getSecurityMobile() {
            return this.securityMobile;
        }

        public static final class Builder {
            private String aliyunId; 
            private String name; 
            private String nationalityCode; 
            private String pk; 
            private String profileType; 
            private String securityEmail; 
            private String securityMobile; 

            private Builder() {
            } 

            private Builder(AccountSecurityInfoDto model) {
                this.aliyunId = model.aliyunId;
                this.name = model.name;
                this.nationalityCode = model.nationalityCode;
                this.pk = model.pk;
                this.profileType = model.profileType;
                this.securityEmail = model.securityEmail;
                this.securityMobile = model.securityMobile;
            } 

            /**
             * AliyunId.
             */
            public Builder aliyunId(String aliyunId) {
                this.aliyunId = aliyunId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NationalityCode.
             */
            public Builder nationalityCode(String nationalityCode) {
                this.nationalityCode = nationalityCode;
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
             * ProfileType.
             */
            public Builder profileType(String profileType) {
                this.profileType = profileType;
                return this;
            }

            /**
             * SecurityEmail.
             */
            public Builder securityEmail(String securityEmail) {
                this.securityEmail = securityEmail;
                return this;
            }

            /**
             * SecurityMobile.
             */
            public Builder securityMobile(String securityMobile) {
                this.securityMobile = securityMobile;
                return this;
            }

            public AccountSecurityInfoDto build() {
                return new AccountSecurityInfoDto(this);
            } 

        } 

    }
}
