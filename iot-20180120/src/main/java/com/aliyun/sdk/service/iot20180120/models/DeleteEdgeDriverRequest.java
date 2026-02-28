// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link DeleteEdgeDriverRequest} extends {@link RequestModel}
 *
 * <p>DeleteEdgeDriverRequest</p>
 */
public class DeleteEdgeDriverRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DriverId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String driverId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    private DeleteEdgeDriverRequest(Builder builder) {
        super(builder);
        this.driverId = builder.driverId;
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEdgeDriverRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return driverId
     */
    public String getDriverId() {
        return this.driverId;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public static final class Builder extends Request.Builder<DeleteEdgeDriverRequest, Builder> {
        private String driverId; 
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEdgeDriverRequest request) {
            super(request);
            this.driverId = request.driverId;
            this.iotInstanceId = request.iotInstanceId;
        } 

        /**
         * <p>The ID of the driver. To obtain the driver ID, perform the following steps: Log on to the <a href="https://iot.console.aliyun.com/le/instance/list">Link IoT Edge console</a>. On the <strong>Drivers</strong> page, move the pointer over the name of the driver that you want to delete and obtain the driver ID.</p>
         * <p>You can also call the <a href="https://help.aliyun.com/document_detail/155776.html">QueryEdgeDriver</a> operation to query the driver ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fec565038d7544978d9aed5c1a******</p>
         */
        public Builder driverId(String driverId) {
            this.putQueryParameter("DriverId", driverId);
            this.driverId = driverId;
            return this;
        }

        /**
         * <p>The ID of the Internet of Things (IoT) service instance. This parameter is not required for the public instance but required for Enterprise Edition instances.</p>
         * 
         * <strong>example:</strong>
         * <p>iot_instc_pu****_c*-v64********</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        @Override
        public DeleteEdgeDriverRequest build() {
            return new DeleteEdgeDriverRequest(this);
        } 

    } 

}
