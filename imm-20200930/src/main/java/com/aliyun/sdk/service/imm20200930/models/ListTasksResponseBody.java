// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListTasksResponseBody</p>
 */
public class ListTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private String maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("ProjectName")
    private String projectName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Tasks")
    private java.util.List < TaskInfo > tasks;

    private ListTasksResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.projectName = builder.projectName;
        this.requestId = builder.requestId;
        this.tasks = builder.tasks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTasksResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxResults
     */
    public String getMaxResults() {
        return this.maxResults;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tasks
     */
    public java.util.List < TaskInfo > getTasks() {
        return this.tasks;
    }

    public static final class Builder {
        private String maxResults; 
        private String nextToken; 
        private String projectName; 
        private String requestId; 
        private java.util.List < TaskInfo > tasks; 

        /**
         * <p>The length of the returned result list.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder maxResults(String maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token. The pagination token is used in the next request to retrieve a new page of results if the total number of results exceeds the value of the MaxResults parameter. This parameter has a value only when not all results are returned.</p>
         * <p>You can specify the value of the NextToken parameter in the next request to list remaining results.</p>
         * 
         * <strong>example:</strong>
         * <p>MTIzNDU2Nzg6aW1tdGVzdDpleGFtcGxlYnVja2V0OmRhdGFzZXQwMDE6b3NzOi8vZXhhbXBsZWJ1Y2tldC9zYW1wbGVvYmplY3QxLmpwZw==</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The name of the project.</p>
         * 
         * <strong>example:</strong>
         * <p>immtest</p>
         */
        public Builder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9847E7D0-A9A3-0053-84C6-BA16FFFA726E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The tasks.</p>
         */
        public Builder tasks(java.util.List < TaskInfo > tasks) {
            this.tasks = tasks;
            return this;
        }

        public ListTasksResponseBody build() {
            return new ListTasksResponseBody(this);
        } 

    } 

}
