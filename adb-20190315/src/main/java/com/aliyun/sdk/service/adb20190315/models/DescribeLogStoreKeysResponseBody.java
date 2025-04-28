// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

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
 * {@link DescribeLogStoreKeysResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLogStoreKeysResponseBody</p>
 */
public class DescribeLogStoreKeysResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LogStoreKeys")
    private LogStoreKeys logStoreKeys;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeLogStoreKeysResponseBody(Builder builder) {
        this.logStoreKeys = builder.logStoreKeys;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLogStoreKeysResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logStoreKeys
     */
    public LogStoreKeys getLogStoreKeys() {
        return this.logStoreKeys;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private LogStoreKeys logStoreKeys; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeLogStoreKeysResponseBody model) {
            this.logStoreKeys = model.logStoreKeys;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The queried log keywords.</p>
         */
        public Builder logStoreKeys(LogStoreKeys logStoreKeys) {
            this.logStoreKeys = logStoreKeys;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3BB185E9-BB54-1727-B876-13243E4C0EB5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLogStoreKeysResponseBody build() {
            return new DescribeLogStoreKeysResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLogStoreKeysResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLogStoreKeysResponseBody</p>
     */
    public static class LogStoreKeys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogStoreKey")
        private java.util.List<String> logStoreKey;

        private LogStoreKeys(Builder builder) {
            this.logStoreKey = builder.logStoreKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogStoreKeys create() {
            return builder().build();
        }

        /**
         * @return logStoreKey
         */
        public java.util.List<String> getLogStoreKey() {
            return this.logStoreKey;
        }

        public static final class Builder {
            private java.util.List<String> logStoreKey; 

            private Builder() {
            } 

            private Builder(LogStoreKeys model) {
                this.logStoreKey = model.logStoreKey;
            } 

            /**
             * LogStoreKey.
             */
            public Builder logStoreKey(java.util.List<String> logStoreKey) {
                this.logStoreKey = logStoreKey;
                return this;
            }

            public LogStoreKeys build() {
                return new LogStoreKeys(this);
            } 

        } 

    }
}
