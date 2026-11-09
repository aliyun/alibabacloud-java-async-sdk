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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D7861F61-5B61-46CE-A47C-6B19160D5EB0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of returned entries.</p>
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
             * <p>The rule details, formatted as a JSON string constructed from a series of parameters.</p>
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
             * <li><p><strong>1</strong>: Enabled.</p>
             * </li>
             * <li><p><strong>0</strong>: Disabled.</p>
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
             * <p>The rule type. Valid values:</p>
             * <ul>
             * <li><strong>risk</strong>: Risk detection.</li>
             * <li><strong>event</strong>: Security events.</li>
             * <li><strong>sensitive_word</strong>: Sensitive data.</li>
             * <li><strong>auth_flag</strong>: Authentication credentials.</li>
             * <li><strong>api_tag</strong>: Business purpose.</li>
             * <li><strong>desensitization</strong>: Data masking.</li>
             * <li><strong>whitelist</strong>: Whitelist.</li>
             * <li><strong>recognition</strong>: API identification.</li>
             * <li><strong>offline_api</strong>: Lifecycle management.</li>
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
             * <p>The update time of the rule. The time is a UNIX timestamp in UTC. Unit: seconds.</p>
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
