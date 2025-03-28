// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link GetOpSensitiveDataRequest} extends {@link RequestModel}
 *
 * <p>GetOpSensitiveDataRequest</p>
 */
public class GetOpSensitiveDataRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Date")
    @com.aliyun.core.annotation.Validation(required = true)
    private String date;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpType")
    private String opType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 1000, minimum = 1)
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 1000, minimum = 1)
    private Integer pageSize;

    private GetOpSensitiveDataRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.date = builder.date;
        this.name = builder.name;
        this.opType = builder.opType;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOpSensitiveDataRequest create() {
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
     * @return opType
     */
    public String getOpType() {
        return this.opType;
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

    public static final class Builder extends Request.Builder<GetOpSensitiveDataRequest, Builder> {
        private String regionId; 
        private String date; 
        private String name; 
        private String opType; 
        private Integer pageNo; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(GetOpSensitiveDataRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.date = request.date;
            this.name = request.name;
            this.opType = request.opType;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The date on which access records were generated. Specify the value in the yyyyMMdd format.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20210116</p>
         */
        public Builder date(String date) {
            this.putQueryParameter("Date", date);
            this.date = date;
            return this;
        }

        /**
         * <p>The parameters that you can configure to query the access records. Valid values:</p>
         * <ul>
         * <li>dbType</li>
         * <li>instanceName</li>
         * <li>databaseName</li>
         * <li>projectName</li>
         * <li>clusterName</li>
         * </ul>
         * <p>The following example shows the parameters configured to query the access records of the sensitive data in the abc database of the Hologres instance ABC: [ {&quot;dbType&quot;:&quot;hologres&quot;,&quot;instanceName&quot;:&quot;ABC&quot;,&quot;databaseName&quot;:&quot;abc&quot;} ]</p>
         * <p>You must configure the parameters based on the compute engine that you use in your business.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[  {&quot;dbType&quot;:&quot;hologres&quot;,&quot;instanceName&quot;:&quot;ABC&quot;,&quot;databaseName&quot;:&quot;abc&quot;},  {&quot;dbType&quot;:&quot;ODPS.ODPS&quot;,&quot;projectName&quot;:&quot;adbc&quot;}  ]</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The operation that is performed on the data. Valid values:</p>
         * <ul>
         * <li>SQL_SELECT: specifies the data access operation. For example, execute a SELECT statement to query data.</li>
         * <li>TUNNEL_DOWNLOAD: specifies the data download operation. For example, run a Tunnel command to download data.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SQL_SELECT</p>
         */
        public Builder opType(String opType) {
            this.putQueryParameter("OpType", opType);
            this.opType = opType;
            return this;
        }

        /**
         * <p>The page number. Valid values: 1 to 1000.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page. Minimum value: 1. Maximum value: 1000.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public GetOpSensitiveDataRequest build() {
            return new GetOpSensitiveDataRequest(this);
        } 

    } 

}
