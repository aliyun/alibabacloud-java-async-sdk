// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDepartmentRequest} extends {@link RequestModel}
 *
 * <p>CreateDepartmentRequest</p>
 */
public class CreateDepartmentRequest extends Request {
    @Query
    @NameInMap("DepartmentName")
    @Validation(required = true)
    private String departmentName;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
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
         * 部门名称
         */
        public Builder departmentName(String departmentName) {
            this.putQueryParameter("DepartmentName", departmentName);
            this.departmentName = departmentName;
            return this;
        }

        /**
         * 实例id
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
