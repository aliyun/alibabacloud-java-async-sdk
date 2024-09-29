// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link TextTaskResult} extends {@link TeaModel}
 *
 * <p>TextTaskResult</p>
 */
public class TextTaskResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("textTask")
    private TextTask textTask;

    private TextTaskResult(Builder builder) {
        this.textTask = builder.textTask;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TextTaskResult create() {
        return builder().build();
    }

    /**
     * @return textTask
     */
    public TextTask getTextTask() {
        return this.textTask;
    }

    public static final class Builder {
        private TextTask textTask; 

        /**
         * textTask.
         */
        public Builder textTask(TextTask textTask) {
            this.textTask = textTask;
            return this;
        }

        public TextTaskResult build() {
            return new TextTaskResult(this);
        } 

    } 

}
