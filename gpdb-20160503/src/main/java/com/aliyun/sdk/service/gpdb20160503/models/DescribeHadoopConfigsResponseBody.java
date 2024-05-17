// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHadoopConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHadoopConfigsResponseBody</p>
 */
public class DescribeHadoopConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigName")
    private String configName;

    @com.aliyun.core.annotation.NameInMap("ConfigValue")
    private String configValue;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeHadoopConfigsResponseBody(Builder builder) {
        this.configName = builder.configName;
        this.configValue = builder.configValue;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHadoopConfigsResponseBody create() {
        return builder().build();
    }

    /**
     * @return configName
     */
    public String getConfigName() {
        return this.configName;
    }

    /**
     * @return configValue
     */
    public String getConfigValue() {
        return this.configValue;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String configName; 
        private String configValue; 
        private String requestId; 

        /**
         * ConfigName.
         */
        public Builder configName(String configName) {
            this.configName = configName;
            return this;
        }

        /**
         * ConfigValue.
         */
        public Builder configValue(String configValue) {
            this.configValue = configValue;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeHadoopConfigsResponseBody build() {
            return new DescribeHadoopConfigsResponseBody(this);
        } 

    } 

}
