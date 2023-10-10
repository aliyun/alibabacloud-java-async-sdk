// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSwimmingLaneGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateSwimmingLaneGroupRequest</p>
 */
public class UpdateSwimmingLaneGroupRequest extends Request {
    @Query
    @NameInMap("AppIds")
    private String appIds;

    @Query
    @NameInMap("EntryApp")
    private String entryApp;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private Long groupId;

    @Query
    @NameInMap("Name")
    private String name;

    private UpdateSwimmingLaneGroupRequest(Builder builder) {
        super(builder);
        this.appIds = builder.appIds;
        this.entryApp = builder.entryApp;
        this.groupId = builder.groupId;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSwimmingLaneGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appIds
     */
    public String getAppIds() {
        return this.appIds;
    }

    /**
     * @return entryApp
     */
    public String getEntryApp() {
        return this.entryApp;
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<UpdateSwimmingLaneGroupRequest, Builder> {
        private String appIds; 
        private String entryApp; 
        private Long groupId; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSwimmingLaneGroupRequest request) {
            super(request);
            this.appIds = request.appIds;
            this.entryApp = request.entryApp;
            this.groupId = request.groupId;
            this.name = request.name;
        } 

        /**
         * The list of application IDs related to the lane group.
         */
        public Builder appIds(String appIds) {
            this.putQueryParameter("AppIds", appIds);
            this.appIds = appIds;
            return this;
        }

        /**
         * The ingress application. The application is in the EDAS:{application ID} format.
         */
        public Builder entryApp(String entryApp) {
            this.putQueryParameter("EntryApp", entryApp);
            this.entryApp = entryApp;
            return this;
        }

        /**
         * The ID of the lane group.
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The name of the lane group.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public UpdateSwimmingLaneGroupRequest build() {
            return new UpdateSwimmingLaneGroupRequest(this);
        } 

    } 

}
