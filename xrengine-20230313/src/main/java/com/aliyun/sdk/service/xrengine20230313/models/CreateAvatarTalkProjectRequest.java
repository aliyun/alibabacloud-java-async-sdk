// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAvatarTalkProjectRequest} extends {@link RequestModel}
 *
 * <p>CreateAvatarTalkProjectRequest</p>
 */
public class CreateAvatarTalkProjectRequest extends Request {
    @Body
    @NameInMap("AvatarProjectId")
    private String avatarProjectId;

    @Query
    @NameInMap("JwtToken")
    private String jwtToken;

    @Body
    @NameInMap("Title")
    private String title;

    @Body
    @NameInMap("TtsVoice")
    private String ttsVoice;

    @Body
    @NameInMap("TxtContent")
    private String txtContent;

    private CreateAvatarTalkProjectRequest(Builder builder) {
        super(builder);
        this.avatarProjectId = builder.avatarProjectId;
        this.jwtToken = builder.jwtToken;
        this.title = builder.title;
        this.ttsVoice = builder.ttsVoice;
        this.txtContent = builder.txtContent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAvatarTalkProjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return avatarProjectId
     */
    public String getAvatarProjectId() {
        return this.avatarProjectId;
    }

    /**
     * @return jwtToken
     */
    public String getJwtToken() {
        return this.jwtToken;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return ttsVoice
     */
    public String getTtsVoice() {
        return this.ttsVoice;
    }

    /**
     * @return txtContent
     */
    public String getTxtContent() {
        return this.txtContent;
    }

    public static final class Builder extends Request.Builder<CreateAvatarTalkProjectRequest, Builder> {
        private String avatarProjectId; 
        private String jwtToken; 
        private String title; 
        private String ttsVoice; 
        private String txtContent; 

        private Builder() {
            super();
        } 

        private Builder(CreateAvatarTalkProjectRequest request) {
            super(request);
            this.avatarProjectId = request.avatarProjectId;
            this.jwtToken = request.jwtToken;
            this.title = request.title;
            this.ttsVoice = request.ttsVoice;
            this.txtContent = request.txtContent;
        } 

        /**
         * AvatarProjectId.
         */
        public Builder avatarProjectId(String avatarProjectId) {
            this.putBodyParameter("AvatarProjectId", avatarProjectId);
            this.avatarProjectId = avatarProjectId;
            return this;
        }

        /**
         * JwtToken.
         */
        public Builder jwtToken(String jwtToken) {
            this.putQueryParameter("JwtToken", jwtToken);
            this.jwtToken = jwtToken;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.putBodyParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * TtsVoice.
         */
        public Builder ttsVoice(String ttsVoice) {
            this.putBodyParameter("TtsVoice", ttsVoice);
            this.ttsVoice = ttsVoice;
            return this;
        }

        /**
         * TxtContent.
         */
        public Builder txtContent(String txtContent) {
            this.putBodyParameter("TxtContent", txtContent);
            this.txtContent = txtContent;
            return this;
        }

        @Override
        public CreateAvatarTalkProjectRequest build() {
            return new CreateAvatarTalkProjectRequest(this);
        } 

    } 

}
