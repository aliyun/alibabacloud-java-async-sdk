// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeKeyPairsRequest} extends {@link RequestModel}
 *
 * <p>DescribeKeyPairsRequest</p>
 */
public class DescribeKeyPairsRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 50, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("KeyPairFingerPrint")
    private String keyPairFingerPrint;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("KeyPairName")
    private String keyPairName;

    private DescribeKeyPairsRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.pageSize = builder.pageSize;
        this.tag = builder.tag;
        this.pageNumber = builder.pageNumber;
        this.regionId = builder.regionId;
        this.keyPairFingerPrint = builder.keyPairFingerPrint;
        this.resourceGroupId = builder.resourceGroupId;
        this.keyPairName = builder.keyPairName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeKeyPairsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return keyPairFingerPrint
     */
    public String getKeyPairFingerPrint() {
        return this.keyPairFingerPrint;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public static final class Builder extends Request.Builder<DescribeKeyPairsRequest, Builder> {
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private Integer pageSize; 
        private java.util.List < Tag> tag; 
        private Integer pageNumber; 
        private String regionId; 
        private String keyPairFingerPrint; 
        private String resourceGroupId; 
        private String keyPairName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeKeyPairsRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.pageSize = request.pageSize;
            this.tag = request.tag;
            this.pageNumber = request.pageNumber;
            this.regionId = request.regionId;
            this.keyPairFingerPrint = request.keyPairFingerPrint;
            this.resourceGroupId = request.resourceGroupId;
            this.keyPairName = request.keyPairName;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * The Alibaba cloud account.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The number of entries to return on each page. Maximum Value: 50
         * <p>
         * 
         * Default value: 10
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The list of tags.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The page number of the key pair list. Start value: 1
         * <p>
         * 
         * Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The region ID of the key pair. You can call [DescribeRegions](~~ 25609 ~~) to view the latest region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The fingerprint of the key pair. According to the public key fingerprint format defined in RFC4716, MD5 Information Digest Algorithm is adopted. For more information, see [RFC4716](https://tools.ietf.org/html/rfc4716).
         */
        public Builder keyPairFingerPrint(String keyPairFingerPrint) {
            this.putQueryParameter("KeyPairFingerPrint", keyPairFingerPrint);
            this.keyPairFingerPrint = keyPairFingerPrint;
            return this;
        }

        /**
         * The ID of the resource group to which the key pair belongs. When you use this parameter to filter resources, the number of resources cannot exceed 1,000.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The name of the key pair. Fuzzy search of regular expressions is supported. Use * to match subexpressions. Example:
         * <p>
         * 
         * -"* SshKey": queries the key pair names that end with SshKey, including SshKey.
         * -Speechshkey * ": queries the names of key pairs that start with SshKey, including SshKey.
         * -"* SshKey *": the key pair with SshKey in the middle of the query name, including SshKey.
         * -Speechshkey": exactly matches the SshKey.
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
            return this;
        }

        @Override
        public DescribeKeyPairsRequest build() {
            return new DescribeKeyPairsRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * 密钥对的标签键。N的取值范围：1~20
             * <p>
             * 
             * 使用一个标签过滤资源，查询到该标签下的资源数量不能超过1000个；使用多个标签过滤资源，查询到同时绑定了多个标签的资源数量不能超过1000个。如果资源数量超过1000个，请使用[ListTagResources](~~110425~~)接口进行查询。
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 密钥对的标签值。N的取值范围：1~20
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
