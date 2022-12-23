// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTranscodeTemplateGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateTranscodeTemplateGroupRequest</p>
 */
public class UpdateTranscodeTemplateGroupRequest extends Request {
    @Query
    @NameInMap("Locked")
    private String locked;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("TranscodeTemplateGroupId")
    @Validation(required = true)
    private String transcodeTemplateGroupId;

    @Query
    @NameInMap("TranscodeTemplateList")
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
         * The lock status of the template group. Valid values:
         * <p>
         * 
         * *   **Enabled**: The template group is locked.
         * *   **Disabled**: The template group is not locked.
         */
        public Builder locked(String locked) {
            this.putQueryParameter("Locked", locked);
            this.locked = locked;
            return this;
        }

        /**
         * The name of the transcoding template group.
         * <p>
         * 
         * *   The name can be up to 128 bytes in length.
         * *   The value must be encoded in UTF-8.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The ID of the transcoding template group.
         */
        public Builder transcodeTemplateGroupId(String transcodeTemplateGroupId) {
            this.putQueryParameter("TranscodeTemplateGroupId", transcodeTemplateGroupId);
            this.transcodeTemplateGroupId = transcodeTemplateGroupId;
            return this;
        }

        /**
         * The configurations of the transcoding template. The value is a JSON-formatted string. For more information about the data structure, see the "TranscodeTemplate" section of the [Basic data types](~~52839~~) topic.
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
