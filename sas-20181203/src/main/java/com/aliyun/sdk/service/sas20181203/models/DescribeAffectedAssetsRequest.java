// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAffectedAssetsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAffectedAssetsRequest</p>
 */
public class DescribeAffectedAssetsRequest extends Request {
    @Query
    @NameInMap("Current")
    private String current;

    @Query
    @NameInMap("Levels")
    private String levels;

    @Query
    @NameInMap("PageSize")
    private String pageSize;

    private DescribeAffectedAssetsRequest(Builder builder) {
        super(builder);
        this.current = builder.current;
        this.levels = builder.levels;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAffectedAssetsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return current
     */
    public String getCurrent() {
        return this.current;
    }

    /**
     * @return levels
     */
    public String getLevels() {
        return this.levels;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<DescribeAffectedAssetsRequest, Builder> {
        private String current; 
        private String levels; 
        private String pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAffectedAssetsRequest request) {
            super(request);
            this.current = request.current;
            this.levels = request.levels;
            this.pageSize = request.pageSize;
        } 

        /**
         * Current.
         */
        public Builder current(String current) {
            this.putQueryParameter("Current", current);
            this.current = current;
            return this;
        }

        /**
         * Levels.
         */
        public Builder levels(String levels) {
            this.putQueryParameter("Levels", levels);
            this.levels = levels;
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

        @Override
        public DescribeAffectedAssetsRequest build() {
            return new DescribeAffectedAssetsRequest(this);
        } 

    } 

}
