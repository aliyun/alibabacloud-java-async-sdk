// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainNamesOfVersionRequest} extends {@link RequestModel}
 *
 * <p>DescribeDomainNamesOfVersionRequest</p>
 */
public class DescribeDomainNamesOfVersionRequest extends Request {
    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageIndex")
    private Integer pageIndex;

    @Query
    @NameInMap("PageSize")
    private String pageSize;

    @Query
    @NameInMap("VersionId")
    @Validation(required = true)
    private String versionId;

    private DescribeDomainNamesOfVersionRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainNamesOfVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder extends Request.Builder<DescribeDomainNamesOfVersionRequest, Builder> {
        private Long ownerId; 
        private Integer pageIndex; 
        private String pageSize; 
        private String versionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDomainNamesOfVersionRequest response) {
            super(response);
            this.ownerId = response.ownerId;
            this.pageIndex = response.pageIndex;
            this.pageSize = response.pageSize;
            this.versionId = response.versionId;
        } 

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * PageIndex.
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putQueryParameter("PageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * VersionId.
         */
        public Builder versionId(String versionId) {
            this.putQueryParameter("VersionId", versionId);
            this.versionId = versionId;
            return this;
        }

        @Override
        public DescribeDomainNamesOfVersionRequest build() {
            return new DescribeDomainNamesOfVersionRequest(this);
        } 

    } 

}
