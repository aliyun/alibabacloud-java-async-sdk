// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DetachSceneDefenseObjectRequest} extends {@link RequestModel}
 *
 * <p>DetachSceneDefenseObjectRequest</p>
 */
public class DetachSceneDefenseObjectRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObjectType")
    private String objectType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Objects")
    @com.aliyun.core.annotation.Validation(required = true)
    private String objects;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policyId;

    private DetachSceneDefenseObjectRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.objectType = builder.objectType;
        this.objects = builder.objects;
        this.policyId = builder.policyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachSceneDefenseObjectRequest create() {
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

    public static final class Builder extends Request.Builder<DetachSceneDefenseObjectRequest, Builder> {
        private String regionId; 
        private String objectType; 
        private String objects; 
        private String policyId; 

        private Builder() {
            super();
        } 

        private Builder(DetachSceneDefenseObjectRequest request) {
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
         * <p>The type of the object. Set the value to <strong>Domain</strong>, which indicates a domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>Domain</p>
         */
        public Builder objectType(String objectType) {
            this.putQueryParameter("ObjectType", objectType);
            this.objectType = objectType;
            return this;
        }

        /**
         * <p>The protection asset that you want to remove from a policy. Separate multiple protection assets with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
         */
        public Builder objects(String objects) {
            this.putQueryParameter("Objects", objects);
            this.objects = objects;
            return this;
        }

        /**
         * <p>The ID of the policy.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/159382.html">DescribeSceneDefensePolicies</a> operation to query the IDs of all policies.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>321a-fd31-df51-****</p>
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        @Override
        public DetachSceneDefenseObjectRequest build() {
            return new DetachSceneDefenseObjectRequest(this);
        } 

    } 

}
