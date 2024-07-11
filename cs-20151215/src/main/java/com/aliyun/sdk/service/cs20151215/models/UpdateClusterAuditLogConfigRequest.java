// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * clusterid.
         */
        public Builder clusterid(String clusterid) {
            this.putPathParameter("clusterid", clusterid);
            this.clusterid = clusterid;
            return this;
        }

        /**
         * disable.
         */
        public Builder disable(Boolean disable) {
            this.putBodyParameter("disable", disable);
            this.disable = disable;
            return this;
        }

        /**
         * sls_project_name.
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
