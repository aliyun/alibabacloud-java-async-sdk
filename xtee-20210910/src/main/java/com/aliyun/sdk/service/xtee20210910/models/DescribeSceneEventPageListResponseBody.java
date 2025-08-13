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
    private java.util.List<ResultObject> resultObject;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<ResultObject> getResultObject() {
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
        private java.util.List<ResultObject> resultObject; 
        private Integer totalItem; 
        private Integer totalPage; 

        private Builder() {
        } 

        private Builder(DescribeSceneEventPageListResponseBody model) {
            this.currentPage = model.currentPage;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
            this.totalItem = model.totalItem;
            this.totalPage = model.totalPage;
        } 

        /**
         * <p>Current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Number of items per page. Default value: 20, minimum value: 1, maximum value: 50.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Request ID, each request has a unique value, which facilitates subsequent troubleshooting</p>
         * 
         * <strong>example:</strong>
         * <p>AE7E6105-7DEB-5125-9B24-DCBC139F6CD2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Return array</p>
         */
        public Builder resultObject(java.util.List<ResultObject> resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        /**
         * <p>Total number of items</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder totalItem(Integer totalItem) {
            this.totalItem = totalItem;
            return this;
        }

        /**
         * <p>Total number of pages</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeSceneEventPageListResponseBody build() {
            return new DescribeSceneEventPageListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSceneEventPageListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSceneEventPageListResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.commonRuleCount = model.commonRuleCount;
                this.customRuleCount = model.customRuleCount;
                this.eventCode = model.eventCode;
                this.eventName = model.eventName;
                this.gmtModified = model.gmtModified;
                this.modifier = model.modifier;
                this.normalRuleCount = model.normalRuleCount;
                this.service = model.service;
                this.useStatus = model.useStatus;
                this.whiteBoxRuleCount = model.whiteBoxRuleCount;
            } 

            /**
             * <p>Number of common rules</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder commonRuleCount(String commonRuleCount) {
                this.commonRuleCount = commonRuleCount;
                return this;
            }

            /**
             * <p>Number of custom rules</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder customRuleCount(String customRuleCount) {
                this.customRuleCount = customRuleCount;
                return this;
            }

            /**
             * <p>Event code</p>
             * 
             * <strong>example:</strong>
             * <p>de_aszbjb7236</p>
             */
            public Builder eventCode(String eventCode) {
                this.eventCode = eventCode;
                return this;
            }

            /**
             * <p>Event name.</p>
             * 
             * <strong>example:</strong>
             * <p>注册风险</p>
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * <p>Modification time</p>
             * 
             * <strong>example:</strong>
             * <p>1565701886000</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Modifier</p>
             * 
             * <strong>example:</strong>
             * <p>公有云用户uid</p>
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * <p>Number of custom rules</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder normalRuleCount(String normalRuleCount) {
                this.normalRuleCount = normalRuleCount;
                return this;
            }

            /**
             * <p>Service code</p>
             * 
             * <strong>example:</strong>
             * <p>device_risk</p>
             */
            public Builder service(String service) {
                this.service = service;
                return this;
            }

            /**
             * <p>Usage status</p>
             * 
             * <strong>example:</strong>
             * <p>使用/未使用</p>
             */
            public Builder useStatus(String useStatus) {
                this.useStatus = useStatus;
                return this;
            }

            /**
             * <p>Number of white-box rules</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
