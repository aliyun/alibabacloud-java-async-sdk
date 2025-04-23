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
 * {@link StartVisualServiceRequest} extends {@link RequestModel}
 *
 * <p>StartVisualServiceRequest</p>
 */
public class StartVisualServiceRequest extends Request {
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

    private StartVisualServiceRequest(Builder builder) {
        super(builder);
        this.cidrIp = builder.cidrIp;
        this.clusterId = builder.clusterId;
        this.port = builder.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartVisualServiceRequest create() {
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

    public static final class Builder extends Request.Builder<StartVisualServiceRequest, Builder> {
        private String cidrIp; 
        private String clusterId; 
        private Integer port; 

        private Builder() {
            super();
        } 

        private Builder(StartVisualServiceRequest request) {
            super(request);
            this.cidrIp = request.cidrIp;
            this.clusterId = request.clusterId;
            this.port = request.port;
        } 

        /**
         * <p>A public IP address of logon nodes in the cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><code>190.100.**.**</code></p>
         */
        public Builder cidrIp(String cidrIp) {
            this.putQueryParameter("CidrIp", cidrIp);
            this.cidrIp = cidrIp;
            return this;
        }

        /**
         * <p>The ID of the cluster.</p>
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
         * <p>The fixed port. Set the value to 12016</p>
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
        public StartVisualServiceRequest build() {
            return new StartVisualServiceRequest(this);
        } 

    } 

}
