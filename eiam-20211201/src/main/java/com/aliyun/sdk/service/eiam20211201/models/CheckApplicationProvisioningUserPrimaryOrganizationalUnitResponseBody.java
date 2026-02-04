// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link CheckApplicationProvisioningUserPrimaryOrganizationalUnitResponseBody} extends {@link TeaModel}
 *
 * <p>CheckApplicationProvisioningUserPrimaryOrganizationalUnitResponseBody</p>
 */
public class CheckApplicationProvisioningUserPrimaryOrganizationalUnitResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CheckApplicationProvisioningUserPrimaryOuResult")
    private CheckApplicationProvisioningUserPrimaryOuResult checkApplicationProvisioningUserPrimaryOuResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CheckApplicationProvisioningUserPrimaryOrganizationalUnitResponseBody(Builder builder) {
        this.checkApplicationProvisioningUserPrimaryOuResult = builder.checkApplicationProvisioningUserPrimaryOuResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckApplicationProvisioningUserPrimaryOrganizationalUnitResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkApplicationProvisioningUserPrimaryOuResult
     */
    public CheckApplicationProvisioningUserPrimaryOuResult getCheckApplicationProvisioningUserPrimaryOuResult() {
        return this.checkApplicationProvisioningUserPrimaryOuResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CheckApplicationProvisioningUserPrimaryOuResult checkApplicationProvisioningUserPrimaryOuResult; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CheckApplicationProvisioningUserPrimaryOrganizationalUnitResponseBody model) {
            this.checkApplicationProvisioningUserPrimaryOuResult = model.checkApplicationProvisioningUserPrimaryOuResult;
            this.requestId = model.requestId;
        } 

        /**
         * CheckApplicationProvisioningUserPrimaryOuResult.
         */
        public Builder checkApplicationProvisioningUserPrimaryOuResult(CheckApplicationProvisioningUserPrimaryOuResult checkApplicationProvisioningUserPrimaryOuResult) {
            this.checkApplicationProvisioningUserPrimaryOuResult = checkApplicationProvisioningUserPrimaryOuResult;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckApplicationProvisioningUserPrimaryOrganizationalUnitResponseBody build() {
            return new CheckApplicationProvisioningUserPrimaryOrganizationalUnitResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CheckApplicationProvisioningUserPrimaryOrganizationalUnitResponseBody} extends {@link TeaModel}
     *
     * <p>CheckApplicationProvisioningUserPrimaryOrganizationalUnitResponseBody</p>
     */
    public static class CheckApplicationProvisioningUserPrimaryOuResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowAuthorization")
        private Boolean allowAuthorization;

        @com.aliyun.core.annotation.NameInMap("ApplicationId")
        private String applicationId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        private CheckApplicationProvisioningUserPrimaryOuResult(Builder builder) {
            this.allowAuthorization = builder.allowAuthorization;
            this.applicationId = builder.applicationId;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckApplicationProvisioningUserPrimaryOuResult create() {
            return builder().build();
        }

        /**
         * @return allowAuthorization
         */
        public Boolean getAllowAuthorization() {
            return this.allowAuthorization;
        }

        /**
         * @return applicationId
         */
        public String getApplicationId() {
            return this.applicationId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private Boolean allowAuthorization; 
            private String applicationId; 
            private String instanceId; 

            private Builder() {
            } 

            private Builder(CheckApplicationProvisioningUserPrimaryOuResult model) {
                this.allowAuthorization = model.allowAuthorization;
                this.applicationId = model.applicationId;
                this.instanceId = model.instanceId;
            } 

            /**
             * <p>是否授权</p>
             */
            public Builder allowAuthorization(Boolean allowAuthorization) {
                this.allowAuthorization = allowAuthorization;
                return this;
            }

            /**
             * <p>IDaaS EIAM 实例Id</p>
             * 
             * <strong>example:</strong>
             * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * <p>IDaaS EIAM 实例Id</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public CheckApplicationProvisioningUserPrimaryOuResult build() {
                return new CheckApplicationProvisioningUserPrimaryOuResult(this);
            } 

        } 

    }
}
