// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link AgentDataSemanticsText} extends {@link TeaModel}
 *
 * <p>AgentDataSemanticsText</p>
 */
public class AgentDataSemanticsText extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    private AgentDataSemanticsText(Builder builder) {
        this.content = builder.content;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AgentDataSemanticsText create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    public static final class Builder {
        private String content; 

        private Builder() {
        } 

        private Builder(AgentDataSemanticsText model) {
            this.content = model.content;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <h2>数据说明</h2>
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        public AgentDataSemanticsText build() {
            return new AgentDataSemanticsText(this);
        } 

    } 

}
