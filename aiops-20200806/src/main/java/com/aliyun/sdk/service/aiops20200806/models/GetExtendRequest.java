// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetExtendRequest} extends {@link RequestModel}
 *
 * <p>GetExtendRequest</p>
 */
public class GetExtendRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("MetricId")
    private String metricId;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    private GetExtendRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.metricId = builder.metricId;
        this.operaUid = builder.operaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExtendRequest create() {
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
     * @return metricId
     */
    public String getMetricId() {
        return this.metricId;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    public static final class Builder extends Request.Builder<GetExtendRequest, Builder> {
        private String instanceId; 
        private String metricId; 
        private String operaUid; 

        private Builder() {
            super();
        } 

        private Builder(GetExtendRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.metricId = request.metricId;
            this.operaUid = request.operaUid;
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
         * MetricId.
         */
        public Builder metricId(String metricId) {
            this.putQueryParameter("MetricId", metricId);
            this.metricId = metricId;
            return this;
        }

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putQueryParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        @Override
        public GetExtendRequest build() {
            return new GetExtendRequest(this);
        } 

    } 

}
