// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link GetQualityEntityRequest} extends {@link RequestModel}
 *
 * <p>GetQualityEntityRequest</p>
 */
public class GetQualityEntityRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnvType")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 1)
    private String envType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MatchExpression")
    @com.aliyun.core.annotation.Validation(maxLength = 128, minLength = 1)
    private String matchExpression;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 1024, minLength = 1)
    private String projectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TableName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
    private String tableName;

    private GetQualityEntityRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.envType = builder.envType;
        this.matchExpression = builder.matchExpression;
        this.projectId = builder.projectId;
        this.projectName = builder.projectName;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQualityEntityRequest create() {
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
     * @return envType
     */
    public String getEnvType() {
        return this.envType;
    }

    /**
     * @return matchExpression
     */
    public String getMatchExpression() {
        return this.matchExpression;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    public static final class Builder extends Request.Builder<GetQualityEntityRequest, Builder> {
        private String regionId; 
        private String envType; 
        private String matchExpression; 
        private Long projectId; 
        private String projectName; 
        private String tableName; 

        private Builder() {
            super();
        } 

        private Builder(GetQualityEntityRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.envType = request.envType;
            this.matchExpression = request.matchExpression;
            this.projectId = request.projectId;
            this.projectName = request.projectName;
            this.tableName = request.tableName;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The type of the compute engine or data source. Valid values:</p>
         * <ul>
         * <li>cdh</li>
         * <li>analyticdb_for_mysql</li>
         * <li>odps</li>
         * <li>emr</li>
         * <li>hadoop</li>
         * <li>holodb</li>
         * <li>hybriddb_for_postgresql</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>odps</p>
         */
        public Builder envType(String envType) {
            this.putBodyParameter("EnvType", envType);
            this.envType = envType;
            return this;
        }

        /**
         * <p>The partition filter expression.</p>
         * 
         * <strong>example:</strong>
         * <p>dt=$[yyyymmdd]</p>
         */
        public Builder matchExpression(String matchExpression) {
            this.putBodyParameter("MatchExpression", matchExpression);
            this.matchExpression = matchExpression;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The name of the compute engine instance or data source. You can obtain the name from data source configurations.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>autotest</p>
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The name of the partitioned table. You can call the <a href="https://help.aliyun.com/document_detail/173923.html">GetMetaTablePartition</a> operation to obtain the name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dual</p>
         */
        public Builder tableName(String tableName) {
            this.putBodyParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        @Override
        public GetQualityEntityRequest build() {
            return new GetQualityEntityRequest(this);
        } 

    } 

}
