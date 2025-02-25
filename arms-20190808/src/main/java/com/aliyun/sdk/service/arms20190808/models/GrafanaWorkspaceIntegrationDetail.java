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
 * {@link GrafanaWorkspaceIntegrationDetail} extends {@link TeaModel}
 *
 * <p>GrafanaWorkspaceIntegrationDetail</p>
 */
public class GrafanaWorkspaceIntegrationDetail extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("dataSources")
    private java.util.List<GrafanaWorkspaceIntegrationDataSource> dataSources;

    @com.aliyun.core.annotation.NameInMap("integrationId")
    private String integrationId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private GrafanaWorkspaceIntegrationDetail(Builder builder) {
        this.dataSources = builder.dataSources;
        this.integrationId = builder.integrationId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrafanaWorkspaceIntegrationDetail create() {
        return builder().build();
    }

    /**
     * @return dataSources
     */
    public java.util.List<GrafanaWorkspaceIntegrationDataSource> getDataSources() {
        return this.dataSources;
    }

    /**
     * @return integrationId
     */
    public String getIntegrationId() {
        return this.integrationId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private java.util.List<GrafanaWorkspaceIntegrationDataSource> dataSources; 
        private String integrationId; 
        private String status; 

        /**
         * dataSources.
         */
        public Builder dataSources(java.util.List<GrafanaWorkspaceIntegrationDataSource> dataSources) {
            this.dataSources = dataSources;
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
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public GrafanaWorkspaceIntegrationDetail build() {
            return new GrafanaWorkspaceIntegrationDetail(this);
        } 

    } 

}
