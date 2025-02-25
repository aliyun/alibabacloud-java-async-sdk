// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link DeleteProcessInstanceRequest} extends {@link RequestModel}
 *
 * <p>DeleteProcessInstanceRequest</p>
 */
public class DeleteProcessInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProcessInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long processInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DeleteProcessInstanceRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.processInstanceId = builder.processInstanceId;
        this.projectCode = builder.projectCode;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteProcessInstanceRequest create() {
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
     * @return processInstanceId
     */
    public Long getProcessInstanceId() {
        return this.processInstanceId;
    }

    /**
     * @return projectCode
     */
    public Long getProjectCode() {
        return this.projectCode;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteProcessInstanceRequest, Builder> {
        private String DBClusterId; 
        private Long processInstanceId; 
        private Long projectCode; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteProcessInstanceRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.processInstanceId = request.processInstanceId;
            this.projectCode = request.projectCode;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition cluster.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/612397.html">DescribeDBClusters</a> operation to query the IDs of all AnalyticDB for MySQL clusters within a region.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>am-wz9rq819u71ig****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The ID of the workflow instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4017</p>
         */
        public Builder processInstanceId(Long processInstanceId) {
            this.putQueryParameter("ProcessInstanceId", processInstanceId);
            this.processInstanceId = processInstanceId;
            return this;
        }

        /**
         * <p>The project ID, which is the unique identifier of the project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9839028042592</p>
         */
        public Builder projectCode(Long projectCode) {
            this.putQueryParameter("ProjectCode", projectCode);
            this.projectCode = projectCode;
            return this;
        }

        /**
         * <p>The region ID of the cluster.</p>
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

        @Override
        public DeleteProcessInstanceRequest build() {
            return new DeleteProcessInstanceRequest(this);
        } 

    } 

}
