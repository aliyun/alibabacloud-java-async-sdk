// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModelGroupDTO} extends {@link TeaModel}
 *
 * <p>ModelGroupDTO</p>
 */
public class ModelGroupDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("groupId")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("modelCount")
    private Integer modelCount;

    @com.aliyun.core.annotation.NameInMap("modelList")
    private java.util.List<Long> modelList;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private ModelGroupDTO(Builder builder) {
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.groupId = builder.groupId;
        this.modelCount = builder.modelCount;
        this.modelList = builder.modelList;
        this.name = builder.name;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelGroupDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return modelCount
     */
    public Integer getModelCount() {
        return this.modelCount;
    }

    /**
     * @return modelList
     */
    public java.util.List<Long> getModelList() {
        return this.modelList;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String gmtCreate; 
        private String gmtModified; 
        private String groupId; 
        private Integer modelCount; 
        private java.util.List<Long> modelList; 
        private String name; 
        private String type; 

        private Builder() {
        } 

        private Builder(ModelGroupDTO model) {
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.groupId = model.groupId;
            this.modelCount = model.modelCount;
            this.modelList = model.modelList;
            this.name = model.name;
            this.type = model.type;
        } 

        /**
         * <p>The time when the group was created. Format: yyyy-MM-dd HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01 00:00:00</p>
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * <p>The time when the group was updated. Format: yyyy-MM-dd HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01 00:00:00</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>The unique identifier of the group. It starts with the mg_ prefix and remains unchanged after creation.</p>
         * 
         * <strong>example:</strong>
         * <p>mg_a1b2c3d4e5f6g7h8i9j0</p>
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The number of models currently included in the group.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder modelCount(Integer modelCount) {
            this.modelCount = modelCount;
            return this;
        }

        /**
         * <p>The array of all member model IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>[101, 102, 103]</p>
         */
        public Builder modelList(java.util.List<Long> modelList) {
            this.modelList = modelList;
            return this;
        }

        /**
         * <p>The name of the group. If a system group is unnamed, the default platform name is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Professional Edition plan</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The type of the group. Valid values:</p>
         * <ul>
         * <li>system: The group is automatically created by the system and cannot be edited or deleted.</li>
         * <li>manual: The group is manually created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>manual</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public ModelGroupDTO build() {
            return new ModelGroupDTO(this);
        } 

    } 

}
