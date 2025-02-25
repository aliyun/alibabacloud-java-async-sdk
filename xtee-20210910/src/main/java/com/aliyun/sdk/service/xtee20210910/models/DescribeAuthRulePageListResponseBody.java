// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAuthRulePageListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAuthRulePageListResponseBody</p>
 */
public class DescribeAuthRulePageListResponseBody extends TeaModel {
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

    private DescribeAuthRulePageListResponseBody(Builder builder) {
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

    public static DescribeAuthRulePageListResponseBody create() {
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

        public DescribeAuthRulePageListResponseBody build() {
            return new DescribeAuthRulePageListResponseBody(this);
        } 

    } 

    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("consoleRuleId")
        private Long consoleRuleId;

        @com.aliyun.core.annotation.NameInMap("createType")
        private String createType;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("memo")
        private String memo;

        @com.aliyun.core.annotation.NameInMap("ruleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("ruleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("ruleVersionId")
        private Long ruleVersionId;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("version")
        private Long version;

        private ResultObject(Builder builder) {
            this.consoleRuleId = builder.consoleRuleId;
            this.createType = builder.createType;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.memo = builder.memo;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.ruleVersionId = builder.ruleVersionId;
            this.status = builder.status;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return consoleRuleId
         */
        public Long getConsoleRuleId() {
            return this.consoleRuleId;
        }

        /**
         * @return createType
         */
        public String getCreateType() {
            return this.createType;
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
         * @return memo
         */
        public String getMemo() {
            return this.memo;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return ruleVersionId
         */
        public Long getRuleVersionId() {
            return this.ruleVersionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return version
         */
        public Long getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Long consoleRuleId; 
            private String createType; 
            private Long gmtModified; 
            private Long id; 
            private String memo; 
            private String ruleId; 
            private String ruleName; 
            private Long ruleVersionId; 
            private String status; 
            private Long version; 

            /**
             * consoleRuleId.
             */
            public Builder consoleRuleId(Long consoleRuleId) {
                this.consoleRuleId = consoleRuleId;
                return this;
            }

            /**
             * createType.
             */
            public Builder createType(String createType) {
                this.createType = createType;
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
             * memo.
             */
            public Builder memo(String memo) {
                this.memo = memo;
                return this;
            }

            /**
             * ruleId.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * ruleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * ruleVersionId.
             */
            public Builder ruleVersionId(Long ruleVersionId) {
                this.ruleVersionId = ruleVersionId;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * version.
             */
            public Builder version(Long version) {
                this.version = version;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
