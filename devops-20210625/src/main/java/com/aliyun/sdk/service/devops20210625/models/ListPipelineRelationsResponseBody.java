// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPipelineRelationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPipelineRelationsResponseBody</p>
 */
public class ListPipelineRelationsResponseBody extends TeaModel {
    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMessage")
    private String errorMessage;

    @NameInMap("pipelineRelations")
    private java.util.List < PipelineRelations> pipelineRelations;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
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
    public java.util.List < PipelineRelations> getPipelineRelations() {
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
        private java.util.List < PipelineRelations> pipelineRelations; 
        private String requestId; 
        private Boolean success; 

        /**
         * 错误码
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * 错误信息
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * 变量组
         */
        public Builder pipelineRelations(java.util.List < PipelineRelations> pipelineRelations) {
            this.pipelineRelations = pipelineRelations;
            return this;
        }

        /**
         * 请求id，每次请求都是唯一值，便于后续排查问题
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * true 接口调用成功，false 接口调用失败
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListPipelineRelationsResponseBody build() {
            return new ListPipelineRelationsResponseBody(this);
        } 

    } 

    public static class PipelineRelations extends TeaModel {
        @NameInMap("refObjectId")
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
             * 变量组id
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
