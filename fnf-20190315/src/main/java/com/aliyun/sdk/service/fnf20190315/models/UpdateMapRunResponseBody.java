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
 * {@link UpdateMapRunResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateMapRunResponseBody</p>
 */
public class UpdateMapRunResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Concurrency")
    private Long concurrency;

    @com.aliyun.core.annotation.NameInMap("ExecutionName")
    private String executionName;

    @com.aliyun.core.annotation.NameInMap("FlowName")
    private String flowName;

    @com.aliyun.core.annotation.NameInMap("MapRunName")
    private String mapRunName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ToleratedFailedCount")
    private Long toleratedFailedCount;

    @com.aliyun.core.annotation.NameInMap("ToleratedFailedPercentage")
    private Float toleratedFailedPercentage;

    private UpdateMapRunResponseBody(Builder builder) {
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

    public static UpdateMapRunResponseBody create() {
        return builder().build();
    }

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

    public static final class Builder {
        private Long concurrency; 
        private String executionName; 
        private String flowName; 
        private String mapRunName; 
        private String requestId; 
        private Long toleratedFailedCount; 
        private Float toleratedFailedPercentage; 

        private Builder() {
        } 

        private Builder(UpdateMapRunResponseBody model) {
            this.concurrency = model.concurrency;
            this.executionName = model.executionName;
            this.flowName = model.flowName;
            this.mapRunName = model.mapRunName;
            this.requestId = model.requestId;
            this.toleratedFailedCount = model.toleratedFailedCount;
            this.toleratedFailedPercentage = model.toleratedFailedPercentage;
        } 

        /**
         * Concurrency.
         */
        public Builder concurrency(Long concurrency) {
            this.concurrency = concurrency;
            return this;
        }

        /**
         * ExecutionName.
         */
        public Builder executionName(String executionName) {
            this.executionName = executionName;
            return this;
        }

        /**
         * FlowName.
         */
        public Builder flowName(String flowName) {
            this.flowName = flowName;
            return this;
        }

        /**
         * MapRunName.
         */
        public Builder mapRunName(String mapRunName) {
            this.mapRunName = mapRunName;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>3A44E113-9962-5B0B-AB92-14060EFE3164</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ToleratedFailedCount.
         */
        public Builder toleratedFailedCount(Long toleratedFailedCount) {
            this.toleratedFailedCount = toleratedFailedCount;
            return this;
        }

        /**
         * ToleratedFailedPercentage.
         */
        public Builder toleratedFailedPercentage(Float toleratedFailedPercentage) {
            this.toleratedFailedPercentage = toleratedFailedPercentage;
            return this;
        }

        public UpdateMapRunResponseBody build() {
            return new UpdateMapRunResponseBody(this);
        } 

    } 

}
