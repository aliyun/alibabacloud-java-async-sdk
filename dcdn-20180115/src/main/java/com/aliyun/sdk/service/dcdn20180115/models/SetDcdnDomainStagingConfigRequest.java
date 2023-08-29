// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDcdnDomainStagingConfigRequest} extends {@link RequestModel}
 *
 * <p>SetDcdnDomainStagingConfigRequest</p>
 */
public class SetDcdnDomainStagingConfigRequest extends Request {
    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("Functions")
    @Validation(required = true)
    private String functions;

    private SetDcdnDomainStagingConfigRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.functions = builder.functions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDcdnDomainStagingConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return functions
     */
    public String getFunctions() {
        return this.functions;
    }

    public static final class Builder extends Request.Builder<SetDcdnDomainStagingConfigRequest, Builder> {
        private String domainName; 
        private String functions; 

        private Builder() {
            super();
        } 

        private Builder(SetDcdnDomainStagingConfigRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.functions = request.functions;
        } 

        /**
         * The accelerated domain name. Separate multiple accelerated domain names with commas (,).
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * The list of features. Format: `[{"functionArgs":[{"argName":"parameter key","argValue":"parameter value"},{"argName":"xx","argValue":"xx"}],"functionName": feature name"}]`
         * <p>
         * 
         * > Separate multiple parameters with commas (,).
         */
        public Builder functions(String functions) {
            this.putQueryParameter("Functions", functions);
            this.functions = functions;
            return this;
        }

        @Override
        public SetDcdnDomainStagingConfigRequest build() {
            return new SetDcdnDomainStagingConfigRequest(this);
        } 

    } 

}
