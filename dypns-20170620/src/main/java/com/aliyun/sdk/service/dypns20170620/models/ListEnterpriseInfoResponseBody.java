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
 * {@link ListEnterpriseInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ListEnterpriseInfoResponseBody</p>
 */
public class ListEnterpriseInfoResponseBody extends TeaModel {
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

    private ListEnterpriseInfoResponseBody(Builder builder) {
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

    public static ListEnterpriseInfoResponseBody create() {
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

        private Builder(ListEnterpriseInfoResponseBody model) {
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

        public ListEnterpriseInfoResponseBody build() {
            return new ListEnterpriseInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEnterpriseInfoResponseBody} extends {@link TeaModel}
     *
     * <p>ListEnterpriseInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuditDesc")
        private String auditDesc;

        @com.aliyun.core.annotation.NameInMap("EnterpriseId")
        private Long enterpriseId;

        @com.aliyun.core.annotation.NameInMap("EnterpriseName")
        private String enterpriseName;

        @com.aliyun.core.annotation.NameInMap("ManagerContactNumber")
        private String managerContactNumber;

        @com.aliyun.core.annotation.NameInMap("ManagerName")
        private String managerName;

        @com.aliyun.core.annotation.NameInMap("OrganizationCode")
        private String organizationCode;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private Data(Builder builder) {
            this.auditDesc = builder.auditDesc;
            this.enterpriseId = builder.enterpriseId;
            this.enterpriseName = builder.enterpriseName;
            this.managerContactNumber = builder.managerContactNumber;
            this.managerName = builder.managerName;
            this.organizationCode = builder.organizationCode;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return auditDesc
         */
        public String getAuditDesc() {
            return this.auditDesc;
        }

        /**
         * @return enterpriseId
         */
        public Long getEnterpriseId() {
            return this.enterpriseId;
        }

        /**
         * @return enterpriseName
         */
        public String getEnterpriseName() {
            return this.enterpriseName;
        }

        /**
         * @return managerContactNumber
         */
        public String getManagerContactNumber() {
            return this.managerContactNumber;
        }

        /**
         * @return managerName
         */
        public String getManagerName() {
            return this.managerName;
        }

        /**
         * @return organizationCode
         */
        public String getOrganizationCode() {
            return this.organizationCode;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String auditDesc; 
            private Long enterpriseId; 
            private String enterpriseName; 
            private String managerContactNumber; 
            private String managerName; 
            private String organizationCode; 
            private Integer status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.auditDesc = model.auditDesc;
                this.enterpriseId = model.enterpriseId;
                this.enterpriseName = model.enterpriseName;
                this.managerContactNumber = model.managerContactNumber;
                this.managerName = model.managerName;
                this.organizationCode = model.organizationCode;
                this.status = model.status;
            } 

            /**
             * AuditDesc.
             */
            public Builder auditDesc(String auditDesc) {
                this.auditDesc = auditDesc;
                return this;
            }

            /**
             * EnterpriseId.
             */
            public Builder enterpriseId(Long enterpriseId) {
                this.enterpriseId = enterpriseId;
                return this;
            }

            /**
             * EnterpriseName.
             */
            public Builder enterpriseName(String enterpriseName) {
                this.enterpriseName = enterpriseName;
                return this;
            }

            /**
             * ManagerContactNumber.
             */
            public Builder managerContactNumber(String managerContactNumber) {
                this.managerContactNumber = managerContactNumber;
                return this;
            }

            /**
             * ManagerName.
             */
            public Builder managerName(String managerName) {
                this.managerName = managerName;
                return this;
            }

            /**
             * OrganizationCode.
             */
            public Builder organizationCode(String organizationCode) {
                this.organizationCode = organizationCode;
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
