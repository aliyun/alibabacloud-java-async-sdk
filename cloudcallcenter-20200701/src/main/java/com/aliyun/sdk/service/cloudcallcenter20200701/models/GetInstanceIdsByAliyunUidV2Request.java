// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcallcenter20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInstanceIdsByAliyunUidV2Request} extends {@link RequestModel}
 *
 * <p>GetInstanceIdsByAliyunUidV2Request</p>
 */
public class GetInstanceIdsByAliyunUidV2Request extends Request {
    @Query
    @NameInMap("AliyunUid")
    private String aliyunUid;

    private GetInstanceIdsByAliyunUidV2Request(Builder builder) {
        super(builder);
        this.aliyunUid = builder.aliyunUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceIdsByAliyunUidV2Request create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliyunUid
     */
    public String getAliyunUid() {
        return this.aliyunUid;
    }

    public static final class Builder extends Request.Builder<GetInstanceIdsByAliyunUidV2Request, Builder> {
        private String aliyunUid; 

        private Builder() {
            super();
        } 

        private Builder(GetInstanceIdsByAliyunUidV2Request request) {
            super(request);
            this.aliyunUid = request.aliyunUid;
        } 

        /**
         * AliyunUid.
         */
        public Builder aliyunUid(String aliyunUid) {
            this.putQueryParameter("AliyunUid", aliyunUid);
            this.aliyunUid = aliyunUid;
            return this;
        }

        @Override
        public GetInstanceIdsByAliyunUidV2Request build() {
            return new GetInstanceIdsByAliyunUidV2Request(this);
        } 

    } 

}
