// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSolutionInstanceConfigurationRequest} extends {@link RequestModel}
 *
 * <p>DescribeSolutionInstanceConfigurationRequest</p>
 */
public class DescribeSolutionInstanceConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.List < Parameters> parameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SolutionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String solutionId;

    private DescribeSolutionInstanceConfigurationRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.parameters = builder.parameters;
        this.regionId = builder.regionId;
        this.solutionId = builder.solutionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSolutionInstanceConfigurationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return parameters
     */
    public java.util.List < Parameters> getParameters() {
        return this.parameters;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return solutionId
     */
    public String getSolutionId() {
        return this.solutionId;
    }

    public static final class Builder extends Request.Builder<DescribeSolutionInstanceConfigurationRequest, Builder> {
        private String clientToken; 
        private java.util.List < Parameters> parameters; 
        private String regionId; 
        private String solutionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSolutionInstanceConfigurationRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.parameters = request.parameters;
            this.regionId = request.regionId;
            this.solutionId = request.solutionId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotency of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-42665544****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The parameters.</p>
         */
        public Builder parameters(java.util.List < Parameters> parameters) {
            this.putQueryParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the solution.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sln-xxxxx</p>
         */
        public Builder solutionId(String solutionId) {
            this.putQueryParameter("SolutionId", solutionId);
            this.solutionId = solutionId;
            return this;
        }

        @Override
        public DescribeSolutionInstanceConfigurationRequest build() {
            return new DescribeSolutionInstanceConfigurationRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSolutionInstanceConfigurationRequest} extends {@link TeaModel}
     *
     * <p>DescribeSolutionInstanceConfigurationRequest</p>
     */
    public static class Parameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParameterKey")
        @com.aliyun.core.annotation.Validation(required = true)
        private String parameterKey;

        @com.aliyun.core.annotation.NameInMap("ParameterValue")
        @com.aliyun.core.annotation.Validation(required = true)
        private String parameterValue;

        private Parameters(Builder builder) {
            this.parameterKey = builder.parameterKey;
            this.parameterValue = builder.parameterValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
        }

        /**
         * @return parameterKey
         */
        public String getParameterKey() {
            return this.parameterKey;
        }

        /**
         * @return parameterValue
         */
        public String getParameterValue() {
            return this.parameterValue;
        }

        public static final class Builder {
            private String parameterKey; 
            private String parameterValue; 

            /**
             * <p>The key of the parameter.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * <p>The value of the parameter.</p>
             * <blockquote>
             * <p>The Parameters parameter is optional. If you specify Parameters, you must specify ParameterValue.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder parameterValue(String parameterValue) {
                this.parameterValue = parameterValue;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
}
