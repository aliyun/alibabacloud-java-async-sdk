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
 * {@link QueryDeviceGroupTagListRequest} extends {@link RequestModel}
 *
 * <p>QueryDeviceGroupTagListRequest</p>
 */
public class QueryDeviceGroupTagListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupType")
    private String groupType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    private QueryDeviceGroupTagListRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.groupType = builder.groupType;
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDeviceGroupTagListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return groupType
     */
    public String getGroupType() {
        return this.groupType;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public static final class Builder extends Request.Builder<QueryDeviceGroupTagListRequest, Builder> {
        private String groupId; 
        private String groupType; 
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(QueryDeviceGroupTagListRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.groupType = request.groupType;
            this.iotInstanceId = request.iotInstanceId;
        } 

        /**
         * <p>The ID of the group. The ID is the globally unique identifier (GUID) for the group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>W16X8Tvdosec****</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The type of the group.</p>
         * <p>If you set the value to <strong>LINK_PLATFORM_DYNAMIC</strong>, a dynamic group is queried. If you do not specify this parameter, a static group is queried by default.</p>
         * 
         * <strong>example:</strong>
         * <p>LINK_PLATFORM_DYNAMIC</p>
         */
        public Builder groupType(String groupType) {
            this.putQueryParameter("GroupType", groupType);
            this.groupType = groupType;
            return this;
        }

        /**
         * <p>The ID of the instance. You can view the instance <strong>ID</strong> on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <ul>
         * <li>If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</li>
         * <li>If your instance has no <strong>Overview</strong> page or ID, you do not need to set this parameter.</li>
         * </ul>
         * </blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
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
        public QueryDeviceGroupTagListRequest build() {
            return new QueryDeviceGroupTagListRequest(this);
        } 

    } 

}
