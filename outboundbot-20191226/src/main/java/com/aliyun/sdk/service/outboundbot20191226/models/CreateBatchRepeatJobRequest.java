// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBatchRepeatJobRequest} extends {@link RequestModel}
 *
 * <p>CreateBatchRepeatJobRequest</p>
 */
public class CreateBatchRepeatJobRequest extends Request {
    @Query
    @NameInMap("CallingNumber")
    private java.util.List < String > callingNumber;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("FilterStatus")
    private String filterStatus;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("MinConcurrency")
    private Long minConcurrency;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("Priority")
    private String priority;

    @Query
    @NameInMap("RecallStrategyJson")
    private String recallStrategyJson;

    @Query
    @NameInMap("RingingDuration")
    private Long ringingDuration;

    @Query
    @NameInMap("ScriptId")
    private String scriptId;

    @Query
    @NameInMap("SourceGroupId")
    @Validation(required = true)
    private String sourceGroupId;

    @Query
    @NameInMap("StrategyJson")
    private String strategyJson;

    private CreateBatchRepeatJobRequest(Builder builder) {
        super(builder);
        this.callingNumber = builder.callingNumber;
        this.description = builder.description;
        this.filterStatus = builder.filterStatus;
        this.instanceId = builder.instanceId;
        this.minConcurrency = builder.minConcurrency;
        this.name = builder.name;
        this.priority = builder.priority;
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
    public java.util.List < String > getCallingNumber() {
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
        private java.util.List < String > callingNumber; 
        private String description; 
        private String filterStatus; 
        private String instanceId; 
        private Long minConcurrency; 
        private String name; 
        private String priority; 
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
            this.instanceId = request.instanceId;
            this.minConcurrency = request.minConcurrency;
            this.name = request.name;
            this.priority = request.priority;
            this.recallStrategyJson = request.recallStrategyJson;
            this.ringingDuration = request.ringingDuration;
            this.scriptId = request.scriptId;
            this.sourceGroupId = request.sourceGroupId;
            this.strategyJson = request.strategyJson;
        } 

        /**
         * CallingNumber.
         */
        public Builder callingNumber(java.util.List < String > callingNumber) {
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
         * InstanceId.
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
         * Name.
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
         * SourceGroupId.
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
