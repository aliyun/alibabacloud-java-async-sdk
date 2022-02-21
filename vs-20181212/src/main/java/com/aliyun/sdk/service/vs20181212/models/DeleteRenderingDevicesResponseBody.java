// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRenderingDevicesResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteRenderingDevicesResponseBody</p>
 */
public class DeleteRenderingDevicesResponseBody extends TeaModel {
    @NameInMap("FailedIds")
    private java.util.List < String > failedIds;

    @NameInMap("RequestId")
    private String requestId;

    private DeleteRenderingDevicesResponseBody(Builder builder) {
        this.failedIds = builder.failedIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRenderingDevicesResponseBody create() {
        return builder().build();
    }

    /**
     * @return failedIds
     */
    public java.util.List < String > getFailedIds() {
        return this.failedIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > failedIds; 
        private String requestId; 

        /**
         * FailedIds.
         */
        public Builder failedIds(java.util.List < String > failedIds) {
            this.failedIds = failedIds;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteRenderingDevicesResponseBody build() {
            return new DeleteRenderingDevicesResponseBody(this);
        } 

    } 

}
