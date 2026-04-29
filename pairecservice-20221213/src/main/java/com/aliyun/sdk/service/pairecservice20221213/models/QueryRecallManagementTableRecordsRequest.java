// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link QueryRecallManagementTableRecordsRequest} extends {@link RequestModel}
 *
 * <p>QueryRecallManagementTableRecordsRequest</p>
 */
public class QueryRecallManagementTableRecordsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("RecallManagementTableId")
    private String recallManagementTableId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrimaryKeys")
    private byte[] primaryKeys;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecallManagementTableVersionId")
    private String recallManagementTableVersionId;

    private QueryRecallManagementTableRecordsRequest(Builder builder) {
        super(builder);
        this.recallManagementTableId = builder.recallManagementTableId;
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.primaryKeys = builder.primaryKeys;
        this.recallManagementTableVersionId = builder.recallManagementTableVersionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRecallManagementTableRecordsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return recallManagementTableId
     */
    public String getRecallManagementTableId() {
        return this.recallManagementTableId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return primaryKeys
     */
    public byte[] getPrimaryKeys() {
        return this.primaryKeys;
    }

    /**
     * @return recallManagementTableVersionId
     */
    public String getRecallManagementTableVersionId() {
        return this.recallManagementTableVersionId;
    }

    public static final class Builder extends Request.Builder<QueryRecallManagementTableRecordsRequest, Builder> {
        private String recallManagementTableId; 
        private String regionId; 
        private String instanceId; 
        private byte[] primaryKeys; 
        private String recallManagementTableVersionId; 

        private Builder() {
            super();
        } 

        private Builder(QueryRecallManagementTableRecordsRequest request) {
            super(request);
            this.recallManagementTableId = request.recallManagementTableId;
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.primaryKeys = request.primaryKeys;
            this.recallManagementTableVersionId = request.recallManagementTableVersionId;
        } 

        /**
         * RecallManagementTableId.
         */
        public Builder recallManagementTableId(String recallManagementTableId) {
            this.putPathParameter("RecallManagementTableId", recallManagementTableId);
            this.recallManagementTableId = recallManagementTableId;
            return this;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * PrimaryKeys.
         */
        public Builder primaryKeys(byte[] primaryKeys) {
            this.putQueryParameter("PrimaryKeys", primaryKeys);
            this.primaryKeys = primaryKeys;
            return this;
        }

        /**
         * RecallManagementTableVersionId.
         */
        public Builder recallManagementTableVersionId(String recallManagementTableVersionId) {
            this.putQueryParameter("RecallManagementTableVersionId", recallManagementTableVersionId);
            this.recallManagementTableVersionId = recallManagementTableVersionId;
            return this;
        }

        @Override
        public QueryRecallManagementTableRecordsRequest build() {
            return new QueryRecallManagementTableRecordsRequest(this);
        } 

    } 

}
