// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qssj20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTrendWordAndIndexRequest} extends {@link RequestModel}
 *
 * <p>GetTrendWordAndIndexRequest</p>
 */
public class GetTrendWordAndIndexRequest extends Request {
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

    private GetTrendWordAndIndexRequest(Builder builder) {
        super(builder);
        this.cateIds = builder.cateIds;
        this.endingDate = builder.endingDate;
        this.pageIndex = builder.pageIndex;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTrendWordAndIndexRequest create() {
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

    public static final class Builder extends Request.Builder<GetTrendWordAndIndexRequest, Builder> {
        private String cateIds; 
        private String endingDate; 
        private Long pageIndex; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(GetTrendWordAndIndexRequest request) {
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
        public GetTrendWordAndIndexRequest build() {
            return new GetTrendWordAndIndexRequest(this);
        } 

    } 

}
