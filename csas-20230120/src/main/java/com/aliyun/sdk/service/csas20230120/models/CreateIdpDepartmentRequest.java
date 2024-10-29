// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateIdpDepartmentRequest} extends {@link RequestModel}
 *
 * <p>CreateIdpDepartmentRequest</p>
 */
public class CreateIdpDepartmentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DepartmentName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String departmentName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdpConfigId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String idpConfigId;

    private CreateIdpDepartmentRequest(Builder builder) {
        super(builder);
        this.departmentName = builder.departmentName;
        this.idpConfigId = builder.idpConfigId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIdpDepartmentRequest create() {
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
     * @return idpConfigId
     */
    public String getIdpConfigId() {
        return this.idpConfigId;
    }

    public static final class Builder extends Request.Builder<CreateIdpDepartmentRequest, Builder> {
        private String departmentName; 
        private String idpConfigId; 

        private Builder() {
            super();
        } 

        private Builder(CreateIdpDepartmentRequest request) {
            super(request);
            this.departmentName = request.departmentName;
            this.idpConfigId = request.idpConfigId;
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
         * <p>1222</p>
         */
        public Builder idpConfigId(String idpConfigId) {
            this.putQueryParameter("IdpConfigId", idpConfigId);
            this.idpConfigId = idpConfigId;
            return this;
        }

        @Override
        public CreateIdpDepartmentRequest build() {
            return new CreateIdpDepartmentRequest(this);
        } 

    } 

}
