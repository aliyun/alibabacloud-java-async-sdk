// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveStreamAuthCheckingResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamAuthCheckingResponseBody</p>
 */
public class DescribeLiveStreamAuthCheckingResponseBody extends TeaModel {
    @NameInMap("Description")
    private String description;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    private DescribeLiveStreamAuthCheckingResponseBody(Builder builder) {
        this.description = builder.description;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveStreamAuthCheckingResponseBody create() {
        return builder().build();
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String description; 
        private String requestId; 
        private String status; 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
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
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeLiveStreamAuthCheckingResponseBody build() {
            return new DescribeLiveStreamAuthCheckingResponseBody(this);
        } 

    } 

}
