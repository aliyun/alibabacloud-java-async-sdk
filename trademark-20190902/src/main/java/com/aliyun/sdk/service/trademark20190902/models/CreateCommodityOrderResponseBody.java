// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCommodityOrderResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCommodityOrderResponseBody</p>
 */
public class CreateCommodityOrderResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Long > data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private CreateCommodityOrderResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCommodityOrderResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Long > getData() {
        return this.data;
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
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private java.util.List < Long > data; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Long > data) {
            this.data = data;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateCommodityOrderResponseBody build() {
            return new CreateCommodityOrderResponseBody(this);
        } 

    } 

}
