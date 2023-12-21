// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PopCreateObjectProjectRequest} extends {@link RequestModel}
 *
 * <p>PopCreateObjectProjectRequest</p>
 */
public class PopCreateObjectProjectRequest extends Request {
    @Body
    @NameInMap("AutoBuild")
    @Validation(required = true)
    private Boolean autoBuild;

    @Body
    @NameInMap("BizUsage")
    @Validation(required = true)
    private String bizUsage;

    @Body
    @NameInMap("CustomSource")
    private String customSource;

    @Body
    @NameInMap("Dependencies")
    private String dependencies;

    @Body
    @NameInMap("ForeignUid")
    private String foreignUid;

    @Body
    @NameInMap("Intro")
    private String intro;

    @Body
    @NameInMap("JwtToken")
    private String jwtToken;

    @Body
    @NameInMap("Mode")
    @Validation(required = true)
    private String mode;

    @Body
    @NameInMap("RecommendStatus")
    private String recommendStatus;

    @Body
    @NameInMap("Title")
    @Validation(required = true)
    private String title;

    private PopCreateObjectProjectRequest(Builder builder) {
        super(builder);
        this.autoBuild = builder.autoBuild;
        this.bizUsage = builder.bizUsage;
        this.customSource = builder.customSource;
        this.dependencies = builder.dependencies;
        this.foreignUid = builder.foreignUid;
        this.intro = builder.intro;
        this.jwtToken = builder.jwtToken;
        this.mode = builder.mode;
        this.recommendStatus = builder.recommendStatus;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PopCreateObjectProjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoBuild
     */
    public Boolean getAutoBuild() {
        return this.autoBuild;
    }

    /**
     * @return bizUsage
     */
    public String getBizUsage() {
        return this.bizUsage;
    }

    /**
     * @return customSource
     */
    public String getCustomSource() {
        return this.customSource;
    }

    /**
     * @return dependencies
     */
    public String getDependencies() {
        return this.dependencies;
    }

    /**
     * @return foreignUid
     */
    public String getForeignUid() {
        return this.foreignUid;
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
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return recommendStatus
     */
    public String getRecommendStatus() {
        return this.recommendStatus;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<PopCreateObjectProjectRequest, Builder> {
        private Boolean autoBuild; 
        private String bizUsage; 
        private String customSource; 
        private String dependencies; 
        private String foreignUid; 
        private String intro; 
        private String jwtToken; 
        private String mode; 
        private String recommendStatus; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(PopCreateObjectProjectRequest request) {
            super(request);
            this.autoBuild = request.autoBuild;
            this.bizUsage = request.bizUsage;
            this.customSource = request.customSource;
            this.dependencies = request.dependencies;
            this.foreignUid = request.foreignUid;
            this.intro = request.intro;
            this.jwtToken = request.jwtToken;
            this.mode = request.mode;
            this.recommendStatus = request.recommendStatus;
            this.title = request.title;
        } 

        /**
         * AutoBuild.
         */
        public Builder autoBuild(Boolean autoBuild) {
            this.putBodyParameter("AutoBuild", autoBuild);
            this.autoBuild = autoBuild;
            return this;
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
         * CustomSource.
         */
        public Builder customSource(String customSource) {
            this.putBodyParameter("CustomSource", customSource);
            this.customSource = customSource;
            return this;
        }

        /**
         * Dependencies.
         */
        public Builder dependencies(String dependencies) {
            this.putBodyParameter("Dependencies", dependencies);
            this.dependencies = dependencies;
            return this;
        }

        /**
         * ForeignUid.
         */
        public Builder foreignUid(String foreignUid) {
            this.putBodyParameter("ForeignUid", foreignUid);
            this.foreignUid = foreignUid;
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
            this.putBodyParameter("JwtToken", jwtToken);
            this.jwtToken = jwtToken;
            return this;
        }

        /**
         * Mode.
         */
        public Builder mode(String mode) {
            this.putBodyParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * RecommendStatus.
         */
        public Builder recommendStatus(String recommendStatus) {
            this.putBodyParameter("RecommendStatus", recommendStatus);
            this.recommendStatus = recommendStatus;
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
        public PopCreateObjectProjectRequest build() {
            return new PopCreateObjectProjectRequest(this);
        } 

    } 

}
