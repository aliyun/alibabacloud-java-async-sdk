// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

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
 * {@link InstallAddonResponseBody} extends {@link TeaModel}
 *
 * <p>InstallAddonResponseBody</p>
 */
public class InstallAddonResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AddonId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String addonId;

    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private InstallAddonResponseBody(Builder builder) {
        this.addonId = builder.addonId;
        this.clusterId = builder.clusterId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstallAddonResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addonId
     */
    public String getAddonId() {
        return this.addonId;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String addonId; 
        private String clusterId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(InstallAddonResponseBody model) {
            this.addonId = model.addonId;
            this.clusterId = model.clusterId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The addon ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Login-1.0-W4g****</p>
         */
        public Builder addonId(String addonId) {
            this.addonId = addonId;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-hz-FYUr32****</p>
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B745C159-3155-4B94-95D0-4B73D4D2****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public InstallAddonResponseBody build() {
            return new InstallAddonResponseBody(this);
        } 

    } 

}
