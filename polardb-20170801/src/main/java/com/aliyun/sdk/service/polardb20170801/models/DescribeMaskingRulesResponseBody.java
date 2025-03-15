// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeMaskingRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMaskingRulesResponseBody</p>
 */
public class DescribeMaskingRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeMaskingRulesResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMaskingRulesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private String DBClusterId; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeMaskingRulesResponseBody model) {
            this.DBClusterId = model.DBClusterId;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-bp1s826a1up******</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The result data that is returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message that is returned for the request.</p>
         * <blockquote>
         * <p>If the request is successful, Successful is returned. If the request fails, an error message such as an error code is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2F83D131-1C18-4599-889D-729A9D******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid value:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeMaskingRulesResponseBody build() {
            return new DescribeMaskingRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMaskingRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMaskingRulesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleList")
        private java.util.List<String> ruleList;

        @com.aliyun.core.annotation.NameInMap("RuleVersion")
        private String ruleVersion;

        private Data(Builder builder) {
            this.ruleList = builder.ruleList;
            this.ruleVersion = builder.ruleVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return ruleList
         */
        public java.util.List<String> getRuleList() {
            return this.ruleList;
        }

        /**
         * @return ruleVersion
         */
        public String getRuleVersion() {
            return this.ruleVersion;
        }

        public static final class Builder {
            private java.util.List<String> ruleList; 
            private String ruleVersion; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.ruleList = model.ruleList;
                this.ruleVersion = model.ruleVersion;
            } 

            /**
             * <p>Details about the masking rules.</p>
             */
            public Builder ruleList(java.util.List<String> ruleList) {
                this.ruleList = ruleList;
                return this;
            }

            /**
             * <p>The version of the masking rule. Valid values: v1 and v2. Default value: v1</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder ruleVersion(String ruleVersion) {
                this.ruleVersion = ruleVersion;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
