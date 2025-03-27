// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeApisecSlsProjectsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApisecSlsProjectsResponseBody</p>
 */
public class DescribeApisecSlsProjectsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Projects")
    private java.util.List<String> projects;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projects
     */
    public java.util.List<String> getProjects() {
        return this.projects;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> projects; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeApisecSlsProjectsResponseBody model) {
            this.projects = model.projects;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The names of the projects in Simple Log Service.</p>
         */
        public Builder projects(java.util.List<String> projects) {
            this.projects = projects;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D7861F61-5B61-46CE-A47C-6B19****5EB0</p>
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
