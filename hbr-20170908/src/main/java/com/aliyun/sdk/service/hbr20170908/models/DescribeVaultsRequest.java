// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVaultsRequest} extends {@link RequestModel}
 *
 * <p>DescribeVaultsRequest</p>
 */
public class DescribeVaultsRequest extends Request {
    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("Status")
    private String status;

    @Body
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("VaultId")
    private String vaultId;

    @Query
    @NameInMap("VaultRegionId")
    private String vaultRegionId;

    @Query
    @NameInMap("VaultType")
    private String vaultType;

    private DescribeVaultsRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceGroupId = builder.resourceGroupId;
        this.status = builder.status;
        this.tag = builder.tag;
        this.vaultId = builder.vaultId;
        this.vaultRegionId = builder.vaultRegionId;
        this.vaultType = builder.vaultType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVaultsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return vaultId
     */
    public String getVaultId() {
        return this.vaultId;
    }

    /**
     * @return vaultRegionId
     */
    public String getVaultRegionId() {
        return this.vaultRegionId;
    }

    /**
     * @return vaultType
     */
    public String getVaultType() {
        return this.vaultType;
    }

    public static final class Builder extends Request.Builder<DescribeVaultsRequest, Builder> {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String resourceGroupId; 
        private String status; 
        private java.util.List < Tag> tag; 
        private String vaultId; 
        private String vaultRegionId; 
        private String vaultType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVaultsRequest response) {
            super(response);
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.resourceGroupId = response.resourceGroupId;
            this.status = response.status;
            this.tag = response.tag;
            this.vaultId = response.vaultId;
            this.vaultRegionId = response.vaultRegionId;
            this.vaultType = response.vaultType;
        } 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putBodyParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * VaultId.
         */
        public Builder vaultId(String vaultId) {
            this.putQueryParameter("VaultId", vaultId);
            this.vaultId = vaultId;
            return this;
        }

        /**
         * VaultRegionId.
         */
        public Builder vaultRegionId(String vaultRegionId) {
            this.putQueryParameter("VaultRegionId", vaultRegionId);
            this.vaultRegionId = vaultRegionId;
            return this;
        }

        /**
         * VaultType.
         */
        public Builder vaultType(String vaultType) {
            this.putQueryParameter("VaultType", vaultType);
            this.vaultType = vaultType;
            return this;
        }

        @Override
        public DescribeVaultsRequest build() {
            return new DescribeVaultsRequest(this);
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
