// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link SumDailyBillsByItemRequest} extends {@link RequestModel}
 *
 * <p>SumDailyBillsByItemRequest</p>
 */
public class SumDailyBillsByItemRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("endDate")
    private Long endDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("projectNames")
    private java.util.List<String> projectNames;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("startDate")
    private Long startDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("statsType")
    private String statsType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("types")
    private java.util.List<String> types;

    private SumDailyBillsByItemRequest(Builder builder) {
        super(builder);
        this.endDate = builder.endDate;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectNames = builder.projectNames;
        this.startDate = builder.startDate;
        this.statsType = builder.statsType;
        this.types = builder.types;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SumDailyBillsByItemRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endDate
     */
    public Long getEndDate() {
        return this.endDate;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return projectNames
     */
    public java.util.List<String> getProjectNames() {
        return this.projectNames;
    }

    /**
     * @return startDate
     */
    public Long getStartDate() {
        return this.startDate;
    }

    /**
     * @return statsType
     */
    public String getStatsType() {
        return this.statsType;
    }

    /**
     * @return types
     */
    public java.util.List<String> getTypes() {
        return this.types;
    }

    public static final class Builder extends Request.Builder<SumDailyBillsByItemRequest, Builder> {
        private Long endDate; 
        private Long pageNumber; 
        private Long pageSize; 
        private java.util.List<String> projectNames; 
        private Long startDate; 
        private String statsType; 
        private java.util.List<String> types; 

        private Builder() {
            super();
        } 

        private Builder(SumDailyBillsByItemRequest request) {
            super(request);
            this.endDate = request.endDate;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectNames = request.projectNames;
            this.startDate = request.startDate;
            this.statsType = request.statsType;
            this.types = request.types;
        } 

        /**
         * endDate.
         */
        public Builder endDate(Long endDate) {
            this.putBodyParameter("endDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putBodyParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * projectNames.
         */
        public Builder projectNames(java.util.List<String> projectNames) {
            this.putBodyParameter("projectNames", projectNames);
            this.projectNames = projectNames;
            return this;
        }

        /**
         * startDate.
         */
        public Builder startDate(Long startDate) {
            this.putBodyParameter("startDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * statsType.
         */
        public Builder statsType(String statsType) {
            this.putBodyParameter("statsType", statsType);
            this.statsType = statsType;
            return this;
        }

        /**
         * types.
         */
        public Builder types(java.util.List<String> types) {
            this.putBodyParameter("types", types);
            this.types = types;
            return this;
        }

        @Override
        public SumDailyBillsByItemRequest build() {
            return new SumDailyBillsByItemRequest(this);
        } 

    } 

}
