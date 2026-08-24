// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link DeleteOneMetaOssieModelRequest} extends {@link RequestModel}
 *
 * <p>DeleteOneMetaOssieModelRequest</p>
 */
public class DeleteOneMetaOssieModelRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KnowledgeUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String knowledgeUuid;

    private DeleteOneMetaOssieModelRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.knowledgeUuid = builder.knowledgeUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteOneMetaOssieModelRequest create() {
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
     * @return knowledgeUuid
     */
    public String getKnowledgeUuid() {
        return this.knowledgeUuid;
    }

    public static final class Builder extends Request.Builder<DeleteOneMetaOssieModelRequest, Builder> {
        private String regionId; 
        private String knowledgeUuid; 

        private Builder() {
            super();
        } 

        private Builder(DeleteOneMetaOssieModelRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.knowledgeUuid = request.knowledgeUuid;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>86c5c290052147c***</p>
         */
        public Builder knowledgeUuid(String knowledgeUuid) {
            this.putQueryParameter("KnowledgeUuid", knowledgeUuid);
            this.knowledgeUuid = knowledgeUuid;
            return this;
        }

        @Override
        public DeleteOneMetaOssieModelRequest build() {
            return new DeleteOneMetaOssieModelRequest(this);
        } 

    } 

}
