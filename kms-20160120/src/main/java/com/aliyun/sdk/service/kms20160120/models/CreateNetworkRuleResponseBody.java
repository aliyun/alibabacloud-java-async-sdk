// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

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
 * {@link CreateNetworkRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateNetworkRuleResponseBody</p>
 */
public class CreateNetworkRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Arn")
    private String arn;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SourcePrivateIp")
    private String sourcePrivateIp;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private CreateNetworkRuleResponseBody(Builder builder) {
        this.arn = builder.arn;
        this.description = builder.description;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.sourcePrivateIp = builder.sourcePrivateIp;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNetworkRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return name
     */
    public String getName() {
        return this.name;
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
        private String name; 
        private String requestId; 
        private String sourcePrivateIp; 
        private String type; 

        private Builder() {
        } 

        private Builder(CreateNetworkRuleResponseBody model) {
            this.arn = model.arn;
            this.description = model.description;
            this.name = model.name;
            this.requestId = model.requestId;
            this.sourcePrivateIp = model.sourcePrivateIp;
            this.type = model.type;
        } 

        /**
         * <p>The ARN of the access control rule.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:kms:cn-hangzhou:119285303511****:network/networkrule_test</p>
         */
        public Builder arn(String arn) {
            this.arn = arn;
            return this;
        }

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>networkrule description</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the access control rule.</p>
         * 
         * <strong>example:</strong>
         * <p>networkrule_test</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>3bf02f7a-015b-4f93-be0f-cc043fda2dd3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The private IP address or private CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;192.10.XX.XX&quot;,&quot;192.168.XX.XX/24&quot;]</p>
         */
        public Builder sourcePrivateIp(String sourcePrivateIp) {
            this.sourcePrivateIp = sourcePrivateIp;
            return this;
        }

        /**
         * <p>The network type.</p>
         * 
         * <strong>example:</strong>
         * <p>Private</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public CreateNetworkRuleResponseBody build() {
            return new CreateNetworkRuleResponseBody(this);
        } 

    } 

}
