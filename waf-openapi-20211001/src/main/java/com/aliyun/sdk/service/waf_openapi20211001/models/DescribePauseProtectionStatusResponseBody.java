// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePauseProtectionStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePauseProtectionStatusResponseBody</p>
 */
public class DescribePauseProtectionStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PauseStatus")
    private Integer pauseStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePauseProtectionStatusResponseBody(Builder builder) {
        this.pauseStatus = builder.pauseStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePauseProtectionStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return pauseStatus
     */
    public Integer getPauseStatus() {
        return this.pauseStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer pauseStatus; 
        private String requestId; 

        /**
         * PauseStatus.
         */
        public Builder pauseStatus(Integer pauseStatus) {
            this.pauseStatus = pauseStatus;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePauseProtectionStatusResponseBody build() {
            return new DescribePauseProtectionStatusResponseBody(this);
        } 

    } 

}
