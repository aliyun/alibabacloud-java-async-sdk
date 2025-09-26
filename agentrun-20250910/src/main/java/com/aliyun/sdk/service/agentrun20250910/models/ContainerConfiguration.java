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
 * {@link ContainerConfiguration} extends {@link TeaModel}
 *
 * <p>ContainerConfiguration</p>
 */
public class ContainerConfiguration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("command")
    private java.util.List<String> command;

    @com.aliyun.core.annotation.NameInMap("image")
    private String image;

    private ContainerConfiguration(Builder builder) {
        this.command = builder.command;
        this.image = builder.image;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ContainerConfiguration create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return command
     */
    public java.util.List<String> getCommand() {
        return this.command;
    }

    /**
     * @return image
     */
    public String getImage() {
        return this.image;
    }

    public static final class Builder {
        private java.util.List<String> command; 
        private String image; 

        private Builder() {
        } 

        private Builder(ContainerConfiguration model) {
            this.command = model.command;
            this.image = model.image;
        } 

        /**
         * <p>在容器中运行的命令（例如：[&quot;python3&quot;, &quot;app.py&quot;]）</p>
         */
        public Builder command(java.util.List<String> command) {
            this.command = command;
            return this;
        }

        /**
         * image.
         */
        public Builder image(String image) {
            this.image = image;
            return this;
        }

        public ContainerConfiguration build() {
            return new ContainerConfiguration(this);
        } 

    } 

}
