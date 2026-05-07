// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetJobTemplateDefaultVersionRequest} extends {@link RequestModel}
 *
 * <p>SetJobTemplateDefaultVersionRequest</p>
 */
public class SetJobTemplateDefaultVersionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128)
    private String templateId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Version")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Integer version;

    private SetJobTemplateDefaultVersionRequest(Builder builder) {
        super(builder);
        this.templateId = builder.templateId;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetJobTemplateDefaultVersionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return version
     */
    public Integer getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<SetJobTemplateDefaultVersionRequest, Builder> {
        private String templateId; 
        private Integer version; 

        private Builder() {
            super();
        } 

        private Builder(SetJobTemplateDefaultVersionRequest request) {
            super(request);
            this.templateId = request.templateId;
            this.version = request.version;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tplmceolmf2****</p>
         */
        public Builder templateId(String templateId) {
            this.putPathParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>要设置为默认的模板版本号</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder version(Integer version) {
            this.putBodyParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public SetJobTemplateDefaultVersionRequest build() {
            return new SetJobTemplateDefaultVersionRequest(this);
        } 

    } 

}
