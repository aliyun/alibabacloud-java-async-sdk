// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link CreateEdgeDriverVersionRequest} extends {@link RequestModel}
 *
 * <p>CreateEdgeDriverVersionRequest</p>
 */
public class CreateEdgeDriverVersionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Argument")
    private String argument;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigCheckRule")
    private String configCheckRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainerConfig")
    private String containerConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DriverConfig")
    private String driverConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DriverId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String driverId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DriverVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String driverVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EdgeVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String edgeVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceConfig")
    private String sourceConfig;

    private CreateEdgeDriverVersionRequest(Builder builder) {
        super(builder);
        this.argument = builder.argument;
        this.configCheckRule = builder.configCheckRule;
        this.containerConfig = builder.containerConfig;
        this.description = builder.description;
        this.driverConfig = builder.driverConfig;
        this.driverId = builder.driverId;
        this.driverVersion = builder.driverVersion;
        this.edgeVersion = builder.edgeVersion;
        this.iotInstanceId = builder.iotInstanceId;
        this.sourceConfig = builder.sourceConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEdgeDriverVersionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return argument
     */
    public String getArgument() {
        return this.argument;
    }

    /**
     * @return configCheckRule
     */
    public String getConfigCheckRule() {
        return this.configCheckRule;
    }

    /**
     * @return containerConfig
     */
    public String getContainerConfig() {
        return this.containerConfig;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return driverConfig
     */
    public String getDriverConfig() {
        return this.driverConfig;
    }

    /**
     * @return driverId
     */
    public String getDriverId() {
        return this.driverId;
    }

    /**
     * @return driverVersion
     */
    public String getDriverVersion() {
        return this.driverVersion;
    }

    /**
     * @return edgeVersion
     */
    public String getEdgeVersion() {
        return this.edgeVersion;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return sourceConfig
     */
    public String getSourceConfig() {
        return this.sourceConfig;
    }

    public static final class Builder extends Request.Builder<CreateEdgeDriverVersionRequest, Builder> {
        private String argument; 
        private String configCheckRule; 
        private String containerConfig; 
        private String description; 
        private String driverConfig; 
        private String driverId; 
        private String driverVersion; 
        private String edgeVersion; 
        private String iotInstanceId; 
        private String sourceConfig; 

        private Builder() {
            super();
        } 

        private Builder(CreateEdgeDriverVersionRequest request) {
            super(request);
            this.argument = request.argument;
            this.configCheckRule = request.configCheckRule;
            this.containerConfig = request.containerConfig;
            this.description = request.description;
            this.driverConfig = request.driverConfig;
            this.driverId = request.driverId;
            this.driverVersion = request.driverVersion;
            this.edgeVersion = request.edgeVersion;
            this.iotInstanceId = request.iotInstanceId;
            this.sourceConfig = request.sourceConfig;
        } 

        /**
         * <p>The Java Virtual Machine (JVM) startup parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>-XX:+PrintGCDetails</p>
         */
        public Builder argument(String argument) {
            this.putQueryParameter("Argument", argument);
            this.argument = argument;
            return this;
        }

        /**
         * <p>The rule for verifying configurations. Set this parameter to a JSON string in the following format:</p>
         * <p><code>{&quot;deviceConfig&quot;:{&quot;required&quot;:false},&quot;driverConfig&quot;:{&quot;required&quot;:false}</code></p>
         * <p>The JSON string contains the following parameters:</p>
         * <ul>
         * <li>driverConfig: the rule for verifying the configuration of the driver when the driver is to be deployed in an edge instance.</li>
         * <li>deviceConfig: the rule for verifying the configurations of devices that use the driver when the driver is to be deployed in an edge instance.</li>
         * </ul>
         * <p><code>required</code>: A value of true indicates that the corresponding parameter is required. A value of false indicates that the corresponding parameter is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;deviceConfig&quot;:{&quot;required&quot;:false},&quot;driverConfig&quot;:{&quot;required&quot;:false}}</p>
         */
        public Builder configCheckRule(String configCheckRule) {
            this.putQueryParameter("ConfigCheckRule", configCheckRule);
            this.configCheckRule = configCheckRule;
            return this;
        }

        /**
         * <p>The configuration of the container where the driver runs. Set this parameter to a JSON string. For more information about parameters in the JSON string, see the following parameter description of <strong>ContainerConfig</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;privileged&quot;:1,&quot;devMappings&quot;:[],&quot;volumeMappings&quot;:[],&quot;hostNetworkMode&quot;:0,&quot;portMappings&quot;:[]}</p>
         */
        public Builder containerConfig(String containerConfig) {
            this.putQueryParameter("ContainerConfig", containerConfig);
            this.containerConfig = containerConfig;
            return this;
        }

        /**
         * <p>The description of the driver. The description can be a maximum of 256 bytes in length.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The configuration of the driver. Set this parameter to a JSON string in the following format:</p>
         * <p><code>{&quot;format&quot;:&quot;JSON&quot;,&quot;content&quot;:&quot;{}&quot;}</code></p>
         * <p>The JSON string contains the following parameters:</p>
         * <ul>
         * <li><p>format: the format of the driver configuration. Valid values: KV (key-value pair), JSON (JSON string), and FILE (configuration file).</p>
         * </li>
         * <li><p>content: the content of the driver configuration. If you set the format parameter to KV or JSON, set this parameter to the configuration content of the driver. If you set the format parameter to FILE, set this parameter to the URL of the driver configuration file stored in OSS.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>To obtain the URL of the driver configuration file stored in OSS, call the <a href="https://help.aliyun.com/document_detail/155858.html">CreateOssPreSignedAddress</a> operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;format&quot;:&quot;JSON&quot;,&quot;content&quot;:&quot;{&quot;defaultConfig&quot;:&quot;this is default driver config demo&quot;}&quot;}]</p>
         */
        public Builder driverConfig(String driverConfig) {
            this.putQueryParameter("DriverConfig", driverConfig);
            this.driverConfig = driverConfig;
            return this;
        }

        /**
         * <p>The ID of the driver. To obtain the driver ID, perform the following steps: Log on to the <a href="https://iot.console.aliyun.com/le/instance/list">Link IoT Edge console</a>. On the <strong>Drivers</strong> page, move the pointer over the name of the driver for which you want to create a driver version and obtain the driver ID.</p>
         * <p>You can also call the <a href="https://help.aliyun.com/document_detail/155776.html">QueryEdgeDriver</a> operation to query the driver ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fec565038d7544978d9aed5c1a******</p>
         */
        public Builder driverId(String driverId) {
            this.putQueryParameter("DriverId", driverId);
            this.driverId = driverId;
            return this;
        }

        /**
         * <p>The version number of the driver. The version number must be unique for the driver. The version number can be up to 64 characters in length and can contain letters, digits, underscores (_), hyphens (-), and periods (.).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.0</p>
         */
        public Builder driverVersion(String driverVersion) {
            this.putQueryParameter("DriverVersion", driverVersion);
            this.driverVersion = driverVersion;
            return this;
        }

        /**
         * <p>The earliest version of Link IoT Edge that is supported by the driver. The driver can run on gateways of only this version and later. For example, if you set this parameter to 2.4.0, the driver can run on gateways of only version 2.4.0 and later.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0.0</p>
         */
        public Builder edgeVersion(String edgeVersion) {
            this.putQueryParameter("EdgeVersion", edgeVersion);
            this.edgeVersion = edgeVersion;
            return this;
        }

        /**
         * <p>The ID of the Internet of Things (IoT) service instance. This parameter is not required for the public instance but required for Enterprise Edition instances.</p>
         * 
         * <strong>example:</strong>
         * <p>iot_instc_pu****_c*-v64********</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * SourceConfig.
         */
        public Builder sourceConfig(String sourceConfig) {
            this.putQueryParameter("SourceConfig", sourceConfig);
            this.sourceConfig = sourceConfig;
            return this;
        }

        @Override
        public CreateEdgeDriverVersionRequest build() {
            return new CreateEdgeDriverVersionRequest(this);
        } 

    } 

}
