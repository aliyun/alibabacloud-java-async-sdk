// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link CreateHybridProxyClusterRequest} extends {@link RequestModel}
 *
 * <p>CreateHybridProxyClusterRequest</p>
 */
public class CreateHybridProxyClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ip")
    private String ip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    private CreateHybridProxyClusterRequest(Builder builder) {
        super(builder);
        this.clusterName = builder.clusterName;
        this.ip = builder.ip;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHybridProxyClusterRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    public static final class Builder extends Request.Builder<CreateHybridProxyClusterRequest, Builder> {
        private String clusterName; 
        private String ip; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(CreateHybridProxyClusterRequest request) {
            super(request);
            this.clusterName = request.clusterName;
            this.ip = request.ip;
            this.remark = request.remark;
        } 

        /**
         * <p>The name of the cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Chester-Test</p>
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * <p>The endpoint of the cluster.</p>
         * <blockquote>
         * <p> You can specify an IP address or a domain name</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>192.168.xx.xx</p>
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * <p>The description of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>remark test</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        @Override
        public CreateHybridProxyClusterRequest build() {
            return new CreateHybridProxyClusterRequest(this);
        } 

    } 

}
