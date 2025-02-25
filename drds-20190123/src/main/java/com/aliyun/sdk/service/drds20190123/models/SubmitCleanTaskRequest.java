// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitCleanTaskRequest} extends {@link RequestModel}
 *
 * <p>SubmitCleanTaskRequest</p>
 */
public class SubmitCleanTaskRequest extends Request {
    @Query
    @NameInMap("DbName")
    @Validation(required = true)
    private String dbName;

    @Query
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    private String drdsInstanceId;

    @Query
    @NameInMap("ExpandType")
    @Validation(required = true)
    private String expandType;

    @Query
    @NameInMap("JobId")
    @Validation(required = true)
    private String jobId;

    @Query
    @NameInMap("ParentJobId")
    @Validation(required = true)
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
         * The name of the database that is scaled out.
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * The ID of the PolarDB-X 1.0 instance.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * The scale-out type. Valid values:
         * <p>
         * 
         * *   smooth_expand: smooth scale-out
         * *   hot_expand: hot-spot scale-out
         */
        public Builder expandType(String expandType) {
            this.putQueryParameter("ExpandType", expandType);
            this.expandType = expandType;
            return this;
        }

        /**
         * The job ID of the scale-out task. The value of this parameter is the same as that of the ParentJobId parameter.
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * The ID of the scale-out task. This parameter is returned if you send a request for the smooth scale-out task.
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
