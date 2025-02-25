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
 * {@link AddInstallCodeRequest} extends {@link RequestModel}
 *
 * <p>AddInstallCodeRequest</p>
 */
public class AddInstallCodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpiredDate")
    private Long expiredDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private Long groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OnlyImage")
    private Boolean onlyImage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Os")
    private String os;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivateLinkId")
    private Long privateLinkId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyCluster")
    private String proxyCluster;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VendorName")
    private String vendorName;

    private AddInstallCodeRequest(Builder builder) {
        super(builder);
        this.expiredDate = builder.expiredDate;
        this.groupId = builder.groupId;
        this.onlyImage = builder.onlyImage;
        this.os = builder.os;
        this.privateLinkId = builder.privateLinkId;
        this.proxyCluster = builder.proxyCluster;
        this.vendorName = builder.vendorName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddInstallCodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return expiredDate
     */
    public Long getExpiredDate() {
        return this.expiredDate;
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return onlyImage
     */
    public Boolean getOnlyImage() {
        return this.onlyImage;
    }

    /**
     * @return os
     */
    public String getOs() {
        return this.os;
    }

    /**
     * @return privateLinkId
     */
    public Long getPrivateLinkId() {
        return this.privateLinkId;
    }

    /**
     * @return proxyCluster
     */
    public String getProxyCluster() {
        return this.proxyCluster;
    }

    /**
     * @return vendorName
     */
    public String getVendorName() {
        return this.vendorName;
    }

    public static final class Builder extends Request.Builder<AddInstallCodeRequest, Builder> {
        private Long expiredDate; 
        private Long groupId; 
        private Boolean onlyImage; 
        private String os; 
        private Long privateLinkId; 
        private String proxyCluster; 
        private String vendorName; 

        private Builder() {
            super();
        } 

        private Builder(AddInstallCodeRequest request) {
            super(request);
            this.expiredDate = request.expiredDate;
            this.groupId = request.groupId;
            this.onlyImage = request.onlyImage;
            this.os = request.os;
            this.privateLinkId = request.privateLinkId;
            this.proxyCluster = request.proxyCluster;
            this.vendorName = request.vendorName;
        } 

        /**
         * <p>The validity period of the installation command. The value is a 13-digit timestamp.</p>
         * <blockquote>
         * <p> The installation command is valid only within the validity period. An expired installation command cannot be used to install the Security Center agent.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1680257463853</p>
         */
        public Builder expiredDate(Long expiredDate) {
            this.putQueryParameter("ExpiredDate", expiredDate);
            this.expiredDate = expiredDate;
            return this;
        }

        /**
         * <p>The ID of the asset group to which you want to add the asset.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeAllGroups~~">DescribeAllGroups</a> operation to query the IDs of asset groups.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>8076980</p>
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>Specifies whether to create an image. Default value: <strong>false</strong>. Valid values:</p>
         * <ul>
         * <li><strong>false</strong>: does not create an image.</li>
         * <li><strong>true</strong>: creates an image.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder onlyImage(Boolean onlyImage) {
            this.putQueryParameter("OnlyImage", onlyImage);
            this.onlyImage = onlyImage;
            return this;
        }

        /**
         * <p>The operating system of the asset. Default value: <strong>linux</strong>. Valid values:</p>
         * <ul>
         * <li><strong>linux</strong></li>
         * <li><strong>windows</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>linux</p>
         */
        public Builder os(String os) {
            this.putQueryParameter("Os", os);
            this.os = os;
            return this;
        }

        /**
         * <p>The ID of the PrivateLink endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>72845</p>
         */
        public Builder privateLinkId(Long privateLinkId) {
            this.putQueryParameter("PrivateLinkId", privateLinkId);
            this.privateLinkId = privateLinkId;
            return this;
        }

        /**
         * <p>The name of the proxy cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>proxy_test</p>
         */
        public Builder proxyCluster(String proxyCluster) {
            this.putQueryParameter("ProxyCluster", proxyCluster);
            this.proxyCluster = proxyCluster;
            return this;
        }

        /**
         * <p>The name of the service provider for the asset. Default value: <strong>ALIYUN</strong>.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeVendorList~~">DescribeVendorList</a> operation to query the names of service providers.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ALIYUN</p>
         */
        public Builder vendorName(String vendorName) {
            this.putQueryParameter("VendorName", vendorName);
            this.vendorName = vendorName;
            return this;
        }

        @Override
        public AddInstallCodeRequest build() {
            return new AddInstallCodeRequest(this);
        } 

    } 

}
