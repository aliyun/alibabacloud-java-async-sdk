// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQosFlowUsageRequest} extends {@link RequestModel}
 *
 * <p>GetQosFlowUsageRequest</p>
 */
public class GetQosFlowUsageRequest extends Request {
    @Query
    @NameInMap("AliUid")
    private Long aliUid;

    @Query
    @NameInMap("CurPageNum")
    @Validation(required = true)
    private Integer curPageNum;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Month")
    private Long month;

    @Query
    @NameInMap("NumPerPage")
    @Validation(required = true, maximum = 30, minimum = 10)
    private Integer numPerPage;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    @Query
    @NameInMap("Type")
    private Boolean type;

    private GetQosFlowUsageRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.curPageNum = builder.curPageNum;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.month = builder.month;
        this.numPerPage = builder.numPerPage;
        this.startTime = builder.startTime;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQosFlowUsageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliUid
     */
    public Long getAliUid() {
        return this.aliUid;
    }

    /**
     * @return curPageNum
     */
    public Integer getCurPageNum() {
        return this.curPageNum;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return month
     */
    public Long getMonth() {
        return this.month;
    }

    /**
     * @return numPerPage
     */
    public Integer getNumPerPage() {
        return this.numPerPage;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return type
     */
    public Boolean getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GetQosFlowUsageRequest, Builder> {
        private Long aliUid; 
        private Integer curPageNum; 
        private String endTime; 
        private String instanceId; 
        private Long month; 
        private Integer numPerPage; 
        private String startTime; 
        private Boolean type; 

        private Builder() {
            super();
        } 

        private Builder(GetQosFlowUsageRequest request) {
            super(request);
            this.aliUid = request.aliUid;
            this.curPageNum = request.curPageNum;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.month = request.month;
            this.numPerPage = request.numPerPage;
            this.startTime = request.startTime;
            this.type = request.type;
        } 

        /**
         * AliUid.
         */
        public Builder aliUid(Long aliUid) {
            this.putQueryParameter("AliUid", aliUid);
            this.aliUid = aliUid;
            return this;
        }

        /**
         * 当前页
         */
        public Builder curPageNum(Integer curPageNum) {
            this.putQueryParameter("CurPageNum", curPageNum);
            this.curPageNum = curPageNum;
            return this;
        }

        /**
         * 查询当日
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * 实例ID
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 查询月份
         */
        public Builder month(Long month) {
            this.putQueryParameter("Month", month);
            this.month = month;
            return this;
        }

        /**
         * 每页的记录数量
         */
        public Builder numPerPage(Integer numPerPage) {
            this.putQueryParameter("NumPerPage", numPerPage);
            this.numPerPage = numPerPage;
            return this;
        }

        /**
         * 查询当日
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(Boolean type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetQosFlowUsageRequest build() {
            return new GetQosFlowUsageRequest(this);
        } 

    } 

}
