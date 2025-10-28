// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link UpdateSwimmingLaneGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateSwimmingLaneGroupRequest</p>
 */
public class UpdateSwimmingLaneGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppIds")
    private String appIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntryApp")
    private String entryApp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
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
         * <p>The list of application IDs related to the lane group.</p>
         * 
         * <strong>example:</strong>
         * <p>8e7689af-6ddd-4676-8ee6-5fbecdf2****,f72deaac-26ba-429a-948d-5fa47c4a****,5049d2c8-f997-4fc9-92a2-153506a6****,99a2d4b5-99a5-4e25-a964-1bd03a17****</p>
         */
        public Builder appIds(String appIds) {
            this.putQueryParameter("AppIds", appIds);
            this.appIds = appIds;
            return this;
        }

        /**
         * <p>The ingress application. The application is in the EDAS:{application ID} format.</p>
         * 
         * <strong>example:</strong>
         * <p>EDAS:dd2690a7-3fe4-4975-9a4c-5a60ffd6****</p>
         */
        public Builder entryApp(String entryApp) {
            this.putQueryParameter("EntryApp", entryApp);
            this.entryApp = entryApp;
            return this;
        }

        /**
         * <p>The ID of the lane group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>98</p>
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The name of the lane group.</p>
         * 
         * <strong>example:</strong>
         * <p>test-swimlanegroup</p>
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
