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
         * Action.
         */
        public Builder action(String action) {
            this.action = action;
            return this;
        }

        /**
         * Actions.
         */
        public Builder actions(Actions actions) {
            this.actions = actions;
            return this;
        }

        /**
         * CrossSiteId.
         */
        public Builder crossSiteId(Long crossSiteId) {
            this.crossSiteId = crossSiteId;
            return this;
        }

        /**
         * Expression.
         */
        public Builder expression(String expression) {
            this.expression = expression;
            return this;
        }

        /**
         * Match.
         */
        public Builder match(WafRuleMatch2 match) {
            this.match = match;
            return this;
        }

        /**
         * Mode.
         */
        public Builder mode(String mode) {
            this.mode = mode;
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
         * Target.
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
    public static class Response extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private Integer code;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        private Response(Builder builder) {
            this.code = builder.code;
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Response create() {
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

            private Builder(Response model) {
                this.code = model.code;
                this.id = model.id;
            } 

            /**
             * Code.
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            public Response build() {
                return new Response(this);
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
        private Response response;

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
        public Response getResponse() {
            return this.response;
        }

        public static final class Builder {
            private Response response; 

            private Builder() {
            } 

            private Builder(Actions model) {
                this.response = model.response;
            } 

            /**
             * Response.
             */
            public Builder response(Response response) {
                this.response = response;
                return this;
            }

            public Actions build() {
                return new Actions(this);
            } 

        } 

    }
}
