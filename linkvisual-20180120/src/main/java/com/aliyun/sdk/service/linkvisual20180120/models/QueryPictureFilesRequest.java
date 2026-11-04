// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

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
 * {@link QueryPictureFilesRequest} extends {@link RequestModel}
 *
 * <p>QueryPictureFilesRequest</p>
 */
public class QueryPictureFilesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long beginTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceName")
    private String deviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotId")
    private String iotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PictureSource")
    private Integer pictureSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PictureType")
    private Integer pictureType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    private String productKey;

    private QueryPictureFilesRequest(Builder builder) {
        super(builder);
        this.beginTime = builder.beginTime;
        this.currentPage = builder.currentPage;
        this.deviceName = builder.deviceName;
        this.endTime = builder.endTime;
        this.iotId = builder.iotId;
        this.iotInstanceId = builder.iotInstanceId;
        this.pageSize = builder.pageSize;
        this.pictureSource = builder.pictureSource;
        this.pictureType = builder.pictureType;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryPictureFilesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beginTime
     */
    public Long getBeginTime() {
        return this.beginTime;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return deviceName
     */
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
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
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pictureSource
     */
    public Integer getPictureSource() {
        return this.pictureSource;
    }

    /**
     * @return pictureType
     */
    public Integer getPictureType() {
        return this.pictureType;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    public static final class Builder extends Request.Builder<QueryPictureFilesRequest, Builder> {
        private Long beginTime; 
        private Integer currentPage; 
        private String deviceName; 
        private Long endTime; 
        private String iotId; 
        private String iotInstanceId; 
        private Integer pageSize; 
        private Integer pictureSource; 
        private Integer pictureType; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(QueryPictureFilesRequest request) {
            super(request);
            this.beginTime = request.beginTime;
            this.currentPage = request.currentPage;
            this.deviceName = request.deviceName;
            this.endTime = request.endTime;
            this.iotId = request.iotId;
            this.iotInstanceId = request.iotInstanceId;
            this.pageSize = request.pageSize;
            this.pictureSource = request.pictureSource;
            this.pictureType = request.pictureType;
            this.productKey = request.productKey;
        } 

        /**
         * <p>The start time of the retrieval range. The time is a 13-digit timestamp in milliseconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1615357669000</p>
         */
        public Builder beginTime(Long beginTime) {
            this.putQueryParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * <p>The page number of the returned page. Pages start from 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The DeviceName of the IP camera.
         * You can view the <strong>DeviceName</strong> on the <strong>Devices</strong> page of the IoT Platform console.</p>
         * <blockquote>
         * <p>Notice:  If you specify this parameter, you must also specify <strong>ProductKey</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>camera1</p>
         */
        public Builder deviceName(String deviceName) {
            this.putQueryParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * <p>The end time of the retrieval range. The time is a 13-digit timestamp in milliseconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1615444063000</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The ID of the IP camera. The ID is issued by IoT Platform and is the unique identifier of the device. You can call the <a href="https://help.aliyun.com/document_detail/69594.html">QueryDeviceDetail</a> operation of IoT Platform to query the ID.</p>
         * <blockquote>
         * <p>Notice:  If you specify this parameter, you do not need to specify <strong>ProductKey</strong> or <strong>DeviceName</strong>. The <strong>IotId</strong> is the unique identifier of the device and corresponds to the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>. If you specify both <strong>IotId</strong> and the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>, <strong>IotId</strong> takes precedence.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>zLZyi6aOLyOSHa9hsPyD00****</p>
         */
        public Builder iotId(String iotId) {
            this.putQueryParameter("IotId", iotId);
            this.iotId = iotId;
            return this;
        }

        /**
         * <p>Instance ID of the instance. You can view the <strong>ID</strong> of the current instance on the <strong>Instance Overview</strong> page of the IoT Platform console.</p>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <ul>
         * <li>If the instance has an ID, you must specify instance ID. Otherwise, the call fails.</li>
         * <li>If the instance does not have an &lt;props=&quot;intl&quot;&gt;<ph><strong>Instance Overview</strong> page or </ph>ID, you do not need to specify this parameter.</li>
         * </ul>
         * <p>For more information about instances, see <a href="https://help.aliyun.com/document_detail/356505.html">Instance overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-cn-n6w1y****</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: 10. Maximum value: 50.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The source of the image. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: all events. This is the default value.</li>
         * <li><strong>1</strong>: snapshot captured during an alert event.</li>
         * <li><strong>2</strong>: manual snapshot.</li>
         * <li><strong>3</strong>: other sources.</li>
         * <li><strong>4</strong>: cloud snapshot.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder pictureSource(Integer pictureSource) {
            this.putQueryParameter("PictureSource", pictureSource);
            this.pictureSource = pictureSource;
            return this;
        }

        /**
         * <p>The type of the image. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: thumbnail. </li>
         * <li><strong>1</strong>: original image.</li>
         * <li><strong>2</strong>: all images. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pictureType(Integer pictureType) {
            this.putQueryParameter("PictureType", pictureType);
            this.pictureType = pictureType;
            return this;
        }

        /**
         * <p>The ProductKey of the product to which the IP camera belongs.
         * You can view the ProductKey on the <strong>Products</strong> page of the IoT Platform console or call the <a href="https://help.aliyun.com/document_detail/69271.html">QueryProductList</a> operation to query the information about all products under the current account.</p>
         * <blockquote>
         * <p>Notice:  If you specify this parameter, you must also specify <strong>DeviceName</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>a1BwAGV****</p>
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        @Override
        public QueryPictureFilesRequest build() {
            return new QueryPictureFilesRequest(this);
        } 

    } 

}
