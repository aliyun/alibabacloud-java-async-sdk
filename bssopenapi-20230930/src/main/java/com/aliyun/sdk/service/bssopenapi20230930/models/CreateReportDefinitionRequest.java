// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20230930.models;

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
 * {@link CreateReportDefinitionRequest} extends {@link RequestModel}
 *
 * <p>CreateReportDefinitionRequest</p>
 */
public class CreateReportDefinitionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginBillingCycle")
    private String beginBillingCycle;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("McProject")
    private String mcProject;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("McTableName")
    private String mcTableName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Nbid")
    private String nbid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssBucketName")
    private String ossBucketName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssBucketOwnerAccountId")
    private Long ossBucketOwnerAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssBucketPath")
    private String ossBucketPath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReportSourceType")
    private String reportSourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReportType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String reportType;

    private CreateReportDefinitionRequest(Builder builder) {
        super(builder);
        this.beginBillingCycle = builder.beginBillingCycle;
        this.mcProject = builder.mcProject;
        this.mcTableName = builder.mcTableName;
        this.nbid = builder.nbid;
        this.ossBucketName = builder.ossBucketName;
        this.ossBucketOwnerAccountId = builder.ossBucketOwnerAccountId;
        this.ossBucketPath = builder.ossBucketPath;
        this.reportSourceType = builder.reportSourceType;
        this.reportType = builder.reportType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateReportDefinitionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beginBillingCycle
     */
    public String getBeginBillingCycle() {
        return this.beginBillingCycle;
    }

    /**
     * @return mcProject
     */
    public String getMcProject() {
        return this.mcProject;
    }

    /**
     * @return mcTableName
     */
    public String getMcTableName() {
        return this.mcTableName;
    }

    /**
     * @return nbid
     */
    public String getNbid() {
        return this.nbid;
    }

    /**
     * @return ossBucketName
     */
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    /**
     * @return ossBucketOwnerAccountId
     */
    public Long getOssBucketOwnerAccountId() {
        return this.ossBucketOwnerAccountId;
    }

    /**
     * @return ossBucketPath
     */
    public String getOssBucketPath() {
        return this.ossBucketPath;
    }

    /**
     * @return reportSourceType
     */
    public String getReportSourceType() {
        return this.reportSourceType;
    }

    /**
     * @return reportType
     */
    public String getReportType() {
        return this.reportType;
    }

    public static final class Builder extends Request.Builder<CreateReportDefinitionRequest, Builder> {
        private String beginBillingCycle; 
        private String mcProject; 
        private String mcTableName; 
        private String nbid; 
        private String ossBucketName; 
        private Long ossBucketOwnerAccountId; 
        private String ossBucketPath; 
        private String reportSourceType; 
        private String reportType; 

        private Builder() {
            super();
        } 

        private Builder(CreateReportDefinitionRequest request) {
            super(request);
            this.beginBillingCycle = request.beginBillingCycle;
            this.mcProject = request.mcProject;
            this.mcTableName = request.mcTableName;
            this.nbid = request.nbid;
            this.ossBucketName = request.ossBucketName;
            this.ossBucketOwnerAccountId = request.ossBucketOwnerAccountId;
            this.ossBucketPath = request.ossBucketPath;
            this.reportSourceType = request.reportSourceType;
            this.reportType = request.reportType;
        } 

        /**
         * BeginBillingCycle.
         */
        public Builder beginBillingCycle(String beginBillingCycle) {
            this.putQueryParameter("BeginBillingCycle", beginBillingCycle);
            this.beginBillingCycle = beginBillingCycle;
            return this;
        }

        /**
         * McProject.
         */
        public Builder mcProject(String mcProject) {
            this.putBodyParameter("McProject", mcProject);
            this.mcProject = mcProject;
            return this;
        }

        /**
         * McTableName.
         */
        public Builder mcTableName(String mcTableName) {
            this.putBodyParameter("McTableName", mcTableName);
            this.mcTableName = mcTableName;
            return this;
        }

        /**
         * Nbid.
         */
        public Builder nbid(String nbid) {
            this.putQueryParameter("Nbid", nbid);
            this.nbid = nbid;
            return this;
        }

        /**
         * OssBucketName.
         */
        public Builder ossBucketName(String ossBucketName) {
            this.putQueryParameter("OssBucketName", ossBucketName);
            this.ossBucketName = ossBucketName;
            return this;
        }

        /**
         * OssBucketOwnerAccountId.
         */
        public Builder ossBucketOwnerAccountId(Long ossBucketOwnerAccountId) {
            this.putQueryParameter("OssBucketOwnerAccountId", ossBucketOwnerAccountId);
            this.ossBucketOwnerAccountId = ossBucketOwnerAccountId;
            return this;
        }

        /**
         * OssBucketPath.
         */
        public Builder ossBucketPath(String ossBucketPath) {
            this.putQueryParameter("OssBucketPath", ossBucketPath);
            this.ossBucketPath = ossBucketPath;
            return this;
        }

        /**
         * ReportSourceType.
         */
        public Builder reportSourceType(String reportSourceType) {
            this.putBodyParameter("ReportSourceType", reportSourceType);
            this.reportSourceType = reportSourceType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BillingItemDetailForBillingPeriod</p>
         */
        public Builder reportType(String reportType) {
            this.putQueryParameter("ReportType", reportType);
            this.reportType = reportType;
            return this;
        }

        @Override
        public CreateReportDefinitionRequest build() {
            return new CreateReportDefinitionRequest(this);
        } 

    } 

}
