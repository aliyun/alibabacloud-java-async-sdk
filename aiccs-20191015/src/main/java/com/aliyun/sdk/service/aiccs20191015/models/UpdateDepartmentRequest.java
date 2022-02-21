// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDepartmentRequest} extends {@link RequestModel}
 *
 * <p>UpdateDepartmentRequest</p>
 */
public class UpdateDepartmentRequest extends Request {
    @Query
    @NameInMap("DepartmentId")
    @Validation(required = true)
    private Long departmentId;

    @Query
    @NameInMap("DepartmentName")
    @Validation(required = true)
    private String departmentName;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private UpdateDepartmentRequest(Builder builder) {
        super(builder);
        this.departmentId = builder.departmentId;
        this.departmentName = builder.departmentName;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDepartmentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return departmentId
     */
    public Long getDepartmentId() {
        return this.departmentId;
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

    public static final class Builder extends Request.Builder<UpdateDepartmentRequest, Builder> {
        private Long departmentId; 
        private String departmentName; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDepartmentRequest response) {
            super(response);
            this.departmentId = response.departmentId;
            this.departmentName = response.departmentName;
            this.instanceId = response.instanceId;
        } 

        /**
         * 部门id
         */
        public Builder departmentId(Long departmentId) {
            this.putQueryParameter("DepartmentId", departmentId);
            this.departmentId = departmentId;
            return this;
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
        public UpdateDepartmentRequest build() {
            return new UpdateDepartmentRequest(this);
        } 

    } 

}
