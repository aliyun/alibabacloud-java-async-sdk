// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link CreateBatchRepeatJobRequest} extends {@link RequestModel}
 *
 * <p>CreateBatchRepeatJobRequest</p>
 */
public class CreateBatchRepeatJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallingNumber")
    private java.util.List<String> callingNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilterStatus")
    private String filterStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlashSmsExtras")
    private String flashSmsExtras;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinConcurrency")
    private Long minConcurrency;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Priority")
    private String priority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecallCallingNumber")
    private java.util.List<String> recallCallingNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecallStrategyJson")
    private String recallStrategyJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RingingDuration")
    private Long ringingDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScriptId")
    private String scriptId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyJson")
    private String strategyJson;

    private CreateBatchRepeatJobRequest(Builder builder) {
        super(builder);
        this.callingNumber = builder.callingNumber;
        this.description = builder.description;
        this.filterStatus = builder.filterStatus;
        this.flashSmsExtras = builder.flashSmsExtras;
        this.instanceId = builder.instanceId;
        this.minConcurrency = builder.minConcurrency;
        this.name = builder.name;
        this.priority = builder.priority;
        this.recallCallingNumber = builder.recallCallingNumber;
        this.recallStrategyJson = builder.recallStrategyJson;
        this.ringingDuration = builder.ringingDuration;
        this.scriptId = builder.scriptId;
        this.sourceGroupId = builder.sourceGroupId;
        this.strategyJson = builder.strategyJson;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBatchRepeatJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callingNumber
     */
    public java.util.List<String> getCallingNumber() {
        return this.callingNumber;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return filterStatus
     */
    public String getFilterStatus() {
        return this.filterStatus;
    }

    /**
     * @return flashSmsExtras
     */
    public String getFlashSmsExtras() {
        return this.flashSmsExtras;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return minConcurrency
     */
    public Long getMinConcurrency() {
        return this.minConcurrency;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return priority
     */
    public String getPriority() {
        return this.priority;
    }

    /**
     * @return recallCallingNumber
     */
    public java.util.List<String> getRecallCallingNumber() {
        return this.recallCallingNumber;
    }

    /**
     * @return recallStrategyJson
     */
    public String getRecallStrategyJson() {
        return this.recallStrategyJson;
    }

    /**
     * @return ringingDuration
     */
    public Long getRingingDuration() {
        return this.ringingDuration;
    }

    /**
     * @return scriptId
     */
    public String getScriptId() {
        return this.scriptId;
    }

    /**
     * @return sourceGroupId
     */
    public String getSourceGroupId() {
        return this.sourceGroupId;
    }

    /**
     * @return strategyJson
     */
    public String getStrategyJson() {
        return this.strategyJson;
    }

    public static final class Builder extends Request.Builder<CreateBatchRepeatJobRequest, Builder> {
        private java.util.List<String> callingNumber; 
        private String description; 
        private String filterStatus; 
        private String flashSmsExtras; 
        private String instanceId; 
        private Long minConcurrency; 
        private String name; 
        private String priority; 
        private java.util.List<String> recallCallingNumber; 
        private String recallStrategyJson; 
        private Long ringingDuration; 
        private String scriptId; 
        private String sourceGroupId; 
        private String strategyJson; 

        private Builder() {
            super();
        } 

        private Builder(CreateBatchRepeatJobRequest request) {
            super(request);
            this.callingNumber = request.callingNumber;
            this.description = request.description;
            this.filterStatus = request.filterStatus;
            this.flashSmsExtras = request.flashSmsExtras;
            this.instanceId = request.instanceId;
            this.minConcurrency = request.minConcurrency;
            this.name = request.name;
            this.priority = request.priority;
            this.recallCallingNumber = request.recallCallingNumber;
            this.recallStrategyJson = request.recallStrategyJson;
            this.ringingDuration = request.ringingDuration;
            this.scriptId = request.scriptId;
            this.sourceGroupId = request.sourceGroupId;
            this.strategyJson = request.strategyJson;
        } 

        /**
         * CallingNumber.
         */
        public Builder callingNumber(java.util.List<String> callingNumber) {
            this.putQueryParameter("CallingNumber", callingNumber);
            this.callingNumber = callingNumber;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * FilterStatus.
         */
        public Builder filterStatus(String filterStatus) {
            this.putQueryParameter("FilterStatus", filterStatus);
            this.filterStatus = filterStatus;
            return this;
        }

        /**
         * FlashSmsExtras.
         */
        public Builder flashSmsExtras(String flashSmsExtras) {
            this.putQueryParameter("FlashSmsExtras", flashSmsExtras);
            this.flashSmsExtras = flashSmsExtras;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2bfa5ae4-7185-4227-a3b8-328f26f11be1</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * MinConcurrency.
         */
        public Builder minConcurrency(Long minConcurrency) {
            this.putQueryParameter("MinConcurrency", minConcurrency);
            this.minConcurrency = minConcurrency;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>24</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Priority.
         */
        public Builder priority(String priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * RecallCallingNumber.
         */
        public Builder recallCallingNumber(java.util.List<String> recallCallingNumber) {
            this.putQueryParameter("RecallCallingNumber", recallCallingNumber);
            this.recallCallingNumber = recallCallingNumber;
            return this;
        }

        /**
         * RecallStrategyJson.
         */
        public Builder recallStrategyJson(String recallStrategyJson) {
            this.putQueryParameter("RecallStrategyJson", recallStrategyJson);
            this.recallStrategyJson = recallStrategyJson;
            return this;
        }

        /**
         * RingingDuration.
         */
        public Builder ringingDuration(Long ringingDuration) {
            this.putQueryParameter("RingingDuration", ringingDuration);
            this.ringingDuration = ringingDuration;
            return this;
        }

        /**
         * ScriptId.
         */
        public Builder scriptId(String scriptId) {
            this.putQueryParameter("ScriptId", scriptId);
            this.scriptId = scriptId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c4f8a3d3-2e94-4bd4-aef8-e35f663d4847</p>
         */
        public Builder sourceGroupId(String sourceGroupId) {
            this.putQueryParameter("SourceGroupId", sourceGroupId);
            this.sourceGroupId = sourceGroupId;
            return this;
        }

        /**
         * StrategyJson.
         */
        public Builder strategyJson(String strategyJson) {
            this.putQueryParameter("StrategyJson", strategyJson);
            this.strategyJson = strategyJson;
            return this;
        }

        @Override
        public CreateBatchRepeatJobRequest build() {
            return new CreateBatchRepeatJobRequest(this);
        } 

    } 

}
