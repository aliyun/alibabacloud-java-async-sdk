// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link RenewElasticityAssurancesResponseBody} extends {@link TeaModel}
 *
 * <p>RenewElasticityAssurancesResponseBody</p>
 */
public class RenewElasticityAssurancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.NameInMap("PrivatePoolOptionsIdSet")
    private PrivatePoolOptionsIdSet privatePoolOptionsIdSet;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RenewElasticityAssurancesResponseBody(Builder builder) {
        this.orderId = builder.orderId;
        this.privatePoolOptionsIdSet = builder.privatePoolOptionsIdSet;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenewElasticityAssurancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return privatePoolOptionsIdSet
     */
    public PrivatePoolOptionsIdSet getPrivatePoolOptionsIdSet() {
        return this.privatePoolOptionsIdSet;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String orderId; 
        private PrivatePoolOptionsIdSet privatePoolOptionsIdSet; 
        private String requestId; 

        /**
         * <p>The ID of the renewal order.</p>
         * 
         * <strong>example:</strong>
         * <p>182372800****</p>
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The IDs of the elasticity assurances.</p>
         */
        public Builder privatePoolOptionsIdSet(PrivatePoolOptionsIdSet privatePoolOptionsIdSet) {
            this.privatePoolOptionsIdSet = privatePoolOptionsIdSet;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RenewElasticityAssurancesResponseBody build() {
            return new RenewElasticityAssurancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RenewElasticityAssurancesResponseBody} extends {@link TeaModel}
     *
     * <p>RenewElasticityAssurancesResponseBody</p>
     */
    public static class PrivatePoolOptionsIdSet extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrivatePoolOptionsId")
        private java.util.List<String> privatePoolOptionsId;

        private PrivatePoolOptionsIdSet(Builder builder) {
            this.privatePoolOptionsId = builder.privatePoolOptionsId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivatePoolOptionsIdSet create() {
            return builder().build();
        }

        /**
         * @return privatePoolOptionsId
         */
        public java.util.List<String> getPrivatePoolOptionsId() {
            return this.privatePoolOptionsId;
        }

        public static final class Builder {
            private java.util.List<String> privatePoolOptionsId; 

            /**
             * PrivatePoolOptionsId.
             */
            public Builder privatePoolOptionsId(java.util.List<String> privatePoolOptionsId) {
                this.privatePoolOptionsId = privatePoolOptionsId;
                return this;
            }

            public PrivatePoolOptionsIdSet build() {
                return new PrivatePoolOptionsIdSet(this);
            } 

        } 

    }
}
