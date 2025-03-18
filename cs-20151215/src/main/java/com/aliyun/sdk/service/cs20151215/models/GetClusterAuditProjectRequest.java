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
 * {@link GetClusterAuditProjectRequest} extends {@link RequestModel}
 *
 * <p>GetClusterAuditProjectRequest</p>
 */
public class GetClusterAuditProjectRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("clusterid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterid;

    private GetClusterAuditProjectRequest(Builder builder) {
        super(builder);
        this.clusterid = builder.clusterid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClusterAuditProjectRequest create() {
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

    public static final class Builder extends Request.Builder<GetClusterAuditProjectRequest, Builder> {
        private String clusterid; 

        private Builder() {
            super();
        } 

        private Builder(GetClusterAuditProjectRequest request) {
            super(request);
            this.clusterid = request.clusterid;
        } 

        /**
         * <p>Cluster ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cad1230511cbb4db4a488e58518******</p>
         */
        public Builder clusterid(String clusterid) {
            this.putPathParameter("clusterid", clusterid);
            this.clusterid = clusterid;
            return this;
        }

        @Override
        public GetClusterAuditProjectRequest build() {
            return new GetClusterAuditProjectRequest(this);
        } 

    } 

}
