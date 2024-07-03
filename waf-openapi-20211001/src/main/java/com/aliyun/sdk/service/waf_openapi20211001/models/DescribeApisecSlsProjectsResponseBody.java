// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApisecSlsProjectsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApisecSlsProjectsResponseBody</p>
 */
public class DescribeApisecSlsProjectsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Projects")
    private java.util.List < String > projects;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeApisecSlsProjectsResponseBody(Builder builder) {
        this.projects = builder.projects;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApisecSlsProjectsResponseBody create() {
        return builder().build();
    }

    /**
     * @return projects
     */
    public java.util.List < String > getProjects() {
        return this.projects;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > projects; 
        private String requestId; 

        /**
         * The names of the projects in Simple Log Service.
         */
        public Builder projects(java.util.List < String > projects) {
            this.projects = projects;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeApisecSlsProjectsResponseBody build() {
            return new DescribeApisecSlsProjectsResponseBody(this);
        } 

    } 

}
