// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20260120.models;

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
 * {@link ListRegionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRegionsResponseBody</p>
 */
public class ListRegionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RegionList")
    private java.util.List<RegionList> regionList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListRegionsResponseBody(Builder builder) {
        this.regionList = builder.regionList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRegionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionList
     */
    public java.util.List<RegionList> getRegionList() {
        return this.regionList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<RegionList> regionList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListRegionsResponseBody model) {
            this.regionList = model.regionList;
            this.requestId = model.requestId;
        } 

        /**
         * RegionList.
         */
        public Builder regionList(java.util.List<RegionList> regionList) {
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

        public ListRegionsResponseBody build() {
            return new ListRegionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRegionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRegionsResponseBody</p>
     */
    public static class RegionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RegionName")
        private String regionName;

        private RegionList(Builder builder) {
            this.regionId = builder.regionId;
            this.regionName = builder.regionName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionList create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return regionName
         */
        public String getRegionName() {
            return this.regionName;
        }

        public static final class Builder {
            private String regionId; 
            private String regionName; 

            private Builder() {
            } 

            private Builder(RegionList model) {
                this.regionId = model.regionId;
                this.regionName = model.regionName;
            } 

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * RegionName.
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            public RegionList build() {
                return new RegionList(this);
            } 

        } 

    }
}
