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
 * {@link DescribeAnycastServerRegionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAnycastServerRegionsResponseBody</p>
 */
public class DescribeAnycastServerRegionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AnycastServerRegionList")
    private java.util.List<AnycastServerRegionList> anycastServerRegionList;

    @com.aliyun.core.annotation.NameInMap("Count")
    private String count;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return anycastServerRegionList
     */
    public java.util.List<AnycastServerRegionList> getAnycastServerRegionList() {
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
        private java.util.List<AnycastServerRegionList> anycastServerRegionList; 
        private String count; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeAnycastServerRegionsResponseBody model) {
            this.anycastServerRegionList = model.anycastServerRegionList;
            this.count = model.count;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of regions where you can associate Anycast EIPs with endpoints.</p>
         */
        public Builder anycastServerRegionList(java.util.List<AnycastServerRegionList> anycastServerRegionList) {
            this.anycastServerRegionList = anycastServerRegionList;
            return this;
        }

        /**
         * <p>The number of returned entries.</p>
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

        public DescribeAnycastServerRegionsResponseBody build() {
            return new DescribeAnycastServerRegionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAnycastServerRegionsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAnycastServerRegionsResponseBody</p>
     */
    public static class AnycastServerRegionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RegionName")
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

            private Builder() {
            } 

            private Builder(AnycastServerRegionList model) {
                this.regionId = model.regionId;
                this.regionName = model.regionName;
            } 

            /**
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>eu-west-1</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The name of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>eu-west-1-gb33-a01</p>
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
