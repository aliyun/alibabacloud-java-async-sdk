// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link StartPlaylistRequest} extends {@link RequestModel}
 *
 * <p>StartPlaylistRequest</p>
 */
public class StartPlaylistRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Offset")
    private Integer offset;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProgramId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String programId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResumeMode")
    private String resumeMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartItemId")
    private String startItemId;

    private StartPlaylistRequest(Builder builder) {
        super(builder);
        this.offset = builder.offset;
        this.ownerId = builder.ownerId;
        this.programId = builder.programId;
        this.regionId = builder.regionId;
        this.resumeMode = builder.resumeMode;
        this.startItemId = builder.startItemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartPlaylistRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return offset
     */
    public Integer getOffset() {
        return this.offset;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return programId
     */
    public String getProgramId() {
        return this.programId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resumeMode
     */
    public String getResumeMode() {
        return this.resumeMode;
    }

    /**
     * @return startItemId
     */
    public String getStartItemId() {
        return this.startItemId;
    }

    public static final class Builder extends Request.Builder<StartPlaylistRequest, Builder> {
        private Integer offset; 
        private Long ownerId; 
        private String programId; 
        private String regionId; 
        private String resumeMode; 
        private String startItemId; 

        private Builder() {
            super();
        } 

        private Builder(StartPlaylistRequest request) {
            super(request);
            this.offset = request.offset;
            this.ownerId = request.ownerId;
            this.programId = request.programId;
            this.regionId = request.regionId;
            this.resumeMode = request.resumeMode;
            this.startItemId = request.startItemId;
        } 

        /**
         * <p>The offset of the position where the system starts the playback. This parameter takes effect only if the input source is a video file. Unit: milliseconds.</p>
         * <p>A value greater than 0 indicates an offset from the first frame.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder offset(Integer offset) {
            this.putQueryParameter("Offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The ID of the episode list. If the episode list was created by calling the <a href="https://help.aliyun.com/document_detail/2848078.html">AddPlaylistItems</a> operation, check the value of the response parameter ProgramId to obtain the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>445409ec-7eaa-461d-8f29-4bec2eb9****</p>
         */
        public Builder programId(String programId) {
            this.putQueryParameter("ProgramId", programId);
            this.programId = programId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The method to resume the playback of the episode list. Valid values:</p>
         * <ul>
         * <li><strong>Restart</strong>: resumes the playback from the beginning.</li>
         * <li><strong>Continue</strong>: resumes the playback from the position where the previous playback stops. The <strong>StartItemId</strong> parameter is required only if you set <strong>ResumeMode</strong> to <strong>Custom</strong>.</li>
         * <li><strong>Custom</strong>: resumes the playback from a custom position.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        public Builder resumeMode(String resumeMode) {
            this.putQueryParameter("ResumeMode", resumeMode);
            this.resumeMode = resumeMode;
            return this;
        }

        /**
         * <p>The ID of the first episode to play. This episode is the first to play in carousel playback.</p>
         * <blockquote>
         * <p> This parameter is required only if you set ResumeMode to Custom.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>asdfasdfasdf****</p>
         */
        public Builder startItemId(String startItemId) {
            this.putQueryParameter("StartItemId", startItemId);
            this.startItemId = startItemId;
            return this;
        }

        @Override
        public StartPlaylistRequest build() {
            return new StartPlaylistRequest(this);
        } 

    } 

}
