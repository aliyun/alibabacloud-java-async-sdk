// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link BatchQuerySessionByClientIdsRequest} extends {@link RequestModel}
 *
 * <p>BatchQuerySessionByClientIdsRequest</p>
 */
public class BatchQuerySessionByClientIdsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientIdList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > clientIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private BatchQuerySessionByClientIdsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientIdList = builder.clientIdList;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchQuerySessionByClientIdsRequest create() {
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
     * @return clientIdList
     */
    public java.util.List < String > getClientIdList() {
        return this.clientIdList;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<BatchQuerySessionByClientIdsRequest, Builder> {
        private String regionId; 
        private java.util.List < String > clientIdList; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(BatchQuerySessionByClientIdsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientIdList = request.clientIdList;
            this.instanceId = request.instanceId;
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
         * <p>The ApsaraMQ for MQTT clients.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ClientIdList.1</p>
         */
        public Builder clientIdList(java.util.List < String > clientIdList) {
            this.putQueryParameter("ClientIdList", clientIdList);
            this.clientIdList = clientIdList;
            return this;
        }

        /**
         * <p>The ID of the ApsaraMQ for MQTT instance. The ID must be consistent with the ID of the instance that the ApsaraMQ for MQTT client uses. You can obtain the instance ID on the <strong>Instance Details</strong> page that corresponds to the instance in the <a href="https://mqtt.console.aliyun.com">ApsaraMQ for MQTT console</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>post-cn-0pp12gl****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public BatchQuerySessionByClientIdsRequest build() {
            return new BatchQuerySessionByClientIdsRequest(this);
        } 

    } 

}
