// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeAvailableCrossRegionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAvailableCrossRegionsResponseBody</p>
 */
public class DescribeAvailableCrossRegionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Regions")
    private java.util.List<String> regions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAvailableCrossRegionsResponseBody(Builder builder) {
        this.regions = builder.regions;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAvailableCrossRegionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regions
     */
    public java.util.List<String> getRegions() {
        return this.regions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> regions; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeAvailableCrossRegionsResponseBody model) {
            this.regions = model.regions;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of regions available for cross-region backup.</p>
         * 
         * <strong>example:</strong>
         * <p>[\&quot;cn-beijing\&quot;, \&quot;cn-shanghai\&quot;, \&quot;cn-qingdao\&quot;, \&quot;cn-shenzhen\&quot;, \&quot;cn-hongkong\&quot;]</p>
         */
        public Builder regions(java.util.List<String> regions) {
            this.regions = regions;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D685D479-B36E-52B9-98FF-8402EA01F***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAvailableCrossRegionsResponseBody build() {
            return new DescribeAvailableCrossRegionsResponseBody(this);
        } 

    } 

}
