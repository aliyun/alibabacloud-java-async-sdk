// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
         * <p>Enable or disable the audit log feature.</p>
         * <ul>
         * <li>false: enables the audit log feature or updates the audit log configuration.</li>
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
         * <p>The <a href="https://help.aliyun.com/zh/sls/product-overview/project?spm=a2c4g.11186623.0.i3">SLS project</a> to which the <a href="https://help.aliyun.com/zh/sls/product-overview/logstore?spm=a2c4g.11186623.0.0.48287ce0jAUWWM">Logstore</a> belongs.</p>
         * <ul>
         * <li>Default value: k8s-log-{clusterid}.</li>
         * <li>After the cluster audit log feature is enabled, a Logstore is created in the specified SLS project to store the cluster audit logs.</li>
         * <li>If you want to change the project after the cluster audit log feature is enabled, you can use this parameter to specify another SLS project. You can perform this operation only in ACK managed clusters.</li>
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
