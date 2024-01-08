// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRecordPlanRequest} extends {@link RequestModel}
 *
 * <p>UpdateRecordPlanRequest</p>
 */
public class UpdateRecordPlanRequest extends Request {
    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("PlanId")
    @Validation(required = true)
    private String planId;

    @Query
    @NameInMap("TemplateId")
    @Validation(required = true)
    private String templateId;

    private UpdateRecordPlanRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.planId = builder.planId;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRecordPlanRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<UpdateRecordPlanRequest, Builder> {
        private String name; 
        private String planId; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRecordPlanRequest request) {
            super(request);
            this.name = request.name;
            this.planId = request.planId;
            this.templateId = request.templateId;
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
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public UpdateRecordPlanRequest build() {
            return new UpdateRecordPlanRequest(this);
        } 

    } 

}
