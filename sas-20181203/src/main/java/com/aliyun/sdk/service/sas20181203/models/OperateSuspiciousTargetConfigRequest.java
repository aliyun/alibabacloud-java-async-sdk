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
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The configuration of proactive defense for your server. The value includes the following fields:</p>
         * <ul>
         * <li><strong>targetType</strong>: specifies the dimension from which you manage proactive defense. UUIDs are supported. Set the value to <strong>uuid</strong>.</li>
         * <li><strong>target</strong>: specifies the UUID of the server for which you want to configure proactive defense.</li>
         * <li><strong>flag</strong>: specifies whether to enable or disable proactive defense for your server. Valid values are <strong>add</strong> and <strong>del</strong>. The value add indicates that proactive defense will be enabled for your server. The value del indicates that proactive defense will be disabled for your server.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;[{&quot;targetType&quot;:&quot;uuid&quot;,&quot;target&quot;:&quot;0585f81a-dd84-4ddf-9971-f59d12345678&quot;,&quot;flag&quot;:&quot;add&quot;},{&quot;targetType&quot;:&quot;uuid&quot;,&quot;target&quot;:&quot;01acfd9d-e6a4-4e61-b9eb-aae012345678&quot;,&quot;flag&quot;:&quot;add&quot;},{&quot;targetType&quot;:&quot;uuid&quot;,&quot;target&quot;:&quot;04a0e735-ad32-4835-b635-045812345678&quot;,&quot;flag&quot;:&quot;add&quot;}]&quot;</p>
         */
        public Builder targetOperations(String targetOperations) {
            this.putQueryParameter("TargetOperations", targetOperations);
            this.targetOperations = targetOperations;
            return this;
        }

        /**
         * <p>The dimension from which you manage proactive defense. Only the server UUID dimension is supported.</p>
         * <p>Set the value to <strong>uuid</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>uuid</p>
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        /**
         * <p>The type of proactive defense. Valid Values:</p>
         * <ul>
         * <li><strong>auto_breaking</strong>: automatic blocking</li>
         * <li><strong>webshell_cloud_breaking</strong>: webshell defense</li>
         * <li><strong>alinet</strong>: malicious behavior defense</li>
         * <li><strong>ransomware_breaking</strong>: ransomware capture</li>
         * <li><strong>alisecguard</strong>: client protection</li>
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
        public OperateSuspiciousTargetConfigRequest build() {
            return new OperateSuspiciousTargetConfigRequest(this);
        } 

    } 

}
