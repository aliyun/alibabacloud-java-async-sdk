// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315.models;

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
 * {@link UpdateMapRunRequest} extends {@link RequestModel}
 *
 * <p>UpdateMapRunRequest</p>
 */
public class UpdateMapRunRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Concurrency")
    private Long concurrency;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExecutionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String executionName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlowName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String flowName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MapRunName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mapRunName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ToleratedFailedCount")
    private Long toleratedFailedCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ToleratedFailedPercentage")
    private Float toleratedFailedPercentage;

    private UpdateMapRunRequest(Builder builder) {
        super(builder);
        this.concurrency = builder.concurrency;
        this.executionName = builder.executionName;
        this.flowName = builder.flowName;
        this.mapRunName = builder.mapRunName;
        this.requestId = builder.requestId;
        this.toleratedFailedCount = builder.toleratedFailedCount;
        this.toleratedFailedPercentage = builder.toleratedFailedPercentage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMapRunRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return concurrency
     */
    public Long getConcurrency() {
        return this.concurrency;
    }

    /**
     * @return executionName
     */
    public String getExecutionName() {
        return this.executionName;
    }

    /**
     * @return flowName
     */
    public String getFlowName() {
        return this.flowName;
    }

    /**
     * @return mapRunName
     */
    public String getMapRunName() {
        return this.mapRunName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return toleratedFailedCount
     */
    public Long getToleratedFailedCount() {
        return this.toleratedFailedCount;
    }

    /**
     * @return toleratedFailedPercentage
     */
    public Float getToleratedFailedPercentage() {
        return this.toleratedFailedPercentage;
    }

    public static final class Builder extends Request.Builder<UpdateMapRunRequest, Builder> {
        private Long concurrency; 
        private String executionName; 
        private String flowName; 
        private String mapRunName; 
        private String requestId; 
        private Long toleratedFailedCount; 
        private Float toleratedFailedPercentage; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMapRunRequest request) {
            super(request);
            this.concurrency = request.concurrency;
            this.executionName = request.executionName;
            this.flowName = request.flowName;
            this.mapRunName = request.mapRunName;
            this.requestId = request.requestId;
            this.toleratedFailedCount = request.toleratedFailedCount;
            this.toleratedFailedPercentage = request.toleratedFailedPercentage;
        } 

        /**
         * Concurrency.
         */
        public Builder concurrency(Long concurrency) {
            this.putQueryParameter("Concurrency", concurrency);
            this.concurrency = concurrency;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my_exec_name</p>
         */
        public Builder executionName(String executionName) {
            this.putQueryParameter("ExecutionName", executionName);
            this.executionName = executionName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my_flow_name</p>
         */
        public Builder flowName(String flowName) {
            this.putQueryParameter("FlowName", flowName);
            this.flowName = flowName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c39142f1345b196d678333c41f113100</p>
         */
        public Builder mapRunName(String mapRunName) {
            this.putQueryParameter("MapRunName", mapRunName);
            this.mapRunName = mapRunName;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.putQueryParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * ToleratedFailedCount.
         */
        public Builder toleratedFailedCount(Long toleratedFailedCount) {
            this.putQueryParameter("ToleratedFailedCount", toleratedFailedCount);
            this.toleratedFailedCount = toleratedFailedCount;
            return this;
        }

        /**
         * ToleratedFailedPercentage.
         */
        public Builder toleratedFailedPercentage(Float toleratedFailedPercentage) {
            this.putQueryParameter("ToleratedFailedPercentage", toleratedFailedPercentage);
            this.toleratedFailedPercentage = toleratedFailedPercentage;
            return this;
        }

        @Override
        public UpdateMapRunRequest build() {
            return new UpdateMapRunRequest(this);
        } 

    } 

}
