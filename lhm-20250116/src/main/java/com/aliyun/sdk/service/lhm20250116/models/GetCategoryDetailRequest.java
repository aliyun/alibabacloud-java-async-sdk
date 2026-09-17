// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link GetCategoryDetailRequest} extends {@link RequestModel}
 *
 * <p>GetCategoryDetailRequest</p>
 */
public class GetCategoryDetailRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("category")
    private String category;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("source")
    private String source;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("target")
    private String target;

    private GetCategoryDetailRequest(Builder builder) {
        super(builder);
        this.category = builder.category;
        this.source = builder.source;
        this.target = builder.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCategoryDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return target
     */
    public String getTarget() {
        return this.target;
    }

    public static final class Builder extends Request.Builder<GetCategoryDetailRequest, Builder> {
        private String category; 
        private String source; 
        private String target; 

        private Builder() {
            super();
        } 

        private Builder(GetCategoryDetailRequest request) {
            super(request);
            this.category = request.category;
            this.source = request.source;
            this.target = request.target;
        } 

        /**
         * <p>The list of category paths.</p>
         * 
         * <strong>example:</strong>
         * <p>/lhm/</p>
         */
        public Builder category(String category) {
            this.putBodyParameter("category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>The source dialect.</p>
         * 
         * <strong>example:</strong>
         * <p>sparksql</p>
         */
        public Builder source(String source) {
            this.putBodyParameter("source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>The target dialect.</p>
         * 
         * <strong>example:</strong>
         * <p>hologres</p>
         */
        public Builder target(String target) {
            this.putBodyParameter("target", target);
            this.target = target;
            return this;
        }

        @Override
        public GetCategoryDetailRequest build() {
            return new GetCategoryDetailRequest(this);
        } 

    } 

}
