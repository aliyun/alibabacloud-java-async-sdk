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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeMembers")
    private String includeMembers;

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
    @com.aliyun.core.annotation.NameInMap("NotSendOnNoData")
    private String notSendOnNoData;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SelectedFields")
    private java.util.List<String> selectedFields;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SendWithAttach")
    private String sendWithAttach;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SplitFileOnUserId")
    private String splitFileOnUserId;

    private CreateReportDefinitionRequest(Builder builder) {
        super(builder);
        this.beginBillingCycle = builder.beginBillingCycle;
        this.includeMembers = builder.includeMembers;
        this.mcProject = builder.mcProject;
        this.mcTableName = builder.mcTableName;
        this.nbid = builder.nbid;
        this.notSendOnNoData = builder.notSendOnNoData;
        this.ossBucketName = builder.ossBucketName;
        this.ossBucketOwnerAccountId = builder.ossBucketOwnerAccountId;
        this.ossBucketPath = builder.ossBucketPath;
        this.reportSourceType = builder.reportSourceType;
        this.reportType = builder.reportType;
        this.selectedFields = builder.selectedFields;
        this.sendWithAttach = builder.sendWithAttach;
        this.splitFileOnUserId = builder.splitFileOnUserId;
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
     * @return includeMembers
     */
    public String getIncludeMembers() {
        return this.includeMembers;
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
     * @return notSendOnNoData
     */
    public String getNotSendOnNoData() {
        return this.notSendOnNoData;
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

    /**
     * @return selectedFields
     */
    public java.util.List<String> getSelectedFields() {
        return this.selectedFields;
    }

    /**
     * @return sendWithAttach
     */
    public String getSendWithAttach() {
        return this.sendWithAttach;
    }

    /**
     * @return splitFileOnUserId
     */
    public String getSplitFileOnUserId() {
        return this.splitFileOnUserId;
    }

    public static final class Builder extends Request.Builder<CreateReportDefinitionRequest, Builder> {
        private String beginBillingCycle; 
        private String includeMembers; 
        private String mcProject; 
        private String mcTableName; 
        private String nbid; 
        private String notSendOnNoData; 
        private String ossBucketName; 
        private Long ossBucketOwnerAccountId; 
        private String ossBucketPath; 
        private String reportSourceType; 
        private String reportType; 
        private java.util.List<String> selectedFields; 
        private String sendWithAttach; 
        private String splitFileOnUserId; 

        private Builder() {
            super();
        } 

        private Builder(CreateReportDefinitionRequest request) {
            super(request);
            this.beginBillingCycle = request.beginBillingCycle;
            this.includeMembers = request.includeMembers;
            this.mcProject = request.mcProject;
            this.mcTableName = request.mcTableName;
            this.nbid = request.nbid;
            this.notSendOnNoData = request.notSendOnNoData;
            this.ossBucketName = request.ossBucketName;
            this.ossBucketOwnerAccountId = request.ossBucketOwnerAccountId;
            this.ossBucketPath = request.ossBucketPath;
            this.reportSourceType = request.reportSourceType;
            this.reportType = request.reportType;
            this.selectedFields = request.selectedFields;
            this.sendWithAttach = request.sendWithAttach;
            this.splitFileOnUserId = request.splitFileOnUserId;
        } 

        /**
         * <p>The start billing cycle for push. After successful subscription, the system automatically pushes data from the start billing cycle to the current time. This parameter is invalid for monthly bill PDF subscriptions and does not re-push historical data. Data within the last year can be pushed.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-05</p>
         */
        public Builder beginBillingCycle(String beginBillingCycle) {
            this.putQueryParameter("BeginBillingCycle", beginBillingCycle);
            this.beginBillingCycle = beginBillingCycle;
            return this;
        }

        /**
         * <p>Email subscription configuration. Specifies whether to include enterprise multi-account members in the bill.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder includeMembers(String includeMembers) {
            this.putQueryParameter("IncludeMembers", includeMembers);
            this.includeMembers = includeMembers;
            return this;
        }

        /**
         * <p>The MaxCompute project name.</p>
         * 
         * <strong>example:</strong>
         * <p>project</p>
         */
        public Builder mcProject(String mcProject) {
            this.putBodyParameter("McProject", mcProject);
            this.mcProject = mcProject;
            return this;
        }

        /**
         * <p>The MaxCompute subscription table name.</p>
         * 
         * <strong>example:</strong>
         * <p>table</p>
         */
        public Builder mcTableName(String mcTableName) {
            this.putBodyParameter("McTableName", mcTableName);
            this.mcTableName = mcTableName;
            return this;
        }

        /**
         * <p>The primary sales site ID. If left empty, the system uses the site ID of the current user by default.</p>
         * 
         * <strong>example:</strong>
         * <p>2684201000001</p>
         */
        public Builder nbid(String nbid) {
            this.putQueryParameter("Nbid", nbid);
            this.nbid = nbid;
            return this;
        }

        /**
         * <p>Email subscription configuration. Specifies whether to skip sending emails when no bills are available.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder notSendOnNoData(String notSendOnNoData) {
            this.putQueryParameter("NotSendOnNoData", notSendOnNoData);
            this.notSendOnNoData = notSendOnNoData;
            return this;
        }

        /**
         * <p>The name of the OSS bucket for file storage.</p>
         * 
         * <strong>example:</strong>
         * <p>sh-bill</p>
         */
        public Builder ossBucketName(String ossBucketName) {
            this.putQueryParameter("OssBucketName", ossBucketName);
            this.ossBucketName = ossBucketName;
            return this;
        }

        /**
         * <p>The UID of the OSS owner that stores the files. If this is a Bid/Reseller subscription and you need to push to a sub-account\&quot;s OSS, specify this parameter. The account must be a sub-account of the calling account, and the AliyunConsumeDump2OSSRole permission must be granted to this account. Regular users do not need to specify this parameter. The default value is the calling account.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567812345678</p>
         */
        public Builder ossBucketOwnerAccountId(Long ossBucketOwnerAccountId) {
            this.putQueryParameter("OssBucketOwnerAccountId", ossBucketOwnerAccountId);
            this.ossBucketOwnerAccountId = ossBucketOwnerAccountId;
            return this;
        }

        /**
         * <p>The OSS bucket storage path.</p>
         * 
         * <strong>example:</strong>
         * <p>bill/</p>
         */
        public Builder ossBucketPath(String ossBucketPath) {
            this.putQueryParameter("OssBucketPath", ossBucketPath);
            this.ossBucketPath = ossBucketPath;
            return this;
        }

        /**
         * <p>The subscription source. Valid values: OSS, MC, or MSC_EMAIL.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        public Builder reportSourceType(String reportSourceType) {
            this.putBodyParameter("ReportSourceType", reportSourceType);
            this.reportSourceType = reportSourceType;
            return this;
        }

        /**
         * <p>The subscription type. Valid values:</p>
         * <ul>
         * <li>consumeDetailBillV2: consumption details (supported only for OSS/MC subscriptions).</li>
         * <li>splitDetailBillV2: split details (supported only for OSS/MC subscriptions).</li>
         * <li>costDetailBillV2: cost details (supported only for OSS/MC subscriptions).</li>
         * <li>monthBillOverview: monthly bill summary (supported only for OSS/MSC_EMAIL subscriptions).</li>
         * <li>focus: FOCUS bill (supported only for OSS/MC subscriptions).</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>consumeDetailBillV2</p>
         */
        public Builder reportType(String reportType) {
            this.putQueryParameter("ReportType", reportType);
            this.reportType = reportType;
            return this;
        }

        /**
         * <p>The user-specified subscription fields.</p>
         */
        public Builder selectedFields(java.util.List<String> selectedFields) {
            String selectedFieldsShrink = shrink(selectedFields, "SelectedFields", "json");
            this.putQueryParameter("SelectedFields", selectedFieldsShrink);
            this.selectedFields = selectedFields;
            return this;
        }

        /**
         * <p>Email subscription configuration. Specifies whether to include bill attachments in emails.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder sendWithAttach(String sendWithAttach) {
            this.putQueryParameter("SendWithAttach", sendWithAttach);
            this.sendWithAttach = sendWithAttach;
            return this;
        }

        /**
         * <p>Email subscription configuration. Specifies whether to split attachments by user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder splitFileOnUserId(String splitFileOnUserId) {
            this.putQueryParameter("SplitFileOnUserId", splitFileOnUserId);
            this.splitFileOnUserId = splitFileOnUserId;
            return this;
        }

        @Override
        public CreateReportDefinitionRequest build() {
            return new CreateReportDefinitionRequest(this);
        } 

    } 

}
