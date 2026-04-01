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
 * {@link UpdateFalconSeekRequest} extends {@link RequestModel}
 *
 * <p>UpdateFalconSeekRequest</p>
 */
public class UpdateFalconSeekRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("enable")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean enable;

    private UpdateFalconSeekRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.enable = builder.enable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFalconSeekRequest create() {
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
    public Boolean getEnable() {
        return this.enable;
    }

    public static final class Builder extends Request.Builder<UpdateFalconSeekRequest, Builder> {
        private String instanceId; 
        private Boolean enable; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFalconSeekRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.enable = request.enable;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-n6w1o1x0w001c****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder enable(Boolean enable) {
            this.putQueryParameter("enable", enable);
            this.enable = enable;
            return this;
        }

        @Override
        public UpdateFalconSeekRequest build() {
            return new UpdateFalconSeekRequest(this);
        } 

    } 

}
