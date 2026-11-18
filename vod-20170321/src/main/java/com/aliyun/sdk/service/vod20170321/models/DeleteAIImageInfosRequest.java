// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DeleteAIImageInfosRequest} extends {@link RequestModel}
 *
 * <p>DeleteAIImageInfosRequest</p>
 */
public class DeleteAIImageInfosRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AIImageInfoIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String AIImageInfoIds;

    private DeleteAIImageInfosRequest(Builder builder) {
        super(builder);
        this.AIImageInfoIds = builder.AIImageInfoIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAIImageInfosRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return AIImageInfoIds
     */
    public String getAIImageInfoIds() {
        return this.AIImageInfoIds;
    }

    public static final class Builder extends Request.Builder<DeleteAIImageInfosRequest, Builder> {
        private String AIImageInfoIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAIImageInfosRequest request) {
            super(request);
            this.AIImageInfoIds = request.AIImageInfoIds;
        } 

        /**
         * <p>The IDs of AI image information. This parameter consists of one or more AIImageInfoId values. The AIImageInfoId is the value of the AIImageInfoId response parameter returned by the <a href="https://help.aliyun.com/document_detail/186924.html">ListAIImageInfo</a> operation.</p>
         * <ul>
         * <li>A maximum of 10 IDs are supported.</li>
         * <li>Separate multiple IDs with commas (,).</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>b89a6aabf144*****6197ebd6fe6cf29</p>
         */
        public Builder AIImageInfoIds(String AIImageInfoIds) {
            this.putQueryParameter("AIImageInfoIds", AIImageInfoIds);
            this.AIImageInfoIds = AIImageInfoIds;
            return this;
        }

        @Override
        public DeleteAIImageInfosRequest build() {
            return new DeleteAIImageInfosRequest(this);
        } 

    } 

}
