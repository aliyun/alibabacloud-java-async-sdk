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

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Departments(Builder builder) {
            this.departmentId = builder.departmentId;
            this.name = builder.name;
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String departmentId; 
            private String name; 

            private Builder() {
            } 

            private Builder(Departments model) {
                this.departmentId = model.departmentId;
                this.name = model.name;
            } 

            /**
             * DepartmentId.
             */
            public Builder departmentId(String departmentId) {
                this.departmentId = departmentId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Departments build() {
                return new Departments(this);
            } 

        } 

    }
}
