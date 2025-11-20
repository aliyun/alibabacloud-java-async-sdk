// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link CreateOrUpdateSwimmingLaneGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateOrUpdateSwimmingLaneGroupRequest</p>
 */
public class CreateOrUpdateSwimmingLaneGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppIds")
    private java.util.List<String> appIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntryAppId")
    private String entryAppId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntryAppType")
    private String entryAppType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private Long groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    private String namespaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SwimVersion")
    private String swimVersion;

    private CreateOrUpdateSwimmingLaneGroupRequest(Builder builder) {
        super(builder);
        this.appIds = builder.appIds;
        this.entryAppId = builder.entryAppId;
        this.entryAppType = builder.entryAppType;
        this.groupId = builder.groupId;
        this.groupName = builder.groupName;
        this.namespaceId = builder.namespaceId;
        this.swimVersion = builder.swimVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrUpdateSwimmingLaneGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appIds
     */
    public java.util.List<String> getAppIds() {
        return this.appIds;
    }

    /**
     * @return entryAppId
     */
    public String getEntryAppId() {
        return this.entryAppId;
    }

    /**
     * @return entryAppType
     */
    public String getEntryAppType() {
        return this.entryAppType;
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * @return swimVersion
     */
    public String getSwimVersion() {
        return this.swimVersion;
    }

    public static final class Builder extends Request.Builder<CreateOrUpdateSwimmingLaneGroupRequest, Builder> {
        private java.util.List<String> appIds; 
        private String entryAppId; 
        private String entryAppType; 
        private Long groupId; 
        private String groupName; 
        private String namespaceId; 
        private String swimVersion; 

        private Builder() {
            super();
        } 

        private Builder(CreateOrUpdateSwimmingLaneGroupRequest request) {
            super(request);
            this.appIds = request.appIds;
            this.entryAppId = request.entryAppId;
            this.entryAppType = request.entryAppType;
            this.groupId = request.groupId;
            this.groupName = request.groupName;
            this.namespaceId = request.namespaceId;
            this.swimVersion = request.swimVersion;
        } 

        /**
         * <p>The ID of the baseline application.</p>
         */
        public Builder appIds(java.util.List<String> appIds) {
            String appIdsShrink = shrink(appIds, "AppIds", "json");
            this.putQueryParameter("AppIds", appIdsShrink);
            this.appIds = appIds;
            return this;
        }

        /**
         * <p>The unique ID of the corresponding gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>mse_ingresspost-cn-axc49******</p>
         */
        public Builder entryAppId(String entryAppId) {
            this.putQueryParameter("EntryAppId", entryAppId);
            this.entryAppId = entryAppId;
            return this;
        }

        /**
         * <p>The application entry type (gateway type).</p>
         * <ul>
         * <li><strong>apig:</strong> cloud-native API Gateway</li>
         * <li><strong>mse:</strong> Java Services Gateway</li>
         * <li><strong>mse-gw:</strong> MSE cloud-native Gateway</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>mse-gw</p>
         */
        public Builder entryAppType(String entryAppType) {
            this.putQueryParameter("EntryAppType", entryAppType);
            this.entryAppType = entryAppType;
            return this;
        }

        /**
         * <p>The ID of the lane group. This is required when you update a lane group.</p>
         * 
         * <strong>example:</strong>
         * <p>2047</p>
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
         * <p>mse-test</p>
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>The ID of a namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing:test</p>
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * <p>The end-to-end grayscale version. Valid values: 0 and 2 (recommended).</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder swimVersion(String swimVersion) {
            this.putQueryParameter("SwimVersion", swimVersion);
            this.swimVersion = swimVersion;
            return this;
        }

        @Override
        public CreateOrUpdateSwimmingLaneGroupRequest build() {
            return new CreateOrUpdateSwimmingLaneGroupRequest(this);
        } 

    } 

}
