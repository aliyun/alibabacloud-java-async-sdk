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
 * {@link CreateDesktopGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDesktopGroupResponseBody</p>
 */
public class CreateDesktopGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DesktopGroupId")
    private String desktopGroupId;

    @com.aliyun.core.annotation.NameInMap("DesktopGroupIds")
    private java.util.List<String> desktopGroupIds;

    @com.aliyun.core.annotation.NameInMap("OrderIds")
    private java.util.List<String> orderIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateDesktopGroupResponseBody(Builder builder) {
        this.desktopGroupId = builder.desktopGroupId;
        this.desktopGroupIds = builder.desktopGroupIds;
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
     * @return desktopGroupIds
     */
    public java.util.List<String> getDesktopGroupIds() {
        return this.desktopGroupIds;
    }

    /**
     * @return orderIds
     */
    public java.util.List<String> getOrderIds() {
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
        private java.util.List<String> desktopGroupIds; 
        private java.util.List<String> orderIds; 
        private String requestId; 

        /**
         * <p>The ID of the shared group.</p>
         * 
         * <strong>example:</strong>
         * <p>dg-2i8qxpv6t1a03****</p>
         */
        public Builder desktopGroupId(String desktopGroupId) {
            this.desktopGroupId = desktopGroupId;
            return this;
        }

        /**
         * <p>The IDs of the shared groups.</p>
         */
        public Builder desktopGroupIds(java.util.List<String> desktopGroupIds) {
            this.desktopGroupIds = desktopGroupIds;
            return this;
        }

        /**
         * <p>The IDs of the orders.</p>
         */
        public Builder orderIds(java.util.List<String> orderIds) {
            this.orderIds = orderIds;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>3EB7FCEE-D731-4948-85A3-4B2C341CA983</p>
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
