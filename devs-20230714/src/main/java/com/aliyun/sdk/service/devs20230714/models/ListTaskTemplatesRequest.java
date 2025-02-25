// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTaskTemplatesRequest} extends {@link RequestModel}
 *
 * <p>ListTaskTemplatesRequest</p>
 */
public class ListTaskTemplatesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("labelSelector")
    private java.util.List < String > labelSelector;

    private ListTaskTemplatesRequest(Builder builder) {
        super(builder);
        this.labelSelector = builder.labelSelector;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTaskTemplatesRequest create() {
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

    public static final class Builder extends Request.Builder<ListTaskTemplatesRequest, Builder> {
        private java.util.List < String > labelSelector; 

        private Builder() {
            super();
        } 

        private Builder(ListTaskTemplatesRequest request) {
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
        public ListTaskTemplatesRequest build() {
            return new ListTaskTemplatesRequest(this);
        } 

    } 

}
