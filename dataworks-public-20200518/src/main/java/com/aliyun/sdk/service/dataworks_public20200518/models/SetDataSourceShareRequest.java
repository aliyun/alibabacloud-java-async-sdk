// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetDataSourceShareRequest} extends {@link RequestModel}
 *
 * <p>SetDataSourceShareRequest</p>
 */
public class SetDataSourceShareRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasourceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasourceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnvType")
    private String envType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 10000000000D, minimum = 1)
    private Long projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectPermissions")
    private String projectPermissions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserPermissions")
    private String userPermissions;

    private SetDataSourceShareRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.datasourceName = builder.datasourceName;
        this.envType = builder.envType;
        this.projectId = builder.projectId;
        this.projectPermissions = builder.projectPermissions;
        this.userPermissions = builder.userPermissions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDataSourceShareRequest create() {
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
     * @return datasourceName
     */
    public String getDatasourceName() {
        return this.datasourceName;
    }

    /**
     * @return envType
     */
    public String getEnvType() {
        return this.envType;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return projectPermissions
     */
    public String getProjectPermissions() {
        return this.projectPermissions;
    }

    /**
     * @return userPermissions
     */
    public String getUserPermissions() {
        return this.userPermissions;
    }

    public static final class Builder extends Request.Builder<SetDataSourceShareRequest, Builder> {
        private String regionId; 
        private String datasourceName; 
        private String envType; 
        private Long projectId; 
        private String projectPermissions; 
        private String userPermissions; 

        private Builder() {
            super();
        } 

        private Builder(SetDataSourceShareRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.datasourceName = request.datasourceName;
            this.envType = request.envType;
            this.projectId = request.projectId;
            this.projectPermissions = request.projectPermissions;
            this.userPermissions = request.userPermissions;
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
         * <p>The name of the data source that you want to share.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql_name</p>
         */
        public Builder datasourceName(String datasourceName) {
            this.putQueryParameter("DatasourceName", datasourceName);
            this.datasourceName = datasourceName;
            return this;
        }

        /**
         * <p>The environment in which the data source is used. Valid values:</p>
         * <ul>
         * <li>0: development environment</li>
         * <li>1: production environment</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder envType(String envType) {
            this.putQueryParameter("EnvType", envType);
            this.envType = envType;
            return this;
        }

        /**
         * <p>The ID of the DataWorks workspace to which the data source belongs. You can call the <a href="https://help.aliyun.com/document_detail/178393.html">ListProjects</a> operation to query the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The DataWorks workspace to which you want to share the data source. If you configure this parameter, all members of the specified DataWorks workspace can view and use the data source. The value of this parameter is a JSON array. Example: [{&quot;projectId&quot;:1000,&quot;permission&quot;:&quot;WRITE&quot;,&quot;sharedName&quot;:&quot;PX_DATAHUB1.shared_name&quot;}], Parameter description:</p>
         * <ul>
         * <li>projectId: the ID of the DataWorks workspace to which you want to share the data source.</li>
         * <li>permission: the mode in which the data source is shared. Valid values: READ and WRITE. The value READ indicates that all members of the specified workspace can read data from the data source, but cannot modify the data. The value WRITE indicates that all members of the specified workspace can modify the data in the data source.</li>
         * <li>sharedName: the name of the data source that you want to share.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;projectId&quot;:1000,&quot;permission&quot;:&quot;WRITE&quot;,&quot;sharedName&quot;:&quot;PX_DATAHUB1.shared_name&quot;}]</p>
         */
        public Builder projectPermissions(String projectPermissions) {
            this.putQueryParameter("ProjectPermissions", projectPermissions);
            this.projectPermissions = projectPermissions;
            return this;
        }

        /**
         * <p>The user to whom you want to share the data source. If you configure this parameter, the specified user can view or use the data source. The value of this parameter is a JSON array. Example: [{&quot;projectId&quot;:10000,&quot;users&quot;:[{&quot;userId&quot;:&quot;276184575345452131&quot;,&quot;permission&quot;:&quot;WRITE&quot;}],&quot;sharedName&quot;:&quot;PX_DATAHUB1.shared_name&quot;}], Parameter description:</p>
         * <ul>
         * <li>projectId: the ID of the DataWorks workspace. If you configure the UserPermissions parameter, the specified user can view or use the data source only in the specified DataWorks workspace.</li>
         * <li>userId: the ID of the user to whom you want to share the data source.</li>
         * <li>permission: the mode in which the data source is shared. Valid values: READ and WRITE. The value READ indicates that the specified user can read data from the data source, but cannot modify the data. The value WRITE indicates that the specified user can modify the data in the data source.</li>
         * <li>sharedName: the name of the data source that you want to share.</li>
         * </ul>
         * <p>If the ProjectPermissions and UserPermissions parameters are both left empty, the specified data source is not shared to any DataWorks workspace or user. If neither of the parameters is left empty, both parameters take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;projectId&quot;:10000,&quot;users&quot;:[{&quot;userId&quot;:&quot;276184575345452131&quot;,&quot;permission&quot;:&quot;WRITE&quot;}],&quot;sharedName&quot;:&quot;PX_DATAHUB1.shared_name&quot;}]</p>
         */
        public Builder userPermissions(String userPermissions) {
            this.putQueryParameter("UserPermissions", userPermissions);
            this.userPermissions = userPermissions;
            return this;
        }

        @Override
        public SetDataSourceShareRequest build() {
            return new SetDataSourceShareRequest(this);
        } 

    } 

}
