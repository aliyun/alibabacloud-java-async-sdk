// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProjectsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProjectsResponseBody</p>
 */
public class ListProjectsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("Projects")
    private java.util.List < Project > projects;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListProjectsResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.projects = builder.projects;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectsResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return projects
     */
    public java.util.List < Project > getProjects() {
        return this.projects;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String nextToken; 
        private java.util.List < Project > projects; 
        private String requestId; 

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Projects.
         */
        public Builder projects(java.util.List < Project > projects) {
            this.projects = projects;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListProjectsResponseBody build() {
            return new ListProjectsResponseBody(this);
        } 

    } 

}
