// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAsrVadConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAsrVadConfigResponseBody</p>
 */
public class DescribeAsrVadConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SpeechNoiseThreshold")
    private String speechNoiseThreshold;

    private DescribeAsrVadConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.speechNoiseThreshold = builder.speechNoiseThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAsrVadConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return speechNoiseThreshold
     */
    public String getSpeechNoiseThreshold() {
        return this.speechNoiseThreshold;
    }

    public static final class Builder {
        private String requestId; 
        private String speechNoiseThreshold; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SpeechNoiseThreshold.
         */
        public Builder speechNoiseThreshold(String speechNoiseThreshold) {
            this.speechNoiseThreshold = speechNoiseThreshold;
            return this;
        }

        public DescribeAsrVadConfigResponseBody build() {
            return new DescribeAsrVadConfigResponseBody(this);
        } 

    } 

}
