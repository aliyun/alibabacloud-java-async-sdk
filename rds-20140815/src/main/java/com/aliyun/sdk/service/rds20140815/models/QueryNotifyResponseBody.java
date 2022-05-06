// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryNotifyResponseBody} extends {@link TeaModel}
 *
 * <p>QueryNotifyResponseBody</p>
 */
public class QueryNotifyResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private QueryNotifyResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryNotifyResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryNotifyResponseBody build() {
            return new QueryNotifyResponseBody(this);
        } 

    } 

    public static class NotifyItemList extends TeaModel {
        @NameInMap("AliUid")
        private Long aliUid;

        @NameInMap("ConfirmFlag")
        private Boolean confirmFlag;

        @NameInMap("Confirmor")
        private Long confirmor;

        @NameInMap("GmtCreated")
        private String gmtCreated;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("Id")
        private Long id;

        @NameInMap("IdempotentCount")
        private String idempotentCount;

        @NameInMap("IdempotentId")
        private String idempotentId;

        @NameInMap("Level")
        private String level;

        @NameInMap("NotifyElement")
        private String notifyElement;

        @NameInMap("TemplateName")
        private String templateName;

        @NameInMap("Type")
        private String type;

        private NotifyItemList(Builder builder) {
            this.aliUid = builder.aliUid;
            this.confirmFlag = builder.confirmFlag;
            this.confirmor = builder.confirmor;
            this.gmtCreated = builder.gmtCreated;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.idempotentCount = builder.idempotentCount;
            this.idempotentId = builder.idempotentId;
            this.level = builder.level;
            this.notifyElement = builder.notifyElement;
            this.templateName = builder.templateName;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NotifyItemList create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return confirmFlag
         */
        public Boolean getConfirmFlag() {
            return this.confirmFlag;
        }

        /**
         * @return confirmor
         */
        public Long getConfirmor() {
            return this.confirmor;
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
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
         * @return idempotentCount
         */
        public String getIdempotentCount() {
            return this.idempotentCount;
        }

        /**
         * @return idempotentId
         */
        public String getIdempotentId() {
            return this.idempotentId;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return notifyElement
         */
        public String getNotifyElement() {
            return this.notifyElement;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long aliUid; 
            private Boolean confirmFlag; 
            private Long confirmor; 
            private String gmtCreated; 
            private String gmtModified; 
            private Long id; 
            private String idempotentCount; 
            private String idempotentId; 
            private String level; 
            private String notifyElement; 
            private String templateName; 
            private String type; 

            /**
             * AliUid.
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * ConfirmFlag.
             */
            public Builder confirmFlag(Boolean confirmFlag) {
                this.confirmFlag = confirmFlag;
                return this;
            }

            /**
             * Confirmor.
             */
            public Builder confirmor(Long confirmor) {
                this.confirmor = confirmor;
                return this;
            }

            /**
             * GmtCreated.
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
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
             * IdempotentCount.
             */
            public Builder idempotentCount(String idempotentCount) {
                this.idempotentCount = idempotentCount;
                return this;
            }

            /**
             * IdempotentId.
             */
            public Builder idempotentId(String idempotentId) {
                this.idempotentId = idempotentId;
                return this;
            }

            /**
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * NotifyElement.
             */
            public Builder notifyElement(String notifyElement) {
                this.notifyElement = notifyElement;
                return this;
            }

            /**
             * TemplateName.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public NotifyItemList build() {
                return new NotifyItemList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("NotifyItemList")
        private java.util.List < NotifyItemList> notifyItemList;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalRecordCount")
        private Integer totalRecordCount;

        private Data(Builder builder) {
            this.notifyItemList = builder.notifyItemList;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalRecordCount = builder.totalRecordCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return notifyItemList
         */
        public java.util.List < NotifyItemList> getNotifyItemList() {
            return this.notifyItemList;
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
         * @return totalRecordCount
         */
        public Integer getTotalRecordCount() {
            return this.totalRecordCount;
        }

        public static final class Builder {
            private java.util.List < NotifyItemList> notifyItemList; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalRecordCount; 

            /**
             * NotifyItemList.
             */
            public Builder notifyItemList(java.util.List < NotifyItemList> notifyItemList) {
                this.notifyItemList = notifyItemList;
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
             * TotalRecordCount.
             */
            public Builder totalRecordCount(Integer totalRecordCount) {
                this.totalRecordCount = totalRecordCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
