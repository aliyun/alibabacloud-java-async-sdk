// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

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
 * {@link CreateWarehouseRequest} extends {@link RequestModel}
 *
 * <p>CreateWarehouseRequest</p>
 */
public class CreateWarehouseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Biz")
    private String biz;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private CreateWarehouseRequest(Builder builder) {
        super(builder);
        this.biz = builder.biz;
        this.name = builder.name;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWarehouseRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return biz
     */
    public String getBiz() {
        return this.biz;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateWarehouseRequest, Builder> {
        private String biz; 
        private String name; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateWarehouseRequest request) {
            super(request);
            this.biz = request.biz;
            this.name = request.name;
            this.type = request.type;
        } 

        /**
         * Biz.
         */
        public Builder biz(String biz) {
            this.putQueryParameter("Biz", biz);
            this.biz = biz;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateWarehouseRequest build() {
            return new CreateWarehouseRequest(this);
        } 

    } 

}
