// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link StopVisualServiceRequest} extends {@link RequestModel}
 *
 * <p>StopVisualServiceRequest</p>
 */
public class StopVisualServiceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CidrIp")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cidrIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Port")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 65535)
    private Integer port;

    private StopVisualServiceRequest(Builder builder) {
        super(builder);
        this.cidrIp = builder.cidrIp;
        this.clusterId = builder.clusterId;
        this.port = builder.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopVisualServiceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cidrIp
     */
    public String getCidrIp() {
        return this.cidrIp;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return port
     */
    public Integer getPort() {
        return this.port;
    }

    public static final class Builder extends Request.Builder<StopVisualServiceRequest, Builder> {
        private String cidrIp; 
        private String clusterId; 
        private Integer port; 

        private Builder() {
            super();
        } 

        private Builder(StopVisualServiceRequest request) {
            super(request);
            this.cidrIp = request.cidrIp;
            this.clusterId = request.clusterId;
            this.port = request.port;
        } 

        /**
         * <p>The CIDR block or IP address that is allowed to access the VNC service. This parameter is used to assign a security group to the E-HPC cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><code>100.168.**.**</code></p>
         */
        public Builder cidrIp(String cidrIp) {
            this.putQueryParameter("CidrIp", cidrIp);
            this.cidrIp = cidrIp;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-hz-jeJki6****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The fixed port. Set the value to 12016.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12016</p>
         */
        public Builder port(Integer port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        @Override
        public StopVisualServiceRequest build() {
            return new StopVisualServiceRequest(this);
        } 

    } 

}
