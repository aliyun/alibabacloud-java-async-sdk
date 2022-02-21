// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDevicePurifyJobByPlanIdRequest} extends {@link RequestModel}
 *
 * <p>CreateDevicePurifyJobByPlanIdRequest</p>
 */
public class CreateDevicePurifyJobByPlanIdRequest extends Request {
    @Query
    @NameInMap("PlanId")
    @Validation(required = true)
    private String planId;

    @Query
    @NameInMap("Utc")
    @Validation(required = true)
    private Long utc;

    private CreateDevicePurifyJobByPlanIdRequest(Builder builder) {
        super(builder);
        this.planId = builder.planId;
        this.utc = builder.utc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDevicePurifyJobByPlanIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return planId
     */
    public String getPlanId() {
        return this.planId;
    }

    /**
     * @return utc
     */
    public Long getUtc() {
        return this.utc;
    }

    public static final class Builder extends Request.Builder<CreateDevicePurifyJobByPlanIdRequest, Builder> {
        private String planId; 
        private Long utc; 

        private Builder() {
            super();
        } 

        private Builder(CreateDevicePurifyJobByPlanIdRequest response) {
            super(response);
            this.planId = response.planId;
            this.utc = response.utc;
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
         * Utc.
         */
        public Builder utc(Long utc) {
            this.putQueryParameter("Utc", utc);
            this.utc = utc;
            return this;
        }

        @Override
        public CreateDevicePurifyJobByPlanIdRequest build() {
            return new CreateDevicePurifyJobByPlanIdRequest(this);
        } 

    } 

}
