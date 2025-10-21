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
 * {@link UpdateMemoryRequest} extends {@link RequestModel}
 *
 * <p>UpdateMemoryRequest</p>
 */
public class UpdateMemoryRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("memoryName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String memoryName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("longTtl")
    private Integer longTtl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("permanent")
    private Boolean permanent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("shortTtl")
    private Integer shortTtl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("strategy")
    private java.util.List<String> strategy;

    private UpdateMemoryRequest(Builder builder) {
        super(builder);
        this.memoryName = builder.memoryName;
        this.longTtl = builder.longTtl;
        this.permanent = builder.permanent;
        this.shortTtl = builder.shortTtl;
        this.strategy = builder.strategy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMemoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return memoryName
     */
    public String getMemoryName() {
        return this.memoryName;
    }

    /**
     * @return longTtl
     */
    public Integer getLongTtl() {
        return this.longTtl;
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

    public static final class Builder extends Request.Builder<UpdateMemoryRequest, Builder> {
        private String memoryName; 
        private Integer longTtl; 
        private Boolean permanent; 
        private Integer shortTtl; 
        private java.util.List<String> strategy; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMemoryRequest request) {
            super(request);
            this.memoryName = request.memoryName;
            this.longTtl = request.longTtl;
            this.permanent = request.permanent;
            this.shortTtl = request.shortTtl;
            this.strategy = request.strategy;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-memory</p>
         */
        public Builder memoryName(String memoryName) {
            this.putPathParameter("memoryName", memoryName);
            this.memoryName = memoryName;
            return this;
        }

        /**
         * longTtl.
         */
        public Builder longTtl(Integer longTtl) {
            this.putBodyParameter("longTtl", longTtl);
            this.longTtl = longTtl;
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
         * shortTtl.
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
        public UpdateMemoryRequest build() {
            return new UpdateMemoryRequest(this);
        } 

    } 

}
