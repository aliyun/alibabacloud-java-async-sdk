// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDPUtilizationDetailRequest} extends {@link RequestModel}
 *
 * <p>QueryDPUtilizationDetailRequest</p>
 */
public class QueryDPUtilizationDetailRequest extends Request {
    @Query
    @NameInMap("CommodityCode")
    private String commodityCode;

    @Query
    @NameInMap("DeductedInstanceId")
    private String deductedInstanceId;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("IncludeShare")
    @Validation(required = true)
    private Boolean includeShare;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("InstanceSpec")
    private String instanceSpec;

    @Query
    @NameInMap("LastToken")
    private String lastToken;

    @Query
    @NameInMap("Limit")
    private Integer limit;

    @Query
    @NameInMap("ProdCode")
    private String prodCode;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    private QueryDPUtilizationDetailRequest(Builder builder) {
        super(builder);
        this.commodityCode = builder.commodityCode;
        this.deductedInstanceId = builder.deductedInstanceId;
        this.endTime = builder.endTime;
        this.includeShare = builder.includeShare;
        this.instanceId = builder.instanceId;
        this.instanceSpec = builder.instanceSpec;
        this.lastToken = builder.lastToken;
        this.limit = builder.limit;
        this.prodCode = builder.prodCode;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDPUtilizationDetailRequest create() {
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
     * @return deductedInstanceId
     */
    public String getDeductedInstanceId() {
        return this.deductedInstanceId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return includeShare
     */
    public Boolean getIncludeShare() {
        return this.includeShare;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceSpec
     */
    public String getInstanceSpec() {
        return this.instanceSpec;
    }

    /**
     * @return lastToken
     */
    public String getLastToken() {
        return this.lastToken;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return prodCode
     */
    public String getProdCode() {
        return this.prodCode;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<QueryDPUtilizationDetailRequest, Builder> {
        private String commodityCode; 
        private String deductedInstanceId; 
        private String endTime; 
        private Boolean includeShare; 
        private String instanceId; 
        private String instanceSpec; 
        private String lastToken; 
        private Integer limit; 
        private String prodCode; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(QueryDPUtilizationDetailRequest response) {
            super(response);
            this.commodityCode = response.commodityCode;
            this.deductedInstanceId = response.deductedInstanceId;
            this.endTime = response.endTime;
            this.includeShare = response.includeShare;
            this.instanceId = response.instanceId;
            this.instanceSpec = response.instanceSpec;
            this.lastToken = response.lastToken;
            this.limit = response.limit;
            this.prodCode = response.prodCode;
            this.startTime = response.startTime;
        } 

        /**
         * CommodityCode.
         */
        public Builder commodityCode(String commodityCode) {
            this.putQueryParameter("CommodityCode", commodityCode);
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * DeductedInstanceId.
         */
        public Builder deductedInstanceId(String deductedInstanceId) {
            this.putQueryParameter("DeductedInstanceId", deductedInstanceId);
            this.deductedInstanceId = deductedInstanceId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * IncludeShare.
         */
        public Builder includeShare(Boolean includeShare) {
            this.putQueryParameter("IncludeShare", includeShare);
            this.includeShare = includeShare;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * InstanceSpec.
         */
        public Builder instanceSpec(String instanceSpec) {
            this.putQueryParameter("InstanceSpec", instanceSpec);
            this.instanceSpec = instanceSpec;
            return this;
        }

        /**
         * LastToken.
         */
        public Builder lastToken(String lastToken) {
            this.putQueryParameter("LastToken", lastToken);
            this.lastToken = lastToken;
            return this;
        }

        /**
         * Limit.
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * ProdCode.
         */
        public Builder prodCode(String prodCode) {
            this.putQueryParameter("ProdCode", prodCode);
            this.prodCode = prodCode;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public QueryDPUtilizationDetailRequest build() {
            return new QueryDPUtilizationDetailRequest(this);
        } 

    } 

}
