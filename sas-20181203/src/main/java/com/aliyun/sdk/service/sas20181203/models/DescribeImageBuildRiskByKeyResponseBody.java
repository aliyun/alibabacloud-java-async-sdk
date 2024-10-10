// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
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
             * Advice.
             */
            public Builder advice(String advice) {
                this.advice = advice;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * LayerCmd.
             */
            public Builder layerCmd(String layerCmd) {
                this.layerCmd = layerCmd;
                return this;
            }

            /**
             * LayerDigest.
             */
            public Builder layerDigest(String layerDigest) {
                this.layerDigest = layerDigest;
                return this;
            }

            /**
             * Promt.
             */
            public Builder promt(String promt) {
                this.promt = promt;
                return this;
            }

            /**
             * RiskClass.
             */
            public Builder riskClass(String riskClass) {
                this.riskClass = riskClass;
                return this;
            }

            /**
             * RiskClassName.
             */
            public Builder riskClassName(String riskClassName) {
                this.riskClassName = riskClassName;
                return this;
            }

            /**
             * RiskKey.
             */
            public Builder riskKey(String riskKey) {
                this.riskKey = riskKey;
                return this;
            }

            /**
             * RiskKeyName.
             */
            public Builder riskKeyName(String riskKeyName) {
                this.riskKeyName = riskKeyName;
                return this;
            }

            /**
             * RiskLevel.
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
             * CurrentPage.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
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
        private java.util.List < List> list;

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
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return pageInfo
         */
        public PageInfo getPageInfo() {
            return this.pageInfo;
        }

        public static final class Builder {
            private java.util.List < List> list; 
            private PageInfo pageInfo; 

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * PageInfo.
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
