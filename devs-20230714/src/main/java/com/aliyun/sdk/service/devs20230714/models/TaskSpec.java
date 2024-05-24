// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TaskSpec} extends {@link TeaModel}
 *
 * <p>TaskSpec</p>
 */
public class TaskSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("context")
    private Context context;

    @com.aliyun.core.annotation.NameInMap("templateName")
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
         * templateName.
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
