// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20161111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListParentsRequest} extends {@link RequestModel}
 *
 * <p>ListParentsRequest</p>
 */
public class ListParentsRequest extends Request {
    @Query
    @NameInMap("ChildId")
    @Validation(required = true)
    private String childId;

    private ListParentsRequest(Builder builder) {
        super(builder);
        this.childId = builder.childId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListParentsRequest create() {
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

    public static final class Builder extends Request.Builder<ListParentsRequest, Builder> {
        private String childId; 

        private Builder() {
            super();
        } 

        private Builder(ListParentsRequest request) {
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
        public ListParentsRequest build() {
            return new ListParentsRequest(this);
        } 

    } 

}
