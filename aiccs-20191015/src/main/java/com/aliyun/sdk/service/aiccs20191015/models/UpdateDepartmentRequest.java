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
 * {@link UpdateDepartmentRequest} extends {@link RequestModel}
 *
 * <p>UpdateDepartmentRequest</p>
 */
public class UpdateDepartmentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DepartmentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long departmentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DepartmentName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String departmentName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(UpdateDepartmentRequest request) {
            super(request);
            this.departmentId = request.departmentId;
            this.departmentName = request.departmentName;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder departmentId(Long departmentId) {
            this.putQueryParameter("DepartmentId", departmentId);
            this.departmentId = departmentId;
            return this;
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
        public UpdateDepartmentRequest build() {
            return new UpdateDepartmentRequest(this);
        } 

    } 

}
