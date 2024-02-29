// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOpRiskDataRequest} extends {@link RequestModel}
 *
 * <p>GetOpRiskDataRequest</p>
 */
public class GetOpRiskDataRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Date")
    @Validation(required = true)
    private String date;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("PageNo")
    @Validation(required = true, maximum = 1000, minimum = 1)
    private Integer pageNo;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 1000, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("RiskType")
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
         * The date on which the access records were queried. Specify the value in the yyyyMMdd format.
         */
        public Builder date(String date) {
            this.putQueryParameter("Date", date);
            this.date = date;
            return this;
        }

        /**
         * The parameters that you can specify to query the access records. Valid values:
         * <p>
         * 
         * *   dbType: the data type
         * *   instanceName: the name of the instance
         * *   databaseName: the name of the database
         * *   projectName: the name of the workspace
         * *   clusterName: the name of the cluster
         * 
         * The following example shows the parameters configured to query the access records of the sensitive data in the abc database of the ABC Hologres instance:
         * 
         * {"dbType":"hologres","instanceName":"ABC","databaseName":"abc"}
         * 
         * You must specify the parameters based on the compute engine that you use in your business.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The number of the page to return. Minimum value: 1.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * The number of entries to return on each page. Maximum value: 1000.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The method that you use to identify risks.
         * <p>
         * 
         * *   You can manually identify risks.
         * *   You can also use a risk rule to identify risks. You can go to the DataWorks console to obtain the name of the risk rule on the Custom Identification Rules page of Data Security Guard.
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
