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
 * {@link CreateBandwidthResourcePackagesResponseBody} extends {@link TeaModel}
 *
 * <p>CreateBandwidthResourcePackagesResponseBody</p>
 */
public class CreateBandwidthResourcePackagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OrderId")
    private Long orderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateBandwidthResourcePackagesResponseBody(Builder builder) {
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBandwidthResourcePackagesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long orderId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateBandwidthResourcePackagesResponseBody model) {
            this.orderId = model.orderId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the order.</p>
         * 
         * <strong>example:</strong>
         * <p>24251717783****</p>
         */
        public Builder orderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The ID of a request.</p>
         * 
         * <strong>example:</strong>
         * <p>AE7B699F-625C-587E-BC5F-1395CA969681</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateBandwidthResourcePackagesResponseBody build() {
            return new CreateBandwidthResourcePackagesResponseBody(this);
        } 

    } 

}
