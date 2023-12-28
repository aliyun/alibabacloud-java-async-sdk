// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oosops20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserTemplateRequest} extends {@link RequestModel}
 *
 * <p>GetUserTemplateRequest</p>
 */
public class GetUserTemplateRequest extends Request {
    @Query
    @NameInMap("AliUid")
    @Validation(required = true)
    private String aliUid;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("TemplateName")
    @Validation(required = true)
    private String templateName;

    @Query
    @NameInMap("TemplateVersion")
    private String templateVersion;

    private GetUserTemplateRequest(Builder builder) {
        super(builder);
        this.aliUid = builder.aliUid;
        this.regionId = builder.regionId;
        this.templateName = builder.templateName;
        this.templateVersion = builder.templateVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliUid
     */
    public String getAliUid() {
        return this.aliUid;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return templateVersion
     */
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public static final class Builder extends Request.Builder<GetUserTemplateRequest, Builder> {
        private String aliUid; 
        private String regionId; 
        private String templateName; 
        private String templateVersion; 

        private Builder() {
            super();
        } 

        private Builder(GetUserTemplateRequest request) {
            super(request);
            this.aliUid = request.aliUid;
            this.regionId = request.regionId;
            this.templateName = request.templateName;
            this.templateVersion = request.templateVersion;
        } 

        /**
         * AliUid.
         */
        public Builder aliUid(String aliUid) {
            this.putQueryParameter("AliUid", aliUid);
            this.aliUid = aliUid;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * TemplateVersion.
         */
        public Builder templateVersion(String templateVersion) {
            this.putQueryParameter("TemplateVersion", templateVersion);
            this.templateVersion = templateVersion;
            return this;
        }

        @Override
        public GetUserTemplateRequest build() {
            return new GetUserTemplateRequest(this);
        } 

    } 

}
