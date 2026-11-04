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
 * {@link QueryDeviceRecordLifeCycleRequest} extends {@link RequestModel}
 *
 * <p>QueryDeviceRecordLifeCycleRequest</p>
 */
public class QueryDeviceRecordLifeCycleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> deviceList;

    private QueryDeviceRecordLifeCycleRequest(Builder builder) {
        super(builder);
        this.deviceList = builder.deviceList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDeviceRecordLifeCycleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceList
     */
    public java.util.List<String> getDeviceList() {
        return this.deviceList;
    }

    public static final class Builder extends Request.Builder<QueryDeviceRecordLifeCycleRequest, Builder> {
        private java.util.List<String> deviceList; 

        private Builder() {
            super();
        } 

        private Builder(QueryDeviceRecordLifeCycleRequest request) {
            super(request);
            this.deviceList = request.deviceList;
        } 

        /**
         * <p>The list of IoT IDs of the IPC devices. An IoT ID is a unique identifier issued by IoT Platform for a device. You can call the IoT Platform <a href="https://help.aliyun.com/document_detail/69594.html">QueryDeviceDetail</a> operation to query the IoT ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;C47T6xwp6ms4bNlkHRWCg4****&quot;, &quot;d7XmBoJhAr88C6PelXDF00****&quot;]</p>
         */
        public Builder deviceList(java.util.List<String> deviceList) {
            this.putQueryParameter("DeviceList", deviceList);
            this.deviceList = deviceList;
            return this;
        }

        @Override
        public QueryDeviceRecordLifeCycleRequest build() {
            return new QueryDeviceRecordLifeCycleRequest(this);
        } 

    } 

}
