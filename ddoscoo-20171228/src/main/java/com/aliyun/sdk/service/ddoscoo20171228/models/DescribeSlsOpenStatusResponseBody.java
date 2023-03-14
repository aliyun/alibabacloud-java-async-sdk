// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSlsOpenStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSlsOpenStatusResponseBody</p>
 */
public class DescribeSlsOpenStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SlsOpenStatus")
    private Boolean slsOpenStatus;

    private DescribeSlsOpenStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.slsOpenStatus = builder.slsOpenStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSlsOpenStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return slsOpenStatus
     */
    public Boolean getSlsOpenStatus() {
        return this.slsOpenStatus;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean slsOpenStatus; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SlsOpenStatus.
         */
        public Builder slsOpenStatus(Boolean slsOpenStatus) {
            this.slsOpenStatus = slsOpenStatus;
            return this;
        }

        public DescribeSlsOpenStatusResponseBody build() {
            return new DescribeSlsOpenStatusResponseBody(this);
        } 

    } 

}
