// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeResourceRegionIdResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourceRegionIdResponseBody</p>
 */
public class DescribeResourceRegionIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceRegionIds")
    private java.util.List<String> resourceRegionIds;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<String> getResourceRegionIds() {
        return this.resourceRegionIds;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<String> resourceRegionIds; 

        private Builder() {
        } 

        private Builder(DescribeResourceRegionIdResponseBody model) {
            this.requestId = model.requestId;
            this.resourceRegionIds = model.resourceRegionIds;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F5905D3F-F674-5177-9E48-466DD3B8****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The region IDs of the resources that are added to Web Application Firewall (WAF) by using the SDK integration mode.</p>
         */
        public Builder resourceRegionIds(java.util.List<String> resourceRegionIds) {
            this.resourceRegionIds = resourceRegionIds;
            return this;
        }

        public DescribeResourceRegionIdResponseBody build() {
            return new DescribeResourceRegionIdResponseBody(this);
        } 

    } 

}
