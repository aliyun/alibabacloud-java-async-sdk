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
 * {@link DescribeCloudVendorAccountAKListRequest} extends {@link RequestModel}
 *
 * <p>DescribeCloudVendorAccountAKListRequest</p>
 */
public class DescribeCloudVendorAccountAKListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthIds")
    private String authIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubAccountName")
    private String subAccountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VendorAuthAlias")
    private String vendorAuthAlias;

    private DescribeCloudVendorAccountAKListRequest(Builder builder) {
        super(builder);
        this.authIds = builder.authIds;
        this.currentPage = builder.currentPage;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
        this.subAccountName = builder.subAccountName;
        this.vendorAuthAlias = builder.vendorAuthAlias;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudVendorAccountAKListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authIds
     */
    public String getAuthIds() {
        return this.authIds;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return subAccountName
     */
    public String getSubAccountName() {
        return this.subAccountName;
    }

    /**
     * @return vendorAuthAlias
     */
    public String getVendorAuthAlias() {
        return this.vendorAuthAlias;
    }

    public static final class Builder extends Request.Builder<DescribeCloudVendorAccountAKListRequest, Builder> {
        private String authIds; 
        private Integer currentPage; 
        private String lang; 
        private Integer pageSize; 
        private Integer status; 
        private String subAccountName; 
        private String vendorAuthAlias; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCloudVendorAccountAKListRequest request) {
            super(request);
            this.authIds = request.authIds;
            this.currentPage = request.currentPage;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.status = request.status;
            this.subAccountName = request.subAccountName;
            this.vendorAuthAlias = request.vendorAuthAlias;
        } 

        /**
         * <p>The unique ID of the AccessKey pair.</p>
         * 
         * <strong>example:</strong>
         * <p>2624</p>
         */
        public Builder authIds(String authIds) {
            this.putQueryParameter("AuthIds", authIds);
            this.authIds = authIds;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The status of the AccessKey pair. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: enabled</li>
         * <li><strong>1</strong>: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The username of the sub-account of the cloud service provider to which the AccessKey pair belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>AlibabaCloud_***</p>
         */
        public Builder subAccountName(String subAccountName) {
            this.putQueryParameter("SubAccountName", subAccountName);
            this.subAccountName = subAccountName;
            return this;
        }

        /**
         * <p>The name of the AccessKey pair.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder vendorAuthAlias(String vendorAuthAlias) {
            this.putQueryParameter("VendorAuthAlias", vendorAuthAlias);
            this.vendorAuthAlias = vendorAuthAlias;
            return this;
        }

        @Override
        public DescribeCloudVendorAccountAKListRequest build() {
            return new DescribeCloudVendorAccountAKListRequest(this);
        } 

    } 

}
