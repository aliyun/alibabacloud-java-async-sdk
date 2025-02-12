// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DescribeAutoCcListCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAutoCcListCountResponseBody</p>
 */
public class DescribeAutoCcListCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BlackCount")
    private Integer blackCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WhiteCount")
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
         * <p>The total number of IP addresses in the blacklist.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder blackCount(Integer blackCount) {
            this.blackCount = blackCount;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5AC3785F-C789-4622-87A4-F58BE7F6B184</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of IP addresses in the whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
