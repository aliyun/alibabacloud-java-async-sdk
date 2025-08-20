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
 * {@link OpenStructSaseUser} extends {@link TeaModel}
 *
 * <p>OpenStructSaseUser</p>
 */
public class OpenStructSaseUser extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTimeUnix")
    private Long createTimeUnix;

    @com.aliyun.core.annotation.NameInMap("CustomFields")
    private java.util.List<IdpCustomField> customFields;

    @com.aliyun.core.annotation.NameInMap("Departments")
    private java.util.List<OpenStructSaseDepartment> departments;

    @com.aliyun.core.annotation.NameInMap("Email")
    private String email;

    @com.aliyun.core.annotation.NameInMap("IdpConfigId")
    private String idpConfigId;

    @com.aliyun.core.annotation.NameInMap("LeaveTimeUnix")
    private Long leaveTimeUnix;

    @com.aliyun.core.annotation.NameInMap("LoginTimeUnix")
    private Long loginTimeUnix;

    @com.aliyun.core.annotation.NameInMap("SaseUserId")
    private String saseUserId;

    @com.aliyun.core.annotation.NameInMap("SaseUserStatus")
    private String saseUserStatus;

    @com.aliyun.core.annotation.NameInMap("SyncTimeUnix")
    private Long syncTimeUnix;

    @com.aliyun.core.annotation.NameInMap("Telephone")
    private String telephone;

    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("UpdateTimeUnix")
    private Long updateTimeUnix;

    @com.aliyun.core.annotation.NameInMap("Username")
    private String username;

    @com.aliyun.core.annotation.NameInMap("WorkStatus")
    private String workStatus;

    private OpenStructSaseUser(Builder builder) {
        this.createTimeUnix = builder.createTimeUnix;
        this.customFields = builder.customFields;
        this.departments = builder.departments;
        this.email = builder.email;
        this.idpConfigId = builder.idpConfigId;
        this.leaveTimeUnix = builder.leaveTimeUnix;
        this.loginTimeUnix = builder.loginTimeUnix;
        this.saseUserId = builder.saseUserId;
        this.saseUserStatus = builder.saseUserStatus;
        this.syncTimeUnix = builder.syncTimeUnix;
        this.telephone = builder.telephone;
        this.title = builder.title;
        this.updateTimeUnix = builder.updateTimeUnix;
        this.username = builder.username;
        this.workStatus = builder.workStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenStructSaseUser create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTimeUnix
     */
    public Long getCreateTimeUnix() {
        return this.createTimeUnix;
    }

    /**
     * @return customFields
     */
    public java.util.List<IdpCustomField> getCustomFields() {
        return this.customFields;
    }

    /**
     * @return departments
     */
    public java.util.List<OpenStructSaseDepartment> getDepartments() {
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
     * @return leaveTimeUnix
     */
    public Long getLeaveTimeUnix() {
        return this.leaveTimeUnix;
    }

    /**
     * @return loginTimeUnix
     */
    public Long getLoginTimeUnix() {
        return this.loginTimeUnix;
    }

    /**
     * @return saseUserId
     */
    public String getSaseUserId() {
        return this.saseUserId;
    }

    /**
     * @return saseUserStatus
     */
    public String getSaseUserStatus() {
        return this.saseUserStatus;
    }

    /**
     * @return syncTimeUnix
     */
    public Long getSyncTimeUnix() {
        return this.syncTimeUnix;
    }

    /**
     * @return telephone
     */
    public String getTelephone() {
        return this.telephone;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return updateTimeUnix
     */
    public Long getUpdateTimeUnix() {
        return this.updateTimeUnix;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * @return workStatus
     */
    public String getWorkStatus() {
        return this.workStatus;
    }

    public static final class Builder {
        private Long createTimeUnix; 
        private java.util.List<IdpCustomField> customFields; 
        private java.util.List<OpenStructSaseDepartment> departments; 
        private String email; 
        private String idpConfigId; 
        private Long leaveTimeUnix; 
        private Long loginTimeUnix; 
        private String saseUserId; 
        private String saseUserStatus; 
        private Long syncTimeUnix; 
        private String telephone; 
        private String title; 
        private Long updateTimeUnix; 
        private String username; 
        private String workStatus; 

        private Builder() {
        } 

        private Builder(OpenStructSaseUser model) {
            this.createTimeUnix = model.createTimeUnix;
            this.customFields = model.customFields;
            this.departments = model.departments;
            this.email = model.email;
            this.idpConfigId = model.idpConfigId;
            this.leaveTimeUnix = model.leaveTimeUnix;
            this.loginTimeUnix = model.loginTimeUnix;
            this.saseUserId = model.saseUserId;
            this.saseUserStatus = model.saseUserStatus;
            this.syncTimeUnix = model.syncTimeUnix;
            this.telephone = model.telephone;
            this.title = model.title;
            this.updateTimeUnix = model.updateTimeUnix;
            this.username = model.username;
            this.workStatus = model.workStatus;
        } 

        /**
         * CreateTimeUnix.
         */
        public Builder createTimeUnix(Long createTimeUnix) {
            this.createTimeUnix = createTimeUnix;
            return this;
        }

        /**
         * CustomFields.
         */
        public Builder customFields(java.util.List<IdpCustomField> customFields) {
            this.customFields = customFields;
            return this;
        }

        /**
         * Departments.
         */
        public Builder departments(java.util.List<OpenStructSaseDepartment> departments) {
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
         * LeaveTimeUnix.
         */
        public Builder leaveTimeUnix(Long leaveTimeUnix) {
            this.leaveTimeUnix = leaveTimeUnix;
            return this;
        }

        /**
         * LoginTimeUnix.
         */
        public Builder loginTimeUnix(Long loginTimeUnix) {
            this.loginTimeUnix = loginTimeUnix;
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
         * SaseUserStatus.
         */
        public Builder saseUserStatus(String saseUserStatus) {
            this.saseUserStatus = saseUserStatus;
            return this;
        }

        /**
         * SyncTimeUnix.
         */
        public Builder syncTimeUnix(Long syncTimeUnix) {
            this.syncTimeUnix = syncTimeUnix;
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
         * Title.
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * UpdateTimeUnix.
         */
        public Builder updateTimeUnix(Long updateTimeUnix) {
            this.updateTimeUnix = updateTimeUnix;
            return this;
        }

        /**
         * Username.
         */
        public Builder username(String username) {
            this.username = username;
            return this;
        }

        /**
         * WorkStatus.
         */
        public Builder workStatus(String workStatus) {
            this.workStatus = workStatus;
            return this;
        }

        public OpenStructSaseUser build() {
            return new OpenStructSaseUser(this);
        } 

    } 

}
