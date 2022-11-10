// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSensitiveWordRequest} extends {@link RequestModel}
 *
 * <p>DeleteSensitiveWordRequest</p>
 */
public class DeleteSensitiveWordRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("WordList")
    private java.util.List < String > wordList;

    private DeleteSensitiveWordRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.wordList = builder.wordList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSensitiveWordRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteSensitiveWordRequest, Builder> {
        private String regionId; 
        private String appId; 
        private java.util.List < String > wordList; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSensitiveWordRequest request) {
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
         * 弹幕发送者的用户ID，最大长度不超过32个字节。
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
        public DeleteSensitiveWordRequest build() {
            return new DeleteSensitiveWordRequest(this);
        } 

    } 

}
