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
 * {@link UpsertDocumentChunksRequest} extends {@link RequestModel}
 *
 * <p>UpsertDocumentChunksRequest</p>
 */
public class UpsertDocumentChunksRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Chunks")
    @com.aliyun.core.annotation.Validation(required = true)
    private String chunks;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DocumentName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String documentName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KbUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String kbUuid;

    private UpsertDocumentChunksRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.chunks = builder.chunks;
        this.documentName = builder.documentName;
        this.kbUuid = builder.kbUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpsertDocumentChunksRequest create() {
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
     * @return chunks
     */
    public String getChunks() {
        return this.chunks;
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

    public static final class Builder extends Request.Builder<UpsertDocumentChunksRequest, Builder> {
        private String regionId; 
        private String chunks; 
        private String documentName; 
        private String kbUuid; 

        private Builder() {
            super();
        } 

        private Builder(UpsertDocumentChunksRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.chunks = request.chunks;
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
         * 
         * <strong>example:</strong>
         * <p>[
         *   {
         *     &quot;Id&quot;: &quot;2e12aeb5-52cd-4834-bcd8-<strong><strong>&quot;,
         *     &quot;Content&quot;: &quot;test1&quot;
         *   },
         *   {
         *     &quot;Id&quot;: &quot;2fdnwefi5-dsad-4t35-bcd8-</strong></strong>&quot;,
         *     &quot;Content&quot;: &quot;test2&quot;
         *   }
         * ]</p>
         */
        public Builder chunks(String chunks) {
            this.putBodyParameter("Chunks", chunks);
            this.chunks = chunks;
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
        public UpsertDocumentChunksRequest build() {
            return new UpsertDocumentChunksRequest(this);
        } 

    } 

}
