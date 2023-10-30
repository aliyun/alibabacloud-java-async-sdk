// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RejectOperationTicketRequest} extends {@link RequestModel}
 *
 * <p>RejectOperationTicketRequest</p>
 */
public class RejectOperationTicketRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("OperationTicketId")
    @Validation(required = true)
    private String operationTicketId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private RejectOperationTicketRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.operationTicketId = builder.operationTicketId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RejectOperationTicketRequest create() {
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
     * @return operationTicketId
     */
    public String getOperationTicketId() {
        return this.operationTicketId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<RejectOperationTicketRequest, Builder> {
        private String instanceId; 
        private String operationTicketId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(RejectOperationTicketRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.operationTicketId = request.operationTicketId;
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
         * OperationTicketId.
         */
        public Builder operationTicketId(String operationTicketId) {
            this.putQueryParameter("OperationTicketId", operationTicketId);
            this.operationTicketId = operationTicketId;
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
        public RejectOperationTicketRequest build() {
            return new RejectOperationTicketRequest(this);
        } 

    } 

}
