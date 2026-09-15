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
 * {@link GetValidDeductInstancesRequest} extends {@link RequestModel}
 *
 * <p>GetValidDeductInstancesRequest</p>
 */
public class GetValidDeductInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Modules")
    private String modules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    private GetValidDeductInstancesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.modules = builder.modules;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetValidDeductInstancesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return modules
     */
    public String getModules() {
        return this.modules;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<GetValidDeductInstancesRequest, Builder> {
        private String instanceId; 
        private String modules; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(GetValidDeductInstancesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.modules = request.modules;
            this.status = request.status;
        } 

        /**
         * <p>Instance ID of the resource plan instance. You can call <a href="">QueryResourcePackageInstances</a> to query instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sas_cspm_dp_cn-***80001</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The code of the resource plan. Valid values:</p>
         * <ul>
         * <li>Vulnerability resource plan: <strong>sas_vul_dp_cn</strong></li>
         * <li>CSPM resource plan: <strong>sas_cspm_dp_cn</strong></li>
         * <li>Anti-virus Edition resource plan: <strong>sas_viruspackage_dp_cn</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sas_vul_dp_cn</p>
         */
        public Builder modules(String modules) {
            this.putQueryParameter("Modules", modules);
            this.modules = modules;
            return this;
        }

        /**
         * <p>The status of the resource plan. Default value: valid. This parameter does not support modification.</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public GetValidDeductInstancesRequest build() {
            return new GetValidDeductInstancesRequest(this);
        } 

    } 

}
