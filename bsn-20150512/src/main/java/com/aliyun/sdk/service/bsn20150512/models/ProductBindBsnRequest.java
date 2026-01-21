// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bsn20150512.models;

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
 * {@link ProductBindBsnRequest} extends {@link RequestModel}
 *
 * <p>ProductBindBsnRequest</p>
 */
public class ProductBindBsnRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("aliuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long aliuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("num")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer num;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer resourceType;

    private ProductBindBsnRequest(Builder builder) {
        super(builder);
        this.aliuid = builder.aliuid;
        this.num = builder.num;
        this.resourceId = builder.resourceId;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProductBindBsnRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliuid
     */
    public Long getAliuid() {
        return this.aliuid;
    }

    /**
     * @return num
     */
    public Integer getNum() {
        return this.num;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceType
     */
    public Integer getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<ProductBindBsnRequest, Builder> {
        private Long aliuid; 
        private Integer num; 
        private String resourceId; 
        private Integer resourceType; 

        private Builder() {
            super();
        } 

        private Builder(ProductBindBsnRequest request) {
            super(request);
            this.aliuid = request.aliuid;
            this.num = request.num;
            this.resourceId = request.resourceId;
            this.resourceType = request.resourceType;
        } 

        /**
         * <p>456*******163</p>
         * <p>This parameter is required.</p>
         */
        public Builder aliuid(Long aliuid) {
            this.putQueryParameter("aliuid", aliuid);
            this.aliuid = aliuid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder num(Integer num) {
            this.putQueryParameter("num", num);
            this.num = num;
            return this;
        }

        /**
         * <p>41****34</p>
         * <p>This parameter is required.</p>
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("resourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder resourceType(Integer resourceType) {
            this.putQueryParameter("resourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public ProductBindBsnRequest build() {
            return new ProductBindBsnRequest(this);
        } 

    } 

}
