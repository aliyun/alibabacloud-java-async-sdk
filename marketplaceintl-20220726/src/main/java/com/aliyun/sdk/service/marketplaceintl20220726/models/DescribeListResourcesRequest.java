// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketplaceintl20220726.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeListResourcesRequest} extends {@link RequestModel}
 *
 * <p>DescribeListResourcesRequest</p>
 */
public class DescribeListResourcesRequest extends Request {
    @Body
    @NameInMap("RequestId")
    private String requestId;

    @Body
    @NameInMap("Type")
    private String type;

    @Body
    @NameInMap("Uid")
    private String uid;

    private DescribeListResourcesRequest(Builder builder) {
        super(builder);
        this.requestId = builder.requestId;
        this.type = builder.type;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeListResourcesRequest create() {
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<DescribeListResourcesRequest, Builder> {
        private String requestId; 
        private String type; 
        private String uid; 

        private Builder() {
            super();
        } 

        private Builder(DescribeListResourcesRequest request) {
            super(request);
            this.requestId = request.requestId;
            this.type = request.type;
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
         * Type.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
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
        public DescribeListResourcesRequest build() {
            return new DescribeListResourcesRequest(this);
        } 

    } 

}
