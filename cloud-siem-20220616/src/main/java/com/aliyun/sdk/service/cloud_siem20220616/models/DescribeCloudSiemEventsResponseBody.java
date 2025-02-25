// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCloudSiemEventsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudSiemEventsResponseBody</p>
 */
public class DescribeCloudSiemEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeCloudSiemEventsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudSiemEventsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeCloudSiemEventsResponseBody build() {
            return new DescribeCloudSiemEventsResponseBody(this);
        } 

    } 

    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private PageInfo(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer currentPage; 
            private Integer pageSize; 
            private Long totalCount; 

            /**
             * The current page number.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of entries per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
    public static class ResponseData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertNum")
        private Integer alertNum;

        @com.aliyun.core.annotation.NameInMap("Aliuid")
        private Long aliuid;

        @com.aliyun.core.annotation.NameInMap("AssetNum")
        private Integer assetNum;

        @com.aliyun.core.annotation.NameInMap("AttCkLabels")
        private java.util.List < String > attCkLabels;

        @com.aliyun.core.annotation.NameInMap("DataSources")
        private java.util.List < String > dataSources;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DescriptionEn")
        private String descriptionEn;

        @com.aliyun.core.annotation.NameInMap("ExtContent")
        private String extContent;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("IncidentName")
        private String incidentName;

        @com.aliyun.core.annotation.NameInMap("IncidentNameEn")
        private String incidentNameEn;

        @com.aliyun.core.annotation.NameInMap("IncidentUuid")
        private String incidentUuid;

        @com.aliyun.core.annotation.NameInMap("ReferAccount")
        private String referAccount;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("ThreatLevel")
        private String threatLevel;

        @com.aliyun.core.annotation.NameInMap("ThreatScore")
        private Float threatScore;

        private ResponseData(Builder builder) {
            this.alertNum = builder.alertNum;
            this.aliuid = builder.aliuid;
            this.assetNum = builder.assetNum;
            this.attCkLabels = builder.attCkLabels;
            this.dataSources = builder.dataSources;
            this.description = builder.description;
            this.descriptionEn = builder.descriptionEn;
            this.extContent = builder.extContent;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.incidentName = builder.incidentName;
            this.incidentNameEn = builder.incidentNameEn;
            this.incidentUuid = builder.incidentUuid;
            this.referAccount = builder.referAccount;
            this.remark = builder.remark;
            this.status = builder.status;
            this.threatLevel = builder.threatLevel;
            this.threatScore = builder.threatScore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResponseData create() {
            return builder().build();
        }

        /**
         * @return alertNum
         */
        public Integer getAlertNum() {
            return this.alertNum;
        }

        /**
         * @return aliuid
         */
        public Long getAliuid() {
            return this.aliuid;
        }

        /**
         * @return assetNum
         */
        public Integer getAssetNum() {
            return this.assetNum;
        }

        /**
         * @return attCkLabels
         */
        public java.util.List < String > getAttCkLabels() {
            return this.attCkLabels;
        }

        /**
         * @return dataSources
         */
        public java.util.List < String > getDataSources() {
            return this.dataSources;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return descriptionEn
         */
        public String getDescriptionEn() {
            return this.descriptionEn;
        }

        /**
         * @return extContent
         */
        public String getExtContent() {
            return this.extContent;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return incidentName
         */
        public String getIncidentName() {
            return this.incidentName;
        }

        /**
         * @return incidentNameEn
         */
        public String getIncidentNameEn() {
            return this.incidentNameEn;
        }

        /**
         * @return incidentUuid
         */
        public String getIncidentUuid() {
            return this.incidentUuid;
        }

        /**
         * @return referAccount
         */
        public String getReferAccount() {
            return this.referAccount;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return threatLevel
         */
        public String getThreatLevel() {
            return this.threatLevel;
        }

        /**
         * @return threatScore
         */
        public Float getThreatScore() {
            return this.threatScore;
        }

        public static final class Builder {
            private Integer alertNum; 
            private Long aliuid; 
            private Integer assetNum; 
            private java.util.List < String > attCkLabels; 
            private java.util.List < String > dataSources; 
            private String description; 
            private String descriptionEn; 
            private String extContent; 
            private String gmtCreate; 
            private String gmtModified; 
            private String incidentName; 
            private String incidentNameEn; 
            private String incidentUuid; 
            private String referAccount; 
            private String remark; 
            private Integer status; 
            private String threatLevel; 
            private Float threatScore; 

            /**
             * The number of alerts that are associated with the event.
             */
            public Builder alertNum(Integer alertNum) {
                this.alertNum = alertNum;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account to which the event belongs.
             */
            public Builder aliuid(Long aliuid) {
                this.aliuid = aliuid;
                return this;
            }

            /**
             * The number of assets that are associated with the event.
             */
            public Builder assetNum(Integer assetNum) {
                this.assetNum = assetNum;
                return this;
            }

            /**
             * The tags of the ATT\&CK techniques.
             */
            public Builder attCkLabels(java.util.List < String > attCkLabels) {
                this.attCkLabels = attCkLabels;
                return this;
            }

            /**
             * The sources of the alert.
             */
            public Builder dataSources(java.util.List < String > dataSources) {
                this.dataSources = dataSources;
                return this;
            }

            /**
             * The description of the event.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The event description in English.
             */
            public Builder descriptionEn(String descriptionEn) {
                this.descriptionEn = descriptionEn;
                return this;
            }

            /**
             * The extended event information in the JSON format.
             */
            public Builder extContent(String extContent) {
                this.extContent = extContent;
                return this;
            }

            /**
             * The time when the event occurred.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The time when the event was last updated.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The name of the event.
             */
            public Builder incidentName(String incidentName) {
                this.incidentName = incidentName;
                return this;
            }

            /**
             * The event name in English.
             */
            public Builder incidentNameEn(String incidentNameEn) {
                this.incidentNameEn = incidentNameEn;
                return this;
            }

            /**
             * The UUID of the event.
             */
            public Builder incidentUuid(String incidentUuid) {
                this.incidentUuid = incidentUuid;
                return this;
            }

            /**
             * the refer account info.
             */
            public Builder referAccount(String referAccount) {
                this.referAccount = referAccount;
                return this;
            }

            /**
             * The remarks of the event.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * The status of the event. Valid values:
             * <p>
             * 
             * *   0: unhandled.
             * *   1: handling.
             * *   5: handling failed.
             * *   10: handled.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The risk level. Valid values:
             * <p>
             * 
             * *   serious: high.
             * *   suspicious: medium.
             * *   remind: low.
             */
            public Builder threatLevel(String threatLevel) {
                this.threatLevel = threatLevel;
                return this;
            }

            /**
             * The risk score of the event. Valid values: 0 to 100. A higher value indicates a higher risk level.
             */
            public Builder threatScore(Float threatScore) {
                this.threatScore = threatScore;
                return this;
            }

            public ResponseData build() {
                return new ResponseData(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageInfo")
        private PageInfo pageInfo;

        @com.aliyun.core.annotation.NameInMap("ResponseData")
        private java.util.List < ResponseData> responseData;

        private Data(Builder builder) {
            this.pageInfo = builder.pageInfo;
            this.responseData = builder.responseData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageInfo
         */
        public PageInfo getPageInfo() {
            return this.pageInfo;
        }

        /**
         * @return responseData
         */
        public java.util.List < ResponseData> getResponseData() {
            return this.responseData;
        }

        public static final class Builder {
            private PageInfo pageInfo; 
            private java.util.List < ResponseData> responseData; 

            /**
             * The pagination information.
             */
            public Builder pageInfo(PageInfo pageInfo) {
                this.pageInfo = pageInfo;
                return this;
            }

            /**
             * The detailed data.
             */
            public Builder responseData(java.util.List < ResponseData> responseData) {
                this.responseData = responseData;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
