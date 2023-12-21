// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PopCreateTextToAvatarProjectRequest} extends {@link RequestModel}
 *
 * <p>PopCreateTextToAvatarProjectRequest</p>
 */
public class PopCreateTextToAvatarProjectRequest extends Request {
    @Body
    @NameInMap("ExtInfo")
    private String extInfo;

    @Body
    @NameInMap("Intro")
    private String intro;

    @Query
    @NameInMap("JwtToken")
    private String jwtToken;

    @Body
    @NameInMap("Title")
    private String title;

    private PopCreateTextToAvatarProjectRequest(Builder builder) {
        super(builder);
        this.extInfo = builder.extInfo;
        this.intro = builder.intro;
        this.jwtToken = builder.jwtToken;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PopCreateTextToAvatarProjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return extInfo
     */
    public String getExtInfo() {
        return this.extInfo;
    }

    /**
     * @return intro
     */
    public String getIntro() {
        return this.intro;
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

    public static final class Builder extends Request.Builder<PopCreateTextToAvatarProjectRequest, Builder> {
        private String extInfo; 
        private String intro; 
        private String jwtToken; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(PopCreateTextToAvatarProjectRequest request) {
            super(request);
            this.extInfo = request.extInfo;
            this.intro = request.intro;
            this.jwtToken = request.jwtToken;
            this.title = request.title;
        } 

        /**
         * ExtInfo.
         */
        public Builder extInfo(String extInfo) {
            this.putBodyParameter("ExtInfo", extInfo);
            this.extInfo = extInfo;
            return this;
        }

        /**
         * Intro.
         */
        public Builder intro(String intro) {
            this.putBodyParameter("Intro", intro);
            this.intro = intro;
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

        @Override
        public PopCreateTextToAvatarProjectRequest build() {
            return new PopCreateTextToAvatarProjectRequest(this);
        } 

    } 

}
