// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGroupTrendRequest} extends {@link RequestModel}
 *
 * <p>DescribeGroupTrendRequest</p>
 */
public class DescribeGroupTrendRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("day")
    private String day;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    private DescribeGroupTrendRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.day = builder.day;
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGroupTrendRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return day
     */
    public String getDay() {
        return this.day;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    public static final class Builder extends Request.Builder<DescribeGroupTrendRequest, Builder> {
        private String lang; 
        private String day; 
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGroupTrendRequest request) {
            super(request);
            this.lang = request.lang;
            this.day = request.day;
            this.regId = request.regId;
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
         * day.
         */
        public Builder day(String day) {
            this.putQueryParameter("day", day);
            this.day = day;
            return this;
        }

        /**
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        @Override
        public DescribeGroupTrendRequest build() {
            return new DescribeGroupTrendRequest(this);
        } 

    } 

}
