// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TaskSpec} extends {@link TeaModel}
 *
 * <p>TaskSpec</p>
 */
public class TaskSpec extends TeaModel {
    @NameInMap("context")
    private Context context;

    @NameInMap("templateName")
    private String templateName;

    private TaskSpec(Builder builder) {
        this.context = builder.context;
        this.templateName = builder.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TaskSpec create() {
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
         * Task template name.
         */
        public Builder templateName(String templateName) {
            this.templateName = templateName;
            return this;
        }

        public TaskSpec build() {
            return new TaskSpec(this);
        } 

    } 

}
