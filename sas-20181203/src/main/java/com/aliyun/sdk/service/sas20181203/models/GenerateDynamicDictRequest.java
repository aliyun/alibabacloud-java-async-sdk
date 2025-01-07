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
 * {@link GenerateDynamicDictRequest} extends {@link RequestModel}
 *
 * <p>GenerateDynamicDictRequest</p>
 */
public class GenerateDynamicDictRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ArgKeywords")
    private String argKeywords;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domains")
    private String domains;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Names")
    private String names;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    private GenerateDynamicDictRequest(Builder builder) {
        super(builder);
        this.argKeywords = builder.argKeywords;
        this.domains = builder.domains;
        this.names = builder.names;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateDynamicDictRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return argKeywords
     */
    public String getArgKeywords() {
        return this.argKeywords;
    }

    /**
     * @return domains
     */
    public String getDomains() {
        return this.domains;
    }

    /**
     * @return names
     */
    public String getNames() {
        return this.names;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<GenerateDynamicDictRequest, Builder> {
        private String argKeywords; 
        private String domains; 
        private String names; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(GenerateDynamicDictRequest request) {
            super(request);
            this.argKeywords = request.argKeywords;
            this.domains = request.domains;
            this.names = request.names;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * <p>The keyword of the dictionary.</p>
         * 
         * <strong>example:</strong>
         * <p>keyword</p>
         */
        public Builder argKeywords(String argKeywords) {
            this.putQueryParameter("ArgKeywords", argKeywords);
            this.argKeywords = argKeywords;
            return this;
        }

        /**
         * <p>The domain name for custom weak passwords.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
         */
        public Builder domains(String domains) {
            this.putQueryParameter("Domains", domains);
            this.domains = domains;
            return this;
        }

        /**
         * <p>The company name for custom weak passwords.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba</p>
         */
        public Builder names(String names) {
            this.putQueryParameter("Names", names);
            this.names = names;
            return this;
        }

        /**
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>58.248.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public GenerateDynamicDictRequest build() {
            return new GenerateDynamicDictRequest(this);
        } 

    } 

}
