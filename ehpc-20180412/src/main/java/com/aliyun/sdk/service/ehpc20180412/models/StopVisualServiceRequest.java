// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopVisualServiceRequest} extends {@link RequestModel}
 *
 * <p>StopVisualServiceRequest</p>
 */
public class StopVisualServiceRequest extends Request {
    @Query
    @NameInMap("CidrIp")
    @Validation(required = true)
    private String cidrIp;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("Port")
    @Validation(required = true, maximum = 65535)
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

        private Builder(StopVisualServiceRequest response) {
            super(response);
            this.cidrIp = response.cidrIp;
            this.clusterId = response.clusterId;
            this.port = response.port;
        } 

        /**
         * CidrIp.
         */
        public Builder cidrIp(String cidrIp) {
            this.putQueryParameter("CidrIp", cidrIp);
            this.cidrIp = cidrIp;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Port.
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
