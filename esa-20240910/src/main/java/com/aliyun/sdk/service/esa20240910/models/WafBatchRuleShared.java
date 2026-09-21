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
 * {@link WafBatchRuleShared} extends {@link TeaModel}
 *
 * <p>WafBatchRuleShared</p>
 */
public class WafBatchRuleShared extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Action")
    private String action;

    @com.aliyun.core.annotation.NameInMap("Actions")
    private Actions actions;

    @com.aliyun.core.annotation.NameInMap("CrossSiteId")
    private Long crossSiteId;

    @com.aliyun.core.annotation.NameInMap("Expression")
    private String expression;

    @com.aliyun.core.annotation.NameInMap("Match")
    private WafRuleMatch2 match;

    @com.aliyun.core.annotation.NameInMap("Mode")
    private String mode;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Target")
    private String target;

    private WafBatchRuleShared(Builder builder) {
        this.action = builder.action;
        this.actions = builder.actions;
        this.crossSiteId = builder.crossSiteId;
        this.expression = builder.expression;
        this.match = builder.match;
        this.mode = builder.mode;
        this.name = builder.name;
        this.target = builder.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WafBatchRuleShared create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return action
     */
    public String getAction() {
        return this.action;
    }

    /**
     * @return actions
     */
    public Actions getActions() {
        return this.actions;
    }

    /**
     * @return crossSiteId
     */
    public Long getCrossSiteId() {
        return this.crossSiteId;
    }

    /**
     * @return expression
     */
    public String getExpression() {
        return this.expression;
    }

    /**
     * @return match
     */
    public WafRuleMatch2 getMatch() {
        return this.match;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return target
     */
    public String getTarget() {
        return this.target;
    }

    public static final class Builder {
        private String action; 
        private Actions actions; 
        private Long crossSiteId; 
        private String expression; 
        private WafRuleMatch2 match; 
        private String mode; 
        private String name; 
        private String target; 

        private Builder() {
        } 

        private Builder(WafBatchRuleShared model) {
            this.action = model.action;
            this.actions = model.actions;
            this.crossSiteId = model.crossSiteId;
            this.expression = model.expression;
            this.match = model.match;
            this.mode = model.mode;
            this.name = model.name;
            this.target = model.target;
        } 

        /**
         * <p>The action that you want WAF to perform on requests that match the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>deny</p>
         */
        public Builder action(String action) {
            this.action = action;
            return this;
        }

        /**
         * <p>The extended action configurations.</p>
         */
        public Builder actions(Actions actions) {
            this.actions = actions;
            return this;
        }

        /**
         * <p>Specifies the cross-domain website ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10000001</p>
         */
        public Builder crossSiteId(Long crossSiteId) {
            this.crossSiteId = crossSiteId;
            return this;
        }

        /**
         * <p>The expression.</p>
         * 
         * <strong>example:</strong>
         * <p>ip.src eq 1.1.1.1</p>
         */
        public Builder expression(String expression) {
            this.expression = expression;
            return this;
        }

        /**
         * <p>The matching rule.</p>
         */
        public Builder match(WafRuleMatch2 match) {
            this.match = match;
            return this;
        }

        /**
         * <p>Web SDK integration method: automatic integration (automatic) or manual integration (manual).</p>
         * 
         * <strong>example:</strong>
         * <p>automatic</p>
         */
        public Builder mode(String mode) {
            this.mode = mode;
            return this;
        }

        /**
         * <p>The ruleset name.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>Protection type: web or app.</p>
         * 
         * <strong>example:</strong>
         * <p>web</p>
         */
        public Builder target(String target) {
            this.target = target;
            return this;
        }

        public WafBatchRuleShared build() {
            return new WafBatchRuleShared(this);
        } 

    } 

    /**
     * 
     * {@link WafBatchRuleShared} extends {@link TeaModel}
     *
     * <p>WafBatchRuleShared</p>
     */
    public static class ActionsResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private Integer code;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        private ActionsResponse(Builder builder) {
            this.code = builder.code;
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ActionsResponse create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        public static final class Builder {
            private Integer code; 
            private Long id; 

            private Builder() {
            } 

            private Builder(ActionsResponse model) {
                this.code = model.code;
                this.id = model.id;
            } 

            /**
             * <p>The custom response code.</p>
             * 
             * <strong>example:</strong>
             * <p>403</p>
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The ID of the custom response page.</p>
             * 
             * <strong>example:</strong>
             * <p>50000001</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            public ActionsResponse build() {
                return new ActionsResponse(this);
            } 

        } 

    }
    /**
     * 
     * {@link WafBatchRuleShared} extends {@link TeaModel}
     *
     * <p>WafBatchRuleShared</p>
     */
    public static class Actions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Response")
        private ActionsResponse response;

        private Actions(Builder builder) {
            this.response = builder.response;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Actions create() {
            return builder().build();
        }

        /**
         * @return response
         */
        public ActionsResponse getResponse() {
            return this.response;
        }

        public static final class Builder {
            private ActionsResponse response; 

            private Builder() {
            } 

            private Builder(Actions model) {
                this.response = model.response;
            } 

            /**
             * <p>The custom response.</p>
             */
            public Builder response(ActionsResponse response) {
                this.response = response;
                return this;
            }

            public Actions build() {
                return new Actions(this);
            } 

        } 

    }
}
