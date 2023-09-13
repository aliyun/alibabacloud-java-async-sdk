// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeQueryConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeQueryConfigsResponseBody</p>
 */
public class DescribeQueryConfigsResponseBody extends TeaModel {
    @NameInMap("Configs")
    private java.util.List < Configs> configs;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeQueryConfigsResponseBody(Builder builder) {
        this.configs = builder.configs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeQueryConfigsResponseBody create() {
        return builder().build();
    }

    /**
     * @return configs
     */
    public java.util.List < Configs> getConfigs() {
        return this.configs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Configs> configs; 
        private String requestId; 

        /**
         * Configs.
         */
        public Builder configs(java.util.List < Configs> configs) {
            this.configs = configs;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeQueryConfigsResponseBody build() {
            return new DescribeQueryConfigsResponseBody(this);
        } 

    } 

    public static class Configs extends TeaModel {
        @NameInMap("Value")
        private String value;

        private Configs(Builder builder) {
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Configs create() {
            return builder().build();
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String value; 

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Configs build() {
                return new Configs(this);
            } 

        } 

    }
}
