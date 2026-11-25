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
 * {@link CreateAgenticDBProjectRequest} extends {@link RequestModel}
 *
 * <p>CreateAgenticDBProjectRequest</p>
 */
public class CreateAgenticDBProjectRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultBranchName")
    private String defaultBranchName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HistoryRetentionSeconds")
    private Long historyRetentionSeconds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private CreateAgenticDBProjectRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.defaultBranchName = builder.defaultBranchName;
        this.description = builder.description;
        this.historyRetentionSeconds = builder.historyRetentionSeconds;
        this.projectName = builder.projectName;
        this.regionId = builder.regionId;
        this.tenantId = builder.tenantId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAgenticDBProjectRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return defaultBranchName
     */
    public String getDefaultBranchName() {
        return this.defaultBranchName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return historyRetentionSeconds
     */
    public Long getHistoryRetentionSeconds() {
        return this.historyRetentionSeconds;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateAgenticDBProjectRequest, Builder> {
        private String DBClusterId; 
        private String defaultBranchName; 
        private String description; 
        private Long historyRetentionSeconds; 
        private String projectName; 
        private String regionId; 
        private String tenantId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAgenticDBProjectRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.defaultBranchName = request.defaultBranchName;
            this.description = request.description;
            this.historyRetentionSeconds = request.historyRetentionSeconds;
            this.projectName = request.projectName;
            this.regionId = request.regionId;
            this.tenantId = request.tenantId;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>The ID of the AgenticDB cluster. The ID must have the pagc- prefix. You can obtain the ID after calling CreateDBCluster and specifying AgenticDbType=dedicated and ServerlessType=AgileServerless. A regular cluster ID with the pc- prefix is not supported. If an invalid ID is provided, the InvalidDBClusterId.NotFound error may be returned.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pagc-bp1abcdef1234567</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The name of the default branch. Default value: main.</p>
         * 
         * <strong>example:</strong>
         * <p>main</p>
         */
        public Builder defaultBranchName(String defaultBranchName) {
            this.putQueryParameter("DefaultBranchName", defaultBranchName);
            this.defaultBranchName = defaultBranchName;
            return this;
        }

        /**
         * <p>The description of the project.</p>
         * 
         * <strong>example:</strong>
         * <p>Production analytics database</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The retention period of historical data, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>604800</p>
         */
        public Builder historyRetentionSeconds(Long historyRetentionSeconds) {
            this.putQueryParameter("HistoryRetentionSeconds", historyRetentionSeconds);
            this.historyRetentionSeconds = historyRetentionSeconds;
            return this;
        }

        /**
         * <p>The name of the project. The name must be unique within the same tenant.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>analytics-prod</p>
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the tenant. You can obtain the ID from the response after calling CreateAgenticDBTenant to create a tenant.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>t-4b83e0da66674951</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>The ID of the zone where the project storage resides. The zone must be the same as the zone where the cluster compute resides. If this parameter is not specified, the zone where the cluster compute resides is used by default.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-l</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateAgenticDBProjectRequest build() {
            return new CreateAgenticDBProjectRequest(this);
        } 

    } 

}
