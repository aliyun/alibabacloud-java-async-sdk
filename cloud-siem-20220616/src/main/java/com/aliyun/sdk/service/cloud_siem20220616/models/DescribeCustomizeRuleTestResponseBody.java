// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

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
 * {@link DescribeCustomizeRuleTestResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustomizeRuleTestResponseBody</p>
 */
public class DescribeCustomizeRuleTestResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeCustomizeRuleTestResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomizeRuleTestResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeCustomizeRuleTestResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeCustomizeRuleTestResponseBody build() {
            return new DescribeCustomizeRuleTestResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCustomizeRuleTestResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCustomizeRuleTestResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("SimulateData")
        private String simulateData;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private Data(Builder builder) {
            this.id = builder.id;
            this.simulateData = builder.simulateData;
            this.status = builder.status;
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
         * @return simulateData
         */
        public String getSimulateData() {
            return this.simulateData;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long id; 
            private String simulateData; 
            private Integer status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.id = model.id;
                this.simulateData = model.simulateData;
                this.status = model.status;
            } 

            /**
             * <p>The ID of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>123456789</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The historical data that is used in the simulation test.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;key1&quot;:&quot;value1&quot;,&quot;key2&quot;:&quot;value2&quot;,&quot;key3&quot;:&quot;value3&quot;,&quot;key4&quot;:&quot;value4&quot;,&quot;key5&quot;:&quot;value5&quot;}]</p>
             */
            public Builder simulateData(String simulateData) {
                this.simulateData = simulateData;
                return this;
            }

            /**
             * <p>The status of the rule. Valid values:</p>
             * <ul>
             * <li>0: The rule is in the initial state.</li>
             * <li>10: The simulation data is tested.</li>
             * <li>15: The business data is being tested.</li>
             * <li>20: The business data test ends.</li>
             * <li>100: The rule takes effect.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
