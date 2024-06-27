// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceConsumeRequest} extends {@link RequestModel}
 *
 * <p>DescribeServiceConsumeRequest</p>
 */
public class DescribeServiceConsumeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("currentPage")
    private String currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private String pageSize;

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

    private DescribeServiceConsumeRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.currentPage = builder.currentPage;
        this.endDate = builder.endDate;
        this.pageSize = builder.pageSize;
        this.regId = builder.regId;
        this.serviceCode = builder.serviceCode;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceConsumeRequest create() {
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
     * @return currentPage
     */
    public String getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
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

    public static final class Builder extends Request.Builder<DescribeServiceConsumeRequest, Builder> {
        private String lang; 
        private String currentPage; 
        private String endDate; 
        private String pageSize; 
        private String regId; 
        private String serviceCode; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(DescribeServiceConsumeRequest request) {
            super(request);
            this.lang = request.lang;
            this.currentPage = request.currentPage;
            this.endDate = request.endDate;
            this.pageSize = request.pageSize;
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
         * currentPage.
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("currentPage", currentPage);
            this.currentPage = currentPage;
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
         * pageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
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
        public DescribeServiceConsumeRequest build() {
            return new DescribeServiceConsumeRequest(this);
        } 

    } 

}
