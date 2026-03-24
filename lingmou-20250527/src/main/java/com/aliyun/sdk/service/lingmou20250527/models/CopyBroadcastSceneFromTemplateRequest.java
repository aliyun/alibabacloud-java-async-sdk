// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lingmou20250527.models;

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
 * {@link CopyBroadcastSceneFromTemplateRequest} extends {@link RequestModel}
 *
 * <p>CopyBroadcastSceneFromTemplateRequest</p>
 */
public class CopyBroadcastSceneFromTemplateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ratio")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ratio;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("templateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    private CopyBroadcastSceneFromTemplateRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.ratio = builder.ratio;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopyBroadcastSceneFromTemplateRequest create() {
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
     * @return ratio
     */
    public String getRatio() {
        return this.ratio;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<CopyBroadcastSceneFromTemplateRequest, Builder> {
        private String name; 
        private String ratio; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(CopyBroadcastSceneFromTemplateRequest request) {
            super(request);
            this.name = request.name;
            this.ratio = request.ratio;
            this.templateId = request.templateId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9:16</p>
         */
        public Builder ratio(String ratio) {
            this.putBodyParameter("ratio", ratio);
            this.ratio = ratio;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BS1b2WNnRMu4ouRzT4clY9Jhg</p>
         */
        public Builder templateId(String templateId) {
            this.putBodyParameter("templateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public CopyBroadcastSceneFromTemplateRequest build() {
            return new CopyBroadcastSceneFromTemplateRequest(this);
        } 

    } 

}
