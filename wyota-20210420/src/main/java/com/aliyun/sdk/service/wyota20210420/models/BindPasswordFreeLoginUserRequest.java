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
 * {@link BindPasswordFreeLoginUserRequest} extends {@link RequestModel}
 *
 * <p>BindPasswordFreeLoginUserRequest</p>
 */
public class BindPasswordFreeLoginUserRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private String endUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MainBizType")
    private String mainBizType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SerialNumber")
    private String serialNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private BindPasswordFreeLoginUserRequest(Builder builder) {
        super(builder);
        this.endUserId = builder.endUserId;
        this.mainBizType = builder.mainBizType;
        this.serialNumber = builder.serialNumber;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindPasswordFreeLoginUserRequest create() {
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

    public static final class Builder extends Request.Builder<BindPasswordFreeLoginUserRequest, Builder> {
        private String endUserId; 
        private String mainBizType; 
        private String serialNumber; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(BindPasswordFreeLoginUserRequest request) {
            super(request);
            this.endUserId = request.endUserId;
            this.mainBizType = request.mainBizType;
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
        public BindPasswordFreeLoginUserRequest build() {
            return new BindPasswordFreeLoginUserRequest(this);
        } 

    } 

}
