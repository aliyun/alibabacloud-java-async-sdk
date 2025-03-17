// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link GetDBTaskSQLJobLogRequest} extends {@link RequestModel}
 *
 * <p>GetDBTaskSQLJobLogRequest</p>
 */
public class GetDBTaskSQLJobLogRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private GetDBTaskSQLJobLogRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.jobId = builder.jobId;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDBTaskSQLJobLogRequest create() {
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
     * @return jobId
     */
    public Long getJobId() {
        return this.jobId;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<GetDBTaskSQLJobLogRequest, Builder> {
        private String regionId; 
        private Long jobId; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(GetDBTaskSQLJobLogRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.jobId = request.jobId;
            this.tid = request.tid;
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
         * <p>The ID of the SQL task. You can call the <a href="https://help.aliyun.com/document_detail/207049.html">ListDBTaskSQLJob</a> operation to query the ID of the SQL task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1276****</p>
         */
        public Builder jobId(Long jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> operation to query the tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3***</p>
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public GetDBTaskSQLJobLogRequest build() {
            return new GetDBTaskSQLJobLogRequest(this);
        } 

    } 

}
