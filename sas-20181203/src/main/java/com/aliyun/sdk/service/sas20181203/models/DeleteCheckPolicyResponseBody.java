// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DeleteCheckPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteCheckPolicyResponseBody</p>
 */
public class DeleteCheckPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Policys")
    private java.util.List<Policys> policys;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteCheckPolicyResponseBody(Builder builder) {
        this.policys = builder.policys;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCheckPolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policys
     */
    public java.util.List<Policys> getPolicys() {
        return this.policys;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Policys> policys; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DeleteCheckPolicyResponseBody model) {
            this.policys = model.policys;
            this.requestId = model.requestId;
        } 

        /**
         * Policys.
         */
        public Builder policys(java.util.List<Policys> policys) {
            this.policys = policys;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteCheckPolicyResponseBody build() {
            return new DeleteCheckPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeleteCheckPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteCheckPolicyResponseBody</p>
     */
    public static class Policys extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private Long policyId;

        @com.aliyun.core.annotation.NameInMap("PolicyShowName")
        private String policyShowName;

        @com.aliyun.core.annotation.NameInMap("PolicyType")
        private String policyType;

        private Policys(Builder builder) {
            this.policyId = builder.policyId;
            this.policyShowName = builder.policyShowName;
            this.policyType = builder.policyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policys create() {
            return builder().build();
        }

        /**
         * @return policyId
         */
        public Long getPolicyId() {
            return this.policyId;
        }

        /**
         * @return policyShowName
         */
        public String getPolicyShowName() {
            return this.policyShowName;
        }

        /**
         * @return policyType
         */
        public String getPolicyType() {
            return this.policyType;
        }

        public static final class Builder {
            private Long policyId; 
            private String policyShowName; 
            private String policyType; 

            private Builder() {
            } 

            private Builder(Policys model) {
                this.policyId = model.policyId;
                this.policyShowName = model.policyShowName;
                this.policyType = model.policyType;
            } 

            /**
             * PolicyId.
             */
            public Builder policyId(Long policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * PolicyShowName.
             */
            public Builder policyShowName(String policyShowName) {
                this.policyShowName = policyShowName;
                return this;
            }

            /**
             * PolicyType.
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            public Policys build() {
                return new Policys(this);
            } 

        } 

    }
}
