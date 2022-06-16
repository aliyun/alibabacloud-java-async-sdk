// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFreeFlowUsageRequest} extends {@link RequestModel}
 *
 * <p>GetFreeFlowUsageRequest</p>
 */
public class GetFreeFlowUsageRequest extends Request {
    @Query
    @NameInMap("AliUid")
    private Long aliUid;

    @Query
    @NameInMap("CurPageNum")
    @Validation(required = true)
    private Integer curPageNum;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Month")
    @Validation(required = true)
    private String month;

    @Query
    @NameInMap("NumPerPage")
    @Validation(required = true)
    private Integer numPerPage;

    private GetFreeFlowUsageRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.curPageNum = builder.curPageNum;
        this.instanceId = builder.instanceId;
        this.month = builder.month;
        this.numPerPage = builder.numPerPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFreeFlowUsageRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return month
     */
    public String getMonth() {
        return this.month;
    }

    /**
     * @return numPerPage
     */
    public Integer getNumPerPage() {
        return this.numPerPage;
    }

    public static final class Builder extends Request.Builder<GetFreeFlowUsageRequest, Builder> {
        private Long aliUid; 
        private Integer curPageNum; 
        private String instanceId; 
        private String month; 
        private Integer numPerPage; 

        private Builder() {
            super();
        } 

        private Builder(GetFreeFlowUsageRequest request) {
            super(request);
            this.aliUid = request.aliUid;
            this.curPageNum = request.curPageNum;
            this.instanceId = request.instanceId;
            this.month = request.month;
            this.numPerPage = request.numPerPage;
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
        public Builder month(String month) {
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

        @Override
        public GetFreeFlowUsageRequest build() {
            return new GetFreeFlowUsageRequest(this);
        } 

    } 

}
