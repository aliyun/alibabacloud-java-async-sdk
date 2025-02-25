// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAuthScenePageListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAuthScenePageListResponseBody</p>
 */
public class DescribeAuthScenePageListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("currentPage")
    private Long currentPage;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private java.util.List < ResultObject> resultObject;

    @com.aliyun.core.annotation.NameInMap("totalItem")
    private Long totalItem;

    @com.aliyun.core.annotation.NameInMap("totalPage")
    private Long totalPage;

    private DescribeAuthScenePageListResponseBody(Builder builder) {
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

    public static DescribeAuthScenePageListResponseBody create() {
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
    public Long getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
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
    public Long getTotalItem() {
        return this.totalItem;
    }

    /**
     * @return totalPage
     */
    public Long getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private String requestId; 
        private Long currentPage; 
        private Long pageSize; 
        private java.util.List < ResultObject> resultObject; 
        private Long totalItem; 
        private Long totalPage; 

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
        public Builder currentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Long pageSize) {
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
        public Builder totalItem(Long totalItem) {
            this.totalItem = totalItem;
            return this;
        }

        /**
         * totalPage.
         */
        public Builder totalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeAuthScenePageListResponseBody build() {
            return new DescribeAuthScenePageListResponseBody(this);
        } 

    } 

    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("commonRuleCount")
        private Long commonRuleCount;

        @com.aliyun.core.annotation.NameInMap("customRuleCount")
        private Long customRuleCount;

        @com.aliyun.core.annotation.NameInMap("eventCode")
        private String eventCode;

        @com.aliyun.core.annotation.NameInMap("sceneName")
        private String sceneName;

        @com.aliyun.core.annotation.NameInMap("serverName")
        private String serverName;

        private ResultObject(Builder builder) {
            this.commonRuleCount = builder.commonRuleCount;
            this.customRuleCount = builder.customRuleCount;
            this.eventCode = builder.eventCode;
            this.sceneName = builder.sceneName;
            this.serverName = builder.serverName;
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
        public Long getCommonRuleCount() {
            return this.commonRuleCount;
        }

        /**
         * @return customRuleCount
         */
        public Long getCustomRuleCount() {
            return this.customRuleCount;
        }

        /**
         * @return eventCode
         */
        public String getEventCode() {
            return this.eventCode;
        }

        /**
         * @return sceneName
         */
        public String getSceneName() {
            return this.sceneName;
        }

        /**
         * @return serverName
         */
        public String getServerName() {
            return this.serverName;
        }

        public static final class Builder {
            private Long commonRuleCount; 
            private Long customRuleCount; 
            private String eventCode; 
            private String sceneName; 
            private String serverName; 

            /**
             * commonRuleCount.
             */
            public Builder commonRuleCount(Long commonRuleCount) {
                this.commonRuleCount = commonRuleCount;
                return this;
            }

            /**
             * customRuleCount.
             */
            public Builder customRuleCount(Long customRuleCount) {
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
             * sceneName.
             */
            public Builder sceneName(String sceneName) {
                this.sceneName = sceneName;
                return this;
            }

            /**
             * serverName.
             */
            public Builder serverName(String serverName) {
                this.serverName = serverName;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
