// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link GetClusterAuditProjectResponseBody} extends {@link TeaModel}
 *
 * <p>GetClusterAuditProjectResponseBody</p>
 */
public class GetClusterAuditProjectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("audit_enabled")
    private Boolean auditEnabled;

    @com.aliyun.core.annotation.NameInMap("sls_project_name")
    private String slsProjectName;

    private GetClusterAuditProjectResponseBody(Builder builder) {
        this.auditEnabled = builder.auditEnabled;
        this.slsProjectName = builder.slsProjectName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClusterAuditProjectResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return auditEnabled
     */
    public Boolean getAuditEnabled() {
        return this.auditEnabled;
    }

    /**
     * @return slsProjectName
     */
    public String getSlsProjectName() {
        return this.slsProjectName;
    }

    public static final class Builder {
        private Boolean auditEnabled; 
        private String slsProjectName; 

        private Builder() {
        } 

        private Builder(GetClusterAuditProjectResponseBody model) {
            this.auditEnabled = model.auditEnabled;
            this.slsProjectName = model.slsProjectName;
        } 

        /**
         * <p>Indicates whether the cluster auditing feature is enabled for the cluster. </p>
         * <ul>
         * <li><code>true</code>: The cluster auditing feature is enabled for the cluster. </li>
         * <li><code>false</code>: The cluster auditing feature is disabled for the cluster.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder auditEnabled(Boolean auditEnabled) {
            this.auditEnabled = auditEnabled;
            return this;
        }

        /**
         * <p>The SLS project in which the audit logs of the API server are stored.</p>
         * 
         * <strong>example:</strong>
         * <p>k8s-log-cad1230511cbb4db4a488e58518******</p>
         */
        public Builder slsProjectName(String slsProjectName) {
            this.slsProjectName = slsProjectName;
            return this;
        }

        public GetClusterAuditProjectResponseBody build() {
            return new GetClusterAuditProjectResponseBody(this);
        } 

    } 

}
