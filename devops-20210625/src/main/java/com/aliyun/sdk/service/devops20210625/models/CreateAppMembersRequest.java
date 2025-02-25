// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link CreateAppMembersRequest} extends {@link RequestModel}
 *
 * <p>CreateAppMembersRequest</p>
 */
public class CreateAppMembersRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appName")
    private String appName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("playerList")
    private java.util.List<PlayerList> playerList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("roleNames")
    private java.util.List<String> roleNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("organizationId")
    private String organizationId;

    private CreateAppMembersRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.playerList = builder.playerList;
        this.roleNames = builder.roleNames;
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppMembersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return playerList
     */
    public java.util.List<PlayerList> getPlayerList() {
        return this.playerList;
    }

    /**
     * @return roleNames
     */
    public java.util.List<String> getRoleNames() {
        return this.roleNames;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static final class Builder extends Request.Builder<CreateAppMembersRequest, Builder> {
        private String appName; 
        private java.util.List<PlayerList> playerList; 
        private java.util.List<String> roleNames; 
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAppMembersRequest request) {
            super(request);
            this.appName = request.appName;
            this.playerList = request.playerList;
            this.roleNames = request.roleNames;
            this.organizationId = request.organizationId;
        } 

        /**
         * appName.
         */
        public Builder appName(String appName) {
            this.putPathParameter("appName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * playerList.
         */
        public Builder playerList(java.util.List<PlayerList> playerList) {
            this.putBodyParameter("playerList", playerList);
            this.playerList = playerList;
            return this;
        }

        /**
         * roleNames.
         */
        public Builder roleNames(java.util.List<String> roleNames) {
            this.putBodyParameter("roleNames", roleNames);
            this.roleNames = roleNames;
            return this;
        }

        /**
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putQueryParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        @Override
        public CreateAppMembersRequest build() {
            return new CreateAppMembersRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateAppMembersRequest} extends {@link TeaModel}
     *
     * <p>CreateAppMembersRequest</p>
     */
    public static class PlayerList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private PlayerList(Builder builder) {
            this.id = builder.id;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PlayerList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String id; 
            private String type; 

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public PlayerList build() {
                return new PlayerList(this);
            } 

        } 

    }
}
