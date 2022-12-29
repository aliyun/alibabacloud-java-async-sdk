// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qssj20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCrowdDataRequest} extends {@link RequestModel}
 *
 * <p>GetCrowdDataRequest</p>
 */
public class GetCrowdDataRequest extends Request {
    @Body
    @NameInMap("CateIds")
    @Validation(required = true)
    private String cateIds;

    @Body
    @NameInMap("EndingDate")
    private String endingDate;

    @Body
    @NameInMap("PageIndex")
    private Long pageIndex;

    @Body
    @NameInMap("StartDate")
    private String startDate;

    private GetCrowdDataRequest(Builder builder) {
        super(builder);
        this.cateIds = builder.cateIds;
        this.endingDate = builder.endingDate;
        this.pageIndex = builder.pageIndex;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCrowdDataRequest create() {
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
     * @return endingDate
     */
    public String getEndingDate() {
        return this.endingDate;
    }

    /**
     * @return pageIndex
     */
    public Long getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<GetCrowdDataRequest, Builder> {
        private String cateIds; 
        private String endingDate; 
        private Long pageIndex; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(GetCrowdDataRequest request) {
            super(request);
            this.cateIds = request.cateIds;
            this.endingDate = request.endingDate;
            this.pageIndex = request.pageIndex;
            this.startDate = request.startDate;
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
         * EndingDate.
         */
        public Builder endingDate(String endingDate) {
            this.putBodyParameter("EndingDate", endingDate);
            this.endingDate = endingDate;
            return this;
        }

        /**
         * PageIndex.
         */
        public Builder pageIndex(Long pageIndex) {
            this.putBodyParameter("PageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.putBodyParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public GetCrowdDataRequest build() {
            return new GetCrowdDataRequest(this);
        } 

    } 

}
