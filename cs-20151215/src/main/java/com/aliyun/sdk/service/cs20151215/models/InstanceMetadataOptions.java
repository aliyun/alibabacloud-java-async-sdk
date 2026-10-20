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
 * {@link InstanceMetadataOptions} extends {@link TeaModel}
 *
 * <p>InstanceMetadataOptions</p>
 */
public class InstanceMetadataOptions extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("http_tokens")
    private String httpTokens;

    private InstanceMetadataOptions(Builder builder) {
        this.httpTokens = builder.httpTokens;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstanceMetadataOptions create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return httpTokens
     */
    public String getHttpTokens() {
        return this.httpTokens;
    }

    public static final class Builder {
        private String httpTokens; 

        private Builder() {
        } 

        private Builder(InstanceMetadataOptions model) {
            this.httpTokens = model.httpTokens;
        } 

        /**
         * <p>The ECS instance metadata access mode configuration. Valid values:</p>
         * <ul>
         * <li><code>optional</code>: Compatible with both normal mode and hardened mode.</li>
         * <li><code>required</code>: Enables hardened mode only (IMDSv2). After this mode is enabled, applications in the node cannot access ECS instance metadata in normal mode.</li>
         * </ul>
         * <p>Default value: <code>optional</code>.</p>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <ul>
         * <li>This parameter is currently available only by whitelist. To use this parameter, submit a ticket.</li>
         * <li>Only ACK managed clusters of version 1.28 and later support this parameter.</li>
         * </ul>
         * <blockquote>
         * <p>For more information about instance metadata access modes, see <a href="https://help.aliyun.com/document_detail/108460.html">Instance metadata access modes</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>optional</p>
         */
        public Builder httpTokens(String httpTokens) {
            this.httpTokens = httpTokens;
            return this;
        }

        public InstanceMetadataOptions build() {
            return new InstanceMetadataOptions(this);
        } 

    } 

}
