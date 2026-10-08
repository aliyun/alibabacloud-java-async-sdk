// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link ContextualFile} extends {@link TeaModel}
 *
 * <p>ContextualFile</p>
 */
public class ContextualFile extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ContentType")
    private String contentType;

    @com.aliyun.core.annotation.NameInMap("DatasetName")
    private String datasetName;

    @com.aliyun.core.annotation.NameInMap("Elements")
    private java.util.List<Element> elements;

    @com.aliyun.core.annotation.NameInMap("MediaType")
    private String mediaType;

    @com.aliyun.core.annotation.NameInMap("OSSURI")
    private String OSSURI;

    @com.aliyun.core.annotation.NameInMap("ObjectId")
    private String objectId;

    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.NameInMap("ProjectName")
    private String projectName;

    @com.aliyun.core.annotation.NameInMap("URI")
    private String URI;

    private ContextualFile(Builder builder) {
        this.contentType = builder.contentType;
        this.datasetName = builder.datasetName;
        this.elements = builder.elements;
        this.mediaType = builder.mediaType;
        this.OSSURI = builder.OSSURI;
        this.objectId = builder.objectId;
        this.ownerId = builder.ownerId;
        this.projectName = builder.projectName;
        this.URI = builder.URI;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ContextualFile create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contentType
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * @return datasetName
     */
    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * @return elements
     */
    public java.util.List<Element> getElements() {
        return this.elements;
    }

    /**
     * @return mediaType
     */
    public String getMediaType() {
        return this.mediaType;
    }

    /**
     * @return OSSURI
     */
    public String getOSSURI() {
        return this.OSSURI;
    }

    /**
     * @return objectId
     */
    public String getObjectId() {
        return this.objectId;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return URI
     */
    public String getURI() {
        return this.URI;
    }

    public static final class Builder {
        private String contentType; 
        private String datasetName; 
        private java.util.List<Element> elements; 
        private String mediaType; 
        private String OSSURI; 
        private String objectId; 
        private String ownerId; 
        private String projectName; 
        private String URI; 

        private Builder() {
        } 

        private Builder(ContextualFile model) {
            this.contentType = model.contentType;
            this.datasetName = model.datasetName;
            this.elements = model.elements;
            this.mediaType = model.mediaType;
            this.OSSURI = model.OSSURI;
            this.objectId = model.objectId;
            this.ownerId = model.ownerId;
            this.projectName = model.projectName;
            this.URI = model.URI;
        } 

        /**
         * <p>The Multipurpose Internet Mail Extensions (MIME) type of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>text/x-imm-faq</p>
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        /**
         * <p>The dataset name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-dataset</p>
         */
        public Builder datasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }

        /**
         * <p>Elements.</p>
         */
        public Builder elements(java.util.List<Element> elements) {
            this.elements = elements;
            return this;
        }

        /**
         * <p>The media type of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>document</p>
         */
        public Builder mediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }

        /**
         * <p>The URI path of the OSS file. This parameter is used only when the URI is a PDS address.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/test-object.jpg</p>
         */
        public Builder OSSURI(String OSSURI) {
            this.OSSURI = OSSURI;
            return this;
        }

        /**
         * <p>The identifier of the file in the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>0939d7ed-73fa-4009-bbe6-fbbe07b92b2e</p>
         */
        public Builder objectId(String objectId) {
            this.objectId = objectId;
            return this;
        }

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1482910009923706</p>
         */
        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The project name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-project</p>
         */
        public Builder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The URI of the file.
         * The format of an OSS URI is oss\://${bucketname}/${objectname}. ${bucketname} is the name of an OSS bucket in the same region as the current project. ${objectname} is the file path.
         * The format of a PDS URI is pds\://domains/${domain}/drives/${drive}/files/${file}/revisions/${revision}.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket</p>
         */
        public Builder URI(String URI) {
            this.URI = URI;
            return this;
        }

        public ContextualFile build() {
            return new ContextualFile(this);
        } 

    } 

}
