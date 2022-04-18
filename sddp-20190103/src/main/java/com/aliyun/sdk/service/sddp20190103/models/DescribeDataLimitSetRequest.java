// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataLimitSetRequest} extends {@link RequestModel}
 *
 * <p>DescribeDataLimitSetRequest</p>
 */
public class DescribeDataLimitSetRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("ParentId")
    private String parentId;

    @Query
    @NameInMap("ResourceType")
    private Integer resourceType;

    private DescribeDataLimitSetRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.parentId = builder.parentId;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataLimitSetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return parentId
     */
    public String getParentId() {
        return this.parentId;
    }

    /**
     * @return resourceType
     */
    public Integer getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<DescribeDataLimitSetRequest, Builder> {
        private String lang; 
        private String parentId; 
        private Integer resourceType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDataLimitSetRequest request) {
            super(request);
            this.lang = request.lang;
            this.parentId = request.parentId;
            this.resourceType = request.resourceType;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * ParentId.
         */
        public Builder parentId(String parentId) {
            this.putQueryParameter("ParentId", parentId);
            this.parentId = parentId;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(Integer resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public DescribeDataLimitSetRequest build() {
            return new DescribeDataLimitSetRequest(this);
        } 

    } 

}
