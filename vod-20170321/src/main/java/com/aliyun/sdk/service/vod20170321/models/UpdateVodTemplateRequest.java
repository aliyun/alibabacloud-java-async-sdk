// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateVodTemplateRequest} extends {@link RequestModel}
 *
 * <p>UpdateVodTemplateRequest</p>
 */
public class UpdateVodTemplateRequest extends Request {
    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("TemplateConfig")
    private String templateConfig;

    @Query
    @NameInMap("VodTemplateId")
    @Validation(required = true)
    private String vodTemplateId;

    private UpdateVodTemplateRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.templateConfig = builder.templateConfig;
        this.vodTemplateId = builder.vodTemplateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateVodTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return vodTemplateId
     */
    public String getVodTemplateId() {
        return this.vodTemplateId;
    }

    public static final class Builder extends Request.Builder<UpdateVodTemplateRequest, Builder> {
        private String name; 
        private String templateConfig; 
        private String vodTemplateId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateVodTemplateRequest request) {
            super(request);
            this.name = request.name;
            this.templateConfig = request.templateConfig;
            this.vodTemplateId = request.vodTemplateId;
        } 

        /**
         * The name of the template.
         * <p>
         * 
         * *   The name can be up to 128 bytes in length.
         * *   The value must be encoded in UTF-8.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The configurations of the snapshot template. The value is a JSON-formatted string. For more information about the data structure, see the "SnapshotTemplateConfig" section of the [Media processing parameters](~~98618~~) topic.
         */
        public Builder templateConfig(String templateConfig) {
            this.putQueryParameter("TemplateConfig", templateConfig);
            this.templateConfig = templateConfig;
            return this;
        }

        /**
         * The ID of the snapshot template.
         */
        public Builder vodTemplateId(String vodTemplateId) {
            this.putQueryParameter("VodTemplateId", vodTemplateId);
            this.vodTemplateId = vodTemplateId;
            return this;
        }

        @Override
        public UpdateVodTemplateRequest build() {
            return new UpdateVodTemplateRequest(this);
        } 

    } 

}
