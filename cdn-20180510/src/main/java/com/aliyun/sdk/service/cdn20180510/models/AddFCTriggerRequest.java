// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddFCTriggerRequest} extends {@link RequestModel}
 *
 * <p>AddFCTriggerRequest</p>
 */
public class AddFCTriggerRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EventMetaName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventMetaName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EventMetaVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventMetaVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FunctionARN")
    private String functionARN;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Notes")
    @com.aliyun.core.annotation.Validation(required = true)
    private String notes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleARN")
    @com.aliyun.core.annotation.Validation(required = true)
    private String roleARN;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceARN")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceARN;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TriggerARN")
    @com.aliyun.core.annotation.Validation(required = true)
    private String triggerARN;

    private AddFCTriggerRequest(Builder builder) {
        super(builder);
        this.eventMetaName = builder.eventMetaName;
        this.eventMetaVersion = builder.eventMetaVersion;
        this.functionARN = builder.functionARN;
        this.notes = builder.notes;
        this.roleARN = builder.roleARN;
        this.sourceARN = builder.sourceARN;
        this.triggerARN = builder.triggerARN;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddFCTriggerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventMetaName
     */
    public String getEventMetaName() {
        return this.eventMetaName;
    }

    /**
     * @return eventMetaVersion
     */
    public String getEventMetaVersion() {
        return this.eventMetaVersion;
    }

    /**
     * @return functionARN
     */
    public String getFunctionARN() {
        return this.functionARN;
    }

    /**
     * @return notes
     */
    public String getNotes() {
        return this.notes;
    }

    /**
     * @return roleARN
     */
    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * @return sourceARN
     */
    public String getSourceARN() {
        return this.sourceARN;
    }

    /**
     * @return triggerARN
     */
    public String getTriggerARN() {
        return this.triggerARN;
    }

    public static final class Builder extends Request.Builder<AddFCTriggerRequest, Builder> {
        private String eventMetaName; 
        private String eventMetaVersion; 
        private String functionARN; 
        private String notes; 
        private String roleARN; 
        private String sourceARN; 
        private String triggerARN; 

        private Builder() {
            super();
        } 

        private Builder(AddFCTriggerRequest request) {
            super(request);
            this.eventMetaName = request.eventMetaName;
            this.eventMetaVersion = request.eventMetaVersion;
            this.functionARN = request.functionARN;
            this.notes = request.notes;
            this.roleARN = request.roleARN;
            this.sourceARN = request.sourceARN;
            this.triggerARN = request.triggerARN;
        } 

        /**
         * The name of the event.
         */
        public Builder eventMetaName(String eventMetaName) {
            this.putBodyParameter("EventMetaName", eventMetaName);
            this.eventMetaName = eventMetaName;
            return this;
        }

        /**
         * The version of the event.
         */
        public Builder eventMetaVersion(String eventMetaVersion) {
            this.putBodyParameter("EventMetaVersion", eventMetaVersion);
            this.eventMetaVersion = eventMetaVersion;
            return this;
        }

        /**
         * The feature trigger.
         */
        public Builder functionARN(String functionARN) {
            this.putBodyParameter("FunctionARN", functionARN);
            this.functionARN = functionARN;
            return this;
        }

        /**
         * The remarks.
         */
        public Builder notes(String notes) {
            this.putBodyParameter("Notes", notes);
            this.notes = notes;
            return this;
        }

        /**
         * The assigned Resource Access Management (RAM) role.
         */
        public Builder roleARN(String roleARN) {
            this.putBodyParameter("RoleARN", roleARN);
            this.roleARN = roleARN;
            return this;
        }

        /**
         * The resources and filters for event listening.
         */
        public Builder sourceARN(String sourceARN) {
            this.putBodyParameter("SourceARN", sourceARN);
            this.sourceARN = sourceARN;
            return this;
        }

        /**
         * The trigger that corresponds to the Function Compute service.
         */
        public Builder triggerARN(String triggerARN) {
            this.putQueryParameter("TriggerARN", triggerARN);
            this.triggerARN = triggerARN;
            return this;
        }

        @Override
        public AddFCTriggerRequest build() {
            return new AddFCTriggerRequest(this);
        } 

    } 

}
