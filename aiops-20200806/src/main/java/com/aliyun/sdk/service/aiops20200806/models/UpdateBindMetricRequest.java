// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateBindMetricRequest} extends {@link RequestModel}
 *
 * <p>UpdateBindMetricRequest</p>
 */
public class UpdateBindMetricRequest extends Request {
    @Query
    @NameInMap("Id")
    private String id;

    @Query
    @NameInMap("MetricId")
    private Long metricId;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    private UpdateBindMetricRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.metricId = builder.metricId;
        this.operaUid = builder.operaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateBindMetricRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return metricId
     */
    public Long getMetricId() {
        return this.metricId;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    public static final class Builder extends Request.Builder<UpdateBindMetricRequest, Builder> {
        private String id; 
        private Long metricId; 
        private String operaUid; 

        private Builder() {
            super();
        } 

        private Builder(UpdateBindMetricRequest request) {
            super(request);
            this.id = request.id;
            this.metricId = request.metricId;
            this.operaUid = request.operaUid;
        } 

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * MetricId.
         */
        public Builder metricId(Long metricId) {
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
        public UpdateBindMetricRequest build() {
            return new UpdateBindMetricRequest(this);
        } 

    } 

}
