// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

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
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-2r42ppr7901</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The name of the table.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_summary</p>
         */
        public Builder tableName(String tableName) {
            this.putPathParameter("tableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * <p>The timestamp in seconds. The value must be of the INTEGER type. This parameter is required if you specify an API data source.</p>
         * 
         * <strong>example:</strong>
         * <p>1640867288</p>
         */
        public Builder dataTimeSec(Integer dataTimeSec) {
            this.putBodyParameter("dataTimeSec", dataTimeSec);
            this.dataTimeSec = dataTimeSec;
            return this;
        }

        /**
         * <p>oss data path</p>
         * 
         * <strong>example:</strong>
         * <p>oss://opensearch</p>
         */
        public Builder ossDataPath(String ossDataPath) {
            this.putBodyParameter("ossDataPath", ossDataPath);
            this.ossDataPath = ossDataPath;
            return this;
        }

        /**
         * <p>The partition in the MaxCompute table. This parameter is required if type is set to odps.</p>
         * 
         * <strong>example:</strong>
         * <p>ds=20220713</p>
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
