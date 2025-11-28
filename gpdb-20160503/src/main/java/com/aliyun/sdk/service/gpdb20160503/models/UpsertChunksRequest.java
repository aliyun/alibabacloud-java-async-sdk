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
         * <p>Based on the Filter input specified under TextChunks, this parameter controls whether data insertion is allowed when a Filter is provided.</p>
         * <p>If AllowInsertWithFilter = true, the insert operation is performed when the filter does not match any data.</p>
         * <p>If AllowInsertWithFilter = false, no action is performed if the filter does not match any data.</p>
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
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/2618448.html">CreateDocumentCollection</a> operation to create a document collection and call the <a href="https://help.aliyun.com/document_detail/2618452.html">ListDocumentCollections</a> operation to query a list of document collections.</p>
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
         * <p>The cluster ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
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
         * <p>The file name of the document.</p>
         * <blockquote>
         * <p>When a non-empty filename is specified, the system will decide whether to overwrite the data associated with that filename based on the value of the ShouldReplaceFile parameter. If you leave this parameter empty, the data of chunks is appended to the document collection.</p>
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
         * <p>The name of the namespace. Default value: public.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/2401495.html">CreateNamespace</a> operation to create a namespace and call the <a href="https://help.aliyun.com/document_detail/2401502.html">ListNamespaces</a> operation to query a list of namespaces.</p>
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
         * <p>The password of the namespace.</p>
         * <blockquote>
         * <p>The value of this parameter is specified when you call the <a href="https://help.aliyun.com/document_detail/2401495.html">CreateNamespace</a> operation.</p>
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
         * <p>The region ID of the cluster.</p>
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
         * <p>Specifies whether to overwrite the data associated with the file name specified by the FileName parameter.</p>
         * <p>If you set ShouldReplaceFile to true, the system deletes all data associated with the file name and then inserts new data.</p>
         * <p>If you set ShouldReplaceFile to false, the system does not delete the data associated with the file name, but inserts or updates the data of chunks based on the TextChunks parameter.</p>
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
         * <p>List of document chunks after splitting.</p>
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
             * <p>The content of the document.</p>
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
             * <p>The condition that is used to filter the data to be updated. Specify this parameter in a format that is the same as the WHERE clause.</p>
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
