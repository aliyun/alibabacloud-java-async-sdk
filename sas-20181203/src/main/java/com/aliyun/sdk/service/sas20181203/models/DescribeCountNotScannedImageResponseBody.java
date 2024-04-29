// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCountNotScannedImageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCountNotScannedImageResponseBody</p>
 */
public class DescribeCountNotScannedImageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NotScannedCnt")
    private Integer notScannedCnt;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCountNotScannedImageResponseBody(Builder builder) {
        this.notScannedCnt = builder.notScannedCnt;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCountNotScannedImageResponseBody create() {
        return builder().build();
    }

    /**
     * @return notScannedCnt
     */
    public Integer getNotScannedCnt() {
        return this.notScannedCnt;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer notScannedCnt; 
        private String requestId; 

        /**
         * The number of images that are not scanned.
         */
        public Builder notScannedCnt(Integer notScannedCnt) {
            this.notScannedCnt = notScannedCnt;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCountNotScannedImageResponseBody build() {
            return new DescribeCountNotScannedImageResponseBody(this);
        } 

    } 

}
