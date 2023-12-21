// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PopCreateObjectGenerationProjectRequest} extends {@link RequestModel}
 *
 * <p>PopCreateObjectGenerationProjectRequest</p>
 */
public class PopCreateObjectGenerationProjectRequest extends Request {
    @Body
    @NameInMap("BizUsage")
    private String bizUsage;

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

    private PopCreateObjectGenerationProjectRequest(Builder builder) {
        super(builder);
        this.bizUsage = builder.bizUsage;
        this.extInfo = builder.extInfo;
        this.intro = builder.intro;
        this.jwtToken = builder.jwtToken;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PopCreateObjectGenerationProjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizUsage
     */
    public String getBizUsage() {
        return this.bizUsage;
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

    public static final class Builder extends Request.Builder<PopCreateObjectGenerationProjectRequest, Builder> {
        private String bizUsage; 
        private String extInfo; 
        private String intro; 
        private String jwtToken; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(PopCreateObjectGenerationProjectRequest request) {
            super(request);
            this.bizUsage = request.bizUsage;
            this.extInfo = request.extInfo;
            this.intro = request.intro;
            this.jwtToken = request.jwtToken;
            this.title = request.title;
        } 

        /**
         * BizUsage.
         */
        public Builder bizUsage(String bizUsage) {
            this.putBodyParameter("BizUsage", bizUsage);
            this.bizUsage = bizUsage;
            return this;
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
        public PopCreateObjectGenerationProjectRequest build() {
            return new PopCreateObjectGenerationProjectRequest(this);
        } 

    } 

}
