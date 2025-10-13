// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link McpServerConfig} extends {@link TeaModel}
 *
 * <p>McpServerConfig</p>
 */
public class McpServerConfig extends TeaModel {
    private McpServerConfig(Builder builder) {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static McpServerConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder {

        private Builder() {
        } 

        private Builder(McpServerConfig model) {
        } 

        public McpServerConfig build() {
            return new McpServerConfig(this);
        } 

    } 

}
