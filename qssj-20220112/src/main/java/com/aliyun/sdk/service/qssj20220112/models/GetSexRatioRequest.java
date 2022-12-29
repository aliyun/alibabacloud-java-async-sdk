// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qssj20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSexRatioRequest} extends {@link RequestModel}
 *
 * <p>GetSexRatioRequest</p>
 */
public class GetSexRatioRequest extends Request {
    @Query
    @NameInMap("CateIds")
    @Validation(required = true)
    private String cateIds;

    @Query
    @NameInMap("EndingDate")
    private String endingDate;

    @Query
    @NameInMap("StartDate")
    private String startDate;

    private GetSexRatioRequest(Builder builder) {
        super(builder);
        this.cateIds = builder.cateIds;
        this.endingDate = builder.endingDate;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSexRatioRequest create() {
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
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<GetSexRatioRequest, Builder> {
        private String cateIds; 
        private String endingDate; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(GetSexRatioRequest request) {
            super(request);
            this.cateIds = request.cateIds;
            this.endingDate = request.endingDate;
            this.startDate = request.startDate;
        } 

        /**
         * CateIds.
         */
        public Builder cateIds(String cateIds) {
            this.putQueryParameter("CateIds", cateIds);
            this.cateIds = cateIds;
            return this;
        }

        /**
         * EndingDate.
         */
        public Builder endingDate(String endingDate) {
            this.putQueryParameter("EndingDate", endingDate);
            this.endingDate = endingDate;
            return this;
        }

        /**
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public GetSexRatioRequest build() {
            return new GetSexRatioRequest(this);
        } 

    } 

}
