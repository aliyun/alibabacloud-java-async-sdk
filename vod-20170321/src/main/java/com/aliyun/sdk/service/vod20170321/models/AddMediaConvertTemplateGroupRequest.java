// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link AddMediaConvertTemplateGroupRequest} extends {@link RequestModel}
 *
 * <p>AddMediaConvertTemplateGroupRequest</p>
 */
public class AddMediaConvertTemplateGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupConfig")
    private String groupConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TranscodeTemplateGroupId")
    private String transcodeTemplateGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TranscodeTemplateList")
    private String transcodeTemplateList;

    private AddMediaConvertTemplateGroupRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.groupConfig = builder.groupConfig;
        this.name = builder.name;
        this.transcodeTemplateGroupId = builder.transcodeTemplateGroupId;
        this.transcodeTemplateList = builder.transcodeTemplateList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddMediaConvertTemplateGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return groupConfig
     */
    public String getGroupConfig() {
        return this.groupConfig;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return transcodeTemplateGroupId
     */
    public String getTranscodeTemplateGroupId() {
        return this.transcodeTemplateGroupId;
    }

    /**
     * @return transcodeTemplateList
     */
    public String getTranscodeTemplateList() {
        return this.transcodeTemplateList;
    }

    public static final class Builder extends Request.Builder<AddMediaConvertTemplateGroupRequest, Builder> {
        private String appId; 
        private String groupConfig; 
        private String name; 
        private String transcodeTemplateGroupId; 
        private String transcodeTemplateList; 

        private Builder() {
            super();
        } 

        private Builder(AddMediaConvertTemplateGroupRequest request) {
            super(request);
            this.appId = request.appId;
            this.groupConfig = request.groupConfig;
            this.name = request.name;
            this.transcodeTemplateGroupId = request.transcodeTemplateGroupId;
            this.transcodeTemplateList = request.transcodeTemplateList;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * GroupConfig.
         */
        public Builder groupConfig(String groupConfig) {
            this.putQueryParameter("GroupConfig", groupConfig);
            this.groupConfig = groupConfig;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * TranscodeTemplateGroupId.
         */
        public Builder transcodeTemplateGroupId(String transcodeTemplateGroupId) {
            this.putQueryParameter("TranscodeTemplateGroupId", transcodeTemplateGroupId);
            this.transcodeTemplateGroupId = transcodeTemplateGroupId;
            return this;
        }

        /**
         * TranscodeTemplateList.
         */
        public Builder transcodeTemplateList(String transcodeTemplateList) {
            this.putQueryParameter("TranscodeTemplateList", transcodeTemplateList);
            this.transcodeTemplateList = transcodeTemplateList;
            return this;
        }

        @Override
        public AddMediaConvertTemplateGroupRequest build() {
            return new AddMediaConvertTemplateGroupRequest(this);
        } 

    } 

}
