// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20191211.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchQuerySessionByClientIdsRequest} extends {@link RequestModel}
 *
 * <p>BatchQuerySessionByClientIdsRequest</p>
 */
public class BatchQuerySessionByClientIdsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ClientIdList")
    @Validation(required = true)
    private java.util.List < String > clientIdList;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ClientIdList.
         */
        public Builder clientIdList(java.util.List < String > clientIdList) {
            this.putQueryParameter("ClientIdList", clientIdList);
            this.clientIdList = clientIdList;
            return this;
        }

        /**
         * InstanceId.
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
