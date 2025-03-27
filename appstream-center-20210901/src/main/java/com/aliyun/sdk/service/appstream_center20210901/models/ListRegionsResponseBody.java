// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
    @com.aliyun.core.annotation.NameInMap("RegionModels")
    private java.util.List<RegionModels> regionModels;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionModels
     */
    public java.util.List<RegionModels> getRegionModels() {
        return this.regionModels;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<RegionModels> regionModels; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListRegionsResponseBody model) {
            this.regionModels = model.regionModels;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The region IDs.</p>
         */
        public Builder regionModels(java.util.List<RegionModels> regionModels) {
            this.regionModels = regionModels;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
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
    public static class RegionModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("regionId")
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

            private Builder() {
            } 

            private Builder(RegionModels model) {
                this.regionId = model.regionId;
            } 

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
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
