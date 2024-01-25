// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCloudAllResourceListRequest} extends {@link RequestModel}
 *
 * <p>GetCloudAllResourceListRequest</p>
 */
public class GetCloudAllResourceListRequest extends Request {
    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    @Query
    @NameInMap("Uid")
    private String uid;

    private GetCloudAllResourceListRequest(Builder builder) {
        super(builder);
        this.operaUid = builder.operaUid;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCloudAllResourceListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<GetCloudAllResourceListRequest, Builder> {
        private String operaUid; 
        private String uid; 

        private Builder() {
            super();
        } 

        private Builder(GetCloudAllResourceListRequest request) {
            super(request);
            this.operaUid = request.operaUid;
            this.uid = request.uid;
        } 

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putQueryParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        /**
         * Uid.
         */
        public Builder uid(String uid) {
            this.putQueryParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public GetCloudAllResourceListRequest build() {
            return new GetCloudAllResourceListRequest(this);
        } 

    } 

}
