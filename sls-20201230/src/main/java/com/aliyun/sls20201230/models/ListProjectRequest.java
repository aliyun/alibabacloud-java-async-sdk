// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListProjectRequest} extends {@link RequestModel}
 *
 * <p>ListProjectRequest</p>
 */
public class ListProjectRequest extends Request {
    @Query
    @NameInMap("offset")
    private Integer offset;

    @Query
    @NameInMap("projectName")
    private String projectName;

    @Query
    @NameInMap("size")
    private Integer size;


    private ListProjectRequest(Builder builder) {
        super(builder);
        this.offset = builder.offset;
        this.projectName = builder.projectName;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectRequest create() {
        return builder().build();
    }

    /**
     * @return offset
     */
    public Integer getOffset() {
        return this.offset;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private Integer offset; 
        private String projectName; 
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
         * <p>projectName.</p>
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("projectName", projectName);
            this.projectName = projectName;
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

        public ListProjectRequest build() {
            return new ListProjectRequest(this);
        } 

    } 

}
