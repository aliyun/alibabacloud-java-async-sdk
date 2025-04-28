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
 * {@link ModifyResourceCenterPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyResourceCenterPolicyResponseBody</p>
 */
public class ModifyResourceCenterPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ModifyResults")
    private java.util.List<ModifyResults> modifyResults;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyResourceCenterPolicyResponseBody(Builder builder) {
        this.modifyResults = builder.modifyResults;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyResourceCenterPolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modifyResults
     */
    public java.util.List<ModifyResults> getModifyResults() {
        return this.modifyResults;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ModifyResults> modifyResults; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ModifyResourceCenterPolicyResponseBody model) {
            this.modifyResults = model.modifyResults;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The modification results.</p>
         */
        public Builder modifyResults(java.util.List<ModifyResults> modifyResults) {
            this.modifyResults = modifyResults;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>51592A88-0F2C-55E6-AD2C-2AD9C10D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyResourceCenterPolicyResponseBody build() {
            return new ModifyResourceCenterPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyResourceCenterPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyResourceCenterPolicyResponseBody</p>
     */
    public static class ModifyResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckResult")
        private Boolean checkResult;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        private ModifyResults(Builder builder) {
            this.checkResult = builder.checkResult;
            this.resourceId = builder.resourceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModifyResults create() {
            return builder().build();
        }

        /**
         * @return checkResult
         */
        public Boolean getCheckResult() {
            return this.checkResult;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        public static final class Builder {
            private Boolean checkResult; 
            private String resourceId; 

            private Builder() {
            } 

            private Builder(ModifyResults model) {
                this.checkResult = model.checkResult;
                this.resourceId = model.resourceId;
            } 

            /**
             * <p>The verification result.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder checkResult(Boolean checkResult) {
                this.checkResult = checkResult;
                return this;
            }

            /**
             * <p>The resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-e254cpyt9bb*****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            public ModifyResults build() {
                return new ModifyResults(this);
            } 

        } 

    }
}
