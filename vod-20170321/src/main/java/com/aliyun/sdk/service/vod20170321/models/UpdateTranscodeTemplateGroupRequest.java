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
         * Locked.
         */
        public Builder locked(String locked) {
            this.putQueryParameter("Locked", locked);
            this.locked = locked;
            return this;
        }

        /**
         * The operation that you want to perform. Set the value to **UpdateTranscodeTemplateGroup**.
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
         * Modifies a transcoding template group. You can modify the configurations of the specified transcoding templates in a transcoding template group.
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
