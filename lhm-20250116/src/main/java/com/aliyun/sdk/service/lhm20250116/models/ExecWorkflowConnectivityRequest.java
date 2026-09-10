// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link ExecWorkflowConnectivityRequest} extends {@link RequestModel}
 *
 * <p>ExecWorkflowConnectivityRequest</p>
 */
public class ExecWorkflowConnectivityRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dsConfig")
    private String dsConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dsName")
    private String dsName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dsType")
    private String dsType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dsVersion")
    private String dsVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("isModified")
    private Boolean isModified;

    private ExecWorkflowConnectivityRequest(Builder builder) {
        super(builder);
        this.dsConfig = builder.dsConfig;
        this.dsName = builder.dsName;
        this.dsType = builder.dsType;
        this.dsVersion = builder.dsVersion;
        this.id = builder.id;
        this.isModified = builder.isModified;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecWorkflowConnectivityRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dsConfig
     */
    public String getDsConfig() {
        return this.dsConfig;
    }

    /**
     * @return dsName
     */
    public String getDsName() {
        return this.dsName;
    }

    /**
     * @return dsType
     */
    public String getDsType() {
        return this.dsType;
    }

    /**
     * @return dsVersion
     */
    public String getDsVersion() {
        return this.dsVersion;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return isModified
     */
    public Boolean getIsModified() {
        return this.isModified;
    }

    public static final class Builder extends Request.Builder<ExecWorkflowConnectivityRequest, Builder> {
        private String dsConfig; 
        private String dsName; 
        private String dsType; 
        private String dsVersion; 
        private Long id; 
        private Boolean isModified; 

        private Builder() {
            super();
        } 

        private Builder(ExecWorkflowConnectivityRequest request) {
            super(request);
            this.dsConfig = request.dsConfig;
            this.dsName = request.dsName;
            this.dsType = request.dsType;
            this.dsVersion = request.dsVersion;
            this.id = request.id;
            this.isModified = request.isModified;
        } 

        /**
         * <p>The datasource config. The value is a JSON character string whose structure is defined by each dsType. Parse the JSON string before use. Sensitive fields such as tokens are masked in the response.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;endpoint&quot;:&quot;...&quot;,&quot;token&quot;:&quot;******&quot;}</p>
         */
        public Builder dsConfig(String dsConfig) {
            this.putBodyParameter("dsConfig", dsConfig);
            this.dsConfig = dsConfig;
            return this;
        }

        /**
         * <p>The data source name. Exact match and fuzzy match are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>test_ds318_hangzhou_0428</p>
         */
        public Builder dsName(String dsName) {
            this.putBodyParameter("dsName", dsName);
            this.dsName = dsName;
            return this;
        }

        /**
         * <p>The data source type, such as Hive or MaxCompute.</p>
         * 
         * <strong>example:</strong>
         * <p>Hive</p>
         */
        public Builder dsType(String dsType) {
            this.putBodyParameter("dsType", dsType);
            this.dsType = dsType;
            return this;
        }

        /**
         * <p>The data source version number.</p>
         * 
         * <strong>example:</strong>
         * <p>3.2.0</p>
         */
        public Builder dsVersion(String dsVersion) {
            this.putBodyParameter("dsVersion", dsVersion);
            this.dsVersion = dsVersion;
            return this;
        }

        /**
         * <p>The primary key ID that uniquely identifies a record.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder id(Long id) {
            this.putBodyParameter("id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>Specifies whether the configuration has been modified.</p>
         */
        public Builder isModified(Boolean isModified) {
            this.putBodyParameter("isModified", isModified);
            this.isModified = isModified;
            return this;
        }

        @Override
        public ExecWorkflowConnectivityRequest build() {
            return new ExecWorkflowConnectivityRequest(this);
        } 

    } 

}
