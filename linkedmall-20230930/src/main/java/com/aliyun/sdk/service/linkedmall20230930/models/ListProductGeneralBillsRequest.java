// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProductGeneralBillsRequest} extends {@link RequestModel}
 *
 * <p>ListProductGeneralBillsRequest</p>
 */
public class ListProductGeneralBillsRequest extends Request {
    @Body
    @NameInMap("body")
    @Validation(required = true)
    private GeneralBillPageQuery body;

    private ListProductGeneralBillsRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProductGeneralBillsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public GeneralBillPageQuery getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<ListProductGeneralBillsRequest, Builder> {
        private GeneralBillPageQuery body; 

        private Builder() {
            super();
        } 

        private Builder(ListProductGeneralBillsRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(GeneralBillPageQuery body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public ListProductGeneralBillsRequest build() {
            return new ListProductGeneralBillsRequest(this);
        } 

    } 

}
