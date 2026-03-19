// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link DescribeExtensionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExtensionResponseBody</p>
 */
public class DescribeExtensionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentVersion")
    private String currentVersion;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("ExtensionId")
    private String extensionId;

    @com.aliyun.core.annotation.NameInMap("ExtensionName")
    private String extensionName;

    @com.aliyun.core.annotation.NameInMap("IsInstallNeedRestart")
    private Boolean isInstallNeedRestart;

    @com.aliyun.core.annotation.NameInMap("IsLatestVersion")
    private Boolean isLatestVersion;

    @com.aliyun.core.annotation.NameInMap("LatestVersion")
    private String latestVersion;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribeExtensionResponseBody(Builder builder) {
        this.currentVersion = builder.currentVersion;
        this.description = builder.description;
        this.extensionId = builder.extensionId;
        this.extensionName = builder.extensionName;
        this.isInstallNeedRestart = builder.isInstallNeedRestart;
        this.isLatestVersion = builder.isLatestVersion;
        this.latestVersion = builder.latestVersion;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExtensionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentVersion
     */
    public String getCurrentVersion() {
        return this.currentVersion;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return extensionId
     */
    public String getExtensionId() {
        return this.extensionId;
    }

    /**
     * @return extensionName
     */
    public String getExtensionName() {
        return this.extensionName;
    }

    /**
     * @return isInstallNeedRestart
     */
    public Boolean getIsInstallNeedRestart() {
        return this.isInstallNeedRestart;
    }

    /**
     * @return isLatestVersion
     */
    public Boolean getIsLatestVersion() {
        return this.isLatestVersion;
    }

    /**
     * @return latestVersion
     */
    public String getLatestVersion() {
        return this.latestVersion;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String currentVersion; 
        private String description; 
        private String extensionId; 
        private String extensionName; 
        private Boolean isInstallNeedRestart; 
        private Boolean isLatestVersion; 
        private String latestVersion; 
        private String requestId; 
        private String status; 

        private Builder() {
        } 

        private Builder(DescribeExtensionResponseBody model) {
            this.currentVersion = model.currentVersion;
            this.description = model.description;
            this.extensionId = model.extensionId;
            this.extensionName = model.extensionName;
            this.isInstallNeedRestart = model.isInstallNeedRestart;
            this.isLatestVersion = model.isLatestVersion;
            this.latestVersion = model.latestVersion;
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * CurrentVersion.
         */
        public Builder currentVersion(String currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * ExtensionId.
         */
        public Builder extensionId(String extensionId) {
            this.extensionId = extensionId;
            return this;
        }

        /**
         * ExtensionName.
         */
        public Builder extensionName(String extensionName) {
            this.extensionName = extensionName;
            return this;
        }

        /**
         * IsInstallNeedRestart.
         */
        public Builder isInstallNeedRestart(Boolean isInstallNeedRestart) {
            this.isInstallNeedRestart = isInstallNeedRestart;
            return this;
        }

        /**
         * IsLatestVersion.
         */
        public Builder isLatestVersion(Boolean isLatestVersion) {
            this.isLatestVersion = isLatestVersion;
            return this;
        }

        /**
         * LatestVersion.
         */
        public Builder latestVersion(String latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeExtensionResponseBody build() {
            return new DescribeExtensionResponseBody(this);
        } 

    } 

}
