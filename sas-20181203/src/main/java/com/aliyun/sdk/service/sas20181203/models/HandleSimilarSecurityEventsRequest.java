// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HandleSimilarSecurityEventsRequest} extends {@link RequestModel}
 *
 * <p>HandleSimilarSecurityEventsRequest</p>
 */
public class HandleSimilarSecurityEventsRequest extends Request {
    @Query
    @NameInMap("MarkMissParam")
    private String markMissParam;

    @Query
    @NameInMap("OperationCode")
    private String operationCode;

    @Query
    @NameInMap("OperationParams")
    private String operationParams;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("TaskId")
    private Long taskId;

    private HandleSimilarSecurityEventsRequest(Builder builder) {
        super(builder);
        this.markMissParam = builder.markMissParam;
        this.operationCode = builder.operationCode;
        this.operationParams = builder.operationParams;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sourceIp = builder.sourceIp;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HandleSimilarSecurityEventsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return markMissParam
     */
    public String getMarkMissParam() {
        return this.markMissParam;
    }

    /**
     * @return operationCode
     */
    public String getOperationCode() {
        return this.operationCode;
    }

    /**
     * @return operationParams
     */
    public String getOperationParams() {
        return this.operationParams;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<HandleSimilarSecurityEventsRequest, Builder> {
        private String markMissParam; 
        private String operationCode; 
        private String operationParams; 
        private Long resourceOwnerId; 
        private String sourceIp; 
        private Long taskId; 

        private Builder() {
            super();
        } 

        private Builder(HandleSimilarSecurityEventsRequest request) {
            super(request);
            this.markMissParam = request.markMissParam;
            this.operationCode = request.operationCode;
            this.operationParams = request.operationParams;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sourceIp = request.sourceIp;
            this.taskId = request.taskId;
        } 

        /**
         * MarkMissParam.
         */
        public Builder markMissParam(String markMissParam) {
            this.putQueryParameter("MarkMissParam", markMissParam);
            this.markMissParam = markMissParam;
            return this;
        }

        /**
         * OperationCode.
         */
        public Builder operationCode(String operationCode) {
            this.putQueryParameter("OperationCode", operationCode);
            this.operationCode = operationCode;
            return this;
        }

        /**
         * OperationParams.
         */
        public Builder operationParams(String operationParams) {
            this.putQueryParameter("OperationParams", operationParams);
            this.operationParams = operationParams;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(Long taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public HandleSimilarSecurityEventsRequest build() {
            return new HandleSimilarSecurityEventsRequest(this);
        } 

    } 

}
