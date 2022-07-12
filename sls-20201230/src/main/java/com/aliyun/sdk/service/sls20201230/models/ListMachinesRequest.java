// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link ListMachinesRequest} extends {@link RequestModel}
 *
 * <p>ListMachinesRequest</p>
 */
public class ListMachinesRequest extends Request {
    @Path
    @NameInMap("machineGroup")
    @Validation(required = true)
    private String machineGroup;

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

    private ListMachinesRequest(Builder builder) {
        super(builder);
        this.machineGroup = builder.machineGroup;
        this.offset = builder.offset;
        this.project = builder.project;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMachinesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return machineGroup
     */
    public String getMachineGroup() {
        return this.machineGroup;
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

    public static final class Builder extends Request.Builder<ListMachinesRequest, Builder> {
        private String machineGroup; 
        private Integer offset; 
        private String project; 
        private Integer size; 

        private Builder() {
            super();
        } 

        private Builder(ListMachinesRequest request) {
            super(request);
            this.machineGroup = request.machineGroup;
            this.offset = request.offset;
            this.project = request.project;
            this.size = request.size;
        } 

        /**
         * 机器组名称。
         */
        public Builder machineGroup(String machineGroup) {
            this.putPathParameter("machineGroup", machineGroup);
            this.machineGroup = machineGroup;
            return this;
        }

        /**
         * 查询开始行。默认值为0。
         */
        public Builder offset(Integer offset) {
            this.putQueryParameter("offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * project 名称。
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * 分页查询时，设置的每页行数。默认值为2000。
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        @Override
        public ListMachinesRequest build() {
            return new ListMachinesRequest(this);
        } 

    } 

}
