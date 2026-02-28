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
 * {@link DeleteShareTaskDeviceRequest} extends {@link RequestModel}
 *
 * <p>DeleteShareTaskDeviceRequest</p>
 */
public class DeleteShareTaskDeviceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IotIdList")
    private java.util.List<String> iotIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShareTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String shareTaskId;

    private DeleteShareTaskDeviceRequest(Builder builder) {
        super(builder);
        this.iotIdList = builder.iotIdList;
        this.iotInstanceId = builder.iotInstanceId;
        this.shareTaskId = builder.shareTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteShareTaskDeviceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iotIdList
     */
    public java.util.List<String> getIotIdList() {
        return this.iotIdList;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return shareTaskId
     */
    public String getShareTaskId() {
        return this.shareTaskId;
    }

    public static final class Builder extends Request.Builder<DeleteShareTaskDeviceRequest, Builder> {
        private java.util.List<String> iotIdList; 
        private String iotInstanceId; 
        private String shareTaskId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteShareTaskDeviceRequest request) {
            super(request);
            this.iotIdList = request.iotIdList;
            this.iotInstanceId = request.iotInstanceId;
            this.shareTaskId = request.shareTaskId;
        } 

        /**
         * IotIdList.
         */
        public Builder iotIdList(java.util.List<String> iotIdList) {
            this.putBodyParameter("IotIdList", iotIdList);
            this.iotIdList = iotIdList;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putBodyParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Md3ZiTL888K9llXDy7890***********</p>
         */
        public Builder shareTaskId(String shareTaskId) {
            this.putBodyParameter("ShareTaskId", shareTaskId);
            this.shareTaskId = shareTaskId;
            return this;
        }

        @Override
        public DeleteShareTaskDeviceRequest build() {
            return new DeleteShareTaskDeviceRequest(this);
        } 

    } 

}
