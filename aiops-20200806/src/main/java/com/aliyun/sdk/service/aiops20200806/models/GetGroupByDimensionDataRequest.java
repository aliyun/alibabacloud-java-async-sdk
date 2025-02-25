// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetGroupByDimensionDataRequest} extends {@link RequestModel}
 *
 * <p>GetGroupByDimensionDataRequest</p>
 */
public class GetGroupByDimensionDataRequest extends Request {
    @Query
    @NameInMap("End")
    private Long end;

    @Query
    @NameInMap("Flag")
    private String flag;

    @Query
    @NameInMap("GroupBy")
    private String groupBy;

    @Query
    @NameInMap("MetricId")
    private String metricId;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    @Query
    @NameInMap("Start")
    private Long start;

    private GetGroupByDimensionDataRequest(Builder builder) {
        super(builder);
        this.end = builder.end;
        this.flag = builder.flag;
        this.groupBy = builder.groupBy;
        this.metricId = builder.metricId;
        this.operaUid = builder.operaUid;
        this.start = builder.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGroupByDimensionDataRequest create() {
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
     * @return flag
     */
    public String getFlag() {
        return this.flag;
    }

    /**
     * @return groupBy
     */
    public String getGroupBy() {
        return this.groupBy;
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

    public static final class Builder extends Request.Builder<GetGroupByDimensionDataRequest, Builder> {
        private Long end; 
        private String flag; 
        private String groupBy; 
        private String metricId; 
        private String operaUid; 
        private Long start; 

        private Builder() {
            super();
        } 

        private Builder(GetGroupByDimensionDataRequest request) {
            super(request);
            this.end = request.end;
            this.flag = request.flag;
            this.groupBy = request.groupBy;
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
         * Flag.
         */
        public Builder flag(String flag) {
            this.putQueryParameter("Flag", flag);
            this.flag = flag;
            return this;
        }

        /**
         * GroupBy.
         */
        public Builder groupBy(String groupBy) {
            this.putQueryParameter("GroupBy", groupBy);
            this.groupBy = groupBy;
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
        public GetGroupByDimensionDataRequest build() {
            return new GetGroupByDimensionDataRequest(this);
        } 

    } 

}
