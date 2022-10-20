// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBusinessSpacesResponseBody} extends {@link TeaModel}
 *
 * <p>ListBusinessSpacesResponseBody</p>
 */
public class ListBusinessSpacesResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListBusinessSpacesResponseBody(Builder builder) {
        this.code = builder.code;
        this.currentPage = builder.currentPage;
        this.data = builder.data;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBusinessSpacesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer currentPage; 
        private java.util.List < Data> data; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListBusinessSpacesResponseBody build() {
            return new ListBusinessSpacesResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AliUid")
        private Long aliUid;

        @NameInMap("BusinessSpaceCode")
        private String businessSpaceCode;

        @NameInMap("BusinessSpaceName")
        private String businessSpaceName;

        @NameInMap("CurrentStatus")
        private Integer currentStatus;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Language")
        private String language;

        @NameInMap("LoginUserType")
        private Integer loginUserType;

        @NameInMap("OrderInstanceId")
        private String orderInstanceId;

        @NameInMap("ProductType")
        private String productType;

        @NameInMap("RoleName")
        private String roleName;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("SubAliUid")
        private Long subAliUid;

        @NameInMap("XspaceCommodityCode")
        private String xspaceCommodityCode;

        @NameInMap("XspaceProductCode")
        private String xspaceProductCode;

        private Data(Builder builder) {
            this.aliUid = builder.aliUid;
            this.businessSpaceCode = builder.businessSpaceCode;
            this.businessSpaceName = builder.businessSpaceName;
            this.currentStatus = builder.currentStatus;
            this.endTime = builder.endTime;
            this.id = builder.id;
            this.language = builder.language;
            this.loginUserType = builder.loginUserType;
            this.orderInstanceId = builder.orderInstanceId;
            this.productType = builder.productType;
            this.roleName = builder.roleName;
            this.startTime = builder.startTime;
            this.subAliUid = builder.subAliUid;
            this.xspaceCommodityCode = builder.xspaceCommodityCode;
            this.xspaceProductCode = builder.xspaceProductCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return businessSpaceCode
         */
        public String getBusinessSpaceCode() {
            return this.businessSpaceCode;
        }

        /**
         * @return businessSpaceName
         */
        public String getBusinessSpaceName() {
            return this.businessSpaceName;
        }

        /**
         * @return currentStatus
         */
        public Integer getCurrentStatus() {
            return this.currentStatus;
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
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return loginUserType
         */
        public Integer getLoginUserType() {
            return this.loginUserType;
        }

        /**
         * @return orderInstanceId
         */
        public String getOrderInstanceId() {
            return this.orderInstanceId;
        }

        /**
         * @return productType
         */
        public String getProductType() {
            return this.productType;
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return subAliUid
         */
        public Long getSubAliUid() {
            return this.subAliUid;
        }

        /**
         * @return xspaceCommodityCode
         */
        public String getXspaceCommodityCode() {
            return this.xspaceCommodityCode;
        }

        /**
         * @return xspaceProductCode
         */
        public String getXspaceProductCode() {
            return this.xspaceProductCode;
        }

        public static final class Builder {
            private Long aliUid; 
            private String businessSpaceCode; 
            private String businessSpaceName; 
            private Integer currentStatus; 
            private String endTime; 
            private Long id; 
            private String language; 
            private Integer loginUserType; 
            private String orderInstanceId; 
            private String productType; 
            private String roleName; 
            private String startTime; 
            private Long subAliUid; 
            private String xspaceCommodityCode; 
            private String xspaceProductCode; 

            /**
             * AliUid.
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * BusinessSpaceCode.
             */
            public Builder businessSpaceCode(String businessSpaceCode) {
                this.businessSpaceCode = businessSpaceCode;
                return this;
            }

            /**
             * BusinessSpaceName.
             */
            public Builder businessSpaceName(String businessSpaceName) {
                this.businessSpaceName = businessSpaceName;
                return this;
            }

            /**
             * CurrentStatus.
             */
            public Builder currentStatus(Integer currentStatus) {
                this.currentStatus = currentStatus;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Language.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * LoginUserType.
             */
            public Builder loginUserType(Integer loginUserType) {
                this.loginUserType = loginUserType;
                return this;
            }

            /**
             * OrderInstanceId.
             */
            public Builder orderInstanceId(String orderInstanceId) {
                this.orderInstanceId = orderInstanceId;
                return this;
            }

            /**
             * ProductType.
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * RoleName.
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * SubAliUid.
             */
            public Builder subAliUid(Long subAliUid) {
                this.subAliUid = subAliUid;
                return this;
            }

            /**
             * XspaceCommodityCode.
             */
            public Builder xspaceCommodityCode(String xspaceCommodityCode) {
                this.xspaceCommodityCode = xspaceCommodityCode;
                return this;
            }

            /**
             * XspaceProductCode.
             */
            public Builder xspaceProductCode(String xspaceProductCode) {
                this.xspaceProductCode = xspaceProductCode;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
