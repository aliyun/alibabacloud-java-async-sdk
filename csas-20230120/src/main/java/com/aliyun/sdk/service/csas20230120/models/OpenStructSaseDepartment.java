// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link OpenStructSaseDepartment} extends {@link TeaModel}
 *
 * <p>OpenStructSaseDepartment</p>
 */
public class OpenStructSaseDepartment extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DepartmentId")
    private String departmentId;

    @com.aliyun.core.annotation.NameInMap("FullDepartmentIdPath")
    private String fullDepartmentIdPath;

    @com.aliyun.core.annotation.NameInMap("FullDn")
    private String fullDn;

    @com.aliyun.core.annotation.NameInMap("IdpId")
    private Long idpId;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("ParentDepartmentId")
    private String parentDepartmentId;

    private OpenStructSaseDepartment(Builder builder) {
        this.departmentId = builder.departmentId;
        this.fullDepartmentIdPath = builder.fullDepartmentIdPath;
        this.fullDn = builder.fullDn;
        this.idpId = builder.idpId;
        this.name = builder.name;
        this.parentDepartmentId = builder.parentDepartmentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenStructSaseDepartment create() {
        return builder().build();
    }

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
     * @return fullDepartmentIdPath
     */
    public String getFullDepartmentIdPath() {
        return this.fullDepartmentIdPath;
    }

    /**
     * @return fullDn
     */
    public String getFullDn() {
        return this.fullDn;
    }

    /**
     * @return idpId
     */
    public Long getIdpId() {
        return this.idpId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return parentDepartmentId
     */
    public String getParentDepartmentId() {
        return this.parentDepartmentId;
    }

    public static final class Builder {
        private String departmentId; 
        private String fullDepartmentIdPath; 
        private String fullDn; 
        private Long idpId; 
        private String name; 
        private String parentDepartmentId; 

        private Builder() {
        } 

        private Builder(OpenStructSaseDepartment model) {
            this.departmentId = model.departmentId;
            this.fullDepartmentIdPath = model.fullDepartmentIdPath;
            this.fullDn = model.fullDn;
            this.idpId = model.idpId;
            this.name = model.name;
            this.parentDepartmentId = model.parentDepartmentId;
        } 

        /**
         * DepartmentId.
         */
        public Builder departmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }

        /**
         * FullDepartmentIdPath.
         */
        public Builder fullDepartmentIdPath(String fullDepartmentIdPath) {
            this.fullDepartmentIdPath = fullDepartmentIdPath;
            return this;
        }

        /**
         * FullDn.
         */
        public Builder fullDn(String fullDn) {
            this.fullDn = fullDn;
            return this;
        }

        /**
         * IdpId.
         */
        public Builder idpId(Long idpId) {
            this.idpId = idpId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * ParentDepartmentId.
         */
        public Builder parentDepartmentId(String parentDepartmentId) {
            this.parentDepartmentId = parentDepartmentId;
            return this;
        }

        public OpenStructSaseDepartment build() {
            return new OpenStructSaseDepartment(this);
        } 

    } 

}
