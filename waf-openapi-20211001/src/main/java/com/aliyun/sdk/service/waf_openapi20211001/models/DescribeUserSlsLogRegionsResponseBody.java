// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeUserSlsLogRegionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserSlsLogRegionsResponseBody</p>
 */
public class DescribeUserSlsLogRegionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LogRegions")
    private java.util.List < String > logRegions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeUserSlsLogRegionsResponseBody(Builder builder) {
        this.logRegions = builder.logRegions;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserSlsLogRegionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return logRegions
     */
    public java.util.List < String > getLogRegions() {
        return this.logRegions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > logRegions; 
        private String requestId; 

        /**
         * <p>The region IDs.</p>
         */
        public Builder logRegions(java.util.List < String > logRegions) {
            this.logRegions = logRegions;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9D11AC3A-A10C-56E7-A342-E87EC892****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeUserSlsLogRegionsResponseBody build() {
            return new DescribeUserSlsLogRegionsResponseBody(this);
        } 

    } 

}
