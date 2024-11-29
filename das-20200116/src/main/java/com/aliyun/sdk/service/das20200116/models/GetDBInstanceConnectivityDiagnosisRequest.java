// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDBInstanceConnectivityDiagnosisRequest} extends {@link RequestModel}
 *
 * <p>GetDBInstanceConnectivityDiagnosisRequest</p>
 */
public class GetDBInstanceConnectivityDiagnosisRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcIp")
    @com.aliyun.core.annotation.Validation(required = true)
    private String srcIp;

    private GetDBInstanceConnectivityDiagnosisRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.srcIp = builder.srcIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDBInstanceConnectivityDiagnosisRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return srcIp
     */
    public String getSrcIp() {
        return this.srcIp;
    }

    public static final class Builder extends Request.Builder<GetDBInstanceConnectivityDiagnosisRequest, Builder> {
        private String instanceId; 
        private String srcIp; 

        private Builder() {
            super();
        } 

        private Builder(GetDBInstanceConnectivityDiagnosisRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.srcIp = request.srcIp;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze8g2am97624****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The source IP address.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>47.110.180.62</p>
         */
        public Builder srcIp(String srcIp) {
            this.putQueryParameter("SrcIp", srcIp);
            this.srcIp = srcIp;
            return this;
        }

        @Override
        public GetDBInstanceConnectivityDiagnosisRequest build() {
            return new GetDBInstanceConnectivityDiagnosisRequest(this);
        } 

    } 

}
