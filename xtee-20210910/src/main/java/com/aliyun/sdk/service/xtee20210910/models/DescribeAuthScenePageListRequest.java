// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAuthScenePageListRequest} extends {@link RequestModel}
 *
 * <p>DescribeAuthScenePageListRequest</p>
 */
public class DescribeAuthScenePageListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sceneName")
    private String sceneName;

    private DescribeAuthScenePageListRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.regId = builder.regId;
        this.sceneName = builder.sceneName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAuthScenePageListRequest create() {
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
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return sceneName
     */
    public String getSceneName() {
        return this.sceneName;
    }

    public static final class Builder extends Request.Builder<DescribeAuthScenePageListRequest, Builder> {
        private String lang; 
        private String regId; 
        private String sceneName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAuthScenePageListRequest request) {
            super(request);
            this.lang = request.lang;
            this.regId = request.regId;
            this.sceneName = request.sceneName;
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
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * sceneName.
         */
        public Builder sceneName(String sceneName) {
            this.putQueryParameter("sceneName", sceneName);
            this.sceneName = sceneName;
            return this;
        }

        @Override
        public DescribeAuthScenePageListRequest build() {
            return new DescribeAuthScenePageListRequest(this);
        } 

    } 

}
