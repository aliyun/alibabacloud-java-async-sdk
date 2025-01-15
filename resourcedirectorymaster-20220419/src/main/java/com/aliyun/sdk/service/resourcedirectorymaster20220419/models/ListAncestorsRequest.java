// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

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
         * <p>The ID of the subfolder.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fd-i1c9nr****</p>
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
