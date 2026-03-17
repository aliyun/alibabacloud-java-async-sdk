// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link DescribeFlowLogSagsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFlowLogSagsResponseBody</p>
 */
public class DescribeFlowLogSagsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Sags")
    private Sags sags;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeFlowLogSagsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.sags = builder.sags;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFlowLogSagsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sags
     */
    public Sags getSags() {
        return this.sags;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Sags sags; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeFlowLogSagsResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.sags = model.sags;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>8D945945-85F2-4BD7-A144-7DC0E8B5A0DC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of SAG instances.</p>
         */
        public Builder sags(Sags sags) {
            this.sags = sags;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>35</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeFlowLogSagsResponseBody build() {
            return new DescribeFlowLogSagsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFlowLogSagsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFlowLogSagsResponseBody</p>
     */
    public static class Sag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SmartAGId")
        private String smartAGId;

        private Sag(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.smartAGId = builder.smartAGId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sag create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return smartAGId
         */
        public String getSmartAGId() {
            return this.smartAGId;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String smartAGId; 

            private Builder() {
            } 

            private Builder(Sag model) {
                this.description = model.description;
                this.name = model.name;
                this.smartAGId = model.smartAGId;
            } 

            /**
             * <p>The description of the SAG instance.</p>
             * 
             * <strong>example:</strong>
             * <p>sag-100wm</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the SAG instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ruijie-test-2</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the SAG instance.</p>
             * 
             * <strong>example:</strong>
             * <p>sag-6rm1awijm3ktic****</p>
             */
            public Builder smartAGId(String smartAGId) {
                this.smartAGId = smartAGId;
                return this;
            }

            public Sag build() {
                return new Sag(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFlowLogSagsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFlowLogSagsResponseBody</p>
     */
    public static class Sags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Sag")
        private java.util.List<Sag> sag;

        private Sags(Builder builder) {
            this.sag = builder.sag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sags create() {
            return builder().build();
        }

        /**
         * @return sag
         */
        public java.util.List<Sag> getSag() {
            return this.sag;
        }

        public static final class Builder {
            private java.util.List<Sag> sag; 

            private Builder() {
            } 

            private Builder(Sags model) {
                this.sag = model.sag;
            } 

            /**
             * Sag.
             */
            public Builder sag(java.util.List<Sag> sag) {
                this.sag = sag;
                return this;
            }

            public Sags build() {
                return new Sags(this);
            } 

        } 

    }
}
