// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link AddScriptHotWordResponseBody} extends {@link TeaModel}
 *
 * <p>AddScriptHotWordResponseBody</p>
 */
public class AddScriptHotWordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("hotWordId")
    private String hotWordId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private AddScriptHotWordResponseBody(Builder builder) {
        this.hotWordId = builder.hotWordId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddScriptHotWordResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hotWordId
     */
    public String getHotWordId() {
        return this.hotWordId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String hotWordId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(AddScriptHotWordResponseBody model) {
            this.hotWordId = model.hotWordId;
            this.requestId = model.requestId;
        } 

        /**
         * hotWordId.
         */
        public Builder hotWordId(String hotWordId) {
            this.hotWordId = hotWordId;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddScriptHotWordResponseBody build() {
            return new AddScriptHotWordResponseBody(this);
        } 

    } 

}
