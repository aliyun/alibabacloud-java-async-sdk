// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDeviceRecordLifeCycleRequest} extends {@link RequestModel}
 *
 * <p>QueryDeviceRecordLifeCycleRequest</p>
 */
public class QueryDeviceRecordLifeCycleRequest extends Request {
    @Query
    @NameInMap("DeviceList")
    @Validation(required = true)
    private java.util.List < String > deviceList;

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
    public java.util.List < String > getDeviceList() {
        return this.deviceList;
    }

    public static final class Builder extends Request.Builder<QueryDeviceRecordLifeCycleRequest, Builder> {
        private java.util.List < String > deviceList; 

        private Builder() {
            super();
        } 

        private Builder(QueryDeviceRecordLifeCycleRequest request) {
            super(request);
            this.deviceList = request.deviceList;
        } 

        /**
         * DeviceList.
         */
        public Builder deviceList(java.util.List < String > deviceList) {
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
