// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateEventRecordPlanRequest} extends {@link RequestModel}
 *
 * <p>UpdateEventRecordPlanRequest</p>
 */
public class UpdateEventRecordPlanRequest extends Request {
    @Query
    @NameInMap("EventTypes")
    private String eventTypes;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("PlanId")
    @Validation(required = true)
    private String planId;

    @Query
    @NameInMap("PreRecordDuration")
    private Integer preRecordDuration;

    @Query
    @NameInMap("RecordDuration")
    @Validation(required = true)
    private Integer recordDuration;

    @Query
    @NameInMap("TemplateId")
    @Validation(required = true)
    private String templateId;

    private UpdateEventRecordPlanRequest(Builder builder) {
        super(builder);
        this.eventTypes = builder.eventTypes;
        this.name = builder.name;
        this.planId = builder.planId;
        this.preRecordDuration = builder.preRecordDuration;
        this.recordDuration = builder.recordDuration;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEventRecordPlanRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventTypes
     */
    public String getEventTypes() {
        return this.eventTypes;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return planId
     */
    public String getPlanId() {
        return this.planId;
    }

    /**
     * @return preRecordDuration
     */
    public Integer getPreRecordDuration() {
        return this.preRecordDuration;
    }

    /**
     * @return recordDuration
     */
    public Integer getRecordDuration() {
        return this.recordDuration;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<UpdateEventRecordPlanRequest, Builder> {
        private String eventTypes; 
        private String name; 
        private String planId; 
        private Integer preRecordDuration; 
        private Integer recordDuration; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEventRecordPlanRequest request) {
            super(request);
            this.eventTypes = request.eventTypes;
            this.name = request.name;
            this.planId = request.planId;
            this.preRecordDuration = request.preRecordDuration;
            this.recordDuration = request.recordDuration;
            this.templateId = request.templateId;
        } 

        /**
         * EventTypes.
         */
        public Builder eventTypes(String eventTypes) {
            this.putQueryParameter("EventTypes", eventTypes);
            this.eventTypes = eventTypes;
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
         * PlanId.
         */
        public Builder planId(String planId) {
            this.putQueryParameter("PlanId", planId);
            this.planId = planId;
            return this;
        }

        /**
         * PreRecordDuration.
         */
        public Builder preRecordDuration(Integer preRecordDuration) {
            this.putQueryParameter("PreRecordDuration", preRecordDuration);
            this.preRecordDuration = preRecordDuration;
            return this;
        }

        /**
         * RecordDuration.
         */
        public Builder recordDuration(Integer recordDuration) {
            this.putQueryParameter("RecordDuration", recordDuration);
            this.recordDuration = recordDuration;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public UpdateEventRecordPlanRequest build() {
            return new UpdateEventRecordPlanRequest(this);
        } 

    } 

}
