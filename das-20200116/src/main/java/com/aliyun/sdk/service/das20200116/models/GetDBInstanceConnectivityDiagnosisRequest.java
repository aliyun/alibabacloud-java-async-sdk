// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDBInstanceConnectivityDiagnosisRequest} extends {@link RequestModel}
 *
 * <p>GetDBInstanceConnectivityDiagnosisRequest</p>
 */
public class GetDBInstanceConnectivityDiagnosisRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("SrcIp")
    @Validation(required = true)
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
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The source IP address.
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
