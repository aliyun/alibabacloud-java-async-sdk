// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRegionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRegionsResponseBody</p>
 */
public class ListRegionsResponseBody extends TeaModel {
    @NameInMap("RegionModels")
    private java.util.List < RegionModels> regionModels;

    @NameInMap("RequestId")
    private String requestId;

    private ListRegionsResponseBody(Builder builder) {
        this.regionModels = builder.regionModels;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRegionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return regionModels
     */
    public java.util.List < RegionModels> getRegionModels() {
        return this.regionModels;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < RegionModels> regionModels; 
        private String requestId; 

        /**
         * RegionModels.
         */
        public Builder regionModels(java.util.List < RegionModels> regionModels) {
            this.regionModels = regionModels;
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

    public static class RegionModels extends TeaModel {
        @NameInMap("regionId")
        private String regionId;

        private RegionModels(Builder builder) {
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionModels create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String regionId; 

            /**
             * regionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public RegionModels build() {
                return new RegionModels(this);
            } 

        } 

    }
}
