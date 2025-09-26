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
 * {@link GetToolOutput} extends {@link TeaModel}
 *
 * <p>GetToolOutput</p>
 */
public class GetToolOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private ToolInfo data;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetToolOutput(Builder builder) {
        this.data = builder.data;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetToolOutput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public ToolInfo getData() {
        return this.data;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private ToolInfo data; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetToolOutput model) {
            this.data = model.data;
            this.success = model.success;
        } 

        /**
         * data.
         */
        public Builder data(ToolInfo data) {
            this.data = data;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetToolOutput build() {
            return new GetToolOutput(this);
        } 

    } 

}
