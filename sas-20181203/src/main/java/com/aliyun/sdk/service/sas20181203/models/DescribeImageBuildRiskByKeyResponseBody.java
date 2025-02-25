// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeImageBuildRiskByKeyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageBuildRiskByKeyResponseBody</p>
 */
public class DescribeImageBuildRiskByKeyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeImageBuildRiskByKeyResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageBuildRiskByKeyResponseBody create() {
        return builder().build();
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
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>52870893-48A7-5A9E-9E05-6253E5B6****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeImageBuildRiskByKeyResponseBody build() {
            return new DescribeImageBuildRiskByKeyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeImageBuildRiskByKeyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageBuildRiskByKeyResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Advice")
        private String advice;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("LayerCmd")
        private String layerCmd;

        @com.aliyun.core.annotation.NameInMap("LayerDigest")
        private String layerDigest;

        @com.aliyun.core.annotation.NameInMap("Promt")
        private String promt;

        @com.aliyun.core.annotation.NameInMap("RiskClass")
        private String riskClass;

        @com.aliyun.core.annotation.NameInMap("RiskClassName")
        private String riskClassName;

        @com.aliyun.core.annotation.NameInMap("RiskKey")
        private String riskKey;

        @com.aliyun.core.annotation.NameInMap("RiskKeyName")
        private String riskKeyName;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        private List(Builder builder) {
            this.advice = builder.advice;
            this.description = builder.description;
            this.layerCmd = builder.layerCmd;
            this.layerDigest = builder.layerDigest;
            this.promt = builder.promt;
            this.riskClass = builder.riskClass;
            this.riskClassName = builder.riskClassName;
            this.riskKey = builder.riskKey;
            this.riskKeyName = builder.riskKeyName;
            this.riskLevel = builder.riskLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return advice
         */
        public String getAdvice() {
            return this.advice;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return layerCmd
         */
        public String getLayerCmd() {
            return this.layerCmd;
        }

        /**
         * @return layerDigest
         */
        public String getLayerDigest() {
            return this.layerDigest;
        }

        /**
         * @return promt
         */
        public String getPromt() {
            return this.promt;
        }

        /**
         * @return riskClass
         */
        public String getRiskClass() {
            return this.riskClass;
        }

        /**
         * @return riskClassName
         */
        public String getRiskClassName() {
            return this.riskClassName;
        }

        /**
         * @return riskKey
         */
        public String getRiskKey() {
            return this.riskKey;
        }

        /**
         * @return riskKeyName
         */
        public String getRiskKeyName() {
            return this.riskKeyName;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public static final class Builder {
            private String advice; 
            private String description; 
            private String layerCmd; 
            private String layerDigest; 
            private String promt; 
            private String riskClass; 
            private String riskClassName; 
            private String riskKey; 
            private String riskKeyName; 
            private String riskLevel; 

            /**
             * <p>The suggestion on how to handle the risk.</p>
             * 
             * <strong>example:</strong>
             * <p>do not use root user</p>
             */
            public Builder advice(String advice) {
                this.advice = advice;
                return this;
            }

            /**
             * <p>The description of the suggestion on how to handle the risk.</p>
             * 
             * <strong>example:</strong>
             * <p>the root user has excessive permissions</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The image build command.</p>
             * 
             * <strong>example:</strong>
             * <p>user root</p>
             */
            public Builder layerCmd(String layerCmd) {
                this.layerCmd = layerCmd;
                return this;
            }

            /**
             * <p>The digest of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>6ec898e6274f942e0e4a053eff1c3119026a6704e56cff206b2cec71f636****</p>
             */
            public Builder layerDigest(String layerDigest) {
                this.layerDigest = layerDigest;
                return this;
            }

            /**
             * <p>The prompt message on the risk.</p>
             * 
             * <strong>example:</strong>
             * <p>the root user has excessive permissions</p>
             */
            public Builder promt(String promt) {
                this.promt = promt;
                return this;
            }

            /**
             * <p>The type key of the risk rule.</p>
             * 
             * <strong>example:</strong>
             * <p>other</p>
             */
            public Builder riskClass(String riskClass) {
                this.riskClass = riskClass;
                return this;
            }

            /**
             * <p>The type name of the risk rule.</p>
             * 
             * <strong>example:</strong>
             * <p>other</p>
             */
            public Builder riskClassName(String riskClassName) {
                this.riskClassName = riskClassName;
                return this;
            }

            /**
             * <p>The key of the risk rule.</p>
             * 
             * <strong>example:</strong>
             * <p>no_user</p>
             */
            public Builder riskKey(String riskKey) {
                this.riskKey = riskKey;
                return this;
            }

            /**
             * <p>The name of the risk rule.</p>
             * 
             * <strong>example:</strong>
             * <p>no_user</p>
             */
            public Builder riskKeyName(String riskKeyName) {
                this.riskKeyName = riskKeyName;
                return this;
            }

            /**
             * <p>The risk level. Valid values:</p>
             * <ul>
             * <li><strong>high</strong></li>
             * <li><strong>medium</strong></li>
             * <li><strong>low</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>medium</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeImageBuildRiskByKeyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageBuildRiskByKeyResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

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
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * <p>The page number. Default value: <strong>1</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries per page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
             * <blockquote>
             * <p> We recommend that you do not leave this parameter empty.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>109</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeImageBuildRiskByKeyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageBuildRiskByKeyResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("PageInfo")
        private PageInfo pageInfo;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageInfo = builder.pageInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
        }

        /**
         * @return pageInfo
         */
        public PageInfo getPageInfo() {
            return this.pageInfo;
        }

        public static final class Builder {
            private java.util.List<List> list; 
            private PageInfo pageInfo; 

            /**
             * <p>The risks.</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The pagination information.</p>
             */
            public Builder pageInfo(PageInfo pageInfo) {
                this.pageInfo = pageInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
