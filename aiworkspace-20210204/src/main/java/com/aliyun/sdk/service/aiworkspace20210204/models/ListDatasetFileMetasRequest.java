// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link ListDatasetFileMetasRequest} extends {@link RequestModel}
 *
 * <p>ListDatasetFileMetasRequest</p>
 */
public class ListDatasetFileMetasRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("DatasetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasetFileMetaIds")
    private java.util.List<String> datasetFileMetaIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasetVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndFileUpdateTime")
    private String endFileUpdateTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTagUpdateTime")
    private String endTagUpdateTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @Deprecated
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryContentTypeIncludeAny")
    private java.util.List<String> queryContentTypeIncludeAny;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryExpression")
    private String queryExpression;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryFileDir")
    private String queryFileDir;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryFileName")
    private String queryFileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryFileTypeIncludeAny")
    private java.util.List<String> queryFileTypeIncludeAny;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryImage")
    private String queryImage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryTagsExclude")
    private java.util.List<String> queryTagsExclude;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryTagsIncludeAll")
    private java.util.List<String> queryTagsIncludeAll;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryTagsIncludeAny")
    private java.util.List<String> queryTagsIncludeAny;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryText")
    private String queryText;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryType")
    private String queryType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryVideo")
    private String queryVideo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScoreThreshold")
    private Float scoreThreshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartFileUpdateTime")
    private String startFileUpdateTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTagUpdateTime")
    private String startTagUpdateTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThumbnailMode")
    private String thumbnailMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopK")
    @com.aliyun.core.annotation.Validation(maximum = 5000, minimum = 1)
    private Integer topK;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private ListDatasetFileMetasRequest(Builder builder) {
        super(builder);
        this.datasetId = builder.datasetId;
        this.datasetFileMetaIds = builder.datasetFileMetaIds;
        this.datasetVersion = builder.datasetVersion;
        this.endFileUpdateTime = builder.endFileUpdateTime;
        this.endTagUpdateTime = builder.endTagUpdateTime;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.order = builder.order;
        this.pageSize = builder.pageSize;
        this.queryContentTypeIncludeAny = builder.queryContentTypeIncludeAny;
        this.queryExpression = builder.queryExpression;
        this.queryFileDir = builder.queryFileDir;
        this.queryFileName = builder.queryFileName;
        this.queryFileTypeIncludeAny = builder.queryFileTypeIncludeAny;
        this.queryImage = builder.queryImage;
        this.queryTagsExclude = builder.queryTagsExclude;
        this.queryTagsIncludeAll = builder.queryTagsIncludeAll;
        this.queryTagsIncludeAny = builder.queryTagsIncludeAny;
        this.queryText = builder.queryText;
        this.queryType = builder.queryType;
        this.queryVideo = builder.queryVideo;
        this.scoreThreshold = builder.scoreThreshold;
        this.sortBy = builder.sortBy;
        this.startFileUpdateTime = builder.startFileUpdateTime;
        this.startTagUpdateTime = builder.startTagUpdateTime;
        this.status = builder.status;
        this.thumbnailMode = builder.thumbnailMode;
        this.topK = builder.topK;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDatasetFileMetasRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return datasetId
     */
    public String getDatasetId() {
        return this.datasetId;
    }

    /**
     * @return datasetFileMetaIds
     */
    public java.util.List<String> getDatasetFileMetaIds() {
        return this.datasetFileMetaIds;
    }

    /**
     * @return datasetVersion
     */
    public String getDatasetVersion() {
        return this.datasetVersion;
    }

    /**
     * @return endFileUpdateTime
     */
    public String getEndFileUpdateTime() {
        return this.endFileUpdateTime;
    }

    /**
     * @return endTagUpdateTime
     */
    public String getEndTagUpdateTime() {
        return this.endTagUpdateTime;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return queryContentTypeIncludeAny
     */
    public java.util.List<String> getQueryContentTypeIncludeAny() {
        return this.queryContentTypeIncludeAny;
    }

    /**
     * @return queryExpression
     */
    public String getQueryExpression() {
        return this.queryExpression;
    }

    /**
     * @return queryFileDir
     */
    public String getQueryFileDir() {
        return this.queryFileDir;
    }

    /**
     * @return queryFileName
     */
    public String getQueryFileName() {
        return this.queryFileName;
    }

    /**
     * @return queryFileTypeIncludeAny
     */
    public java.util.List<String> getQueryFileTypeIncludeAny() {
        return this.queryFileTypeIncludeAny;
    }

    /**
     * @return queryImage
     */
    public String getQueryImage() {
        return this.queryImage;
    }

    /**
     * @return queryTagsExclude
     */
    public java.util.List<String> getQueryTagsExclude() {
        return this.queryTagsExclude;
    }

    /**
     * @return queryTagsIncludeAll
     */
    public java.util.List<String> getQueryTagsIncludeAll() {
        return this.queryTagsIncludeAll;
    }

    /**
     * @return queryTagsIncludeAny
     */
    public java.util.List<String> getQueryTagsIncludeAny() {
        return this.queryTagsIncludeAny;
    }

    /**
     * @return queryText
     */
    public String getQueryText() {
        return this.queryText;
    }

    /**
     * @return queryType
     */
    public String getQueryType() {
        return this.queryType;
    }

    /**
     * @return queryVideo
     */
    public String getQueryVideo() {
        return this.queryVideo;
    }

    /**
     * @return scoreThreshold
     */
    public Float getScoreThreshold() {
        return this.scoreThreshold;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return startFileUpdateTime
     */
    public String getStartFileUpdateTime() {
        return this.startFileUpdateTime;
    }

    /**
     * @return startTagUpdateTime
     */
    public String getStartTagUpdateTime() {
        return this.startTagUpdateTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return thumbnailMode
     */
    public String getThumbnailMode() {
        return this.thumbnailMode;
    }

    /**
     * @return topK
     */
    public Integer getTopK() {
        return this.topK;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListDatasetFileMetasRequest, Builder> {
        private String datasetId; 
        private java.util.List<String> datasetFileMetaIds; 
        private String datasetVersion; 
        private String endFileUpdateTime; 
        private String endTagUpdateTime; 
        private Integer maxResults; 
        private String nextToken; 
        private String order; 
        private Integer pageSize; 
        private java.util.List<String> queryContentTypeIncludeAny; 
        private String queryExpression; 
        private String queryFileDir; 
        private String queryFileName; 
        private java.util.List<String> queryFileTypeIncludeAny; 
        private String queryImage; 
        private java.util.List<String> queryTagsExclude; 
        private java.util.List<String> queryTagsIncludeAll; 
        private java.util.List<String> queryTagsIncludeAny; 
        private String queryText; 
        private String queryType; 
        private String queryVideo; 
        private Float scoreThreshold; 
        private String sortBy; 
        private String startFileUpdateTime; 
        private String startTagUpdateTime; 
        private String status; 
        private String thumbnailMode; 
        private Integer topK; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListDatasetFileMetasRequest request) {
            super(request);
            this.datasetId = request.datasetId;
            this.datasetFileMetaIds = request.datasetFileMetaIds;
            this.datasetVersion = request.datasetVersion;
            this.endFileUpdateTime = request.endFileUpdateTime;
            this.endTagUpdateTime = request.endTagUpdateTime;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.order = request.order;
            this.pageSize = request.pageSize;
            this.queryContentTypeIncludeAny = request.queryContentTypeIncludeAny;
            this.queryExpression = request.queryExpression;
            this.queryFileDir = request.queryFileDir;
            this.queryFileName = request.queryFileName;
            this.queryFileTypeIncludeAny = request.queryFileTypeIncludeAny;
            this.queryImage = request.queryImage;
            this.queryTagsExclude = request.queryTagsExclude;
            this.queryTagsIncludeAll = request.queryTagsIncludeAll;
            this.queryTagsIncludeAny = request.queryTagsIncludeAny;
            this.queryText = request.queryText;
            this.queryType = request.queryType;
            this.queryVideo = request.queryVideo;
            this.scoreThreshold = request.scoreThreshold;
            this.sortBy = request.sortBy;
            this.startFileUpdateTime = request.startFileUpdateTime;
            this.startTagUpdateTime = request.startTagUpdateTime;
            this.status = request.status;
            this.thumbnailMode = request.thumbnailMode;
            this.topK = request.topK;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The dataset ID. For information about how to obtain the dataset ID, see <a href="https://help.aliyun.com/document_detail/457222.html">ListDatasets</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d-rbvg5*****jhc9ks92</p>
         */
        public Builder datasetId(String datasetId) {
            this.putPathParameter("DatasetId", datasetId);
            this.datasetId = datasetId;
            return this;
        }

        /**
         * <p>The list of metadata IDs to query.</p>
         */
        public Builder datasetFileMetaIds(java.util.List<String> datasetFileMetaIds) {
            String datasetFileMetaIdsShrink = shrink(datasetFileMetaIds, "DatasetFileMetaIds", "simple");
            this.putQueryParameter("DatasetFileMetaIds", datasetFileMetaIdsShrink);
            this.datasetFileMetaIds = datasetFileMetaIds;
            return this;
        }

        /**
         * <p>The dataset version name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder datasetVersion(String datasetVersion) {
            this.putQueryParameter("DatasetVersion", datasetVersion);
            this.datasetVersion = datasetVersion;
            return this;
        }

        /**
         * <p>The start time of the file update time range for the query. The value is a UTC timestamp in ISO 8601 format.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-12T14:36:01.000Z</p>
         */
        public Builder endFileUpdateTime(String endFileUpdateTime) {
            this.putQueryParameter("EndFileUpdateTime", endFileUpdateTime);
            this.endFileUpdateTime = endFileUpdateTime;
            return this;
        }

        /**
         * <p>The end time of the tag last update time range for the query. The value is a UTC timestamp in ISO 8601 format.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-12T14:36:01.000Z</p>
         */
        public Builder endTagUpdateTime(String endTagUpdateTime) {
            this.putQueryParameter("EndTagUpdateTime", endTagUpdateTime);
            this.endTagUpdateTime = endTagUpdateTime;
            return this;
        }

        /**
         * <p>The maximum number of results to return per request when using NextToken-based pagination. Valid values: 1 to 100. Default value: 10.</p>
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
         * <p>The pagination token.</p>
         * <blockquote>
         * <p>If this parameter is not specified, the first page of data is returned. If a value is returned for this parameter, more pages are available. Pass the returned NextToken value as a request parameter to retrieve the next page, until no NextToken value is returned, which indicates that all data has been retrieved.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>90a6ee35-****-4cd4-927e-1f45e1cb8b62_1729644433000</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The sorting order for the specified sorting field in paging queries. Used together with SortBy. Default value: DESC. Valid values:</p>
         * <ul>
         * <li>ASC: ascending order.</li>
         * <li>DESC: descending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DESC</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The number of entries per page. If MaxResults is also specified, MaxResults takes precedence.</p>
         * <blockquote>
         * <p>This parameter will be offline soon. Use NextToken and MaxResults to perform paging query operations.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The search condition for &quot;include any of the following content types&quot;. You can select multiple content types, and the query results need to match only one of them. If this parameter is empty, this condition is not applied. Array elements are separated by commas.</p>
         */
        public Builder queryContentTypeIncludeAny(java.util.List<String> queryContentTypeIncludeAny) {
            String queryContentTypeIncludeAnyShrink = shrink(queryContentTypeIncludeAny, "QueryContentTypeIncludeAny", "simple");
            this.putQueryParameter("QueryContentTypeIncludeAny", queryContentTypeIncludeAnyShrink);
            this.queryContentTypeIncludeAny = queryContentTypeIncludeAny;
            return this;
        }

        /**
         * <p>The query statement (DSL) is a realm-specific language for expressing complex retrieve conditions. It supports grouping, Boolean logic (AND/OR/NOT), range comparisons (&gt;, &gt;=, &lt;, &lt;=), property existence checks (HAS/NOT HAS), token match (:), and exact match (=), which are suitable for advanced retrieve scenarios.
         * This parameter is typically used for complex advanced retrieve conditional statements.
         * <notice>To avoid conflicts, after setting this query statement, do not use it together with other query parameters.</notice></p>
         * 
         * <strong>example:</strong>
         * <p>(FileUpdateTime &gt; \&quot;2025-02-28T00:00:00Z\&quot; AND FileUpdateTime &lt; \&quot;2025-05-30T09:27:29Z\&quot;) AND FileDir:\&quot;blue_car\&quot; AND NOT FileName=&quot;toyota.jpg&quot; AND (( Tags.all=\&quot;lane line\&quot; AND Tags.all=\&quot;barrier gate\&quot;) OR NOT Tags.user=\&quot;rainy days\&quot; ) AND HAS SemanticIndexJobId AND Content:\&quot;a fallen water horse\&quot; AND TopK=100 AND SignMode=\&quot;PUBLIC\&quot;</p>
         */
        public Builder queryExpression(String queryExpression) {
            this.putQueryParameter("QueryExpression", queryExpression);
            this.queryExpression = queryExpression;
            return this;
        }

        /**
         * <p>The file directory search condition. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>cars/20250221/</p>
         */
        public Builder queryFileDir(String queryFileDir) {
            this.putQueryParameter("QueryFileDir", queryFileDir);
            this.queryFileDir = queryFileDir;
            return this;
        }

        /**
         * <p>The file name search condition. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>car</p>
         */
        public Builder queryFileName(String queryFileName) {
            this.putQueryParameter("QueryFileName", queryFileName);
            this.queryFileName = queryFileName;
            return this;
        }

        /**
         * <p>The search condition for &quot;include any of the following file types&quot;. You can select multiple file types, and the query results need to match only one of them. If this parameter is empty, this condition is not applied. Array elements are separated by commas.</p>
         */
        public Builder queryFileTypeIncludeAny(java.util.List<String> queryFileTypeIncludeAny) {
            String queryFileTypeIncludeAnyShrink = shrink(queryFileTypeIncludeAny, "QueryFileTypeIncludeAny", "simple");
            this.putQueryParameter("QueryFileTypeIncludeAny", queryFileTypeIncludeAnyShrink);
            this.queryFileTypeIncludeAny = queryFileTypeIncludeAny;
            return this;
        }

        /**
         * <p>The image information for image-to-image search.</p>
         * <ul>
         * <li>An OSS URL with public network access is supported. Format: oss://{bucket_name}/{object_path}, where bucket_name is the bucket name and object_path is the file path in the bucket.<blockquote>
         * <p>This parameter takes effect only when QueryType is set to VECTOR or MIX.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss://test-xxx-oss/car/0001.png</p>
         */
        public Builder queryImage(String queryImage) {
            this.putQueryParameter("QueryImage", queryImage);
            this.queryImage = queryImage;
            return this;
        }

        /**
         * <p>The search condition for &quot;exclude the following tags&quot;. You can select multiple tags, and the query results must not contain any of them. If this parameter is empty, this condition is not applied.</p>
         * <blockquote>
         * <p>This parameter takes effect only when QueryType is set to TAG or MIX.</p>
         * </blockquote>
         */
        public Builder queryTagsExclude(java.util.List<String> queryTagsExclude) {
            String queryTagsExcludeShrink = shrink(queryTagsExclude, "QueryTagsExclude", "simple");
            this.putQueryParameter("QueryTagsExclude", queryTagsExcludeShrink);
            this.queryTagsExclude = queryTagsExclude;
            return this;
        }

        /**
         * <p>The search condition for &quot;include all of the following tags&quot;. You can select multiple tags, and the query results must match all of them. If this parameter is empty, this condition is not applied. Array elements are separated by commas.</p>
         * <blockquote>
         * <p>This parameter takes effect only when QueryType is set to TAG or MIX. When QueryType is set to TAG, the value of QueryText is added to this condition.</p>
         * </blockquote>
         */
        public Builder queryTagsIncludeAll(java.util.List<String> queryTagsIncludeAll) {
            String queryTagsIncludeAllShrink = shrink(queryTagsIncludeAll, "QueryTagsIncludeAll", "simple");
            this.putQueryParameter("QueryTagsIncludeAll", queryTagsIncludeAllShrink);
            this.queryTagsIncludeAll = queryTagsIncludeAll;
            return this;
        }

        /**
         * <p>The search condition for &quot;include any of the following tags&quot;. You can select multiple tags, and the query results need to match only one of them. If this parameter is empty, this condition is not applied. Array elements are separated by commas.</p>
         * <blockquote>
         * <p>This parameter takes effect only when QueryType is set to TAG or MIX.</p>
         * </blockquote>
         */
        public Builder queryTagsIncludeAny(java.util.List<String> queryTagsIncludeAny) {
            String queryTagsIncludeAnyShrink = shrink(queryTagsIncludeAny, "QueryTagsIncludeAny", "simple");
            this.putQueryParameter("QueryTagsIncludeAny", queryTagsIncludeAnyShrink);
            this.queryTagsIncludeAny = queryTagsIncludeAny;
            return this;
        }

        /**
         * <p>The text content to search for.</p>
         * 
         * <strong>example:</strong>
         * <p>A fallen water</p>
         */
        public Builder queryText(String queryText) {
            this.putQueryParameter("QueryText", queryText);
            this.queryText = queryText;
            return this;
        }

        /**
         * <p>The retrieve type. Valid values:</p>
         * <ul>
         * <li>MIX: hybrid retrieve (default).</li>
         * <li>TAG: label-only retrieve.</li>
         * <li>VECTOR: AISearch-only retrieve.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MIX</p>
         */
        public Builder queryType(String queryType) {
            this.putQueryParameter("QueryType", queryType);
            this.queryType = queryType;
            return this;
        }

        /**
         * <p>The video file information for video-based search.</p>
         * <ul>
         * <li>A video OSS URL with public network access is supported. Format: oss://{bucket_name}/{object_path}, where bucket_name is the bucket name and object_path is the file path in the bucket.<blockquote>
         * <p>This parameter takes effect only when QueryType is set to VECTOR or MIX.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss://test-xxx-oss/car/0001.mp4</p>
         */
        public Builder queryVideo(String queryVideo) {
            this.putQueryParameter("QueryVideo", queryVideo);
            this.queryVideo = queryVideo;
            return this;
        }

        /**
         * <p>The similarity score threshold. Only results with a score greater than ScoreThreshold are returned.</p>
         * <blockquote>
         * <p>This parameter takes effect only when QueryType is set to VECTOR or MIX.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0.6</p>
         */
        public Builder scoreThreshold(Float scoreThreshold) {
            this.putQueryParameter("ScoreThreshold", scoreThreshold);
            this.scoreThreshold = scoreThreshold;
            return this;
        }

        /**
         * <p>The sorting field for paging queries. By default, results are sorted by retrieve relevance in descending order. Other valid values:</p>
         * <ul>
         * <li>FileCreateTime: sorting by file creation time.</li>
         * <li>FileUpdateTime: sorting by file last modified time.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FileCreateTime</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The end time of the file update time range for the query. The value is a UTC timestamp in ISO 8601 format.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-12T14:36:01.000Z</p>
         */
        public Builder startFileUpdateTime(String startFileUpdateTime) {
            this.putQueryParameter("StartFileUpdateTime", startFileUpdateTime);
            this.startFileUpdateTime = startFileUpdateTime;
            return this;
        }

        /**
         * <p>The start time of the tag last update time range for the query. The value is a UTC timestamp in ISO 8601 format.</p>
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-12T14:36:01.000Z</p>
         */
        public Builder startTagUpdateTime(String startTagUpdateTime) {
            this.putQueryParameter("StartTagUpdateTime", startTagUpdateTime);
            this.startTagUpdateTime = startTagUpdateTime;
            return this;
        }

        /**
         * <p>The metadata status to query. Valid values:</p>
         * <ul>
         * <li>ACTIVE: queries only non-deleted data (default).</li>
         * <li>ALL: queries all data.</li>
         * <li>DELETED: queries only logically deleted data.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The thumbnail mode for images. Currently, only OSS files support thumbnails:</p>
         * <ul>
         * <li>Proportional scaling: p_{percentage}, where percentage specifies the desired scaling ratio. Valid values: [1, 100]. Example: p_50 uses 50% of the original file size as the thumbnail.</li>
         * <li>Fixed width with adaptive height: w_{width}, where width specifies the desired image width. Valid values: [1, 16384]. Example: w_200 fixes the image width to 200 pixels and adaptively scales the height.</li>
         * <li>Fixed height with adaptive width: h_{height}, where height specifies the desired image height. Valid values: [1, 16384]. Example: h_100 fixes the image height to 100 pixels and adaptively scales the width.</li>
         * <li>Fixed dimensions with padding: m_pad,w_{width},h_{height},color_{RGB}. m_pad scales the image to the largest size that fits within the specified width and height rectangle. RGB specifies the fill color for blank areas. If this parameter is not specified, white is used by default. width specifies the desired image width and height specifies the desired image height. Valid values for both width and height: [1, 16384]. Example:</li>
         * <li>Fixed dimensions with center cropping: m_fill,w_{width},h_{height}. m_fill proportionally scales the image to the smallest size that extends beyond the specified width and height rectangle, and center-crops the excess. width specifies the desired image width and height specifies the desired image height. Valid values for both width and height: [1, 16384]. Example: m_fill,w_100,h_100 fixes both the width and height to 100 pixels with center cropping.</li>
         * <li>Forced dimensions: m_fixed,w_{width},h_{height}. width specifies the desired image width and height specifies the desired image height. Valid values for both width and height: [1, 16384]. Example: m_fixed,w_100,h_100 forces both the width and height to 100 pixels.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>w_100</p>
         */
        public Builder thumbnailMode(String thumbnailMode) {
            this.putQueryParameter("ThumbnailMode", thumbnailMode);
            this.thumbnailMode = thumbnailMode;
            return this;
        }

        /**
         * <p>The maximum number of results to return. Only the top K results are returned.</p>
         * <blockquote>
         * <p>This parameter takes effect only when QueryType is set to VECTOR or MIX.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder topK(Integer topK) {
            this.putQueryParameter("TopK", topK);
            this.topK = topK;
            return this;
        }

        /**
         * <p>The workspace ID of the dataset. For information about how to obtain the workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>105173</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListDatasetFileMetasRequest build() {
            return new ListDatasetFileMetasRequest(this);
        } 

    } 

}
