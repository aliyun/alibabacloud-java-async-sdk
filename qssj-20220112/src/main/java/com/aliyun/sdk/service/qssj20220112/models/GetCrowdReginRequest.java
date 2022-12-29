// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qssj20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCrowdReginRequest} extends {@link RequestModel}
 *
 * <p>GetCrowdReginRequest</p>
 */
public class GetCrowdReginRequest extends Request {
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

    private GetCrowdReginRequest(Builder builder) {
        super(builder);
        this.cateIds = builder.cateIds;
        this.endingDate = builder.endingDate;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCrowdReginRequest create() {
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

    public static final class Builder extends Request.Builder<GetCrowdReginRequest, Builder> {
        private String cateIds; 
        private String endingDate; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(GetCrowdReginRequest request) {
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
        public GetCrowdReginRequest build() {
            return new GetCrowdReginRequest(this);
        } 

    } 

}
