// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx320240624.models;

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
 * {@link GetJobExecutionRequest} extends {@link RequestModel}
 *
 * <p>GetJobExecutionRequest</p>
 */
public class GetJobExecutionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobExecutionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobExecutionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MseSessionId")
    private String mseSessionId;

    private GetJobExecutionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appName = builder.appName;
        this.clusterId = builder.clusterId;
        this.jobExecutionId = builder.jobExecutionId;
        this.mseSessionId = builder.mseSessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJobExecutionRequest create() {
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
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return jobExecutionId
     */
    public String getJobExecutionId() {
        return this.jobExecutionId;
    }

    /**
     * @return mseSessionId
     */
    public String getMseSessionId() {
        return this.mseSessionId;
    }

    public static final class Builder extends Request.Builder<GetJobExecutionRequest, Builder> {
        private String regionId; 
        private String appName; 
        private String clusterId; 
        private String jobExecutionId; 
        private String mseSessionId; 

        private Builder() {
            super();
        } 

        private Builder(GetJobExecutionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appName = request.appName;
            this.clusterId = request.clusterId;
            this.jobExecutionId = request.jobExecutionId;
            this.mseSessionId = request.mseSessionId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-app</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxljob-b6ec1xxxx</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1310630367761285120</p>
         */
        public Builder jobExecutionId(String jobExecutionId) {
            this.putQueryParameter("JobExecutionId", jobExecutionId);
            this.jobExecutionId = jobExecutionId;
            return this;
        }

        /**
         * MseSessionId.
         */
        public Builder mseSessionId(String mseSessionId) {
            this.putQueryParameter("MseSessionId", mseSessionId);
            this.mseSessionId = mseSessionId;
            return this;
        }

        @Override
        public GetJobExecutionRequest build() {
            return new GetJobExecutionRequest(this);
        } 

    } 

}
