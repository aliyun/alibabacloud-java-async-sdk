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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("longTtl")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer longTtl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("shortTtl")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer shortTtl;

    private UpdateMemoryRequest(Builder builder) {
        super(builder);
        this.memoryName = builder.memoryName;
        this.longTtl = builder.longTtl;
        this.shortTtl = builder.shortTtl;
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
     * @return shortTtl
     */
    public Integer getShortTtl() {
        return this.shortTtl;
    }

    public static final class Builder extends Request.Builder<UpdateMemoryRequest, Builder> {
        private String memoryName; 
        private Integer longTtl; 
        private Integer shortTtl; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMemoryRequest request) {
            super(request);
            this.memoryName = request.memoryName;
            this.longTtl = request.longTtl;
            this.shortTtl = request.shortTtl;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>365</p>
         */
        public Builder longTtl(Integer longTtl) {
            this.putQueryParameter("longTtl", longTtl);
            this.longTtl = longTtl;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder shortTtl(Integer shortTtl) {
            this.putQueryParameter("shortTtl", shortTtl);
            this.shortTtl = shortTtl;
            return this;
        }

        @Override
        public UpdateMemoryRequest build() {
            return new UpdateMemoryRequest(this);
        } 

    } 

}
