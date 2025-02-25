// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHistoryStatsRequest} extends {@link RequestModel}
 *
 * <p>GetHistoryStatsRequest</p>
 */
public class GetHistoryStatsRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("EndDate")
    private String endDate;

    @Query
    @NameInMap("Source")
    private String source;

    @Query
    @NameInMap("StartDate")
    private String startDate;

    private GetHistoryStatsRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.endDate = builder.endDate;
        this.source = builder.source;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHistoryStatsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<GetHistoryStatsRequest, Builder> {
        private String appId; 
        private String endDate; 
        private String source; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(GetHistoryStatsRequest request) {
            super(request);
            this.appId = request.appId;
            this.endDate = request.endDate;
            this.source = request.source;
            this.startDate = request.startDate;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * EndDate.
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
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
        public GetHistoryStatsRequest build() {
            return new GetHistoryStatsRequest(this);
        } 

    } 

}
