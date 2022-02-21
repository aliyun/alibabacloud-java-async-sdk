// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateWebRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateWebRuleRequest</p>
 */
public class CreateWebRuleRequest extends Request {
    @Query
    @NameInMap("DefenseId")
    private String defenseId;

    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    @Query
    @NameInMap("HttpsExt")
    private String httpsExt;

    @Query
    @NameInMap("InstanceIds")
    private java.util.List < String > instanceIds;

    @Host
    @NameInMap("RegionId")
    private String regionId;

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

    private CreateWebRuleRequest(Builder builder) {
        super(builder);
        this.defenseId = builder.defenseId;
        this.domain = builder.domain;
        this.httpsExt = builder.httpsExt;
        this.instanceIds = builder.instanceIds;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.rsType = builder.rsType;
        this.rules = builder.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWebRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return defenseId
     */
    public String getDefenseId() {
        return this.defenseId;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return httpsExt
     */
    public String getHttpsExt() {
        return this.httpsExt;
    }

    /**
     * @return instanceIds
     */
    public java.util.List < String > getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<CreateWebRuleRequest, Builder> {
        private String defenseId; 
        private String domain; 
        private String httpsExt; 
        private java.util.List < String > instanceIds; 
        private String regionId; 
        private String resourceGroupId; 
        private Integer rsType; 
        private String rules; 

        private Builder() {
            super();
        } 

        private Builder(CreateWebRuleRequest response) {
            super(response);
            this.defenseId = response.defenseId;
            this.domain = response.domain;
            this.httpsExt = response.httpsExt;
            this.instanceIds = response.instanceIds;
            this.regionId = response.regionId;
            this.resourceGroupId = response.resourceGroupId;
            this.rsType = response.rsType;
            this.rules = response.rules;
        } 

        /**
         * DefenseId.
         */
        public Builder defenseId(String defenseId) {
            this.putQueryParameter("DefenseId", defenseId);
            this.defenseId = defenseId;
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
         * HttpsExt.
         */
        public Builder httpsExt(String httpsExt) {
            this.putQueryParameter("HttpsExt", httpsExt);
            this.httpsExt = httpsExt;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
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
        public CreateWebRuleRequest build() {
            return new CreateWebRuleRequest(this);
        } 

    } 

}
