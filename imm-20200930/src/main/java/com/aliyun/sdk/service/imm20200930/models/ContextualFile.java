// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < Element > elements;

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
    public java.util.List < Element > getElements() {
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
        private java.util.List < Element > elements; 
        private String mediaType; 
        private String OSSURI; 
        private String objectId; 
        private String ownerId; 
        private String projectName; 
        private String URI; 

        /**
         * ContentType.
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        /**
         * DatasetName.
         */
        public Builder datasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }

        /**
         * Elements.
         */
        public Builder elements(java.util.List < Element > elements) {
            this.elements = elements;
            return this;
        }

        /**
         * MediaType.
         */
        public Builder mediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }

        /**
         * OSSURI.
         */
        public Builder OSSURI(String OSSURI) {
            this.OSSURI = OSSURI;
            return this;
        }

        /**
         * ObjectId.
         */
        public Builder objectId(String objectId) {
            this.objectId = objectId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        /**
         * URI.
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
