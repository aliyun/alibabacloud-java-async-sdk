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
 * {@link AssociateTransitRouterPolicyTableResponseBody} extends {@link TeaModel}
 *
 * <p>AssociateTransitRouterPolicyTableResponseBody</p>
 */
public class AssociateTransitRouterPolicyTableResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AssociationId")
    private String associationId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AssociateTransitRouterPolicyTableResponseBody(Builder builder) {
        this.associationId = builder.associationId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociateTransitRouterPolicyTableResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return associationId
     */
    public String getAssociationId() {
        return this.associationId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String associationId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(AssociateTransitRouterPolicyTableResponseBody model) {
            this.associationId = model.associationId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the association between the policy route table and the network instance connection.</p>
         * 
         * <strong>example:</strong>
         * <p>pta-123asfzc</p>
         */
        public Builder associationId(String associationId) {
            this.associationId = associationId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>ADD98358-D265-4060-87CB-A2427F5A8944</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AssociateTransitRouterPolicyTableResponseBody build() {
            return new AssociateTransitRouterPolicyTableResponseBody(this);
        } 

    } 

}
