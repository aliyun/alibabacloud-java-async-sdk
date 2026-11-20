// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ModifyWuyingServerSpecResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyWuyingServerSpecResponseBody</p>
 */
public class ModifyWuyingServerSpecResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ModifyWuyingServerSpecModel")
    private ModifyWuyingServerSpecModel modifyWuyingServerSpecModel;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyWuyingServerSpecResponseBody(Builder builder) {
        this.modifyWuyingServerSpecModel = builder.modifyWuyingServerSpecModel;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyWuyingServerSpecResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modifyWuyingServerSpecModel
     */
    public ModifyWuyingServerSpecModel getModifyWuyingServerSpecModel() {
        return this.modifyWuyingServerSpecModel;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ModifyWuyingServerSpecModel modifyWuyingServerSpecModel; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ModifyWuyingServerSpecResponseBody model) {
            this.modifyWuyingServerSpecModel = model.modifyWuyingServerSpecModel;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The processing result of the specification change.</p>
         */
        public Builder modifyWuyingServerSpecModel(ModifyWuyingServerSpecModel modifyWuyingServerSpecModel) {
            this.modifyWuyingServerSpecModel = modifyWuyingServerSpecModel;
            return this;
        }

        /**
         * <p>The ID of the request, which is used for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyWuyingServerSpecResponseBody build() {
            return new ModifyWuyingServerSpecResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyWuyingServerSpecResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyWuyingServerSpecResponseBody</p>
     */
    public static class ModifyWuyingServerSpecModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OrderId")
        private String orderId;

        private ModifyWuyingServerSpecModel(Builder builder) {
            this.orderId = builder.orderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModifyWuyingServerSpecModel create() {
            return builder().build();
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        public static final class Builder {
            private String orderId; 

            private Builder() {
            } 

            private Builder(ModifyWuyingServerSpecModel model) {
                this.orderId = model.orderId;
            } 

            /**
             * <p>The ID of the order generated for this specification change. Returning an order ID does not indicate that the specification change is complete.</p>
             * 
             * <strong>example:</strong>
             * <p>23429322113****</p>
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            public ModifyWuyingServerSpecModel build() {
                return new ModifyWuyingServerSpecModel(this);
            } 

        } 

    }
}
