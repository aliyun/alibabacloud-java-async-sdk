// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
    private java.util.List < String > mediaTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Query")
    @com.aliyun.core.annotation.Validation(required = true)
    private String query;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WithFields")
    private java.util.List < String > withFields;

    private SemanticQueryRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.datasetName = builder.datasetName;
        this.maxResults = builder.maxResults;
        this.mediaTypes = builder.mediaTypes;
        this.nextToken = builder.nextToken;
        this.projectName = builder.projectName;
        this.query = builder.query;
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
    public java.util.List < String > getMediaTypes() {
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
     * @return withFields
     */
    public java.util.List < String > getWithFields() {
        return this.withFields;
    }

    public static final class Builder extends Request.Builder<SemanticQueryRequest, Builder> {
        private String regionId; 
        private String datasetName; 
        private Integer maxResults; 
        private java.util.List < String > mediaTypes; 
        private String nextToken; 
        private String projectName; 
        private String query; 
        private java.util.List < String > withFields; 

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
         * <p>immDatatest</p>
         */
        public Builder datasetName(String datasetName) {
            this.putQueryParameter("DatasetName", datasetName);
            this.datasetName = datasetName;
            return this;
        }

        /**
         * <p>The maximum number of entries to return. Valid values: 1 to 1000.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The types of the media that you want to query. Default value:</p>
         * <p>[&quot;image&quot;]</p>
         */
        public Builder mediaTypes(java.util.List < String > mediaTypes) {
            String mediaTypesShrink = shrink(mediaTypes, "MediaTypes", "json");
            this.putQueryParameter("MediaTypes", mediaTypesShrink);
            this.mediaTypes = mediaTypes;
            return this;
        }

        /**
         * <p>This parameter is no longer available.</p>
         * 
         * <strong>example:</strong>
         * <p>MTIzNDU2Nzg6aW1tdGVzdDpleGFtcGxlYnVja2V0OmRhdGFzZXQwMDE6b3NzOi8vZXhhbXBsZWJ1Y2tldC9zYW1wbGVvYmplY3QxLmpwZw==</p>
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
         * <p>immtest</p>
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The content of the query that you input.</p>
         * <p>This parameter is required.</p>
         */
        public Builder query(String query) {
            this.putQueryParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * <p>The fields that you want to include in the response. Including only necessary metadata fields can help reduce the size of the response.</p>
         * <p>If you do not specify this parameter or set the value to null, all existing metadata fields are returned.</p>
         */
        public Builder withFields(java.util.List < String > withFields) {
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
