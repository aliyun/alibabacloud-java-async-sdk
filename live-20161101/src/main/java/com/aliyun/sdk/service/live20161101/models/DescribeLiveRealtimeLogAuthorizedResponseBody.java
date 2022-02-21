// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveRealtimeLogAuthorizedResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveRealtimeLogAuthorizedResponseBody</p>
 */
public class DescribeLiveRealtimeLogAuthorizedResponseBody extends TeaModel {
    @NameInMap("AuthorizedStatus")
    private String authorizedStatus;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeLiveRealtimeLogAuthorizedResponseBody(Builder builder) {
        this.authorizedStatus = builder.authorizedStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveRealtimeLogAuthorizedResponseBody create() {
        return builder().build();
    }

    /**
     * @return authorizedStatus
     */
    public String getAuthorizedStatus() {
        return this.authorizedStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String authorizedStatus; 
        private String requestId; 

        /**
         * AuthorizedStatus.
         */
        public Builder authorizedStatus(String authorizedStatus) {
            this.authorizedStatus = authorizedStatus;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveRealtimeLogAuthorizedResponseBody build() {
            return new DescribeLiveRealtimeLogAuthorizedResponseBody(this);
        } 

    } 

}
