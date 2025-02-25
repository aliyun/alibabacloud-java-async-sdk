// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSceneEventPageListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSceneEventPageListResponseBody</p>
 */
public class DescribeSceneEventPageListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("currentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private java.util.List < ResultObject> resultObject;

    @com.aliyun.core.annotation.NameInMap("totalItem")
    private Integer totalItem;

    @com.aliyun.core.annotation.NameInMap("totalPage")
    private Integer totalPage;

    private DescribeSceneEventPageListResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
        this.totalItem = builder.totalItem;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSceneEventPageListResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private Integer currentPage; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List < ResultObject> resultObject; 
        private Integer totalItem; 
        private Integer totalPage; 

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
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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

        public DescribeSceneEventPageListResponseBody build() {
            return new DescribeSceneEventPageListResponseBody(this);
        } 

    } 

    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("commonRuleCount")
        private String commonRuleCount;

        @com.aliyun.core.annotation.NameInMap("customRuleCount")
        private String customRuleCount;

        @com.aliyun.core.annotation.NameInMap("eventCode")
        private String eventCode;

        @com.aliyun.core.annotation.NameInMap("eventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("modifier")
        private String modifier;

        @com.aliyun.core.annotation.NameInMap("normalRuleCount")
        private String normalRuleCount;

        @com.aliyun.core.annotation.NameInMap("service")
        private String service;

        @com.aliyun.core.annotation.NameInMap("useStatus")
        private String useStatus;

        @com.aliyun.core.annotation.NameInMap("whiteBoxRuleCount")
        private String whiteBoxRuleCount;

        private ResultObject(Builder builder) {
            this.commonRuleCount = builder.commonRuleCount;
            this.customRuleCount = builder.customRuleCount;
            this.eventCode = builder.eventCode;
            this.eventName = builder.eventName;
            this.gmtModified = builder.gmtModified;
            this.modifier = builder.modifier;
            this.normalRuleCount = builder.normalRuleCount;
            this.service = builder.service;
            this.useStatus = builder.useStatus;
            this.whiteBoxRuleCount = builder.whiteBoxRuleCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return commonRuleCount
         */
        public String getCommonRuleCount() {
            return this.commonRuleCount;
        }

        /**
         * @return customRuleCount
         */
        public String getCustomRuleCount() {
            return this.customRuleCount;
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
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return modifier
         */
        public String getModifier() {
            return this.modifier;
        }

        /**
         * @return normalRuleCount
         */
        public String getNormalRuleCount() {
            return this.normalRuleCount;
        }

        /**
         * @return service
         */
        public String getService() {
            return this.service;
        }

        /**
         * @return useStatus
         */
        public String getUseStatus() {
            return this.useStatus;
        }

        /**
         * @return whiteBoxRuleCount
         */
        public String getWhiteBoxRuleCount() {
            return this.whiteBoxRuleCount;
        }

        public static final class Builder {
            private String commonRuleCount; 
            private String customRuleCount; 
            private String eventCode; 
            private String eventName; 
            private String gmtModified; 
            private String modifier; 
            private String normalRuleCount; 
            private String service; 
            private String useStatus; 
            private String whiteBoxRuleCount; 

            /**
             * commonRuleCount.
             */
            public Builder commonRuleCount(String commonRuleCount) {
                this.commonRuleCount = commonRuleCount;
                return this;
            }

            /**
             * customRuleCount.
             */
            public Builder customRuleCount(String customRuleCount) {
                this.customRuleCount = customRuleCount;
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
             * gmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * modifier.
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * normalRuleCount.
             */
            public Builder normalRuleCount(String normalRuleCount) {
                this.normalRuleCount = normalRuleCount;
                return this;
            }

            /**
             * service.
             */
            public Builder service(String service) {
                this.service = service;
                return this;
            }

            /**
             * useStatus.
             */
            public Builder useStatus(String useStatus) {
                this.useStatus = useStatus;
                return this;
            }

            /**
             * whiteBoxRuleCount.
             */
            public Builder whiteBoxRuleCount(String whiteBoxRuleCount) {
                this.whiteBoxRuleCount = whiteBoxRuleCount;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
