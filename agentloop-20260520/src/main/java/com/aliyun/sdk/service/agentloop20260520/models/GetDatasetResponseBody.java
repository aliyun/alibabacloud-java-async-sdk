// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link GetDatasetResponseBody} extends {@link TeaModel}
 *
 * <p>GetDatasetResponseBody</p>
 */
public class GetDatasetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    private String agentSpace;

    @com.aliyun.core.annotation.NameInMap("createTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("datasetName")
    private String datasetName;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("schema")
    private java.util.Map<String, IndexKey> schema;

    @com.aliyun.core.annotation.NameInMap("updateTime")
    private String updateTime;

    private GetDatasetResponseBody(Builder builder) {
        this.agentSpace = builder.agentSpace;
        this.createTime = builder.createTime;
        this.datasetName = builder.datasetName;
        this.description = builder.description;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.schema = builder.schema;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDatasetResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentSpace
     */
    public String getAgentSpace() {
        return this.agentSpace;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return datasetName
     */
    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return schema
     */
    public java.util.Map<String, IndexKey> getSchema() {
        return this.schema;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private String agentSpace; 
        private String createTime; 
        private String datasetName; 
        private String description; 
        private String regionId; 
        private String requestId; 
        private java.util.Map<String, IndexKey> schema; 
        private String updateTime; 

        private Builder() {
        } 

        private Builder(GetDatasetResponseBody model) {
            this.agentSpace = model.agentSpace;
            this.createTime = model.createTime;
            this.datasetName = model.datasetName;
            this.description = model.description;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.schema = model.schema;
            this.updateTime = model.updateTime;
        } 

        /**
         * agentSpace.
         */
        public Builder agentSpace(String agentSpace) {
            this.agentSpace = agentSpace;
            return this;
        }

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-15T10:30:00Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * datasetName.
         */
        public Builder datasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * schema.
         */
        public Builder schema(java.util.Map<String, IndexKey> schema) {
            this.schema = schema;
            return this;
        }

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-15T11:20:00Z</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public GetDatasetResponseBody build() {
            return new GetDatasetResponseBody(this);
        } 

    } 

}
