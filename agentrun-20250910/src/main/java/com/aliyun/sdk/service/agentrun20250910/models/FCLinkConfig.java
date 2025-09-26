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
 * {@link FCLinkConfig} extends {@link TeaModel}
 *
 * <p>FCLinkConfig</p>
 */
public class FCLinkConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("functionName")
    private String functionName;

    @com.aliyun.core.annotation.NameInMap("version")
    private String version;

    private FCLinkConfig(Builder builder) {
        this.functionName = builder.functionName;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FCLinkConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String functionName; 
        private String version; 

        private Builder() {
        } 

        private Builder(FCLinkConfig model) {
            this.functionName = model.functionName;
            this.version = model.version;
        } 

        /**
         * functionName.
         */
        public Builder functionName(String functionName) {
            this.functionName = functionName;
            return this;
        }

        /**
         * version.
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public FCLinkConfig build() {
            return new FCLinkConfig(this);
        } 

    } 

}
