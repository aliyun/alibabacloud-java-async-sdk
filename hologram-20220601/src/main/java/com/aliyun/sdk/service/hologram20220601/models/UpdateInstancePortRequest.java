// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

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
 * {@link UpdateInstancePortRequest} extends {@link RequestModel}
 *
 * <p>UpdateInstancePortRequest</p>
 */
public class UpdateInstancePortRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("port")
    private Integer port;

    private UpdateInstancePortRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.port = builder.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInstancePortRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return port
     */
    public Integer getPort() {
        return this.port;
    }

    public static final class Builder extends Request.Builder<UpdateInstancePortRequest, Builder> {
        private String instanceId; 
        private Integer port; 

        private Builder() {
            super();
        } 

        private Builder(UpdateInstancePortRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.port = request.port;
        } 

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * port.
         */
        public Builder port(Integer port) {
            this.putBodyParameter("port", port);
            this.port = port;
            return this;
        }

        @Override
        public UpdateInstancePortRequest build() {
            return new UpdateInstancePortRequest(this);
        } 

    } 

}
