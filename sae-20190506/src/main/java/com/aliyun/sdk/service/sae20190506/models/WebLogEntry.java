// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link WebLogEntry} extends {@link TeaModel}
 *
 * <p>WebLogEntry</p>
 */
public class WebLogEntry extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    private WebLogEntry(Builder builder) {
        this.message = builder.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WebLogEntry create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    public static final class Builder {
        private String message; 

        private Builder() {
        } 

        private Builder(WebLogEntry model) {
            this.message = model.message;
        } 

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public WebLogEntry build() {
            return new WebLogEntry(this);
        } 

    } 

}
