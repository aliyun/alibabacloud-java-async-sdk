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
         * <p>The data list.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The metadata of the response structure.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder metadata(Object metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6000EE23-274B-4E07-A697-FF2E999520A4</p>
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
             * <p>The time when the account was created. The format is YYYY-MM-DD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-12-30 12:00:00</p>
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * <p>The account ID of the MA user corresponding to the account.</p>
             * 
             * <strong>example:</strong>
             * <p>1232121</p>
             */
            public Builder fundAccountAdminAccountId(String fundAccountAdminAccountId) {
                this.fundAccountAdminAccountId = fundAccountAdminAccountId;
                return this;
            }

            /**
             * <p>The username of the MA user corresponding to the account.</p>
             * 
             * <strong>example:</strong>
             * <p>Yun\&quot;s account</p>
             */
            public Builder fundAccountAdminAccountName(String fundAccountAdminAccountName) {
                this.fundAccountAdminAccountName = fundAccountAdminAccountName;
                return this;
            }

            /**
             * <p>The fund account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1022231</p>
             */
            public Builder fundAccountId(String fundAccountId) {
                this.fundAccountId = fundAccountId;
                return this;
            }

            /**
             * <p>The fund account name.</p>
             * 
             * <strong>example:</strong>
             * <p>Yun\&quot;s account</p>
             */
            public Builder fundAccountName(String fundAccountName) {
                this.fundAccountName = fundAccountName;
                return this;
            }

            /**
             * <p>The account ID of the fund account owner.</p>
             * 
             * <strong>example:</strong>
             * <p>132123211</p>
             */
            public Builder fundAccountOwnerAccountId(String fundAccountOwnerAccountId) {
                this.fundAccountOwnerAccountId = fundAccountOwnerAccountId;
                return this;
            }

            /**
             * <p>The account status. Valid values:</p>
             * <ul>
             * <li>VALID: Valid.</li>
             * <li>FROZEN: Frozen. </li>
             * <li>CLOSED: Closed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VALID</p>
             */
            public Builder fundAccountStatus(String fundAccountStatus) {
                this.fundAccountStatus = fundAccountStatus;
                return this;
            }

            /**
             * <p>The account type. Valid values:</p>
             * <ul>
             * <li>DIRECT_USER: Alibaba Cloud direct customer account. </li>
             * <li>RESELLER_QUOTA: Ecosystem account.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DIRECT_USER</p>
             */
            public Builder fundAccountType(String fundAccountType) {
                this.fundAccountType = fundAccountType;
                return this;
            }

            /**
             * <p>The primary marketplace.</p>
             * 
             * <strong>example:</strong>
             * <p>2684210001</p>
             */
            public Builder nbid(String nbid) {
                this.nbid = nbid;
                return this;
            }

            /**
             * <p>The set of account permissions owned by the user. Valid values:</p>
             * <ul>
             * <li>using: Use.</li>
             * <li>manage: Manage.</li>
             * <li>owner: Own.</li>
             * </ul>
             */
            public Builder permissions(java.util.List<String> permissions) {
                this.permissions = permissions;
                return this;
            }

            /**
             * <p>The site.</p>
             * 
             * <strong>example:</strong>
             * <p>26842</p>
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
