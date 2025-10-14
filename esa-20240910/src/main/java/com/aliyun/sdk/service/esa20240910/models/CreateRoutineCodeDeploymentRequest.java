// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link CreateRoutineCodeDeploymentRequest} extends {@link RequestModel}
 *
 * <p>CreateRoutineCodeDeploymentRequest</p>
 */
public class CreateRoutineCodeDeploymentRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CodeVersions")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<CodeVersions> codeVersions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Env")
    @com.aliyun.core.annotation.Validation(required = true)
    private String env;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Strategy")
    @com.aliyun.core.annotation.Validation(required = true)
    private String strategy;

    private CreateRoutineCodeDeploymentRequest(Builder builder) {
        super(builder);
        this.codeVersions = builder.codeVersions;
        this.env = builder.env;
        this.name = builder.name;
        this.strategy = builder.strategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRoutineCodeDeploymentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return codeVersions
     */
    public java.util.List<CodeVersions> getCodeVersions() {
        return this.codeVersions;
    }

    /**
     * @return env
     */
    public String getEnv() {
        return this.env;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return strategy
     */
    public String getStrategy() {
        return this.strategy;
    }

    public static final class Builder extends Request.Builder<CreateRoutineCodeDeploymentRequest, Builder> {
        private java.util.List<CodeVersions> codeVersions; 
        private String env; 
        private String name; 
        private String strategy; 

        private Builder() {
            super();
        } 

        private Builder(CreateRoutineCodeDeploymentRequest request) {
            super(request);
            this.codeVersions = request.codeVersions;
            this.env = request.env;
            this.name = request.name;
            this.strategy = request.strategy;
        } 

        /**
         * <p>The configuration list of phased release version numbers. A maximum of two versions are supported, and the sum of the total proportions is equal to 100.</p>
         * <p>This parameter is required.</p>
         */
        public Builder codeVersions(java.util.List<CodeVersions> codeVersions) {
            String codeVersionsShrink = shrink(codeVersions, "CodeVersions", "json");
            this.putBodyParameter("CodeVersions", codeVersionsShrink);
            this.codeVersions = codeVersions;
            return this;
        }

        /**
         * <p>The name of the environment. Only supports test environment <code>staging</code> or production environment <code>production</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>staging</p>
         */
        public Builder env(String env) {
            this.putBodyParameter("Env", env);
            this.env = env;
            return this;
        }

        /**
         * <p>The function name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The deployment policy. Valid value: percentage.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>percentage</p>
         */
        public Builder strategy(String strategy) {
            this.putBodyParameter("Strategy", strategy);
            this.strategy = strategy;
            return this;
        }

        @Override
        public CreateRoutineCodeDeploymentRequest build() {
            return new CreateRoutineCodeDeploymentRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateRoutineCodeDeploymentRequest} extends {@link TeaModel}
     *
     * <p>CreateRoutineCodeDeploymentRequest</p>
     */
    public static class CodeVersions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CodeVersion")
        @com.aliyun.core.annotation.Validation(required = true)
        private String codeVersion;

        @com.aliyun.core.annotation.NameInMap("Percentage")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long percentage;

        private CodeVersions(Builder builder) {
            this.codeVersion = builder.codeVersion;
            this.percentage = builder.percentage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CodeVersions create() {
            return builder().build();
        }

        /**
         * @return codeVersion
         */
        public String getCodeVersion() {
            return this.codeVersion;
        }

        /**
         * @return percentage
         */
        public Long getPercentage() {
            return this.percentage;
        }

        public static final class Builder {
            private String codeVersion; 
            private Long percentage; 

            private Builder() {
            } 

            private Builder(CodeVersions model) {
                this.codeVersion = model.codeVersion;
                this.percentage = model.percentage;
            } 

            /**
             * <p>The version of the code.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1723599747213377175</p>
             */
            public Builder codeVersion(String codeVersion) {
                this.codeVersion = codeVersion;
                return this;
            }

            /**
             * <p>The phased release ratio of the code version. Valid values: 1 to 100.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percentage(Long percentage) {
                this.percentage = percentage;
                return this;
            }

            public CodeVersions build() {
                return new CodeVersions(this);
            } 

        } 

    }
}
