// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.customerservice20231228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListYunQiTaskByUidRequest} extends {@link RequestModel}
 *
 * <p>ListYunQiTaskByUidRequest</p>
 */
public class ListYunQiTaskByUidRequest extends Request {
    @Body
    @NameInMap("createTimeEnd")
    private Long createTimeEnd;

    @Body
    @NameInMap("createTimeStart")
    private Long createTimeStart;

    @Body
    @NameInMap("freeOrderApplyCodes")
    private java.util.List < String > freeOrderApplyCodes;

    @Body
    @NameInMap("freeOrderApplyIds")
    private java.util.List < Long > freeOrderApplyIds;

    @Body
    @NameInMap("orderIds")
    private java.util.List < Long > orderIds;

    @Body
    @NameInMap("pageNum")
    private Integer pageNum;

    @Body
    @NameInMap("pageSize")
    private Integer pageSize;

    @Body
    @NameInMap("statusList")
    private java.util.List < String > statusList;

    private ListYunQiTaskByUidRequest(Builder builder) {
        super(builder);
        this.createTimeEnd = builder.createTimeEnd;
        this.createTimeStart = builder.createTimeStart;
        this.freeOrderApplyCodes = builder.freeOrderApplyCodes;
        this.freeOrderApplyIds = builder.freeOrderApplyIds;
        this.orderIds = builder.orderIds;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.statusList = builder.statusList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListYunQiTaskByUidRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTimeEnd
     */
    public Long getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    /**
     * @return createTimeStart
     */
    public Long getCreateTimeStart() {
        return this.createTimeStart;
    }

    /**
     * @return freeOrderApplyCodes
     */
    public java.util.List < String > getFreeOrderApplyCodes() {
        return this.freeOrderApplyCodes;
    }

    /**
     * @return freeOrderApplyIds
     */
    public java.util.List < Long > getFreeOrderApplyIds() {
        return this.freeOrderApplyIds;
    }

    /**
     * @return orderIds
     */
    public java.util.List < Long > getOrderIds() {
        return this.orderIds;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return statusList
     */
    public java.util.List < String > getStatusList() {
        return this.statusList;
    }

    public static final class Builder extends Request.Builder<ListYunQiTaskByUidRequest, Builder> {
        private Long createTimeEnd; 
        private Long createTimeStart; 
        private java.util.List < String > freeOrderApplyCodes; 
        private java.util.List < Long > freeOrderApplyIds; 
        private java.util.List < Long > orderIds; 
        private Integer pageNum; 
        private Integer pageSize; 
        private java.util.List < String > statusList; 

        private Builder() {
            super();
        } 

        private Builder(ListYunQiTaskByUidRequest request) {
            super(request);
            this.createTimeEnd = request.createTimeEnd;
            this.createTimeStart = request.createTimeStart;
            this.freeOrderApplyCodes = request.freeOrderApplyCodes;
            this.freeOrderApplyIds = request.freeOrderApplyIds;
            this.orderIds = request.orderIds;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.statusList = request.statusList;
        } 

        /**
         * createTimeEnd.
         */
        public Builder createTimeEnd(Long createTimeEnd) {
            this.putBodyParameter("createTimeEnd", createTimeEnd);
            this.createTimeEnd = createTimeEnd;
            return this;
        }

        /**
         * createTimeStart.
         */
        public Builder createTimeStart(Long createTimeStart) {
            this.putBodyParameter("createTimeStart", createTimeStart);
            this.createTimeStart = createTimeStart;
            return this;
        }

        /**
         * freeOrderApplyCodes.
         */
        public Builder freeOrderApplyCodes(java.util.List < String > freeOrderApplyCodes) {
            this.putBodyParameter("freeOrderApplyCodes", freeOrderApplyCodes);
            this.freeOrderApplyCodes = freeOrderApplyCodes;
            return this;
        }

        /**
         * freeOrderApplyIds.
         */
        public Builder freeOrderApplyIds(java.util.List < Long > freeOrderApplyIds) {
            this.putBodyParameter("freeOrderApplyIds", freeOrderApplyIds);
            this.freeOrderApplyIds = freeOrderApplyIds;
            return this;
        }

        /**
         * orderIds.
         */
        public Builder orderIds(java.util.List < Long > orderIds) {
            this.putBodyParameter("orderIds", orderIds);
            this.orderIds = orderIds;
            return this;
        }

        /**
         * pageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putBodyParameter("pageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * statusList.
         */
        public Builder statusList(java.util.List < String > statusList) {
            this.putBodyParameter("statusList", statusList);
            this.statusList = statusList;
            return this;
        }

        @Override
        public ListYunQiTaskByUidRequest build() {
            return new ListYunQiTaskByUidRequest(this);
        } 

    } 

}
