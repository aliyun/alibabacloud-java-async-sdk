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
 * {@link UpdateConsumerAPIKeyInput} extends {@link TeaModel}
 *
 * <p>UpdateConsumerAPIKeyInput</p>
 */
public class UpdateConsumerAPIKeyInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("active")
    private Boolean active;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    private UpdateConsumerAPIKeyInput(Builder builder) {
        this.active = builder.active;
        this.description = builder.description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateConsumerAPIKeyInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return active
     */
    public Boolean getActive() {
        return this.active;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    public static final class Builder {
        private Boolean active; 
        private String description; 

        private Builder() {
        } 

        private Builder(UpdateConsumerAPIKeyInput model) {
            this.active = model.active;
            this.description = model.description;
        } 

        /**
         * <p>是否启用该密钥</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder active(Boolean active) {
            this.active = active;
            return this;
        }

        /**
         * <p>更新后的描述信息</p>
         * 
         * <strong>example:</strong>
         * <p>更新后的密钥描述</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public UpdateConsumerAPIKeyInput build() {
            return new UpdateConsumerAPIKeyInput(this);
        } 

    } 

}
