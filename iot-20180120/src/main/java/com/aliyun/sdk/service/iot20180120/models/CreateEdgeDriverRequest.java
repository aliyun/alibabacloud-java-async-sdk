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
 * {@link CreateEdgeDriverRequest} extends {@link RequestModel}
 *
 * <p>CreateEdgeDriverRequest</p>
 */
public class CreateEdgeDriverRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CpuArch")
    private String cpuArch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DriverName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String driverName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DriverProtocol")
    @com.aliyun.core.annotation.Validation(required = true)
    private String driverProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsBuiltIn")
    private Boolean isBuiltIn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Runtime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String runtime;

    private CreateEdgeDriverRequest(Builder builder) {
        super(builder);
        this.cpuArch = builder.cpuArch;
        this.driverName = builder.driverName;
        this.driverProtocol = builder.driverProtocol;
        this.iotInstanceId = builder.iotInstanceId;
        this.isBuiltIn = builder.isBuiltIn;
        this.runtime = builder.runtime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEdgeDriverRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cpuArch
     */
    public String getCpuArch() {
        return this.cpuArch;
    }

    /**
     * @return driverName
     */
    public String getDriverName() {
        return this.driverName;
    }

    /**
     * @return driverProtocol
     */
    public String getDriverProtocol() {
        return this.driverProtocol;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return isBuiltIn
     */
    public Boolean getIsBuiltIn() {
        return this.isBuiltIn;
    }

    /**
     * @return runtime
     */
    public String getRuntime() {
        return this.runtime;
    }

    public static final class Builder extends Request.Builder<CreateEdgeDriverRequest, Builder> {
        private String cpuArch; 
        private String driverName; 
        private String driverProtocol; 
        private String iotInstanceId; 
        private Boolean isBuiltIn; 
        private String runtime; 

        private Builder() {
            super();
        } 

        private Builder(CreateEdgeDriverRequest request) {
            super(request);
            this.cpuArch = request.cpuArch;
            this.driverName = request.driverName;
            this.driverProtocol = request.driverProtocol;
            this.iotInstanceId = request.iotInstanceId;
            this.isBuiltIn = request.isBuiltIn;
            this.runtime = request.runtime;
        } 

        /**
         * <p>The CPU architecture that the driver supports. Valid values:</p>
         * <ul>
         * <li>ARMv7</li>
         * <li>ARMv7-HF</li>
         * <li>AArch64</li>
         * <li>x86-64</li>
         * <li>x86</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>x86-64</p>
         */
        public Builder cpuArch(String cpuArch) {
            this.putQueryParameter("CpuArch", cpuArch);
            this.cpuArch = cpuArch;
            return this;
        }

        /**
         * <p>The name of the driver to create. The name cannot exceed 20 characters in length and can contain only uppercase letters, lowercase letters, digits, and underscores (_). It must start with a letter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MyLedDriver</p>
         */
        public Builder driverName(String driverName) {
            this.putQueryParameter("DriverName", driverName);
            this.driverName = driverName;
            return this;
        }

        /**
         * <p>The communications protocol that the driver uses. Valid values:</p>
         * <ul>
         * <li>modbus: Modbus protocol</li>
         * <li>opc-ua: OPC UA protocol</li>
         * <li>customize: custom protocol</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>customize</p>
         */
        public Builder driverProtocol(String driverProtocol) {
            this.putQueryParameter("DriverProtocol", driverProtocol);
            this.driverProtocol = driverProtocol;
            return this;
        }

        /**
         * <p>The ID of the Internet of Things (IoT) service instance. This parameter is not required for public instances. However, this parameter is required for the instances that you have purchased.</p>
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
         * <p>Specifies whether the driver is a built-in driver.</p>
         * <ul>
         * <li><p>true: indicates that the driver is a built-in driver, that is, the driver code is pre-configured on the gateway device.</p>
         * </li>
         * <li><p>false: indicates that the driver is not a built-in driver and you must upload the driver code. Default value: false.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If the driver is not a built-in driver, you must upload the driver code.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isBuiltIn(Boolean isBuiltIn) {
            this.putQueryParameter("IsBuiltIn", isBuiltIn);
            this.isBuiltIn = isBuiltIn;
            return this;
        }

        /**
         * <p>The language in which the driver is programmed. Valid values:</p>
         * <ul>
         * <li>nodejs8: Node.js v8</li>
         * <li>python3: Python v3.5</li>
         * <li>c: C</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c</p>
         */
        public Builder runtime(String runtime) {
            this.putQueryParameter("Runtime", runtime);
            this.runtime = runtime;
            return this;
        }

        @Override
        public CreateEdgeDriverRequest build() {
            return new CreateEdgeDriverRequest(this);
        } 

    } 

}
