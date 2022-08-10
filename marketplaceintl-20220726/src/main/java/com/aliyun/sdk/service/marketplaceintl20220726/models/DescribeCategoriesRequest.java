// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketplaceintl20220726.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCategoriesRequest} extends {@link RequestModel}
 *
 * <p>DescribeCategoriesRequest</p>
 */
public class DescribeCategoriesRequest extends Request {
    @Body
    @NameInMap("RequestId")
    private String requestId;

    @Body
    @NameInMap("Uid")
    private String uid;

    private DescribeCategoriesRequest(Builder builder) {
        super(builder);
        this.requestId = builder.requestId;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCategoriesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<DescribeCategoriesRequest, Builder> {
        private String requestId; 
        private String uid; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCategoriesRequest request) {
            super(request);
            this.requestId = request.requestId;
            this.uid = request.uid;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.putBodyParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * Uid.
         */
        public Builder uid(String uid) {
            this.putBodyParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public DescribeCategoriesRequest build() {
            return new DescribeCategoriesRequest(this);
        } 

    } 

}
