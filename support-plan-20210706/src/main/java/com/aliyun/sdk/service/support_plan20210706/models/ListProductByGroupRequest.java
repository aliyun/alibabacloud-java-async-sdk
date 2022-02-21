// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.support_plan20210706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProductByGroupRequest} extends {@link RequestModel}
 *
 * <p>ListProductByGroupRequest</p>
 */
public class ListProductByGroupRequest extends Request {
    @Query
    @NameInMap("OpenGroupId")
    @Validation(required = true)
    private String openGroupId;

    private ListProductByGroupRequest(Builder builder) {
        super(builder);
        this.openGroupId = builder.openGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProductByGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return openGroupId
     */
    public String getOpenGroupId() {
        return this.openGroupId;
    }

    public static final class Builder extends Request.Builder<ListProductByGroupRequest, Builder> {
        private String openGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ListProductByGroupRequest response) {
            super(response);
            this.openGroupId = response.openGroupId;
        } 

        /**
         * 主群关联Id
         */
        public Builder openGroupId(String openGroupId) {
            this.putQueryParameter("OpenGroupId", openGroupId);
            this.openGroupId = openGroupId;
            return this;
        }

        @Override
        public ListProductByGroupRequest build() {
            return new ListProductByGroupRequest(this);
        } 

    } 

}
