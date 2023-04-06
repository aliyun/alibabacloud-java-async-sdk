// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPasswordComplexityConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>GetPasswordComplexityConfigurationResponseBody</p>
 */
public class GetPasswordComplexityConfigurationResponseBody extends TeaModel {
    @NameInMap("PasswordComplexityConfiguration")
    private PasswordComplexityConfiguration passwordComplexityConfiguration;

    @NameInMap("RequestId")
    private String requestId;

    private GetPasswordComplexityConfigurationResponseBody(Builder builder) {
        this.passwordComplexityConfiguration = builder.passwordComplexityConfiguration;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPasswordComplexityConfigurationResponseBody create() {
        return builder().build();
    }

    /**
     * @return passwordComplexityConfiguration
     */
    public PasswordComplexityConfiguration getPasswordComplexityConfiguration() {
        return this.passwordComplexityConfiguration;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PasswordComplexityConfiguration passwordComplexityConfiguration; 
        private String requestId; 

        /**
         * PasswordComplexityConfiguration.
         */
        public Builder passwordComplexityConfiguration(PasswordComplexityConfiguration passwordComplexityConfiguration) {
            this.passwordComplexityConfiguration = passwordComplexityConfiguration;
            return this;
        }

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPasswordComplexityConfigurationResponseBody build() {
            return new GetPasswordComplexityConfigurationResponseBody(this);
        } 

    } 

    public static class PasswordComplexityRules extends TeaModel {
        @NameInMap("PasswordCheckType")
        private String passwordCheckType;

        private PasswordComplexityRules(Builder builder) {
            this.passwordCheckType = builder.passwordCheckType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PasswordComplexityRules create() {
            return builder().build();
        }

        /**
         * @return passwordCheckType
         */
        public String getPasswordCheckType() {
            return this.passwordCheckType;
        }

        public static final class Builder {
            private String passwordCheckType; 

            /**
             * 密码检查类型。枚举取值:inclusion\_upper\_case(包含大写字母)、inclusion\_lower\_case(包含小写字母)、inclusion\_special\_case(包含特殊字符)、inclusion\_number(包含数字)、exclusion\_username(不能包含用户名)、exclusion\_email(不能包含邮箱)、exclusion\_phone\_number(不能包含手机号)、exclusion\_display\_name(不能包含显示名)
             */
            public Builder passwordCheckType(String passwordCheckType) {
                this.passwordCheckType = passwordCheckType;
                return this;
            }

            public PasswordComplexityRules build() {
                return new PasswordComplexityRules(this);
            } 

        } 

    }
    public static class PasswordComplexityConfiguration extends TeaModel {
        @NameInMap("PasswordComplexityRules")
        private java.util.List < PasswordComplexityRules> passwordComplexityRules;

        @NameInMap("PasswordMinLength")
        private Integer passwordMinLength;

        private PasswordComplexityConfiguration(Builder builder) {
            this.passwordComplexityRules = builder.passwordComplexityRules;
            this.passwordMinLength = builder.passwordMinLength;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PasswordComplexityConfiguration create() {
            return builder().build();
        }

        /**
         * @return passwordComplexityRules
         */
        public java.util.List < PasswordComplexityRules> getPasswordComplexityRules() {
            return this.passwordComplexityRules;
        }

        /**
         * @return passwordMinLength
         */
        public Integer getPasswordMinLength() {
            return this.passwordMinLength;
        }

        public static final class Builder {
            private java.util.List < PasswordComplexityRules> passwordComplexityRules; 
            private Integer passwordMinLength; 

            /**
             * 密码复杂度规则
             */
            public Builder passwordComplexityRules(java.util.List < PasswordComplexityRules> passwordComplexityRules) {
                this.passwordComplexityRules = passwordComplexityRules;
                return this;
            }

            /**
             * 密码最短长度
             */
            public Builder passwordMinLength(Integer passwordMinLength) {
                this.passwordMinLength = passwordMinLength;
                return this;
            }

            public PasswordComplexityConfiguration build() {
                return new PasswordComplexityConfiguration(this);
            } 

        } 

    }
}
