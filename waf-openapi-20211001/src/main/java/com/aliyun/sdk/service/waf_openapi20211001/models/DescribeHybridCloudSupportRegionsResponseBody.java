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
 * {@link DescribeHybridCloudSupportRegionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHybridCloudSupportRegionsResponseBody</p>
 */
public class DescribeHybridCloudSupportRegionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SupportRegions")
    private java.util.List<String> supportRegions;

    private DescribeHybridCloudSupportRegionsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.supportRegions = builder.supportRegions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHybridCloudSupportRegionsResponseBody create() {
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
     * @return supportRegions
     */
    public java.util.List<String> getSupportRegions() {
        return this.supportRegions;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<String> supportRegions; 

        private Builder() {
        } 

        private Builder(DescribeHybridCloudSupportRegionsResponseBody model) {
            this.requestId = model.requestId;
            this.supportRegions = model.supportRegions;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SupportRegions.
         */
        public Builder supportRegions(java.util.List<String> supportRegions) {
            this.supportRegions = supportRegions;
            return this;
        }

        public DescribeHybridCloudSupportRegionsResponseBody build() {
            return new DescribeHybridCloudSupportRegionsResponseBody(this);
        } 

    } 

}
