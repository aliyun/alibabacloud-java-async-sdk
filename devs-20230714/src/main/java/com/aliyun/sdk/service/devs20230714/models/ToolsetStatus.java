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
 * {@link ToolsetStatus} extends {@link TeaModel}
 *
 * <p>ToolsetStatus</p>
 */
public class ToolsetStatus extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("tools")
    private java.util.Map<String, Tool> tools;

    private ToolsetStatus(Builder builder) {
        this.tools = builder.tools;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ToolsetStatus create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tools
     */
    public java.util.Map<String, Tool> getTools() {
        return this.tools;
    }

    public static final class Builder {
        private java.util.Map<String, Tool> tools; 

        private Builder() {
        } 

        private Builder(ToolsetStatus model) {
            this.tools = model.tools;
        } 

        /**
         * tools.
         */
        public Builder tools(java.util.Map<String, Tool> tools) {
            this.tools = tools;
            return this;
        }

        public ToolsetStatus build() {
            return new ToolsetStatus(this);
        } 

    } 

}
