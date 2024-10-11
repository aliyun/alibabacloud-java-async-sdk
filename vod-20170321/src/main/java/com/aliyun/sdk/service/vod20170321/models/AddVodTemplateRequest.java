// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddVodTemplateRequest} extends {@link RequestModel}
 *
 * <p>AddVodTemplateRequest</p>
 */
public class AddVodTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateType;

    private AddVodTemplateRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.name = builder.name;
        this.templateConfig = builder.templateConfig;
        this.templateType = builder.templateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddVodTemplateRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return templateConfig
     */
    public String getTemplateConfig() {
        return this.templateConfig;
    }

    /**
     * @return templateType
     */
    public String getTemplateType() {
        return this.templateType;
    }

    public static final class Builder extends Request.Builder<AddVodTemplateRequest, Builder> {
        private String appId; 
        private String name; 
        private String templateConfig; 
        private String templateType; 

        private Builder() {
            super();
        } 

        private Builder(AddVodTemplateRequest request) {
            super(request);
            this.appId = request.appId;
            this.name = request.name;
            this.templateConfig = request.templateConfig;
            this.templateType = request.templateType;
        } 

        /**
         * <p>The ID of the application. Default value: <strong>app-1000000</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/113600.html">Multi-application service</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>app-****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The name of the template.</p>
         * <ul>
         * <li>The name cannot exceed 128 bytes.</li>
         * <li>The value must be encoded in UTF-8.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The configurations of the snapshot template. The value must be a JSON string. For more information about the data structure, see <a href="https://help.aliyun.com/document_detail/98618.html">SnapshotTemplateConfig</a> and <a href="https://help.aliyun.com/document_detail/98618.html">DynamicImageTemplateConfig</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;SnapshotConfig&quot;:{&quot;Count&quot;:10,&quot;SpecifiedOffsetTime&quot;:0,&quot;Interval&quot;:1,&quot;FrameType&quot;:&quot;normal&quot;},&quot;SnapshotType&quot;:&quot;NormalSnapshot&quot;}</p>
         */
        public Builder templateConfig(String templateConfig) {
            this.putQueryParameter("TemplateConfig", templateConfig);
            this.templateConfig = templateConfig;
            return this;
        }

        /**
         * <p>The type of the template. Set the value to <strong>Snapshot</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Snapshot</p>
         */
        public Builder templateType(String templateType) {
            this.putQueryParameter("TemplateType", templateType);
            this.templateType = templateType;
            return this;
        }

        @Override
        public AddVodTemplateRequest build() {
            return new AddVodTemplateRequest(this);
        } 

    } 

}
