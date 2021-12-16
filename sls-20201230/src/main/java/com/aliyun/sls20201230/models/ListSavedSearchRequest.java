// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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

    public static final class Builder extends Request.Builder<Builder> {
        private Integer offset; 
        private String project; 
        private Integer size; 

        /**
         * <p>offset.</p>
         */
        public Builder offset(Integer offset) {
            this.putQueryParameter("offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * <p>A short description of struct</p>
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>size.</p>
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        public ListSavedSearchRequest build() {
            return new ListSavedSearchRequest(this);
        } 

    } 

}
