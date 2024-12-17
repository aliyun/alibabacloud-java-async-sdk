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
 * {@link UpdateTranscodeTemplateGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateTranscodeTemplateGroupRequest</p>
 */
public class UpdateTranscodeTemplateGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Locked")
    private String locked;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TranscodeTemplateGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String transcodeTemplateGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TranscodeTemplateList")
    private String transcodeTemplateList;

    private UpdateTranscodeTemplateGroupRequest(Builder builder) {
        super(builder);
        this.locked = builder.locked;
        this.name = builder.name;
        this.transcodeTemplateGroupId = builder.transcodeTemplateGroupId;
        this.transcodeTemplateList = builder.transcodeTemplateList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTranscodeTemplateGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return locked
     */
    public String getLocked() {
        return this.locked;
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

    public static final class Builder extends Request.Builder<UpdateTranscodeTemplateGroupRequest, Builder> {
        private String locked; 
        private String name; 
        private String transcodeTemplateGroupId; 
        private String transcodeTemplateList; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTranscodeTemplateGroupRequest request) {
            super(request);
            this.locked = request.locked;
            this.name = request.name;
            this.transcodeTemplateGroupId = request.transcodeTemplateGroupId;
            this.transcodeTemplateList = request.transcodeTemplateList;
        } 

        /**
         * <p>The lock status of the transcoding template group. Valid values:</p>
         * <ul>
         * <li><strong>Enabled</strong>: The transcoding template group is locked and cannot be modified.</li>
         * <li><strong>Disabled</strong> (default): The transcoding template group is not locked.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Disabled</p>
         */
        public Builder locked(String locked) {
            this.putQueryParameter("Locked", locked);
            this.locked = locked;
            return this;
        }

        /**
         * <p>The name of the transcoding template group.</p>
         * <ul>
         * <li>The name cannot exceed 128 bytes.</li>
         * <li>The value must be encoded in UTF-8.</li>
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
         * <p>The ID of the transcoding template group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4c71a339fe*****52b4fa6f4527</p>
         */
        public Builder transcodeTemplateGroupId(String transcodeTemplateGroupId) {
            this.putQueryParameter("TranscodeTemplateGroupId", transcodeTemplateGroupId);
            this.transcodeTemplateGroupId = transcodeTemplateGroupId;
            return this;
        }

        /**
         * <p>The configurations of the transcoding template. The value must be a JSON string. For more information about the data structure, see <a href="~~52839#title-9mb-8o2-uu6~~">TranscodeTemplate</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Video&quot;:{&quot;Bitrate&quot;:&quot;400&quot;,&quot;Codec&quot;:&quot;H.264&quot;,&quot;Fps&quot;:&quot;30&quot;},&quot;Audio&quot;:{&quot;Codec&quot;:&quot;AAC&quot;,&quot;Bitrate&quot;:&quot;64&quot;,&quot;Definition&quot;:&quot;SD&quot;,&quot;EncryptType&quot;:&quot;Private&quot;,&quot;Container&quot;:{&quot;Format&quot;:&quot;m3u8&quot;},&quot;PackageType&quot;:&quot;HLSPackage&quot;}}]</p>
         */
        public Builder transcodeTemplateList(String transcodeTemplateList) {
            this.putQueryParameter("TranscodeTemplateList", transcodeTemplateList);
            this.transcodeTemplateList = transcodeTemplateList;
            return this;
        }

        @Override
        public UpdateTranscodeTemplateGroupRequest build() {
            return new UpdateTranscodeTemplateGroupRequest(this);
        } 

    } 

}
