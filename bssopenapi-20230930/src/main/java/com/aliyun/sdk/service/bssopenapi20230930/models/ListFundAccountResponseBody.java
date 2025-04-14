// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20230930.models;

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
 * {@link ListFundAccountResponseBody} extends {@link TeaModel}
 *
 * <p>ListFundAccountResponseBody</p>
 */
public class ListFundAccountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Metadata")
    private Object metadata;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListFundAccountResponseBody(Builder builder) {
        this.data = builder.data;
        this.metadata = builder.metadata;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFundAccountResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return metadata
     */
    public Object getMetadata() {
        return this.metadata;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private Object metadata; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListFundAccountResponseBody model) {
            this.data = model.data;
            this.metadata = model.metadata;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Metadata.
         */
        public Builder metadata(Object metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListFundAccountResponseBody build() {
            return new ListFundAccountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListFundAccountResponseBody} extends {@link TeaModel}
     *
     * <p>ListFundAccountResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("FundAccountAdminAccountId")
        private String fundAccountAdminAccountId;

        @com.aliyun.core.annotation.NameInMap("FundAccountAdminAccountName")
        private String fundAccountAdminAccountName;

        @com.aliyun.core.annotation.NameInMap("FundAccountId")
        private String fundAccountId;

        @com.aliyun.core.annotation.NameInMap("FundAccountName")
        private String fundAccountName;

        @com.aliyun.core.annotation.NameInMap("FundAccountOwnerAccountId")
        private String fundAccountOwnerAccountId;

        @com.aliyun.core.annotation.NameInMap("FundAccountStatus")
        private String fundAccountStatus;

        @com.aliyun.core.annotation.NameInMap("FundAccountType")
        private String fundAccountType;

        @com.aliyun.core.annotation.NameInMap("Nbid")
        private String nbid;

        @com.aliyun.core.annotation.NameInMap("Permissions")
        private java.util.List<String> permissions;

        @com.aliyun.core.annotation.NameInMap("Site")
        private String site;

        private Data(Builder builder) {
            this.createDate = builder.createDate;
            this.fundAccountAdminAccountId = builder.fundAccountAdminAccountId;
            this.fundAccountAdminAccountName = builder.fundAccountAdminAccountName;
            this.fundAccountId = builder.fundAccountId;
            this.fundAccountName = builder.fundAccountName;
            this.fundAccountOwnerAccountId = builder.fundAccountOwnerAccountId;
            this.fundAccountStatus = builder.fundAccountStatus;
            this.fundAccountType = builder.fundAccountType;
            this.nbid = builder.nbid;
            this.permissions = builder.permissions;
            this.site = builder.site;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        /**
         * @return fundAccountAdminAccountId
         */
        public String getFundAccountAdminAccountId() {
            return this.fundAccountAdminAccountId;
        }

        /**
         * @return fundAccountAdminAccountName
         */
        public String getFundAccountAdminAccountName() {
            return this.fundAccountAdminAccountName;
        }

        /**
         * @return fundAccountId
         */
        public String getFundAccountId() {
            return this.fundAccountId;
        }

        /**
         * @return fundAccountName
         */
        public String getFundAccountName() {
            return this.fundAccountName;
        }

        /**
         * @return fundAccountOwnerAccountId
         */
        public String getFundAccountOwnerAccountId() {
            return this.fundAccountOwnerAccountId;
        }

        /**
         * @return fundAccountStatus
         */
        public String getFundAccountStatus() {
            return this.fundAccountStatus;
        }

        /**
         * @return fundAccountType
         */
        public String getFundAccountType() {
            return this.fundAccountType;
        }

        /**
         * @return nbid
         */
        public String getNbid() {
            return this.nbid;
        }

        /**
         * @return permissions
         */
        public java.util.List<String> getPermissions() {
            return this.permissions;
        }

        /**
         * @return site
         */
        public String getSite() {
            return this.site;
        }

        public static final class Builder {
            private String createDate; 
            private String fundAccountAdminAccountId; 
            private String fundAccountAdminAccountName; 
            private String fundAccountId; 
            private String fundAccountName; 
            private String fundAccountOwnerAccountId; 
            private String fundAccountStatus; 
            private String fundAccountType; 
            private String nbid; 
            private java.util.List<String> permissions; 
            private String site; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createDate = model.createDate;
                this.fundAccountAdminAccountId = model.fundAccountAdminAccountId;
                this.fundAccountAdminAccountName = model.fundAccountAdminAccountName;
                this.fundAccountId = model.fundAccountId;
                this.fundAccountName = model.fundAccountName;
                this.fundAccountOwnerAccountId = model.fundAccountOwnerAccountId;
                this.fundAccountStatus = model.fundAccountStatus;
                this.fundAccountType = model.fundAccountType;
                this.nbid = model.nbid;
                this.permissions = model.permissions;
                this.site = model.site;
            } 

            /**
             * CreateDate.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * FundAccountAdminAccountId.
             */
            public Builder fundAccountAdminAccountId(String fundAccountAdminAccountId) {
                this.fundAccountAdminAccountId = fundAccountAdminAccountId;
                return this;
            }

            /**
             * FundAccountAdminAccountName.
             */
            public Builder fundAccountAdminAccountName(String fundAccountAdminAccountName) {
                this.fundAccountAdminAccountName = fundAccountAdminAccountName;
                return this;
            }

            /**
             * FundAccountId.
             */
            public Builder fundAccountId(String fundAccountId) {
                this.fundAccountId = fundAccountId;
                return this;
            }

            /**
             * FundAccountName.
             */
            public Builder fundAccountName(String fundAccountName) {
                this.fundAccountName = fundAccountName;
                return this;
            }

            /**
             * FundAccountOwnerAccountId.
             */
            public Builder fundAccountOwnerAccountId(String fundAccountOwnerAccountId) {
                this.fundAccountOwnerAccountId = fundAccountOwnerAccountId;
                return this;
            }

            /**
             * FundAccountStatus.
             */
            public Builder fundAccountStatus(String fundAccountStatus) {
                this.fundAccountStatus = fundAccountStatus;
                return this;
            }

            /**
             * FundAccountType.
             */
            public Builder fundAccountType(String fundAccountType) {
                this.fundAccountType = fundAccountType;
                return this;
            }

            /**
             * Nbid.
             */
            public Builder nbid(String nbid) {
                this.nbid = nbid;
                return this;
            }

            /**
             * Permissions.
             */
            public Builder permissions(java.util.List<String> permissions) {
                this.permissions = permissions;
                return this;
            }

            /**
             * Site.
             */
            public Builder site(String site) {
                this.site = site;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
