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
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * DealUserId.
         */
        public Builder dealUserId(String dealUserId) {
            this.putQueryParameter("DealUserId", dealUserId);
            this.dealUserId = dealUserId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * SubTypeCode.
         */
        public Builder subTypeCode(String subTypeCode) {
            this.putQueryParameter("SubTypeCode", subTypeCode);
            this.subTypeCode = subTypeCode;
            return this;
        }

        /**
         * TargetProductCode.
         */
        public Builder targetProductCode(String targetProductCode) {
            this.putQueryParameter("TargetProductCode", targetProductCode);
            this.targetProductCode = targetProductCode;
            return this;
        }

        /**
         * TypeCode.
         */
        public Builder typeCode(String typeCode) {
            this.putQueryParameter("TypeCode", typeCode);
            this.typeCode = typeCode;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(Long userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public DescribeEventsRequest build() {
            return new DescribeEventsRequest(this);
        } 

    } 

}
