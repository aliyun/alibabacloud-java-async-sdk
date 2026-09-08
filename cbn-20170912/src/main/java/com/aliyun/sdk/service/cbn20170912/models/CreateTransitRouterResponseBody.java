// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

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
 * {@link CreateTransitRouterResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTransitRouterResponseBody</p>
 */
public class CreateTransitRouterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TransitRouterId")
    private String transitRouterId;

    private CreateTransitRouterResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.transitRouterId = builder.transitRouterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTransitRouterResponseBody create() {
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
     * @return transitRouterId
     */
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    public static final class Builder {
        private String requestId; 
        private String transitRouterId; 

        private Builder() {
        } 

        private Builder(CreateTransitRouterResponseBody model) {
            this.requestId = model.requestId;
            this.transitRouterId = model.transitRouterId;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>404DA7EC-F495-44B5-B543-6EDCDF90F3D1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The Enterprise Edition transit router instance ID. After creation, the instance is in the Creating state. Wait until the instance status changes to Active before performing subsequent operations. You can call the <a href="https://help.aliyun.com/document_detail/261219.html">ListTransitRouters</a> operation to query the Enterprise Edition transit router instance status.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-uf6llz2286805i44g****</p>
         */
        public Builder transitRouterId(String transitRouterId) {
            this.transitRouterId = transitRouterId;
            return this;
        }

        public CreateTransitRouterResponseBody build() {
            return new CreateTransitRouterResponseBody(this);
        } 

    } 

}
