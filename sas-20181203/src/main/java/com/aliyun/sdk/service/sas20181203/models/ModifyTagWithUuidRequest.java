// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyTagWithUuidRequest} extends {@link RequestModel}
 *
 * <p>ModifyTagWithUuidRequest</p>
 */
public class ModifyTagWithUuidRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MachineTypes")
    private String machineTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagId")
    private String tagId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tagList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Target")
    private String target;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UuidList")
    private String uuidList;

    private ModifyTagWithUuidRequest(Builder builder) {
        super(builder);
        this.machineTypes = builder.machineTypes;
        this.tagId = builder.tagId;
        this.tagList = builder.tagList;
        this.target = builder.target;
        this.uuidList = builder.uuidList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTagWithUuidRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return machineTypes
     */
    public String getMachineTypes() {
        return this.machineTypes;
    }

    /**
     * @return tagId
     */
    public String getTagId() {
        return this.tagId;
    }

    /**
     * @return tagList
     */
    public String getTagList() {
        return this.tagList;
    }

    /**
     * @return target
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * @return uuidList
     */
    public String getUuidList() {
        return this.uuidList;
    }

    public static final class Builder extends Request.Builder<ModifyTagWithUuidRequest, Builder> {
        private String machineTypes; 
        private String tagId; 
        private String tagList; 
        private String target; 
        private String uuidList; 

        private Builder() {
            super();
        } 

        private Builder(ModifyTagWithUuidRequest request) {
            super(request);
            this.machineTypes = request.machineTypes;
            this.tagId = request.tagId;
            this.tagList = request.tagList;
            this.target = request.target;
            this.uuidList = request.uuidList;
        } 

        /**
         * The type of the asset to query. If you do not specify this parameter, the tags of all asset types are queried. Valid values:
         * <p>
         * 
         * *   **ecs**: server
         * *   **cloud_product**: Alibaba Cloud service
         */
        public Builder machineTypes(String machineTypes) {
            this.putQueryParameter("MachineTypes", machineTypes);
            this.machineTypes = machineTypes;
            return this;
        }

        /**
         * The ID of the tag that you want to manage.
         * <p>
         * 
         * >  You can call the [DescribeGroupedTags](~~DescribeGroupedTags~~) operation to query the IDs of tags.
         */
        public Builder tagId(String tagId) {
            this.putQueryParameter("TagId", tagId);
            this.tagId = tagId;
            return this;
        }

        /**
         * The names of the tags that you want to manage. Separate multiple tag names with commas (,).
         * <p>
         * 
         * >  You can call the [DescribeGroupedTags](~~DescribeGroupedTags~~) operation to query the names of tags.
         */
        public Builder tagList(String tagList) {
            this.putQueryParameter("TagList", tagList);
            this.tagList = tagList;
            return this;
        }

        /**
         * The details of the server for which you want to manage the tag. The value of this parameter is in the JSON format and contains the following fields:
         * <p>
         * 
         * *   **Target**: the UUID of the server that you want to add or remove.
         * 
         * *   **targetType**: the method by which the server is added. Valid values:
         * 
         *     *   **uuid**: by server
         *     *   **groupId**: by server group
         * 
         * *   **flag**: the operation that you want to perform on the server. Valid values:
         * 
         *     *   **del**: removes the tag from the server.
         *     *   **add**: adds the tag to the server.
         */
        public Builder target(String target) {
            this.putQueryParameter("Target", target);
            this.target = target;
            return this;
        }

        /**
         * The UUIDs of the servers.
         * <p>
         * 
         * >  You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUIDs of servers.
         */
        public Builder uuidList(String uuidList) {
            this.putQueryParameter("UuidList", uuidList);
            this.uuidList = uuidList;
            return this;
        }

        @Override
        public ModifyTagWithUuidRequest build() {
            return new ModifyTagWithUuidRequest(this);
        } 

    } 

}
