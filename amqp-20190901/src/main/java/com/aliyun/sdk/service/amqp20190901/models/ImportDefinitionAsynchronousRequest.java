// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp20190901.models;

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
 * {@link ImportDefinitionAsynchronousRequest} extends {@link RequestModel}
 *
 * <p>ImportDefinitionAsynchronousRequest</p>
 */
public class ImportDefinitionAsynchronousRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsoleSessionId")
    private String consoleSessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImportType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer importType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ossUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VhostName")
    private String vhostName;

    private ImportDefinitionAsynchronousRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.consoleSessionId = builder.consoleSessionId;
        this.importType = builder.importType;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.ossUrl = builder.ossUrl;
        this.vhostName = builder.vhostName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportDefinitionAsynchronousRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return consoleSessionId
     */
    public String getConsoleSessionId() {
        return this.consoleSessionId;
    }

    /**
     * @return importType
     */
    public Integer getImportType() {
        return this.importType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return ossUrl
     */
    public String getOssUrl() {
        return this.ossUrl;
    }

    /**
     * @return vhostName
     */
    public String getVhostName() {
        return this.vhostName;
    }

    public static final class Builder extends Request.Builder<ImportDefinitionAsynchronousRequest, Builder> {
        private String regionId; 
        private String consoleSessionId; 
        private Integer importType; 
        private String instanceId; 
        private String instanceName; 
        private String ossUrl; 
        private String vhostName; 

        private Builder() {
            super();
        } 

        private Builder(ImportDefinitionAsynchronousRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.consoleSessionId = request.consoleSessionId;
            this.importType = request.importType;
            this.instanceId = request.instanceId;
            this.instanceName = request.instanceName;
            this.ossUrl = request.ossUrl;
            this.vhostName = request.vhostName;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ConsoleSessionId.
         */
        public Builder consoleSessionId(String consoleSessionId) {
            this.putQueryParameter("ConsoleSessionId", consoleSessionId);
            this.consoleSessionId = consoleSessionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder importType(Integer importType) {
            this.putQueryParameter("ImportType", importType);
            this.importType = importType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder ossUrl(String ossUrl) {
            this.putQueryParameter("OssUrl", ossUrl);
            this.ossUrl = ossUrl;
            return this;
        }

        /**
         * VhostName.
         */
        public Builder vhostName(String vhostName) {
            this.putQueryParameter("VhostName", vhostName);
            this.vhostName = vhostName;
            return this;
        }

        @Override
        public ImportDefinitionAsynchronousRequest build() {
            return new ImportDefinitionAsynchronousRequest(this);
        } 

    } 

}
