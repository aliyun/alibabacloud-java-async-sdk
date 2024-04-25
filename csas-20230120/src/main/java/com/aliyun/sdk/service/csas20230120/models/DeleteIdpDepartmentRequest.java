// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteIdpDepartmentRequest} extends {@link RequestModel}
 *
 * <p>DeleteIdpDepartmentRequest</p>
 */
public class DeleteIdpDepartmentRequest extends Request {
    @Query
    @NameInMap("DepartmentId")
    @Validation(required = true)
    private String departmentId;

    @Query
    @NameInMap("IdpConfigId")
    @Validation(required = true)
    private String idpConfigId;

    private DeleteIdpDepartmentRequest(Builder builder) {
        super(builder);
        this.departmentId = builder.departmentId;
        this.idpConfigId = builder.idpConfigId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteIdpDepartmentRequest create() {
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
     * @return idpConfigId
     */
    public String getIdpConfigId() {
        return this.idpConfigId;
    }

    public static final class Builder extends Request.Builder<DeleteIdpDepartmentRequest, Builder> {
        private String departmentId; 
        private String idpConfigId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteIdpDepartmentRequest request) {
            super(request);
            this.departmentId = request.departmentId;
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
         * IdpConfigId.
         */
        public Builder idpConfigId(String idpConfigId) {
            this.putQueryParameter("IdpConfigId", idpConfigId);
            this.idpConfigId = idpConfigId;
            return this;
        }

        @Override
        public DeleteIdpDepartmentRequest build() {
            return new DeleteIdpDepartmentRequest(this);
        } 

    } 

}
