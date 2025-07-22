// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link AllocateIpAddressResponseBody} extends {@link TeaModel}
 *
 * <p>AllocateIpAddressResponseBody</p>
 */
public class AllocateIpAddressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EipAddress")
    private String eipAddress;

    @com.aliyun.core.annotation.NameInMap("EipId")
    private String eipId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AllocateIpAddressResponseBody(Builder builder) {
        this.eipAddress = builder.eipAddress;
        this.eipId = builder.eipId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AllocateIpAddressResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eipAddress
     */
    public String getEipAddress() {
        return this.eipAddress;
    }

    /**
     * @return eipId
     */
    public String getEipId() {
        return this.eipId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String eipAddress; 
        private String eipId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(AllocateIpAddressResponseBody model) {
            this.eipAddress = model.eipAddress;
            this.eipId = model.eipId;
            this.requestId = model.requestId;
        } 

        /**
         * EipAddress.
         */
        public Builder eipAddress(String eipAddress) {
            this.eipAddress = eipAddress;
            return this;
        }

        /**
         * EipId.
         */
        public Builder eipId(String eipId) {
            this.eipId = eipId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AllocateIpAddressResponseBody build() {
            return new AllocateIpAddressResponseBody(this);
        } 

    } 

}
