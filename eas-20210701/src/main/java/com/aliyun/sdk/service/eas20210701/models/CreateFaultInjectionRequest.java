// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link CreateFaultInjectionRequest} extends {@link RequestModel}
 *
 * <p>CreateFaultInjectionRequest</p>
 */
public class CreateFaultInjectionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FaultArgs")
    private Object faultArgs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FaultType")
    private String faultType;

    private CreateFaultInjectionRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.serviceName = builder.serviceName;
        this.instanceName = builder.instanceName;
        this.faultArgs = builder.faultArgs;
        this.faultType = builder.faultType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFaultInjectionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return faultArgs
     */
    public Object getFaultArgs() {
        return this.faultArgs;
    }

    /**
     * @return faultType
     */
    public String getFaultType() {
        return this.faultType;
    }

    public static final class Builder extends Request.Builder<CreateFaultInjectionRequest, Builder> {
        private String clusterId; 
        private String serviceName; 
        private String instanceName; 
        private Object faultArgs; 
        private String faultType; 

        private Builder() {
            super();
        } 

        private Builder(CreateFaultInjectionRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.serviceName = request.serviceName;
            this.instanceName = request.instanceName;
            this.faultArgs = request.faultArgs;
            this.faultType = request.faultType;
        } 

        /**
         * <p>The region of the private gateway.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The service name. For more information about how to view the service name, see <a href="https://help.aliyun.com/document_detail/412109.html">ListServices</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>foo</p>
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>The name of the service instance. For more information about how to view the instance name, see <a href="https://help.aliyun.com/document_detail/412108.html">ListServiceInstances</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>foo-69xxxx4f4-5w9r9</p>
         */
        public Builder instanceName(String instanceName) {
            this.putPathParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>Detailed parameters for each fault type:</p>
         * <ol>
         * <li>CpuFullloadTask (CPU full-load fault)
         * <code>{   &quot;FaultType&quot;: &quot;CpuFullloadTask&quot;,   &quot;FaultArgs&quot;: {  &quot;FaultAction&quot;: &quot;fullload&quot;,  &quot;CpuPercent&quot;: 50   } }</code></li>
         * <li>MemLoadTask (Memory load fault)
         * <code>{   &quot;FaultType&quot;: &quot;MemLoadTask&quot;,   &quot;FaultArgs&quot;: {  &quot;FaultAction&quot;: &quot;load&quot;,  &quot;MemPercent&quot;: 80   } }</code></li>
         * <li>NetworkTask (Network fault)
         * 3.a. NetworkDelayAction (Network delay)
         * <code>{   &quot;FaultType&quot;: &quot;NetworkTask&quot;,   &quot;FaultArgs&quot;: {  &quot;FaultAction&quot;: &quot;delay&quot;,  &quot;Time&quot;: 3000,  &quot;Offset&quot;: 100   } }</code>
         * 3.b. NetworkCorruptAction (Network packet corruption)
         * <code>{   &quot;FaultType&quot;: &quot;NetworkTask&quot;,   &quot;FaultArgs&quot;: {  &quot;FaultAction&quot;: &quot;corrupt&quot;,  &quot;Percent&quot;: 50   } }</code>
         * 3.c. NetworkLossAction (Network packet loss)
         * <code>{   &quot;FaultType&quot;: &quot;NetworkTask&quot;,   &quot;FaultArgs&quot;: {  &quot;FaultAction&quot;: &quot;loss&quot;,  &quot;Percent&quot;: 30   } }</code></li>
         * <li>DiskBurnTask (Disk read/write fault)
         * <code>{   &quot;FaultType&quot;: &quot;DiskBurnTask&quot;,   &quot;FaultArgs&quot;: {  &quot;FaultAction&quot;: &quot;burn&quot;,  &quot;Read&quot;: true,  &quot;Write&quot;: true,  &quot;Size&quot;: 100   } }</code></li>
         * <li>DiskFillTask (Disk fill fault)
         * <code>{   &quot;FaultType&quot;: &quot;DiskFillTask&quot;,   &quot;FaultArgs&quot;: {  &quot;FaultAction&quot;: &quot;fill&quot;,  &quot;Percent&quot;: 80   } }</code></li>
         * </ol>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;FaultType&quot;: &quot;DiskFillTask&quot;,
         *   &quot;FaultArgs&quot;: {
         *     &quot;FaultAction&quot;: &quot;fill&quot;,
         *     &quot;Percent&quot;: 80
         *   }
         * }</p>
         */
        public Builder faultArgs(Object faultArgs) {
            this.putBodyParameter("FaultArgs", faultArgs);
            this.faultArgs = faultArgs;
            return this;
        }

        /**
         * <p>The fault type. Device faults include CPU full load, memory load, network fault, disk read/write hang, and disk fill.</p>
         * 
         * <strong>example:</strong>
         * <p>CpuFullloadTask</p>
         */
        public Builder faultType(String faultType) {
            this.putBodyParameter("FaultType", faultType);
            this.faultType = faultType;
            return this;
        }

        @Override
        public CreateFaultInjectionRequest build() {
            return new CreateFaultInjectionRequest(this);
        } 

    } 

}
