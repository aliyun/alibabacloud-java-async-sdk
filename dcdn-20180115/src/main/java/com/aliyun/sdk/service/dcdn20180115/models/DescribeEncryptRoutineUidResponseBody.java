// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeEncryptRoutineUidResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEncryptRoutineUidResponseBody</p>
 */
public class DescribeEncryptRoutineUidResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeEncryptRoutineUidResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEncryptRoutineUidResponseBody create() {
        return builder().build();
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String content; 
        private String requestId; 

        /**
         * <p>The returned ciphertext, which contains the Alibaba Cloud account ID, timestamp, and time to live (TTL).</p>
         * 
         * <strong>example:</strong>
         * <p>XXXXXj20p4UB/xgdOH5LtXXXXXX</p>
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4DBA68F5-04A9-406B-B1E4-F2CB635E103F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeEncryptRoutineUidResponseBody build() {
            return new DescribeEncryptRoutineUidResponseBody(this);
        } 

    } 

}
