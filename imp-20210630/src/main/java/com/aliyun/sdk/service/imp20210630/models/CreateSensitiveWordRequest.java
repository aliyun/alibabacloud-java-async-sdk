// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSensitiveWordRequest} extends {@link RequestModel}
 *
 * <p>CreateSensitiveWordRequest</p>
 */
public class CreateSensitiveWordRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("WordList")
    @Validation(required = true)
    private java.util.List < String > wordList;

    private CreateSensitiveWordRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.wordList = builder.wordList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSensitiveWordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return wordList
     */
    public java.util.List < String > getWordList() {
        return this.wordList;
    }

    public static final class Builder extends Request.Builder<CreateSensitiveWordRequest, Builder> {
        private String regionId; 
        private String appId; 
        private java.util.List < String > wordList; 

        private Builder() {
            super();
        } 

        private Builder(CreateSensitiveWordRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.wordList = request.wordList;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * 用户的应用ID，在控制台创建应用时生成。包含小写字母、数字，长度为6个字符。
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * WordList.
         */
        public Builder wordList(java.util.List < String > wordList) {
            String wordListShrink = shrink(wordList, "WordList", "json");
            this.putBodyParameter("WordList", wordListShrink);
            this.wordList = wordList;
            return this;
        }

        @Override
        public CreateSensitiveWordRequest build() {
            return new CreateSensitiveWordRequest(this);
        } 

    } 

}
