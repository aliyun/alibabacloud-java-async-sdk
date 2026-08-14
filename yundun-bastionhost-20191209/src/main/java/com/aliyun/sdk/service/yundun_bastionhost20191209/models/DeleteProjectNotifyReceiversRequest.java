// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link DeleteProjectNotifyReceiversRequest} extends {@link RequestModel}
 *
 * <p>DeleteProjectNotifyReceiversRequest</p>
 */
public class DeleteProjectNotifyReceiversRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReceiverIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String receiverIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DeleteProjectNotifyReceiversRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.receiverIds = builder.receiverIds;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteProjectNotifyReceiversRequest create() {
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
     * @return receiverIds
     */
    public String getReceiverIds() {
        return this.receiverIds;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteProjectNotifyReceiversRequest, Builder> {
        private String instanceId; 
        private String receiverIds; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteProjectNotifyReceiversRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.receiverIds = request.receiverIds;
            this.regionId = request.regionId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder receiverIds(String receiverIds) {
            this.putQueryParameter("ReceiverIds", receiverIds);
            this.receiverIds = receiverIds;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteProjectNotifyReceiversRequest build() {
            return new DeleteProjectNotifyReceiversRequest(this);
        } 

    } 

}
