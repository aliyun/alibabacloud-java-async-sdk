// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safe20220117.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryBlockEventRequest} extends {@link RequestModel}
 *
 * <p>QueryBlockEventRequest</p>
 */
public class QueryBlockEventRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuthKey")
    private String authKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuthSign")
    private String authSign;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BgSystemName")
    private String bgSystemName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BlockHarm")
    private String blockHarm;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeptNo")
    private String deptNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Limit")
    private Integer limit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NeedRule")
    private Boolean needRule;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Page")
    private Integer page;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductCodes")
    private java.util.List<String> productCodes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionReqs")
    private java.util.List<RegionReqs> regionReqs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReqTimestamp")
    private Long reqTimestamp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scope")
    private java.util.List<String> scope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    private QueryBlockEventRequest(Builder builder) {
        super(builder);
        this.authKey = builder.authKey;
        this.authSign = builder.authSign;
        this.bgSystemName = builder.bgSystemName;
        this.blockHarm = builder.blockHarm;
        this.category = builder.category;
        this.deptNo = builder.deptNo;
        this.endTime = builder.endTime;
        this.limit = builder.limit;
        this.needRule = builder.needRule;
        this.page = builder.page;
        this.productCodes = builder.productCodes;
        this.regionReqs = builder.regionReqs;
        this.reqTimestamp = builder.reqTimestamp;
        this.scope = builder.scope;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryBlockEventRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authKey
     */
    public String getAuthKey() {
        return this.authKey;
    }

    /**
     * @return authSign
     */
    public String getAuthSign() {
        return this.authSign;
    }

    /**
     * @return bgSystemName
     */
    public String getBgSystemName() {
        return this.bgSystemName;
    }

    /**
     * @return blockHarm
     */
    public String getBlockHarm() {
        return this.blockHarm;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return deptNo
     */
    public String getDeptNo() {
        return this.deptNo;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return needRule
     */
    public Boolean getNeedRule() {
        return this.needRule;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return productCodes
     */
    public java.util.List<String> getProductCodes() {
        return this.productCodes;
    }

    /**
     * @return regionReqs
     */
    public java.util.List<RegionReqs> getRegionReqs() {
        return this.regionReqs;
    }

    /**
     * @return reqTimestamp
     */
    public Long getReqTimestamp() {
        return this.reqTimestamp;
    }

    /**
     * @return scope
     */
    public java.util.List<String> getScope() {
        return this.scope;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<QueryBlockEventRequest, Builder> {
        private String authKey; 
        private String authSign; 
        private String bgSystemName; 
        private String blockHarm; 
        private String category; 
        private String deptNo; 
        private Long endTime; 
        private Integer limit; 
        private Boolean needRule; 
        private Integer page; 
        private java.util.List<String> productCodes; 
        private java.util.List<RegionReqs> regionReqs; 
        private Long reqTimestamp; 
        private java.util.List<String> scope; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(QueryBlockEventRequest request) {
            super(request);
            this.authKey = request.authKey;
            this.authSign = request.authSign;
            this.bgSystemName = request.bgSystemName;
            this.blockHarm = request.blockHarm;
            this.category = request.category;
            this.deptNo = request.deptNo;
            this.endTime = request.endTime;
            this.limit = request.limit;
            this.needRule = request.needRule;
            this.page = request.page;
            this.productCodes = request.productCodes;
            this.regionReqs = request.regionReqs;
            this.reqTimestamp = request.reqTimestamp;
            this.scope = request.scope;
            this.startTime = request.startTime;
        } 

        /**
         * AuthKey.
         */
        public Builder authKey(String authKey) {
            this.putBodyParameter("AuthKey", authKey);
            this.authKey = authKey;
            return this;
        }

        /**
         * AuthSign.
         */
        public Builder authSign(String authSign) {
            this.putBodyParameter("AuthSign", authSign);
            this.authSign = authSign;
            return this;
        }

        /**
         * BgSystemName.
         */
        public Builder bgSystemName(String bgSystemName) {
            this.putBodyParameter("BgSystemName", bgSystemName);
            this.bgSystemName = bgSystemName;
            return this;
        }

        /**
         * BlockHarm.
         */
        public Builder blockHarm(String blockHarm) {
            this.putBodyParameter("BlockHarm", blockHarm);
            this.blockHarm = blockHarm;
            return this;
        }

        /**
         * Category.
         */
        public Builder category(String category) {
            this.putBodyParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * DeptNo.
         */
        public Builder deptNo(String deptNo) {
            this.putBodyParameter("DeptNo", deptNo);
            this.deptNo = deptNo;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Limit.
         */
        public Builder limit(Integer limit) {
            this.putBodyParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * NeedRule.
         */
        public Builder needRule(Boolean needRule) {
            this.putBodyParameter("NeedRule", needRule);
            this.needRule = needRule;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(Integer page) {
            this.putBodyParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * ProductCodes.
         */
        public Builder productCodes(java.util.List<String> productCodes) {
            this.putBodyParameter("ProductCodes", productCodes);
            this.productCodes = productCodes;
            return this;
        }

        /**
         * RegionReqs.
         */
        public Builder regionReqs(java.util.List<RegionReqs> regionReqs) {
            this.putBodyParameter("RegionReqs", regionReqs);
            this.regionReqs = regionReqs;
            return this;
        }

        /**
         * ReqTimestamp.
         */
        public Builder reqTimestamp(Long reqTimestamp) {
            this.putBodyParameter("ReqTimestamp", reqTimestamp);
            this.reqTimestamp = reqTimestamp;
            return this;
        }

        /**
         * Scope.
         */
        public Builder scope(java.util.List<String> scope) {
            this.putQueryParameter("Scope", scope);
            this.scope = scope;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public QueryBlockEventRequest build() {
            return new QueryBlockEventRequest(this);
        } 

    } 

    /**
     * 
     * {@link QueryBlockEventRequest} extends {@link TeaModel}
     *
     * <p>QueryBlockEventRequest</p>
     */
    public static class RegionReqs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("Regions")
        private java.util.List<String> regions;

        private RegionReqs(Builder builder) {
            this.productCode = builder.productCode;
            this.regions = builder.regions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegionReqs create() {
            return builder().build();
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return regions
         */
        public java.util.List<String> getRegions() {
            return this.regions;
        }

        public static final class Builder {
            private String productCode; 
            private java.util.List<String> regions; 

            private Builder() {
            } 

            private Builder(RegionReqs model) {
                this.productCode = model.productCode;
                this.regions = model.regions;
            } 

            /**
             * ProductCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * Regions.
             */
            public Builder regions(java.util.List<String> regions) {
                this.regions = regions;
                return this;
            }

            public RegionReqs build() {
                return new RegionReqs(this);
            } 

        } 

    }
}
