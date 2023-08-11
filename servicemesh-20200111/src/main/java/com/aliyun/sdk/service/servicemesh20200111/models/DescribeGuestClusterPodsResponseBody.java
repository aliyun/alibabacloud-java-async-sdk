// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGuestClusterPodsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGuestClusterPodsResponseBody</p>
 */
public class DescribeGuestClusterPodsResponseBody extends TeaModel {
    @NameInMap("PodList")
    private java.util.List < String > podList;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeGuestClusterPodsResponseBody(Builder builder) {
        this.podList = builder.podList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGuestClusterPodsResponseBody create() {
        return builder().build();
    }

    /**
     * @return podList
     */
    public java.util.List < String > getPodList() {
        return this.podList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > podList; 
        private String requestId; 

        /**
         * The names of the queried pods.
         */
        public Builder podList(java.util.List < String > podList) {
            this.podList = podList;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeGuestClusterPodsResponseBody build() {
            return new DescribeGuestClusterPodsResponseBody(this);
        } 

    } 

}
