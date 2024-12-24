// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataanalysisgbi20240823.models;

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
 * {@link BatchDeleteSynonymsRequest} extends {@link RequestModel}
 *
 * <p>BatchDeleteSynonymsRequest</p>
 */
public class BatchDeleteSynonymsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("synonymIdKeys")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> synonymIdKeys;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private BatchDeleteSynonymsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.synonymIdKeys = builder.synonymIdKeys;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchDeleteSynonymsRequest create() {
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
     * @return synonymIdKeys
     */
    public java.util.List<String> getSynonymIdKeys() {
        return this.synonymIdKeys;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<BatchDeleteSynonymsRequest, Builder> {
        private String regionId; 
        private java.util.List<String> synonymIdKeys; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(BatchDeleteSynonymsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.synonymIdKeys = request.synonymIdKeys;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder synonymIdKeys(java.util.List<String> synonymIdKeys) {
            this.putBodyParameter("synonymIdKeys", synonymIdKeys);
            this.synonymIdKeys = synonymIdKeys;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-2v3934xtp49esw64</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public BatchDeleteSynonymsRequest build() {
            return new BatchDeleteSynonymsRequest(this);
        } 

    } 

}
