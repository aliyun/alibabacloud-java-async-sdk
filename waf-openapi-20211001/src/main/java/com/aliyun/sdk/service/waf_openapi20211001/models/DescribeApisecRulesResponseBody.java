// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeApisecRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApisecRulesResponseBody</p>
 */
public class DescribeApisecRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeApisecRulesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApisecRulesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeApisecRulesResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of rules.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D7861F61-5B61-46CE-A47C-6B19160D5EB0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeApisecRulesResponseBody build() {
            return new DescribeApisecRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApisecRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApisecRulesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Rule")
        private String rule;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Long status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private Data(Builder builder) {
            this.id = builder.id;
            this.rule = builder.rule;
            this.status = builder.status;
            this.type = builder.type;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return rule
         */
        public String getRule() {
            return this.rule;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Long id; 
            private String rule; 
            private Long status; 
            private String type; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.id = model.id;
                this.rule = model.rule;
                this.status = model.status;
                this.type = model.type;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The ID of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>34933</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The details of the rule. The value is a string that is converted from a JSON object.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;ext&quot;: &quot;Date&quot;,
             *     &quot;regex&quot;: &quot;-&quot;,
             *     &quot;code&quot;: &quot;2009&quot;,
             *     &quot;level&quot;: &quot;S1&quot;,
             *     &quot;origin&quot;: &quot;default&quot;,
             *     &quot;name&quot;: &quot;2009&quot;
             * }</p>
             */
            public Builder rule(String rule) {
                this.rule = rule;
                return this;
            }

            /**
             * <p>The status of the rule. Valid values:</p>
             * <ul>
             * <li><p><strong>1</strong>: enabled</p>
             * </li>
             * <li><p><strong>0</strong>: disabled</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the rule. Valid values:</p>
             * <ul>
             * <li><p><strong>risk</strong>: threat detection</p>
             * </li>
             * <li><p><strong>event</strong>: security event</p>
             * </li>
             * <li><p><strong>sensitive_word</strong>: sensitive data</p>
             * </li>
             * <li><p><strong>auth_flag</strong>: authentication credential</p>
             * </li>
             * <li><p><strong>api_tag</strong>: business purpose</p>
             * </li>
             * <li><p><strong>desensitization</strong>: data masking</p>
             * </li>
             * <li><p><strong>whitelist</strong>: whitelist</p>
             * </li>
             * <li><p><strong>recognition</strong>: API.</p>
             * </li>
             * <li><p><strong>offline_api</strong>: lifecycle management</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>risk</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The time when the rule was updated. This value is a UNIX timestamp. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1721095301</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
