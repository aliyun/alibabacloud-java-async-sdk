// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adbai20250812.models;

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
 * {@link DeleteMultiModalKnowledgeBaseRequest} extends {@link RequestModel}
 *
 * <p>DeleteMultiModalKnowledgeBaseRequest</p>
 */
public class DeleteMultiModalKnowledgeBaseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MmkbName")
    private String mmkbName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DeleteMultiModalKnowledgeBaseRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.mmkbName = builder.mmkbName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMultiModalKnowledgeBaseRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return mmkbName
     */
    public String getMmkbName() {
        return this.mmkbName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteMultiModalKnowledgeBaseRequest, Builder> {
        private String DBClusterId; 
        private String mmkbName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMultiModalKnowledgeBaseRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.mmkbName = request.mmkbName;
            this.regionId = request.regionId;
        } 

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * MmkbName.
         */
        public Builder mmkbName(String mmkbName) {
            this.putQueryParameter("MmkbName", mmkbName);
            this.mmkbName = mmkbName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteMultiModalKnowledgeBaseRequest build() {
            return new DeleteMultiModalKnowledgeBaseRequest(this);
        } 

    } 

}
