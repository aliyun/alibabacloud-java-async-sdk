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
 * {@link DescribeVulConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeVulConfigRequest</p>
 */
public class DescribeVulConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private DescribeVulConfigRequest(Builder builder) {
        super(builder);
        this.sourceIp = builder.sourceIp;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVulConfigRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeVulConfigRequest, Builder> {
        private String sourceIp; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVulConfigRequest request) {
            super(request);
            this.sourceIp = request.sourceIp;
            this.type = request.type;
        } 

        /**
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>113.110.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The type of configuration. By default, all types of configurations are queried. Valid values:</p>
         * <ul>
         * <li><strong>cve</strong>: Linux software vulnerability.</li>
         * <li><strong>sys</strong>: Windows system vulnerability.</li>
         * <li><strong>cms</strong>: Web-CMS vulnerability.</li>
         * <li><strong>app</strong>: application vulnerability that is detected by using web scanner.</li>
         * <li><strong>emg</strong>: urgent vulnerability.</li>
         * <li><strong>scanMode</strong>: displays easily exploitable vulnerability.</li>
         * <li><strong>imageVulClean</strong>: vulnerability retention duration.</li>
         * <li><strong>yum</strong>: preferentially uses YUM or APT sources of Alibaba Cloud to fix vulnerabilities.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cve</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeVulConfigRequest build() {
            return new DescribeVulConfigRequest(this);
        } 

    } 

}
