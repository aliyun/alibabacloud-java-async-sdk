// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyTagWithUuidRequest} extends {@link RequestModel}
 *
 * <p>ModifyTagWithUuidRequest</p>
 */
public class ModifyTagWithUuidRequest extends Request {
    @Query
    @NameInMap("MachineTypes")
    private String machineTypes;

    @Query
    @NameInMap("TagId")
    private String tagId;

    @Query
    @NameInMap("TagList")
    @Validation(required = true)
    private String tagList;

    @Query
    @NameInMap("UuidList")
    private String uuidList;

    private ModifyTagWithUuidRequest(Builder builder) {
        super(builder);
        this.machineTypes = builder.machineTypes;
        this.tagId = builder.tagId;
        this.tagList = builder.tagList;
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
     * @return uuidList
     */
    public String getUuidList() {
        return this.uuidList;
    }

    public static final class Builder extends Request.Builder<ModifyTagWithUuidRequest, Builder> {
        private String machineTypes; 
        private String tagId; 
        private String tagList; 
        private String uuidList; 

        private Builder() {
            super();
        } 

        private Builder(ModifyTagWithUuidRequest request) {
            super(request);
            this.machineTypes = request.machineTypes;
            this.tagId = request.tagId;
            this.tagList = request.tagList;
            this.uuidList = request.uuidList;
        } 

        /**
         * The type of the assets whose tags you want to modify. Valid values:
         * <p>
         * 
         * *   **ecs**: Elastic Compute Service (ECS) instances or servers that are not deployed on Alibaba Cloud.
         * *   **cloud_product**: Alibaba Cloud service.
         * 
         * >  If you do not specify this parameter, the default value **ecs** is used.
         */
        public Builder machineTypes(String machineTypes) {
            this.putQueryParameter("MachineTypes", machineTypes);
            this.machineTypes = machineTypes;
            return this;
        }

        /**
         * The ID of the tag whose name you want to change.
         * <p>
         * 
         * >  You can call the [DescribeGroupedTags](~~DescribeGroupedTags~~) operation to query the IDs of the tags.
         */
        public Builder tagId(String tagId) {
            this.putQueryParameter("TagId", tagId);
            this.tagId = tagId;
            return this;
        }

        /**
         * The tag names that you want to change. Separate multiple tag names with commas (,).
         * <p>
         * 
         * >  You can call the [DescribeGroupedTags](~~DescribeGroupedTags~~) operation to query the names of the tags that are added to assets.
         */
        public Builder tagList(String tagList) {
            this.putQueryParameter("TagList", tagList);
            this.tagList = tagList;
            return this;
        }

        /**
         * The UUIDs of the assets whose tags you want to modify. Separate multiple UUIDs with commas (,).
         * <p>
         * 
         * > You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUIDs of assets to which the tags are added. If you do not specify this parameter, the tags that are specified in **TagList** parameter are removed from all assets.
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
