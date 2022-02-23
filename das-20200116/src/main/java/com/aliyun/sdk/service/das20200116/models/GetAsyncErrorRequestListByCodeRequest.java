// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAsyncErrorRequestListByCodeRequest} extends {@link RequestModel}
 *
 * <p>GetAsyncErrorRequestListByCodeRequest</p>
 */
public class GetAsyncErrorRequestListByCodeRequest extends Request {
    @Query
    @NameInMap("End")
    private Long end;

    @Query
    @NameInMap("ErrorCode")
    private String errorCode;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("NodeId")
    private String nodeId;

    @Query
    @NameInMap("Start")
    private Long start;

    private GetAsyncErrorRequestListByCodeRequest(Builder builder) {
        super(builder);
        this.end = builder.end;
        this.errorCode = builder.errorCode;
        this.instanceId = builder.instanceId;
        this.nodeId = builder.nodeId;
        this.start = builder.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAsyncErrorRequestListByCodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return end
     */
    public Long getEnd() {
        return this.end;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return start
     */
    public Long getStart() {
        return this.start;
    }

    public static final class Builder extends Request.Builder<GetAsyncErrorRequestListByCodeRequest, Builder> {
        private Long end; 
        private String errorCode; 
        private String instanceId; 
        private String nodeId; 
        private Long start; 

        private Builder() {
            super();
        } 

        private Builder(GetAsyncErrorRequestListByCodeRequest response) {
            super(response);
            this.end = response.end;
            this.errorCode = response.errorCode;
            this.instanceId = response.instanceId;
            this.nodeId = response.nodeId;
            this.start = response.start;
        } 

        /**
         * End.
         */
        public Builder end(Long end) {
            this.putQueryParameter("End", end);
            this.end = end;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.putQueryParameter("ErrorCode", errorCode);
            this.errorCode = errorCode;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * NodeId.
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * Start.
         */
        public Builder start(Long start) {
            this.putQueryParameter("Start", start);
            this.start = start;
            return this;
        }

        @Override
        public GetAsyncErrorRequestListByCodeRequest build() {
            return new GetAsyncErrorRequestListByCodeRequest(this);
        } 

    } 

}
