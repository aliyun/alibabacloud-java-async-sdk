// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOverviewRequest} extends {@link RequestModel}
 *
 * <p>GetOverviewRequest</p>
 */
public class GetOverviewRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("MseSessionId")
    private String mseSessionId;

    @Query
    @NameInMap("Period")
    private Integer period;

    @Query
    @NameInMap("Region")
    private String region;

    private GetOverviewRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.mseSessionId = builder.mseSessionId;
        this.period = builder.period;
        this.region = builder.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOverviewRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return mseSessionId
     */
    public String getMseSessionId() {
        return this.mseSessionId;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    public static final class Builder extends Request.Builder<GetOverviewRequest, Builder> {
        private String acceptLanguage; 
        private String mseSessionId; 
        private Integer period; 
        private String region; 

        private Builder() {
            super();
        } 

        private Builder(GetOverviewRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.mseSessionId = request.mseSessionId;
            this.period = request.period;
            this.region = request.region;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * MseSessionId.
         */
        public Builder mseSessionId(String mseSessionId) {
            this.putQueryParameter("MseSessionId", mseSessionId);
            this.mseSessionId = mseSessionId;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        @Override
        public GetOverviewRequest build() {
            return new GetOverviewRequest(this);
        } 

    } 

}
