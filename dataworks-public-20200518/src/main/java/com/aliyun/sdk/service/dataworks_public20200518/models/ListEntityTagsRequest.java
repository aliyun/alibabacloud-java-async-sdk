// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEntityTagsRequest} extends {@link RequestModel}
 *
 * <p>ListEntityTagsRequest</p>
 */
public class ListEntityTagsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("QualifiedName")
    @Validation(required = true)
    private String qualifiedName;

    private ListEntityTagsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.qualifiedName = builder.qualifiedName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEntityTagsRequest create() {
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
     * @return qualifiedName
     */
    public String getQualifiedName() {
        return this.qualifiedName;
    }

    public static final class Builder extends Request.Builder<ListEntityTagsRequest, Builder> {
        private String regionId; 
        private String qualifiedName; 

        private Builder() {
            super();
        } 

        private Builder(ListEntityTagsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.qualifiedName = request.qualifiedName;
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
         * QualifiedName.
         */
        public Builder qualifiedName(String qualifiedName) {
            this.putQueryParameter("QualifiedName", qualifiedName);
            this.qualifiedName = qualifiedName;
            return this;
        }

        @Override
        public ListEntityTagsRequest build() {
            return new ListEntityTagsRequest(this);
        } 

    } 

}
