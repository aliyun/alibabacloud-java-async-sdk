// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateVirtualPhysicalConnectionResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateVirtualPhysicalConnectionResponseBody</p>
 */
public class UpdateVirtualPhysicalConnectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    private UpdateVirtualPhysicalConnectionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateVirtualPhysicalConnectionResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private String success; 

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 是否修改成功
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public UpdateVirtualPhysicalConnectionResponseBody build() {
            return new UpdateVirtualPhysicalConnectionResponseBody(this);
        } 

    } 

}
