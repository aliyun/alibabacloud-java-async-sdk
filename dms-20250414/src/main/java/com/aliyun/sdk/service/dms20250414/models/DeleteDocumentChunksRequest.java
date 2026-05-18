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
 * {@link DeleteDocumentChunksRequest} extends {@link RequestModel}
 *
 * <p>DeleteDocumentChunksRequest</p>
 */
public class DeleteDocumentChunksRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChunkIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> chunkIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DocumentName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String documentName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KbUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String kbUuid;

    private DeleteDocumentChunksRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.chunkIds = builder.chunkIds;
        this.documentName = builder.documentName;
        this.kbUuid = builder.kbUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDocumentChunksRequest create() {
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
     * @return chunkIds
     */
    public java.util.List<String> getChunkIds() {
        return this.chunkIds;
    }

    /**
     * @return documentName
     */
    public String getDocumentName() {
        return this.documentName;
    }

    /**
     * @return kbUuid
     */
    public String getKbUuid() {
        return this.kbUuid;
    }

    public static final class Builder extends Request.Builder<DeleteDocumentChunksRequest, Builder> {
        private String regionId; 
        private java.util.List<String> chunkIds; 
        private String documentName; 
        private String kbUuid; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDocumentChunksRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.chunkIds = request.chunkIds;
            this.documentName = request.documentName;
            this.kbUuid = request.kbUuid;
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
         */
        public Builder chunkIds(java.util.List<String> chunkIds) {
            String chunkIdsShrink = shrink(chunkIds, "ChunkIds", "json");
            this.putBodyParameter("ChunkIds", chunkIdsShrink);
            this.chunkIds = chunkIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test.md</p>
         */
        public Builder documentName(String documentName) {
            this.putBodyParameter("DocumentName", documentName);
            this.documentName = documentName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>kb-***</p>
         */
        public Builder kbUuid(String kbUuid) {
            this.putBodyParameter("KbUuid", kbUuid);
            this.kbUuid = kbUuid;
            return this;
        }

        @Override
        public DeleteDocumentChunksRequest build() {
            return new DeleteDocumentChunksRequest(this);
        } 

    } 

}
