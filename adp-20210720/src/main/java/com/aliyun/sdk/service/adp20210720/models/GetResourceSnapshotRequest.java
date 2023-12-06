// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceSnapshotRequest} extends {@link RequestModel}
 *
 * <p>GetResourceSnapshotRequest</p>
 */
public class GetResourceSnapshotRequest extends Request {
    @Query
    @NameInMap("productVersionUID")
    private String productVersionUID;

    @Query
    @NameInMap("uid")
    private String uid;

    private GetResourceSnapshotRequest(Builder builder) {
        super(builder);
        this.productVersionUID = builder.productVersionUID;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceSnapshotRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return productVersionUID
     */
    public String getProductVersionUID() {
        return this.productVersionUID;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<GetResourceSnapshotRequest, Builder> {
        private String productVersionUID; 
        private String uid; 

        private Builder() {
            super();
        } 

        private Builder(GetResourceSnapshotRequest request) {
            super(request);
            this.productVersionUID = request.productVersionUID;
            this.uid = request.uid;
        } 

        /**
         * productVersionUID.
         */
        public Builder productVersionUID(String productVersionUID) {
            this.putQueryParameter("productVersionUID", productVersionUID);
            this.productVersionUID = productVersionUID;
            return this;
        }

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.putQueryParameter("uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public GetResourceSnapshotRequest build() {
            return new GetResourceSnapshotRequest(this);
        } 

    } 

}
