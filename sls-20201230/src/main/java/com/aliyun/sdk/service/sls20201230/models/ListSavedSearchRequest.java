// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link ListSavedSearchRequest} extends {@link RequestModel}
 *
 * <p>ListSavedSearchRequest</p>
 */
public class ListSavedSearchRequest extends Request {
    @Query
    @NameInMap("offset")
    private Integer offset;

    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Query
    @NameInMap("size")
    private Integer size;

    private ListSavedSearchRequest(Builder builder) {
        super(builder);
        this.offset = builder.offset;
        this.project = builder.project;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSavedSearchRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return offset
     */
    public Integer getOffset() {
        return this.offset;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<ListSavedSearchRequest, Builder> {
        private Integer offset; 
        private String project; 
        private Integer size; 

        private Builder() {
            super();
        } 

        private Builder(ListSavedSearchRequest request) {
            super(request);
            this.offset = request.offset;
            this.project = request.project;
            this.size = request.size;
        } 

        /**
         * offset.
         */
        public Builder offset(Integer offset) {
            this.putQueryParameter("offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * A short description of struct
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * size.
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        @Override
        public ListSavedSearchRequest build() {
            return new ListSavedSearchRequest(this);
        } 

    } 

}
