// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link GrafanaWorkspaceIntegration} extends {@link TeaModel}
 *
 * <p>GrafanaWorkspaceIntegration</p>
 */
public class GrafanaWorkspaceIntegration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("datasourceAmount")
    private Long datasourceAmount;

    @com.aliyun.core.annotation.NameInMap("integrationId")
    private String integrationId;

    @com.aliyun.core.annotation.NameInMap("integrationName")
    private String integrationName;

    @com.aliyun.core.annotation.NameInMap("previews")
    private java.util.List<GrafanaWorkspaceIntegrationPreview> previews;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("supportRegions")
    private java.util.List<String> supportRegions;

    private GrafanaWorkspaceIntegration(Builder builder) {
        this.datasourceAmount = builder.datasourceAmount;
        this.integrationId = builder.integrationId;
        this.integrationName = builder.integrationName;
        this.previews = builder.previews;
        this.status = builder.status;
        this.supportRegions = builder.supportRegions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrafanaWorkspaceIntegration create() {
        return builder().build();
    }

    /**
     * @return datasourceAmount
     */
    public Long getDatasourceAmount() {
        return this.datasourceAmount;
    }

    /**
     * @return integrationId
     */
    public String getIntegrationId() {
        return this.integrationId;
    }

    /**
     * @return integrationName
     */
    public String getIntegrationName() {
        return this.integrationName;
    }

    /**
     * @return previews
     */
    public java.util.List<GrafanaWorkspaceIntegrationPreview> getPreviews() {
        return this.previews;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return supportRegions
     */
    public java.util.List<String> getSupportRegions() {
        return this.supportRegions;
    }

    public static final class Builder {
        private Long datasourceAmount; 
        private String integrationId; 
        private String integrationName; 
        private java.util.List<GrafanaWorkspaceIntegrationPreview> previews; 
        private String status; 
        private java.util.List<String> supportRegions; 

        /**
         * datasourceAmount.
         */
        public Builder datasourceAmount(Long datasourceAmount) {
            this.datasourceAmount = datasourceAmount;
            return this;
        }

        /**
         * integrationId.
         */
        public Builder integrationId(String integrationId) {
            this.integrationId = integrationId;
            return this;
        }

        /**
         * integrationName.
         */
        public Builder integrationName(String integrationName) {
            this.integrationName = integrationName;
            return this;
        }

        /**
         * previews.
         */
        public Builder previews(java.util.List<GrafanaWorkspaceIntegrationPreview> previews) {
            this.previews = previews;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * supportRegions.
         */
        public Builder supportRegions(java.util.List<String> supportRegions) {
            this.supportRegions = supportRegions;
            return this;
        }

        public GrafanaWorkspaceIntegration build() {
            return new GrafanaWorkspaceIntegration(this);
        } 

    } 

}
