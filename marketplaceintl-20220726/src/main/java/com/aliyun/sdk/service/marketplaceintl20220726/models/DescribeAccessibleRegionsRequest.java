// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketplaceintl20220726.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccessibleRegionsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAccessibleRegionsRequest</p>
 */
public class DescribeAccessibleRegionsRequest extends Request {
    @Body
    @NameInMap("RequestId")
    private String requestId;

    @Body
    @NameInMap("Uid")
    private String uid;

    private DescribeAccessibleRegionsRequest(Builder builder) {
        super(builder);
        this.requestId = builder.requestId;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccessibleRegionsRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeAccessibleRegionsRequest, Builder> {
        private String requestId; 
        private String uid; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAccessibleRegionsRequest request) {
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
        public DescribeAccessibleRegionsRequest build() {
            return new DescribeAccessibleRegionsRequest(this);
        } 

    } 

}
