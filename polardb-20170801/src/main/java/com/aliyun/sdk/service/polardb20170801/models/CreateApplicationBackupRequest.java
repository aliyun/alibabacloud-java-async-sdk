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
 * {@link CreateApplicationBackupRequest} extends {@link RequestModel}
 *
 * <p>CreateApplicationBackupRequest</p>
 */
public class CreateApplicationBackupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationType")
    private String applicationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private CreateApplicationBackupRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.applicationType = builder.applicationType;
        this.jobMode = builder.jobMode;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApplicationBackupRequest create() {
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
     * @return jobMode
     */
    public String getJobMode() {
        return this.jobMode;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateApplicationBackupRequest, Builder> {
        private String applicationId; 
        private String applicationType; 
        private String jobMode; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateApplicationBackupRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.applicationType = request.applicationType;
            this.jobMode = request.jobMode;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the application to back up.</p>
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
         * <p>The backup mode. Automated indicates an automatic backup, and Manual indicates a manual backup.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Manual</p>
         */
        public Builder jobMode(String jobMode) {
            this.putQueryParameter("JobMode", jobMode);
            this.jobMode = jobMode;
            return this;
        }

        /**
         * <p>The ID of the region where the application resides. The server uses the actual region of the application.</p>
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
        public CreateApplicationBackupRequest build() {
            return new CreateApplicationBackupRequest(this);
        } 

    } 

}
