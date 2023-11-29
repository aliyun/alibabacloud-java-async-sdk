// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link ListMachineGroupRequest} extends {@link RequestModel}
 *
 * <p>ListMachineGroupRequest</p>
 */
public class ListMachineGroupRequest extends Request {
    @Host
    @NameInMap("project")
    @Validation(required = true)
    private String project;

    @Query
    @NameInMap("groupName")
    private String groupName;

    @Query
    @NameInMap("offset")
    private Integer offset;

    @Query
    @NameInMap("size")
    private Integer size;

    private ListMachineGroupRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.groupName = builder.groupName;
        this.offset = builder.offset;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMachineGroupRequest create() {
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
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
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

    public static final class Builder extends Request.Builder<ListMachineGroupRequest, Builder> {
        private String project; 
        private String groupName; 
        private Integer offset; 
        private Integer size; 

        private Builder() {
            super();
        } 

        private Builder(ListMachineGroupRequest request) {
            super(request);
            this.project = request.project;
            this.groupName = request.groupName;
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
         * The name of the machine group. This parameter is used to filter machine groups. Partial match is supported.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("groupName", groupName);
            this.groupName = groupName;
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
         * The number of entries per page. Maximum value: 500.
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        @Override
        public ListMachineGroupRequest build() {
            return new ListMachineGroupRequest(this);
        } 

    } 

}
