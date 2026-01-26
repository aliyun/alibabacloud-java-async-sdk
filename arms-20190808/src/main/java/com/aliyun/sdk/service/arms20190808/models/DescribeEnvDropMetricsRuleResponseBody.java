// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link DescribeEnvDropMetricsRuleResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEnvDropMetricsRuleResponseBody</p>
 */
public class DescribeEnvDropMetricsRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeEnvDropMetricsRuleResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEnvDropMetricsRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
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

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeEnvDropMetricsRuleResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The status code. The status code 200 indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned struct.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>message</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>ID of the request</p>
         * 
         * <strong>example:</strong>
         * <p>F7781D4A-2818-41E7-B7BB-79D809E9****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEnvDropMetricsRuleResponseBody build() {
            return new DescribeEnvDropMetricsRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEnvDropMetricsRuleResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEnvDropMetricsRuleResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DropMetrics")
        private String dropMetrics;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        private Data(Builder builder) {
            this.dropMetrics = builder.dropMetrics;
            this.ruleName = builder.ruleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dropMetrics
         */
        public String getDropMetrics() {
            return this.dropMetrics;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        public static final class Builder {
            private String dropMetrics; 
            private String ruleName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.dropMetrics = model.dropMetrics;
                this.ruleName = model.ruleName;
            } 

            /**
             * <p>The list of discarded metrics. Separate multiple metrics with line feeds.</p>
             * 
             * <strong>example:</strong>
             * <p>kube_pod_created</p>
             */
            public Builder dropMetrics(String dropMetrics) {
                this.dropMetrics = dropMetrics;
                return this;
            }

            /**
             * <p>The name of the discarded metric rule.</p>
             * 
             * <strong>example:</strong>
             * <p>ruleName1</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
