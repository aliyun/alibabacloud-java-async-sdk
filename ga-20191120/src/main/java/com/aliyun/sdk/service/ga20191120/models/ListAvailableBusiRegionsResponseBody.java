// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAvailableBusiRegionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAvailableBusiRegionsResponseBody</p>
 */
public class ListAvailableBusiRegionsResponseBody extends TeaModel {
    @NameInMap("Regions")
    private java.util.List < Regions> regions;

    @NameInMap("RequestId")
    private String requestId;

    private ListAvailableBusiRegionsResponseBody(Builder builder) {
        this.regions = builder.regions;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAvailableBusiRegionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return regions
     */
    public java.util.List < Regions> getRegions() {
        return this.regions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Regions> regions; 
        private String requestId; 

        /**
         * The information about the regions.
         */
        public Builder regions(java.util.List < Regions> regions) {
            this.regions = regions;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAvailableBusiRegionsResponseBody build() {
            return new ListAvailableBusiRegionsResponseBody(this);
        } 

    } 

    public static class Regions extends TeaModel {
        @NameInMap("ChinaMainland")
        private Boolean chinaMainland;

        @NameInMap("LocalName")
        private String localName;

        @NameInMap("Pop")
        private Boolean pop;

        @NameInMap("RegionId")
        private String regionId;

        private Regions(Builder builder) {
            this.chinaMainland = builder.chinaMainland;
            this.localName = builder.localName;
            this.pop = builder.pop;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Regions create() {
            return builder().build();
        }

        /**
         * @return chinaMainland
         */
        public Boolean getChinaMainland() {
            return this.chinaMainland;
        }

        /**
         * @return localName
         */
        public String getLocalName() {
            return this.localName;
        }

        /**
         * @return pop
         */
        public Boolean getPop() {
            return this.pop;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private Boolean chinaMainland; 
            private String localName; 
            private Boolean pop; 
            private String regionId; 

            /**
             * Indicates whether the region is in the Chinese mainland. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder chinaMainland(Boolean chinaMainland) {
                this.chinaMainland = chinaMainland;
                return this;
            }

            /**
             * The name of the region.
             */
            public Builder localName(String localName) {
                this.localName = localName;
                return this;
            }

            /**
             * Indicates whether it is a point of presence (PoP) of Alibaba Cloud. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder pop(Boolean pop) {
                this.pop = pop;
                return this;
            }

            /**
             * The ID of the region.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public Regions build() {
                return new Regions(this);
            } 

        } 

    }
}
