// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypns20170620.models;

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
 * {@link ListSchemeResponseBody} extends {@link TeaModel}
 *
 * <p>ListSchemeResponseBody</p>
 */
public class ListSchemeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListSchemeResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSchemeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Data> getData() {
        return this.data;
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
        private String code; 
        private java.util.List<Data> data; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListSchemeResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

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
        public Builder data(java.util.List<Data> data) {
            this.data = data;
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
         * RequestId.
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

        public ListSchemeResponseBody build() {
            return new ListSchemeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSchemeResponseBody} extends {@link TeaModel}
     *
     * <p>ListSchemeResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplyTime")
        private Long applyTime;

        @com.aliyun.core.annotation.NameInMap("AuditDesc")
        private String auditDesc;

        @com.aliyun.core.annotation.NameInMap("BusinessTypeList")
        private java.util.List<Integer> businessTypeList;

        @com.aliyun.core.annotation.NameInMap("CompanyName")
        private String companyName;

        @com.aliyun.core.annotation.NameInMap("SchemeId")
        private Long schemeId;

        @com.aliyun.core.annotation.NameInMap("SchemeName")
        private String schemeName;

        @com.aliyun.core.annotation.NameInMap("SchemeType")
        private Integer schemeType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private Data(Builder builder) {
            this.applyTime = builder.applyTime;
            this.auditDesc = builder.auditDesc;
            this.businessTypeList = builder.businessTypeList;
            this.companyName = builder.companyName;
            this.schemeId = builder.schemeId;
            this.schemeName = builder.schemeName;
            this.schemeType = builder.schemeType;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return applyTime
         */
        public Long getApplyTime() {
            return this.applyTime;
        }

        /**
         * @return auditDesc
         */
        public String getAuditDesc() {
            return this.auditDesc;
        }

        /**
         * @return businessTypeList
         */
        public java.util.List<Integer> getBusinessTypeList() {
            return this.businessTypeList;
        }

        /**
         * @return companyName
         */
        public String getCompanyName() {
            return this.companyName;
        }

        /**
         * @return schemeId
         */
        public Long getSchemeId() {
            return this.schemeId;
        }

        /**
         * @return schemeName
         */
        public String getSchemeName() {
            return this.schemeName;
        }

        /**
         * @return schemeType
         */
        public Integer getSchemeType() {
            return this.schemeType;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long applyTime; 
            private String auditDesc; 
            private java.util.List<Integer> businessTypeList; 
            private String companyName; 
            private Long schemeId; 
            private String schemeName; 
            private Integer schemeType; 
            private Integer status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.applyTime = model.applyTime;
                this.auditDesc = model.auditDesc;
                this.businessTypeList = model.businessTypeList;
                this.companyName = model.companyName;
                this.schemeId = model.schemeId;
                this.schemeName = model.schemeName;
                this.schemeType = model.schemeType;
                this.status = model.status;
            } 

            /**
             * ApplyTime.
             */
            public Builder applyTime(Long applyTime) {
                this.applyTime = applyTime;
                return this;
            }

            /**
             * AuditDesc.
             */
            public Builder auditDesc(String auditDesc) {
                this.auditDesc = auditDesc;
                return this;
            }

            /**
             * BusinessTypeList.
             */
            public Builder businessTypeList(java.util.List<Integer> businessTypeList) {
                this.businessTypeList = businessTypeList;
                return this;
            }

            /**
             * CompanyName.
             */
            public Builder companyName(String companyName) {
                this.companyName = companyName;
                return this;
            }

            /**
             * SchemeId.
             */
            public Builder schemeId(Long schemeId) {
                this.schemeId = schemeId;
                return this;
            }

            /**
             * SchemeName.
             */
            public Builder schemeName(String schemeName) {
                this.schemeName = schemeName;
                return this;
            }

            /**
             * SchemeType.
             */
            public Builder schemeType(Integer schemeType) {
                this.schemeType = schemeType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
