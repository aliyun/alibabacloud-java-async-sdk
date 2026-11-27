// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
 * {@link ApplyDataFlowAutoRefreshRequest} extends {@link RequestModel}
 *
 * <p>ApplyDataFlowAutoRefreshRequest</p>
 */
public class ApplyDataFlowAutoRefreshRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRefreshInterval")
    @com.aliyun.core.annotation.Validation(maximum = 525600, minimum = 5)
    private Long autoRefreshInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRefreshPolicy")
    private String autoRefreshPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRefreshs")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<AutoRefreshs> autoRefreshs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(maxLength = 64, minLength = 1)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataFlowId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataFlowId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    private ApplyDataFlowAutoRefreshRequest(Builder builder) {
        super(builder);
        this.autoRefreshInterval = builder.autoRefreshInterval;
        this.autoRefreshPolicy = builder.autoRefreshPolicy;
        this.autoRefreshs = builder.autoRefreshs;
        this.clientToken = builder.clientToken;
        this.dataFlowId = builder.dataFlowId;
        this.dryRun = builder.dryRun;
        this.fileSystemId = builder.fileSystemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyDataFlowAutoRefreshRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoRefreshInterval
     */
    public Long getAutoRefreshInterval() {
        return this.autoRefreshInterval;
    }

    /**
     * @return autoRefreshPolicy
     */
    public String getAutoRefreshPolicy() {
        return this.autoRefreshPolicy;
    }

    /**
     * @return autoRefreshs
     */
    public java.util.List<AutoRefreshs> getAutoRefreshs() {
        return this.autoRefreshs;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dataFlowId
     */
    public String getDataFlowId() {
        return this.dataFlowId;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public static final class Builder extends Request.Builder<ApplyDataFlowAutoRefreshRequest, Builder> {
        private Long autoRefreshInterval; 
        private String autoRefreshPolicy; 
        private java.util.List<AutoRefreshs> autoRefreshs; 
        private String clientToken; 
        private String dataFlowId; 
        private Boolean dryRun; 
        private String fileSystemId; 

        private Builder() {
            super();
        } 

        private Builder(ApplyDataFlowAutoRefreshRequest request) {
            super(request);
            this.autoRefreshInterval = request.autoRefreshInterval;
            this.autoRefreshPolicy = request.autoRefreshPolicy;
            this.autoRefreshs = request.autoRefreshs;
            this.clientToken = request.clientToken;
            this.dataFlowId = request.dataFlowId;
            this.dryRun = request.dryRun;
            this.fileSystemId = request.fileSystemId;
        } 

        /**
         * <p>The auto-refresh interval. At each interval, CPFS checks whether data in the directory is updated. If data updates exist, CPFS starts an auto-refresh task. Unit: minutes.</p>
         * <p>Valid values: 10 to 525600. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder autoRefreshInterval(Long autoRefreshInterval) {
            this.putQueryParameter("AutoRefreshInterval", autoRefreshInterval);
            this.autoRefreshInterval = autoRefreshInterval;
            return this;
        }

        /**
         * <p>The auto-refresh policy. This policy specifies how data updates in the source are imported into CPFS after the source data is updated. Valid values:</p>
         * <ul>
         * <li>None: Data updates in the source are not automatically imported into CPFS. You can use a data flow task to import data updates from the source.</li>
         * <li>ImportChanged: Data updates in the source are automatically imported into CPFS.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder autoRefreshPolicy(String autoRefreshPolicy) {
            this.putQueryParameter("AutoRefreshPolicy", autoRefreshPolicy);
            this.autoRefreshPolicy = autoRefreshPolicy;
            return this;
        }

        /**
         * <p>The auto-refresh configurations.</p>
         * <p>This parameter is required.</p>
         */
        public Builder autoRefreshs(java.util.List<AutoRefreshs> autoRefreshs) {
            this.putQueryParameter("AutoRefreshs", autoRefreshs);
            this.autoRefreshs = autoRefreshs;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can generate a value from your client to ensure that the value is unique among different requests.</p>
         * <p>The ClientToken parameter supports only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId may be different for each API request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-42665544****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The data flow ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>df-194433a5be31****</p>
         */
        public Builder dataFlowId(String dataFlowId) {
            this.putQueryParameter("DataFlowId", dataFlowId);
            this.dataFlowId = dataFlowId;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run on this creation request.</p>
         * <p>A dry run checks parameter validity and inventory. It does not actually create an instance or incur fees.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: Sends a check request and does not create an instance. Check items include whether required parameters are specified, the request format, service limits, and NAS inventory. If the check fails, the system returns the corresponding error. If the check succeeds, the system returns HTTP status code 200, but FileSystemId is empty.</li>
         * <li>false (default): Sends a normal request. After the check succeeds, the system creates the instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The file system ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cpfs-099394bd928c****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        @Override
        public ApplyDataFlowAutoRefreshRequest build() {
            return new ApplyDataFlowAutoRefreshRequest(this);
        } 

    } 

    /**
     * 
     * {@link ApplyDataFlowAutoRefreshRequest} extends {@link TeaModel}
     *
     * <p>ApplyDataFlowAutoRefreshRequest</p>
     */
    public static class AutoRefreshs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RefreshPath")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 1024, minLength = 2)
        private String refreshPath;

        private AutoRefreshs(Builder builder) {
            this.refreshPath = builder.refreshPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoRefreshs create() {
            return builder().build();
        }

        /**
         * @return refreshPath
         */
        public String getRefreshPath() {
            return this.refreshPath;
        }

        public static final class Builder {
            private String refreshPath; 

            private Builder() {
            } 

            private Builder(AutoRefreshs model) {
                this.refreshPath = model.refreshPath;
            } 

            /**
             * <p>The auto-refresh directory. CPFS automatically checks only whether source data in this directory is updated and automatically imports the updated data.</p>
             * <p>Limits:</p>
             * <ul>
             * <li>The value must be 2 to 1024 characters in length.</li>
             * <li>The value must be encoded in UTF-8.</li>
             * <li>The value must start and end with a forward slash (/).</li>
             * </ul>
             * <blockquote>
             * <p>The directory must be an existing directory on CPFS and must be located in a Fileset for which data flow is enabled.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>/prefix1/prefix2/</p>
             */
            public Builder refreshPath(String refreshPath) {
                this.refreshPath = refreshPath;
                return this;
            }

            public AutoRefreshs build() {
                return new AutoRefreshs(this);
            } 

        } 

    }
}
