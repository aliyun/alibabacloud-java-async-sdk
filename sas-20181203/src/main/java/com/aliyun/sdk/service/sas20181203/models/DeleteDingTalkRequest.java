// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDingTalkRequest} extends {@link RequestModel}
 *
 * <p>DeleteDingTalkRequest</p>
 */
public class DeleteDingTalkRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ids")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ids;

    private DeleteDingTalkRequest(Builder builder) {
        super(builder);
        this.ids = builder.ids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDingTalkRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ids
     */
    public String getIds() {
        return this.ids;
    }

    public static final class Builder extends Request.Builder<DeleteDingTalkRequest, Builder> {
        private String ids; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDingTalkRequest request) {
            super(request);
            this.ids = request.ids;
        } 

        /**
         * The ID of the notification from the DingTalk chatbot. Separate multiple IDs with commas (,).
         * <p>
         * 
         * >  You can call the [DescribeDingTalk](~~DescribeDingTalk~~) operation to query the ID.
         */
        public Builder ids(String ids) {
            this.putQueryParameter("Ids", ids);
            this.ids = ids;
            return this;
        }

        @Override
        public DeleteDingTalkRequest build() {
            return new DeleteDingTalkRequest(this);
        } 

    } 

}
