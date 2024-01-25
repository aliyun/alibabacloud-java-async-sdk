// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSceneMetricTableRequest} extends {@link RequestModel}
 *
 * <p>GetSceneMetricTableRequest</p>
 */
public class GetSceneMetricTableRequest extends Request {
    @Query
    @NameInMap("End")
    private Long end;

    @Query
    @NameInMap("MetricId")
    private String metricId;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    @Query
    @NameInMap("Start")
    private Long start;

    private GetSceneMetricTableRequest(Builder builder) {
        super(builder);
        this.end = builder.end;
        this.metricId = builder.metricId;
        this.operaUid = builder.operaUid;
        this.start = builder.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSceneMetricTableRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return end
     */
    public Long getEnd() {
        return this.end;
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

    /**
     * @return start
     */
    public Long getStart() {
        return this.start;
    }

    public static final class Builder extends Request.Builder<GetSceneMetricTableRequest, Builder> {
        private Long end; 
        private String metricId; 
        private String operaUid; 
        private Long start; 

        private Builder() {
            super();
        } 

        private Builder(GetSceneMetricTableRequest request) {
            super(request);
            this.end = request.end;
            this.metricId = request.metricId;
            this.operaUid = request.operaUid;
            this.start = request.start;
        } 

        /**
         * End.
         */
        public Builder end(Long end) {
            this.putQueryParameter("End", end);
            this.end = end;
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

        /**
         * Start.
         */
        public Builder start(Long start) {
            this.putQueryParameter("Start", start);
            this.start = start;
            return this;
        }

        @Override
        public GetSceneMetricTableRequest build() {
            return new GetSceneMetricTableRequest(this);
        } 

    } 

}
