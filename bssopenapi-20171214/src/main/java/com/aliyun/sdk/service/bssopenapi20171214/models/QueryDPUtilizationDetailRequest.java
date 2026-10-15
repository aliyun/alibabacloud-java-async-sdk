// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

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
 * {@link QueryDPUtilizationDetailRequest} extends {@link RequestModel}
 *
 * <p>QueryDPUtilizationDetailRequest</p>
 */
public class QueryDPUtilizationDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommodityCode")
    private String commodityCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeductedInstanceId")
    private String deductedInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeShare")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean includeShare;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceSpec")
    private String instanceSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LastToken")
    private String lastToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    private Integer limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProdCode")
    private String prodCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(QueryDPUtilizationDetailRequest request) {
            super(request);
            this.commodityCode = request.commodityCode;
            this.deductedInstanceId = request.deductedInstanceId;
            this.endTime = request.endTime;
            this.includeShare = request.includeShare;
            this.instanceId = request.instanceId;
            this.instanceSpec = request.instanceSpec;
            this.lastToken = request.lastToken;
            this.limit = request.limit;
            this.prodCode = request.prodCode;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The commodity code, such as ecsRi and scu_bag. If this parameter is specified, the ProdCode parameter does not take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>ecsRi</p>
         */
        public Builder commodityCode(String commodityCode) {
            this.putQueryParameter("CommodityCode", commodityCode);
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * <p>The ID of the deducted instance. If this parameter is left empty, the details of all instances are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-123123</p>
         */
        public Builder deductedInstanceId(String deductedInstanceId) {
            this.putQueryParameter("DeductedInstanceId", deductedInstanceId);
            this.deductedInstanceId = deductedInstanceId;
            return this;
        }

        /**
         * <p>The end time. Format: YYYY-MM-dd HH:mm:ss.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-05-23 12:00:00</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Specifies whether to include the resource plan usage of member accounts in finance trusteeship. Valid values:</p>
         * <ul>
         * <li>true: Included.</li>
         * <li>false: Not included.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder includeShare(Boolean includeShare) {
            this.putQueryParameter("IncludeShare", includeShare);
            this.includeShare = includeShare;
            return this;
        }

        /**
         * <p>The instance ID for the filtered query. If this parameter is left empty, the details of all used instances are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-123123</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>Instancetyp</p>
         */
        public Builder instanceSpec(String instanceSpec) {
            this.putQueryParameter("InstanceSpec", instanceSpec);
            this.instanceSpec = instanceSpec;
            return this;
        }

        /**
         * <p>The token that specifies the start position of the query. Set this parameter to null for the first query. For subsequent queries, use the NextToken value returned in the previous response.</p>
         * 
         * <strong>example:</strong>
         * <p>CAESF***zNTAw</p>
         */
        public Builder lastToken(String lastToken) {
            this.putQueryParameter("LastToken", lastToken);
            this.lastToken = lastToken;
            return this;
        }

        /**
         * <p>The number of entries to return per query. Default value: 20. Maximum value: 300.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>The product code, such as ecs.</p>
         * 
         * <strong>example:</strong>
         * <p>oss</p>
         */
        public Builder prodCode(String prodCode) {
            this.putQueryParameter("ProdCode", prodCode);
            this.prodCode = prodCode;
            return this;
        }

        /**
         * <p>The start time. Format: YYYY-MM-dd HH:mm:ss.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-05-23 12:00:00</p>
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
