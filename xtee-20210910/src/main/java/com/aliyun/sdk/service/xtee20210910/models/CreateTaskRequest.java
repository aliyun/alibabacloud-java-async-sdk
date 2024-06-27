// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateTaskRequest</p>
 */
public class CreateTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientFileName")
    private String clientFileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientPath")
    private String clientPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Describe")
    private String describe;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneName")
    private String sceneName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    private CreateTaskRequest(Builder builder) {
        super(builder);
        this.clientFileName = builder.clientFileName;
        this.clientPath = builder.clientPath;
        this.describe = builder.describe;
        this.lang = builder.lang;
        this.sceneName = builder.sceneName;
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientFileName
     */
    public String getClientFileName() {
        return this.clientFileName;
    }

    /**
     * @return clientPath
     */
    public String getClientPath() {
        return this.clientPath;
    }

    /**
     * @return describe
     */
    public String getDescribe() {
        return this.describe;
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

    public static final class Builder extends Request.Builder<CreateTaskRequest, Builder> {
        private String clientFileName; 
        private String clientPath; 
        private String describe; 
        private String lang; 
        private String sceneName; 
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(CreateTaskRequest request) {
            super(request);
            this.clientFileName = request.clientFileName;
            this.clientPath = request.clientPath;
            this.describe = request.describe;
            this.lang = request.lang;
            this.sceneName = request.sceneName;
            this.regId = request.regId;
        } 

        /**
         * ClientFileName.
         */
        public Builder clientFileName(String clientFileName) {
            this.putQueryParameter("ClientFileName", clientFileName);
            this.clientFileName = clientFileName;
            return this;
        }

        /**
         * ClientPath.
         */
        public Builder clientPath(String clientPath) {
            this.putQueryParameter("ClientPath", clientPath);
            this.clientPath = clientPath;
            return this;
        }

        /**
         * Describe.
         */
        public Builder describe(String describe) {
            this.putQueryParameter("Describe", describe);
            this.describe = describe;
            return this;
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
        public CreateTaskRequest build() {
            return new CreateTaskRequest(this);
        } 

    } 

}
