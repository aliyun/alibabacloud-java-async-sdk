// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourceSupportRegionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourceSupportRegionsResponseBody</p>
 */
public class DescribeResourceSupportRegionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SupportRegions")
    private java.util.List < String > supportRegions;

    private DescribeResourceSupportRegionsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.supportRegions = builder.supportRegions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourceSupportRegionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return supportRegions
     */
    public java.util.List < String > getSupportRegions() {
        return this.supportRegions;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < String > supportRegions; 

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
        public Builder supportRegions(java.util.List < String > supportRegions) {
            this.supportRegions = supportRegions;
            return this;
        }

        public DescribeResourceSupportRegionsResponseBody build() {
            return new DescribeResourceSupportRegionsResponseBody(this);
        } 

    } 

}
