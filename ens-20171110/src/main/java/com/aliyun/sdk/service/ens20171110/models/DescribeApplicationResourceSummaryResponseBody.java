// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApplicationResourceSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApplicationResourceSummaryResponseBody</p>
 */
public class DescribeApplicationResourceSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationResource")
    private String applicationResource;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeApplicationResourceSummaryResponseBody(Builder builder) {
        this.applicationResource = builder.applicationResource;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicationResourceSummaryResponseBody create() {
        return builder().build();
    }

    /**
     * @return applicationResource
     */
    public String getApplicationResource() {
        return this.applicationResource;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String applicationResource; 
        private String requestId; 

        /**
         * The statistical information about the resource quota and usage in different regions.
         */
        public Builder applicationResource(String applicationResource) {
            this.applicationResource = applicationResource;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeApplicationResourceSummaryResponseBody build() {
            return new DescribeApplicationResourceSummaryResponseBody(this);
        } 

    } 

}
