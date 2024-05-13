// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTaskFlowConstantsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTaskFlowConstantsResponseBody</p>
 */
public class ListTaskFlowConstantsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DagConstants")
    private DagConstants dagConstants;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListTaskFlowConstantsResponseBody(Builder builder) {
        this.dagConstants = builder.dagConstants;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTaskFlowConstantsResponseBody create() {
        return builder().build();
    }

    /**
     * @return dagConstants
     */
    public DagConstants getDagConstants() {
        return this.dagConstants;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private DagConstants dagConstants; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * A list of constant key-value pairs for the task flow.
         */
        public Builder dagConstants(DagConstants dagConstants) {
            this.dagConstants = dagConstants;
            return this;
        }

        /**
         * The error code returned if the request failed.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned if the request failed.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The ID of the request. You can use the ID to locate logs and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**: The request was successful.
         * *   **false**: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListTaskFlowConstantsResponseBody build() {
            return new ListTaskFlowConstantsResponseBody(this);
        } 

    } 

    public static class DagConstant extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private DagConstant(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DagConstant create() {
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

            /**
             * The constant key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The constant value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public DagConstant build() {
                return new DagConstant(this);
            } 

        } 

    }
    public static class DagConstants extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DagConstant")
        private java.util.List < DagConstant> dagConstant;

        private DagConstants(Builder builder) {
            this.dagConstant = builder.dagConstant;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DagConstants create() {
            return builder().build();
        }

        /**
         * @return dagConstant
         */
        public java.util.List < DagConstant> getDagConstant() {
            return this.dagConstant;
        }

        public static final class Builder {
            private java.util.List < DagConstant> dagConstant; 

            /**
             * DagConstant.
             */
            public Builder dagConstant(java.util.List < DagConstant> dagConstant) {
                this.dagConstant = dagConstant;
                return this;
            }

            public DagConstants build() {
                return new DagConstants(this);
            } 

        } 

    }
}
