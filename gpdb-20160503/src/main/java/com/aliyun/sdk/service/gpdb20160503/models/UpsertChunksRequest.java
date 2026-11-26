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
    @com.aliyun.core.annotation.NameInMap("AllowInsertWithFilter")
    private Boolean allowInsertWithFilter;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShouldReplaceFile")
    private Boolean shouldReplaceFile;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TextChunks")
    private java.util.List<TextChunks> textChunks;

    private UpsertChunksRequest(Builder builder) {
        super(builder);
        this.allowInsertWithFilter = builder.allowInsertWithFilter;
        this.collection = builder.collection;
        this.DBInstanceId = builder.DBInstanceId;
        this.fileName = builder.fileName;
        this.namespace = builder.namespace;
        this.namespacePassword = builder.namespacePassword;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.shouldReplaceFile = builder.shouldReplaceFile;
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
     * @return allowInsertWithFilter
     */
    public Boolean getAllowInsertWithFilter() {
        return this.allowInsertWithFilter;
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
     * @return shouldReplaceFile
     */
    public Boolean getShouldReplaceFile() {
        return this.shouldReplaceFile;
    }

    /**
     * @return textChunks
     */
    public java.util.List<TextChunks> getTextChunks() {
        return this.textChunks;
    }

    public static final class Builder extends Request.Builder<UpsertChunksRequest, Builder> {
        private Boolean allowInsertWithFilter; 
        private String collection; 
        private String DBInstanceId; 
        private String fileName; 
        private String namespace; 
        private String namespacePassword; 
        private Long ownerId; 
        private String regionId; 
        private Boolean shouldReplaceFile; 
        private java.util.List<TextChunks> textChunks; 

        private Builder() {
            super();
        } 

        private Builder(UpsertChunksRequest request) {
            super(request);
            this.allowInsertWithFilter = request.allowInsertWithFilter;
            this.collection = request.collection;
            this.DBInstanceId = request.DBInstanceId;
            this.fileName = request.fileName;
            this.namespace = request.namespace;
            this.namespacePassword = request.namespacePassword;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.shouldReplaceFile = request.shouldReplaceFile;
            this.textChunks = request.textChunks;
        } 

        /**
         * <p>Specifies whether to allow data insertion when a filter is specified. This parameter takes effect only when the Filter parameter in TextChunks is specified.</p>
         * <p>If AllowInsertWithFilter is set to true, an insert operation is performed when the filter does not match any data.</p>
         * <p>If AllowInsertWithFilter is set to false, no operation is performed when the filter does not match any data.</p>
         * <p>Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder allowInsertWithFilter(Boolean allowInsertWithFilter) {
            this.putQueryParameter("AllowInsertWithFilter", allowInsertWithFilter);
            this.allowInsertWithFilter = allowInsertWithFilter;
            return this;
        }

        /**
         * <p>The name of the document collection.</p>
         * <blockquote>
         * <p>The document collection is created by calling the <a href="https://help.aliyun.com/document_detail/2618448.html">CreateDocumentCollection</a> operation. You can call the <a href="https://help.aliyun.com/document_detail/2618452.html">ListDocumentCollections</a> operation to view the created document collections.</p>
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
         * <p>The instance ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the details of all AnalyticDB for PostgreSQL instances in a specific region, including the instance IDs.</p>
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
         * <p>The file name.</p>
         * <blockquote>
         * <p>If this parameter is not empty, the system determines whether to overwrite the data associated with this file name based on the value of the ShouldReplaceFile parameter. If this parameter is empty, the chunk data is directly appended and uploaded to the document collection.</p>
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
         * <p>The namespace. Default value: public.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/2401495.html">CreateNamespace</a> operation to create a namespace and call the <a href="https://help.aliyun.com/document_detail/2401502.html">ListNamespaces</a> operation to view the namespace list.</p>
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
         * <p>The password for the namespace.</p>
         * <blockquote>
         * <p>This value is specified in the <a href="https://help.aliyun.com/document_detail/2401495.html">CreateNamespace</a> operation.</p>
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
         * <p>The region ID of the instance.</p>
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
         * <p>Specifies whether to overwrite the data associated with the specified file name. This parameter takes effect only when the FileName parameter is specified.</p>
         * <p>If ShouldReplaceFile is set to true, all data associated with the file name is deleted before new data is inserted.</p>
         * <p>If ShouldReplaceFile is set to false, the data associated with the file name is not deleted. Instead, chunks are inserted or updated based on the specific TextChunks parameter.</p>
         * <p>Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder shouldReplaceFile(Boolean shouldReplaceFile) {
            this.putQueryParameter("ShouldReplaceFile", shouldReplaceFile);
            this.shouldReplaceFile = shouldReplaceFile;
            return this;
        }

        /**
         * <p>The list of chunked documents.</p>
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

        @com.aliyun.core.annotation.NameInMap("Filter")
        private String filter;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Metadata")
        private java.util.Map<String, ?> metadata;

        private TextChunks(Builder builder) {
            this.content = builder.content;
            this.filter = builder.filter;
            this.id = builder.id;
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
         * @return filter
         */
        public String getFilter() {
            return this.filter;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return metadata
         */
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        public static final class Builder {
            private String content; 
            private String filter; 
            private String id; 
            private java.util.Map<String, ?> metadata; 

            private Builder() {
            } 

            private Builder(TextChunks model) {
                this.content = model.content;
                this.filter = model.filter;
                this.id = model.id;
                this.metadata = model.metadata;
            } 

            /**
             * <p>The document content.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>AnalyticDB for PostgreSQL provides a simple, fast, and cost-effective PB-level cloud data warehousing solution.</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The filter condition for the data to be updated, in the format of an SQL WHERE clause.</p>
             * 
             * <strong>example:</strong>
             * <p>title = &quot;seagull&quot;</p>
             */
            public Builder filter(String filter) {
                this.filter = filter;
                return this;
            }

            /**
             * <p>The unique ID of the vector data.</p>
             * 
             * <strong>example:</strong>
             * <p>273e3fc7-8f56-4167-a1bb-d35d2f3b9043</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The metadata.</p>
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
