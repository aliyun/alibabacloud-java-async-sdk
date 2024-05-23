// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetContentAnalyzeConfigRequest} extends {@link RequestModel}
 *
 * <p>SetContentAnalyzeConfigRequest</p>
 */
public class SetContentAnalyzeConfigRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Auto")
    private Boolean auto;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SaveType")
    private String saveType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    private SetContentAnalyzeConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.auto = builder.auto;
        this.saveType = builder.saveType;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetContentAnalyzeConfigRequest create() {
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
     * @return auto
     */
    public Boolean getAuto() {
        return this.auto;
    }

    /**
     * @return saveType
     */
    public String getSaveType() {
        return this.saveType;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<SetContentAnalyzeConfigRequest, Builder> {
        private String regionId; 
        private Boolean auto; 
        private String saveType; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(SetContentAnalyzeConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.auto = request.auto;
            this.saveType = request.saveType;
            this.templateId = request.templateId;
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
         * Auto.
         */
        public Builder auto(Boolean auto) {
            this.putQueryParameter("Auto", auto);
            this.auto = auto;
            return this;
        }

        /**
         * SaveType.
         */
        public Builder saveType(String saveType) {
            this.putQueryParameter("SaveType", saveType);
            this.saveType = saveType;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public SetContentAnalyzeConfigRequest build() {
            return new SetContentAnalyzeConfigRequest(this);
        } 

    } 

}
