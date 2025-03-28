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
 * {@link Installation} extends {@link TeaModel}
 *
 * <p>Installation</p>
 */
public class Installation extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("actionUri")
    private String actionUri;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("stage")
    private String stage;

    private Installation(Builder builder) {
        this.actionUri = builder.actionUri;
        this.message = builder.message;
        this.stage = builder.stage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Installation create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionUri
     */
    public String getActionUri() {
        return this.actionUri;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return stage
     */
    public String getStage() {
        return this.stage;
    }

    public static final class Builder {
        private String actionUri; 
        private String message; 
        private String stage; 

        private Builder() {
        } 

        private Builder(Installation model) {
            this.actionUri = model.actionUri;
            this.message = model.message;
            this.stage = model.stage;
        } 

        /**
         * actionUri.
         */
        public Builder actionUri(String actionUri) {
            this.actionUri = actionUri;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * stage.
         */
        public Builder stage(String stage) {
            this.stage = stage;
            return this;
        }

        public Installation build() {
            return new Installation(this);
        } 

    } 

}
