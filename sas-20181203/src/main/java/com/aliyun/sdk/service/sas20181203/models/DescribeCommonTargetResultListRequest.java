// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCommonTargetResultListRequest} extends {@link RequestModel}
 *
 * <p>DescribeCommonTargetResultListRequest</p>
 */
public class DescribeCommonTargetResultListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private DescribeCommonTargetResultListRequest(Builder builder) {
        super(builder);
        this.sourceIp = builder.sourceIp;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCommonTargetResultListRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeCommonTargetResultListRequest, Builder> {
        private String sourceIp; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCommonTargetResultListRequest request) {
            super(request);
            this.sourceIp = request.sourceIp;
            this.type = request.type;
        } 

        /**
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>113.57.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The type of the configuration item. Valid values:</p>
         * <ul>
         * <li><strong>webshell_timescan</strong>: webshell detection and removal</li>
         * <li><strong>aliscriptengine</strong>: in-depth detection engine</li>
         * <li><strong>alidetect</strong>: installation scope of local file detection</li>
         * <li><strong>alidetect-scan-enable</strong>: detection scope of local file detection</li>
         * </ul>
         * <blockquote>
         * <p> You can call the <a href="~~ListClientUserDefineRules~~">ListClientUserDefineRules</a> and <a href="~~ListSystemClientRules~~">ListSystemClientRules</a> operations to obtain more types of custom and system configuration items.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>webshell_timescan</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeCommonTargetResultListRequest build() {
            return new DescribeCommonTargetResultListRequest(this);
        } 

    } 

}
