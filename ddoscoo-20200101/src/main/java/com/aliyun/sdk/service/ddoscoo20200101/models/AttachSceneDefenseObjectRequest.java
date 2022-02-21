// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachSceneDefenseObjectRequest} extends {@link RequestModel}
 *
 * <p>AttachSceneDefenseObjectRequest</p>
 */
public class AttachSceneDefenseObjectRequest extends Request {
    @Query
    @NameInMap("ObjectType")
    @Validation(required = true)
    private String objectType;

    @Query
    @NameInMap("Objects")
    @Validation(required = true)
    private String objects;

    @Query
    @NameInMap("PolicyId")
    @Validation(required = true)
    private String policyId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private AttachSceneDefenseObjectRequest(Builder builder) {
        super(builder);
        this.objectType = builder.objectType;
        this.objects = builder.objects;
        this.policyId = builder.policyId;
        this.regionId = builder.regionId;
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<AttachSceneDefenseObjectRequest, Builder> {
        private String objectType; 
        private String objects; 
        private String policyId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AttachSceneDefenseObjectRequest response) {
            super(response);
            this.objectType = response.objectType;
            this.objects = response.objects;
            this.policyId = response.policyId;
            this.regionId = response.regionId;
        } 

        /**
         * ObjectType.
         */
        public Builder objectType(String objectType) {
            this.putQueryParameter("ObjectType", objectType);
            this.objectType = objectType;
            return this;
        }

        /**
         * Objects.
         */
        public Builder objects(String objects) {
            this.putQueryParameter("Objects", objects);
            this.objects = objects;
            return this;
        }

        /**
         * PolicyId.
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
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

        @Override
        public AttachSceneDefenseObjectRequest build() {
            return new AttachSceneDefenseObjectRequest(this);
        } 

    } 

}
