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
 * {@link PublishFlowVersionInput} extends {@link TeaModel}
 *
 * <p>PublishFlowVersionInput</p>
 */
public class PublishFlowVersionInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    private PublishFlowVersionInput(Builder builder) {
        this.description = builder.description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishFlowVersionInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    public static final class Builder {
        private String description; 

        private Builder() {
        } 

        private Builder(PublishFlowVersionInput model) {
            this.description = model.description;
        } 

        /**
         * <p>工作流版本的描述信息</p>
         * 
         * <strong>example:</strong>
         * <p>Version 1.0 - Initial release</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public PublishFlowVersionInput build() {
            return new PublishFlowVersionInput(this);
        } 

    } 

}
