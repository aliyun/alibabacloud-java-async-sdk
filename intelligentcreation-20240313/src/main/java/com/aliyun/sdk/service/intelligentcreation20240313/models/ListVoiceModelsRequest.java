// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link ListVoiceModelsRequest} extends {@link RequestModel}
 *
 * <p>ListVoiceModelsRequest</p>
 */
public class ListVoiceModelsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resSpecType")
    private String resSpecType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("useScene")
    private String useScene;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("voiceLanguage")
    private String voiceLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("voiceType")
    private String voiceType;

    private ListVoiceModelsRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resSpecType = builder.resSpecType;
        this.useScene = builder.useScene;
        this.voiceLanguage = builder.voiceLanguage;
        this.voiceType = builder.voiceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVoiceModelsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resSpecType
     */
    public String getResSpecType() {
        return this.resSpecType;
    }

    /**
     * @return useScene
     */
    public String getUseScene() {
        return this.useScene;
    }

    /**
     * @return voiceLanguage
     */
    public String getVoiceLanguage() {
        return this.voiceLanguage;
    }

    /**
     * @return voiceType
     */
    public String getVoiceType() {
        return this.voiceType;
    }

    public static final class Builder extends Request.Builder<ListVoiceModelsRequest, Builder> {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String resSpecType; 
        private String useScene; 
        private String voiceLanguage; 
        private String voiceType; 

        private Builder() {
            super();
        } 

        private Builder(ListVoiceModelsRequest request) {
            super(request);
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resSpecType = request.resSpecType;
            this.useScene = request.useScene;
            this.voiceLanguage = request.voiceLanguage;
            this.voiceType = request.voiceType;
        } 

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * resSpecType.
         */
        public Builder resSpecType(String resSpecType) {
            this.putQueryParameter("resSpecType", resSpecType);
            this.resSpecType = resSpecType;
            return this;
        }

        /**
         * useScene.
         */
        public Builder useScene(String useScene) {
            this.putQueryParameter("useScene", useScene);
            this.useScene = useScene;
            return this;
        }

        /**
         * voiceLanguage.
         */
        public Builder voiceLanguage(String voiceLanguage) {
            this.putQueryParameter("voiceLanguage", voiceLanguage);
            this.voiceLanguage = voiceLanguage;
            return this;
        }

        /**
         * voiceType.
         */
        public Builder voiceType(String voiceType) {
            this.putQueryParameter("voiceType", voiceType);
            this.voiceType = voiceType;
            return this;
        }

        @Override
        public ListVoiceModelsRequest build() {
            return new ListVoiceModelsRequest(this);
        } 

    } 

}
