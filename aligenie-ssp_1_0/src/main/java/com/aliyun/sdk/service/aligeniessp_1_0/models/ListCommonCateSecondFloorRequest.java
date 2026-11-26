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
 * {@link ListCommonCateSecondFloorRequest} extends {@link RequestModel}
 *
 * <p>ListCommonCateSecondFloorRequest</p>
 */
public class ListCommonCateSecondFloorRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentCateId")
    private Long parentCateId;

    private ListCommonCateSecondFloorRequest(Builder builder) {
        super(builder);
        this.parentCateId = builder.parentCateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCommonCateSecondFloorRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return parentCateId
     */
    public Long getParentCateId() {
        return this.parentCateId;
    }

    public static final class Builder extends Request.Builder<ListCommonCateSecondFloorRequest, Builder> {
        private Long parentCateId; 

        private Builder() {
            super();
        } 

        private Builder(ListCommonCateSecondFloorRequest request) {
            super(request);
            this.parentCateId = request.parentCateId;
        } 

        /**
         * <p>Parent category ID</p>
         * 
         * <strong>example:</strong>
         * <p>80010</p>
         */
        public Builder parentCateId(Long parentCateId) {
            this.putQueryParameter("ParentCateId", parentCateId);
            this.parentCateId = parentCateId;
            return this;
        }

        @Override
        public ListCommonCateSecondFloorRequest build() {
            return new ListCommonCateSecondFloorRequest(this);
        } 

    } 

}
