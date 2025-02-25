// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTasksRequest} extends {@link RequestModel}
 *
 * <p>ListTasksRequest</p>
 */
public class ListTasksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("labelSelector")
    private java.util.List < String > labelSelector;

    private ListTasksRequest(Builder builder) {
        super(builder);
        this.labelSelector = builder.labelSelector;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTasksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return labelSelector
     */
    public java.util.List < String > getLabelSelector() {
        return this.labelSelector;
    }

    public static final class Builder extends Request.Builder<ListTasksRequest, Builder> {
        private java.util.List < String > labelSelector; 

        private Builder() {
            super();
        } 

        private Builder(ListTasksRequest request) {
            super(request);
            this.labelSelector = request.labelSelector;
        } 

        /**
         * labelSelector.
         */
        public Builder labelSelector(java.util.List < String > labelSelector) {
            String labelSelectorShrink = shrink(labelSelector, "labelSelector", "simple");
            this.putQueryParameter("labelSelector", labelSelectorShrink);
            this.labelSelector = labelSelector;
            return this;
        }

        @Override
        public ListTasksRequest build() {
            return new ListTasksRequest(this);
        } 

    } 

}
