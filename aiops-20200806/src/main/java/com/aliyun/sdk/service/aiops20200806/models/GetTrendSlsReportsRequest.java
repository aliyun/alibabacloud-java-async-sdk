// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTrendSlsReportsRequest} extends {@link RequestModel}
 *
 * <p>GetTrendSlsReportsRequest</p>
 */
public class GetTrendSlsReportsRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("ProductCode")
    private String productCode;

    @Query
    @NameInMap("Severity")
    private String severity;

    @Query
    @NameInMap("Uid")
    private Long uid;

    private GetTrendSlsReportsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.productCode = builder.productCode;
        this.severity = builder.severity;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTrendSlsReportsRequest create() {
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
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return severity
     */
    public String getSeverity() {
        return this.severity;
    }

    /**
     * @return uid
     */
    public Long getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<GetTrendSlsReportsRequest, Builder> {
        private String instanceId; 
        private String productCode; 
        private String severity; 
        private Long uid; 

        private Builder() {
            super();
        } 

        private Builder(GetTrendSlsReportsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.productCode = request.productCode;
            this.severity = request.severity;
            this.uid = request.uid;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * Severity.
         */
        public Builder severity(String severity) {
            this.putQueryParameter("Severity", severity);
            this.severity = severity;
            return this;
        }

        /**
         * Uid.
         */
        public Builder uid(Long uid) {
            this.putQueryParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public GetTrendSlsReportsRequest build() {
            return new GetTrendSlsReportsRequest(this);
        } 

    } 

}
