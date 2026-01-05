// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

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
 * {@link ListProvisionedProductPlanApproversResponseBody} extends {@link TeaModel}
 *
 * <p>ListProvisionedProductPlanApproversResponseBody</p>
 */
public class ListProvisionedProductPlanApproversResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Approvers")
    private java.util.List<Approvers> approvers;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListProvisionedProductPlanApproversResponseBody(Builder builder) {
        this.approvers = builder.approvers;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProvisionedProductPlanApproversResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return approvers
     */
    public java.util.List<Approvers> getApprovers() {
        return this.approvers;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Approvers> approvers; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListProvisionedProductPlanApproversResponseBody model) {
            this.approvers = model.approvers;
            this.requestId = model.requestId;
        } 

        /**
         * <p>An array that consists of reviewers.</p>
         */
        public Builder approvers(java.util.List<Approvers> approvers) {
            this.approvers = approvers;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0FEEF92D-4052-5202-87D0-3D8EC16F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListProvisionedProductPlanApproversResponseBody build() {
            return new ListProvisionedProductPlanApproversResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListProvisionedProductPlanApproversResponseBody} extends {@link TeaModel}
     *
     * <p>ListProvisionedProductPlanApproversResponseBody</p>
     */
    public static class Approvers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrincipalName")
        private String principalName;

        @com.aliyun.core.annotation.NameInMap("PrincipalType")
        private String principalType;

        private Approvers(Builder builder) {
            this.principalName = builder.principalName;
            this.principalType = builder.principalType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Approvers create() {
            return builder().build();
        }

        /**
         * @return principalName
         */
        public String getPrincipalName() {
            return this.principalName;
        }

        /**
         * @return principalType
         */
        public String getPrincipalType() {
            return this.principalType;
        }

        public static final class Builder {
            private String principalName; 
            private String principalType; 

            private Builder() {
            } 

            private Builder(Approvers model) {
                this.principalName = model.principalName;
                this.principalType = model.principalType;
            } 

            /**
             * <p>The name of the reviewer.</p>
             * 
             * <strong>example:</strong>
             * <p>approver-1</p>
             */
            public Builder principalName(String principalName) {
                this.principalName = principalName;
                return this;
            }

            /**
             * <p>The type of the Resource Access Management (RAM) entity of the reviewer. Valid values:</p>
             * <ul>
             * <li>RamUser: a RAM user</li>
             * <li>RamRole: a RAM role</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RamUser</p>
             */
            public Builder principalType(String principalType) {
                this.principalType = principalType;
                return this;
            }

            public Approvers build() {
                return new Approvers(this);
            } 

        } 

    }
}
