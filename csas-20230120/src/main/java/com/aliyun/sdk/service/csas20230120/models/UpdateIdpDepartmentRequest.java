// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateIdpDepartmentRequest} extends {@link RequestModel}
 *
 * <p>UpdateIdpDepartmentRequest</p>
 */
public class UpdateIdpDepartmentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DepartmentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String departmentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DepartmentName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String departmentName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdpConfigId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String idpConfigId;

    private UpdateIdpDepartmentRequest(Builder builder) {
        super(builder);
        this.departmentId = builder.departmentId;
        this.departmentName = builder.departmentName;
        this.idpConfigId = builder.idpConfigId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateIdpDepartmentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return departmentId
     */
    public String getDepartmentId() {
        return this.departmentId;
    }

    /**
     * @return departmentName
     */
    public String getDepartmentName() {
        return this.departmentName;
    }

    /**
     * @return idpConfigId
     */
    public String getIdpConfigId() {
        return this.idpConfigId;
    }

    public static final class Builder extends Request.Builder<UpdateIdpDepartmentRequest, Builder> {
        private String departmentId; 
        private String departmentName; 
        private String idpConfigId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateIdpDepartmentRequest request) {
            super(request);
            this.departmentId = request.departmentId;
            this.departmentName = request.departmentName;
            this.idpConfigId = request.idpConfigId;
        } 

        /**
         * DepartmentId.
         */
        public Builder departmentId(String departmentId) {
            this.putQueryParameter("DepartmentId", departmentId);
            this.departmentId = departmentId;
            return this;
        }

        /**
         * DepartmentName.
         */
        public Builder departmentName(String departmentName) {
            this.putQueryParameter("DepartmentName", departmentName);
            this.departmentName = departmentName;
            return this;
        }

        /**
         * IdpConfigId.
         */
        public Builder idpConfigId(String idpConfigId) {
            this.putQueryParameter("IdpConfigId", idpConfigId);
            this.idpConfigId = idpConfigId;
            return this;
        }

        @Override
        public UpdateIdpDepartmentRequest build() {
            return new UpdateIdpDepartmentRequest(this);
        } 

    } 

}
