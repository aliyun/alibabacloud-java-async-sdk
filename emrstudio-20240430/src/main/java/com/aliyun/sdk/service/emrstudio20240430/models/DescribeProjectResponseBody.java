// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emrstudio20240430.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeProjectResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeProjectResponseBody</p>
 */
public class DescribeProjectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("description")
    @com.aliyun.core.annotation.Validation(required = true)
    private String description;

    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.NameInMap("projectId")
    private String projectId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private DescribeProjectResponseBody(Builder builder) {
        this.description = builder.description;
        this.name = builder.name;
        this.projectId = builder.projectId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProjectResponseBody create() {
        return builder().build();
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String description; 
        private String name; 
        private String projectId; 
        private String requestId; 

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * projectId.
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeProjectResponseBody build() {
            return new DescribeProjectResponseBody(this);
        } 

    } 

}
