// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLayer7RuleRequest} extends {@link RequestModel}
 *
 * <p>CreateLayer7RuleRequest</p>
 */
public class CreateLayer7RuleRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    @Query
    @NameInMap("InstanceIds")
    private java.util.List < String > instanceIds;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("RsType")
    @Validation(required = true)
    private Integer rsType;

    @Query
    @NameInMap("Rules")
    @Validation(required = true)
    private String rules;

    private CreateLayer7RuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.domain = builder.domain;
        this.instanceIds = builder.instanceIds;
        this.resourceGroupId = builder.resourceGroupId;
        this.rsType = builder.rsType;
        this.rules = builder.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLayer7RuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return instanceIds
     */
    public java.util.List < String > getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return rsType
     */
    public Integer getRsType() {
        return this.rsType;
    }

    /**
     * @return rules
     */
    public String getRules() {
        return this.rules;
    }

    public static final class Builder extends Request.Builder<CreateLayer7RuleRequest, Builder> {
        private String regionId; 
        private String domain; 
        private java.util.List < String > instanceIds; 
        private String resourceGroupId; 
        private Integer rsType; 
        private String rules; 

        private Builder() {
            super();
        } 

        private Builder(CreateLayer7RuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.domain = request.domain;
            this.instanceIds = request.instanceIds;
            this.resourceGroupId = request.resourceGroupId;
            this.rsType = request.rsType;
            this.rules = request.rules;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * RsType.
         */
        public Builder rsType(Integer rsType) {
            this.putQueryParameter("RsType", rsType);
            this.rsType = rsType;
            return this;
        }

        /**
         * Rules.
         */
        public Builder rules(String rules) {
            this.putQueryParameter("Rules", rules);
            this.rules = rules;
            return this;
        }

        @Override
        public CreateLayer7RuleRequest build() {
            return new CreateLayer7RuleRequest(this);
        } 

    } 

}
