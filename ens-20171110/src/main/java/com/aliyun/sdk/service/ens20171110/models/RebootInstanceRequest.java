// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RebootInstanceRequest} extends {@link RequestModel}
 *
 * <p>RebootInstanceRequest</p>
 */
public class RebootInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForceStop")
    private String forceStop;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private RebootInstanceRequest(Builder builder) {
        super(builder);
        this.forceStop = builder.forceStop;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RebootInstanceRequest create() {
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

    public static final class Builder extends Request.Builder<RebootInstanceRequest, Builder> {
        private String forceStop; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(RebootInstanceRequest request) {
            super(request);
            this.forceStop = request.forceStop;
            this.instanceId = request.instanceId;
        } 

        /**
         * Indicates whether to stop the instance forcibly before you reboot it. Default value: false. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder forceStop(String forceStop) {
            this.putQueryParameter("ForceStop", forceStop);
            this.forceStop = forceStop;
            return this;
        }

        /**
         * The ID of the instance that you want to reboot. You can specify only one instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public RebootInstanceRequest build() {
            return new RebootInstanceRequest(this);
        } 

    } 

}
