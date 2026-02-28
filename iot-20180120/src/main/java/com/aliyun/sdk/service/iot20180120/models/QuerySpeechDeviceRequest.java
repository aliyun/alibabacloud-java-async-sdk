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
 * {@link QuerySpeechDeviceRequest} extends {@link RequestModel}
 *
 * <p>QuerySpeechDeviceRequest</p>
 */
public class QuerySpeechDeviceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AvailableSpace")
    private String availableSpace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AvailableSpaceScope")
    private String availableSpaceScope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeviceName")
    private String deviceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageId")
    @com.aliyun.core.annotation.Validation(maximum = 10000, minimum = 1)
    private Integer pageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 50, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectCode;

    private QuerySpeechDeviceRequest(Builder builder) {
        super(builder);
        this.availableSpace = builder.availableSpace;
        this.availableSpaceScope = builder.availableSpaceScope;
        this.deviceName = builder.deviceName;
        this.iotInstanceId = builder.iotInstanceId;
        this.pageId = builder.pageId;
        this.pageSize = builder.pageSize;
        this.projectCode = builder.projectCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySpeechDeviceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return availableSpace
     */
    public String getAvailableSpace() {
        return this.availableSpace;
    }

    /**
     * @return availableSpaceScope
     */
    public String getAvailableSpaceScope() {
        return this.availableSpaceScope;
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
     * @return projectCode
     */
    public String getProjectCode() {
        return this.projectCode;
    }

    public static final class Builder extends Request.Builder<QuerySpeechDeviceRequest, Builder> {
        private String availableSpace; 
        private String availableSpaceScope; 
        private String deviceName; 
        private String iotInstanceId; 
        private Integer pageId; 
        private Integer pageSize; 
        private String projectCode; 

        private Builder() {
            super();
        } 

        private Builder(QuerySpeechDeviceRequest request) {
            super(request);
            this.availableSpace = request.availableSpace;
            this.availableSpaceScope = request.availableSpaceScope;
            this.deviceName = request.deviceName;
            this.iotInstanceId = request.iotInstanceId;
            this.pageId = request.pageId;
            this.pageSize = request.pageSize;
            this.projectCode = request.projectCode;
        } 

        /**
         * AvailableSpace.
         */
        public Builder availableSpace(String availableSpace) {
            this.putBodyParameter("AvailableSpace", availableSpace);
            this.availableSpace = availableSpace;
            return this;
        }

        /**
         * AvailableSpaceScope.
         */
        public Builder availableSpaceScope(String availableSpaceScope) {
            this.putBodyParameter("AvailableSpaceScope", availableSpaceScope);
            this.availableSpaceScope = availableSpaceScope;
            return this;
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
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putBodyParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * PageId.
         */
        public Builder pageId(Integer pageId) {
            this.putBodyParameter("PageId", pageId);
            this.pageId = pageId;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4de2c367**<strong>8c585e5992</strong></p>
         */
        public Builder projectCode(String projectCode) {
            this.putBodyParameter("ProjectCode", projectCode);
            this.projectCode = projectCode;
            return this;
        }

        @Override
        public QuerySpeechDeviceRequest build() {
            return new QuerySpeechDeviceRequest(this);
        } 

    } 

}
