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
         * <p>The application ID. Default value: <strong>app-1000000</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/113600.html">Multi-application</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>app-****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The name of the transcoding template group.</p>
         * <ul>
         * <li>The name can be up to 128 bytes in length.</li>
         * <li>The value is encoded in UTF-8.<blockquote>
         * <p>You must specify either TranscodeTemplateGroupId or Name.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>transcodetemplate</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the transcoding template group. If you specify the ID of a transcoding template group, new transcoding templates are added to the specified template group.</p>
         * <blockquote>
         * <p>You must specify either TranscodeTemplateGroupId or Name.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4c71a339fe52b4fa6f4527****</p>
         */
        public Builder transcodeTemplateGroupId(String transcodeTemplateGroupId) {
            this.putQueryParameter("TranscodeTemplateGroupId", transcodeTemplateGroupId);
            this.transcodeTemplateGroupId = transcodeTemplateGroupId;
            return this;
        }

        /**
         * <p>The transcoding template configurations in the JSON format. For more information about the parameter structure, see <a href="https://help.aliyun.com/document_detail/52839.html">TranscodeTemplate</a>.</p>
         * <blockquote>
         * <ul>
         * <li>If you do not specify this parameter, the transcoding process is not created and video uploads do not trigger transcoding.</li>
         * <li>If you do not need to set the Width or Height property, do not specify the corresponding property. Do not set it to an empty string, such as &quot;Height&quot;:&quot;&quot;.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Video&quot;:{&quot;Bitrate&quot;:&quot;400&quot;,&quot;Codec&quot;:&quot;H.264&quot;,&quot;Fps&quot;:&quot;30&quot;,&quot;Height&quot;:360,&quot;Width&quot;:640},&quot;Definition&quot;:&quot;SD&quot;,&quot;Container&quot;:{&quot;Format&quot;:&quot;mp4&quot;},&quot;TemplateName&quot;:&quot;testName&quot;,&quot;MuxConfig&quot;:{},&quot;Audio&quot;:{&quot;Codec&quot;:&quot;AAC&quot;,&quot;Bitrate&quot;:&quot;64&quot;,&quot;Samplerate&quot;:&quot;44100&quot;}}]</p>
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
