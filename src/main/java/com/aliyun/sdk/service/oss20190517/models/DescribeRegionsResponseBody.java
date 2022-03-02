// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link DescribeRegionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRegionsResponseBody</p>
 */
public class DescribeRegionsResponseBody extends TeaModel {
    @ParentIgnore("RegionInfoList")
    @NameInMap("RegionInfo")
    private java.util.List < RegionInfo > regionInfos;

    private DescribeRegionsResponseBody(Builder builder) {
        this.regionInfos = builder.regionInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRegionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return regionInfos
     */
    public java.util.List < RegionInfo > getRegionInfos() {
        return this.regionInfos;
    }

    public static final class Builder {
        private java.util.List < RegionInfo > regionInfos; 

        /**
         * RegionInfo.
         */
        public Builder regionInfos(java.util.List < RegionInfo > regionInfos) {
            this.regionInfos = regionInfos;
            return this;
        }

        public DescribeRegionsResponseBody build() {
            return new DescribeRegionsResponseBody(this);
        } 

    } 

}
