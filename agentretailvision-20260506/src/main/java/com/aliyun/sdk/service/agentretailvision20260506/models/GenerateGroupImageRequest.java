// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentretailvision20260506.models;

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
 * {@link GenerateGroupImageRequest} extends {@link RequestModel}
 *
 * <p>GenerateGroupImageRequest</p>
 */
public class GenerateGroupImageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallbackSecret")
    private String callbackSecret;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallbackUrl")
    private String callbackUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupType")
    private Integer groupType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlatformItemIdList")
    private java.util.List<String> platformItemIdList;

    private GenerateGroupImageRequest(Builder builder) {
        super(builder);
        this.callbackSecret = builder.callbackSecret;
        this.callbackUrl = builder.callbackUrl;
        this.groupId = builder.groupId;
        this.groupType = builder.groupType;
        this.platformItemIdList = builder.platformItemIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateGroupImageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callbackSecret
     */
    public String getCallbackSecret() {
        return this.callbackSecret;
    }

    /**
     * @return callbackUrl
     */
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return groupType
     */
    public Integer getGroupType() {
        return this.groupType;
    }

    /**
     * @return platformItemIdList
     */
    public java.util.List<String> getPlatformItemIdList() {
        return this.platformItemIdList;
    }

    public static final class Builder extends Request.Builder<GenerateGroupImageRequest, Builder> {
        private String callbackSecret; 
        private String callbackUrl; 
        private String groupId; 
        private Integer groupType; 
        private java.util.List<String> platformItemIdList; 

        private Builder() {
            super();
        } 

        private Builder(GenerateGroupImageRequest request) {
            super(request);
            this.callbackSecret = request.callbackSecret;
            this.callbackUrl = request.callbackUrl;
            this.groupId = request.groupId;
            this.groupType = request.groupType;
            this.platformItemIdList = request.platformItemIdList;
        } 

        /**
         * CallbackSecret.
         */
        public Builder callbackSecret(String callbackSecret) {
            this.putQueryParameter("CallbackSecret", callbackSecret);
            this.callbackSecret = callbackSecret;
            return this;
        }

        /**
         * CallbackUrl.
         */
        public Builder callbackUrl(String callbackUrl) {
            this.putQueryParameter("CallbackUrl", callbackUrl);
            this.callbackUrl = callbackUrl;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * GroupType.
         */
        public Builder groupType(Integer groupType) {
            this.putQueryParameter("GroupType", groupType);
            this.groupType = groupType;
            return this;
        }

        /**
         * PlatformItemIdList.
         */
        public Builder platformItemIdList(java.util.List<String> platformItemIdList) {
            String platformItemIdListShrink = shrink(platformItemIdList, "PlatformItemIdList", "json");
            this.putQueryParameter("PlatformItemIdList", platformItemIdListShrink);
            this.platformItemIdList = platformItemIdList;
            return this;
        }

        @Override
        public GenerateGroupImageRequest build() {
            return new GenerateGroupImageRequest(this);
        } 

    } 

}
