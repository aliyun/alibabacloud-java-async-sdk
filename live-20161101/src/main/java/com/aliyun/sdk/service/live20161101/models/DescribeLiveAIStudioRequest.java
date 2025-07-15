// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeLiveAIStudioRequest} extends {@link RequestModel}
 *
 * <p>DescribeLiveAIStudioRequest</p>
 */
public class DescribeLiveAIStudioRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StudioId")
    private String studioId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StudioName")
    private String studioName;

    private DescribeLiveAIStudioRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.studioId = builder.studioId;
        this.studioName = builder.studioName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveAIStudioRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return studioId
     */
    public String getStudioId() {
        return this.studioId;
    }

    /**
     * @return studioName
     */
    public String getStudioName() {
        return this.studioName;
    }

    public static final class Builder extends Request.Builder<DescribeLiveAIStudioRequest, Builder> {
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String studioId; 
        private String studioName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLiveAIStudioRequest request) {
            super(request);
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.studioId = request.studioId;
            this.studioName = request.studioName;
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
         * <p>The page number. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10. Valid values: 1 to 50.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the virtual studio template that you want to query. This parameter is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>dbe61b87-db9a-448f-8757-a875edb3f944</p>
         */
        public Builder studioId(String studioId) {
            this.putQueryParameter("StudioId", studioId);
            this.studioId = studioId;
            return this;
        }

        /**
         * <p>The name of the virtual studio template.</p>
         * 
         * <strong>example:</strong>
         * <p>sub02</p>
         */
        public Builder studioName(String studioName) {
            this.putQueryParameter("StudioName", studioName);
            this.studioName = studioName;
            return this;
        }

        @Override
        public DescribeLiveAIStudioRequest build() {
            return new DescribeLiveAIStudioRequest(this);
        } 

    } 

}
