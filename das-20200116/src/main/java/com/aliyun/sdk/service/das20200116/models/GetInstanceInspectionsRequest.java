// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceInspectionsRequest} extends {@link RequestModel}
 *
 * <p>GetInstanceInspectionsRequest</p>
 */
public class GetInstanceInspectionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Engine")
    @com.aliyun.core.annotation.Validation(required = true)
    private String engine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceArea")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceArea;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchMap")
    private String searchMap;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    private GetInstanceInspectionsRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.engine = builder.engine;
        this.instanceArea = builder.instanceArea;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.resourceGroupId = builder.resourceGroupId;
        this.searchMap = builder.searchMap;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceInspectionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return instanceArea
     */
    public String getInstanceArea() {
        return this.instanceArea;
    }

    /**
     * @return pageNo
     */
    public String getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return searchMap
     */
    public String getSearchMap() {
        return this.searchMap;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<GetInstanceInspectionsRequest, Builder> {
        private String endTime; 
        private String engine; 
        private String instanceArea; 
        private String pageNo; 
        private String pageSize; 
        private String resourceGroupId; 
        private String searchMap; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(GetInstanceInspectionsRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.engine = request.engine;
            this.instanceArea = request.instanceArea;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.resourceGroupId = request.resourceGroupId;
            this.searchMap = request.searchMap;
            this.startTime = request.startTime;
        } 

        /**
         * The end of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         * <p>
         * 
         * >  The end time must be later than the start time.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The database engine. Valid values:
         * <p>
         * 
         * *   **MySQL**
         * *   **Redis**
         * *   **PolarDBMySQL**
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * The type of the instance on which the database is deployed. Valid values:
         * <p>
         * 
         * *   **RDS**: an Alibaba Cloud database instance.
         * *   **ECS**: an ECS instance on which a self-managed database is deployed.
         * *   **IDC**: a self-managed database instance that is not deployed on Alibaba Cloud.
         * 
         * >  The value IDC specifies that the instance is deployed in a data center.
         */
        public Builder instanceArea(String instanceArea) {
            this.putQueryParameter("InstanceArea", instanceArea);
            this.instanceArea = instanceArea;
            return this;
        }

        /**
         * The page number. The value must be a positive integer. Default value: 1.
         */
        public Builder pageNo(String pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * The number of entries per page. Default value: 10.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The resource group ID.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The filter condition, which can be specified in one of the following formats:
         * <p>
         * 
         * *   Specify the ID of a single instance in the {"InstanceId":"Instance ID"} format.
         * *   Specify the IDs of multiple instances in the {"InstanceIds":\["Instance ID1","Instance ID2"]} format. Separate the instance IDs with commas (,).
         * *   Specify the region in which the instance resides in the {"region":"Region of the instance"} format.
         */
        public Builder searchMap(String searchMap) {
            this.putQueryParameter("SearchMap", searchMap);
            this.searchMap = searchMap;
            return this;
        }

        /**
         * The beginning of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public GetInstanceInspectionsRequest build() {
            return new GetInstanceInspectionsRequest(this);
        } 

    } 

}
