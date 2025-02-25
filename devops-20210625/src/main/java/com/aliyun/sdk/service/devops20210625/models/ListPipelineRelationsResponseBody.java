// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link ListPipelineRelationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPipelineRelationsResponseBody</p>
 */
public class ListPipelineRelationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("pipelineRelations")
    private java.util.List<PipelineRelations> pipelineRelations;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private ListPipelineRelationsResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.pipelineRelations = builder.pipelineRelations;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPipelineRelationsResponseBody create() {
        return builder().build();
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
     * @return pipelineRelations
     */
    public java.util.List<PipelineRelations> getPipelineRelations() {
        return this.pipelineRelations;
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
        private String errorCode; 
        private String errorMessage; 
        private java.util.List<PipelineRelations> pipelineRelations; 
        private String requestId; 
        private Boolean success; 

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * pipelineRelations.
         */
        public Builder pipelineRelations(java.util.List<PipelineRelations> pipelineRelations) {
            this.pipelineRelations = pipelineRelations;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListPipelineRelationsResponseBody build() {
            return new ListPipelineRelationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPipelineRelationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListPipelineRelationsResponseBody</p>
     */
    public static class PipelineRelations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("refObjectId")
        private Long refObjectId;

        private PipelineRelations(Builder builder) {
            this.refObjectId = builder.refObjectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PipelineRelations create() {
            return builder().build();
        }

        /**
         * @return refObjectId
         */
        public Long getRefObjectId() {
            return this.refObjectId;
        }

        public static final class Builder {
            private Long refObjectId; 

            /**
             * refObjectId.
             */
            public Builder refObjectId(Long refObjectId) {
                this.refObjectId = refObjectId;
                return this;
            }

            public PipelineRelations build() {
                return new PipelineRelations(this);
            } 

        } 

    }
}
