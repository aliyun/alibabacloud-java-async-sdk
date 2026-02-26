// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link InsightsConfig} extends {@link TeaModel}
 *
 * <p>InsightsConfig</p>
 */
public class InsightsConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    private InsightsConfig(Builder builder) {
        this.language = builder.language;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InsightsConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    public static final class Builder {
        private String language; 

        private Builder() {
        } 

        private Builder(InsightsConfig model) {
            this.language = model.language;
        } 

        /**
         * Language.
         */
        public Builder language(String language) {
            this.language = language;
            return this;
        }

        public InsightsConfig build() {
            return new InsightsConfig(this);
        } 

    } 

}
