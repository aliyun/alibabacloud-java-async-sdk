// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNetworkRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateNetworkRuleResponseBody</p>
 */
public class CreateNetworkRuleResponseBody extends TeaModel {
    @NameInMap("Arn")
    private String arn;

    @NameInMap("Description")
    private String description;

    @NameInMap("Name")
    private String name;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SourcePrivateIp")
    private String sourcePrivateIp;

    @NameInMap("Type")
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

        /**
         * Arn.
         */
        public Builder arn(String arn) {
            this.arn = arn;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SourcePrivateIp.
         */
        public Builder sourcePrivateIp(String sourcePrivateIp) {
            this.sourcePrivateIp = sourcePrivateIp;
            return this;
        }

        /**
         * Type.
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
