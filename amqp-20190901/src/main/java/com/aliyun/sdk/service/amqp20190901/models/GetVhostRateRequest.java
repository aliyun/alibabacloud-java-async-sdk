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
 * {@link GetVhostRateRequest} extends {@link RequestModel}
 *
 * <p>GetVhostRateRequest</p>
 */
public class GetVhostRateRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsoleSessionId")
    private String consoleSessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VhostNames")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map<String, ?> vhostNames;

    private GetVhostRateRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.consoleSessionId = builder.consoleSessionId;
        this.instanceId = builder.instanceId;
        this.vhostNames = builder.vhostNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVhostRateRequest create() {
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
     * @return vhostNames
     */
    public java.util.Map<String, ?> getVhostNames() {
        return this.vhostNames;
    }

    public static final class Builder extends Request.Builder<GetVhostRateRequest, Builder> {
        private String regionId; 
        private String consoleSessionId; 
        private String instanceId; 
        private java.util.Map<String, ?> vhostNames; 

        private Builder() {
            super();
        } 

        private Builder(GetVhostRateRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.consoleSessionId = request.consoleSessionId;
            this.instanceId = request.instanceId;
            this.vhostNames = request.vhostNames;
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
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder vhostNames(java.util.Map<String, ?> vhostNames) {
            String vhostNamesShrink = shrink(vhostNames, "VhostNames", "json");
            this.putQueryParameter("VhostNames", vhostNamesShrink);
            this.vhostNames = vhostNames;
            return this;
        }

        @Override
        public GetVhostRateRequest build() {
            return new GetVhostRateRequest(this);
        } 

    } 

}
