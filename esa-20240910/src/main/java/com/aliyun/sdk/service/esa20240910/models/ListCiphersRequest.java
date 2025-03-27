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
 * {@link ListCiphersRequest} extends {@link RequestModel}
 *
 * <p>ListCiphersRequest</p>
 */
public class ListCiphersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CiphersGroup")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ciphersGroup;

    private ListCiphersRequest(Builder builder) {
        super(builder);
        this.ciphersGroup = builder.ciphersGroup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCiphersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ciphersGroup
     */
    public String getCiphersGroup() {
        return this.ciphersGroup;
    }

    public static final class Builder extends Request.Builder<ListCiphersRequest, Builder> {
        private String ciphersGroup; 

        private Builder() {
            super();
        } 

        private Builder(ListCiphersRequest request) {
            super(request);
            this.ciphersGroup = request.ciphersGroup;
        } 

        /**
         * <p>The name of the cipher suite group, which can be: all, strict, custom.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>strict</p>
         */
        public Builder ciphersGroup(String ciphersGroup) {
            this.putQueryParameter("CiphersGroup", ciphersGroup);
            this.ciphersGroup = ciphersGroup;
            return this;
        }

        @Override
        public ListCiphersRequest build() {
            return new ListCiphersRequest(this);
        } 

    } 

}
