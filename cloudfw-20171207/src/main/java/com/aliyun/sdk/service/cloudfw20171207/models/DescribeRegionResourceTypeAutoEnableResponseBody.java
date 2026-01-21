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
 * {@link DescribeRegionResourceTypeAutoEnableResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRegionResourceTypeAutoEnableResponseBody</p>
 */
public class DescribeRegionResourceTypeAutoEnableResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RegionResourceAutoEnable")
    private java.util.Map<String, java.util.Map<String, ?>> regionResourceAutoEnable;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeRegionResourceTypeAutoEnableResponseBody(Builder builder) {
        this.regionResourceAutoEnable = builder.regionResourceAutoEnable;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRegionResourceTypeAutoEnableResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionResourceAutoEnable
     */
    public java.util.Map<String, java.util.Map<String, ?>> getRegionResourceAutoEnable() {
        return this.regionResourceAutoEnable;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.Map<String, java.util.Map<String, ?>> regionResourceAutoEnable; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeRegionResourceTypeAutoEnableResponseBody model) {
            this.regionResourceAutoEnable = model.regionResourceAutoEnable;
            this.requestId = model.requestId;
        } 

        /**
         * RegionResourceAutoEnable.
         */
        public Builder regionResourceAutoEnable(java.util.Map<String, java.util.Map<String, ?>> regionResourceAutoEnable) {
            this.regionResourceAutoEnable = regionResourceAutoEnable;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>B2841452-CB8D-4F7D-B247-38E1CF7334F8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRegionResourceTypeAutoEnableResponseBody build() {
            return new DescribeRegionResourceTypeAutoEnableResponseBody(this);
        } 

    } 

}
