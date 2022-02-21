// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDataShareInstanceRequest} extends {@link RequestModel}
 *
 * <p>SetDataShareInstanceRequest</p>
 */
public class SetDataShareInstanceRequest extends Request {
    @Query
    @NameInMap("InstanceList")
    @Validation(required = true)
    private java.util.List < String > instanceList;

    @Query
    @NameInMap("OperationType")
    @Validation(required = true)
    private String operationType;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private SetDataShareInstanceRequest(Builder builder) {
        super(builder);
        this.instanceList = builder.instanceList;
        this.operationType = builder.operationType;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDataShareInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceList
     */
    public java.util.List < String > getInstanceList() {
        return this.instanceList;
    }

    /**
     * @return operationType
     */
    public String getOperationType() {
        return this.operationType;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<SetDataShareInstanceRequest, Builder> {
        private java.util.List < String > instanceList; 
        private String operationType; 
        private Long ownerId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(SetDataShareInstanceRequest response) {
            super(response);
            this.instanceList = response.instanceList;
            this.operationType = response.operationType;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
        } 

        /**
         * InstanceList.
         */
        public Builder instanceList(java.util.List < String > instanceList) {
            this.putQueryParameter("InstanceList", instanceList);
            this.instanceList = instanceList;
            return this;
        }

        /**
         * OperationType.
         */
        public Builder operationType(String operationType) {
            this.putQueryParameter("OperationType", operationType);
            this.operationType = operationType;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
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
        public SetDataShareInstanceRequest build() {
            return new SetDataShareInstanceRequest(this);
        } 

    } 

}
