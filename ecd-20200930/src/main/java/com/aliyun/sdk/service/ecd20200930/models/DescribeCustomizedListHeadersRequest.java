// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustomizedListHeadersRequest} extends {@link RequestModel}
 *
 * <p>DescribeCustomizedListHeadersRequest</p>
 */
public class DescribeCustomizedListHeadersRequest extends Request {
    @Query
    @NameInMap("LangType")
    private String langType;

    @Query
    @NameInMap("ListType")
    private String listType;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DescribeCustomizedListHeadersRequest(Builder builder) {
        super(builder);
        this.langType = builder.langType;
        this.listType = builder.listType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomizedListHeadersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return langType
     */
    public String getLangType() {
        return this.langType;
    }

    /**
     * @return listType
     */
    public String getListType() {
        return this.listType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeCustomizedListHeadersRequest, Builder> {
        private String langType; 
        private String listType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCustomizedListHeadersRequest request) {
            super(request);
            this.langType = request.langType;
            this.listType = request.listType;
            this.regionId = request.regionId;
        } 

        /**
         * The language in which the exported cloud desktop list is displayed.
         */
        public Builder langType(String langType) {
            this.putQueryParameter("LangType", langType);
            this.langType = langType;
            return this;
        }

        /**
         * The type of the list.
         */
        public Builder listType(String listType) {
            this.putQueryParameter("ListType", listType);
            this.listType = listType;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeCustomizedListHeadersRequest build() {
            return new DescribeCustomizedListHeadersRequest(this);
        } 

    } 

}
