// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourceRegionIdResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourceRegionIdResponseBody</p>
 */
public class DescribeResourceRegionIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceRegionIds")
    private java.util.List < String > resourceRegionIds;

    private DescribeResourceRegionIdResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceRegionIds = builder.resourceRegionIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourceRegionIdResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceRegionIds
     */
    public java.util.List < String > getResourceRegionIds() {
        return this.resourceRegionIds;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < String > resourceRegionIds; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The region IDs.
         */
        public Builder resourceRegionIds(java.util.List < String > resourceRegionIds) {
            this.resourceRegionIds = resourceRegionIds;
            return this;
        }

        public DescribeResourceRegionIdResponseBody build() {
            return new DescribeResourceRegionIdResponseBody(this);
        } 

    } 

}
