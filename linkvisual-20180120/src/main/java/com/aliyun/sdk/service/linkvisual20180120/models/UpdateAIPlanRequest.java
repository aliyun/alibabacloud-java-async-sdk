// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAIPlanRequest} extends {@link RequestModel}
 *
 * <p>UpdateAIPlanRequest</p>
 */
public class UpdateAIPlanRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("PlanId")
    @Validation(required = true)
    private String planId;

    private UpdateAIPlanRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.planId = builder.planId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAIPlanRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return planId
     */
    public String getPlanId() {
        return this.planId;
    }

    public static final class Builder extends Request.Builder<UpdateAIPlanRequest, Builder> {
        private String description; 
        private String planId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAIPlanRequest response) {
            super(response);
            this.description = response.description;
            this.planId = response.planId;
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
         * PlanId.
         */
        public Builder planId(String planId) {
            this.putQueryParameter("PlanId", planId);
            this.planId = planId;
            return this;
        }

        @Override
        public UpdateAIPlanRequest build() {
            return new UpdateAIPlanRequest(this);
        } 

    } 

}
