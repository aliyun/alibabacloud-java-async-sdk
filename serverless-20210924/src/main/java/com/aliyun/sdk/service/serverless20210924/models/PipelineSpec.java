// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PipelineSpec} extends {@link TeaModel}
 *
 * <p>PipelineSpec</p>
 */
public class PipelineSpec extends TeaModel {
    @NameInMap("context")
    private Context context;

    @NameInMap("templateName")
    private String templateName;

    private PipelineSpec(Builder builder) {
        this.context = builder.context;
        this.templateName = builder.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PipelineSpec create() {
        return builder().build();
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

    public static final class Builder {
        private Context context; 
        private String templateName; 

        /**
         * context.
         */
        public Builder context(Context context) {
            this.context = context;
            return this;
        }

        /**
         * An exist valid pipeline template name.
         */
        public Builder templateName(String templateName) {
            this.templateName = templateName;
            return this;
        }

        public PipelineSpec build() {
            return new PipelineSpec(this);
        } 

    } 

}
