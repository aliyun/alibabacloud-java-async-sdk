// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GrantPermissionRequest} extends {@link RequestModel}
 *
 * <p>GrantPermissionRequest</p>
 */
public class GrantPermissionRequest extends Request {
    @Query
    @NameInMap("GrantOption")
    private Boolean grantOption;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    @Query
    @NameInMap("NamespaceSource")
    private String namespaceSource;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    @Query
    @NameInMap("UserName")
    @Validation(required = true)
    private String userName;

    private GrantPermissionRequest(Builder builder) {
        super(builder);
        this.grantOption = builder.grantOption;
        this.groupId = builder.groupId;
        this.namespace = builder.namespace;
        this.namespaceSource = builder.namespaceSource;
        this.regionId = builder.regionId;
        this.userId = builder.userId;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrantPermissionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return grantOption
     */
    public Boolean getGrantOption() {
        return this.grantOption;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return namespaceSource
     */
    public String getNamespaceSource() {
        return this.namespaceSource;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<GrantPermissionRequest, Builder> {
        private Boolean grantOption; 
        private String groupId; 
        private String namespace; 
        private String namespaceSource; 
        private String regionId; 
        private String userId; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(GrantPermissionRequest request) {
            super(request);
            this.grantOption = request.grantOption;
            this.groupId = request.groupId;
            this.namespace = request.namespace;
            this.namespaceSource = request.namespaceSource;
            this.regionId = request.regionId;
            this.userId = request.userId;
            this.userName = request.userName;
        } 

        /**
         * Specifies whether to grant the permissions with the GRANT option. Valid values: -**true**: grants the permissions with the GRANT option. -**false**: does not grant the permissions with the GRANT option.
         */
        public Builder grantOption(Boolean grantOption) {
            this.putQueryParameter("GrantOption", grantOption);
            this.grantOption = grantOption;
            return this;
        }

        /**
         * The ID of the application group.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The ID of the namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * This parameter is required only for a special third party.
         */
        public Builder namespaceSource(String namespaceSource) {
            this.putQueryParameter("NamespaceSource", namespaceSource);
            this.namespaceSource = namespaceSource;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The user ID.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * The username.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public GrantPermissionRequest build() {
            return new GrantPermissionRequest(this);
        } 

    } 

}
