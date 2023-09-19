// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMetricRuleBlackListRequest} extends {@link RequestModel}
 *
 * <p>DeleteMetricRuleBlackListRequest</p>
 */
public class DeleteMetricRuleBlackListRequest extends Request {
    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    private DeleteMetricRuleBlackListRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMetricRuleBlackListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<DeleteMetricRuleBlackListRequest, Builder> {
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMetricRuleBlackListRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * The IDs of the blacklist policies. Separate multiple IDs with commas (,). You can specify up to 50 IDs.
         * <p>
         * 
         * For more information about how to obtain the ID of a blacklist policy, see [DescribeMetricRuleBlackList](~~457257~~).
         * 
         * >  You can also set this parameter to a JSON array. Example: `["a9ad2ac2-3ed9-11ed-b878-0242ac12****","5cb8a9a4-198f-4651-a353-f8b28788****"]`.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public DeleteMetricRuleBlackListRequest build() {
            return new DeleteMetricRuleBlackListRequest(this);
        } 

    } 

}
