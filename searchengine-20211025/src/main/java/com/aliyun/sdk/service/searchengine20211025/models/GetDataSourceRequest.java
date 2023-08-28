// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataSourceRequest} extends {@link RequestModel}
 *
 * <p>GetDataSourceRequest</p>
 */
public class GetDataSourceRequest extends Request {
    @Path
    @NameInMap("instanceId")
    private String instanceId;

    @Path
    @NameInMap("dataSourceName")
    private String dataSourceName;

    private GetDataSourceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.dataSourceName = builder.dataSourceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataSourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return dataSourceName
     */
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    public static final class Builder extends Request.Builder<GetDataSourceRequest, Builder> {
        private String instanceId; 
        private String dataSourceName; 

        private Builder() {
            super();
        } 

        private Builder(GetDataSourceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.dataSourceName = request.dataSourceName;
        } 

        /**
         * ### Sample requests
         * <p>
         * 
         * `GET /openapi/ha3/instances/ha3_instances_id/data-sources/my_data_source`
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ### Sample responses
         * <p>
         * 
         *     {
         *       "requestId": "0A6EB64B-B4C8-CF02-810F-E660812972FF",
         *       "result": {
         *         "name": "data_source_name",
         *         "type": "odps",
         *         "domain": "test",  // The data center of the data source that is deployed in offline mode    
         *         "indexes": [
         *           "index1",
         *           "index2"
         *         ],
         *         "partitions": [
         *           "ds=2020",
         *           "ds=2021"
         *         ],
         *         "lastFulTime": 1628502036000,
         *         "config":{
         *           "accessKey": "xxx",
         *           "accessSecret": "xxxs",
         *           "project":"xxxx",
         *           "table":"xxx",
         *           "partition":"xxxx"
         *         },
         *         "autoBuildIndex": true,
         *         "status": "new"	   // The state of the data source. new indicates that the data source is being created, publish indicates that the data source is normal, and trash indicates that the data source is being deleted.
         *        
         *       }
         *     }
         */
        public Builder dataSourceName(String dataSourceName) {
            this.putPathParameter("dataSourceName", dataSourceName);
            this.dataSourceName = dataSourceName;
            return this;
        }

        @Override
        public GetDataSourceRequest build() {
            return new GetDataSourceRequest(this);
        } 

    } 

}
