// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEventsRequest} extends {@link RequestModel}
 *
 * <p>DescribeEventsRequest</p>
 */
public class DescribeEventsRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("DealUserId")
    private String dealUserId;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("Id")
    private Long id;

    @Query
    @NameInMap("InstanceName")
    private String instanceName;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ProductCode")
    private String productCode;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("SubTypeCode")
    private String subTypeCode;

    @Query
    @NameInMap("TargetProductCode")
    private String targetProductCode;

    @Query
    @NameInMap("TypeCode")
    private String typeCode;

    @Query
    @NameInMap("UserId")
    private Long userId;

    @Query
    @NameInMap("UserName")
    private String userName;

    @Query
    @NameInMap("WarnLevel")
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
         * The page number of the page to return.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The ID of the account that handles the anomalous event.
         */
        public Builder dealUserId(String dealUserId) {
            this.putQueryParameter("DealUserId", dealUserId);
            this.dealUserId = dealUserId;
            return this;
        }

        /**
         * The end of the time range during which the anomalous events are detected. The value is a UNIX timestamp. Unit: milliseconds.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The unique ID of the anomalous event.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The name of the data asset.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh_cn**. Valid values:
         * <p>
         * 
         * *   **zh_cn**: Chinese
         * *   **en_us**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The number of entries to return on each page.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The name of the service to which the table belongs. Valid values include **MaxCompute, OSS, ADS, OTS, and RDS**.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * The beginning of the time range during which the anomalous events are detected. The value is a UNIX timestamp. Unit: milliseconds.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The handling status of the anomalous event. Valid values:
         * <p>
         * 
         * *   0: unhandled
         * *   1: confirmed
         * *   2: marked as false positive
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The name of the anomalous event subtype.
         * <p>
         * 
         * > You can call the **DescribeEventTypes** operation to query the name of the anomalous event subtype.
         */
        public Builder subTypeCode(String subTypeCode) {
            this.putQueryParameter("SubTypeCode", subTypeCode);
            this.subTypeCode = subTypeCode;
            return this;
        }

        /**
         * The name of the destination service in an anomalous data flow. Valid values include **MaxCompute, OSS, ADS, OTS, and RDS**
         */
        public Builder targetProductCode(String targetProductCode) {
            this.putQueryParameter("TargetProductCode", targetProductCode);
            this.targetProductCode = targetProductCode;
            return this;
        }

        /**
         * The name of the anomalous event type. Valid values:
         * <p>
         * 
         * *   01: anomalous permission usage
         * *   02: anomalous data flow
         * *   03: anomalous data operation
         */
        public Builder typeCode(String typeCode) {
            this.putQueryParameter("TypeCode", typeCode);
            this.typeCode = typeCode;
            return this;
        }

        /**
         * The ID of the account that triggered the anomalous event.
         */
        public Builder userId(Long userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * The username of the RAM user.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * The risk level of the alert that is triggered. Valid values:
         * <p>
         * 
         * *   **1**: low
         * *   **2**: medium
         * *   **3**: high
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
