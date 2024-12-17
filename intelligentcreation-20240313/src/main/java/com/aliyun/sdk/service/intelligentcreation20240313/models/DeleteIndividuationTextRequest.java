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
 * {@link DeleteIndividuationTextRequest} extends {@link RequestModel}
 *
 * <p>DeleteIndividuationTextRequest</p>
 */
public class DeleteIndividuationTextRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("textIdList")
    private java.util.List<String> textIdList;

    private DeleteIndividuationTextRequest(Builder builder) {
        super(builder);
        this.textIdList = builder.textIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteIndividuationTextRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteIndividuationTextRequest, Builder> {
        private java.util.List<String> textIdList; 

        private Builder() {
            super();
        } 

        private Builder(DeleteIndividuationTextRequest request) {
            super(request);
            this.textIdList = request.textIdList;
        } 

        /**
         * textIdList.
         */
        public Builder textIdList(java.util.List<String> textIdList) {
            this.putBodyParameter("textIdList", textIdList);
            this.textIdList = textIdList;
            return this;
        }

        @Override
        public DeleteIndividuationTextRequest build() {
            return new DeleteIndividuationTextRequest(this);
        } 

    } 

}
