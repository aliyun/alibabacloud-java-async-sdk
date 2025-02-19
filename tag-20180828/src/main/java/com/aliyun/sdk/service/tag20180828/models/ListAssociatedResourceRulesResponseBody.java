// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

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
 * {@link ListAssociatedResourceRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAssociatedResourceRulesResponseBody</p>
 */
public class ListAssociatedResourceRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Rules")
    private java.util.List<Rules> rules;

    private ListAssociatedResourceRulesResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.rules = builder.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAssociatedResourceRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rules
     */
    public java.util.List<Rules> getRules() {
        return this.rules;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private java.util.List<Rules> rules; 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * Rules.
         */
        public Builder rules(java.util.List<Rules> rules) {
            this.rules = rules;
            return this;
        }

        public ListAssociatedResourceRulesResponseBody build() {
            return new ListAssociatedResourceRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAssociatedResourceRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAssociatedResourceRulesResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SettingName")
        private String settingName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TagKeys")
        private java.util.List<String> tagKeys;

        private Rules(Builder builder) {
            this.settingName = builder.settingName;
            this.status = builder.status;
            this.tagKeys = builder.tagKeys;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return settingName
         */
        public String getSettingName() {
            return this.settingName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tagKeys
         */
        public java.util.List<String> getTagKeys() {
            return this.tagKeys;
        }

        public static final class Builder {
            private String settingName; 
            private String status; 
            private java.util.List<String> tagKeys; 

            /**
             * SettingName.
             */
            public Builder settingName(String settingName) {
                this.settingName = settingName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TagKeys.
             */
            public Builder tagKeys(java.util.List<String> tagKeys) {
                this.tagKeys = tagKeys;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
}
