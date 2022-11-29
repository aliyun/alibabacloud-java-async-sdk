// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPipelineTemplatesRequest} extends {@link RequestModel}
 *
 * <p>ListPipelineTemplatesRequest</p>
 */
public class ListPipelineTemplatesRequest extends Request {
    @Query
    @NameInMap("labelSelector")
    private java.util.List < String > labelSelector;

    private ListPipelineTemplatesRequest(Builder builder) {
        super(builder);
        this.labelSelector = builder.labelSelector;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPipelineTemplatesRequest create() {
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

    public static final class Builder extends Request.Builder<ListPipelineTemplatesRequest, Builder> {
        private java.util.List < String > labelSelector; 

        private Builder() {
            super();
        } 

        private Builder(ListPipelineTemplatesRequest request) {
            super(request);
            this.labelSelector = request.labelSelector;
        } 

        /**
         * 只返回含有这些label的对象
         */
        public Builder labelSelector(java.util.List < String > labelSelector) {
            String labelSelectorShrink = shrink(labelSelector, "labelSelector", "simple");
            this.putQueryParameter("labelSelector", labelSelectorShrink);
            this.labelSelector = labelSelector;
            return this;
        }

        @Override
        public ListPipelineTemplatesRequest build() {
            return new ListPipelineTemplatesRequest(this);
        } 

    } 

}
