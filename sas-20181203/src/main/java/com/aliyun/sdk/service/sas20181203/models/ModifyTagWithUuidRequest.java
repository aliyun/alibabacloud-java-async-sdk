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
    @NameInMap("Target")
    private String target;

    @Query
    @NameInMap("UuidList")
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
         * MachineTypes.
         */
        public Builder machineTypes(String machineTypes) {
            this.putQueryParameter("MachineTypes", machineTypes);
            this.machineTypes = machineTypes;
            return this;
        }

        /**
         * TagId.
         */
        public Builder tagId(String tagId) {
            this.putQueryParameter("TagId", tagId);
            this.tagId = tagId;
            return this;
        }

        /**
         * TagList.
         */
        public Builder tagList(String tagList) {
            this.putQueryParameter("TagList", tagList);
            this.tagList = tagList;
            return this;
        }

        /**
         * Target.
         */
        public Builder target(String target) {
            this.putQueryParameter("Target", target);
            this.target = target;
            return this;
        }

        /**
         * UuidList.
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
