// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDevicePictureLifeCycleRequest} extends {@link RequestModel}
 *
 * <p>QueryDevicePictureLifeCycleRequest</p>
 */
public class QueryDevicePictureLifeCycleRequest extends Request {
    @Query
    @NameInMap("IotId")
    @Validation(required = true)
    private String iotId;

    private QueryDevicePictureLifeCycleRequest(Builder builder) {
        super(builder);
        this.iotId = builder.iotId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDevicePictureLifeCycleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iotId
     */
    public String getIotId() {
        return this.iotId;
    }

    public static final class Builder extends Request.Builder<QueryDevicePictureLifeCycleRequest, Builder> {
        private String iotId; 

        private Builder() {
            super();
        } 

        private Builder(QueryDevicePictureLifeCycleRequest request) {
            super(request);
            this.iotId = request.iotId;
        } 

        /**
         * IotId.
         */
        public Builder iotId(String iotId) {
            this.putQueryParameter("IotId", iotId);
            this.iotId = iotId;
            return this;
        }

        @Override
        public QueryDevicePictureLifeCycleRequest build() {
            return new QueryDevicePictureLifeCycleRequest(this);
        } 

    } 

}
