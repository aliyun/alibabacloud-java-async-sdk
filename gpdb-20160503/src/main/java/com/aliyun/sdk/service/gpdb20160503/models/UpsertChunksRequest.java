// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpsertChunksRequest} extends {@link RequestModel}
 *
 * <p>UpsertChunksRequest</p>
 */
public class UpsertChunksRequest extends Request {
    @Query
    @NameInMap("Collection")
    @Validation(required = true)
    private String collection;

    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("FileName")
    private String fileName;

    @Query
    @NameInMap("Namespace")
    private String namespace;

    @Query
    @NameInMap("NamespacePassword")
    @Validation(required = true)
    private String namespacePassword;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("TextChunks")
    private java.util.List < TextChunks> textChunks;

    private UpsertChunksRequest(Builder builder) {
        super(builder);
        this.collection = builder.collection;
        this.DBInstanceId = builder.DBInstanceId;
        this.fileName = builder.fileName;
        this.namespace = builder.namespace;
        this.namespacePassword = builder.namespacePassword;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.textChunks = builder.textChunks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpsertChunksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return collection
     */
    public String getCollection() {
        return this.collection;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return namespacePassword
     */
    public String getNamespacePassword() {
        return this.namespacePassword;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return textChunks
     */
    public java.util.List < TextChunks> getTextChunks() {
        return this.textChunks;
    }

    public static final class Builder extends Request.Builder<UpsertChunksRequest, Builder> {
        private String collection; 
        private String DBInstanceId; 
        private String fileName; 
        private String namespace; 
        private String namespacePassword; 
        private Long ownerId; 
        private String regionId; 
        private java.util.List < TextChunks> textChunks; 

        private Builder() {
            super();
        } 

        private Builder(UpsertChunksRequest request) {
            super(request);
            this.collection = request.collection;
            this.DBInstanceId = request.DBInstanceId;
            this.fileName = request.fileName;
            this.namespace = request.namespace;
            this.namespacePassword = request.namespacePassword;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.textChunks = request.textChunks;
        } 

        /**
         * Collection.
         */
        public Builder collection(String collection) {
            this.putQueryParameter("Collection", collection);
            this.collection = collection;
            return this;
        }

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * FileName.
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * NamespacePassword.
         */
        public Builder namespacePassword(String namespacePassword) {
            this.putQueryParameter("NamespacePassword", namespacePassword);
            this.namespacePassword = namespacePassword;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * TextChunks.
         */
        public Builder textChunks(java.util.List < TextChunks> textChunks) {
            String textChunksShrink = shrink(textChunks, "TextChunks", "json");
            this.putBodyParameter("TextChunks", textChunksShrink);
            this.textChunks = textChunks;
            return this;
        }

        @Override
        public UpsertChunksRequest build() {
            return new UpsertChunksRequest(this);
        } 

    } 

    public static class TextChunks extends TeaModel {
        @NameInMap("Content")
        @Validation(required = true)
        private String content;

        @NameInMap("Metadata")
        private java.util.Map < String, ? > metadata;

        private TextChunks(Builder builder) {
            this.content = builder.content;
            this.metadata = builder.metadata;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TextChunks create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return metadata
         */
        public java.util.Map < String, ? > getMetadata() {
            return this.metadata;
        }

        public static final class Builder {
            private String content; 
            private java.util.Map < String, ? > metadata; 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Metadata.
             */
            public Builder metadata(java.util.Map < String, ? > metadata) {
                this.metadata = metadata;
                return this;
            }

            public TextChunks build() {
                return new TextChunks(this);
            } 

        } 

    }
}
