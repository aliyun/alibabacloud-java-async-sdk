// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openanalytics_open20180619.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSparkJobRequest} extends {@link RequestModel}
 *
 * <p>ListSparkJobRequest</p>
 */
public class ListSparkJobRequest extends Request {
    @Query
    @NameInMap("Condition")
    private java.util.Map < String, ? > condition;

    @Query
    @NameInMap("PageNumber")
    @Validation(required = true)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Query
    @NameInMap("VcName")
    @Validation(required = true)
    private String vcName;

    private ListSparkJobRequest(Builder builder) {
        super(builder);
        this.condition = builder.condition;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.vcName = builder.vcName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSparkJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return condition
     */
    public java.util.Map < String, ? > getCondition() {
        return this.condition;
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
     * @return vcName
     */
    public String getVcName() {
        return this.vcName;
    }

    public static final class Builder extends Request.Builder<ListSparkJobRequest, Builder> {
        private java.util.Map < String, ? > condition; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String vcName; 

        private Builder() {
            super();
        } 

        private Builder(ListSparkJobRequest response) {
            super(response);
            this.condition = response.condition;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.vcName = response.vcName;
        } 

        /**
         * Condition.
         */
        public Builder condition(java.util.Map < String, ? > condition) {
            this.putQueryParameter("Condition", condition);
            this.condition = condition;
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
         * VcName.
         */
        public Builder vcName(String vcName) {
            this.putQueryParameter("VcName", vcName);
            this.vcName = vcName;
            return this;
        }

        @Override
        public ListSparkJobRequest build() {
            return new ListSparkJobRequest(this);
        } 

    } 

}
