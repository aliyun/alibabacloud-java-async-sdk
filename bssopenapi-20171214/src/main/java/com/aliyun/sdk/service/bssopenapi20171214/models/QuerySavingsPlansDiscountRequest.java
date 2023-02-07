// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySavingsPlansDiscountRequest} extends {@link RequestModel}
 *
 * <p>QuerySavingsPlansDiscountRequest</p>
 */
public class QuerySavingsPlansDiscountRequest extends Request {
    @Query
    @NameInMap("CommodityCode")
    @Validation(required = true)
    private String commodityCode;

    @Query
    @NameInMap("Cycle")
    @Validation(required = true)
    private String cycle;

    @Query
    @NameInMap("Locale")
    private String locale;

    @Query
    @NameInMap("ModuleCode")
    private String moduleCode;

    @Query
    @NameInMap("PageNum")
    private Integer pageNum;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("PayMode")
    @Validation(required = true)
    private String payMode;

    @Query
    @NameInMap("Region")
    private String region;

    @Query
    @NameInMap("Spec")
    private String spec;

    @Query
    @NameInMap("SpnType")
    @Validation(required = true)
    private String spnType;

    private QuerySavingsPlansDiscountRequest(Builder builder) {
        super(builder);
        this.commodityCode = builder.commodityCode;
        this.cycle = builder.cycle;
        this.locale = builder.locale;
        this.moduleCode = builder.moduleCode;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.payMode = builder.payMode;
        this.region = builder.region;
        this.spec = builder.spec;
        this.spnType = builder.spnType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySavingsPlansDiscountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return commodityCode
     */
    public String getCommodityCode() {
        return this.commodityCode;
    }

    /**
     * @return cycle
     */
    public String getCycle() {
        return this.cycle;
    }

    /**
     * @return locale
     */
    public String getLocale() {
        return this.locale;
    }

    /**
     * @return moduleCode
     */
    public String getModuleCode() {
        return this.moduleCode;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return payMode
     */
    public String getPayMode() {
        return this.payMode;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return spec
     */
    public String getSpec() {
        return this.spec;
    }

    /**
     * @return spnType
     */
    public String getSpnType() {
        return this.spnType;
    }

    public static final class Builder extends Request.Builder<QuerySavingsPlansDiscountRequest, Builder> {
        private String commodityCode; 
        private String cycle; 
        private String locale; 
        private String moduleCode; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String payMode; 
        private String region; 
        private String spec; 
        private String spnType; 

        private Builder() {
            super();
        } 

        private Builder(QuerySavingsPlansDiscountRequest request) {
            super(request);
            this.commodityCode = request.commodityCode;
            this.cycle = request.cycle;
            this.locale = request.locale;
            this.moduleCode = request.moduleCode;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.payMode = request.payMode;
            this.region = request.region;
            this.spec = request.spec;
            this.spnType = request.spnType;
        } 

        /**
         * commodityCode
         */
        public Builder commodityCode(String commodityCode) {
            this.putQueryParameter("CommodityCode", commodityCode);
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * cycle
         */
        public Builder cycle(String cycle) {
            this.putQueryParameter("Cycle", cycle);
            this.cycle = cycle;
            return this;
        }

        /**
         * locale
         */
        public Builder locale(String locale) {
            this.putQueryParameter("Locale", locale);
            this.locale = locale;
            return this;
        }

        /**
         * moduleCode
         */
        public Builder moduleCode(String moduleCode) {
            this.putQueryParameter("ModuleCode", moduleCode);
            this.moduleCode = moduleCode;
            return this;
        }

        /**
         * pageNum
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * pageSize
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * payMode
         */
        public Builder payMode(String payMode) {
            this.putQueryParameter("PayMode", payMode);
            this.payMode = payMode;
            return this;
        }

        /**
         * region
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * spec
         */
        public Builder spec(String spec) {
            this.putQueryParameter("Spec", spec);
            this.spec = spec;
            return this;
        }

        /**
         * spnType
         */
        public Builder spnType(String spnType) {
            this.putQueryParameter("SpnType", spnType);
            this.spnType = spnType;
            return this;
        }

        @Override
        public QuerySavingsPlansDiscountRequest build() {
            return new QuerySavingsPlansDiscountRequest(this);
        } 

    } 

}
