// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.brain_industrial20200920.models;

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
 * {@link ListLicensesResponseBody} extends {@link TeaModel}
 *
 * <p>ListLicensesResponseBody</p>
 */
public class ListLicensesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("LicenseList")
    private java.util.List<LicenseList> licenseList;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private String totalPage;

    @com.aliyun.core.annotation.NameInMap("TotalPageCount")
    private String totalPageCount;

    private ListLicensesResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.currentPage = builder.currentPage;
        this.httpStatusCode = builder.httpStatusCode;
        this.licenseList = builder.licenseList;
        this.message = builder.message;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
        this.totalPage = builder.totalPage;
        this.totalPageCount = builder.totalPageCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLicensesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return licenseList
     */
    public java.util.List<LicenseList> getLicenseList() {
        return this.licenseList;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return totalPage
     */
    public String getTotalPage() {
        return this.totalPage;
    }

    /**
     * @return totalPageCount
     */
    public String getTotalPageCount() {
        return this.totalPageCount;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Integer currentPage; 
        private Integer httpStatusCode; 
        private java.util.List<LicenseList> licenseList; 
        private String message; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 
        private String totalPage; 
        private String totalPageCount; 

        private Builder() {
        } 

        private Builder(ListLicensesResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.currentPage = model.currentPage;
            this.httpStatusCode = model.httpStatusCode;
            this.licenseList = model.licenseList;
            this.message = model.message;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
            this.totalPage = model.totalPage;
            this.totalPageCount = model.totalPageCount;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * LicenseList.
         */
        public Builder licenseList(java.util.List<LicenseList> licenseList) {
            this.licenseList = licenseList;
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

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * TotalPage.
         */
        public Builder totalPage(String totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        /**
         * TotalPageCount.
         */
        public Builder totalPageCount(String totalPageCount) {
            this.totalPageCount = totalPageCount;
            return this;
        }

        public ListLicensesResponseBody build() {
            return new ListLicensesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListLicensesResponseBody} extends {@link TeaModel}
     *
     * <p>ListLicensesResponseBody</p>
     */
    public static class LicenseList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivateTime")
        private String activateTime;

        @com.aliyun.core.annotation.NameInMap("AdaptiveMachine")
        private Integer adaptiveMachine;

        @com.aliyun.core.annotation.NameInMap("AllDuration")
        private String allDuration;

        @com.aliyun.core.annotation.NameInMap("BuyTime")
        private String buyTime;

        @com.aliyun.core.annotation.NameInMap("CpuLimit")
        private Integer cpuLimit;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("EffectTime")
        private String effectTime;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("LicenseSpecCode")
        private String licenseSpecCode;

        @com.aliyun.core.annotation.NameInMap("LicenseSpecName")
        private String licenseSpecName;

        @com.aliyun.core.annotation.NameInMap("LicenseSpecType")
        private String licenseSpecType;

        @com.aliyun.core.annotation.NameInMap("MemoryLimit")
        private Integer memoryLimit;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UnActivateAllDuration")
        private String unActivateAllDuration;

        private LicenseList(Builder builder) {
            this.activateTime = builder.activateTime;
            this.adaptiveMachine = builder.adaptiveMachine;
            this.allDuration = builder.allDuration;
            this.buyTime = builder.buyTime;
            this.cpuLimit = builder.cpuLimit;
            this.description = builder.description;
            this.duration = builder.duration;
            this.effectTime = builder.effectTime;
            this.expireTime = builder.expireTime;
            this.id = builder.id;
            this.instanceId = builder.instanceId;
            this.licenseSpecCode = builder.licenseSpecCode;
            this.licenseSpecName = builder.licenseSpecName;
            this.licenseSpecType = builder.licenseSpecType;
            this.memoryLimit = builder.memoryLimit;
            this.status = builder.status;
            this.unActivateAllDuration = builder.unActivateAllDuration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LicenseList create() {
            return builder().build();
        }

        /**
         * @return activateTime
         */
        public String getActivateTime() {
            return this.activateTime;
        }

        /**
         * @return adaptiveMachine
         */
        public Integer getAdaptiveMachine() {
            return this.adaptiveMachine;
        }

        /**
         * @return allDuration
         */
        public String getAllDuration() {
            return this.allDuration;
        }

        /**
         * @return buyTime
         */
        public String getBuyTime() {
            return this.buyTime;
        }

        /**
         * @return cpuLimit
         */
        public Integer getCpuLimit() {
            return this.cpuLimit;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return effectTime
         */
        public String getEffectTime() {
            return this.effectTime;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return licenseSpecCode
         */
        public String getLicenseSpecCode() {
            return this.licenseSpecCode;
        }

        /**
         * @return licenseSpecName
         */
        public String getLicenseSpecName() {
            return this.licenseSpecName;
        }

        /**
         * @return licenseSpecType
         */
        public String getLicenseSpecType() {
            return this.licenseSpecType;
        }

        /**
         * @return memoryLimit
         */
        public Integer getMemoryLimit() {
            return this.memoryLimit;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return unActivateAllDuration
         */
        public String getUnActivateAllDuration() {
            return this.unActivateAllDuration;
        }

        public static final class Builder {
            private String activateTime; 
            private Integer adaptiveMachine; 
            private String allDuration; 
            private String buyTime; 
            private Integer cpuLimit; 
            private String description; 
            private String duration; 
            private String effectTime; 
            private String expireTime; 
            private String id; 
            private String instanceId; 
            private String licenseSpecCode; 
            private String licenseSpecName; 
            private String licenseSpecType; 
            private Integer memoryLimit; 
            private String status; 
            private String unActivateAllDuration; 

            private Builder() {
            } 

            private Builder(LicenseList model) {
                this.activateTime = model.activateTime;
                this.adaptiveMachine = model.adaptiveMachine;
                this.allDuration = model.allDuration;
                this.buyTime = model.buyTime;
                this.cpuLimit = model.cpuLimit;
                this.description = model.description;
                this.duration = model.duration;
                this.effectTime = model.effectTime;
                this.expireTime = model.expireTime;
                this.id = model.id;
                this.instanceId = model.instanceId;
                this.licenseSpecCode = model.licenseSpecCode;
                this.licenseSpecName = model.licenseSpecName;
                this.licenseSpecType = model.licenseSpecType;
                this.memoryLimit = model.memoryLimit;
                this.status = model.status;
                this.unActivateAllDuration = model.unActivateAllDuration;
            } 

            /**
             * ActivateTime.
             */
            public Builder activateTime(String activateTime) {
                this.activateTime = activateTime;
                return this;
            }

            /**
             * AdaptiveMachine.
             */
            public Builder adaptiveMachine(Integer adaptiveMachine) {
                this.adaptiveMachine = adaptiveMachine;
                return this;
            }

            /**
             * AllDuration.
             */
            public Builder allDuration(String allDuration) {
                this.allDuration = allDuration;
                return this;
            }

            /**
             * BuyTime.
             */
            public Builder buyTime(String buyTime) {
                this.buyTime = buyTime;
                return this;
            }

            /**
             * CpuLimit.
             */
            public Builder cpuLimit(Integer cpuLimit) {
                this.cpuLimit = cpuLimit;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * EffectTime.
             */
            public Builder effectTime(String effectTime) {
                this.effectTime = effectTime;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * LicenseSpecCode.
             */
            public Builder licenseSpecCode(String licenseSpecCode) {
                this.licenseSpecCode = licenseSpecCode;
                return this;
            }

            /**
             * LicenseSpecName.
             */
            public Builder licenseSpecName(String licenseSpecName) {
                this.licenseSpecName = licenseSpecName;
                return this;
            }

            /**
             * LicenseSpecType.
             */
            public Builder licenseSpecType(String licenseSpecType) {
                this.licenseSpecType = licenseSpecType;
                return this;
            }

            /**
             * MemoryLimit.
             */
            public Builder memoryLimit(Integer memoryLimit) {
                this.memoryLimit = memoryLimit;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UnActivateAllDuration.
             */
            public Builder unActivateAllDuration(String unActivateAllDuration) {
                this.unActivateAllDuration = unActivateAllDuration;
                return this;
            }

            public LicenseList build() {
                return new LicenseList(this);
            } 

        } 

    }
}
