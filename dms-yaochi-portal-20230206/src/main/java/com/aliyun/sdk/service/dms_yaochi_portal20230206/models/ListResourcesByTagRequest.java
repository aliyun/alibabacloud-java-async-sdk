// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_yaochi_portal20230206.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourcesByTagRequest} extends {@link RequestModel}
 *
 * <p>ListResourcesByTagRequest</p>
 */
public class ListResourcesByTagRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("TagKeys")
    private java.util.List < String > tagKeys;

    @Query
    @NameInMap("TagValues")
    private java.util.List < String > tagValues;

    private ListResourcesByTagRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.tagKeys = builder.tagKeys;
        this.tagValues = builder.tagValues;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourcesByTagRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return tagKeys
     */
    public java.util.List < String > getTagKeys() {
        return this.tagKeys;
    }

    /**
     * @return tagValues
     */
    public java.util.List < String > getTagValues() {
        return this.tagValues;
    }

    public static final class Builder extends Request.Builder<ListResourcesByTagRequest, Builder> {
        private String regionId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List < String > tagKeys; 
        private java.util.List < String > tagValues; 

        private Builder() {
            super();
        } 

        private Builder(ListResourcesByTagRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.tagKeys = request.tagKeys;
            this.tagValues = request.tagValues;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
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
         * TagKeys.
         */
        public Builder tagKeys(java.util.List < String > tagKeys) {
            this.putQueryParameter("TagKeys", tagKeys);
            this.tagKeys = tagKeys;
            return this;
        }

        /**
         * TagValues.
         */
        public Builder tagValues(java.util.List < String > tagValues) {
            this.putQueryParameter("TagValues", tagValues);
            this.tagValues = tagValues;
            return this;
        }

        @Override
        public ListResourcesByTagRequest build() {
            return new ListResourcesByTagRequest(this);
        } 

    } 

}
