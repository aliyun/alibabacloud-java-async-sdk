// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link ListProjectResponseBody} extends {@link TeaModel}
 *
 * <p>ListProjectResponseBody</p>
 */
public class ListProjectResponseBody extends TeaModel {
    @NameInMap("count")
    private Long count;

    @NameInMap("projects")
    private java.util.List < Project > projects;

    @NameInMap("total")
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
    public java.util.List < Project > getProjects() {
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
        private java.util.List < Project > projects; 
        private Long total; 

        /**
         * count.
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * projects.
         */
        public Builder projects(java.util.List < Project > projects) {
            this.projects = projects;
            return this;
        }

        /**
         * total.
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
