// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProvisionedProductPlanApproversResponseBody} extends {@link TeaModel}
 *
 * <p>ListProvisionedProductPlanApproversResponseBody</p>
 */
public class ListProvisionedProductPlanApproversResponseBody extends TeaModel {
    @NameInMap("Approvers")
    private java.util.List < Approvers> approvers;

    @NameInMap("RequestId")
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

    /**
     * @return approvers
     */
    public java.util.List < Approvers> getApprovers() {
        return this.approvers;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Approvers> approvers; 
        private String requestId; 

        /**
         * An array that consists of reviewers.
         */
        public Builder approvers(java.util.List < Approvers> approvers) {
            this.approvers = approvers;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListProvisionedProductPlanApproversResponseBody build() {
            return new ListProvisionedProductPlanApproversResponseBody(this);
        } 

    } 

    public static class Approvers extends TeaModel {
        @NameInMap("PrincipalName")
        private String principalName;

        @NameInMap("PrincipalType")
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

            /**
             * The name of the reviewer.
             */
            public Builder principalName(String principalName) {
                this.principalName = principalName;
                return this;
            }

            /**
             * The type of the Resource Access Management (RAM) entity of the reviewer. Valid values:
             * <p>
             * 
             * *   RamUser: a RAM user
             * *   RamRole: a RAM role
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
