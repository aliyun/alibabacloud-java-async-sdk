// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDohUserInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeDohUserInfoRequest</p>
 */
public class DescribeDohUserInfoRequest extends Request {
    @Query
    @NameInMap("EndDate")
    private String endDate;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("StartDate")
    private String startDate;

    private DescribeDohUserInfoRequest(Builder builder) {
        super(builder);
        this.endDate = builder.endDate;
        this.lang = builder.lang;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDohUserInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<DescribeDohUserInfoRequest, Builder> {
        private String endDate; 
        private String lang; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDohUserInfoRequest response) {
            super(response);
            this.endDate = response.endDate;
            this.lang = response.lang;
            this.startDate = response.startDate;
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
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
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
        public DescribeDohUserInfoRequest build() {
            return new DescribeDohUserInfoRequest(this);
        } 

    } 

}
