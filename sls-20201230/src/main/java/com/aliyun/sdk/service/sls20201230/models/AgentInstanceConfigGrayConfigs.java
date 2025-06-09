// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link AgentInstanceConfigGrayConfigs} extends {@link TeaModel}
 *
 * <p>AgentInstanceConfigGrayConfigs</p>
 */
public class AgentInstanceConfigGrayConfigs extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("condition")
    private String condition;

    @com.aliyun.core.annotation.NameInMap("content")
    private String content;

    private AgentInstanceConfigGrayConfigs(Builder builder) {
        this.condition = builder.condition;
        this.content = builder.content;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AgentInstanceConfigGrayConfigs create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return condition
     */
    public String getCondition() {
        return this.condition;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    public static final class Builder {
        private String condition; 
        private String content; 

        private Builder() {
        } 

        private Builder(AgentInstanceConfigGrayConfigs model) {
            this.condition = model.condition;
            this.content = model.content;
        } 

        /**
         * condition.
         */
        public Builder condition(String condition) {
            this.condition = condition;
            return this;
        }

        /**
         * content.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        public AgentInstanceConfigGrayConfigs build() {
            return new AgentInstanceConfigGrayConfigs(this);
        } 

    } 

}
