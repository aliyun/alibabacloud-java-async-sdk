// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDepartmentRequest} extends {@link RequestModel}
 *
 * <p>DeleteDepartmentRequest</p>
 */
public class DeleteDepartmentRequest extends Request {
    @Query
    @NameInMap("DepartmentId")
    @Validation(required = true)
    private Long departmentId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private DeleteDepartmentRequest(Builder builder) {
        super(builder);
        this.departmentId = builder.departmentId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDepartmentRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<DeleteDepartmentRequest, Builder> {
        private Long departmentId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDepartmentRequest response) {
            super(response);
            this.departmentId = response.departmentId;
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
         * 实例id
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public DeleteDepartmentRequest build() {
            return new DeleteDepartmentRequest(this);
        } 

    } 

}
