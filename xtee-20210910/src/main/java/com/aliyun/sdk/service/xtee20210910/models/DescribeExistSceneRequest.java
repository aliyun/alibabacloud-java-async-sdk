// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExistSceneRequest} extends {@link RequestModel}
 *
 * <p>DescribeExistSceneRequest</p>
 */
public class DescribeExistSceneRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneName")
    private String sceneName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    private DescribeExistSceneRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.sceneName = builder.sceneName;
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExistSceneRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return sceneName
     */
    public String getSceneName() {
        return this.sceneName;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    public static final class Builder extends Request.Builder<DescribeExistSceneRequest, Builder> {
        private String lang; 
        private String sceneName; 
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeExistSceneRequest request) {
            super(request);
            this.lang = request.lang;
            this.sceneName = request.sceneName;
            this.regId = request.regId;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * SceneName.
         */
        public Builder sceneName(String sceneName) {
            this.putQueryParameter("SceneName", sceneName);
            this.sceneName = sceneName;
            return this;
        }

        /**
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        @Override
        public DescribeExistSceneRequest build() {
            return new DescribeExistSceneRequest(this);
        } 

    } 

}
