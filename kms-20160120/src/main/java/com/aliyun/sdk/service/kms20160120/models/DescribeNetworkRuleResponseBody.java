// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNetworkRuleResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNetworkRuleResponseBody</p>
 */
public class DescribeNetworkRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Arn")
    private String arn;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SourcePrivateIp")
    private String sourcePrivateIp;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private DescribeNetworkRuleResponseBody(Builder builder) {
        this.arn = builder.arn;
        this.description = builder.description;
        this.requestId = builder.requestId;
        this.sourcePrivateIp = builder.sourcePrivateIp;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNetworkRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return arn
     */
    public String getArn() {
        return this.arn;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sourcePrivateIp
     */
    public String getSourcePrivateIp() {
        return this.sourcePrivateIp;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String arn; 
        private String description; 
        private String requestId; 
        private String sourcePrivateIp; 
        private String type; 

        /**
         * The ARN of the access control rule.
         */
        public Builder arn(String arn) {
            this.arn = arn;
            return this;
        }

        /**
         * The description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The private IP address or private CIDR block.
         */
        public Builder sourcePrivateIp(String sourcePrivateIp) {
            this.sourcePrivateIp = sourcePrivateIp;
            return this;
        }

        /**
         * The network type. Only private IP addresses are supported. The value is fixed as Private.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public DescribeNetworkRuleResponseBody build() {
            return new DescribeNetworkRuleResponseBody(this);
        } 

    } 

}
