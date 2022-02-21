// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSlsAuthStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSlsAuthStatusResponseBody</p>
 */
public class DescribeSlsAuthStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SlsAuthStatus")
    private Boolean slsAuthStatus;

    private DescribeSlsAuthStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.slsAuthStatus = builder.slsAuthStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSlsAuthStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return slsAuthStatus
     */
    public Boolean getSlsAuthStatus() {
        return this.slsAuthStatus;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean slsAuthStatus; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SlsAuthStatus.
         */
        public Builder slsAuthStatus(Boolean slsAuthStatus) {
            this.slsAuthStatus = slsAuthStatus;
            return this;
        }

        public DescribeSlsAuthStatusResponseBody build() {
            return new DescribeSlsAuthStatusResponseBody(this);
        } 

    } 

}
