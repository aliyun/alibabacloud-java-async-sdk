// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDesktopGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDesktopGroupResponseBody</p>
 */
public class CreateDesktopGroupResponseBody extends TeaModel {
    @NameInMap("DesktopGroupId")
    private String desktopGroupId;

    @NameInMap("OrderIds")
    private java.util.List < String > orderIds;

    @NameInMap("RequestId")
    private String requestId;

    private CreateDesktopGroupResponseBody(Builder builder) {
        this.desktopGroupId = builder.desktopGroupId;
        this.orderIds = builder.orderIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDesktopGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return desktopGroupId
     */
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    /**
     * @return orderIds
     */
    public java.util.List < String > getOrderIds() {
        return this.orderIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String desktopGroupId; 
        private java.util.List < String > orderIds; 
        private String requestId; 

        /**
         * The ID of the desktop group.
         */
        public Builder desktopGroupId(String desktopGroupId) {
            this.desktopGroupId = desktopGroupId;
            return this;
        }

        /**
         * The IDs of the orders.
         */
        public Builder orderIds(java.util.List < String > orderIds) {
            this.orderIds = orderIds;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDesktopGroupResponseBody build() {
            return new CreateDesktopGroupResponseBody(this);
        } 

    } 

}
