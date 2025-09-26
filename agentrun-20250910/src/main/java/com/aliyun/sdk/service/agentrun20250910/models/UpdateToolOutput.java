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
 * {@link UpdateToolOutput} extends {@link TeaModel}
 *
 * <p>UpdateToolOutput</p>
 */
public class UpdateToolOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private UpdateToolData data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private UpdateToolOutput(Builder builder) {
        this.data = builder.data;
        this.message = builder.message;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateToolOutput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public UpdateToolData getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private UpdateToolData data; 
        private String message; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(UpdateToolOutput model) {
            this.data = model.data;
            this.message = model.message;
            this.success = model.success;
        } 

        /**
         * data.
         */
        public Builder data(UpdateToolData data) {
            this.data = data;
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
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public UpdateToolOutput build() {
            return new UpdateToolOutput(this);
        } 

    } 

}
