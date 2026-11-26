// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligeniessp_1_0.models;

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
 * {@link ListCateInfoRequest} extends {@link RequestModel}
 *
 * <p>ListCateInfoRequest</p>
 */
public class ListCateInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private ListCateInfoRequest(Builder builder) {
        super(builder);
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCateInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListCateInfoRequest, Builder> {
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListCateInfoRequest request) {
            super(request);
            this.type = request.type;
        } 

        /**
         * <p>Default value is song (the extension field currently only supports song)</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>song</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListCateInfoRequest build() {
            return new ListCateInfoRequest(this);
        } 

    } 

}
