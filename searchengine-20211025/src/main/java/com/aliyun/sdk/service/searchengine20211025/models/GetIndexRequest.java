// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIndexRequest} extends {@link RequestModel}
 *
 * <p>GetIndexRequest</p>
 */
public class GetIndexRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("indexName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String indexName;

    private GetIndexRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.indexName = builder.indexName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIndexRequest create() {
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
     * @return indexName
     */
    public String getIndexName() {
        return this.indexName;
    }

    public static final class Builder extends Request.Builder<GetIndexRequest, Builder> {
        private String instanceId; 
        private String indexName; 

        private Builder() {
            super();
        } 

        private Builder(GetIndexRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.indexName = request.indexName;
        } 

        /**
         * ## Sample requests
         * <p>
         * 
         *     GET  /openapi/ha3/instances/ose-test1/indexes/index1?dataSource=xxx
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ## Sample responses
         * <p>
         * 
         * Success responses
         * 
         *     {
         *       "requestId": "e1eef569-1ff7-4bf8-acf7-1cecca9894ce",
         *       "result": {
         *         "name": "index1",
         *         "dataSource": "test_yyds_data1",
         *         "versions": [
         *           {
         *             "name": "my_index_1",
         *             "versionId": 1,
         *             "status": "drafting",
         *             "updateTime": "1631070464000",
         *             "desc": "test",
         *             "files": [
         *               {
         *                 "fullPathName": "/",
         *                 "isDir": true,
         *                 "isTemplate": true,
         *                 "name": "cava"
         *               },
         *               {
         *                 "fullPathName": "/",
         *                 "isDir": true,
         *                 "isTemplate": true,
         *                 "name": "cava"
         *               }
         *             ]
         *           },
         *           {
         *             "name": "my_index_2",
         *             "versionId": 1,
         *             "status": "drafting",
         *             "updateTime": "1631070464000",
         *             "desc": "test",
         *             "files": [
         *               {
         *                 "fullPathName": "/",
         *                 "isDir": true,
         *                 "isTemplate": true,
         *                 "name": "cava"
         *               },
         *               {
         *                 "fullPathName": "/",
         *                 "isDir": true,
         *                 "isTemplate": true,
         *                 "name": "cava"
         *               }
         *             ]        
         *           }
         *         ]
         *       }
         *     }
         */
        public Builder indexName(String indexName) {
            this.putPathParameter("indexName", indexName);
            this.indexName = indexName;
            return this;
        }

        @Override
        public GetIndexRequest build() {
            return new GetIndexRequest(this);
        } 

    } 

}
