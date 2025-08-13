// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
    private java.util.List<ResultObject> resultObject;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<ResultObject> getResultObject() {
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
        private java.util.List<ResultObject> resultObject; 
        private Long totalItem; 
        private Long totalPage; 

        private Builder() {
        } 

        private Builder(DescribeAuthScenePageListResponseBody model) {
            this.requestId = model.requestId;
            this.currentPage = model.currentPage;
            this.pageSize = model.pageSize;
            this.resultObject = model.resultObject;
            this.totalItem = model.totalItem;
            this.totalPage = model.totalPage;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Page size, default value is 10</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Returned object</p>
         */
        public Builder resultObject(java.util.List<ResultObject> resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        /**
         * <p>Total number of items</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder totalItem(Long totalItem) {
            this.totalItem = totalItem;
            return this;
        }

        /**
         * <p>Total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        public Builder totalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeAuthScenePageListResponseBody build() {
            return new DescribeAuthScenePageListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAuthScenePageListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAuthScenePageListResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.commonRuleCount = model.commonRuleCount;
                this.customRuleCount = model.customRuleCount;
                this.eventCode = model.eventCode;
                this.sceneName = model.sceneName;
                this.serverName = model.serverName;
            } 

            /**
             * <p>Number of common rules</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder commonRuleCount(Long commonRuleCount) {
                this.commonRuleCount = commonRuleCount;
                return this;
            }

            /**
             * <p>Number of custom rules</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder customRuleCount(Long customRuleCount) {
                this.customRuleCount = customRuleCount;
                return this;
            }

            /**
             * <p>Event code</p>
             * 
             * <strong>example:</strong>
             * <p>de_avypfd8253</p>
             */
            public Builder eventCode(String eventCode) {
                this.eventCode = eventCode;
                return this;
            }

            /**
             * <p>Scene name.</p>
             * 
             * <strong>example:</strong>
             * <p>注册风险识别服务</p>
             */
            public Builder sceneName(String sceneName) {
                this.sceneName = sceneName;
                return this;
            }

            /**
             * <p>Service name.</p>
             * 
             * <strong>example:</strong>
             * <p>account_abuse</p>
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
