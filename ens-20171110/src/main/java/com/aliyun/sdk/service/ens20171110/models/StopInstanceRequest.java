// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link StopInstanceRequest} extends {@link RequestModel}
 *
 * <p>StopInstanceRequest</p>
 */
public class StopInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForceStop")
    private String forceStop;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private StopInstanceRequest(Builder builder) {
        super(builder);
        this.forceStop = builder.forceStop;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return forceStop
     */
    public String getForceStop() {
        return this.forceStop;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<StopInstanceRequest, Builder> {
        private String forceStop; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(StopInstanceRequest request) {
            super(request);
            this.forceStop = request.forceStop;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>Specifies whether to forcibly stop the servers.</p>
         * <ul>
         * <li><strong>true</strong>: forcibly stops the instance.</li>
         * <li><strong>false</strong>: normally stops the servers. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder forceStop(String forceStop) {
            this.putQueryParameter("ForceStop", forceStop);
            this.forceStop = forceStop;
            return this;
        }

        /**
         * <p>The ID of the instance that you want to stop. You can specify only one instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-instanceid****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public StopInstanceRequest build() {
            return new StopInstanceRequest(this);
        } 

    } 

}
