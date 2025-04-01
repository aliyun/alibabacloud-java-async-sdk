// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.advisor20180120.models;

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
 * {@link DescribeCostCheckAdvicesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCostCheckAdvicesResponseBody</p>
 */
public class DescribeCostCheckAdvicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private DescribeCostCheckAdvicesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCostCheckAdvicesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(DescribeCostCheckAdvicesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>566331F9-****-550F-B745-A730331F97A9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeCostCheckAdvicesResponseBody build() {
            return new DescribeCostCheckAdvicesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCostCheckAdvicesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCostCheckAdvicesResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCostCheckAdvicesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCostCheckAdvicesResponseBody</p>
     */
    public static class AdviceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountFolderId")
        private String accountFolderId;

        @com.aliyun.core.annotation.NameInMap("AccountFolderName")
        private String accountFolderName;

        @com.aliyun.core.annotation.NameInMap("AliyunId")
        private Long aliyunId;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("GmtDeleted")
        private Long gmtDeleted;

        @com.aliyun.core.annotation.NameInMap("Product")
        private String product;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceName")
        private String resourceName;

        @com.aliyun.core.annotation.NameInMap("Severity")
        private String severity;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private AdviceList(Builder builder) {
            this.accountFolderId = builder.accountFolderId;
            this.accountFolderName = builder.accountFolderName;
            this.aliyunId = builder.aliyunId;
            this.content = builder.content;
            this.email = builder.email;
            this.endTime = builder.endTime;
            this.gmtDeleted = builder.gmtDeleted;
            this.product = builder.product;
            this.regionId = builder.regionId;
            this.resourceId = builder.resourceId;
            this.resourceName = builder.resourceName;
            this.severity = builder.severity;
            this.startTime = builder.startTime;
            this.tags = builder.tags;
            this.url = builder.url;
            this.userName = builder.userName;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdviceList create() {
            return builder().build();
        }

        /**
         * @return accountFolderId
         */
        public String getAccountFolderId() {
            return this.accountFolderId;
        }

        /**
         * @return accountFolderName
         */
        public String getAccountFolderName() {
            return this.accountFolderName;
        }

        /**
         * @return aliyunId
         */
        public Long getAliyunId() {
            return this.aliyunId;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return gmtDeleted
         */
        public Long getGmtDeleted() {
            return this.gmtDeleted;
        }

        /**
         * @return product
         */
        public String getProduct() {
            return this.product;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceName
         */
        public String getResourceName() {
            return this.resourceName;
        }

        /**
         * @return severity
         */
        public String getSeverity() {
            return this.severity;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String accountFolderId; 
            private String accountFolderName; 
            private Long aliyunId; 
            private String content; 
            private String email; 
            private Long endTime; 
            private Long gmtDeleted; 
            private String product; 
            private String regionId; 
            private String resourceId; 
            private String resourceName; 
            private String severity; 
            private Long startTime; 
            private java.util.List<Tags> tags; 
            private String url; 
            private String userName; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(AdviceList model) {
                this.accountFolderId = model.accountFolderId;
                this.accountFolderName = model.accountFolderName;
                this.aliyunId = model.aliyunId;
                this.content = model.content;
                this.email = model.email;
                this.endTime = model.endTime;
                this.gmtDeleted = model.gmtDeleted;
                this.product = model.product;
                this.regionId = model.regionId;
                this.resourceId = model.resourceId;
                this.resourceName = model.resourceName;
                this.severity = model.severity;
                this.startTime = model.startTime;
                this.tags = model.tags;
                this.url = model.url;
                this.userName = model.userName;
                this.zoneId = model.zoneId;
            } 

            /**
             * AccountFolderId.
             */
            public Builder accountFolderId(String accountFolderId) {
                this.accountFolderId = accountFolderId;
                return this;
            }

            /**
             * AccountFolderName.
             */
            public Builder accountFolderName(String accountFolderName) {
                this.accountFolderName = accountFolderName;
                return this;
            }

            /**
             * AliyunId.
             */
            public Builder aliyunId(Long aliyunId) {
                this.aliyunId = aliyunId;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>Email</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * GmtDeleted.
             */
            public Builder gmtDeleted(Long gmtDeleted) {
                this.gmtDeleted = gmtDeleted;
                return this;
            }

            /**
             * Product.
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ResourceName.
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * Severity.
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public AdviceList build() {
                return new AdviceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCostCheckAdvicesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCostCheckAdvicesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdviceList")
        private java.util.List<AdviceList> adviceList;

        @com.aliyun.core.annotation.NameInMap("CheckId")
        private String checkId;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.adviceList = builder.adviceList;
            this.checkId = builder.checkId;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return adviceList
         */
        public java.util.List<AdviceList> getAdviceList() {
            return this.adviceList;
        }

        /**
         * @return checkId
         */
        public String getCheckId() {
            return this.checkId;
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
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<AdviceList> adviceList; 
            private String checkId; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.adviceList = model.adviceList;
                this.checkId = model.checkId;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * AdviceList.
             */
            public Builder adviceList(java.util.List<AdviceList> adviceList) {
                this.adviceList = adviceList;
                return this;
            }

            /**
             * CheckId.
             */
            public Builder checkId(String checkId) {
                this.checkId = checkId;
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
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
