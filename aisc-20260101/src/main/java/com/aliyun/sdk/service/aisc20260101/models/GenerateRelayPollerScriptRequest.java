// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aisc20260101.models;

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
 * {@link GenerateRelayPollerScriptRequest} extends {@link RequestModel}
 *
 * <p>GenerateRelayPollerScriptRequest</p>
 */
public class GenerateRelayPollerScriptRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Platform")
    private String platform;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetId")
    private String targetId;

    private GenerateRelayPollerScriptRequest(Builder builder) {
        super(builder);
        this.platform = builder.platform;
        this.targetId = builder.targetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateRelayPollerScriptRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return targetId
     */
    public String getTargetId() {
        return this.targetId;
    }

    public static final class Builder extends Request.Builder<GenerateRelayPollerScriptRequest, Builder> {
        private String platform; 
        private String targetId; 

        private Builder() {
            super();
        } 

        private Builder(GenerateRelayPollerScriptRequest request) {
            super(request);
            this.platform = request.platform;
            this.targetId = request.targetId;
        } 

        /**
         * <p>The target platform in the &quot;operating system-architecture&quot; format. Only linux-amd64 and linux-arm64 are supported. Compatible architecture values include amd64, x86_64, x86, arm64, and aarch64. If only the architecture is specified, the operating system defaults to linux. Other operating systems such as macOS and Windows return HTTP status code 400. If this parameter is not specified, the default value is linux-amd64.</p>
         * 
         * <strong>example:</strong>
         * <p>linux-amd64</p>
         */
        public Builder platform(String platform) {
            this.putQueryParameter("Platform", platform);
            this.platform = platform;
            return this;
        }

        /**
         * <p>The unique identifier of the scan target. The target must use the enterprise_relay connection method (see CreateAttackTarget). Otherwise, HTTP status code 400 is returned. If the target does not exist or belongs to another tenant, HTTP status code 400 is returned without exposing whether the resource exists. This parameter is registered as optional but is required in practice.</p>
         * 
         * <strong>example:</strong>
         * <p>target-abc123def4567</p>
         */
        public Builder targetId(String targetId) {
            this.putQueryParameter("TargetId", targetId);
            this.targetId = targetId;
            return this;
        }

        @Override
        public GenerateRelayPollerScriptRequest build() {
            return new GenerateRelayPollerScriptRequest(this);
        } 

    } 

}
