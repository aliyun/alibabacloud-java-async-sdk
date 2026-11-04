// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

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
 * {@link CreateEventRecordPlanRequest} extends {@link RequestModel}
 *
 * <p>CreateEventRecordPlanRequest</p>
 */
public class CreateEventRecordPlanRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventTypes")
    private String eventTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreRecordDuration")
    private Integer preRecordDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordDuration")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer recordDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The types of intelligent alert events. Valid values:</p>
         * <ul>
         * <li>0: all intelligent alert events.</li>
         * <li>Multiple intelligent alert events: enter the sequence numbers of the intelligent alert events and separate them with commas (,). Example: <code>10001,10002</code>.<blockquote>
         * <p>You can specify up to 10 intelligent alert events at a time.</p>
         * </blockquote>
         * </li>
         * </ul>
         * <p>To view all types of intelligent alert events, log on to the IoT Platform console, go to the <strong>Product Details</strong> page, and click the <strong>Define Feature</strong> tab. For more information, see <a href="https://help.aliyun.com/document_detail/207701.html">View intelligent alert event types</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder eventTypes(String eventTypes) {
            this.putQueryParameter("EventTypes", eventTypes);
            this.eventTypes = eventTypes;
            return this;
        }

        /**
         * <p>The name of the recording plan.</p>
         * <p>The name must be less than 48 characters in length and can contain letters, digits, and the following special characters: hyphens (-), underscores (_), at signs (@), periods (.), and colons (:).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>plan1</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The pre-recording duration in seconds. Default value: 0. Maximum value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder preRecordDuration(Integer preRecordDuration) {
            this.putQueryParameter("PreRecordDuration", preRecordDuration);
            this.preRecordDuration = preRecordDuration;
            return this;
        }

        /**
         * <p>The recording duration in seconds, including the pre-recording duration. Valid values: 10 to 60.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder recordDuration(Integer recordDuration) {
            this.putQueryParameter("RecordDuration", recordDuration);
            this.recordDuration = recordDuration;
            return this;
        }

        /**
         * <p>The ID of the time template. You can call the <a href="https://help.aliyun.com/document_detail/107890.html">QueryTimeTemplate</a> operation to query the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fc82774fa749485bad7d719f9670****</p>
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
