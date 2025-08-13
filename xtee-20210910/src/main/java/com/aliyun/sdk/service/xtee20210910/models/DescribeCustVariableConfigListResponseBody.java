// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link DescribeCustVariableConfigListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustVariableConfigListResponseBody</p>
 */
public class DescribeCustVariableConfigListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private java.util.List<ResultObject> resultObject;

    private DescribeCustVariableConfigListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustVariableConfigListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultObject
     */
    public java.util.List<ResultObject> getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<ResultObject> resultObject; 

        private Builder() {
        } 

        private Builder(DescribeCustVariableConfigListResponseBody model) {
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Return object</p>
         */
        public Builder resultObject(java.util.List<ResultObject> resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeCustVariableConfigListResponseBody build() {
            return new DescribeCustVariableConfigListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCustVariableConfigListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCustVariableConfigListResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("configKey")
        private String configKey;

        @com.aliyun.core.annotation.NameInMap("configValue")
        private String configValue;

        private ResultObject(Builder builder) {
            this.configKey = builder.configKey;
            this.configValue = builder.configValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return configKey
         */
        public String getConfigKey() {
            return this.configKey;
        }

        /**
         * @return configValue
         */
        public String getConfigValue() {
            return this.configValue;
        }

        public static final class Builder {
            private String configKey; 
            private String configValue; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.configKey = model.configKey;
                this.configValue = model.configValue;
            } 

            /**
             * <p>Configuration key</p>
             * 
             * <strong>example:</strong>
             * <p>COUNT</p>
             */
            public Builder configKey(String configKey) {
                this.configKey = configKey;
                return this;
            }

            /**
             * <p>Configuration value</p>
             * 
             * <strong>example:</strong>
             * <p>累计</p>
             */
            public Builder configValue(String configValue) {
                this.configValue = configValue;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
