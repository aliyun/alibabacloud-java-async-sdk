// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApplicationResourceSummaryRequest} extends {@link RequestModel}
 *
 * <p>DescribeApplicationResourceSummaryRequest</p>
 */
public class DescribeApplicationResourceSummaryRequest extends Request {
    @Query
    @NameInMap("Level")
    private String level;

    @Query
    @NameInMap("ResourceType")
    private String resourceType;

    private DescribeApplicationResourceSummaryRequest(Builder builder) {
        super(builder);
        this.level = builder.level;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicationResourceSummaryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return level
     */
    public String getLevel() {
        return this.level;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<DescribeApplicationResourceSummaryRequest, Builder> {
        private String level; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeApplicationResourceSummaryRequest request) {
            super(request);
            this.level = request.level;
            this.resourceType = request.resourceType;
        } 

        /**
         * Level.
         */
        public Builder level(String level) {
            this.putQueryParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public DescribeApplicationResourceSummaryRequest build() {
            return new DescribeApplicationResourceSummaryRequest(this);
        } 

    } 

}
