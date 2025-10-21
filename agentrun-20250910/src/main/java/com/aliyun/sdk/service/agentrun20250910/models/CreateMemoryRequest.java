// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link CreateMemoryRequest} extends {@link RequestModel}
 *
 * <p>CreateMemoryRequest</p>
 */
public class CreateMemoryRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("longTtl")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer longTtl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("permanent")
    private Boolean permanent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("shortTtl")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer shortTtl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("strategy")
    private java.util.List<String> strategy;

    private CreateMemoryRequest(Builder builder) {
        super(builder);
        this.longTtl = builder.longTtl;
        this.name = builder.name;
        this.permanent = builder.permanent;
        this.shortTtl = builder.shortTtl;
        this.strategy = builder.strategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMemoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return longTtl
     */
    public Integer getLongTtl() {
        return this.longTtl;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return permanent
     */
    public Boolean getPermanent() {
        return this.permanent;
    }

    /**
     * @return shortTtl
     */
    public Integer getShortTtl() {
        return this.shortTtl;
    }

    /**
     * @return strategy
     */
    public java.util.List<String> getStrategy() {
        return this.strategy;
    }

    public static final class Builder extends Request.Builder<CreateMemoryRequest, Builder> {
        private Integer longTtl; 
        private String name; 
        private Boolean permanent; 
        private Integer shortTtl; 
        private java.util.List<String> strategy; 

        private Builder() {
            super();
        } 

        private Builder(CreateMemoryRequest request) {
            super(request);
            this.longTtl = request.longTtl;
            this.name = request.name;
            this.permanent = request.permanent;
            this.shortTtl = request.shortTtl;
            this.strategy = request.strategy;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>365</p>
         */
        public Builder longTtl(Integer longTtl) {
            this.putBodyParameter("longTtl", longTtl);
            this.longTtl = longTtl;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-memory</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * permanent.
         */
        public Builder permanent(Boolean permanent) {
            this.putBodyParameter("permanent", permanent);
            this.permanent = permanent;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder shortTtl(Integer shortTtl) {
            this.putBodyParameter("shortTtl", shortTtl);
            this.shortTtl = shortTtl;
            return this;
        }

        /**
         * strategy.
         */
        public Builder strategy(java.util.List<String> strategy) {
            this.putBodyParameter("strategy", strategy);
            this.strategy = strategy;
            return this;
        }

        @Override
        public CreateMemoryRequest build() {
            return new CreateMemoryRequest(this);
        } 

    } 

}
