// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link ListDocumentRetrieveRequest} extends {@link RequestModel}
 *
 * <p>ListDocumentRetrieveRequest</p>
 */
public class ListDocumentRetrieveRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContentType")
    private String contentType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ElementScope")
    private String elementScope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private String endDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Office")
    private String office;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Query")
    private String query;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartDate")
    private String startDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SubContentType")
    private String subContentType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SubjectClassify")
    private String subjectClassify;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WordSize")
    private String wordSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private ListDocumentRetrieveRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.contentType = builder.contentType;
        this.elementScope = builder.elementScope;
        this.endDate = builder.endDate;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.office = builder.office;
        this.query = builder.query;
        this.region = builder.region;
        this.source = builder.source;
        this.startDate = builder.startDate;
        this.subContentType = builder.subContentType;
        this.subjectClassify = builder.subjectClassify;
        this.wordSize = builder.wordSize;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDocumentRetrieveRequest create() {
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
     * @return contentType
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * @return elementScope
     */
    public String getElementScope() {
        return this.elementScope;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
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
     * @return office
     */
    public String getOffice() {
        return this.office;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return subContentType
     */
    public String getSubContentType() {
        return this.subContentType;
    }

    /**
     * @return subjectClassify
     */
    public String getSubjectClassify() {
        return this.subjectClassify;
    }

    /**
     * @return wordSize
     */
    public String getWordSize() {
        return this.wordSize;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListDocumentRetrieveRequest, Builder> {
        private String regionId; 
        private String contentType; 
        private String elementScope; 
        private String endDate; 
        private Integer maxResults; 
        private String nextToken; 
        private String office; 
        private String query; 
        private String region; 
        private String source; 
        private String startDate; 
        private String subContentType; 
        private String subjectClassify; 
        private String wordSize; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListDocumentRetrieveRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.contentType = request.contentType;
            this.elementScope = request.elementScope;
            this.endDate = request.endDate;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.office = request.office;
            this.query = request.query;
            this.region = request.region;
            this.source = request.source;
            this.startDate = request.startDate;
            this.subContentType = request.subContentType;
            this.subjectClassify = request.subjectClassify;
            this.wordSize = request.wordSize;
            this.workspaceId = request.workspaceId;
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
         * ContentType.
         */
        public Builder contentType(String contentType) {
            this.putBodyParameter("ContentType", contentType);
            this.contentType = contentType;
            return this;
        }

        /**
         * ElementScope.
         */
        public Builder elementScope(String elementScope) {
            this.putBodyParameter("ElementScope", elementScope);
            this.elementScope = elementScope;
            return this;
        }

        /**
         * EndDate.
         */
        public Builder endDate(String endDate) {
            this.putBodyParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Office.
         */
        public Builder office(String office) {
            this.putBodyParameter("Office", office);
            this.office = office;
            return this;
        }

        /**
         * Query.
         */
        public Builder query(String query) {
            this.putBodyParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putBodyParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putBodyParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.putBodyParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * SubContentType.
         */
        public Builder subContentType(String subContentType) {
            this.putBodyParameter("SubContentType", subContentType);
            this.subContentType = subContentType;
            return this;
        }

        /**
         * SubjectClassify.
         */
        public Builder subjectClassify(String subjectClassify) {
            this.putBodyParameter("SubjectClassify", subjectClassify);
            this.subjectClassify = subjectClassify;
            return this;
        }

        /**
         * WordSize.
         */
        public Builder wordSize(String wordSize) {
            this.putBodyParameter("WordSize", wordSize);
            this.wordSize = wordSize;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListDocumentRetrieveRequest build() {
            return new ListDocumentRetrieveRequest(this);
        } 

    } 

}
