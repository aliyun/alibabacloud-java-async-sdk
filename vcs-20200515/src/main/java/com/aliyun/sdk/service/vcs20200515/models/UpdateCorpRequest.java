// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCorpRequest} extends {@link RequestModel}
 *
 * <p>UpdateCorpRequest</p>
 */
public class UpdateCorpRequest extends Request {
    @Body
    @NameInMap("AppName")
    private String appName;

    @Body
    @NameInMap("CorpId")
    private String corpId;

    @Body
    @NameInMap("CorpName")
    private String corpName;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("IconPath")
    private String iconPath;

    @Body
    @NameInMap("IsvSubId")
    private String isvSubId;

    @Body
    @NameInMap("ParentCorpId")
    private String parentCorpId;

    private UpdateCorpRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.corpId = builder.corpId;
        this.corpName = builder.corpName;
        this.description = builder.description;
        this.iconPath = builder.iconPath;
        this.isvSubId = builder.isvSubId;
        this.parentCorpId = builder.parentCorpId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCorpRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return corpId
     */
    public String getCorpId() {
        return this.corpId;
    }

    /**
     * @return corpName
     */
    public String getCorpName() {
        return this.corpName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return iconPath
     */
    public String getIconPath() {
        return this.iconPath;
    }

    /**
     * @return isvSubId
     */
    public String getIsvSubId() {
        return this.isvSubId;
    }

    /**
     * @return parentCorpId
     */
    public String getParentCorpId() {
        return this.parentCorpId;
    }

    public static final class Builder extends Request.Builder<UpdateCorpRequest, Builder> {
        private String appName; 
        private String corpId; 
        private String corpName; 
        private String description; 
        private String iconPath; 
        private String isvSubId; 
        private String parentCorpId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCorpRequest response) {
            super(response);
            this.appName = response.appName;
            this.corpId = response.corpId;
            this.corpName = response.corpName;
            this.description = response.description;
            this.iconPath = response.iconPath;
            this.isvSubId = response.isvSubId;
            this.parentCorpId = response.parentCorpId;
        } 

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putBodyParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * CorpId.
         */
        public Builder corpId(String corpId) {
            this.putBodyParameter("CorpId", corpId);
            this.corpId = corpId;
            return this;
        }

        /**
         * CorpName.
         */
        public Builder corpName(String corpName) {
            this.putBodyParameter("CorpName", corpName);
            this.corpName = corpName;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * IconPath.
         */
        public Builder iconPath(String iconPath) {
            this.putBodyParameter("IconPath", iconPath);
            this.iconPath = iconPath;
            return this;
        }

        /**
         * IsvSubId.
         */
        public Builder isvSubId(String isvSubId) {
            this.putBodyParameter("IsvSubId", isvSubId);
            this.isvSubId = isvSubId;
            return this;
        }

        /**
         * ParentCorpId.
         */
        public Builder parentCorpId(String parentCorpId) {
            this.putBodyParameter("ParentCorpId", parentCorpId);
            this.parentCorpId = parentCorpId;
            return this;
        }

        @Override
        public UpdateCorpRequest build() {
            return new UpdateCorpRequest(this);
        } 

    } 

}
