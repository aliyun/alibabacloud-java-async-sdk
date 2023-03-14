// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribleLayer7InstanceRelationsRequest} extends {@link RequestModel}
 *
 * <p>DescribleLayer7InstanceRelationsRequest</p>
 */
public class DescribleLayer7InstanceRelationsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("DomainList")
    @Validation(required = true)
    private java.util.List < String > domainList;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    private DescribleLayer7InstanceRelationsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.domainList = builder.domainList;
        this.resourceGroupId = builder.resourceGroupId;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribleLayer7InstanceRelationsRequest create() {
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
     * @return domainList
     */
    public java.util.List < String > getDomainList() {
        return this.domainList;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<DescribleLayer7InstanceRelationsRequest, Builder> {
        private String regionId; 
        private java.util.List < String > domainList; 
        private String resourceGroupId; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribleLayer7InstanceRelationsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.domainList = request.domainList;
            this.resourceGroupId = request.resourceGroupId;
            this.sourceIp = request.sourceIp;
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
         * DomainList.
         */
        public Builder domainList(java.util.List < String > domainList) {
            this.putQueryParameter("DomainList", domainList);
            this.domainList = domainList;
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
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public DescribleLayer7InstanceRelationsRequest build() {
            return new DescribleLayer7InstanceRelationsRequest(this);
        } 

    } 

}
