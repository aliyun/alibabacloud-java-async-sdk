// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link AddTaskFlowEdgesResponseBody} extends {@link TeaModel}
 *
 * <p>AddTaskFlowEdgesResponseBody</p>
 */
public class AddTaskFlowEdgesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EdgeIds")
    private EdgeIds edgeIds;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(AddTaskFlowEdgesResponseBody model) {
            this.edgeIds = model.edgeIds;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The list of task flow edge IDs.</p>
         */
        public Builder edgeIds(EdgeIds edgeIds) {
            this.edgeIds = edgeIds;
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
         * <p>The ID of the request. You can use the ID to query logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>E5EE2B9E-2F95-57FA-B284-CB441CEE49D6</p>
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

        public AddTaskFlowEdgesResponseBody build() {
            return new AddTaskFlowEdgesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddTaskFlowEdgesResponseBody} extends {@link TeaModel}
     *
     * <p>AddTaskFlowEdgesResponseBody</p>
     */
    public static class EdgeIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EdgeId")
        private java.util.List<Long> edgeId;

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
        public java.util.List<Long> getEdgeId() {
            return this.edgeId;
        }

        public static final class Builder {
            private java.util.List<Long> edgeId; 

            private Builder() {
            } 

            private Builder(EdgeIds model) {
                this.edgeId = model.edgeId;
            } 

            /**
             * EdgeId.
             */
            public Builder edgeId(java.util.List<Long> edgeId) {
                this.edgeId = edgeId;
                return this;
            }

            public EdgeIds build() {
                return new EdgeIds(this);
            } 

        } 

    }
}
