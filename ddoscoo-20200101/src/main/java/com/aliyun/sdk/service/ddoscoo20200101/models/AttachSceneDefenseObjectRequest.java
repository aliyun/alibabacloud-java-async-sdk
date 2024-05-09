// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachSceneDefenseObjectRequest} extends {@link RequestModel}
 *
 * <p>AttachSceneDefenseObjectRequest</p>
 */
public class AttachSceneDefenseObjectRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObjectType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String objectType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Objects")
    @com.aliyun.core.annotation.Validation(required = true)
    private String objects;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyId;

    private AttachSceneDefenseObjectRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.objectType = builder.objectType;
        this.objects = builder.objects;
        this.policyId = builder.policyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachSceneDefenseObjectRequest create() {
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
     * @return objectType
     */
    public String getObjectType() {
        return this.objectType;
    }

    /**
     * @return objects
     */
    public String getObjects() {
        return this.objects;
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    public static final class Builder extends Request.Builder<AttachSceneDefenseObjectRequest, Builder> {
        private String regionId; 
        private String objectType; 
        private String objects; 
        private String policyId; 

        private Builder() {
            super();
        } 

        private Builder(AttachSceneDefenseObjectRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.objectType = request.objectType;
            this.objects = request.objects;
            this.policyId = request.policyId;
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
         * The type of the object. Set the value to **Domain**, which indicates a domain name.
         */
        public Builder objectType(String objectType) {
            this.putQueryParameter("ObjectType", objectType);
            this.objectType = objectType;
            return this;
        }

        /**
         * The object that you want to add to the policy. Separate multiple objects with commas (,).
         */
        public Builder objects(String objects) {
            this.putQueryParameter("Objects", objects);
            this.objects = objects;
            return this;
        }

        /**
         * The ID of the policy.
         * <p>
         * 
         * > You can call the [DescribeSceneDefensePolicies](~~159382~~) operation to query the IDs of all policies.
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        @Override
        public AttachSceneDefenseObjectRequest build() {
            return new AttachSceneDefenseObjectRequest(this);
        } 

    } 

}
