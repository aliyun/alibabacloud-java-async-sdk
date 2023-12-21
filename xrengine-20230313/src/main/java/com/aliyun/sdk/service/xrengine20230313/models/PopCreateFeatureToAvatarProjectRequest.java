// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PopCreateFeatureToAvatarProjectRequest} extends {@link RequestModel}
 *
 * <p>PopCreateFeatureToAvatarProjectRequest</p>
 */
public class PopCreateFeatureToAvatarProjectRequest extends Request {
    @Body
    @NameInMap("ExtInfo")
    private String extInfo;

    @Body
    @NameInMap("Intro")
    private String intro;

    @Body
    @NameInMap("Title")
    private String title;

    private PopCreateFeatureToAvatarProjectRequest(Builder builder) {
        super(builder);
        this.extInfo = builder.extInfo;
        this.intro = builder.intro;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PopCreateFeatureToAvatarProjectRequest create() {
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
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<PopCreateFeatureToAvatarProjectRequest, Builder> {
        private String extInfo; 
        private String intro; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(PopCreateFeatureToAvatarProjectRequest request) {
            super(request);
            this.extInfo = request.extInfo;
            this.intro = request.intro;
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
         * Title.
         */
        public Builder title(String title) {
            this.putBodyParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public PopCreateFeatureToAvatarProjectRequest build() {
            return new PopCreateFeatureToAvatarProjectRequest(this);
        } 

    } 

}
