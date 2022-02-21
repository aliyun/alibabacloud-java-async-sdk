// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGeoFenceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateGeoFenceResponseBody</p>
 */
public class CreateGeoFenceResponseBody extends TeaModel {
    @NameInMap("FenceId")
    private Long fenceId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateGeoFenceResponseBody(Builder builder) {
        this.fenceId = builder.fenceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGeoFenceResponseBody create() {
        return builder().build();
    }

    /**
     * @return fenceId
     */
    public Long getFenceId() {
        return this.fenceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long fenceId; 
        private String requestId; 

        /**
         * FenceId.
         */
        public Builder fenceId(Long fenceId) {
            this.fenceId = fenceId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateGeoFenceResponseBody build() {
            return new CreateGeoFenceResponseBody(this);
        } 

    } 

}
