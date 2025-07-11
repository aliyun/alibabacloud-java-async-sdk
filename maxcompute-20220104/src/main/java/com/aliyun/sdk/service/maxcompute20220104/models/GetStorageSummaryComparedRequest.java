// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link GetStorageSummaryComparedRequest} extends {@link RequestModel}
 *
 * <p>GetStorageSummaryComparedRequest</p>
 */
public class GetStorageSummaryComparedRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("beginDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String beginDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("projects")
    private java.util.List<String> projects;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private GetStorageSummaryComparedRequest(Builder builder) {
        super(builder);
        this.type = builder.type;
        this.beginDate = builder.beginDate;
        this.endDate = builder.endDate;
        this.projects = builder.projects;
        this.region = builder.region;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStorageSummaryComparedRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return beginDate
     */
    public String getBeginDate() {
        return this.beginDate;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return projects
     */
    public java.util.List<String> getProjects() {
        return this.projects;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<GetStorageSummaryComparedRequest, Builder> {
        private String type; 
        private String beginDate; 
        private String endDate; 
        private java.util.List<String> projects; 
        private String region; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(GetStorageSummaryComparedRequest request) {
            super(request);
            this.type = request.type;
            this.beginDate = request.beginDate;
            this.endDate = request.endDate;
            this.projects = request.projects;
            this.region = request.region;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>size</p>
         */
        public Builder type(String type) {
            this.putPathParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20250601</p>
         */
        public Builder beginDate(String beginDate) {
            this.putQueryParameter("beginDate", beginDate);
            this.beginDate = beginDate;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20250604</p>
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("endDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * projects.
         */
        public Builder projects(java.util.List<String> projects) {
            String projectsShrink = shrink(projects, "projects", "simple");
            this.putQueryParameter("projects", projectsShrink);
            this.projects = projects;
            return this;
        }

        /**
         * region.
         */
        public Builder region(String region) {
            this.putQueryParameter("region", region);
            this.region = region;
            return this;
        }

        /**
         * tenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public GetStorageSummaryComparedRequest build() {
            return new GetStorageSummaryComparedRequest(this);
        } 

    } 

}
