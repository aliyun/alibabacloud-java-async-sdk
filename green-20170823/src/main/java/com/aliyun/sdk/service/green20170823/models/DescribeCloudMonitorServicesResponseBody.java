// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCloudMonitorServicesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudMonitorServicesResponseBody</p>
 */
public class DescribeCloudMonitorServicesResponseBody extends TeaModel {
    @NameInMap("Items")
    private java.util.List < String > items;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeCloudMonitorServicesResponseBody(Builder builder) {
        this.items = builder.items;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudMonitorServicesResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public java.util.List < String > getItems() {
        return this.items;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < String > items; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Items.
         */
        public Builder items(java.util.List < String > items) {
            this.items = items;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCloudMonitorServicesResponseBody build() {
            return new DescribeCloudMonitorServicesResponseBody(this);
        } 

    } 

}
