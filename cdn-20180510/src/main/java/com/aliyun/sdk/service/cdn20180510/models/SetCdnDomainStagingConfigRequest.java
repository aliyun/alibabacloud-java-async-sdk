// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetCdnDomainStagingConfigRequest} extends {@link RequestModel}
 *
 * <p>SetCdnDomainStagingConfigRequest</p>
 */
public class SetCdnDomainStagingConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Functions")
    @com.aliyun.core.annotation.Validation(required = true)
    private String functions;

    private SetCdnDomainStagingConfigRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.functions = builder.functions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetCdnDomainStagingConfigRequest create() {
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

    public static final class Builder extends Request.Builder<SetCdnDomainStagingConfigRequest, Builder> {
        private String domainName; 
        private String functions; 

        private Builder() {
            super();
        } 

        private Builder(SetCdnDomainStagingConfigRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.functions = request.functions;
        } 

        /**
         * The accelerated domain name. You can specify only one domain name.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * The features that you want to configure. Format:
         * <p>
         * 
         * > *   **functionName**: The name of the feature. Separate multiple values with commas (,). For more information, see [A list of features](~~388460~~).
         * >*   **argName**: The feature parameters for **functionName**.
         * >*   **argValue**: The parameter values set for **functionName**.
         * 
         *         [
         *          {
         *            "functionArgs": [
         *             {
         *              "argName": "Parameter A", 
         *              "argValue": "Value of Parameter A"
         *             }, 
         *           {
         *             "argName": "Parameter B", 
         *             "argValue": "Value of Parameter B"
         *              }
         *          ], 
         *          "functionName": "Feature name"
         *             }
         *         ]
         */
        public Builder functions(String functions) {
            this.putQueryParameter("Functions", functions);
            this.functions = functions;
            return this;
        }

        @Override
        public SetCdnDomainStagingConfigRequest build() {
            return new SetCdnDomainStagingConfigRequest(this);
        } 

    } 

}
