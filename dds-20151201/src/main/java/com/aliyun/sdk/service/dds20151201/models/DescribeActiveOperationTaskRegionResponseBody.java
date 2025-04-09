// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
 * {@link DescribeActiveOperationTaskRegionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeActiveOperationTaskRegionResponseBody</p>
 */
public class DescribeActiveOperationTaskRegionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RegionList")
    private java.util.List<RegionList> regionList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeActiveOperationTaskRegionResponseBody(Builder builder) {
        this.regionList = builder.regionList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeActiveOperationTaskRegionResponseBody create() {
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

        private Builder(DescribeActiveOperationTaskRegionResponseBody model) {
            this.regionList = model.regionList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The region ID.</p>
         */
        public Builder regionList(java.util.List<RegionList> regionList) {
            this.regionList = regionList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3C4A2494-XXXX-XXXX-93CF-548DB3375193</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeActiveOperationTaskRegionResponseBody build() {
            return new DescribeActiveOperationTaskRegionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeActiveOperationTaskRegionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeActiveOperationTaskRegionResponseBody</p>
     */
    public static class RegionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        private RegionList(Builder builder) {
            this.count = builder.count;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionList create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        public static final class Builder {
            private Integer count; 
            private String region; 

            private Builder() {
            } 

            private Builder(RegionList model) {
                this.count = model.count;
                this.region = model.region;
            } 

            /**
             * <p>The total number of tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The region ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public RegionList build() {
                return new RegionList(this);
            } 

        } 

    }
}
