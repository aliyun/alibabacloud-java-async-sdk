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
 * {@link DescribeHybridCloudProtectableCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHybridCloudProtectableCountResponseBody</p>
 */
public class DescribeHybridCloudProtectableCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ProtectableCount")
    private Integer protectableCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeHybridCloudProtectableCountResponseBody(Builder builder) {
        this.protectableCount = builder.protectableCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHybridCloudProtectableCountResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return protectableCount
     */
    public Integer getProtectableCount() {
        return this.protectableCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer protectableCount; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeHybridCloudProtectableCountResponseBody model) {
            this.protectableCount = model.protectableCount;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The number of protection nodes that can be added to the hybrid cloud cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder protectableCount(Integer protectableCount) {
            this.protectableCount = protectableCount;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>6087EA47-C10F-5A0A-A405-DB5B241**B1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeHybridCloudProtectableCountResponseBody build() {
            return new DescribeHybridCloudProtectableCountResponseBody(this);
        } 

    } 

}
