// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link CreateDataSourceSharedRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateDataSourceSharedRuleRequest</p>
 */
public class CreateDataSourceSharedRuleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long dataSourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnvType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String envType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SharedUser")
    private String sharedUser;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long targetProjectId;

    private CreateDataSourceSharedRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dataSourceId = builder.dataSourceId;
        this.envType = builder.envType;
        this.sharedUser = builder.sharedUser;
        this.targetProjectId = builder.targetProjectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataSourceSharedRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return dataSourceId
     */
    public Long getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * @return envType
     */
    public String getEnvType() {
        return this.envType;
    }

    /**
     * @return sharedUser
     */
    public String getSharedUser() {
        return this.sharedUser;
    }

    /**
     * @return targetProjectId
     */
    public Long getTargetProjectId() {
        return this.targetProjectId;
    }

    public static final class Builder extends Request.Builder<CreateDataSourceSharedRuleRequest, Builder> {
        private String regionId; 
        private Long dataSourceId; 
        private String envType; 
        private String sharedUser; 
        private Long targetProjectId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataSourceSharedRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dataSourceId = request.dataSourceId;
            this.envType = request.envType;
            this.sharedUser = request.sharedUser;
            this.targetProjectId = request.targetProjectId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The data source ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>144544</p>
         */
        public Builder dataSourceId(Long dataSourceId) {
            this.putQueryParameter("DataSourceId", dataSourceId);
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Dev</p>
         */
        public Builder envType(String envType) {
            this.putQueryParameter("EnvType", envType);
            this.envType = envType;
            return this;
        }

        /**
         * <p>The user with which you want to share the data source. If you do not configure this parameter, the data source is shared to an entire workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>1107550004253538</p>
         */
        public Builder sharedUser(String sharedUser) {
            this.putQueryParameter("SharedUser", sharedUser);
            this.sharedUser = sharedUser;
            return this;
        }

        /**
         * <p>The ID of the workspace to which you want to share the data source. You cannot share the data source to the workspace with which the data source is associated.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>106560</p>
         */
        public Builder targetProjectId(Long targetProjectId) {
            this.putQueryParameter("TargetProjectId", targetProjectId);
            this.targetProjectId = targetProjectId;
            return this;
        }

        @Override
        public CreateDataSourceSharedRuleRequest build() {
            return new CreateDataSourceSharedRuleRequest(this);
        } 

    } 

}
