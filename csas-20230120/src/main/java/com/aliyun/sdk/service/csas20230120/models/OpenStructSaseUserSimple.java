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
 * {@link OpenStructSaseUserSimple} extends {@link TeaModel}
 *
 * <p>OpenStructSaseUserSimple</p>
 */
public class OpenStructSaseUserSimple extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Departments")
    private java.util.List<Departments> departments;

    @com.aliyun.core.annotation.NameInMap("Email")
    private String email;

    @com.aliyun.core.annotation.NameInMap("IdpConfigId")
    private String idpConfigId;

    @com.aliyun.core.annotation.NameInMap("SaseUserId")
    private String saseUserId;

    @com.aliyun.core.annotation.NameInMap("Telephone")
    private String telephone;

    @com.aliyun.core.annotation.NameInMap("Username")
    private String username;

    private OpenStructSaseUserSimple(Builder builder) {
        this.departments = builder.departments;
        this.email = builder.email;
        this.idpConfigId = builder.idpConfigId;
        this.saseUserId = builder.saseUserId;
        this.telephone = builder.telephone;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenStructSaseUserSimple create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return departments
     */
    public java.util.List<Departments> getDepartments() {
        return this.departments;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return idpConfigId
     */
    public String getIdpConfigId() {
        return this.idpConfigId;
    }

    /**
     * @return saseUserId
     */
    public String getSaseUserId() {
        return this.saseUserId;
    }

    /**
     * @return telephone
     */
    public String getTelephone() {
        return this.telephone;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder {
        private java.util.List<Departments> departments; 
        private String email; 
        private String idpConfigId; 
        private String saseUserId; 
        private String telephone; 
        private String username; 

        private Builder() {
        } 

        private Builder(OpenStructSaseUserSimple model) {
            this.departments = model.departments;
            this.email = model.email;
            this.idpConfigId = model.idpConfigId;
            this.saseUserId = model.saseUserId;
            this.telephone = model.telephone;
            this.username = model.username;
        } 

        /**
         * Departments.
         */
        public Builder departments(java.util.List<Departments> departments) {
            this.departments = departments;
            return this;
        }

        /**
         * Email.
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * IdpConfigId.
         */
        public Builder idpConfigId(String idpConfigId) {
            this.idpConfigId = idpConfigId;
            return this;
        }

        /**
         * SaseUserId.
         */
        public Builder saseUserId(String saseUserId) {
            this.saseUserId = saseUserId;
            return this;
        }

        /**
         * Telephone.
         */
        public Builder telephone(String telephone) {
            this.telephone = telephone;
            return this;
        }

        /**
         * Username.
         */
        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public OpenStructSaseUserSimple build() {
            return new OpenStructSaseUserSimple(this);
        } 

    } 

    /**
     * 
     * {@link OpenStructSaseUserSimple} extends {@link TeaModel}
     *
     * <p>OpenStructSaseUserSimple</p>
     */
    public static class Departments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DepartmentId")
        private String departmentId;

        @com.aliyun.core.annotation.NameInMap("FullDepartmentIdPath")
        private String fullDepartmentIdPath;

        @com.aliyun.core.annotation.NameInMap("FullDn")
        private String fullDn;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ParentDepartmentId")
        private String parentDepartmentId;

        private Departments(Builder builder) {
            this.departmentId = builder.departmentId;
            this.fullDepartmentIdPath = builder.fullDepartmentIdPath;
            this.fullDn = builder.fullDn;
            this.name = builder.name;
            this.parentDepartmentId = builder.parentDepartmentId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Departments create() {
            return builder().build();
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
            private String name; 
            private String parentDepartmentId; 

            private Builder() {
            } 

            private Builder(Departments model) {
                this.departmentId = model.departmentId;
                this.fullDepartmentIdPath = model.fullDepartmentIdPath;
                this.fullDn = model.fullDn;
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

            public Departments build() {
                return new Departments(this);
            } 

        } 

    }
}
