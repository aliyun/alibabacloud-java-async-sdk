// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetOverviewRequest} extends {@link RequestModel}
 *
 * <p>GetOverviewRequest</p>
 */
public class GetOverviewRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    private GetOverviewRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
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
        private Integer period; 
        private String region; 

        private Builder() {
            super();
        } 

        private Builder(GetOverviewRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.period = request.period;
            this.region = request.region;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The query time. Unit: days. For example, if you set this parameter to 30, the governance rules within the last 30 days are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
