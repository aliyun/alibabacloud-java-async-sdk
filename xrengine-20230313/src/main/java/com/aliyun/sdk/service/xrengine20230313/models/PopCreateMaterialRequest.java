// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PopCreateMaterialRequest} extends {@link RequestModel}
 *
 * <p>PopCreateMaterialRequest</p>
 */
public class PopCreateMaterialRequest extends Request {
    @Body
    @NameInMap("CheckStatus")
    private String checkStatus;

    @Body
    @NameInMap("Ext")
    private String ext;

    @Body
    @NameInMap("Intro")
    private String intro;

    @Query
    @NameInMap("JwtToken")
    private String jwtToken;

    @Body
    @NameInMap("ListStatus")
    private String listStatus;

    @Body
    @NameInMap("Name")
    private String name;

    @Body
    @NameInMap("OssKey")
    private String ossKey;

    @Body
    @NameInMap("Type")
    private String type;

    private PopCreateMaterialRequest(Builder builder) {
        super(builder);
        this.checkStatus = builder.checkStatus;
        this.ext = builder.ext;
        this.intro = builder.intro;
        this.jwtToken = builder.jwtToken;
        this.listStatus = builder.listStatus;
        this.name = builder.name;
        this.ossKey = builder.ossKey;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PopCreateMaterialRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkStatus
     */
    public String getCheckStatus() {
        return this.checkStatus;
    }

    /**
     * @return ext
     */
    public String getExt() {
        return this.ext;
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
     * @return listStatus
     */
    public String getListStatus() {
        return this.listStatus;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ossKey
     */
    public String getOssKey() {
        return this.ossKey;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<PopCreateMaterialRequest, Builder> {
        private String checkStatus; 
        private String ext; 
        private String intro; 
        private String jwtToken; 
        private String listStatus; 
        private String name; 
        private String ossKey; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(PopCreateMaterialRequest request) {
            super(request);
            this.checkStatus = request.checkStatus;
            this.ext = request.ext;
            this.intro = request.intro;
            this.jwtToken = request.jwtToken;
            this.listStatus = request.listStatus;
            this.name = request.name;
            this.ossKey = request.ossKey;
            this.type = request.type;
        } 

        /**
         * CheckStatus.
         */
        public Builder checkStatus(String checkStatus) {
            this.putBodyParameter("CheckStatus", checkStatus);
            this.checkStatus = checkStatus;
            return this;
        }

        /**
         * Ext.
         */
        public Builder ext(String ext) {
            this.putBodyParameter("Ext", ext);
            this.ext = ext;
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
         * ListStatus.
         */
        public Builder listStatus(String listStatus) {
            this.putBodyParameter("ListStatus", listStatus);
            this.listStatus = listStatus;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OssKey.
         */
        public Builder ossKey(String ossKey) {
            this.putBodyParameter("OssKey", ossKey);
            this.ossKey = ossKey;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public PopCreateMaterialRequest build() {
            return new PopCreateMaterialRequest(this);
        } 

    } 

}
