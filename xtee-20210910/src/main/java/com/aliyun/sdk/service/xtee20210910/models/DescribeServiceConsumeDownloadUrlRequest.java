// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceConsumeDownloadUrlRequest} extends {@link RequestModel}
 *
 * <p>DescribeServiceConsumeDownloadUrlRequest</p>
 */
public class DescribeServiceConsumeDownloadUrlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("serviceCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startDate;

    private DescribeServiceConsumeDownloadUrlRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.endDate = builder.endDate;
        this.regId = builder.regId;
        this.serviceCode = builder.serviceCode;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceConsumeDownloadUrlRequest create() {
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
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return serviceCode
     */
    public String getServiceCode() {
        return this.serviceCode;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<DescribeServiceConsumeDownloadUrlRequest, Builder> {
        private String lang; 
        private String endDate; 
        private String regId; 
        private String serviceCode; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(DescribeServiceConsumeDownloadUrlRequest request) {
            super(request);
            this.lang = request.lang;
            this.endDate = request.endDate;
            this.regId = request.regId;
            this.serviceCode = request.serviceCode;
            this.startDate = request.startDate;
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
         * endDate.
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("endDate", endDate);
            this.endDate = endDate;
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

        /**
         * serviceCode.
         */
        public Builder serviceCode(String serviceCode) {
            this.putQueryParameter("serviceCode", serviceCode);
            this.serviceCode = serviceCode;
            return this;
        }

        /**
         * startDate.
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("startDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public DescribeServiceConsumeDownloadUrlRequest build() {
            return new DescribeServiceConsumeDownloadUrlRequest(this);
        } 

    } 

}
