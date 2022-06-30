// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qssj20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTrendIndexRequest} extends {@link RequestModel}
 *
 * <p>GetTrendIndexRequest</p>
 */
public class GetTrendIndexRequest extends Request {
    @Body
    @NameInMap("CateIds")
    @Validation(required = true)
    private String cateIds;

    @Body
    @NameInMap("MonthNum")
    private Integer monthNum;

    private GetTrendIndexRequest(Builder builder) {
        super(builder);
        this.cateIds = builder.cateIds;
        this.monthNum = builder.monthNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTrendIndexRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cateIds
     */
    public String getCateIds() {
        return this.cateIds;
    }

    /**
     * @return monthNum
     */
    public Integer getMonthNum() {
        return this.monthNum;
    }

    public static final class Builder extends Request.Builder<GetTrendIndexRequest, Builder> {
        private String cateIds; 
        private Integer monthNum; 

        private Builder() {
            super();
        } 

        private Builder(GetTrendIndexRequest request) {
            super(request);
            this.cateIds = request.cateIds;
            this.monthNum = request.monthNum;
        } 

        /**
         * CateIds.
         */
        public Builder cateIds(String cateIds) {
            this.putBodyParameter("CateIds", cateIds);
            this.cateIds = cateIds;
            return this;
        }

        /**
         * MonthNum.
         */
        public Builder monthNum(Integer monthNum) {
            this.putBodyParameter("MonthNum", monthNum);
            this.monthNum = monthNum;
            return this;
        }

        @Override
        public GetTrendIndexRequest build() {
            return new GetTrendIndexRequest(this);
        } 

    } 

}
