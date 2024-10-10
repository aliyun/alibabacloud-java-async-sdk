// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link InstallHybridProxyRequest} extends {@link RequestModel}
 *
 * <p>InstallHybridProxyRequest</p>
 */
public class InstallHybridProxyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterName")
    private String clusterName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstallCode")
    private String installCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("YundunUuids")
    private java.util.List < String > yundunUuids;

    private InstallHybridProxyRequest(Builder builder) {
        super(builder);
        this.clusterName = builder.clusterName;
        this.installCode = builder.installCode;
        this.yundunUuids = builder.yundunUuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstallHybridProxyRequest create() {
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
     * @return installCode
     */
    public String getInstallCode() {
        return this.installCode;
    }

    /**
     * @return yundunUuids
     */
    public java.util.List < String > getYundunUuids() {
        return this.yundunUuids;
    }

    public static final class Builder extends Request.Builder<InstallHybridProxyRequest, Builder> {
        private String clusterName; 
        private String installCode; 
        private java.util.List < String > yundunUuids; 

        private Builder() {
            super();
        } 

        private Builder(InstallHybridProxyRequest request) {
            super(request);
            this.clusterName = request.clusterName;
            this.installCode = request.installCode;
            this.yundunUuids = request.yundunUuids;
        } 

        /**
         * <p>The cluster name.</p>
         * 
         * <strong>example:</strong>
         * <p>proxy-test</p>
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * <p>The installation code.</p>
         * 
         * <strong>example:</strong>
         * <p>Z9c8SA</p>
         */
        public Builder installCode(String installCode) {
            this.putQueryParameter("InstallCode", installCode);
            this.installCode = installCode;
            return this;
        }

        /**
         * <p>The UUIDs of the proxy servers.</p>
         */
        public Builder yundunUuids(java.util.List < String > yundunUuids) {
            this.putQueryParameter("YundunUuids", yundunUuids);
            this.yundunUuids = yundunUuids;
            return this;
        }

        @Override
        public InstallHybridProxyRequest build() {
            return new InstallHybridProxyRequest(this);
        } 

    } 

}
