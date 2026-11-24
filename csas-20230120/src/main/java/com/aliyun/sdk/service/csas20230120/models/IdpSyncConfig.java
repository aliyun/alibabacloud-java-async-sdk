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
 * {@link IdpSyncConfig} extends {@link TeaModel}
 *
 * <p>IdpSyncConfig</p>
 */
public class IdpSyncConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutoSyncEnabled")
    private Boolean autoSyncEnabled;

    @com.aliyun.core.annotation.NameInMap("IdpDepartmentInfos")
    private java.util.List<IdpDepartmentInfos> idpDepartmentInfos;

    @com.aliyun.core.annotation.NameInMap("ScheduleSyncIntervalSecond")
    private Long scheduleSyncIntervalSecond;

    @com.aliyun.core.annotation.NameInMap("UserSyncEnabled")
    private Boolean userSyncEnabled;

    private IdpSyncConfig(Builder builder) {
        this.autoSyncEnabled = builder.autoSyncEnabled;
        this.idpDepartmentInfos = builder.idpDepartmentInfos;
        this.scheduleSyncIntervalSecond = builder.scheduleSyncIntervalSecond;
        this.userSyncEnabled = builder.userSyncEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IdpSyncConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoSyncEnabled
     */
    public Boolean getAutoSyncEnabled() {
        return this.autoSyncEnabled;
    }

    /**
     * @return idpDepartmentInfos
     */
    public java.util.List<IdpDepartmentInfos> getIdpDepartmentInfos() {
        return this.idpDepartmentInfos;
    }

    /**
     * @return scheduleSyncIntervalSecond
     */
    public Long getScheduleSyncIntervalSecond() {
        return this.scheduleSyncIntervalSecond;
    }

    /**
     * @return userSyncEnabled
     */
    public Boolean getUserSyncEnabled() {
        return this.userSyncEnabled;
    }

    public static final class Builder {
        private Boolean autoSyncEnabled; 
        private java.util.List<IdpDepartmentInfos> idpDepartmentInfos; 
        private Long scheduleSyncIntervalSecond; 
        private Boolean userSyncEnabled; 

        private Builder() {
        } 

        private Builder(IdpSyncConfig model) {
            this.autoSyncEnabled = model.autoSyncEnabled;
            this.idpDepartmentInfos = model.idpDepartmentInfos;
            this.scheduleSyncIntervalSecond = model.scheduleSyncIntervalSecond;
            this.userSyncEnabled = model.userSyncEnabled;
        } 

        /**
         * AutoSyncEnabled.
         */
        public Builder autoSyncEnabled(Boolean autoSyncEnabled) {
            this.autoSyncEnabled = autoSyncEnabled;
            return this;
        }

        /**
         * IdpDepartmentInfos.
         */
        public Builder idpDepartmentInfos(java.util.List<IdpDepartmentInfos> idpDepartmentInfos) {
            this.idpDepartmentInfos = idpDepartmentInfos;
            return this;
        }

        /**
         * ScheduleSyncIntervalSecond.
         */
        public Builder scheduleSyncIntervalSecond(Long scheduleSyncIntervalSecond) {
            this.scheduleSyncIntervalSecond = scheduleSyncIntervalSecond;
            return this;
        }

        /**
         * UserSyncEnabled.
         */
        public Builder userSyncEnabled(Boolean userSyncEnabled) {
            this.userSyncEnabled = userSyncEnabled;
            return this;
        }

        public IdpSyncConfig build() {
            return new IdpSyncConfig(this);
        } 

    } 

    /**
     * 
     * {@link IdpSyncConfig} extends {@link TeaModel}
     *
     * <p>IdpSyncConfig</p>
     */
    public static class IdpDepartmentInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private IdpDepartmentInfos(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IdpDepartmentInfos create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String id; 
            private String name; 

            private Builder() {
            } 

            private Builder(IdpDepartmentInfos model) {
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public IdpDepartmentInfos build() {
                return new IdpDepartmentInfos(this);
            } 

        } 

    }
}
