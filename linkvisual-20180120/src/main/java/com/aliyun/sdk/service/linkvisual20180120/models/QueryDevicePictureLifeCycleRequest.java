// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

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
 * {@link QueryDevicePictureLifeCycleRequest} extends {@link RequestModel}
 *
 * <p>QueryDevicePictureLifeCycleRequest</p>
 */
public class QueryDevicePictureLifeCycleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the IPC device. The ID is issued by IoT Platform and uniquely identifies the device. You can call the IoT Platform <a href="https://help.aliyun.com/document_detail/69594.html">QueryDeviceDetail</a> operation to query the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>C47T6xwp6ms4bNlkHRWCg4****</p>
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
