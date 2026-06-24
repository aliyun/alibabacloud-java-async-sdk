// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

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
 * {@link UpdateOpenSourcePermissionRequest} extends {@link RequestModel}
 *
 * <p>UpdateOpenSourcePermissionRequest</p>
 */
public class UpdateOpenSourcePermissionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Configure")
    private String configure;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Read")
    private String read;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Vhost")
    private String vhost;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Write")
    private String write;

    private UpdateOpenSourcePermissionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.configure = builder.configure;
        this.instanceId = builder.instanceId;
        this.read = builder.read;
        this.userName = builder.userName;
        this.vhost = builder.vhost;
        this.write = builder.write;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateOpenSourcePermissionRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return configure
     */
    public String getConfigure() {
        return this.configure;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return read
     */
    public String getRead() {
        return this.read;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return vhost
     */
    public String getVhost() {
        return this.vhost;
    }

    /**
     * @return write
     */
    public String getWrite() {
        return this.write;
    }

    public static final class Builder extends Request.Builder<UpdateOpenSourcePermissionRequest, Builder> {
        private String regionId; 
        private String clientToken; 
        private String configure; 
        private String instanceId; 
        private String read; 
        private String userName; 
        private String vhost; 
        private String write; 

        private Builder() {
            super();
        } 

        private Builder(UpdateOpenSourcePermissionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientToken = request.clientToken;
            this.configure = request.configure;
            this.instanceId = request.instanceId;
            this.read = request.read;
            this.userName = request.userName;
            this.vhost = request.vhost;
            this.write = request.write;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Configure.
         */
        public Builder configure(String configure) {
            this.putQueryParameter("Configure", configure);
            this.configure = configure;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amqp-cn-v0h1kb9nu***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Read.
         */
        public Builder read(String read) {
            this.putQueryParameter("Read", read);
            this.read = read;
            return this;
        }

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * Vhost.
         */
        public Builder vhost(String vhost) {
            this.putQueryParameter("Vhost", vhost);
            this.vhost = vhost;
            return this;
        }

        /**
         * Write.
         */
        public Builder write(String write) {
            this.putQueryParameter("Write", write);
            this.write = write;
            return this;
        }

        @Override
        public UpdateOpenSourcePermissionRequest build() {
            return new UpdateOpenSourcePermissionRequest(this);
        } 

    } 

}
