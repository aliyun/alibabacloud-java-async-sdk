// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

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
 * {@link UpdateFCTriggerRequest} extends {@link RequestModel}
 *
 * <p>UpdateFCTriggerRequest</p>
 */
public class UpdateFCTriggerRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FunctionARN")
    private String functionARN;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Notes")
    private String notes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleARN")
    private String roleARN;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceARN")
    private String sourceARN;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TriggerARN")
    @com.aliyun.core.annotation.Validation(required = true)
    private String triggerARN;

    private UpdateFCTriggerRequest(Builder builder) {
        super(builder);
        this.functionARN = builder.functionARN;
        this.notes = builder.notes;
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
        private String roleARN; 
        private String sourceARN; 
        private String triggerARN; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFCTriggerRequest request) {
            super(request);
            this.functionARN = request.functionARN;
            this.notes = request.notes;
            this.roleARN = request.roleARN;
            this.sourceARN = request.sourceARN;
            this.triggerARN = request.triggerARN;
        } 

        /**
         * <p>The feature trigger.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:fc:1223455566666:123:services/myservice/functions/myfunction</p>
         */
        public Builder functionARN(String functionARN) {
            this.putBodyParameter("FunctionARN", functionARN);
            this.functionARN = functionARN;
            return this;
        }

        /**
         * <p>The remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder notes(String notes) {
            this.putBodyParameter("Notes", notes);
            this.notes = notes;
            return this;
        }

        /**
         * <p>The assigned RAM role.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram:: 1234567890:role/aliyuncdneventnotificationrole</p>
         */
        public Builder roleARN(String roleARN) {
            this.putBodyParameter("RoleARN", roleARN);
            this.roleARN = roleARN;
            return this;
        }

        /**
         * <p>The resources and filters for event listening.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:cdn:*:1234567890:domain/example.com</p>
         */
        public Builder sourceARN(String sourceARN) {
            this.putBodyParameter("SourceARN", sourceARN);
            this.sourceARN = sourceARN;
            return this;
        }

        /**
         * <p>The trigger that corresponds to the Function Compute service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:fc:cn-beijing: 1234567890:services/FCTestService/functions/printEvent/triggers/testtrigger</p>
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
