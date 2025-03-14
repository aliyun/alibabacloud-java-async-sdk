// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeCountScannedImageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCountScannedImageResponseBody</p>
 */
public class DescribeCountScannedImageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScannedCount")
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
     * @return scannedCount
     */
    public Integer getScannedCount() {
        return this.scannedCount;
    }

    public static final class Builder {
        private String requestId; 
        private Integer scannedCount; 

        private Builder() {
        } 

        private Builder(DescribeCountScannedImageResponseBody model) {
            this.requestId = model.requestId;
            this.scannedCount = model.scannedCount;
        } 

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>3F4236AB-7070-538D-85EB-98EBFE6C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of images that are scanned.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
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
