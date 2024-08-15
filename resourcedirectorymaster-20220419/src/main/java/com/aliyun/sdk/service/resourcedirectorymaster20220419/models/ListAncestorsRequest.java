// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAncestorsRequest} extends {@link RequestModel}
 *
 * <p>ListAncestorsRequest</p>
 */
public class ListAncestorsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChildId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * The ID of the subfolder.
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
