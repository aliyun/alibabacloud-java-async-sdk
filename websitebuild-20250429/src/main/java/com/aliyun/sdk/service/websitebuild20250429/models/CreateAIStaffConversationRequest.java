// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link CreateAIStaffConversationRequest} extends {@link RequestModel}
 *
 * <p>CreateAIStaffConversationRequest</p>
 */
public class CreateAIStaffConversationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Text")
    private String text;

    private CreateAIStaffConversationRequest(Builder builder) {
        super(builder);
        this.text = builder.text;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAIStaffConversationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return text
     */
    public String getText() {
        return this.text;
    }

    public static final class Builder extends Request.Builder<CreateAIStaffConversationRequest, Builder> {
        private String text; 

        private Builder() {
            super();
        } 

        private Builder(CreateAIStaffConversationRequest request) {
            super(request);
            this.text = request.text;
        } 

        /**
         * <p>The user question text. The first 100 characters are truncated as the session title.</p>
         * 
         * <strong>example:</strong>
         * <p>卫浴五金产品，表面采用拉丝不锈钢材质，整体色调为现代银灰色，呈现简约且富有质感的风格。产品包括淋浴花洒、水龙头及毛巾架等配件，均具备防锈、耐腐蚀性能，适用于潮湿环境。各部件连接处设计精密，配有隐藏式螺丝结构，提升整体美观度。水龙头和花洒喷头支持多模式出水，把手操作顺滑，符合人体工学设计。所有五金件通过国家节水认证，支持冷热水接入，安装方式为壁挂式。</p>
         */
        public Builder text(String text) {
            this.putBodyParameter("Text", text);
            this.text = text;
            return this;
        }

        @Override
        public CreateAIStaffConversationRequest build() {
            return new CreateAIStaffConversationRequest(this);
        } 

    } 

}
