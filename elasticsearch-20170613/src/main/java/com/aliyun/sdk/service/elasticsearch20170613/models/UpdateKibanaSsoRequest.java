// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link UpdateKibanaSsoRequest} extends {@link RequestModel}
 *
 * <p>UpdateKibanaSsoRequest</p>
 */
public class UpdateKibanaSsoRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("enable")
    @com.aliyun.core.annotation.Validation(required = true)
    private String enable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("networkType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String networkType;

    private UpdateKibanaSsoRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.enable = builder.enable;
        this.networkType = builder.networkType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateKibanaSsoRequest create() {
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
     * @return enable
     */
    public String getEnable() {
        return this.enable;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    public static final class Builder extends Request.Builder<UpdateKibanaSsoRequest, Builder> {
        private String instanceId; 
        private String enable; 
        private String networkType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateKibanaSsoRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.enable = request.enable;
            this.networkType = request.networkType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-bkh4h4rft00***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enable(String enable) {
            this.putQueryParameter("enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * <p>PUBLIC, PRIVATE</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PUBLIC, PRIVATE</p>
         */
        public Builder networkType(String networkType) {
            this.putQueryParameter("networkType", networkType);
            this.networkType = networkType;
            return this;
        }

        @Override
        public UpdateKibanaSsoRequest build() {
            return new UpdateKibanaSsoRequest(this);
        } 

    } 

}
