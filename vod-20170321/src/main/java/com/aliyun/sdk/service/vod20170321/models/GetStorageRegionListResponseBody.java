// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetStorageRegionListResponseBody} extends {@link TeaModel}
 *
 * <p>GetStorageRegionListResponseBody</p>
 */
public class GetStorageRegionListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RegionList")
    private RegionList regionList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetStorageRegionListResponseBody(Builder builder) {
        this.regionList = builder.regionList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStorageRegionListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionList
     */
    public RegionList getRegionList() {
        return this.regionList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private RegionList regionList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetStorageRegionListResponseBody model) {
            this.regionList = model.regionList;
            this.requestId = model.requestId;
        } 

        /**
         * RegionList.
         */
        public Builder regionList(RegionList regionList) {
            this.regionList = regionList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetStorageRegionListResponseBody build() {
            return new GetStorageRegionListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetStorageRegionListResponseBody} extends {@link TeaModel}
     *
     * <p>GetStorageRegionListResponseBody</p>
     */
    public static class Region extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionID")
        private String regionID;

        private Region(Builder builder) {
            this.regionID = builder.regionID;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Region create() {
            return builder().build();
        }

        /**
         * @return regionID
         */
        public String getRegionID() {
            return this.regionID;
        }

        public static final class Builder {
            private String regionID; 

            private Builder() {
            } 

            private Builder(Region model) {
                this.regionID = model.regionID;
            } 

            /**
             * RegionID.
             */
            public Builder regionID(String regionID) {
                this.regionID = regionID;
                return this;
            }

            public Region build() {
                return new Region(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStorageRegionListResponseBody} extends {@link TeaModel}
     *
     * <p>GetStorageRegionListResponseBody</p>
     */
    public static class RegionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Region")
        private java.util.List<Region> region;

        private RegionList(Builder builder) {
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionList create() {
            return builder().build();
        }

        /**
         * @return region
         */
        public java.util.List<Region> getRegion() {
            return this.region;
        }

        public static final class Builder {
            private java.util.List<Region> region; 

            private Builder() {
            } 

            private Builder(RegionList model) {
                this.region = model.region;
            } 

            /**
             * Region.
             */
            public Builder region(java.util.List<Region> region) {
                this.region = region;
                return this;
            }

            public RegionList build() {
                return new RegionList(this);
            } 

        } 

    }
}
