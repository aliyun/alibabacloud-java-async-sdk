// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMonitorItemRequest} extends {@link RequestModel}
 *
 * <p>GetMonitorItemRequest</p>
 */
public class GetMonitorItemRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("MonitorItemId")
    @Validation(required = true)
    private String monitorItemId;

    private GetMonitorItemRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.monitorItemId = builder.monitorItemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMonitorItemRequest create() {
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
     * @return monitorItemId
     */
    public String getMonitorItemId() {
        return this.monitorItemId;
    }

    public static final class Builder extends Request.Builder<GetMonitorItemRequest, Builder> {
        private String instanceId; 
        private String monitorItemId; 

        private Builder() {
            super();
        } 

        private Builder(GetMonitorItemRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.monitorItemId = request.monitorItemId;
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
         * MonitorItemId.
         */
        public Builder monitorItemId(String monitorItemId) {
            this.putQueryParameter("MonitorItemId", monitorItemId);
            this.monitorItemId = monitorItemId;
            return this;
        }

        @Override
        public GetMonitorItemRequest build() {
            return new GetMonitorItemRequest(this);
        } 

    } 

}
