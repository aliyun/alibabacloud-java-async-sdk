// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp20190901.models;

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
 * {@link ListVhostRequest} extends {@link RequestModel}
 *
 * <p>ListVhostRequest</p>
 */
public class ListVhostRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsoleSessionId")
    private String consoleSessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VhostNamePrefix")
    private String vhostNamePrefix;

    private ListVhostRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.consoleSessionId = builder.consoleSessionId;
        this.instanceId = builder.instanceId;
        this.vhostNamePrefix = builder.vhostNamePrefix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVhostRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return consoleSessionId
     */
    public String getConsoleSessionId() {
        return this.consoleSessionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return vhostNamePrefix
     */
    public String getVhostNamePrefix() {
        return this.vhostNamePrefix;
    }

    public static final class Builder extends Request.Builder<ListVhostRequest, Builder> {
        private String regionId; 
        private String consoleSessionId; 
        private String instanceId; 
        private String vhostNamePrefix; 

        private Builder() {
            super();
        } 

        private Builder(ListVhostRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.consoleSessionId = request.consoleSessionId;
            this.instanceId = request.instanceId;
            this.vhostNamePrefix = request.vhostNamePrefix;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ConsoleSessionId.
         */
        public Builder consoleSessionId(String consoleSessionId) {
            this.putQueryParameter("ConsoleSessionId", consoleSessionId);
            this.consoleSessionId = consoleSessionId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * VhostNamePrefix.
         */
        public Builder vhostNamePrefix(String vhostNamePrefix) {
            this.putQueryParameter("VhostNamePrefix", vhostNamePrefix);
            this.vhostNamePrefix = vhostNamePrefix;
            return this;
        }

        @Override
        public ListVhostRequest build() {
            return new ListVhostRequest(this);
        } 

    } 

}
