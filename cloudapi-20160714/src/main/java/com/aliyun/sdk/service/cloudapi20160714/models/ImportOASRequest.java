// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportOASRequest} extends {@link RequestModel}
 *
 * <p>ImportOASRequest</p>
 */
public class ImportOASRequest extends Request {
    @Query
    @NameInMap("AuthType")
    private String authType;

    @Query
    @NameInMap("BackendName")
    private String backendName;

    @Body
    @NameInMap("Data")
    @Validation(required = true)
    private String data;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("IgnoreWarning")
    private Boolean ignoreWarning;

    @Query
    @NameInMap("OASVersion")
    private String OASVersion;

    @Query
    @NameInMap("Overwrite")
    @Validation(required = true)
    private Boolean overwrite;

    @Query
    @NameInMap("RequestMode")
    private String requestMode;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("SkipDryRun")
    private Boolean skipDryRun;

    private ImportOASRequest(Builder builder) {
        super(builder);
        this.authType = builder.authType;
        this.backendName = builder.backendName;
        this.data = builder.data;
        this.groupId = builder.groupId;
        this.ignoreWarning = builder.ignoreWarning;
        this.OASVersion = builder.OASVersion;
        this.overwrite = builder.overwrite;
        this.requestMode = builder.requestMode;
        this.securityToken = builder.securityToken;
        this.skipDryRun = builder.skipDryRun;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportOASRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authType
     */
    public String getAuthType() {
        return this.authType;
    }

    /**
     * @return backendName
     */
    public String getBackendName() {
        return this.backendName;
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return ignoreWarning
     */
    public Boolean getIgnoreWarning() {
        return this.ignoreWarning;
    }

    /**
     * @return OASVersion
     */
    public String getOASVersion() {
        return this.OASVersion;
    }

    /**
     * @return overwrite
     */
    public Boolean getOverwrite() {
        return this.overwrite;
    }

    /**
     * @return requestMode
     */
    public String getRequestMode() {
        return this.requestMode;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return skipDryRun
     */
    public Boolean getSkipDryRun() {
        return this.skipDryRun;
    }

    public static final class Builder extends Request.Builder<ImportOASRequest, Builder> {
        private String authType; 
        private String backendName; 
        private String data; 
        private String groupId; 
        private Boolean ignoreWarning; 
        private String OASVersion; 
        private Boolean overwrite; 
        private String requestMode; 
        private String securityToken; 
        private Boolean skipDryRun; 

        private Builder() {
            super();
        } 

        private Builder(ImportOASRequest request) {
            super(request);
            this.authType = request.authType;
            this.backendName = request.backendName;
            this.data = request.data;
            this.groupId = request.groupId;
            this.ignoreWarning = request.ignoreWarning;
            this.OASVersion = request.OASVersion;
            this.overwrite = request.overwrite;
            this.requestMode = request.requestMode;
            this.securityToken = request.securityToken;
            this.skipDryRun = request.skipDryRun;
        } 

        /**
         * API安全认证类型，目前可以取值：
         * <p>
         * 
         * - **APP**：只允许已授权的APP调用
         * - **ANONYMOUS**：允许匿名调用，设置为允许匿名调用需要注意：
         *      - 任何能够获取该API服务信息的人，都将能够调用该API。网关不会对调用者做身份认证，也无法设置按用户的流量控制，若开放该API请设置好按API的流量控制。
         */
        public Builder authType(String authType) {
            this.putQueryParameter("AuthType", authType);
            this.authType = authType;
            return this;
        }

        /**
         * The name of the backend service.
         */
        public Builder backendName(String backendName) {
            this.putQueryParameter("BackendName", backendName);
            this.backendName = backendName;
            return this;
        }

        /**
         * The OAS-compliant text file or OSS object URL.
         */
        public Builder data(String data) {
            this.putBodyParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * The ID of the API group.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * Specifies whether to ignore alerts.
         */
        public Builder ignoreWarning(Boolean ignoreWarning) {
            this.putQueryParameter("IgnoreWarning", ignoreWarning);
            this.ignoreWarning = ignoreWarning;
            return this;
        }

        /**
         * The OAS version.
         */
        public Builder OASVersion(String OASVersion) {
            this.putQueryParameter("OASVersion", OASVersion);
            this.OASVersion = OASVersion;
            return this;
        }

        /**
         * Specifies whether to overwrite an existing API.
         * <p>
         * 
         * If an existing API has the same HTTP request type and backend request path as the API to be imported, the existing API is overwritten.
         */
        public Builder overwrite(Boolean overwrite) {
            this.putQueryParameter("Overwrite", overwrite);
            this.overwrite = overwrite;
            return this;
        }

        /**
         * The request mode. Valid values:
         * <p>
         * 
         * *   MAPPING: Parameters are mapped. Unknown parameters are filtered out.
         * *   PASSTHROUGH: Parameters are passed through.
         */
        public Builder requestMode(String requestMode) {
            this.putQueryParameter("RequestMode", requestMode);
            this.requestMode = requestMode;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * Specifies whether to directly import the API without performing a precheck.
         */
        public Builder skipDryRun(Boolean skipDryRun) {
            this.putQueryParameter("SkipDryRun", skipDryRun);
            this.skipDryRun = skipDryRun;
            return this;
        }

        @Override
        public ImportOASRequest build() {
            return new ImportOASRequest(this);
        } 

    } 

}
