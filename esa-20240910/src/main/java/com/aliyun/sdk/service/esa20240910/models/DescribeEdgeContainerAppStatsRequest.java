// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link DescribeEdgeContainerAppStatsRequest} extends {@link RequestModel}
 *
 * <p>DescribeEdgeContainerAppStatsRequest</p>
 */
public class DescribeEdgeContainerAppStatsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("App")
    @com.aliyun.core.annotation.Validation(required = true)
    private String app;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Fields")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fields;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Isp")
    private String isp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Locate")
    private String locate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tenant")
    private String tenant;

    private DescribeEdgeContainerAppStatsRequest(Builder builder) {
        super(builder);
        this.app = builder.app;
        this.endTime = builder.endTime;
        this.fields = builder.fields;
        this.isp = builder.isp;
        this.locate = builder.locate;
        this.startTime = builder.startTime;
        this.tenant = builder.tenant;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEdgeContainerAppStatsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return app
     */
    public String getApp() {
        return this.app;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return fields
     */
    public String getFields() {
        return this.fields;
    }

    /**
     * @return isp
     */
    public String getIsp() {
        return this.isp;
    }

    /**
     * @return locate
     */
    public String getLocate() {
        return this.locate;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return tenant
     */
    public String getTenant() {
        return this.tenant;
    }

    public static final class Builder extends Request.Builder<DescribeEdgeContainerAppStatsRequest, Builder> {
        private String app; 
        private String endTime; 
        private String fields; 
        private String isp; 
        private String locate; 
        private String startTime; 
        private String tenant; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEdgeContainerAppStatsRequest request) {
            super(request);
            this.app = request.app;
            this.endTime = request.endTime;
            this.fields = request.fields;
            this.isp = request.isp;
            this.locate = request.locate;
            this.startTime = request.startTime;
            this.tenant = request.tenant;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app-xxxx</p>
         */
        public Builder app(String app) {
            this.putQueryParameter("App", app);
            this.app = app;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pod_ready_rate</p>
         */
        public Builder fields(String fields) {
            this.putQueryParameter("Fields", fields);
            this.fields = fields;
            return this;
        }

        /**
         * Isp.
         */
        public Builder isp(String isp) {
            this.putQueryParameter("Isp", isp);
            this.isp = isp;
            return this;
        }

        /**
         * Locate.
         */
        public Builder locate(String locate) {
            this.putQueryParameter("Locate", locate);
            this.locate = locate;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Tenant.
         */
        public Builder tenant(String tenant) {
            this.putQueryParameter("Tenant", tenant);
            this.tenant = tenant;
            return this;
        }

        @Override
        public DescribeEdgeContainerAppStatsRequest build() {
            return new DescribeEdgeContainerAppStatsRequest(this);
        } 

    } 

}
