// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OperateSuspiciousTargetConfigRequest} extends {@link RequestModel}
 *
 * <p>OperateSuspiciousTargetConfigRequest</p>
 */
public class OperateSuspiciousTargetConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetOperations")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetOperations;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private OperateSuspiciousTargetConfigRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.sourceIp = builder.sourceIp;
        this.targetOperations = builder.targetOperations;
        this.targetType = builder.targetType;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateSuspiciousTargetConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return targetOperations
     */
    public String getTargetOperations() {
        return this.targetOperations;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<OperateSuspiciousTargetConfigRequest, Builder> {
        private String lang; 
        private String sourceIp; 
        private String targetOperations; 
        private String targetType; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(OperateSuspiciousTargetConfigRequest request) {
            super(request);
            this.lang = request.lang;
            this.sourceIp = request.sourceIp;
            this.targetOperations = request.targetOperations;
            this.targetType = request.targetType;
            this.type = request.type;
        } 

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
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
         * The configuration of proactive defense for your server. The value includes the following fields:
         * <p>
         * 
         * *   **targetType**: specifies the dimension from which you manage proactive defense. UUIDs are supported. Set the value to **uuid**.
         * *   **target**: specifies the UUID of the server for which you want to configure proactive defense.
         * *   **flag**: specifies whether to enable or disable proactive defense for your server. Valid values are **add** and **del**. The value add indicates that proactive defense will be enabled for your server. The value del indicates that proactive defense will be disabled for your server.
         */
        public Builder targetOperations(String targetOperations) {
            this.putQueryParameter("TargetOperations", targetOperations);
            this.targetOperations = targetOperations;
            return this;
        }

        /**
         * The dimension from which you manage proactive defense. Only the server UUID dimension is supported.
         * <p>
         * 
         * Set the value to **uuid**.
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        /**
         * The type of proactive defense. Valid Values:
         * <p>
         * 
         * *   **auto_breaking**: automatic blocking
         * *   **webshell_cloud_breaking**: webshell defense
         * *   **alinet**: malicious behavior defense
         * *   **ransomware_breaking**: ransomware capture
         * *   **alisecguard**: client protection
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public OperateSuspiciousTargetConfigRequest build() {
            return new OperateSuspiciousTargetConfigRequest(this);
        } 

    } 

}
