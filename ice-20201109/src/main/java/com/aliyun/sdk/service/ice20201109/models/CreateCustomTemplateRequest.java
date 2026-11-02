// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link CreateCustomTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateCustomTemplateRequest</p>
 */
public class CreateCustomTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Subtype")
    private Integer subtype;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer type;

    private CreateCustomTemplateRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.subtype = builder.subtype;
        this.templateConfig = builder.templateConfig;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomTemplateRequest create() {
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
     * @return subtype
     */
    public Integer getSubtype() {
        return this.subtype;
    }

    /**
     * @return templateConfig
     */
    public String getTemplateConfig() {
        return this.templateConfig;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateCustomTemplateRequest, Builder> {
        private String name; 
        private Integer subtype; 
        private String templateConfig; 
        private Integer type; 

        private Builder() {
            super();
        } 

        private Builder(CreateCustomTemplateRequest request) {
            super(request);
            this.name = request.name;
            this.subtype = request.subtype;
            this.templateConfig = request.templateConfig;
            this.type = request.type;
        } 

        /**
         * <p>The name of the template.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-template</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The subtype of the template.</p>
         * <p>Subtypes of transcoding templates:</p>
         * <ul>
         * <li>1: normal transcoding template (Normal)</li>
         * <li>2: audio transcoding template (AudioTranscode)</li>
         * <li>3: remuxing (Remux)</li>
         * <li>4: Narrow Band HD 1.0 (NarrowBandV1)</li>
         * <li>5: Narrow Band HD 2.0 (NarrowBandV2)</li>
         * </ul>
         * <p>Subtypes of snapshot templates:</p>
         * <ul>
         * <li>1: normal snapshot or static snapshot (Normal)</li>
         * <li>2: sprite snapshot (Sprite)</li>
         * <li>3: WebVTT snapshot (WebVtt)</li>
         * </ul>
         * <p>Subtypes of AI-based content moderation templates:</p>
         * <ul>
         * <li>1: video moderation (Video) </li>
         * <li>2: audio moderation (Audio)</li>
         * <li>3: image moderation (Image)</li>
         * </ul>
         * <p>Subtypes of AI-based smart erasure templates:</p>
         * <ul>
         * <li>1: icon erasure (VideoDelogo)</li>
         * <li>2: subtitle erasure (VideoDetext)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder subtype(Integer subtype) {
            this.putQueryParameter("Subtype", subtype);
            this.subtype = subtype;
            return this;
        }

        /**
         * <p>The template configuration. For detailed metric description, see <a href="https://help.aliyun.com/document_detail/448291.html">Template parameters</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Container&quot;:{&quot;Format&quot;:&quot;flv&quot;},&quot;Video&quot;:{},&quot;Audio&quot;:{}}</p>
         */
        public Builder templateConfig(String templateConfig) {
            this.putQueryParameter("TemplateConfig", templateConfig);
            this.templateConfig = templateConfig;
            return this;
        }

        /**
         * <p>The templatetype. Valid values:</p>
         * <ul>
         * <li>1: transcoding template</li>
         * <li>2: snapshot template</li>
         * <li>3: animated image template</li>
         * <li>4: image watermark template</li>
         * <li>5: text watermark template</li>
         * <li>6: subtitle template</li>
         * <li>7: AI-based content moderation</li>
         * <li>8: AI-based smart thumbnail</li>
         * <li>9: AI-based smart erasure</li>
         * <li>10: AI-based DNA template</li>
         * <li>11: AI-based label template</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder type(Integer type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateCustomTemplateRequest build() {
            return new CreateCustomTemplateRequest(this);
        } 

    } 

}
