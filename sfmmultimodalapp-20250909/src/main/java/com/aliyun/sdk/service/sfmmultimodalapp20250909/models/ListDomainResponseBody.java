// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sfmmultimodalapp20250909.models;

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
 * {@link ListDomainResponseBody} extends {@link TeaModel}
 *
 * <p>ListDomainResponseBody</p>
 */
public class ListDomainResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainInfoList")
    private java.util.List<DomainInfoList> domainInfoList;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListDomainResponseBody(Builder builder) {
        this.domainInfoList = builder.domainInfoList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDomainResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainInfoList
     */
    public java.util.List<DomainInfoList> getDomainInfoList() {
        return this.domainInfoList;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<DomainInfoList> domainInfoList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListDomainResponseBody model) {
            this.domainInfoList = model.domainInfoList;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * DomainInfoList.
         */
        public Builder domainInfoList(java.util.List<DomainInfoList> domainInfoList) {
            this.domainInfoList = domainInfoList;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>EC4762F9-8109-5DE0-A3E2-27957A4F4183</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDomainResponseBody build() {
            return new ListDomainResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDomainResponseBody} extends {@link TeaModel}
     *
     * <p>ListDomainResponseBody</p>
     */
    public static class ToolList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ToolCode")
        private String toolCode;

        @com.aliyun.core.annotation.NameInMap("ToolName")
        private String toolName;

        private ToolList(Builder builder) {
            this.toolCode = builder.toolCode;
            this.toolName = builder.toolName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ToolList create() {
            return builder().build();
        }

        /**
         * @return toolCode
         */
        public String getToolCode() {
            return this.toolCode;
        }

        /**
         * @return toolName
         */
        public String getToolName() {
            return this.toolName;
        }

        public static final class Builder {
            private String toolCode; 
            private String toolName; 

            private Builder() {
            } 

            private Builder(ToolList model) {
                this.toolCode = model.toolCode;
                this.toolName = model.toolName;
            } 

            /**
             * ToolCode.
             */
            public Builder toolCode(String toolCode) {
                this.toolCode = toolCode;
                return this;
            }

            /**
             * ToolName.
             */
            public Builder toolName(String toolName) {
                this.toolName = toolName;
                return this;
            }

            public ToolList build() {
                return new ToolList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDomainResponseBody} extends {@link TeaModel}
     *
     * <p>ListDomainResponseBody</p>
     */
    public static class DomainInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainCode")
        private String domainCode;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("ToolCount")
        private Integer toolCount;

        @com.aliyun.core.annotation.NameInMap("ToolList")
        private java.util.List<ToolList> toolList;

        private DomainInfoList(Builder builder) {
            this.domainCode = builder.domainCode;
            this.domainName = builder.domainName;
            this.toolCount = builder.toolCount;
            this.toolList = builder.toolList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainInfoList create() {
            return builder().build();
        }

        /**
         * @return domainCode
         */
        public String getDomainCode() {
            return this.domainCode;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return toolCount
         */
        public Integer getToolCount() {
            return this.toolCount;
        }

        /**
         * @return toolList
         */
        public java.util.List<ToolList> getToolList() {
            return this.toolList;
        }

        public static final class Builder {
            private String domainCode; 
            private String domainName; 
            private Integer toolCount; 
            private java.util.List<ToolList> toolList; 

            private Builder() {
            } 

            private Builder(DomainInfoList model) {
                this.domainCode = model.domainCode;
                this.domainName = model.domainName;
                this.toolCount = model.toolCount;
                this.toolList = model.toolList;
            } 

            /**
             * DomainCode.
             */
            public Builder domainCode(String domainCode) {
                this.domainCode = domainCode;
                return this;
            }

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * ToolCount.
             */
            public Builder toolCount(Integer toolCount) {
                this.toolCount = toolCount;
                return this;
            }

            /**
             * ToolList.
             */
            public Builder toolList(java.util.List<ToolList> toolList) {
                this.toolList = toolList;
                return this;
            }

            public DomainInfoList build() {
                return new DomainInfoList(this);
            } 

        } 

    }
}
