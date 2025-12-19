// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link ListBusinessRegionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListBusinessRegionsResponseBody</p>
 */
public class ListBusinessRegionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Long count;

    @com.aliyun.core.annotation.NameInMap("GeographicSubRegions")
    private java.util.List<GeographicSubRegions> geographicSubRegions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListBusinessRegionsResponseBody(Builder builder) {
        this.count = builder.count;
        this.geographicSubRegions = builder.geographicSubRegions;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBusinessRegionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return count
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * @return geographicSubRegions
     */
    public java.util.List<GeographicSubRegions> getGeographicSubRegions() {
        return this.geographicSubRegions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long count; 
        private java.util.List<GeographicSubRegions> geographicSubRegions; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListBusinessRegionsResponseBody model) {
            this.count = model.count;
            this.geographicSubRegions = model.geographicSubRegions;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The list of regions available for Express Connect circuits.</p>
         */
        public Builder geographicSubRegions(java.util.List<GeographicSubRegions> geographicSubRegions) {
            this.geographicSubRegions = geographicSubRegions;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>304FE68E-16D8-5B90-B2B3-FE5C5C08C24B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListBusinessRegionsResponseBody build() {
            return new ListBusinessRegionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListBusinessRegionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListBusinessRegionsResponseBody</p>
     */
    public static class GeographicSubRegions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private GeographicSubRegions(Builder builder) {
            this.name = builder.name;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GeographicSubRegions create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String name; 
            private String regionId; 

            private Builder() {
            } 

            private Builder(GeographicSubRegions model) {
                this.name = model.name;
                this.regionId = model.regionId;
            } 

            /**
             * <p>The name of the region where circuits are available.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the region where circuits are available.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public GeographicSubRegions build() {
                return new GeographicSubRegions(this);
            } 

        } 

    }
}
