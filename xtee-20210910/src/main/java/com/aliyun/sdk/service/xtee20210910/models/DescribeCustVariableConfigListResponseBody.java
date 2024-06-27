// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustVariableConfigListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustVariableConfigListResponseBody</p>
 */
public class DescribeCustVariableConfigListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private java.util.List < ResultObject> resultObject;

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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultObject
     */
    public java.util.List < ResultObject> getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < ResultObject> resultObject; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * resultObject.
         */
        public Builder resultObject(java.util.List < ResultObject> resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeCustVariableConfigListResponseBody build() {
            return new DescribeCustVariableConfigListResponseBody(this);
        } 

    } 

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

            /**
             * configKey.
             */
            public Builder configKey(String configKey) {
                this.configKey = configKey;
                return this;
            }

            /**
             * configValue.
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
