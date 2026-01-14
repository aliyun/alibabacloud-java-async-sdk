// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AssociateResourcesRequest} extends {@link RequestModel}
 *
 * <p>AssociateResourcesRequest</p>
 */
public class AssociateResourcesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceleratorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String acceleratorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssociatedMode")
    private String associatedMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssociatedResourceId")
    private String associatedResourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssociatedResourceRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String associatedResourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssociatedResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String associatedResourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private AssociateResourcesRequest(Builder builder) {
        super(builder);
        this.acceleratorId = builder.acceleratorId;
        this.associatedMode = builder.associatedMode;
        this.associatedResourceId = builder.associatedResourceId;
        this.associatedResourceRegionId = builder.associatedResourceRegionId;
        this.associatedResourceType = builder.associatedResourceType;
        this.dryRun = builder.dryRun;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociateResourcesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    /**
     * @return associatedMode
     */
    public String getAssociatedMode() {
        return this.associatedMode;
    }

    /**
     * @return associatedResourceId
     */
    public String getAssociatedResourceId() {
        return this.associatedResourceId;
    }

    /**
     * @return associatedResourceRegionId
     */
    public String getAssociatedResourceRegionId() {
        return this.associatedResourceRegionId;
    }

    /**
     * @return associatedResourceType
     */
    public String getAssociatedResourceType() {
        return this.associatedResourceType;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<AssociateResourcesRequest, Builder> {
        private String acceleratorId; 
        private String associatedMode; 
        private String associatedResourceId; 
        private String associatedResourceRegionId; 
        private String associatedResourceType; 
        private Boolean dryRun; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AssociateResourcesRequest request) {
            super(request);
            this.acceleratorId = request.acceleratorId;
            this.associatedMode = request.associatedMode;
            this.associatedResourceId = request.associatedResourceId;
            this.associatedResourceRegionId = request.associatedResourceRegionId;
            this.associatedResourceType = request.associatedResourceType;
            this.dryRun = request.dryRun;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ga-bp1odcab8tmno0hdq****</p>
         */
        public Builder acceleratorId(String acceleratorId) {
            this.putQueryParameter("AcceleratorId", acceleratorId);
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * AssociatedMode.
         */
        public Builder associatedMode(String associatedMode) {
            this.putQueryParameter("AssociatedMode", associatedMode);
            this.associatedMode = associatedMode;
            return this;
        }

        /**
         * AssociatedResourceId.
         */
        public Builder associatedResourceId(String associatedResourceId) {
            this.putQueryParameter("AssociatedResourceId", associatedResourceId);
            this.associatedResourceId = associatedResourceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder associatedResourceRegionId(String associatedResourceRegionId) {
            this.putQueryParameter("AssociatedResourceRegionId", associatedResourceRegionId);
            this.associatedResourceRegionId = associatedResourceRegionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>WAF</p>
         */
        public Builder associatedResourceType(String associatedResourceType) {
            this.putQueryParameter("AssociatedResourceType", associatedResourceType);
            this.associatedResourceType = associatedResourceType;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public AssociateResourcesRequest build() {
            return new AssociateResourcesRequest(this);
        } 

    } 

}
