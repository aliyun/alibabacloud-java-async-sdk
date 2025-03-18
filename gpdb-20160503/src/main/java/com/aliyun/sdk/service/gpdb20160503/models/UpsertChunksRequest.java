// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link UpsertChunksRequest} extends {@link RequestModel}
 *
 * <p>UpsertChunksRequest</p>
 */
public class UpsertChunksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Collection")
    @com.aliyun.core.annotation.Validation(required = true)
    private String collection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileName")
    private String fileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespacePassword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespacePassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TextChunks")
    private java.util.List<TextChunks> textChunks;

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
    public java.util.List<TextChunks> getTextChunks() {
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
        private java.util.List<TextChunks> textChunks; 

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
         * <p>Document collection name.</p>
         * <blockquote>
         * <p>Created by the <a href="https://help.aliyun.com/document_detail/2618448.html">CreateDocumentCollection</a> API. You can use the <a href="https://help.aliyun.com/document_detail/2618452.html">ListDocumentCollections</a> API to view the already created document collections.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>document</p>
         */
        public Builder collection(String collection) {
            this.putQueryParameter("Collection", collection);
            this.collection = collection;
            return this;
        }

        /**
         * <p>Instance ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> API to view details of all AnalyticDB PostgreSQL instances in the target region, including the instance ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-xxxxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>File name.</p>
         * <blockquote>
         * <p>If a file name is specified and not empty, it will overwrite the data for this file name; if empty, the chunks data will be appended directly to the document collection.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>mydoc.txt</p>
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>Namespace, default is public.</p>
         * <blockquote>
         * <p>You can create it using the <a href="https://help.aliyun.com/document_detail/2401495.html">CreateNamespace</a> API and view the list using the <a href="https://help.aliyun.com/document_detail/2401502.html">ListNamespaces</a> API.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>mynamespace</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>Password corresponding to the namespace.</p>
         * <blockquote>
         * <p>This value is specified by the <a href="https://help.aliyun.com/document_detail/2401495.html">CreateNamespace</a> API.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testpassword</p>
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
         * <p>Region ID where the instance is located.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>List of split documents.</p>
         */
        public Builder textChunks(java.util.List<TextChunks> textChunks) {
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

    /**
     * 
     * {@link UpsertChunksRequest} extends {@link TeaModel}
     *
     * <p>UpsertChunksRequest</p>
     */
    public static class TextChunks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        @com.aliyun.core.annotation.Validation(required = true)
        private String content;

        @com.aliyun.core.annotation.NameInMap("Metadata")
        private java.util.Map<String, ?> metadata;

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
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        public static final class Builder {
            private String content; 
            private java.util.Map<String, ?> metadata; 

            private Builder() {
            } 

            private Builder(TextChunks model) {
                this.content = model.content;
                this.metadata = model.metadata;
            } 

            /**
             * <p>Document content.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Cloud-native data warehouse AnalyticDB PostgreSQL Edition provides a simple, fast, and cost-effective PB-level cloud data warehouse solution.</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>Metadata.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;title&quot;:&quot;test&quot;}</p>
             */
            public Builder metadata(java.util.Map<String, ?> metadata) {
                this.metadata = metadata;
                return this;
            }

            public TextChunks build() {
                return new TextChunks(this);
            } 

        } 

    }
}
