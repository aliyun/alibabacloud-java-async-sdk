// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEventRecordPlanRequest} extends {@link RequestModel}
 *
 * <p>CreateEventRecordPlanRequest</p>
 */
public class CreateEventRecordPlanRequest extends Request {
    @Query
    @NameInMap("EventTypes")
    private String eventTypes;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

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

    private CreateEventRecordPlanRequest(Builder builder) {
        super(builder);
        this.eventTypes = builder.eventTypes;
        this.name = builder.name;
        this.preRecordDuration = builder.preRecordDuration;
        this.recordDuration = builder.recordDuration;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEventRecordPlanRequest create() {
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

    public static final class Builder extends Request.Builder<CreateEventRecordPlanRequest, Builder> {
        private String eventTypes; 
        private String name; 
        private Integer preRecordDuration; 
        private Integer recordDuration; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(CreateEventRecordPlanRequest request) {
            super(request);
            this.eventTypes = request.eventTypes;
            this.name = request.name;
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
        public CreateEventRecordPlanRequest build() {
            return new CreateEventRecordPlanRequest(this);
        } 

    } 

}
