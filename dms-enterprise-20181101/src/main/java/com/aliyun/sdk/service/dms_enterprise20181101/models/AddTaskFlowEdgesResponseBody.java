// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddTaskFlowEdgesResponseBody} extends {@link TeaModel}
 *
 * <p>AddTaskFlowEdgesResponseBody</p>
 */
public class AddTaskFlowEdgesResponseBody extends TeaModel {
    @NameInMap("EdgeIds")
    private EdgeIds edgeIds;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private AddTaskFlowEdgesResponseBody(Builder builder) {
        this.edgeIds = builder.edgeIds;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddTaskFlowEdgesResponseBody create() {
        return builder().build();
    }

    /**
     * @return edgeIds
     */
    public EdgeIds getEdgeIds() {
        return this.edgeIds;
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
        private EdgeIds edgeIds; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * The list of task flow edge IDs.
         */
        public Builder edgeIds(EdgeIds edgeIds) {
            this.edgeIds = edgeIds;
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
         * The ID of the request. You can use the ID to query logs and troubleshoot issues.
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

        public AddTaskFlowEdgesResponseBody build() {
            return new AddTaskFlowEdgesResponseBody(this);
        } 

    } 

    public static class EdgeIds extends TeaModel {
        @NameInMap("EdgeId")
        private java.util.List < Long > edgeId;

        private EdgeIds(Builder builder) {
            this.edgeId = builder.edgeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EdgeIds create() {
            return builder().build();
        }

        /**
         * @return edgeId
         */
        public java.util.List < Long > getEdgeId() {
            return this.edgeId;
        }

        public static final class Builder {
            private java.util.List < Long > edgeId; 

            /**
             * EdgeId.
             */
            public Builder edgeId(java.util.List < Long > edgeId) {
                this.edgeId = edgeId;
                return this;
            }

            public EdgeIds build() {
                return new EdgeIds(this);
            } 

        } 

    }
}
