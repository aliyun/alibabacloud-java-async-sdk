// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAncestorsRequest} extends {@link RequestModel}
 *
 * <p>ListAncestorsRequest</p>
 */
public class ListAncestorsRequest extends Request {
    @Query
    @NameInMap("ChildId")
    @Validation(required = true)
    private String childId;

    private ListAncestorsRequest(Builder builder) {
        super(builder);
        this.childId = builder.childId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAncestorsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return childId
     */
    public String getChildId() {
        return this.childId;
    }

    public static final class Builder extends Request.Builder<ListAncestorsRequest, Builder> {
        private String childId; 

        private Builder() {
            super();
        } 

        private Builder(ListAncestorsRequest request) {
            super(request);
            this.childId = request.childId;
        } 

        /**
         * ChildId.
         */
        public Builder childId(String childId) {
            this.putQueryParameter("ChildId", childId);
            this.childId = childId;
            return this;
        }

        @Override
        public ListAncestorsRequest build() {
            return new ListAncestorsRequest(this);
        } 

    } 

}
