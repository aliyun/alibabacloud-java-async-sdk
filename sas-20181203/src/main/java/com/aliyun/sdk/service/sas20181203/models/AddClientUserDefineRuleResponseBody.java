// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddClientUserDefineRuleResponseBody} extends {@link TeaModel}
 *
 * <p>AddClientUserDefineRuleResponseBody</p>
 */
public class AddClientUserDefineRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserDefineRuleAddResult")
    private UserDefineRuleAddResult userDefineRuleAddResult;

    private AddClientUserDefineRuleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.userDefineRuleAddResult = builder.userDefineRuleAddResult;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddClientUserDefineRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userDefineRuleAddResult
     */
    public UserDefineRuleAddResult getUserDefineRuleAddResult() {
        return this.userDefineRuleAddResult;
    }

    public static final class Builder {
        private String requestId; 
        private UserDefineRuleAddResult userDefineRuleAddResult; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The identifier of the custom defense rule.
         */
        public Builder userDefineRuleAddResult(UserDefineRuleAddResult userDefineRuleAddResult) {
            this.userDefineRuleAddResult = userDefineRuleAddResult;
            return this;
        }

        public AddClientUserDefineRuleResponseBody build() {
            return new AddClientUserDefineRuleResponseBody(this);
        } 

    } 

    public static class UserDefineRuleAddResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("SwitchId")
        private String switchId;

        private UserDefineRuleAddResult(Builder builder) {
            this.id = builder.id;
            this.platform = builder.platform;
            this.switchId = builder.switchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserDefineRuleAddResult create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return switchId
         */
        public String getSwitchId() {
            return this.switchId;
        }

        public static final class Builder {
            private Long id; 
            private String platform; 
            private String switchId; 

            /**
             * The ID of the rule.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The type of the operating system. Valid values:
             * <p>
             * 
             * *   **windows**: Windows
             * *   **linux**: Linux
             * *   **all**: all types
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * The switch ID of the custom defense rule.
             */
            public Builder switchId(String switchId) {
                this.switchId = switchId;
                return this;
            }

            public UserDefineRuleAddResult build() {
                return new UserDefineRuleAddResult(this);
            } 

        } 

    }
}
