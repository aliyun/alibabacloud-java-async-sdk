// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QuerySavingsPlansDiscountRequest} extends {@link RequestModel}
 *
 * <p>QuerySavingsPlansDiscountRequest</p>
 */
public class QuerySavingsPlansDiscountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommodityCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String commodityCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cycle")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cycle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Locale")
    private String locale;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModuleCode")
    private String moduleCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String payMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Spec")
    private String spec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpnCommodityCode")
    private String spnCommodityCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpnType")
    @com.aliyun.core.annotation.Validation(required = true)
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
        this.spnCommodityCode = builder.spnCommodityCode;
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
     * @return spnCommodityCode
     */
    public String getSpnCommodityCode() {
        return this.spnCommodityCode;
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
        private String spnCommodityCode; 
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
            this.spnCommodityCode = request.spnCommodityCode;
            this.spnType = request.spnType;
        } 

        /**
         * <p>The code of the service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder commodityCode(String commodityCode) {
            this.putQueryParameter("CommodityCode", commodityCode);
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * <p>The cycle based on which queries are performed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1:Year</p>
         */
        public Builder cycle(String cycle) {
            this.putQueryParameter("Cycle", cycle);
            this.cycle = cycle;
            return this;
        }

        /**
         * <p>The identifier of the language.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>EN: English.</li>
         * <li>ZH: Chinese.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ZH</p>
         */
        public Builder locale(String locale) {
            this.putQueryParameter("Locale", locale);
            this.locale = locale;
            return this;
        }

        /**
         * <p>The code of the pricing module.</p>
         * 
         * <strong>example:</strong>
         * <p>instance_type</p>
         */
        public Builder moduleCode(String moduleCode) {
            this.putQueryParameter("ModuleCode", moduleCode);
            this.moduleCode = moduleCode;
            return this;
        }

        /**
         * <p>The number of the page to return.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The payment mode. Valid values: total: all upfront. half: half upfront. zero: no upfront.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>total</p>
         */
        public Builder payMode(String payMode) {
            this.putQueryParameter("PayMode", payMode);
            this.payMode = payMode;
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

        /**
         * <p>The type of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.g6</p>
         */
        public Builder spec(String spec) {
            this.putQueryParameter("Spec", spec);
            this.spec = spec;
            return this;
        }

        /**
         * SpnCommodityCode.
         */
        public Builder spnCommodityCode(String spnCommodityCode) {
            this.putQueryParameter("SpnCommodityCode", spnCommodityCode);
            this.spnCommodityCode = spnCommodityCode;
            return this;
        }

        /**
         * <p>The type of the savings plan. Valid values: ecs: Elastic Compute Service (ECS) compute type. universal: general-purpose type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>universal</p>
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
