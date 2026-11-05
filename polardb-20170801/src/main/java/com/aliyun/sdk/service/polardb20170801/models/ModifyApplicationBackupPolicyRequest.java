// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link ModifyApplicationBackupPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyApplicationBackupPolicyRequest</p>
 */
public class ModifyApplicationBackupPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationType")
    private String applicationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreferredBackupPeriod")
    private String preferredBackupPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreferredBackupRetentionPeriod")
    private String preferredBackupRetentionPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreferredBackupTime")
    private String preferredBackupTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ModifyApplicationBackupPolicyRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.applicationType = builder.applicationType;
        this.preferredBackupPeriod = builder.preferredBackupPeriod;
        this.preferredBackupRetentionPeriod = builder.preferredBackupRetentionPeriod;
        this.preferredBackupTime = builder.preferredBackupTime;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyApplicationBackupPolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return applicationType
     */
    public String getApplicationType() {
        return this.applicationType;
    }

    /**
     * @return preferredBackupPeriod
     */
    public String getPreferredBackupPeriod() {
        return this.preferredBackupPeriod;
    }

    /**
     * @return preferredBackupRetentionPeriod
     */
    public String getPreferredBackupRetentionPeriod() {
        return this.preferredBackupRetentionPeriod;
    }

    /**
     * @return preferredBackupTime
     */
    public String getPreferredBackupTime() {
        return this.preferredBackupTime;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyApplicationBackupPolicyRequest, Builder> {
        private String applicationId; 
        private String applicationType; 
        private String preferredBackupPeriod; 
        private String preferredBackupRetentionPeriod; 
        private String preferredBackupTime; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyApplicationBackupPolicyRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.applicationType = request.applicationType;
            this.preferredBackupPeriod = request.preferredBackupPeriod;
            this.preferredBackupRetentionPeriod = request.preferredBackupRetentionPeriod;
            this.preferredBackupTime = request.preferredBackupTime;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The application ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The application type, such as polarclaw.</p>
         * 
         * <strong>example:</strong>
         * <p>polarclaw</p>
         */
        public Builder applicationType(String applicationType) {
            this.putQueryParameter("ApplicationType", applicationType);
            this.applicationType = applicationType;
            return this;
        }

        /**
         * <p>The days of the week when automatic backups are performed. Separate multiple values with commas. Valid values: Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, and Sunday.</p>
         * 
         * <strong>example:</strong>
         * <p>Monday,Tuesday</p>
         */
        public Builder preferredBackupPeriod(String preferredBackupPeriod) {
            this.putQueryParameter("PreferredBackupPeriod", preferredBackupPeriod);
            this.preferredBackupPeriod = preferredBackupPeriod;
            return this;
        }

        /**
         * <p>The retention period of level-1 backups, in days.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder preferredBackupRetentionPeriod(String preferredBackupRetentionPeriod) {
            this.putQueryParameter("PreferredBackupRetentionPeriod", preferredBackupRetentionPeriod);
            this.preferredBackupRetentionPeriod = preferredBackupRetentionPeriod;
            return this;
        }

        /**
         * <p>The time window when automatic backups are performed. The format is HH:mmZ-HH:mmZ in UTC. The start time and end time must be on the hour and exactly one hour apart.</p>
         * 
         * <strong>example:</strong>
         * <p>07:00Z-08:00Z</p>
         */
        public Builder preferredBackupTime(String preferredBackupTime) {
            this.putQueryParameter("PreferredBackupTime", preferredBackupTime);
            this.preferredBackupTime = preferredBackupTime;
            return this;
        }

        /**
         * <p>The region ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyApplicationBackupPolicyRequest build() {
            return new ModifyApplicationBackupPolicyRequest(this);
        } 

    } 

}
