// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSlsOpenStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetSlsOpenStatusResponseBody</p>
 */
public class GetSlsOpenStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SlsOpenStatus")
    private Boolean slsOpenStatus;

    private GetSlsOpenStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.slsOpenStatus = builder.slsOpenStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSlsOpenStatusResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether Log Service was activated. Valid values:
         * <p>
         * 
         * *   **true**: Log Service was activated.
         * *   **false**: Log Service was not activated.
         */
        public Builder slsOpenStatus(Boolean slsOpenStatus) {
            this.slsOpenStatus = slsOpenStatus;
            return this;
        }

        public GetSlsOpenStatusResponseBody build() {
            return new GetSlsOpenStatusResponseBody(this);
        } 

    } 

}
