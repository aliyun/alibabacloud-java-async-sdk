// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

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
 * {@link UnbindPasswordFreeLoginUserRequest} extends {@link RequestModel}
 *
 * <p>UnbindPasswordFreeLoginUserRequest</p>
 */
public class UnbindPasswordFreeLoginUserRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MainBizType")
    private String mainBizType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SerialNumber")
    private String serialNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private UnbindPasswordFreeLoginUserRequest(Builder builder) {
        super(builder);
        this.mainBizType = builder.mainBizType;
        this.serialNumber = builder.serialNumber;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindPasswordFreeLoginUserRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mainBizType
     */
    public String getMainBizType() {
        return this.mainBizType;
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

    public static final class Builder extends Request.Builder<UnbindPasswordFreeLoginUserRequest, Builder> {
        private String mainBizType; 
        private String serialNumber; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(UnbindPasswordFreeLoginUserRequest request) {
            super(request);
            this.mainBizType = request.mainBizType;
            this.serialNumber = request.serialNumber;
            this.uuid = request.uuid;
        } 

        /**
         * MainBizType.
         */
        public Builder mainBizType(String mainBizType) {
            this.putBodyParameter("MainBizType", mainBizType);
            this.mainBizType = mainBizType;
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
        public UnbindPasswordFreeLoginUserRequest build() {
            return new UnbindPasswordFreeLoginUserRequest(this);
        } 

    } 

}
