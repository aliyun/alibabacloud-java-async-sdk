// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20180308.models;

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
 * {@link PutMetricRuleTargetsRequest} extends {@link RequestModel}
 *
 * <p>PutMetricRuleTargetsRequest</p>
 */
public class PutMetricRuleTargetsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Actions")
    private String actions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Targets")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Targets> targets;

    private PutMetricRuleTargetsRequest(Builder builder) {
        super(builder);
        this.actions = builder.actions;
        this.ruleName = builder.ruleName;
        this.targets = builder.targets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutMetricRuleTargetsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actions
     */
    public String getActions() {
        return this.actions;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return targets
     */
    public java.util.List<Targets> getTargets() {
        return this.targets;
    }

    public static final class Builder extends Request.Builder<PutMetricRuleTargetsRequest, Builder> {
        private String actions; 
        private String ruleName; 
        private java.util.List<Targets> targets; 

        private Builder() {
            super();
        } 

        private Builder(PutMetricRuleTargetsRequest request) {
            super(request);
            this.actions = request.actions;
            this.ruleName = request.ruleName;
            this.targets = request.targets;
        } 

        /**
         * Actions.
         */
        public Builder actions(String actions) {
            this.putBodyParameter("Actions", actions);
            this.actions = actions;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder targets(java.util.List<Targets> targets) {
            this.putQueryParameter("Targets", targets);
            this.targets = targets;
            return this;
        }

        @Override
        public PutMetricRuleTargetsRequest build() {
            return new PutMetricRuleTargetsRequest(this);
        } 

    } 

    /**
     * 
     * {@link PutMetricRuleTargetsRequest} extends {@link TeaModel}
     *
     * <p>PutMetricRuleTargetsRequest</p>
     */
    public static class Targets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Arn")
        private String arn;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        private Targets(Builder builder) {
            this.arn = builder.arn;
            this.id = builder.id;
            this.level = builder.level;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Targets create() {
            return builder().build();
        }

        /**
         * @return arn
         */
        public String getArn() {
            return this.arn;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        public static final class Builder {
            private String arn; 
            private String id; 
            private String level; 

            private Builder() {
            } 

            private Builder(Targets model) {
                this.arn = model.arn;
                this.id = model.id;
                this.level = model.level;
            } 

            /**
             * Arn.
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            public Targets build() {
                return new Targets(this);
            } 

        } 

    }
}
