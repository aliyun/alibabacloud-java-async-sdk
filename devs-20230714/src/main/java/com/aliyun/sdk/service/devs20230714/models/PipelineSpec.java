// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link PipelineSpec} extends {@link TeaModel}
 *
 * <p>PipelineSpec</p>
 */
public class PipelineSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("context")
    private Context context;

    @com.aliyun.core.annotation.NameInMap("templateName")
    private String templateName;

    @com.aliyun.core.annotation.NameInMap("templateSpec")
    private PipelineTemplateSpec templateSpec;

    private PipelineSpec(Builder builder) {
        this.context = builder.context;
        this.templateName = builder.templateName;
        this.templateSpec = builder.templateSpec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PipelineSpec create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return context
     */
    public Context getContext() {
        return this.context;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return templateSpec
     */
    public PipelineTemplateSpec getTemplateSpec() {
        return this.templateSpec;
    }

    public static final class Builder {
        private Context context; 
        private String templateName; 
        private PipelineTemplateSpec templateSpec; 

        private Builder() {
        } 

        private Builder(PipelineSpec model) {
            this.context = model.context;
            this.templateName = model.templateName;
            this.templateSpec = model.templateSpec;
        } 

        /**
         * context.
         */
        public Builder context(Context context) {
            this.context = context;
            return this;
        }

        /**
         * templateName.
         */
        public Builder templateName(String templateName) {
            this.templateName = templateName;
            return this;
        }

        /**
         * templateSpec.
         */
        public Builder templateSpec(PipelineTemplateSpec templateSpec) {
            this.templateSpec = templateSpec;
            return this;
        }

        public PipelineSpec build() {
            return new PipelineSpec(this);
        } 

    } 

}
