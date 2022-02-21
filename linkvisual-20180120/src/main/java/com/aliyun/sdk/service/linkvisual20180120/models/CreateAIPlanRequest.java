// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAIPlanRequest} extends {@link RequestModel}
 *
 * <p>CreateAIPlanRequest</p>
 */
public class CreateAIPlanRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("PlanTemplateId")
    @Validation(required = true)
    private String planTemplateId;

    private CreateAIPlanRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.description = builder.description;
        this.planTemplateId = builder.planTemplateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAIPlanRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return planTemplateId
     */
    public String getPlanTemplateId() {
        return this.planTemplateId;
    }

    public static final class Builder extends Request.Builder<CreateAIPlanRequest, Builder> {
        private String appId; 
        private String description; 
        private String planTemplateId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAIPlanRequest response) {
            super(response);
            this.appId = response.appId;
            this.description = response.description;
            this.planTemplateId = response.planTemplateId;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
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
         * PlanTemplateId.
         */
        public Builder planTemplateId(String planTemplateId) {
            this.putQueryParameter("PlanTemplateId", planTemplateId);
            this.planTemplateId = planTemplateId;
            return this;
        }

        @Override
        public CreateAIPlanRequest build() {
            return new CreateAIPlanRequest(this);
        } 

    } 

}
