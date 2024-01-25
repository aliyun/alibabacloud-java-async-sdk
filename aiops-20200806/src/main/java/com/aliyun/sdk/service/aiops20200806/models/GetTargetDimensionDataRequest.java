// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTargetDimensionDataRequest} extends {@link RequestModel}
 *
 * <p>GetTargetDimensionDataRequest</p>
 */
public class GetTargetDimensionDataRequest extends Request {
    @Query
    @NameInMap("End")
    private Long end;

    @Query
    @NameInMap("Flag")
    private String flag;

    @Query
    @NameInMap("Label")
    private String label;

    @Query
    @NameInMap("LabelValue")
    private String labelValue;

    @Query
    @NameInMap("MetricId")
    private String metricId;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    @Query
    @NameInMap("Start")
    private Long start;

    private GetTargetDimensionDataRequest(Builder builder) {
        super(builder);
        this.end = builder.end;
        this.flag = builder.flag;
        this.label = builder.label;
        this.labelValue = builder.labelValue;
        this.metricId = builder.metricId;
        this.operaUid = builder.operaUid;
        this.start = builder.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTargetDimensionDataRequest create() {
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
     * @return label
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * @return labelValue
     */
    public String getLabelValue() {
        return this.labelValue;
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

    public static final class Builder extends Request.Builder<GetTargetDimensionDataRequest, Builder> {
        private Long end; 
        private String flag; 
        private String label; 
        private String labelValue; 
        private String metricId; 
        private String operaUid; 
        private Long start; 

        private Builder() {
            super();
        } 

        private Builder(GetTargetDimensionDataRequest request) {
            super(request);
            this.end = request.end;
            this.flag = request.flag;
            this.label = request.label;
            this.labelValue = request.labelValue;
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
         * Label.
         */
        public Builder label(String label) {
            this.putQueryParameter("Label", label);
            this.label = label;
            return this;
        }

        /**
         * LabelValue.
         */
        public Builder labelValue(String labelValue) {
            this.putQueryParameter("LabelValue", labelValue);
            this.labelValue = labelValue;
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
        public GetTargetDimensionDataRequest build() {
            return new GetTargetDimensionDataRequest(this);
        } 

    } 

}
