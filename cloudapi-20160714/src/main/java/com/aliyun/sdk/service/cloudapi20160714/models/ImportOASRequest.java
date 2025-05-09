// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link ImportOASRequest} extends {@link RequestModel}
 *
 * <p>ImportOASRequest</p>
 */
public class ImportOASRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthType")
    private String authType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackendName")
    private String backendName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Data")
    @com.aliyun.core.annotation.Validation(required = true)
    private String data;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IgnoreWarning")
    private Boolean ignoreWarning;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OASVersion")
    private String OASVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Overwrite")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean overwrite;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestMode")
    private String requestMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkipDryRun")
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
         * <p>The security authentication method of the API. Valid values:</p>
         * <ul>
         * <li><p><strong>APP: Only authorized applications can call the API.</strong></p>
         * </li>
         * <li><p><strong>ANONYMOUS: The API can be anonymously called. In this mode, you must take note of the following rules:</strong></p>
         * <ul>
         * <li>All users who have obtained the API service information can call this API. API Gateway does not authenticate callers and cannot set user-specific throttling policies. If you make this API public, set API-specific throttling policies.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>APP</p>
         */
        public Builder authType(String authType) {
            this.putQueryParameter("AuthType", authType);
            this.authType = authType;
            return this;
        }

        /**
         * <p>The name of the backend service.</p>
         * 
         * <strong>example:</strong>
         * <p>testBackendService</p>
         */
        public Builder backendName(String backendName) {
            this.putQueryParameter("BackendName", backendName);
            this.backendName = backendName;
            return this;
        }

        /**
         * <p>The OAS-compliant text file or OSS object URL.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>swagger: &quot;2.0&quot;
         * info:
         *   version: &quot;1.0.0&quot;
         *   title: &quot;Swagger Petstore 2.0&quot;
         * basePath: &quot;/&quot;
         * schemes:</p>
         * <ul>
         * <li>&quot;https&quot;</li>
         * <li>&quot;http&quot;
         * paths:
         * /pet/findByStatus:
         *   get:
         * tags:
         * - &quot;pet&quot;
         * summary: &quot;Finds Pets by status&quot;
         * operationId: &quot;findPetsByStatus&quot;
         * parameters:
         * - name: &quot;status&quot;
         *   in: &quot;query&quot;
         *   required: true
         *   type: &quot;array&quot;
         *   items:
         *     type: &quot;string&quot;
         *     enum:
         *     - &quot;available&quot;
         *     - &quot;pending&quot;
         *     - &quot;sold&quot;
         *     default: &quot;available&quot;
         *   collectionFormat: &quot;multi&quot;
         * responses:
         *   &quot;200&quot;:
         *     description: &quot;successful operation&quot;
         *     schema:
         *       type: &quot;array&quot;
         *       items:
         *         $ref: &quot;#/definitions/Pet&quot;
         *   &quot;400&quot;:
         *     description: &quot;Invalid status value&quot;</li>
         * </ul>
         * <p>definitions:
         *   Category:
         *     type: &quot;object&quot;
         *     properties:
         *       id:
         *         type: &quot;integer&quot;
         *         format: &quot;int64&quot;
         *       name:
         *         type: &quot;string&quot;
         *   Tag:
         *     type: &quot;object&quot;
         *     properties:
         *       id:
         *         type: &quot;integer&quot;
         *         format: &quot;int64&quot;
         *       name:
         *         type: &quot;string&quot;
         *   Pet:
         *     type: &quot;object&quot;
         *     required:
         *     - &quot;name&quot;
         *     - &quot;photoUrls&quot;
         *     properties:
         *       id:
         *         type: &quot;integer&quot;
         *         format: &quot;int64&quot;
         *       category:
         *         $ref: &quot;#/definitions/Category&quot;
         *       name:
         *         type: &quot;string&quot;
         *         example: &quot;doggie&quot;
         *       photoUrls:
         *         type: &quot;array&quot;
         *         items:
         *           type: &quot;string&quot;
         *       tags:
         *         type: &quot;array&quot;
         *         items:
         *           $ref: &quot;#/definitions/Tag&quot;
         *       status:
         *         type: &quot;string&quot;
         *         description: &quot;pet status in the store&quot;
         *         enum:
         *         - &quot;available&quot;
         *         - &quot;pending&quot;
         *         - &quot;sold&quot;</p>
         */
        public Builder data(String data) {
            this.putBodyParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the API group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>08ae4aa0f95e4321849ee57f4e0b3077</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>Specifies whether to ignore alerts.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder ignoreWarning(Boolean ignoreWarning) {
            this.putQueryParameter("IgnoreWarning", ignoreWarning);
            this.ignoreWarning = ignoreWarning;
            return this;
        }

        /**
         * <p>The OAS version.</p>
         * 
         * <strong>example:</strong>
         * <p>OAS2</p>
         */
        public Builder OASVersion(String OASVersion) {
            this.putQueryParameter("OASVersion", OASVersion);
            this.OASVersion = OASVersion;
            return this;
        }

        /**
         * <p>Specifies whether to overwrite an existing API.</p>
         * <p>If an existing API has the same HTTP request type and backend request path as the API to be imported, the existing API is overwritten.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder overwrite(Boolean overwrite) {
            this.putQueryParameter("Overwrite", overwrite);
            this.overwrite = overwrite;
            return this;
        }

        /**
         * <p>The request mode. Valid values:</p>
         * <ul>
         * <li>MAPPING: Parameters are mapped. Unknown parameters are filtered out.</li>
         * <li>PASSTHROUGH: Parameters are passed through.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PASSTHROUGH</p>
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
         * <p>Specifies whether to directly import the API without performing a precheck.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
