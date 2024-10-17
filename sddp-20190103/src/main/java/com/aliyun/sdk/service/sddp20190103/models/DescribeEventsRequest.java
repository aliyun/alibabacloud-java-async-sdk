// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeEventsRequest} extends {@link RequestModel}
 *
 * <p>DescribeEventsRequest</p>
 */
public class DescribeEventsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DealUserId")
    private String dealUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubTypeCode")
    private String subTypeCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetProductCode")
    private String targetProductCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TypeCode")
    private String typeCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private Long userId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WarnLevel")
    private Integer warnLevel;

    private DescribeEventsRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.dealUserId = builder.dealUserId;
        this.endTime = builder.endTime;
        this.id = builder.id;
        this.instanceName = builder.instanceName;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.productCode = builder.productCode;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.subTypeCode = builder.subTypeCode;
        this.targetProductCode = builder.targetProductCode;
        this.typeCode = builder.typeCode;
        this.userId = builder.userId;
        this.userName = builder.userName;
        this.warnLevel = builder.warnLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEventsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return dealUserId
     */
    public String getDealUserId() {
        return this.dealUserId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return subTypeCode
     */
    public String getSubTypeCode() {
        return this.subTypeCode;
    }

    /**
     * @return targetProductCode
     */
    public String getTargetProductCode() {
        return this.targetProductCode;
    }

    /**
     * @return typeCode
     */
    public String getTypeCode() {
        return this.typeCode;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return warnLevel
     */
    public Integer getWarnLevel() {
        return this.warnLevel;
    }

    public static final class Builder extends Request.Builder<DescribeEventsRequest, Builder> {
        private Integer currentPage; 
        private String dealUserId; 
        private String endTime; 
        private Long id; 
        private String instanceName; 
        private String lang; 
        private Integer pageSize; 
        private String productCode; 
        private String startTime; 
        private String status; 
        private String subTypeCode; 
        private String targetProductCode; 
        private String typeCode; 
        private Long userId; 
        private String userName; 
        private Integer warnLevel; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEventsRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.dealUserId = request.dealUserId;
            this.endTime = request.endTime;
            this.id = request.id;
            this.instanceName = request.instanceName;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.productCode = request.productCode;
            this.startTime = request.startTime;
            this.status = request.status;
            this.subTypeCode = request.subTypeCode;
            this.targetProductCode = request.targetProductCode;
            this.typeCode = request.typeCode;
            this.userId = request.userId;
            this.userName = request.userName;
            this.warnLevel = request.warnLevel;
        } 

        /**
         * <p>The page number of the page to return.</p>
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
         * <p>The ID of the account that handles the anomalous event.</p>
         * 
         * <strong>example:</strong>
         * <p>yundun-***</p>
         */
        public Builder dealUserId(String dealUserId) {
            this.putQueryParameter("DealUserId", dealUserId);
            this.dealUserId = dealUserId;
            return this;
        }

        /**
         * <p>The end of the time range during which the anomalous events are detected. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1698700000</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The unique ID of the anomalous event.</p>
         * 
         * <strong>example:</strong>
         * <p>789026</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The name of the data asset.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6yzvbc2tg90iuxk.l****</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh_cn</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh_cn</strong>: Chinese</li>
         * <li><strong>en_us</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh_cn</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The name of the service to which the table belongs. Valid values include <strong>MaxCompute, OSS, ADS, OTS, and RDS</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>The beginning of the time range during which the anomalous events are detected. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1657900000</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The handling status of the anomalous event. Valid values:</p>
         * <ul>
         * <li>0: unhandled</li>
         * <li>1: confirmed</li>
         * <li>2: marked as false positive</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The name of the anomalous event subtype.</p>
         * <blockquote>
         * <p>You can call the <strong>DescribeEventTypes</strong> operation to query the name of the anomalous event subtype.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Anomalous volume of downloaded data</p>
         */
        public Builder subTypeCode(String subTypeCode) {
            this.putQueryParameter("SubTypeCode", subTypeCode);
            this.subTypeCode = subTypeCode;
            return this;
        }

        /**
         * <p>The name of the destination service in an anomalous data flow. Valid values include <strong>MaxCompute, OSS, ADS, OTS, and RDS</strong></p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        public Builder targetProductCode(String targetProductCode) {
            this.putQueryParameter("TargetProductCode", targetProductCode);
            this.targetProductCode = targetProductCode;
            return this;
        }

        /**
         * <p>The name of the anomalous event type. Valid values:</p>
         * <ul>
         * <li>01: anomalous permission usage</li>
         * <li>02: anomalous data flow</li>
         * <li>03: anomalous data operation</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>02</p>
         */
        public Builder typeCode(String typeCode) {
            this.putQueryParameter("TypeCode", typeCode);
            this.typeCode = typeCode;
            return this;
        }

        /**
         * <p>The ID of the account that triggered the anomalous event.</p>
         * 
         * <strong>example:</strong>
         * <p>1978132506596***</p>
         */
        public Builder userId(Long userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * <p>The username of the RAM user.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * <p>The risk level of the alert that is triggered. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: low</li>
         * <li><strong>2</strong>: medium</li>
         * <li><strong>3</strong>: high</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder warnLevel(Integer warnLevel) {
            this.putQueryParameter("WarnLevel", warnLevel);
            this.warnLevel = warnLevel;
            return this;
        }

        @Override
        public DescribeEventsRequest build() {
            return new DescribeEventsRequest(this);
        } 

    } 

}
