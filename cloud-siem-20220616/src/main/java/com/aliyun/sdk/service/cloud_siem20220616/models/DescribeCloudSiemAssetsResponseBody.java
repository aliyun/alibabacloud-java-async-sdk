// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCloudSiemAssetsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudSiemAssetsResponseBody</p>
 */
public class DescribeCloudSiemAssetsResponseBody extends TeaModel {
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

    private DescribeCloudSiemAssetsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudSiemAssetsResponseBody create() {
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

        public DescribeCloudSiemAssetsResponseBody build() {
            return new DescribeCloudSiemAssetsResponseBody(this);
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
    public static class AssetInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("KeyName")
        private String keyName;

        @com.aliyun.core.annotation.NameInMap("Values")
        private String values;

        private AssetInfo(Builder builder) {
            this.key = builder.key;
            this.keyName = builder.keyName;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssetInfo create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return keyName
         */
        public String getKeyName() {
            return this.keyName;
        }

        /**
         * @return values
         */
        public String getValues() {
            return this.values;
        }

        public static final class Builder {
            private String key; 
            private String keyName; 
            private String values; 

            /**
             * The attribute key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The name of the key.
             */
            public Builder keyName(String keyName) {
                this.keyName = keyName;
                return this;
            }

            /**
             * The value of the key.
             */
            public Builder values(String values) {
                this.values = values;
                return this;
            }

            public AssetInfo build() {
                return new AssetInfo(this);
            } 

        } 

    }
    public static class ResponseData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertUuid")
        private String alertUuid;

        @com.aliyun.core.annotation.NameInMap("Aliuid")
        private Long aliuid;

        @com.aliyun.core.annotation.NameInMap("AssetId")
        private String assetId;

        @com.aliyun.core.annotation.NameInMap("AssetInfo")
        private java.util.List < AssetInfo> assetInfo;

        @com.aliyun.core.annotation.NameInMap("AssetName")
        private String assetName;

        @com.aliyun.core.annotation.NameInMap("AssetType")
        private String assetType;

        @com.aliyun.core.annotation.NameInMap("CloudCode")
        private String cloudCode;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IncidentUuid")
        private String incidentUuid;

        @com.aliyun.core.annotation.NameInMap("SubUserId")
        private Long subUserId;

        private ResponseData(Builder builder) {
            this.alertUuid = builder.alertUuid;
            this.aliuid = builder.aliuid;
            this.assetId = builder.assetId;
            this.assetInfo = builder.assetInfo;
            this.assetName = builder.assetName;
            this.assetType = builder.assetType;
            this.cloudCode = builder.cloudCode;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.incidentUuid = builder.incidentUuid;
            this.subUserId = builder.subUserId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResponseData create() {
            return builder().build();
        }

        /**
         * @return alertUuid
         */
        public String getAlertUuid() {
            return this.alertUuid;
        }

        /**
         * @return aliuid
         */
        public Long getAliuid() {
            return this.aliuid;
        }

        /**
         * @return assetId
         */
        public String getAssetId() {
            return this.assetId;
        }

        /**
         * @return assetInfo
         */
        public java.util.List < AssetInfo> getAssetInfo() {
            return this.assetInfo;
        }

        /**
         * @return assetName
         */
        public String getAssetName() {
            return this.assetName;
        }

        /**
         * @return assetType
         */
        public String getAssetType() {
            return this.assetType;
        }

        /**
         * @return cloudCode
         */
        public String getCloudCode() {
            return this.cloudCode;
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
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return incidentUuid
         */
        public String getIncidentUuid() {
            return this.incidentUuid;
        }

        /**
         * @return subUserId
         */
        public Long getSubUserId() {
            return this.subUserId;
        }

        public static final class Builder {
            private String alertUuid; 
            private Long aliuid; 
            private String assetId; 
            private java.util.List < AssetInfo> assetInfo; 
            private String assetName; 
            private String assetType; 
            private String cloudCode; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String incidentUuid; 
            private Long subUserId; 

            /**
             * The UUID of the alert associated with the event.
             */
            public Builder alertUuid(String alertUuid) {
                this.alertUuid = alertUuid;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account in SIEM.
             */
            public Builder aliuid(Long aliuid) {
                this.aliuid = aliuid;
                return this;
            }

            /**
             * The logical ID of the asset.
             */
            public Builder assetId(String assetId) {
                this.assetId = assetId;
                return this;
            }

            /**
             * The display information of the asset is in the JSON format.
             */
            public Builder assetInfo(java.util.List < AssetInfo> assetInfo) {
                this.assetInfo = assetInfo;
                return this;
            }

            /**
             * The name of the asset.
             */
            public Builder assetName(String assetName) {
                this.assetName = assetName;
                return this;
            }

            /**
             * The type of the asset. Valid values:
             * <p>
             * 
             * *   ip
             * *   domain
             * *   url
             * *   process
             * *   file
             * *   host
             */
            public Builder assetType(String assetType) {
                this.assetType = assetType;
                return this;
            }

            /**
             * The cloud code of the entity. Valid values:
             * <p>
             * 
             * *   aliyun: Alibaba Cloud
             * *   qcloud: Tencent Cloud
             * *   hcloud: Huawei Cloud
             */
            public Builder cloudCode(String cloudCode) {
                this.cloudCode = cloudCode;
                return this;
            }

            /**
             * The time when the asset was synchronized.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The time when the asset was last updated.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The ID of the asset.
             */
            public Builder id(Long id) {
                this.id = id;
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
             * The ID of the associated account to which the asset belongs.
             */
            public Builder subUserId(Long subUserId) {
                this.subUserId = subUserId;
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
