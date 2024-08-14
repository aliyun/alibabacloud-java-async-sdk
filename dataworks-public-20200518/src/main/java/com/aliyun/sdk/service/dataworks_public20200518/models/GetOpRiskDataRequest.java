// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOpRiskDataRequest} extends {@link RequestModel}
 *
 * <p>GetOpRiskDataRequest</p>
 */
public class GetOpRiskDataRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Date")
    @com.aliyun.core.annotation.Validation(required = true)
    private String date;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 1000, minimum = 1)
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 1000, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskType")
    private String riskType;

    private GetOpRiskDataRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.date = builder.date;
        this.name = builder.name;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.riskType = builder.riskType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOpRiskDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return date
     */
    public String getDate() {
        return this.date;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return riskType
     */
    public String getRiskType() {
        return this.riskType;
    }

    public static final class Builder extends Request.Builder<GetOpRiskDataRequest, Builder> {
        private String regionId; 
        private String date; 
        private String name; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String riskType; 

        private Builder() {
            super();
        } 

        private Builder(GetOpRiskDataRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.date = request.date;
            this.name = request.name;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.riskType = request.riskType;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The date on which access records were generated. Specify the value in the yyyyMMdd format.
         */
        public Builder date(String date) {
            this.putQueryParameter("Date", date);
            this.date = date;
            return this;
        }

        /**
         * The parameters that you can configure to query the access records. Valid values:
         * <p>
         * 
         * *   dbType
         * *   instanceName
         * *   databaseName
         * *   projectName
         * *   clusterName
         * 
         * The following example shows the parameters configured to query the access records of the sensitive data in the abc database of the Hologres instance ABC: \[ {"dbType":"hologres","instanceName":"ABC","databaseName":"abc"} ]
         * 
         * You must configure the parameters based on the compute engine that you use in your business.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The page number. Pages start from 1.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * The number of entries per page. Maximum value: 1000.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The method that you use to identify risks. Valid values:
         * <p>
         * 
         * *   You can manually identify risks.
         * *   You can also use a sensitive data identification rule to identify risks. You can log on to the DataWorks console and go to the Risk Identification Rules page in Data Security Guard to obtain the name of the rule.
         */
        public Builder riskType(String riskType) {
            this.putQueryParameter("RiskType", riskType);
            this.riskType = riskType;
            return this;
        }

        @Override
        public GetOpRiskDataRequest build() {
            return new GetOpRiskDataRequest(this);
        } 

    } 

}
