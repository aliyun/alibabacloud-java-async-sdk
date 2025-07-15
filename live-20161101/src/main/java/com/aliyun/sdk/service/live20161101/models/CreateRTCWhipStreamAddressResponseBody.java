// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link CreateRTCWhipStreamAddressResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRTCWhipStreamAddressResponseBody</p>
 */
public class CreateRTCWhipStreamAddressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WhipAddress")
    private String whipAddress;

    private CreateRTCWhipStreamAddressResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.whipAddress = builder.whipAddress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRTCWhipStreamAddressResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return whipAddress
     */
    public String getWhipAddress() {
        return this.whipAddress;
    }

    public static final class Builder {
        private String requestId; 
        private String whipAddress; 

        private Builder() {
        } 

        private Builder(CreateRTCWhipStreamAddressResponseBody model) {
            this.requestId = model.requestId;
            this.whipAddress = model.whipAddress;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * WhipAddress.
         */
        public Builder whipAddress(String whipAddress) {
            this.whipAddress = whipAddress;
            return this;
        }

        public CreateRTCWhipStreamAddressResponseBody build() {
            return new CreateRTCWhipStreamAddressResponseBody(this);
        } 

    } 

}
