// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.customerservice20231228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEnterpriseSupportPlanSimpleRequest} extends {@link RequestModel}
 *
 * <p>ListEnterpriseSupportPlanSimpleRequest</p>
 */
public class ListEnterpriseSupportPlanSimpleRequest extends Request {
    @Body
    @NameInMap("pageNum")
    private Integer pageNum;

    @Body
    @NameInMap("pageSize")
    private Integer pageSize;

    private ListEnterpriseSupportPlanSimpleRequest(Builder builder) {
        super(builder);
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEnterpriseSupportPlanSimpleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<ListEnterpriseSupportPlanSimpleRequest, Builder> {
        private Integer pageNum; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListEnterpriseSupportPlanSimpleRequest request) {
            super(request);
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
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

        @Override
        public ListEnterpriseSupportPlanSimpleRequest build() {
            return new ListEnterpriseSupportPlanSimpleRequest(this);
        } 

    } 

}
