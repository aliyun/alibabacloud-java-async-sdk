// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetConfigNumListRequest} extends {@link RequestModel}
 *
 * <p>GetConfigNumListRequest</p>
 */
public class GetConfigNumListRequest extends Request {
    @Query
    @NameInMap("AccountName")
    private String accountName;

    @Query
    @NameInMap("DepartmentId")
    private Long departmentId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private GetConfigNumListRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.departmentId = builder.departmentId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConfigNumListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountName
     */
    public String getAccountName() {
        return this.accountName;
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

    public static final class Builder extends Request.Builder<GetConfigNumListRequest, Builder> {
        private String accountName; 
        private Long departmentId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetConfigNumListRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.departmentId = request.departmentId;
            this.instanceId = request.instanceId;
        } 

        /**
         * 账号名称
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * 部门ID
         */
        public Builder departmentId(Long departmentId) {
            this.putQueryParameter("DepartmentId", departmentId);
            this.departmentId = departmentId;
            return this;
        }

        /**
         * 实例ID
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public GetConfigNumListRequest build() {
            return new GetConfigNumListRequest(this);
        } 

    } 

}
