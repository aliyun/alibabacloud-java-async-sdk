// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ReferenceFile} extends {@link TeaModel}
 *
 * <p>ReferenceFile</p>
 */
public class ReferenceFile extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DatasetName")
    private String datasetName;

    @com.aliyun.core.annotation.NameInMap("ObjectId")
    private String objectId;

    @com.aliyun.core.annotation.NameInMap("ProjectName")
    private String projectName;

    @com.aliyun.core.annotation.NameInMap("URI")
    private String URI;

    private ReferenceFile(Builder builder) {
        this.datasetName = builder.datasetName;
        this.objectId = builder.objectId;
        this.projectName = builder.projectName;
        this.URI = builder.URI;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReferenceFile create() {
        return builder().build();
    }

    /**
     * @return datasetName
     */
    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * @return objectId
     */
    public String getObjectId() {
        return this.objectId;
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
        private String datasetName; 
        private String objectId; 
        private String projectName; 
        private String URI; 

        /**
         * DatasetName.
         */
        public Builder datasetName(String datasetName) {
            this.datasetName = datasetName;
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

        public ReferenceFile build() {
            return new ReferenceFile(this);
        } 

    } 

}
