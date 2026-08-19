// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.accountlabel20200315.models;

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
 * {@link QueryCustomerLabelByConfigGroupRequest} extends {@link RequestModel}
 *
 * <p>QueryCustomerLabelByConfigGroupRequest</p>
 */
public class QueryCustomerLabelByConfigGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PK")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pk;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Token")
    @com.aliyun.core.annotation.Validation(required = true)
    private String token;

    private QueryCustomerLabelByConfigGroupRequest(Builder builder) {
        super(builder);
        this.groupType = builder.groupType;
        this.pk = builder.pk;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCustomerLabelByConfigGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupType
     */
    public String getGroupType() {
        return this.groupType;
    }

    /**
     * @return pk
     */
    public Long getPk() {
        return this.pk;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder extends Request.Builder<QueryCustomerLabelByConfigGroupRequest, Builder> {
        private String groupType; 
        private Long pk; 
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(QueryCustomerLabelByConfigGroupRequest request) {
            super(request);
            this.groupType = request.groupType;
            this.pk = request.pk;
            this.token = request.token;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder groupType(String groupType) {
            this.putQueryParameter("GroupType", groupType);
            this.groupType = groupType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder pk(Long pk) {
            this.putQueryParameter("PK", pk);
            this.pk = pk;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        @Override
        public QueryCustomerLabelByConfigGroupRequest build() {
            return new QueryCustomerLabelByConfigGroupRequest(this);
        } 

    } 

}
