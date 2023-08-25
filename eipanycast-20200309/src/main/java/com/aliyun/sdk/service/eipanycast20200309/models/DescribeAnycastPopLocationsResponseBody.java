// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eipanycast20200309.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAnycastPopLocationsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAnycastPopLocationsResponseBody</p>
 */
public class DescribeAnycastPopLocationsResponseBody extends TeaModel {
    @NameInMap("AnycastPopLocationList")
    private java.util.List < AnycastPopLocationList> anycastPopLocationList;

    @NameInMap("Count")
    private String count;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeAnycastPopLocationsResponseBody(Builder builder) {
        this.anycastPopLocationList = builder.anycastPopLocationList;
        this.count = builder.count;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAnycastPopLocationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return anycastPopLocationList
     */
    public java.util.List < AnycastPopLocationList> getAnycastPopLocationList() {
        return this.anycastPopLocationList;
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
        private java.util.List < AnycastPopLocationList> anycastPopLocationList; 
        private String count; 
        private String requestId; 

        /**
         * The list of access points in the specified access area.
         */
        public Builder anycastPopLocationList(java.util.List < AnycastPopLocationList> anycastPopLocationList) {
            this.anycastPopLocationList = anycastPopLocationList;
            return this;
        }

        /**
         * The number of access points.
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

        public DescribeAnycastPopLocationsResponseBody build() {
            return new DescribeAnycastPopLocationsResponseBody(this);
        } 

    } 

    public static class AnycastPopLocationList extends TeaModel {
        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RegionName")
        private String regionName;

        private AnycastPopLocationList(Builder builder) {
            this.regionId = builder.regionId;
            this.regionName = builder.regionName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AnycastPopLocationList create() {
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
             * The ID of the region where the access point is deployed.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The name of the region where the access point is deployed.
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            public AnycastPopLocationList build() {
                return new AnycastPopLocationList(this);
            } 

        } 

    }
}
