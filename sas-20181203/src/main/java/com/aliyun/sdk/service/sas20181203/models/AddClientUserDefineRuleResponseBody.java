// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>379a9b8f-107b-4630-9e95-2299a1ea****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The identifier of the custom defense rule.</p>
         */
        public Builder userDefineRuleAddResult(UserDefineRuleAddResult userDefineRuleAddResult) {
            this.userDefineRuleAddResult = userDefineRuleAddResult;
            return this;
        }

        public AddClientUserDefineRuleResponseBody build() {
            return new AddClientUserDefineRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddClientUserDefineRuleResponseBody} extends {@link TeaModel}
     *
     * <p>AddClientUserDefineRuleResponseBody</p>
     */
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
             * <p>The ID of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The type of the operating system. Valid values:</p>
             * <ul>
             * <li><strong>windows</strong>: Windows</li>
             * <li><strong>linux</strong>: Linux</li>
             * <li><strong>all</strong>: all types</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>linux</p>
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * <p>The switch ID of the custom defense rule.</p>
             * 
             * <strong>example:</strong>
             * <p>USER-DEFINE-RULE-SWITCH-TYPE_200****</p>
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
