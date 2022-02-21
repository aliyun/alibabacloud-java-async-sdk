// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAutoCcListCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAutoCcListCountResponseBody</p>
 */
public class DescribeAutoCcListCountResponseBody extends TeaModel {
    @NameInMap("BlackCount")
    private Integer blackCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("WhiteCount")
    private Integer whiteCount;

    private DescribeAutoCcListCountResponseBody(Builder builder) {
        this.blackCount = builder.blackCount;
        this.requestId = builder.requestId;
        this.whiteCount = builder.whiteCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAutoCcListCountResponseBody create() {
        return builder().build();
    }

    /**
     * @return blackCount
     */
    public Integer getBlackCount() {
        return this.blackCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return whiteCount
     */
    public Integer getWhiteCount() {
        return this.whiteCount;
    }

    public static final class Builder {
        private Integer blackCount; 
        private String requestId; 
        private Integer whiteCount; 

        /**
         * BlackCount.
         */
        public Builder blackCount(Integer blackCount) {
            this.blackCount = blackCount;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * WhiteCount.
         */
        public Builder whiteCount(Integer whiteCount) {
            this.whiteCount = whiteCount;
            return this;
        }

        public DescribeAutoCcListCountResponseBody build() {
            return new DescribeAutoCcListCountResponseBody(this);
        } 

    } 

}
