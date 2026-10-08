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
 * {@link SemanticQueryRequest} extends {@link RequestModel}
 *
 * <p>SemanticQueryRequest</p>
 */
public class SemanticQueryRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasetName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaTypes")
    private java.util.List<String> mediaTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Query")
    private String query;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceURI")
    private String sourceURI;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WithFields")
    private java.util.List<String> withFields;

    private SemanticQueryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.datasetName = builder.datasetName;
        this.maxResults = builder.maxResults;
        this.mediaTypes = builder.mediaTypes;
        this.nextToken = builder.nextToken;
        this.projectName = builder.projectName;
        this.query = builder.query;
        this.sourceURI = builder.sourceURI;
        this.withFields = builder.withFields;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SemanticQueryRequest create() {
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
     * @return datasetName
     */
    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return mediaTypes
     */
    public java.util.List<String> getMediaTypes() {
        return this.mediaTypes;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return sourceURI
     */
    public String getSourceURI() {
        return this.sourceURI;
    }

    /**
     * @return withFields
     */
    public java.util.List<String> getWithFields() {
        return this.withFields;
    }

    public static final class Builder extends Request.Builder<SemanticQueryRequest, Builder> {
        private String regionId; 
        private String datasetName; 
        private Integer maxResults; 
        private java.util.List<String> mediaTypes; 
        private String nextToken; 
        private String projectName; 
        private String query; 
        private String sourceURI; 
        private java.util.List<String> withFields; 

        private Builder() {
            super();
        } 

        private Builder(SemanticQueryRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.datasetName = request.datasetName;
            this.maxResults = request.maxResults;
            this.mediaTypes = request.mediaTypes;
            this.nextToken = request.nextToken;
            this.projectName = request.projectName;
            this.query = request.query;
            this.sourceURI = request.sourceURI;
            this.withFields = request.withFields;
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
         * <p>The name of the dataset.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-dataset</p>
         */
        public Builder datasetName(String datasetName) {
            this.putQueryParameter("DatasetName", datasetName);
            this.datasetName = datasetName;
            return this;
        }

        /**
         * <p>The maximum number of data records to return in this request. Value range: (0,100].</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The media types to search. If this parameter is left empty, the default value is:</p>
         */
        public Builder mediaTypes(java.util.List<String> mediaTypes) {
            String mediaTypesShrink = shrink(mediaTypes, "MediaTypes", "json");
            this.putQueryParameter("MediaTypes", mediaTypesShrink);
            this.mediaTypes = mediaTypes;
            return this;
        }

        /**
         * <p>This parameter is no longer provided.</p>
         * 
         * <strong>example:</strong>
         * <p>Reserved. Not supported yet.</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The name of the project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-project</p>
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p><notice>Either this parameter or the SourceURI parameter must be specified.</notice>
         * The content for semantic search.</p>
         * 
         * <strong>example:</strong>
         * <p>Scenery of Hangzhou in April 2021</p>
         */
        public Builder query(String query) {
            this.putQueryParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * <p><notice>Either this parameter or the Query parameter must be specified. This parameter is currently valid only when the search type is specified as image and the dataset is configured with a workflow template for image-to-image search.</notice>
         * The storage address of the source data used for retrieval. The storage address supports OSS URIs.</p>
         * <p>The OSS address format is oss://${Bucket}/${Object}, where ${Bucket} is the name of the OSS bucket that resides in the same region as the current project, and ${Object} is the full path of the file including the file name extension.</p>
         * <p>If you need to configure the corresponding workflow template, <a href="https://help.aliyun.com/document_detail/84454.html">contact us</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/test-object</p>
         */
        public Builder sourceURI(String sourceURI) {
            this.putQueryParameter("SourceURI", sourceURI);
            this.sourceURI = sourceURI;
            return this;
        }

        /**
         * <p>Specifies the specific fields to return instead of all existing metadata fields. This helps reduce the size of the returned struct.</p>
         * <p>If this parameter is left empty, all fields are returned.</p>
         */
        public Builder withFields(java.util.List<String> withFields) {
            String withFieldsShrink = shrink(withFields, "WithFields", "json");
            this.putQueryParameter("WithFields", withFieldsShrink);
            this.withFields = withFields;
            return this;
        }

        @Override
        public SemanticQueryRequest build() {
            return new SemanticQueryRequest(this);
        } 

    } 

}
