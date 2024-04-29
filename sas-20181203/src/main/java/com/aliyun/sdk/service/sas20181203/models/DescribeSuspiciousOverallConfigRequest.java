// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSuspiciousOverallConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeSuspiciousOverallConfigRequest</p>
 */
public class DescribeSuspiciousOverallConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private DescribeSuspiciousOverallConfigRequest(Builder builder) {
        super(builder);
        this.sourceIp = builder.sourceIp;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSuspiciousOverallConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeSuspiciousOverallConfigRequest, Builder> {
        private String sourceIp; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSuspiciousOverallConfigRequest request) {
            super(request);
            this.sourceIp = request.sourceIp;
            this.type = request.type;
        } 

        /**
         * The source IP address of the request.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * The type of the feature. Valid values:
         * <p>
         * 
         * *   **auto_breaking**: Anti-Virus
         * *   **ransomware_breaking**: Anti-ransomware (Bait Capture)
         * *   **webshell\_cloud_breaking**: Webshell Protection
         * *   **alinet**: Behavior prevention
         * *   **k8s\_log_analysis**: K8s Threat Detection
         * *   **alisecguard**: Defense mode for Client Protection
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeSuspiciousOverallConfigRequest build() {
            return new DescribeSuspiciousOverallConfigRequest(this);
        } 

    } 

}
