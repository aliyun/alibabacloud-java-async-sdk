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
 * {@link GetBindingCountRequest} extends {@link RequestModel}
 *
 * <p>GetBindingCountRequest</p>
 */
public class GetBindingCountRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BindingType")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 1)
    private Integer bindingType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsoleSessionId")
    private String consoleSessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Upstream")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100, minimum = 1)
    private Boolean upstream;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VhostName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vhostName;

    private GetBindingCountRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bindingType = builder.bindingType;
        this.consoleSessionId = builder.consoleSessionId;
        this.instanceId = builder.instanceId;
        this.resourceName = builder.resourceName;
        this.upstream = builder.upstream;
        this.vhostName = builder.vhostName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBindingCountRequest create() {
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
     * @return bindingType
     */
    public Integer getBindingType() {
        return this.bindingType;
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
     * @return resourceName
     */
    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * @return upstream
     */
    public Boolean getUpstream() {
        return this.upstream;
    }

    /**
     * @return vhostName
     */
    public String getVhostName() {
        return this.vhostName;
    }

    public static final class Builder extends Request.Builder<GetBindingCountRequest, Builder> {
        private String regionId; 
        private Integer bindingType; 
        private String consoleSessionId; 
        private String instanceId; 
        private String resourceName; 
        private Boolean upstream; 
        private String vhostName; 

        private Builder() {
            super();
        } 

        private Builder(GetBindingCountRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bindingType = request.bindingType;
            this.consoleSessionId = request.consoleSessionId;
            this.instanceId = request.instanceId;
            this.resourceName = request.resourceName;
            this.upstream = request.upstream;
            this.vhostName = request.vhostName;
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
         * <p>This parameter is required.</p>
         */
        public Builder bindingType(Integer bindingType) {
            this.putQueryParameter("BindingType", bindingType);
            this.bindingType = bindingType;
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
         * <p>This parameter is required.</p>
         */
        public Builder resourceName(String resourceName) {
            this.putQueryParameter("ResourceName", resourceName);
            this.resourceName = resourceName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder upstream(Boolean upstream) {
            this.putQueryParameter("Upstream", upstream);
            this.upstream = upstream;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder vhostName(String vhostName) {
            this.putQueryParameter("VhostName", vhostName);
            this.vhostName = vhostName;
            return this;
        }

        @Override
        public GetBindingCountRequest build() {
            return new GetBindingCountRequest(this);
        } 

    } 

}
