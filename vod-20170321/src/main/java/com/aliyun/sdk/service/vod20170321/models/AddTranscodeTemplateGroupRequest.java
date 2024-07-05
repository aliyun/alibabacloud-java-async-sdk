// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddTranscodeTemplateGroupRequest} extends {@link RequestModel}
 *
 * <p>AddTranscodeTemplateGroupRequest</p>
 */
public class AddTranscodeTemplateGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TranscodeTemplateGroupId")
    private String transcodeTemplateGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TranscodeTemplateList")
    private String transcodeTemplateList;

    private AddTranscodeTemplateGroupRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.name = builder.name;
        this.transcodeTemplateGroupId = builder.transcodeTemplateGroupId;
        this.transcodeTemplateList = builder.transcodeTemplateList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddTranscodeTemplateGroupRequest create() {
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

    public static final class Builder extends Request.Builder<AddTranscodeTemplateGroupRequest, Builder> {
        private String appId; 
        private String name; 
        private String transcodeTemplateGroupId; 
        private String transcodeTemplateList; 

        private Builder() {
            super();
        } 

        private Builder(AddTranscodeTemplateGroupRequest request) {
            super(request);
            this.appId = request.appId;
            this.name = request.name;
            this.transcodeTemplateGroupId = request.transcodeTemplateGroupId;
            this.transcodeTemplateList = request.transcodeTemplateList;
        } 

        /**
         * The application ID. Default value: **app-1000000**. For more information, see [Use the multi-application service](~~113600~~).
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The name of the transcoding template group.
         * <p>
         * 
         * *   The name can be up to 128 bytes in length.
         * *   The value must be encoded in UTF-8.
         * 
         * > You must specify TranscodeTemplateGroupId or Name in the request.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The ID of the transcoding template group. If a transcoding template group ID is specified, you can add transcoding templates to the template group.
         * <p>
         * 
         * > You must specify TranscodeTemplateGroupId or Name in the request.
         */
        public Builder transcodeTemplateGroupId(String transcodeTemplateGroupId) {
            this.putQueryParameter("TranscodeTemplateGroupId", transcodeTemplateGroupId);
            this.transcodeTemplateGroupId = transcodeTemplateGroupId;
            return this;
        }

        /**
         * The configurations of the transcoding template. The value is a string in JSON format. For more information about the data structure, see [TranscodeTemplate](~~52839~~).
         * <p>
         * 
         * > *   If you do not specify this parameter, the transcoding job cannot be automatically created after you upload a video.
         * > *   If you do not need to set Width or Height, do not specify the corresponding parameter. You cannot set the value to an empty string, such as "Height":"".
         */
        public Builder transcodeTemplateList(String transcodeTemplateList) {
            this.putQueryParameter("TranscodeTemplateList", transcodeTemplateList);
            this.transcodeTemplateList = transcodeTemplateList;
            return this;
        }

        @Override
        public AddTranscodeTemplateGroupRequest build() {
            return new AddTranscodeTemplateGroupRequest(this);
        } 

    } 

}
