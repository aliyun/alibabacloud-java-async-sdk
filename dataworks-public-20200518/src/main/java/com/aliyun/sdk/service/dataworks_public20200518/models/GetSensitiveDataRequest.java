// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSensitiveDataRequest} extends {@link RequestModel}
 *
 * <p>GetSensitiveDataRequest</p>
 */
public class GetSensitiveDataRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("PageNo")
    @Validation(required = true, maximum = 1000, minimum = 1)
    private Integer pageNo;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 1000, minimum = 1)
    private Integer pageSize;

    private GetSensitiveDataRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.name = builder.name;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSensitiveDataRequest create() {
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

    public static final class Builder extends Request.Builder<GetSensitiveDataRequest, Builder> {
        private String regionId; 
        private String name; 
        private Integer pageNo; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(GetSensitiveDataRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.name = request.name;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
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
         * The number of the page to return. Minimum value:1.
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

        @Override
        public GetSensitiveDataRequest build() {
            return new GetSensitiveDataRequest(this);
        } 

    } 

}
