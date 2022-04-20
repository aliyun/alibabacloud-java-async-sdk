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
    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("WordList")
    private java.util.List < String > wordList;

    private DeleteSensitiveWordRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.regionId = builder.regionId;
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
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return wordList
     */
    public java.util.List < String > getWordList() {
        return this.wordList;
    }

    public static final class Builder extends Request.Builder<DeleteSensitiveWordRequest, Builder> {
        private String appId; 
        private String regionId; 
        private java.util.List < String > wordList; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSensitiveWordRequest request) {
            super(request);
            this.appId = request.appId;
            this.regionId = request.regionId;
            this.wordList = request.wordList;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
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
