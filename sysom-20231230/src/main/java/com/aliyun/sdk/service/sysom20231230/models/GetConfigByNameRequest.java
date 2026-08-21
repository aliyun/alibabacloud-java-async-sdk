// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link GetConfigByNameRequest} extends {@link RequestModel}
 *
 * <p>GetConfigByNameRequest</p>
 */
public class GetConfigByNameRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("X-Debug-Id")
    private String xDebugId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("configName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("configType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("entityId")
    private String entityId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("useGlobalUid")
    private Boolean useGlobalUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("versionId")
    private Long versionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("x-sysom-invoke-source")
    private String xSysomInvokeSource;

    private GetConfigByNameRequest(Builder builder) {
        super(builder);
        this.xDebugId = builder.xDebugId;
        this.configName = builder.configName;
        this.configType = builder.configType;
        this.entityId = builder.entityId;
        this.useGlobalUid = builder.useGlobalUid;
        this.versionId = builder.versionId;
        this.xSysomInvokeSource = builder.xSysomInvokeSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConfigByNameRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return xDebugId
     */
    public String getXDebugId() {
        return this.xDebugId;
    }

    /**
     * @return configName
     */
    public String getConfigName() {
        return this.configName;
    }

    /**
     * @return configType
     */
    public String getConfigType() {
        return this.configType;
    }

    /**
     * @return entityId
     */
    public String getEntityId() {
        return this.entityId;
    }

    /**
     * @return useGlobalUid
     */
    public Boolean getUseGlobalUid() {
        return this.useGlobalUid;
    }

    /**
     * @return versionId
     */
    public Long getVersionId() {
        return this.versionId;
    }

    /**
     * @return xSysomInvokeSource
     */
    public String getXSysomInvokeSource() {
        return this.xSysomInvokeSource;
    }

    public static final class Builder extends Request.Builder<GetConfigByNameRequest, Builder> {
        private String xDebugId; 
        private String configName; 
        private String configType; 
        private String entityId; 
        private Boolean useGlobalUid; 
        private Long versionId; 
        private String xSysomInvokeSource; 

        private Builder() {
            super();
        } 

        private Builder(GetConfigByNameRequest request) {
            super(request);
            this.xDebugId = request.xDebugId;
            this.configName = request.configName;
            this.configType = request.configType;
            this.entityId = request.entityId;
            this.useGlobalUid = request.useGlobalUid;
            this.versionId = request.versionId;
            this.xSysomInvokeSource = request.xSysomInvokeSource;
        } 

        /**
         * X-Debug-Id.
         */
        public Builder xDebugId(String xDebugId) {
            this.putQueryParameter("X-Debug-Id", xDebugId);
            this.xDebugId = xDebugId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder configName(String configName) {
            this.putQueryParameter("configName", configName);
            this.configName = configName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>attention</p>
         */
        public Builder configType(String configType) {
            this.putQueryParameter("configType", configType);
            this.configType = configType;
            return this;
        }

        /**
         * entityId.
         */
        public Builder entityId(String entityId) {
            this.putQueryParameter("entityId", entityId);
            this.entityId = entityId;
            return this;
        }

        /**
         * useGlobalUid.
         */
        public Builder useGlobalUid(Boolean useGlobalUid) {
            this.putQueryParameter("useGlobalUid", useGlobalUid);
            this.useGlobalUid = useGlobalUid;
            return this;
        }

        /**
         * versionId.
         */
        public Builder versionId(Long versionId) {
            this.putQueryParameter("versionId", versionId);
            this.versionId = versionId;
            return this;
        }

        /**
         * x-sysom-invoke-source.
         */
        public Builder xSysomInvokeSource(String xSysomInvokeSource) {
            this.putQueryParameter("x-sysom-invoke-source", xSysomInvokeSource);
            this.xSysomInvokeSource = xSysomInvokeSource;
            return this;
        }

        @Override
        public GetConfigByNameRequest build() {
            return new GetConfigByNameRequest(this);
        } 

    } 

}
