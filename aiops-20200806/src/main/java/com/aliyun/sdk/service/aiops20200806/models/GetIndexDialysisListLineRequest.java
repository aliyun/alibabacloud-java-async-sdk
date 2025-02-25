// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIndexDialysisListLineRequest} extends {@link RequestModel}
 *
 * <p>GetIndexDialysisListLineRequest</p>
 */
public class GetIndexDialysisListLineRequest extends Request {
    @Query
    @NameInMap("BeginTime")
    private Long beginTime;

    @Query
    @NameInMap("CloudResourceId")
    private String cloudResourceId;

    @Query
    @NameInMap("CloudTypeName")
    private String cloudTypeName;

    @Query
    @NameInMap("EndTime")
    private Long endTime;

    @Query
    @NameInMap("IndexCode")
    private String indexCode;

    @Query
    @NameInMap("MetricExtend")
    private String metricExtend;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    private GetIndexDialysisListLineRequest(Builder builder) {
        super(builder);
        this.beginTime = builder.beginTime;
        this.cloudResourceId = builder.cloudResourceId;
        this.cloudTypeName = builder.cloudTypeName;
        this.endTime = builder.endTime;
        this.indexCode = builder.indexCode;
        this.metricExtend = builder.metricExtend;
        this.operaUid = builder.operaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIndexDialysisListLineRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beginTime
     */
    public Long getBeginTime() {
        return this.beginTime;
    }

    /**
     * @return cloudResourceId
     */
    public String getCloudResourceId() {
        return this.cloudResourceId;
    }

    /**
     * @return cloudTypeName
     */
    public String getCloudTypeName() {
        return this.cloudTypeName;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return indexCode
     */
    public String getIndexCode() {
        return this.indexCode;
    }

    /**
     * @return metricExtend
     */
    public String getMetricExtend() {
        return this.metricExtend;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    public static final class Builder extends Request.Builder<GetIndexDialysisListLineRequest, Builder> {
        private Long beginTime; 
        private String cloudResourceId; 
        private String cloudTypeName; 
        private Long endTime; 
        private String indexCode; 
        private String metricExtend; 
        private String operaUid; 

        private Builder() {
            super();
        } 

        private Builder(GetIndexDialysisListLineRequest request) {
            super(request);
            this.beginTime = request.beginTime;
            this.cloudResourceId = request.cloudResourceId;
            this.cloudTypeName = request.cloudTypeName;
            this.endTime = request.endTime;
            this.indexCode = request.indexCode;
            this.metricExtend = request.metricExtend;
            this.operaUid = request.operaUid;
        } 

        /**
         * BeginTime.
         */
        public Builder beginTime(Long beginTime) {
            this.putQueryParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * CloudResourceId.
         */
        public Builder cloudResourceId(String cloudResourceId) {
            this.putQueryParameter("CloudResourceId", cloudResourceId);
            this.cloudResourceId = cloudResourceId;
            return this;
        }

        /**
         * CloudTypeName.
         */
        public Builder cloudTypeName(String cloudTypeName) {
            this.putQueryParameter("CloudTypeName", cloudTypeName);
            this.cloudTypeName = cloudTypeName;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * IndexCode.
         */
        public Builder indexCode(String indexCode) {
            this.putQueryParameter("IndexCode", indexCode);
            this.indexCode = indexCode;
            return this;
        }

        /**
         * MetricExtend.
         */
        public Builder metricExtend(String metricExtend) {
            this.putQueryParameter("MetricExtend", metricExtend);
            this.metricExtend = metricExtend;
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
        public GetIndexDialysisListLineRequest build() {
            return new GetIndexDialysisListLineRequest(this);
        } 

    } 

}
