// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAsyncErrorRequestStatResultRequest} extends {@link RequestModel}
 *
 * <p>GetAsyncErrorRequestStatResultRequest</p>
 */
public class GetAsyncErrorRequestStatResultRequest extends Request {
    @Query
    @NameInMap("DbName")
    private String dbName;

    @Query
    @NameInMap("End")
    private Long end;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("NodeId")
    private String nodeId;

    @Query
    @NameInMap("SqlIdList")
    private String sqlIdList;

    @Query
    @NameInMap("Start")
    private Long start;

    private GetAsyncErrorRequestStatResultRequest(Builder builder) {
        super(builder);
        this.dbName = builder.dbName;
        this.end = builder.end;
        this.instanceId = builder.instanceId;
        this.nodeId = builder.nodeId;
        this.sqlIdList = builder.sqlIdList;
        this.start = builder.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAsyncErrorRequestStatResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return end
     */
    public Long getEnd() {
        return this.end;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return sqlIdList
     */
    public String getSqlIdList() {
        return this.sqlIdList;
    }

    /**
     * @return start
     */
    public Long getStart() {
        return this.start;
    }

    public static final class Builder extends Request.Builder<GetAsyncErrorRequestStatResultRequest, Builder> {
        private String dbName; 
        private Long end; 
        private String instanceId; 
        private String nodeId; 
        private String sqlIdList; 
        private Long start; 

        private Builder() {
            super();
        } 

        private Builder(GetAsyncErrorRequestStatResultRequest response) {
            super(response);
            this.dbName = response.dbName;
            this.end = response.end;
            this.instanceId = response.instanceId;
            this.nodeId = response.nodeId;
            this.sqlIdList = response.sqlIdList;
            this.start = response.start;
        } 

        /**
         * DbName.
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * End.
         */
        public Builder end(Long end) {
            this.putQueryParameter("End", end);
            this.end = end;
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
         * NodeId.
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * SqlIdList.
         */
        public Builder sqlIdList(String sqlIdList) {
            this.putQueryParameter("SqlIdList", sqlIdList);
            this.sqlIdList = sqlIdList;
            return this;
        }

        /**
         * Start.
         */
        public Builder start(Long start) {
            this.putQueryParameter("Start", start);
            this.start = start;
            return this;
        }

        @Override
        public GetAsyncErrorRequestStatResultRequest build() {
            return new GetAsyncErrorRequestStatResultRequest(this);
        } 

    } 

}
