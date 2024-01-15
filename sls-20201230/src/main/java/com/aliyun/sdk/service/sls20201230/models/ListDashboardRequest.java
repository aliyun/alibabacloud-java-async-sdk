// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link ListDashboardRequest} extends {@link RequestModel}
 *
 * <p>ListDashboardRequest</p>
 */
public class ListDashboardRequest extends Request {
    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Query
    @NameInMap("offset")
    private Integer offset;

    @Query
    @NameInMap("size")
    private Integer size;

    private ListDashboardRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.offset = builder.offset;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDashboardRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return offset
     */
    public Integer getOffset() {
        return this.offset;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<ListDashboardRequest, Builder> {
        private String project; 
        private Integer offset; 
        private Integer size; 

        private Builder() {
            super();
        } 

        private Builder(ListDashboardRequest request) {
            super(request);
            this.project = request.project;
            this.offset = request.offset;
            this.size = request.size;
        } 

        /**
         * The name of the project.
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * The line from which the query starts. Default value: 0.
         */
        public Builder offset(Integer offset) {
            this.putQueryParameter("offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * The number of entries per page. Maximum value: 500. Default value: 500.
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        @Override
        public ListDashboardRequest build() {
            return new ListDashboardRequest(this);
        } 

    } 

}
