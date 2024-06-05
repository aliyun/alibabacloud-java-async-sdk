// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BaseGroupResponse} extends {@link TeaModel}
 *
 * <p>BaseGroupResponse</p>
 */
public class BaseGroupResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("created_at")
    private Long createdAt;

    @com.aliyun.core.annotation.NameInMap("creator")
    private String creator;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.NameInMap("group_id")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("group_name")
    private String groupName;

    @com.aliyun.core.annotation.NameInMap("is_sync")
    private Boolean isSync;

    @com.aliyun.core.annotation.NameInMap("permission")
    private java.util.Map < String, IDPermission > permission;

    @com.aliyun.core.annotation.NameInMap("updated_at")
    private String updatedAt;

    private BaseGroupResponse(BuilderImpl builder) {
        super(builder);
        this.createdAt = builder.createdAt;
        this.creator = builder.creator;
        this.description = builder.description;
        this.domainId = builder.domainId;
        this.groupId = builder.groupId;
        this.groupName = builder.groupName;
        this.isSync = builder.isSync;
        this.permission = builder.permission;
        this.updatedAt = builder.updatedAt;
    }

    public static BaseGroupResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return createdAt
     */
    public Long getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return isSync
     */
    public Boolean getIsSync() {
        return this.isSync;
    }

    /**
     * @return permission
     */
    public java.util.Map < String, IDPermission > getPermission() {
        return this.permission;
    }

    /**
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public interface Builder extends Response.Builder<BaseGroupResponse, Builder> {

        Builder createdAt(Long createdAt);

        Builder creator(String creator);

        Builder description(String description);

        Builder domainId(String domainId);

        Builder groupId(String groupId);

        Builder groupName(String groupName);

        Builder isSync(Boolean isSync);

        Builder permission(java.util.Map < String, IDPermission > permission);

        Builder updatedAt(String updatedAt);

        @Override
        BaseGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BaseGroupResponse, Builder>
            implements Builder {
        private Long createdAt; 
        private String creator; 
        private String description; 
        private String domainId; 
        private String groupId; 
        private String groupName; 
        private Boolean isSync; 
        private java.util.Map < String, IDPermission > permission; 
        private String updatedAt; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BaseGroupResponse response) {
            super(response);
            this.createdAt = response.createdAt;
            this.creator = response.creator;
            this.description = response.description;
            this.domainId = response.domainId;
            this.groupId = response.groupId;
            this.groupName = response.groupName;
            this.isSync = response.isSync;
            this.permission = response.permission;
            this.updatedAt = response.updatedAt;
        } 

        /**
         * created_at.
         */
        @Override
        public Builder createdAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * creator.
         */
        @Override
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * description.
         */
        @Override
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * domain_id.
         */
        @Override
        public Builder domainId(String domainId) {
            this.domainId = domainId;
            return this;
        }

        /**
         * group_id.
         */
        @Override
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * group_name.
         */
        @Override
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * is_sync.
         */
        @Override
        public Builder isSync(Boolean isSync) {
            this.isSync = isSync;
            return this;
        }

        /**
         * permission.
         */
        @Override
        public Builder permission(java.util.Map < String, IDPermission > permission) {
            this.permission = permission;
            return this;
        }

        /**
         * updated_at.
         */
        @Override
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        @Override
        public BaseGroupResponse build() {
            return new BaseGroupResponse(this);
        } 

    } 

}
