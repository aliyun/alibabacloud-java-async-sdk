// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateFCTriggerRequest} extends {@link RequestModel}
 *
 * <p>UpdateFCTriggerRequest</p>
 */
public class UpdateFCTriggerRequest extends Request {
    @Body
    @NameInMap("FunctionARN")
    private String functionARN;

    @Body
    @NameInMap("Notes")
    private String notes;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Body
    @NameInMap("RoleARN")
    private String roleARN;

    @Body
    @NameInMap("SourceARN")
    private String sourceARN;

    @Query
    @NameInMap("TriggerARN")
    @Validation(required = true)
    private String triggerARN;

    private UpdateFCTriggerRequest(Builder builder) {
        super(builder);
        this.functionARN = builder.functionARN;
        this.notes = builder.notes;
        this.ownerId = builder.ownerId;
        this.roleARN = builder.roleARN;
        this.sourceARN = builder.sourceARN;
        this.triggerARN = builder.triggerARN;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFCTriggerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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

    public static final class Builder extends Request.Builder<UpdateFCTriggerRequest, Builder> {
        private String functionARN; 
        private String notes; 
        private Long ownerId; 
        private String roleARN; 
        private String sourceARN; 
        private String triggerARN; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFCTriggerRequest response) {
            super(response);
            this.functionARN = response.functionARN;
            this.notes = response.notes;
            this.ownerId = response.ownerId;
            this.roleARN = response.roleARN;
            this.sourceARN = response.sourceARN;
            this.triggerARN = response.triggerARN;
        } 

        /**
         * FunctionARN.
         */
        public Builder functionARN(String functionARN) {
            this.putBodyParameter("FunctionARN", functionARN);
            this.functionARN = functionARN;
            return this;
        }

        /**
         * Notes.
         */
        public Builder notes(String notes) {
            this.putBodyParameter("Notes", notes);
            this.notes = notes;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * RoleARN.
         */
        public Builder roleARN(String roleARN) {
            this.putBodyParameter("RoleARN", roleARN);
            this.roleARN = roleARN;
            return this;
        }

        /**
         * SourceARN.
         */
        public Builder sourceARN(String sourceARN) {
            this.putBodyParameter("SourceARN", sourceARN);
            this.sourceARN = sourceARN;
            return this;
        }

        /**
         * TriggerARN.
         */
        public Builder triggerARN(String triggerARN) {
            this.putQueryParameter("TriggerARN", triggerARN);
            this.triggerARN = triggerARN;
            return this;
        }

        @Override
        public UpdateFCTriggerRequest build() {
            return new UpdateFCTriggerRequest(this);
        } 

    } 

}
