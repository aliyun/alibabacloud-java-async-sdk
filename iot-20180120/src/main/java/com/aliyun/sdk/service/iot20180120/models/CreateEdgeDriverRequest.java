// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEdgeDriverRequest} extends {@link RequestModel}
 *
 * <p>CreateEdgeDriverRequest</p>
 */
public class CreateEdgeDriverRequest extends Request {
    @Query
    @NameInMap("CpuArch")
    private String cpuArch;

    @Query
    @NameInMap("DriverName")
    @Validation(required = true)
    private String driverName;

    @Query
    @NameInMap("DriverProtocol")
    @Validation(required = true)
    private String driverProtocol;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("IsBuiltIn")
    private Boolean isBuiltIn;

    @Query
    @NameInMap("Runtime")
    @Validation(required = true)
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
         * CpuArch.
         */
        public Builder cpuArch(String cpuArch) {
            this.putQueryParameter("CpuArch", cpuArch);
            this.cpuArch = cpuArch;
            return this;
        }

        /**
         * DriverName.
         */
        public Builder driverName(String driverName) {
            this.putQueryParameter("DriverName", driverName);
            this.driverName = driverName;
            return this;
        }

        /**
         * DriverProtocol.
         */
        public Builder driverProtocol(String driverProtocol) {
            this.putQueryParameter("DriverProtocol", driverProtocol);
            this.driverProtocol = driverProtocol;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * IsBuiltIn.
         */
        public Builder isBuiltIn(Boolean isBuiltIn) {
            this.putQueryParameter("IsBuiltIn", isBuiltIn);
            this.isBuiltIn = isBuiltIn;
            return this;
        }

        /**
         * Runtime.
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
