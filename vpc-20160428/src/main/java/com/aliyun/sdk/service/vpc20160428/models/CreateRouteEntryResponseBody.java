// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link CreateRouteEntryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRouteEntryResponseBody</p>
 */
public class CreateRouteEntryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RouteEntryId")
    private String routeEntryId;

    private CreateRouteEntryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.routeEntryId = builder.routeEntryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRouteEntryResponseBody create() {
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
     * @return routeEntryId
     */
    public String getRouteEntryId() {
        return this.routeEntryId;
    }

    public static final class Builder {
        private String requestId; 
        private String routeEntryId; 

        private Builder() {
        } 

        private Builder(CreateRouteEntryResponseBody model) {
            this.requestId = model.requestId;
            this.routeEntryId = model.routeEntryId;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0ED8D006-F706-4D23-88ED-E11ED28DCAC0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the custom route entry.</p>
         * 
         * <strong>example:</strong>
         * <p>rte-sn6vjkioxte1gz83z****</p>
         */
        public Builder routeEntryId(String routeEntryId) {
            this.routeEntryId = routeEntryId;
            return this;
        }

        public CreateRouteEntryResponseBody build() {
            return new CreateRouteEntryResponseBody(this);
        } 

    } 

}
