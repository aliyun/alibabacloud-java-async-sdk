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
 * {@link RefreshAssetsRequest} extends {@link RequestModel}
 *
 * <p>RefreshAssetsRequest</p>
 */
public class RefreshAssetsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetType")
    private String assetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudAssetSubType")
    private Integer cloudAssetSubType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudAssetType")
    private Integer cloudAssetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryAccountId")
    private Long resourceDirectoryAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Vendor")
    private Integer vendor;

    private RefreshAssetsRequest(Builder builder) {
        super(builder);
        this.assetType = builder.assetType;
        this.cloudAssetSubType = builder.cloudAssetSubType;
        this.cloudAssetType = builder.cloudAssetType;
        this.resourceDirectoryAccountId = builder.resourceDirectoryAccountId;
        this.vendor = builder.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshAssetsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assetType
     */
    public String getAssetType() {
        return this.assetType;
    }

    /**
     * @return cloudAssetSubType
     */
    public Integer getCloudAssetSubType() {
        return this.cloudAssetSubType;
    }

    /**
     * @return cloudAssetType
     */
    public Integer getCloudAssetType() {
        return this.cloudAssetType;
    }

    /**
     * @return resourceDirectoryAccountId
     */
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    /**
     * @return vendor
     */
    public Integer getVendor() {
        return this.vendor;
    }

    public static final class Builder extends Request.Builder<RefreshAssetsRequest, Builder> {
        private String assetType; 
        private Integer cloudAssetSubType; 
        private Integer cloudAssetType; 
        private Long resourceDirectoryAccountId; 
        private Integer vendor; 

        private Builder() {
            super();
        } 

        private Builder(RefreshAssetsRequest request) {
            super(request);
            this.assetType = request.assetType;
            this.cloudAssetSubType = request.cloudAssetSubType;
            this.cloudAssetType = request.cloudAssetType;
            this.resourceDirectoryAccountId = request.resourceDirectoryAccountId;
            this.vendor = request.vendor;
        } 

        /**
         * <p>The type of asset to synchronize. Default value: <strong>ecs</strong>. Valid values:</p>
         * <ul>
         * <li><strong>cloud_product</strong>: cloud product</li>
         * <li><strong>ecs</strong>: server</li>
         * <li><strong>container_image</strong>: container image</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_product</p>
         */
        public Builder assetType(String assetType) {
            this.putQueryParameter("AssetType", assetType);
            this.assetType = assetType;
            return this;
        }

        /**
         * <p>The subtype of the cloud product.</p>
         * <blockquote>
         * <p>Refer to the following list for valid values.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder cloudAssetSubType(Integer cloudAssetSubType) {
            this.putQueryParameter("CloudAssetSubType", cloudAssetSubType);
            this.cloudAssetSubType = cloudAssetSubType;
            return this;
        }

        /**
         * <p>The type of cloud product. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: server</li>
         * <li><strong>1</strong>: load balancing</li>
         * <li><strong>3</strong>: ApsaraDB RDS database</li>
         * <li><strong>4</strong>: ApsaraDB for MongoDB database</li>
         * <li><strong>5</strong>: Tair (Redis® OSS-Compatible) database</li>
         * <li><strong>6</strong>: Container Registry</li>
         * <li><strong>8</strong>: container service for Kubernetes</li>
         * <li><strong>9</strong>: VPC</li>
         * <li><strong>11</strong>: ActionTrail</li>
         * <li><strong>12</strong>: CDN</li>
         * <li><strong>13</strong>: Certificate Management Service (formerly SSL Certificates Service)</li>
         * <li><strong>14</strong>: Apsara Devops</li>
         * <li><strong>15</strong>: access control</li>
         * <li><strong>16</strong>: Anti-DDoS</li>
         * <li><strong>17</strong>: Web Application Firewall</li>
         * <li><strong>18</strong>: OSS</li>
         * <li><strong>19</strong>: cloud-native relational database PolarDB</li>
         * <li><strong>20</strong>: ApsaraDB RDS for PostgreSQL database</li>
         * <li><strong>21</strong>: Microservices Engine</li>
         * <li><strong>22</strong>: File Storage NAS</li>
         * <li><strong>23</strong>: Data Security Center</li>
         * <li><strong>24</strong>: EIP</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder cloudAssetType(Integer cloudAssetType) {
            this.putQueryParameter("CloudAssetType", cloudAssetType);
            this.cloudAssetType = cloudAssetType;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account of the member accounts in the resource directory.</p>
         * <blockquote>
         * <p>Call the <a href="~~DescribeMonitorAccounts~~">DescribeMonitorAccounts</a> operation to obtain this parameter.</p>
         * </blockquote>
         */
        public Builder resourceDirectoryAccountId(Long resourceDirectoryAccountId) {
            this.putQueryParameter("ResourceDirectoryAccountId", resourceDirectoryAccountId);
            this.resourceDirectoryAccountId = resourceDirectoryAccountId;
            return this;
        }

        /**
         * <p>The server vendor. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Alibaba Cloud asset</li>
         * <li><strong>1</strong>: asset outside the cloud</li>
         * <li><strong>2</strong>: IDC asset</li>
         * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, <strong>7</strong>: third-party cloud asset</li>
         * <li><strong>8</strong>: lightweight asset</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder vendor(Integer vendor) {
            this.putQueryParameter("Vendor", vendor);
            this.vendor = vendor;
            return this;
        }

        @Override
        public RefreshAssetsRequest build() {
            return new RefreshAssetsRequest(this);
        } 

    } 

}
