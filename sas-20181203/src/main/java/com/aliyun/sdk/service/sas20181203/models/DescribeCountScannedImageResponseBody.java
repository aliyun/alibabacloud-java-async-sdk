// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCountScannedImageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCountScannedImageResponseBody</p>
 */
public class DescribeCountScannedImageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ScannedCount")
    private Integer scannedCount;

    private DescribeCountScannedImageResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.scannedCount = builder.scannedCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCountScannedImageResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scannedCount
     */
    public Integer getScannedCount() {
        return this.scannedCount;
    }

    public static final class Builder {
        private String requestId; 
        private Integer scannedCount; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ScannedCount.
         */
        public Builder scannedCount(Integer scannedCount) {
            this.scannedCount = scannedCount;
            return this;
        }

        public DescribeCountScannedImageResponseBody build() {
            return new DescribeCountScannedImageResponseBody(this);
        } 

    } 

}
