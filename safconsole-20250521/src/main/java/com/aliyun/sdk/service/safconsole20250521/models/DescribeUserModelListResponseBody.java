// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safconsole20250521.models;

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
 * {@link DescribeUserModelListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserModelListResponseBody</p>
 */
public class DescribeUserModelListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Long currentPage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Long httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private java.util.List<ResultObject> resultObject;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalItem")
    private Long totalItem;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Long totalPage;

    private DescribeUserModelListResponseBody(Builder builder) {
        this.code = builder.code;
        this.currentPage = builder.currentPage;
        this.httpStatusCode = builder.httpStatusCode;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
        this.success = builder.success;
        this.totalItem = builder.totalItem;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserModelListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return httpStatusCode
     */
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
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
        private Integer code; 
        private Long currentPage; 
        private Long httpStatusCode; 
        private Long pageSize; 
        private String requestId; 
        private java.util.List<ResultObject> resultObject; 
        private Boolean success; 
        private Long totalItem; 
        private Long totalPage; 

        private Builder() {
        } 

        private Builder(DescribeUserModelListResponseBody model) {
            this.code = model.code;
            this.currentPage = model.currentPage;
            this.httpStatusCode = model.httpStatusCode;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
            this.success = model.success;
            this.totalItem = model.totalItem;
            this.totalPage = model.totalPage;
        } 

        /**
         * <p><code>code</code></p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Current page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Long httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Pagination parameter: number of items per page, default value is 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4A91D2D1-AEC9-1658-ABCE-5A39DE66A5C2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Return result.</p>
         */
        public Builder resultObject(java.util.List<ResultObject> resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful, with values as follows:</p>
         * <ul>
         * <li>true, request succeeded</li>
         * <li>false, request failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>Total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalItem(Long totalItem) {
            this.totalItem = totalItem;
            return this;
        }

        /**
         * <p>Total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeUserModelListResponseBody build() {
            return new DescribeUserModelListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUserModelListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserModelListResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthType")
        private String authType;

        @com.aliyun.core.annotation.NameInMap("CustomerModuleName")
        private String customerModuleName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FeatureTemplate")
        private String featureTemplate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InnerDefineStatus")
        private String innerDefineStatus;

        @com.aliyun.core.annotation.NameInMap("InnerModuleName")
        private String innerModuleName;

        @com.aliyun.core.annotation.NameInMap("IsAllowIterate")
        private Boolean isAllowIterate;

        @com.aliyun.core.annotation.NameInMap("IsAllowRollback")
        private Boolean isAllowRollback;

        @com.aliyun.core.annotation.NameInMap("IterationVersion")
        private Long iterationVersion;

        @com.aliyun.core.annotation.NameInMap("RootModuleId")
        private Long rootModuleId;

        private ResultObject(Builder builder) {
            this.authType = builder.authType;
            this.customerModuleName = builder.customerModuleName;
            this.description = builder.description;
            this.featureTemplate = builder.featureTemplate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.innerDefineStatus = builder.innerDefineStatus;
            this.innerModuleName = builder.innerModuleName;
            this.isAllowIterate = builder.isAllowIterate;
            this.isAllowRollback = builder.isAllowRollback;
            this.iterationVersion = builder.iterationVersion;
            this.rootModuleId = builder.rootModuleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return authType
         */
        public String getAuthType() {
            return this.authType;
        }

        /**
         * @return customerModuleName
         */
        public String getCustomerModuleName() {
            return this.customerModuleName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return featureTemplate
         */
        public String getFeatureTemplate() {
            return this.featureTemplate;
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
         * @return innerDefineStatus
         */
        public String getInnerDefineStatus() {
            return this.innerDefineStatus;
        }

        /**
         * @return innerModuleName
         */
        public String getInnerModuleName() {
            return this.innerModuleName;
        }

        /**
         * @return isAllowIterate
         */
        public Boolean getIsAllowIterate() {
            return this.isAllowIterate;
        }

        /**
         * @return isAllowRollback
         */
        public Boolean getIsAllowRollback() {
            return this.isAllowRollback;
        }

        /**
         * @return iterationVersion
         */
        public Long getIterationVersion() {
            return this.iterationVersion;
        }

        /**
         * @return rootModuleId
         */
        public Long getRootModuleId() {
            return this.rootModuleId;
        }

        public static final class Builder {
            private String authType; 
            private String customerModuleName; 
            private String description; 
            private String featureTemplate; 
            private Long gmtModified; 
            private Long id; 
            private String innerDefineStatus; 
            private String innerModuleName; 
            private Boolean isAllowIterate; 
            private Boolean isAllowRollback; 
            private Long iterationVersion; 
            private Long rootModuleId; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.authType = model.authType;
                this.customerModuleName = model.customerModuleName;
                this.description = model.description;
                this.featureTemplate = model.featureTemplate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.innerDefineStatus = model.innerDefineStatus;
                this.innerModuleName = model.innerModuleName;
                this.isAllowIterate = model.isAllowIterate;
                this.isAllowRollback = model.isAllowRollback;
                this.iterationVersion = model.iterationVersion;
                this.rootModuleId = model.rootModuleId;
            } 

            /**
             * <p>Authorization type.</p>
             * 
             * <strong>example:</strong>
             * <p>READ</p>
             */
            public Builder authType(String authType) {
                this.authType = authType;
                return this;
            }

            /**
             * <p>Model name.</p>
             * 
             * <strong>example:</strong>
             * <p>Model_A</p>
             */
            public Builder customerModuleName(String customerModuleName) {
                this.customerModuleName = customerModuleName;
                return this;
            }

            /**
             * <p>Remarks.</p>
             * 
             * <strong>example:</strong>
             * <p>备注。</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Associated features.</p>
             * 
             * <strong>example:</strong>
             * <p>template_a</p>
             */
            public Builder featureTemplate(String featureTemplate) {
                this.featureTemplate = featureTemplate;
                return this;
            }

            /**
             * <p>Modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>1673578656000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Primary key ID of the model.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Publication status.</p>
             * 
             * <strong>example:</strong>
             * <p>ONLINE</p>
             */
            public Builder innerDefineStatus(String innerDefineStatus) {
                this.innerDefineStatus = innerDefineStatus;
                return this;
            }

            /**
             * <p>Model identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>inner_model_a</p>
             */
            public Builder innerModuleName(String innerModuleName) {
                this.innerModuleName = innerModuleName;
                return this;
            }

            /**
             * <p>Whether iteration is allowed.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isAllowIterate(Boolean isAllowIterate) {
                this.isAllowIterate = isAllowIterate;
                return this;
            }

            /**
             * <p>Whether rollback is allowed.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isAllowRollback(Boolean isAllowRollback) {
                this.isAllowRollback = isAllowRollback;
                return this;
            }

            /**
             * <p>Iteration version.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder iterationVersion(Long iterationVersion) {
                this.iterationVersion = iterationVersion;
                return this;
            }

            /**
             * <p>Root model ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder rootModuleId(Long rootModuleId) {
                this.rootModuleId = rootModuleId;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
