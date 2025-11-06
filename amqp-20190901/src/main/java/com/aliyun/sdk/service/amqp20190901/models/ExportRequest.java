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
 * {@link ExportRequest} extends {@link RequestModel}
 *
 * <p>ExportRequest</p>
 */
public class ExportRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsoleSessionId")
    private String consoleSessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExportType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer exportType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VhostName")
    private String vhostName;

    private ExportRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.consoleSessionId = builder.consoleSessionId;
        this.exportType = builder.exportType;
        this.instanceId = builder.instanceId;
        this.vhostName = builder.vhostName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportRequest create() {
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
     * @return exportType
     */
    public Integer getExportType() {
        return this.exportType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return vhostName
     */
    public String getVhostName() {
        return this.vhostName;
    }

    public static final class Builder extends Request.Builder<ExportRequest, Builder> {
        private String regionId; 
        private String consoleSessionId; 
        private Integer exportType; 
        private String instanceId; 
        private String vhostName; 

        private Builder() {
            super();
        } 

        private Builder(ExportRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.consoleSessionId = request.consoleSessionId;
            this.exportType = request.exportType;
            this.instanceId = request.instanceId;
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
        public Builder exportType(Integer exportType) {
            this.putQueryParameter("ExportType", exportType);
            this.exportType = exportType;
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
         * VhostName.
         */
        public Builder vhostName(String vhostName) {
            this.putQueryParameter("VhostName", vhostName);
            this.vhostName = vhostName;
            return this;
        }

        @Override
        public ExportRequest build() {
            return new ExportRequest(this);
        } 

    } 

}
