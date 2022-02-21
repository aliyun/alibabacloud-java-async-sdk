// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCorpRequest} extends {@link RequestModel}
 *
 * <p>CreateCorpRequest</p>
 */
public class CreateCorpRequest extends Request {
    @Body
    @NameInMap("AlgorithmType")
    private String algorithmType;

    @Body
    @NameInMap("AppName")
    @Validation(required = true)
    private String appName;

    @Body
    @NameInMap("CorpName")
    @Validation(required = true)
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

    private CreateCorpRequest(Builder builder) {
        super(builder);
        this.algorithmType = builder.algorithmType;
        this.appName = builder.appName;
        this.corpName = builder.corpName;
        this.description = builder.description;
        this.iconPath = builder.iconPath;
        this.isvSubId = builder.isvSubId;
        this.parentCorpId = builder.parentCorpId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCorpRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithmType
     */
    public String getAlgorithmType() {
        return this.algorithmType;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
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

    public static final class Builder extends Request.Builder<CreateCorpRequest, Builder> {
        private String algorithmType; 
        private String appName; 
        private String corpName; 
        private String description; 
        private String iconPath; 
        private String isvSubId; 
        private String parentCorpId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCorpRequest response) {
            super(response);
            this.algorithmType = response.algorithmType;
            this.appName = response.appName;
            this.corpName = response.corpName;
            this.description = response.description;
            this.iconPath = response.iconPath;
            this.isvSubId = response.isvSubId;
            this.parentCorpId = response.parentCorpId;
        } 

        /**
         * AlgorithmType.
         */
        public Builder algorithmType(String algorithmType) {
            this.putBodyParameter("AlgorithmType", algorithmType);
            this.algorithmType = algorithmType;
            return this;
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
        public CreateCorpRequest build() {
            return new CreateCorpRequest(this);
        } 

    } 

}
