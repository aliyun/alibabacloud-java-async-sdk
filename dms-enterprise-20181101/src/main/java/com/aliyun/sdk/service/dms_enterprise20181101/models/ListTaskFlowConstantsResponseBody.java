// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>A list of constant key-value pairs for the task flow.</p>
         */
        public Builder dagConstants(DagConstants dagConstants) {
            this.dagConstants = dagConstants;
            return this;
        }

        /**
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request. You can use the ID to locate logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>028BF827-3801-5869-8548-F4A039256304</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListTaskFlowConstantsResponseBody build() {
            return new ListTaskFlowConstantsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTaskFlowConstantsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTaskFlowConstantsResponseBody</p>
     */
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
             * <p>The constant key.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The constant value.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link ListTaskFlowConstantsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTaskFlowConstantsResponseBody</p>
     */
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
