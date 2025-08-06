// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eipanycast20200309.models;

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
 * {@link DescribeAnycastPopLocationsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAnycastPopLocationsResponseBody</p>
 */
public class DescribeAnycastPopLocationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AnycastPopLocationList")
    private java.util.List<AnycastPopLocationList> anycastPopLocationList;

    @com.aliyun.core.annotation.NameInMap("Count")
    private String count;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return anycastPopLocationList
     */
    public java.util.List<AnycastPopLocationList> getAnycastPopLocationList() {
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
        private java.util.List<AnycastPopLocationList> anycastPopLocationList; 
        private String count; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeAnycastPopLocationsResponseBody model) {
            this.anycastPopLocationList = model.anycastPopLocationList;
            this.count = model.count;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of access points in the specified access area.</p>
         */
        public Builder anycastPopLocationList(java.util.List<AnycastPopLocationList> anycastPopLocationList) {
            this.anycastPopLocationList = anycastPopLocationList;
            return this;
        }

        /**
         * <p>The number of access points.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder count(String count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4EC47282-1B74-4534-BD0E-403F3EE64CAF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAnycastPopLocationsResponseBody build() {
            return new DescribeAnycastPopLocationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAnycastPopLocationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAnycastPopLocationsResponseBody</p>
     */
    public static class AnycastPopLocationList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RegionName")
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

            private Builder() {
            } 

            private Builder(AnycastPopLocationList model) {
                this.regionId = model.regionId;
                this.regionName = model.regionName;
            } 

            /**
             * <p>The ID of the region where the access point is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>us-west-1-pop</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The name of the region where the access point is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>us-west-1-pop</p>
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
