// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAclEntriesRequest} extends {@link RequestModel}
 *
 * <p>ModifyAclEntriesRequest</p>
 */
public class ModifyAclEntriesRequest extends Request {
    @Query
    @NameInMap("Policy")
    @Validation(required = true)
    private String policy;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SourceId")
    @Validation(required = true)
    private java.util.List < String > sourceId;

    @Query
    @NameInMap("SourceType")
    @Validation(required = true)
    private String sourceType;

    private ModifyAclEntriesRequest(Builder builder) {
        super(builder);
        this.policy = builder.policy;
        this.regionId = builder.regionId;
        this.sourceId = builder.sourceId;
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAclEntriesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sourceId
     */
    public java.util.List < String > getSourceId() {
        return this.sourceId;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    public static final class Builder extends Request.Builder<ModifyAclEntriesRequest, Builder> {
        private String policy; 
        private String regionId; 
        private java.util.List < String > sourceId; 
        private String sourceType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAclEntriesRequest request) {
            super(request);
            this.policy = request.policy;
            this.regionId = request.regionId;
            this.sourceId = request.sourceId;
            this.sourceType = request.sourceType;
        } 

        /**
         * The Internet access control policy.
         * <p>
         * 
         * Valid values:
         * 
         * *   allow: allows access to the Internet.
         * 
         * *   disable: forbids access to the Internet.
         */
        public Builder policy(String policy) {
            this.putQueryParameter("Policy", policy);
            this.policy = policy;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The instance IDs (office network IDs or cloud computer IDs) to which the Internet access control policy is applicable.
         */
        public Builder sourceId(java.util.List < String > sourceId) {
            this.putQueryParameter("SourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * The granularity to which the Internet access control policy is applicable.
         * <p>
         * 
         * Valid values:
         * 
         * *   desktop: cloud computer granularity.
         * 
         * *   vpc: office network granularity.
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        @Override
        public ModifyAclEntriesRequest build() {
            return new ModifyAclEntriesRequest(this);
        } 

    } 

}
