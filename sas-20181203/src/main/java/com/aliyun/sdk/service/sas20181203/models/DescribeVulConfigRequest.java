// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The source IP address of the request.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * The type of configuration. By default, all types of configurations are queried. Valid values:
         * <p>
         * 
         * *   **cve**: Linux software vulnerability.
         * *   **sys**: Windows system vulnerability.
         * *   **cms**: Web-CMS vulnerability.
         * *   **app**: application vulnerability that is detected by using web scanner.
         * *   **emg**: urgent vulnerability.
         * *   **scanMode**: displays easily exploitable vulnerability.
         * *   **imageVulClean**: vulnerability retention duration.
         * *   **yum**: preferentially uses YUM or APT sources of Alibaba Cloud to fix vulnerabilities.
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
