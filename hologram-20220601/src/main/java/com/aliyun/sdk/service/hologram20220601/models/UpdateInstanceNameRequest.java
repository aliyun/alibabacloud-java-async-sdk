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
 * {@link UpdateInstanceNameRequest} extends {@link RequestModel}
 *
 * <p>UpdateInstanceNameRequest</p>
 */
public class UpdateInstanceNameRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instanceName")
    private String instanceName;

    private UpdateInstanceNameRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInstanceNameRequest create() {
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
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    public static final class Builder extends Request.Builder<UpdateInstanceNameRequest, Builder> {
        private String instanceId; 
        private String instanceName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateInstanceNameRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.instanceName = request.instanceName;
        } 

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>hgpostcn-cn-zpr30pupt004</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The new name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>new_name</p>
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("instanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        @Override
        public UpdateInstanceNameRequest build() {
            return new UpdateInstanceNameRequest(this);
        } 

    } 

}
