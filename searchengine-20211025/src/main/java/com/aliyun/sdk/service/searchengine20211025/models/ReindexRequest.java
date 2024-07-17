// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReindexRequest} extends {@link RequestModel}
 *
 * <p>ReindexRequest</p>
 */
public class ReindexRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("tableName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dataTimeSec")
    private Integer dataTimeSec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ossDataPath")
    private String ossDataPath;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("partition")
    private String partition;

    private ReindexRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.tableName = builder.tableName;
        this.dataTimeSec = builder.dataTimeSec;
        this.ossDataPath = builder.ossDataPath;
        this.partition = builder.partition;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReindexRequest create() {
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
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return dataTimeSec
     */
    public Integer getDataTimeSec() {
        return this.dataTimeSec;
    }

    /**
     * @return ossDataPath
     */
    public String getOssDataPath() {
        return this.ossDataPath;
    }

    /**
     * @return partition
     */
    public String getPartition() {
        return this.partition;
    }

    public static final class Builder extends Request.Builder<ReindexRequest, Builder> {
        private String instanceId; 
        private String tableName; 
        private Integer dataTimeSec; 
        private String ossDataPath; 
        private String partition; 

        private Builder() {
            super();
        } 

        private Builder(ReindexRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.tableName = request.tableName;
            this.dataTimeSec = request.dataTimeSec;
            this.ossDataPath = request.ossDataPath;
            this.partition = request.partition;
        } 

        /**
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The name of the table.
         */
        public Builder tableName(String tableName) {
            this.putPathParameter("tableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * The timestamp in seconds. The value must be of the INTEGER type. This parameter is required if you specify an API data source.
         */
        public Builder dataTimeSec(Integer dataTimeSec) {
            this.putBodyParameter("dataTimeSec", dataTimeSec);
            this.dataTimeSec = dataTimeSec;
            return this;
        }

        /**
         * oss data path
         */
        public Builder ossDataPath(String ossDataPath) {
            this.putBodyParameter("ossDataPath", ossDataPath);
            this.ossDataPath = ossDataPath;
            return this;
        }

        /**
         * The partition in the MaxCompute table. This parameter is required if type is set to odps.
         */
        public Builder partition(String partition) {
            this.putBodyParameter("partition", partition);
            this.partition = partition;
            return this;
        }

        @Override
        public ReindexRequest build() {
            return new ReindexRequest(this);
        } 

    } 

}
