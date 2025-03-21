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
         * <p>The number of images that are not scanned.</p>
         * 
         * <strong>example:</strong>
         * <p>28</p>
         */
        public Builder notScannedCnt(Integer notScannedCnt) {
            this.notScannedCnt = notScannedCnt;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>24A20733-10A0-4AF6-BE6B-E3322413BB68</p>
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
