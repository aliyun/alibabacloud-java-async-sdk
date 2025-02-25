// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEventPageListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEventPageListResponseBody</p>
 */
public class DescribeEventPageListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("currentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private java.util.List < ResultObject> resultObject;

    @com.aliyun.core.annotation.NameInMap("totalItem")
    private Integer totalItem;

    @com.aliyun.core.annotation.NameInMap("totalPage")
    private Integer totalPage;

    private DescribeEventPageListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.resultObject = builder.resultObject;
        this.totalItem = builder.totalItem;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEventPageListResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
     * @return resultObject
     */
    public java.util.List < ResultObject> getResultObject() {
        return this.resultObject;
    }

    /**
     * @return totalItem
     */
    public Integer getTotalItem() {
        return this.totalItem;
    }

    /**
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private String requestId; 
        private Integer currentPage; 
        private Integer pageSize; 
        private java.util.List < ResultObject> resultObject; 
        private Integer totalItem; 
        private Integer totalPage; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * currentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * resultObject.
         */
        public Builder resultObject(java.util.List < ResultObject> resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        /**
         * totalItem.
         */
        public Builder totalItem(Integer totalItem) {
            this.totalItem = totalItem;
            return this;
        }

        /**
         * totalPage.
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeEventPageListResponseBody build() {
            return new DescribeEventPageListResponseBody(this);
        } 

    } 

    public static class Children extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("eventCode")
        private String eventCode;

        @com.aliyun.core.annotation.NameInMap("eventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("eventStatus")
        private String eventStatus;

        @com.aliyun.core.annotation.NameInMap("eventType")
        private String eventType;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("ruleCount")
        private Long ruleCount;

        private Children(Builder builder) {
            this.eventCode = builder.eventCode;
            this.eventName = builder.eventName;
            this.eventStatus = builder.eventStatus;
            this.eventType = builder.eventType;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.ruleCount = builder.ruleCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Children create() {
            return builder().build();
        }

        /**
         * @return eventCode
         */
        public String getEventCode() {
            return this.eventCode;
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return eventStatus
         */
        public String getEventStatus() {
            return this.eventStatus;
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return ruleCount
         */
        public Long getRuleCount() {
            return this.ruleCount;
        }

        public static final class Builder {
            private String eventCode; 
            private String eventName; 
            private String eventStatus; 
            private String eventType; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private Long id; 
            private Long ruleCount; 

            /**
             * eventCode.
             */
            public Builder eventCode(String eventCode) {
                this.eventCode = eventCode;
                return this;
            }

            /**
             * eventName.
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * eventStatus.
             */
            public Builder eventStatus(String eventStatus) {
                this.eventStatus = eventStatus;
                return this;
            }

            /**
             * eventType.
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * ruleCount.
             */
            public Builder ruleCount(Long ruleCount) {
                this.ruleCount = ruleCount;
                return this;
            }

            public Children build() {
                return new Children(this);
            } 

        } 

    }
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("children")
        private java.util.List < Children> children;

        @com.aliyun.core.annotation.NameInMap("eventCode")
        private String eventCode;

        @com.aliyun.core.annotation.NameInMap("eventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("eventStatus")
        private String eventStatus;

        @com.aliyun.core.annotation.NameInMap("eventType")
        private String eventType;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("ruleCount")
        private Integer ruleCount;

        @com.aliyun.core.annotation.NameInMap("templateCode")
        private String templateCode;

        @com.aliyun.core.annotation.NameInMap("templateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("templateType")
        private String templateType;

        @com.aliyun.core.annotation.NameInMap("userCount")
        private Integer userCount;

        private ResultObject(Builder builder) {
            this.children = builder.children;
            this.eventCode = builder.eventCode;
            this.eventName = builder.eventName;
            this.eventStatus = builder.eventStatus;
            this.eventType = builder.eventType;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.ruleCount = builder.ruleCount;
            this.templateCode = builder.templateCode;
            this.templateName = builder.templateName;
            this.templateType = builder.templateType;
            this.userCount = builder.userCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return children
         */
        public java.util.List < Children> getChildren() {
            return this.children;
        }

        /**
         * @return eventCode
         */
        public String getEventCode() {
            return this.eventCode;
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return eventStatus
         */
        public String getEventStatus() {
            return this.eventStatus;
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return ruleCount
         */
        public Integer getRuleCount() {
            return this.ruleCount;
        }

        /**
         * @return templateCode
         */
        public String getTemplateCode() {
            return this.templateCode;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        /**
         * @return templateType
         */
        public String getTemplateType() {
            return this.templateType;
        }

        /**
         * @return userCount
         */
        public Integer getUserCount() {
            return this.userCount;
        }

        public static final class Builder {
            private java.util.List < Children> children; 
            private String eventCode; 
            private String eventName; 
            private String eventStatus; 
            private String eventType; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private Long id; 
            private Integer ruleCount; 
            private String templateCode; 
            private String templateName; 
            private String templateType; 
            private Integer userCount; 

            /**
             * children.
             */
            public Builder children(java.util.List < Children> children) {
                this.children = children;
                return this;
            }

            /**
             * eventCode.
             */
            public Builder eventCode(String eventCode) {
                this.eventCode = eventCode;
                return this;
            }

            /**
             * eventName.
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * eventStatus.
             */
            public Builder eventStatus(String eventStatus) {
                this.eventStatus = eventStatus;
                return this;
            }

            /**
             * eventType.
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * ruleCount.
             */
            public Builder ruleCount(Integer ruleCount) {
                this.ruleCount = ruleCount;
                return this;
            }

            /**
             * templateCode.
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            /**
             * templateName.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * templateType.
             */
            public Builder templateType(String templateType) {
                this.templateType = templateType;
                return this;
            }

            /**
             * userCount.
             */
            public Builder userCount(Integer userCount) {
                this.userCount = userCount;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
