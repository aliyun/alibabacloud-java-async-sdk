// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

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
 * {@link CreateWarehouseResponseBody} extends {@link TeaModel}
 *
 * <p>CreateWarehouseResponseBody</p>
 */
public class CreateWarehouseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WarehouseInstanceId")
    private String warehouseInstanceId;

    private CreateWarehouseResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.warehouseInstanceId = builder.warehouseInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWarehouseResponseBody create() {
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
     * @return warehouseInstanceId
     */
    public String getWarehouseInstanceId() {
        return this.warehouseInstanceId;
    }

    public static final class Builder {
        private String requestId; 
        private String warehouseInstanceId; 

        private Builder() {
        } 

        private Builder(CreateWarehouseResponseBody model) {
            this.requestId = model.requestId;
            this.warehouseInstanceId = model.warehouseInstanceId;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * WarehouseInstanceId.
         */
        public Builder warehouseInstanceId(String warehouseInstanceId) {
            this.warehouseInstanceId = warehouseInstanceId;
            return this;
        }

        public CreateWarehouseResponseBody build() {
            return new CreateWarehouseResponseBody(this);
        } 

    } 

}
