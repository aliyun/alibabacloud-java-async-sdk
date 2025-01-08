// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link ListProjectResponseBody} extends {@link TeaModel}
 *
 * <p>ListProjectResponseBody</p>
 */
public class ListProjectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("count")
    private Long count;

    @com.aliyun.core.annotation.NameInMap("projects")
    private java.util.List<Project> projects;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private ListProjectResponseBody(Builder builder) {
        this.count = builder.count;
        this.projects = builder.projects;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * @return projects
     */
    public java.util.List<Project> getProjects() {
        return this.projects;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Long count; 
        private java.util.List<Project> projects; 
        private Long total; 

        /**
         * <p>The number of returned projects on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The projects that meet the query conditions.</p>
         */
        public Builder projects(java.util.List<Project> projects) {
            this.projects = projects;
            return this;
        }

        /**
         * <p>The total number of projects that meet the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListProjectResponseBody build() {
            return new ListProjectResponseBody(this);
        } 

    } 

}
