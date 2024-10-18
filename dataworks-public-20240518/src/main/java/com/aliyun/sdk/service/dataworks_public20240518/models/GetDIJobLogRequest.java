// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDIJobLogRequest} extends {@link RequestModel}
 *
 * <p>GetDIJobLogRequest</p>
 */
public class GetDIJobLogRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DIJobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long DIJobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FailoverId")
    private Long failoverId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private Long instanceId;

    private GetDIJobLogRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.DIJobId = builder.DIJobId;
        this.failoverId = builder.failoverId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDIJobLogRequest create() {
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
     * @return DIJobId
     */
    public Long getDIJobId() {
        return this.DIJobId;
    }

    /**
     * @return failoverId
     */
    public Long getFailoverId() {
        return this.failoverId;
    }

    /**
     * @return instanceId
     */
    public Long getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<GetDIJobLogRequest, Builder> {
        private String regionId; 
        private Long DIJobId; 
        private Long failoverId; 
        private Long instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetDIJobLogRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.DIJobId = request.DIJobId;
            this.failoverId = request.failoverId;
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
         * <p>The ID of the synchronization task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder DIJobId(Long DIJobId) {
            this.putQueryParameter("DIJobId", DIJobId);
            this.DIJobId = DIJobId;
            return this;
        }

        /**
         * <p>The failover ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder failoverId(Long failoverId) {
            this.putQueryParameter("FailoverId", failoverId);
            this.failoverId = failoverId;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6153616438</p>
         */
        public Builder instanceId(Long instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public GetDIJobLogRequest build() {
            return new GetDIJobLogRequest(this);
        } 

    } 

}
