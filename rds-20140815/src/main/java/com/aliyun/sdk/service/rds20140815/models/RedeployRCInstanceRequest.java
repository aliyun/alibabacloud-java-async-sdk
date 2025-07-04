// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link RedeployRCInstanceRequest} extends {@link RequestModel}
 *
 * <p>RedeployRCInstanceRequest</p>
 */
public class RedeployRCInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForceStop")
    private Boolean forceStop;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private RedeployRCInstanceRequest(Builder builder) {
        super(builder);
        this.forceStop = builder.forceStop;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RedeployRCInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return forceStop
     */
    public Boolean getForceStop() {
        return this.forceStop;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<RedeployRCInstanceRequest, Builder> {
        private Boolean forceStop; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(RedeployRCInstanceRequest request) {
            super(request);
            this.forceStop = request.forceStop;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>Specifies whether to forcefully stop the instance that is in the Running state. Default value: false.</p>
         * <blockquote>
         * <p> A forced stop is equivalent to the shutdown operation for a physical database server and can result in loss of data that is not written to storage devices. We recommend that you redeploy instances when they are in the Stopped state.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder forceStop(Boolean forceStop) {
            this.putQueryParameter("ForceStop", forceStop);
            this.forceStop = forceStop;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rc-s8t4zcwr5fnmfycn****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public RedeployRCInstanceRequest build() {
            return new RedeployRCInstanceRequest(this);
        } 

    } 

}
