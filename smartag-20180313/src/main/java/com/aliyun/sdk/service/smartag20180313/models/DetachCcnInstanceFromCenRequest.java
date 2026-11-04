// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link DetachCcnInstanceFromCenRequest} extends {@link RequestModel}
 *
 * <p>DetachCcnInstanceFromCenRequest</p>
 */
public class DetachCcnInstanceFromCenRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CcnId")
    private String ccnId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CenId")
    private String cenId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionBindingList")
    private java.util.List<RegionBindingList> regionBindingList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DetachCcnInstanceFromCenRequest(Builder builder) {
        super(builder);
        this.ccnId = builder.ccnId;
        this.cenId = builder.cenId;
        this.regionBindingList = builder.regionBindingList;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachCcnInstanceFromCenRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ccnId
     */
    public String getCcnId() {
        return this.ccnId;
    }

    /**
     * @return cenId
     */
    public String getCenId() {
        return this.cenId;
    }

    /**
     * @return regionBindingList
     */
    public java.util.List<RegionBindingList> getRegionBindingList() {
        return this.regionBindingList;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DetachCcnInstanceFromCenRequest, Builder> {
        private String ccnId; 
        private String cenId; 
        private java.util.List<RegionBindingList> regionBindingList; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DetachCcnInstanceFromCenRequest request) {
            super(request);
            this.ccnId = request.ccnId;
            this.cenId = request.cenId;
            this.regionBindingList = request.regionBindingList;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the attached Cloud Connect Network (CCN).</p>
         * 
         * <strong>example:</strong>
         * <p>ccn-isdjvvkexkrpk*****</p>
         */
        public Builder ccnId(String ccnId) {
            this.putQueryParameter("CcnId", ccnId);
            this.ccnId = ccnId;
            return this;
        }

        /**
         * <p>The ID of the CEN instance from which you want to revoke authorization.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-9j8gkkj7z9vie9a8z9</p>
         */
        public Builder cenId(String cenId) {
            this.putQueryParameter("CenId", cenId);
            this.cenId = cenId;
            return this;
        }

        /**
         * <p>The list of transit routers to be disassociated from the CCN.</p>
         */
        public Builder regionBindingList(java.util.List<RegionBindingList> regionBindingList) {
            String regionBindingListShrink = shrink(regionBindingList, "RegionBindingList", "json");
            this.putQueryParameter("RegionBindingList", regionBindingListShrink);
            this.regionBindingList = regionBindingList;
            return this;
        }

        /**
         * <p>The region ID of the Smart Access Gateway instance. You can call the DescribeRegions operation to query the regions supported by Smart Access Gateway and the corresponding region IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DetachCcnInstanceFromCenRequest build() {
            return new DetachCcnInstanceFromCenRequest(this);
        } 

    } 

    /**
     * 
     * {@link DetachCcnInstanceFromCenRequest} extends {@link TeaModel}
     *
     * <p>DetachCcnInstanceFromCenRequest</p>
     */
    public static class RegionBindingList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("TransitRouterId")
        private String transitRouterId;

        private RegionBindingList(Builder builder) {
            this.regionId = builder.regionId;
            this.transitRouterId = builder.transitRouterId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionBindingList create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return transitRouterId
         */
        public String getTransitRouterId() {
            return this.transitRouterId;
        }

        public static final class Builder {
            private String regionId; 
            private String transitRouterId; 

            private Builder() {
            } 

            private Builder(RegionBindingList model) {
                this.regionId = model.regionId;
                this.transitRouterId = model.transitRouterId;
            } 

            /**
             * <p>The region ID of the transit router to be disassociated.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The instance ID of the forward routing transit router.</p>
             * 
             * <strong>example:</strong>
             * <p>tr-uf6mja2ssto2twh8u03xw</p>
             */
            public Builder transitRouterId(String transitRouterId) {
                this.transitRouterId = transitRouterId;
                return this;
            }

            public RegionBindingList build() {
                return new RegionBindingList(this);
            } 

        } 

    }
}
