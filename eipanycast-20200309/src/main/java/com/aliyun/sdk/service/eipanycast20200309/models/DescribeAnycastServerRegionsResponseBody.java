// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eipanycast20200309.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAnycastServerRegionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAnycastServerRegionsResponseBody</p>
 */
public class DescribeAnycastServerRegionsResponseBody extends TeaModel {
    @NameInMap("AnycastServerRegionList")
    private java.util.List < AnycastServerRegionList> anycastServerRegionList;

    @NameInMap("Count")
    private String count;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeAnycastServerRegionsResponseBody(Builder builder) {
        this.anycastServerRegionList = builder.anycastServerRegionList;
        this.count = builder.count;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAnycastServerRegionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return anycastServerRegionList
     */
    public java.util.List < AnycastServerRegionList> getAnycastServerRegionList() {
        return this.anycastServerRegionList;
    }

    /**
     * @return count
     */
    public String getCount() {
        return this.count;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < AnycastServerRegionList> anycastServerRegionList; 
        private String count; 
        private String requestId; 

        /**
         * The list of regions where you can associate Anycast EIPs with backend servers.
         */
        public Builder anycastServerRegionList(java.util.List < AnycastServerRegionList> anycastServerRegionList) {
            this.anycastServerRegionList = anycastServerRegionList;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder count(String count) {
            this.count = count;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAnycastServerRegionsResponseBody build() {
            return new DescribeAnycastServerRegionsResponseBody(this);
        } 

    } 

    public static class AnycastServerRegionList extends TeaModel {
        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RegionName")
        private String regionName;

        private AnycastServerRegionList(Builder builder) {
            this.regionId = builder.regionId;
            this.regionName = builder.regionName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AnycastServerRegionList create() {
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

            /**
             * The ID of the region.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The name of the region.
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            public AnycastServerRegionList build() {
                return new AnycastServerRegionList(this);
            } 

        } 

    }
}
