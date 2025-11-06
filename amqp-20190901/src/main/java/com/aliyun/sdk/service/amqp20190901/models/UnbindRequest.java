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
 * {@link UnbindRequest} extends {@link RequestModel}
 *
 * <p>UnbindRequest</p>
 */
public class UnbindRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BindingKey")
    private String bindingKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BindingType")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 1)
    private Integer bindingType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsoleSessionId")
    private String consoleSessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dstName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String srcName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VhostName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vhostName;

    private UnbindRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bindingKey = builder.bindingKey;
        this.bindingType = builder.bindingType;
        this.consoleSessionId = builder.consoleSessionId;
        this.dstName = builder.dstName;
        this.instanceId = builder.instanceId;
        this.srcName = builder.srcName;
        this.vhostName = builder.vhostName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindRequest create() {
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
     * @return bindingKey
     */
    public String getBindingKey() {
        return this.bindingKey;
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
     * @return dstName
     */
    public String getDstName() {
        return this.dstName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return srcName
     */
    public String getSrcName() {
        return this.srcName;
    }

    /**
     * @return vhostName
     */
    public String getVhostName() {
        return this.vhostName;
    }

    public static final class Builder extends Request.Builder<UnbindRequest, Builder> {
        private String regionId; 
        private String bindingKey; 
        private Integer bindingType; 
        private String consoleSessionId; 
        private String dstName; 
        private String instanceId; 
        private String srcName; 
        private String vhostName; 

        private Builder() {
            super();
        } 

        private Builder(UnbindRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bindingKey = request.bindingKey;
            this.bindingType = request.bindingType;
            this.consoleSessionId = request.consoleSessionId;
            this.dstName = request.dstName;
            this.instanceId = request.instanceId;
            this.srcName = request.srcName;
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
         * BindingKey.
         */
        public Builder bindingKey(String bindingKey) {
            this.putQueryParameter("BindingKey", bindingKey);
            this.bindingKey = bindingKey;
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
         * <p>This parameter is required.</p>
         */
        public Builder dstName(String dstName) {
            this.putQueryParameter("DstName", dstName);
            this.dstName = dstName;
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
        public Builder srcName(String srcName) {
            this.putQueryParameter("SrcName", srcName);
            this.srcName = srcName;
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
        public UnbindRequest build() {
            return new UnbindRequest(this);
        } 

    } 

}
