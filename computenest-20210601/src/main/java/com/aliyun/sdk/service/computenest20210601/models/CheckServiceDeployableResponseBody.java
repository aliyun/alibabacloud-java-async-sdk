// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

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
 * {@link CheckServiceDeployableResponseBody} extends {@link TeaModel}
 *
 * <p>CheckServiceDeployableResponseBody</p>
 */
public class CheckServiceDeployableResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CheckResults")
    private java.util.List<CheckResults> checkResults;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CheckServiceDeployableResponseBody(Builder builder) {
        this.checkResults = builder.checkResults;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckServiceDeployableResponseBody create() {
        return builder().build();
    }

    /**
     * @return checkResults
     */
    public java.util.List<CheckResults> getCheckResults() {
        return this.checkResults;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<CheckResults> checkResults; 
        private String requestId; 

        /**
         * <p>Inspection result.</p>
         */
        public Builder checkResults(java.util.List<CheckResults> checkResults) {
            this.checkResults = checkResults;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>06BF8F22-02DC-4750-83DF-3FFC11C065EA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckServiceDeployableResponseBody build() {
            return new CheckServiceDeployableResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CheckServiceDeployableResponseBody} extends {@link TeaModel}
     *
     * <p>CheckServiceDeployableResponseBody</p>
     */
    public static class CheckResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private CheckResults(Builder builder) {
            this.message = builder.message;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckResults create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String message; 
            private String type; 
            private String value; 

            /**
             * <p>Returns a hint message for the result.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>Check type, invalid values:</p>
             * <ul>
             * <li><p>Balance ：Account balance.</p>
             * </li>
             * <li><p>Quota:  Account quota.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Balance</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>Inspection result.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public CheckResults build() {
                return new CheckResults(this);
            } 

        } 

    }
}
