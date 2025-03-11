// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
 * {@link SubmitCleanTaskRequest} extends {@link RequestModel}
 *
 * <p>SubmitCleanTaskRequest</p>
 */
public class SubmitCleanTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DrdsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String drdsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpandType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String expandType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentJobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String parentJobId;

    private SubmitCleanTaskRequest(Builder builder) {
        super(builder);
        this.dbName = builder.dbName;
        this.drdsInstanceId = builder.drdsInstanceId;
        this.expandType = builder.expandType;
        this.jobId = builder.jobId;
        this.parentJobId = builder.parentJobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitCleanTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    /**
     * @return expandType
     */
    public String getExpandType() {
        return this.expandType;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return parentJobId
     */
    public String getParentJobId() {
        return this.parentJobId;
    }

    public static final class Builder extends Request.Builder<SubmitCleanTaskRequest, Builder> {
        private String dbName; 
        private String drdsInstanceId; 
        private String expandType; 
        private String jobId; 
        private String parentJobId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitCleanTaskRequest request) {
            super(request);
            this.dbName = request.dbName;
            this.drdsInstanceId = request.drdsInstanceId;
            this.expandType = request.expandType;
            this.jobId = request.jobId;
            this.parentJobId = request.parentJobId;
        } 

        /**
         * <p>The name of the database that is scaled out.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * <p>The ID of the PolarDB-X 1.0 instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>drds*********</p>
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * <p>The scale-out type. Valid values:</p>
         * <ul>
         * <li>smooth_expand: smooth scale-out</li>
         * <li>hot_expand: hot-spot scale-out</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>smooth_expand</p>
         */
        public Builder expandType(String expandType) {
            this.putQueryParameter("ExpandType", expandType);
            this.expandType = expandType;
            return this;
        }

        /**
         * <p>The job ID of the scale-out task. The value of this parameter is the same as that of the ParentJobId parameter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The ID of the scale-out task. This parameter is returned if you send a request for the smooth scale-out task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder parentJobId(String parentJobId) {
            this.putQueryParameter("ParentJobId", parentJobId);
            this.parentJobId = parentJobId;
            return this;
        }

        @Override
        public SubmitCleanTaskRequest build() {
            return new SubmitCleanTaskRequest(this);
        } 

    } 

}
