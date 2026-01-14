// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteBasicAccelerateIpResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteBasicAccelerateIpResponseBody</p>
 */
public class DeleteBasicAccelerateIpResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccelerateIpId")
    private String accelerateIpId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteBasicAccelerateIpResponseBody(Builder builder) {
        this.accelerateIpId = builder.accelerateIpId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBasicAccelerateIpResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accelerateIpId
     */
    public String getAccelerateIpId() {
        return this.accelerateIpId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accelerateIpId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DeleteBasicAccelerateIpResponseBody model) {
            this.accelerateIpId = model.accelerateIpId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the accelerated IP address that is deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>gaip-bp1****</p>
         */
        public Builder accelerateIpId(String accelerateIpId) {
            this.accelerateIpId = accelerateIpId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteBasicAccelerateIpResponseBody build() {
            return new DeleteBasicAccelerateIpResponseBody(this);
        } 

    } 

}
