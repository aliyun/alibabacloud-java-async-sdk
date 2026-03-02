// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link AppConfigMapping} extends {@link TeaModel}
 *
 * <p>AppConfigMapping</p>
 */
public class AppConfigMapping extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("alias")
    private String alias;

    @com.aliyun.core.annotation.NameInMap("modelId")
    private String modelId;

    private AppConfigMapping(Builder builder) {
        this.alias = builder.alias;
        this.modelId = builder.modelId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AppConfigMapping create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alias
     */
    public String getAlias() {
        return this.alias;
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    public static final class Builder {
        private String alias; 
        private String modelId; 

        private Builder() {
        } 

        private Builder(AppConfigMapping model) {
            this.alias = model.alias;
            this.modelId = model.modelId;
        } 

        /**
         * alias.
         */
        public Builder alias(String alias) {
            this.alias = alias;
            return this;
        }

        /**
         * modelId.
         */
        public Builder modelId(String modelId) {
            this.modelId = modelId;
            return this;
        }

        public AppConfigMapping build() {
            return new AppConfigMapping(this);
        } 

    } 

}
