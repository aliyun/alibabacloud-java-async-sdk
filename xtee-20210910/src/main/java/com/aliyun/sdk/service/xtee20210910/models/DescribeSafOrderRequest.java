// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSafOrderRequest} extends {@link RequestModel}
 *
 * <p>DescribeSafOrderRequest</p>
 */
public class DescribeSafOrderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("currentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endDate")
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("exactProductCode")
    private String exactProductCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startDate")
    private String startDate;

    private DescribeSafOrderRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.currentPage = builder.currentPage;
        this.endDate = builder.endDate;
        this.exactProductCode = builder.exactProductCode;
        this.pageSize = builder.pageSize;
        this.regId = builder.regId;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSafOrderRequest create() {
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
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return exactProductCode
     */
    public String getExactProductCode() {
        return this.exactProductCode;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<DescribeSafOrderRequest, Builder> {
        private String lang; 
        private Integer currentPage; 
        private String endDate; 
        private String exactProductCode; 
        private Integer pageSize; 
        private String regId; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSafOrderRequest request) {
            super(request);
            this.lang = request.lang;
            this.currentPage = request.currentPage;
            this.endDate = request.endDate;
            this.exactProductCode = request.exactProductCode;
            this.pageSize = request.pageSize;
            this.regId = request.regId;
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
        public Builder currentPage(Integer currentPage) {
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
         * exactProductCode.
         */
        public Builder exactProductCode(String exactProductCode) {
            this.putQueryParameter("exactProductCode", exactProductCode);
            this.exactProductCode = exactProductCode;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
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
         * startDate.
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("startDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public DescribeSafOrderRequest build() {
            return new DescribeSafOrderRequest(this);
        } 

    } 

}
