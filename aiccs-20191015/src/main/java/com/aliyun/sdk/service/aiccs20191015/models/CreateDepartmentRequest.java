// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link CreateDepartmentRequest} extends {@link RequestModel}
 *
 * <p>CreateDepartmentRequest</p>
 */
public class CreateDepartmentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DepartmentName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String departmentName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private CreateDepartmentRequest(Builder builder) {
        super(builder);
        this.departmentName = builder.departmentName;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDepartmentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return departmentName
     */
    public String getDepartmentName() {
        return this.departmentName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<CreateDepartmentRequest, Builder> {
        private String departmentName; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDepartmentRequest request) {
            super(request);
            this.departmentName = request.departmentName;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder departmentName(String departmentName) {
            this.putQueryParameter("DepartmentName", departmentName);
            this.departmentName = departmentName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc_xp_pre-cn-***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public CreateDepartmentRequest build() {
            return new CreateDepartmentRequest(this);
        } 

    } 

}
