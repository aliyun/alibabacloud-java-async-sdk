// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeAckClusterPodLabelsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAckClusterPodLabelsResponseBody</p>
 */
public class DescribeAckClusterPodLabelsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AckLabels")
    private java.util.List<AckLabels> ackLabels;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAckClusterPodLabelsResponseBody(Builder builder) {
        this.ackLabels = builder.ackLabels;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAckClusterPodLabelsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ackLabels
     */
    public java.util.List<AckLabels> getAckLabels() {
        return this.ackLabels;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<AckLabels> ackLabels; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeAckClusterPodLabelsResponseBody model) {
            this.ackLabels = model.ackLabels;
            this.requestId = model.requestId;
        } 

        /**
         * AckLabels.
         */
        public Builder ackLabels(java.util.List<AckLabels> ackLabels) {
            this.ackLabels = ackLabels;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAckClusterPodLabelsResponseBody build() {
            return new DescribeAckClusterPodLabelsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAckClusterPodLabelsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAckClusterPodLabelsResponseBody</p>
     */
    public static class AckLabels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private AckLabels(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AckLabels create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(AckLabels model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public AckLabels build() {
                return new AckLabels(this);
            } 

        } 

    }
}
