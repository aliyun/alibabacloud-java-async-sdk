// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkface20180720.models;

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
 * {@link QueryAddUserInfoRequest} extends {@link RequestModel}
 *
 * <p>QueryAddUserInfoRequest</p>
 */
public class QueryAddUserInfoRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeviceName")
    private String deviceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IotId")
    private String iotId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    private String productKey;

    private QueryAddUserInfoRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.groupId = builder.groupId;
        this.iotId = builder.iotId;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAddUserInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceName
     */
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return iotId
     */
    public String getIotId() {
        return this.iotId;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    public static final class Builder extends Request.Builder<QueryAddUserInfoRequest, Builder> {
        private String deviceName; 
        private String groupId; 
        private String iotId; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(QueryAddUserInfoRequest request) {
            super(request);
            this.deviceName = request.deviceName;
            this.groupId = request.groupId;
            this.iotId = request.iotId;
            this.productKey = request.productKey;
        } 

        /**
         * DeviceName.
         */
        public Builder deviceName(String deviceName) {
            this.putBodyParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putBodyParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * IotId.
         */
        public Builder iotId(String iotId) {
            this.putBodyParameter("IotId", iotId);
            this.iotId = iotId;
            return this;
        }

        /**
         * ProductKey.
         */
        public Builder productKey(String productKey) {
            this.putBodyParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        @Override
        public QueryAddUserInfoRequest build() {
            return new QueryAddUserInfoRequest(this);
        } 

    } 

}
