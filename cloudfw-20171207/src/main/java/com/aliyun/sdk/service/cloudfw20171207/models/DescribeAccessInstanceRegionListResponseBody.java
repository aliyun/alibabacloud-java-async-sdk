// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeAccessInstanceRegionListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccessInstanceRegionListResponseBody</p>
 */
public class DescribeAccessInstanceRegionListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RegionNoList")
    private java.util.List<String> regionNoList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAccessInstanceRegionListResponseBody(Builder builder) {
        this.regionNoList = builder.regionNoList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccessInstanceRegionListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionNoList
     */
    public java.util.List<String> getRegionNoList() {
        return this.regionNoList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> regionNoList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeAccessInstanceRegionListResponseBody model) {
            this.regionNoList = model.regionNoList;
            this.requestId = model.requestId;
        } 

        /**
         * RegionNoList.
         */
        public Builder regionNoList(java.util.List<String> regionNoList) {
            this.regionNoList = regionNoList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAccessInstanceRegionListResponseBody build() {
            return new DescribeAccessInstanceRegionListResponseBody(this);
        } 

    } 

}
