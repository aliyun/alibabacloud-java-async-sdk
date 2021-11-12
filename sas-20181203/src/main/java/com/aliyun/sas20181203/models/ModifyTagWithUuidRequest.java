// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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

    public static final class Builder extends Request.Builder {
        private String machineTypes; 
        private String tagId; 
        private String tagList; 
        private String uuidList; 

        /**
         * <p>MachineTypes.</p>
         */
        public Builder machineTypes(String machineTypes) {
            this.putQueryParameter("MachineTypes", machineTypes);
            this.machineTypes = machineTypes;
            return this;
        }

        /**
         * <p>TagId.</p>
         */
        public Builder tagId(String tagId) {
            this.putQueryParameter("TagId", tagId);
            this.tagId = tagId;
            return this;
        }

        /**
         * <p>TagList.</p>
         */
        public Builder tagList(String tagList) {
            this.putQueryParameter("TagList", tagList);
            this.tagList = tagList;
            return this;
        }

        /**
         * <p>UuidList.</p>
         */
        public Builder uuidList(String uuidList) {
            this.putQueryParameter("UuidList", uuidList);
            this.uuidList = uuidList;
            return this;
        }

        public ModifyTagWithUuidRequest build() {
            return new ModifyTagWithUuidRequest(this);
        } 

    } 

}
