// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link BatchQueryIndividuationTextRequest} extends {@link RequestModel}
 *
 * <p>BatchQueryIndividuationTextRequest</p>
 */
public class BatchQueryIndividuationTextRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("textIdList")
    private java.util.List<String> textIdList;

    private BatchQueryIndividuationTextRequest(Builder builder) {
        super(builder);
        this.textIdList = builder.textIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchQueryIndividuationTextRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return textIdList
     */
    public java.util.List<String> getTextIdList() {
        return this.textIdList;
    }

    public static final class Builder extends Request.Builder<BatchQueryIndividuationTextRequest, Builder> {
        private java.util.List<String> textIdList; 

        private Builder() {
            super();
        } 

        private Builder(BatchQueryIndividuationTextRequest request) {
            super(request);
            this.textIdList = request.textIdList;
        } 

        /**
         * textIdList.
         */
        public Builder textIdList(java.util.List<String> textIdList) {
            String textIdListShrink = shrink(textIdList, "textIdList", "simple");
            this.putQueryParameter("textIdList", textIdListShrink);
            this.textIdList = textIdList;
            return this;
        }

        @Override
        public BatchQueryIndividuationTextRequest build() {
            return new BatchQueryIndividuationTextRequest(this);
        } 

    } 

}
