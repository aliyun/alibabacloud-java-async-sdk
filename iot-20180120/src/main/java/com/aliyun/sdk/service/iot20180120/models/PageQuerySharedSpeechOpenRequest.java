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
 * {@link PageQuerySharedSpeechOpenRequest} extends {@link RequestModel}
 *
 * <p>PageQuerySharedSpeechOpenRequest</p>
 */
public class PageQuerySharedSpeechOpenRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeviceName")
    private String deviceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IotId")
    private String iotId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageId")
    private Integer pageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    private String productKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShareTaskCode")
    private String shareTaskCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    private PageQuerySharedSpeechOpenRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.iotId = builder.iotId;
        this.iotInstanceId = builder.iotInstanceId;
        this.pageId = builder.pageId;
        this.pageSize = builder.pageSize;
        this.productKey = builder.productKey;
        this.shareTaskCode = builder.shareTaskCode;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PageQuerySharedSpeechOpenRequest create() {
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
     * @return iotId
     */
    public String getIotId() {
        return this.iotId;
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
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return shareTaskCode
     */
    public String getShareTaskCode() {
        return this.shareTaskCode;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<PageQuerySharedSpeechOpenRequest, Builder> {
        private String deviceName; 
        private String iotId; 
        private String iotInstanceId; 
        private Integer pageId; 
        private Integer pageSize; 
        private String productKey; 
        private String shareTaskCode; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(PageQuerySharedSpeechOpenRequest request) {
            super(request);
            this.deviceName = request.deviceName;
            this.iotId = request.iotId;
            this.iotInstanceId = request.iotInstanceId;
            this.pageId = request.pageId;
            this.pageSize = request.pageSize;
            this.productKey = request.productKey;
            this.shareTaskCode = request.shareTaskCode;
            this.status = request.status;
        } 

        /**
         * <p>The DeviceName of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>device1</p>
         */
        public Builder deviceName(String deviceName) {
            this.putBodyParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * <p>The ID of the device.</p>
         * <blockquote>
         * <p>If you specify this parameter, you do not need to specify <strong>ProductKey</strong> and <strong>DeviceName</strong>. <strong>IotId</strong> specifies the GUID of the device. The value of the IotId parameter is a combination of the values of the <strong>ProductKey</strong> and <strong>DeviceName</strong> parameters. If you specify the <strong>IotId</strong>, <strong>ProductKey</strong>, and <strong>DeviceName</strong> parameters, the value of the <strong>IotId</strong> parameter takes precedence.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Q7uOhVRdZRRlDnTLv****00100</p>
         */
        public Builder iotId(String iotId) {
            this.putBodyParameter("IotId", iotId);
            this.iotId = iotId;
            return this;
        }

        /**
         * <p>The instance ID. You can view the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <p> If your instance has an ID, you must specify this parameter. Otherwise, the request fails. If no Overview page exists or no instance ID is displayed, you do not need to specify this parameter.</p>
         * </blockquote>
         * <p>For more information, see the <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a> topic of IoT instances.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-2w****</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putBodyParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The page number.</p>
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
         * <p>The number of entries per page. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The <strong>ProductKey</strong> of the product to which the device belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>sd34****</p>
         */
        public Builder productKey(String productKey) {
            this.putBodyParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * <p>The code that is used to share the speeches.</p>
         * <p>You can obtain the <strong>code</strong> on the <strong>Shared Corpus Management</strong> page of <strong>Speech Sending Voice Broadcasting Service</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>ebed9280_ba25_48df_80c2_****</p>
         */
        public Builder shareTaskCode(String shareTaskCode) {
            this.putBodyParameter("ShareTaskCode", shareTaskCode);
            this.shareTaskCode = shareTaskCode;
            return this;
        }

        /**
         * <p>The status of the speeches that you want to query. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: The speeches are pending approval.</li>
         * <li><strong>2</strong>: The speeches are approved.</li>
         * <li><strong>3</strong>: The speeches are rejected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(Integer status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public PageQuerySharedSpeechOpenRequest build() {
            return new PageQuerySharedSpeechOpenRequest(this);
        } 

    } 

}
