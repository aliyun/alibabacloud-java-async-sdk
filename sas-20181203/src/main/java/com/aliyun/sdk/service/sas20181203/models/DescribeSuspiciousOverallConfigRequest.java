// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>39.161.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The type of the feature. Valid values:</p>
         * <ul>
         * <li><strong>auto_breaking</strong>: Anti-Virus</li>
         * <li><strong>ransomware_breaking</strong>: Anti-ransomware (Bait Capture)</li>
         * <li><strong>webshell_cloud_breaking</strong>: Webshell Protection</li>
         * <li><strong>alinet</strong>: Behavior prevention</li>
         * <li><strong>k8s_log_analysis</strong>: K8s Threat Detection</li>
         * <li><strong>alisecguard</strong>: Defense mode for Client Protection</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>auto_breaking</p>
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
