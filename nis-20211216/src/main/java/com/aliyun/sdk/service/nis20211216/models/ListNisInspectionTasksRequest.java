// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNisInspectionTasksRequest} extends {@link RequestModel}
 *
 * <p>ListNisInspectionTasksRequest</p>
 */
public class ListNisInspectionTasksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InspectionName")
    @com.aliyun.core.annotation.Validation(maxLength = 128, minLength = 1)
    private String inspectionName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InspectionProject")
    @com.aliyun.core.annotation.Validation(maxLength = 64, minLength = 1)
    private String inspectionProject;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InspectionTaskId")
    @com.aliyun.core.annotation.Validation(maxLength = 128, minLength = 1)
    private String inspectionTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(maxLength = 50, minLength = 1)
    private String status;

    private ListNisInspectionTasksRequest(Builder builder) {
        super(builder);
        this.inspectionName = builder.inspectionName;
        this.inspectionProject = builder.inspectionProject;
        this.inspectionTaskId = builder.inspectionTaskId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNisInspectionTasksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return inspectionName
     */
    public String getInspectionName() {
        return this.inspectionName;
    }

    /**
     * @return inspectionProject
     */
    public String getInspectionProject() {
        return this.inspectionProject;
    }

    /**
     * @return inspectionTaskId
     */
    public String getInspectionTaskId() {
        return this.inspectionTaskId;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListNisInspectionTasksRequest, Builder> {
        private String inspectionName; 
        private String inspectionProject; 
        private String inspectionTaskId; 
        private Integer maxResults; 
        private String nextToken; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListNisInspectionTasksRequest request) {
            super(request);
            this.inspectionName = request.inspectionName;
            this.inspectionProject = request.inspectionProject;
            this.inspectionTaskId = request.inspectionTaskId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.status = request.status;
        } 

        /**
         * InspectionName.
         */
        public Builder inspectionName(String inspectionName) {
            this.putQueryParameter("InspectionName", inspectionName);
            this.inspectionName = inspectionName;
            return this;
        }

        /**
         * InspectionProject.
         */
        public Builder inspectionProject(String inspectionProject) {
            this.putQueryParameter("InspectionProject", inspectionProject);
            this.inspectionProject = inspectionProject;
            return this;
        }

        /**
         * InspectionTaskId.
         */
        public Builder inspectionTaskId(String inspectionTaskId) {
            this.putQueryParameter("InspectionTaskId", inspectionTaskId);
            this.inspectionTaskId = inspectionTaskId;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListNisInspectionTasksRequest build() {
            return new ListNisInspectionTasksRequest(this);
        } 

    } 

}
