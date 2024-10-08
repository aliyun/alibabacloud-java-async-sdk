// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link BindAccountLessLoginUserRequest} extends {@link RequestModel}
 *
 * <p>BindAccountLessLoginUserRequest</p>
 */
public class BindAccountLessLoginUserRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private String endUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SerialNumber")
    private String serialNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private BindAccountLessLoginUserRequest(Builder builder) {
        super(builder);
        this.endUserId = builder.endUserId;
        this.serialNumber = builder.serialNumber;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindAccountLessLoginUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return serialNumber
     */
    public String getSerialNumber() {
        return this.serialNumber;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<BindAccountLessLoginUserRequest, Builder> {
        private String endUserId; 
        private String serialNumber; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(BindAccountLessLoginUserRequest request) {
            super(request);
            this.endUserId = request.endUserId;
            this.serialNumber = request.serialNumber;
            this.uuid = request.uuid;
        } 

        /**
         * EndUserId.
         */
        public Builder endUserId(String endUserId) {
            this.putBodyParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * SerialNumber.
         */
        public Builder serialNumber(String serialNumber) {
            this.putBodyParameter("SerialNumber", serialNumber);
            this.serialNumber = serialNumber;
            return this;
        }

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.putBodyParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public BindAccountLessLoginUserRequest build() {
            return new BindAccountLessLoginUserRequest(this);
        } 

    } 

}
