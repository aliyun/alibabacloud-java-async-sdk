// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link QuerySmsDetectListNewResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySmsDetectListNewResponseBody</p>
 */
public class QuerySmsDetectListNewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("List")
    private java.util.List<List> list;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private QuerySmsDetectListNewResponseBody(Builder builder) {
        this.list = builder.list;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySmsDetectListNewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return list
     */
    public java.util.List<List> getList() {
        return this.list;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
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
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<List> list; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(QuerySmsDetectListNewResponseBody model) {
            this.list = model.list;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * List.
         */
        public Builder list(java.util.List<List> list) {
            this.list = list;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public QuerySmsDetectListNewResponseBody build() {
            return new QuerySmsDetectListNewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySmsDetectListNewResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmsDetectListNewResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DetectContent")
        private String detectContent;

        @com.aliyun.core.annotation.NameInMap("DetectSignName")
        private String detectSignName;

        @com.aliyun.core.annotation.NameInMap("DetectTime")
        private String detectTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("SuccessRate")
        private String successRate;

        @com.aliyun.core.annotation.NameInMap("TemplateCode")
        private String templateCode;

        @com.aliyun.core.annotation.NameInMap("TemplateParam")
        private String templateParam;

        private List(Builder builder) {
            this.detectContent = builder.detectContent;
            this.detectSignName = builder.detectSignName;
            this.detectTime = builder.detectTime;
            this.status = builder.status;
            this.successRate = builder.successRate;
            this.templateCode = builder.templateCode;
            this.templateParam = builder.templateParam;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return detectContent
         */
        public String getDetectContent() {
            return this.detectContent;
        }

        /**
         * @return detectSignName
         */
        public String getDetectSignName() {
            return this.detectSignName;
        }

        /**
         * @return detectTime
         */
        public String getDetectTime() {
            return this.detectTime;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return successRate
         */
        public String getSuccessRate() {
            return this.successRate;
        }

        /**
         * @return templateCode
         */
        public String getTemplateCode() {
            return this.templateCode;
        }

        /**
         * @return templateParam
         */
        public String getTemplateParam() {
            return this.templateParam;
        }

        public static final class Builder {
            private String detectContent; 
            private String detectSignName; 
            private String detectTime; 
            private Integer status; 
            private String successRate; 
            private String templateCode; 
            private String templateParam; 

            private Builder() {
            } 

            private Builder(List model) {
                this.detectContent = model.detectContent;
                this.detectSignName = model.detectSignName;
                this.detectTime = model.detectTime;
                this.status = model.status;
                this.successRate = model.successRate;
                this.templateCode = model.templateCode;
                this.templateParam = model.templateParam;
            } 

            /**
             * DetectContent.
             */
            public Builder detectContent(String detectContent) {
                this.detectContent = detectContent;
                return this;
            }

            /**
             * DetectSignName.
             */
            public Builder detectSignName(String detectSignName) {
                this.detectSignName = detectSignName;
                return this;
            }

            /**
             * DetectTime.
             */
            public Builder detectTime(String detectTime) {
                this.detectTime = detectTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * SuccessRate.
             */
            public Builder successRate(String successRate) {
                this.successRate = successRate;
                return this;
            }

            /**
             * TemplateCode.
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            /**
             * TemplateParam.
             */
            public Builder templateParam(String templateParam) {
                this.templateParam = templateParam;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
