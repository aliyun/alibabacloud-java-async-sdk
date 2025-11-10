// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

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
 * {@link UpdateServiceInstanceAttributesRequest} extends {@link RequestModel}
 *
 * <p>UpdateServiceInstanceAttributesRequest</p>
 */
public class UpdateServiceInstanceAttributesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableOperation")
    private Boolean enableOperation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GrantedPermission")
    private GrantedPermission grantedPermission;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceInstanceId;

    private UpdateServiceInstanceAttributesRequest(Builder builder) {
        super(builder);
        this.enableOperation = builder.enableOperation;
        this.grantedPermission = builder.grantedPermission;
        this.regionId = builder.regionId;
        this.serviceInstanceId = builder.serviceInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateServiceInstanceAttributesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enableOperation
     */
    public Boolean getEnableOperation() {
        return this.enableOperation;
    }

    /**
     * @return grantedPermission
     */
    public GrantedPermission getGrantedPermission() {
        return this.grantedPermission;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return serviceInstanceId
     */
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    public static final class Builder extends Request.Builder<UpdateServiceInstanceAttributesRequest, Builder> {
        private Boolean enableOperation; 
        private GrantedPermission grantedPermission; 
        private String regionId; 
        private String serviceInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateServiceInstanceAttributesRequest request) {
            super(request);
            this.enableOperation = request.enableOperation;
            this.grantedPermission = request.grantedPermission;
            this.regionId = request.regionId;
            this.serviceInstanceId = request.serviceInstanceId;
        } 

        /**
         * <p>Specifies whether to authorize the service provider to perform O&amp;M operations on the service instance.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableOperation(Boolean enableOperation) {
            this.putQueryParameter("EnableOperation", enableOperation);
            this.enableOperation = enableOperation;
            return this;
        }

        /**
         * GrantedPermission.
         */
        public Builder grantedPermission(GrantedPermission grantedPermission) {
            this.putQueryParameter("GrantedPermission", grantedPermission);
            this.grantedPermission = grantedPermission;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the service instance.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/396200.html">ListServiceInstances</a> operation to obtain the ID of the service instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>si-d6ab3a63ccbb4b17xxxx</p>
         */
        public Builder serviceInstanceId(String serviceInstanceId) {
            this.putQueryParameter("ServiceInstanceId", serviceInstanceId);
            this.serviceInstanceId = serviceInstanceId;
            return this;
        }

        @Override
        public UpdateServiceInstanceAttributesRequest build() {
            return new UpdateServiceInstanceAttributesRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateServiceInstanceAttributesRequest} extends {@link TeaModel}
     *
     * <p>UpdateServiceInstanceAttributesRequest</p>
     */
    public static class GrantedPermission extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OperationEndTime")
        private String operationEndTime;

        @com.aliyun.core.annotation.NameInMap("PolicyNames")
        private String policyNames;

        private GrantedPermission(Builder builder) {
            this.operationEndTime = builder.operationEndTime;
            this.policyNames = builder.policyNames;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GrantedPermission create() {
            return builder().build();
        }

        /**
         * @return operationEndTime
         */
        public String getOperationEndTime() {
            return this.operationEndTime;
        }

        /**
         * @return policyNames
         */
        public String getPolicyNames() {
            return this.policyNames;
        }

        public static final class Builder {
            private String operationEndTime; 
            private String policyNames; 

            private Builder() {
            } 

            private Builder(GrantedPermission model) {
                this.operationEndTime = model.operationEndTime;
                this.policyNames = model.policyNames;
            } 

            /**
             * OperationEndTime.
             */
            public Builder operationEndTime(String operationEndTime) {
                this.operationEndTime = operationEndTime;
                return this;
            }

            /**
             * PolicyNames.
             */
            public Builder policyNames(String policyNames) {
                this.policyNames = policyNames;
                return this;
            }

            public GrantedPermission build() {
                return new GrantedPermission(this);
            } 

        } 

    }
}
