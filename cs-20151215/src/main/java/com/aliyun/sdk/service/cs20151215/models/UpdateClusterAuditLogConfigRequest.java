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
         * <p>The ID of the cluster.</p>
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
         * <p>Specifies whether to disable the cluster audit log feature. Valid values:</p>
         * <ul>
         * <li>false: enables the audit log feature or updates the audit log configurations.</li>
         * <li>true: disables the audit log feature.</li>
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
         * <p>The <a href="https://help.aliyun.com/document_detail/48873.html">SLS project</a> where the <a href="https://help.aliyun.com/document_detail/48874.html">Logstore</a> for cluster audit logs is located.</p>
         * <ul>
         * <li><p>The default value is k8s-log-{clusterid}.</p>
         * </li>
         * <li><p>After you enable the cluster audit log feature, a Logstore for cluster audit logs is created in the specified SLS project.</p>
         * </li>
         * <li><p>If you need to change the SLS project after enabling the cluster audit log feature, you can use this parameter to specify a new SLS project. Only ACK managed clusters support changing the SLS project.</p>
         * </li>
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
