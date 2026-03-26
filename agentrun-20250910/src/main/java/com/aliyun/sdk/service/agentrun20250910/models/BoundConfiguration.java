// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link BoundConfiguration} extends {@link TeaModel}
 *
 * <p>BoundConfiguration</p>
 */
public class BoundConfiguration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("boundTools")
    private java.util.List<BoundTool> boundTools;

    private BoundConfiguration(Builder builder) {
        this.boundTools = builder.boundTools;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BoundConfiguration create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return boundTools
     */
    public java.util.List<BoundTool> getBoundTools() {
        return this.boundTools;
    }

    public static final class Builder {
        private java.util.List<BoundTool> boundTools; 

        private Builder() {
        } 

        private Builder(BoundConfiguration model) {
            this.boundTools = model.boundTools;
        } 

        /**
         * <p>绑定的工具配置列表，每个配置项定义一个工具与特定 HTTP 路径和方法的绑定关系</p>
         */
        public Builder boundTools(java.util.List<BoundTool> boundTools) {
            this.boundTools = boundTools;
            return this;
        }

        public BoundConfiguration build() {
            return new BoundConfiguration(this);
        } 

    } 

}
