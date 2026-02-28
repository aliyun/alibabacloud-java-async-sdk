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
 * {@link QueryShareTaskDeviceListRequest} extends {@link RequestModel}
 *
 * <p>QueryShareTaskDeviceListRequest</p>
 */
public class QueryShareTaskDeviceListRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeviceName")
    private String deviceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageId")
    private Integer pageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShareTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String shareTaskId;

    private QueryShareTaskDeviceListRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.iotInstanceId = builder.iotInstanceId;
        this.pageId = builder.pageId;
        this.pageSize = builder.pageSize;
        this.shareTaskId = builder.shareTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryShareTaskDeviceListRequest create() {
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
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return pageId
     */
    public Integer getPageId() {
        return this.pageId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return shareTaskId
     */
    public String getShareTaskId() {
        return this.shareTaskId;
    }

    public static final class Builder extends Request.Builder<QueryShareTaskDeviceListRequest, Builder> {
        private String deviceName; 
        private String iotInstanceId; 
        private Integer pageId; 
        private Integer pageSize; 
        private String shareTaskId; 

        private Builder() {
            super();
        } 

        private Builder(QueryShareTaskDeviceListRequest request) {
            super(request);
            this.deviceName = request.deviceName;
            this.iotInstanceId = request.iotInstanceId;
            this.pageId = request.pageId;
            this.pageSize = request.pageSize;
            this.shareTaskId = request.shareTaskId;
        } 

        /**
         * <p>The keyword in the DeviceName of the device that you want to query. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder deviceName(String deviceName) {
            this.putBodyParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * <p>The instance ID. You can view the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <p> If your instance has an ID, you must specify this parameter. Otherwise, the request fails. If no Overview page exists or no instance ID is displayed, you do not need to specify this parameter.</p>
         * </blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a> of IoT instances.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-e3***</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putBodyParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The page number. Valid values: 1 to 10000.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageId(Integer pageId) {
            this.putBodyParameter("PageId", pageId);
            this.pageId = pageId;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 50. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the sharing task.</p>
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
        public QueryShareTaskDeviceListRequest build() {
            return new QueryShareTaskDeviceListRequest(this);
        } 

    } 

}
