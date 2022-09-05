// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrUpdateSilencePolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateOrUpdateSilencePolicyRequest</p>
 */
public class CreateOrUpdateSilencePolicyRequest extends Request {
    @Body
    @NameInMap("Id")
    private Long id;

    @Body
    @NameInMap("MatchingRules")
    private String matchingRules;

    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    private CreateOrUpdateSilencePolicyRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.matchingRules = builder.matchingRules;
        this.name = builder.name;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrUpdateSilencePolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return matchingRules
     */
    public String getMatchingRules() {
        return this.matchingRules;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateOrUpdateSilencePolicyRequest, Builder> {
        private Long id; 
        private String matchingRules; 
        private String name; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateOrUpdateSilencePolicyRequest request) {
            super(request);
            this.id = request.id;
            this.matchingRules = request.matchingRules;
            this.name = request.name;
            this.regionId = request.regionId;
        } 

        /**
         * 静默策略ID
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * 分派规则
         */
        public Builder matchingRules(String matchingRules) {
            this.putBodyParameter("MatchingRules", matchingRules);
            this.matchingRules = matchingRules;
            return this;
        }

        /**
         * 静默策略名称
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateOrUpdateSilencePolicyRequest build() {
            return new CreateOrUpdateSilencePolicyRequest(this);
        } 

    } 

}
