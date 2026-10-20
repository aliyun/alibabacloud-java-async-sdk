// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link Runtime} extends {@link TeaModel}
 *
 * <p>Runtime</p>
 */
public class Runtime extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("version")
    private String version;

    private Runtime(Builder builder) {
        this.name = builder.name;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Runtime create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String name; 
        private String version; 

        private Builder() {
        } 

        private Builder(Runtime model) {
            this.name = model.name;
            this.version = model.version;
        } 

        /**
         * <p>Specifies the container runtime. Valid values:</p>
         * <ul>
         * <li><code>containerd</code>: Recommended. Supported in version 1.20 and later.</li>
         * <li><code>Sandboxed-Container.runv</code>: Sandboxed container that provides higher isolation. Supported in version 1.16 and later.</li>
         * <li><code>docker</code>: Supported in clusters of version 1.22 and earlier.</li>
         * </ul>
         * <p>Default value: <code>containerd</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>containerd</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The container runtime version. By default, the latest version is used. For more information about the release notes, see <a href="https://help.aliyun.com/document_detail/207829.html">Container runtime release notes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>1.6.20</p>
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public Runtime build() {
            return new Runtime(this);
        } 

    } 

}
