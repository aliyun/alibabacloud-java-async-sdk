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
 * {@link UpdateClusterAuditLogConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateClusterAuditLogConfigRequest</p>
 */
public class UpdateClusterAuditLogConfigRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("clusterid")
    private String clusterid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("disable")
    private Boolean disable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sls_project_name")
    private String slsProjectName;

    private UpdateClusterAuditLogConfigRequest(Builder builder) {
        super(builder);
        this.clusterid = builder.clusterid;
        this.disable = builder.disable;
        this.slsProjectName = builder.slsProjectName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateClusterAuditLogConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterid
     */
    public String getClusterid() {
        return this.clusterid;
    }

    /**
     * @return disable
     */
    public Boolean getDisable() {
        return this.disable;
    }

    /**
     * @return slsProjectName
     */
    public String getSlsProjectName() {
        return this.slsProjectName;
    }

    public static final class Builder extends Request.Builder<UpdateClusterAuditLogConfigRequest, Builder> {
        private String clusterid; 
        private Boolean disable; 
        private String slsProjectName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateClusterAuditLogConfigRequest request) {
            super(request);
            this.clusterid = request.clusterid;
            this.disable = request.disable;
            this.slsProjectName = request.slsProjectName;
        } 

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c82e6987e2961451182edacd74faf****</p>
         */
        public Builder clusterid(String clusterid) {
            this.putPathParameter("clusterid", clusterid);
            this.clusterid = clusterid;
            return this;
        }

        /**
         * <p>Enable or disable audit logging.</p>
         * <ul>
         * <li>false: enables audit logging or updates the audit logging configurations.</li>
         * <li>true: disables audit logging.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder disable(Boolean disable) {
            this.putBodyParameter("disable", disable);
            this.disable = disable;
            return this;
        }

        /**
         * <p>The <a href="https://help.aliyun.com/document_detail/48873.html">Simple Log Service project</a> to which the <a href="https://help.aliyun.com/document_detail/48873.html">Logstore</a> that stores the cluster audit logs belongs.</p>
         * <ul>
         * <li>Default value: k8s-log-{clusterid}.</li>
         * <li>After the cluster audit log feature is enabled, a Logstore is created in the specified SLS project to store the cluster audit logs.</li>
         * <li>If you want to change the project after audit logging is enabled for the cluster, you can use this parameter to specify another project. You can perform this operation only in ACK managed clusters.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>k8s-log-c82e6987e2961451182edacd74faf****</p>
         */
        public Builder slsProjectName(String slsProjectName) {
            this.putBodyParameter("sls_project_name", slsProjectName);
            this.slsProjectName = slsProjectName;
            return this;
        }

        @Override
        public UpdateClusterAuditLogConfigRequest build() {
            return new UpdateClusterAuditLogConfigRequest(this);
        } 

    } 

}
