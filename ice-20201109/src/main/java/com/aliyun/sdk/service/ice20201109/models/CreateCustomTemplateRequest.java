// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
         * <p>The template name.</p>
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
         * <p>The template subtype.</p>
         * <p>Valid values for transcoding templates:</p>
         * <ul>
         * <li>1 (Normal): regular template.</li>
         * <li>2 (AudioTranscode): audio transcoding template.</li>
         * <li>3 (Remux): container format conversion template.</li>
         * <li>4 (NarrowBandV1): Narrowband HD 1.0 template.</li>
         * <li>5 (NarrowBandV2): Narrowband HD 2.0 template.</li>
         * </ul>
         * <p>Valid values for snapshot templates:</p>
         * <ul>
         * <li>1 (Normal): regular template.</li>
         * <li>2 (Sprite): sprite template.</li>
         * <li>3 (WebVtt): WebVTT template.</li>
         * </ul>
         * <p>Valid values for AI-assisted content moderation templates:</p>
         * <ul>
         * <li>1 (Video): video moderation template.</li>
         * <li>2 (Audio): audio moderation template.</li>
         * <li>3 (Image): image moderation template.</li>
         * </ul>
         * <p>Valid values for AI-assisted intelligent erasure templates.</p>
         * <ul>
         * <li>1 (VideoDelogo): logo erasure template.</li>
         * <li>2 (VideoDetext): subtitle erasure template.</li>
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
         * <p>The template configurations. For more information, see <a href="https://help.aliyun.com/document_detail/448291.html">Template parameters</a>.</p>
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
         * <p>The template type. Valid values:</p>
         * <ul>
         * <li>1: transcoding template.</li>
         * <li>2: snapshot template.</li>
         * <li>3: animated image template.</li>
         * <li>4. image watermark template.</li>
         * <li>5: text watermark template.</li>
         * <li>6: subtitle template.</li>
         * <li>7: AI-assisted content moderation template.</li>
         * <li>8: AI-assisted intelligent thumbnail template.</li>
         * <li>9: AI-assisted intelligent erasure template.</li>
         * <li>10: AI-assisted media fingerprint analysis template.</li>
         * <li>11: AI-assisted smart tagging template.</li>
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
