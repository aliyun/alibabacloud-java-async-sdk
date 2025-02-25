// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeParametersHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeParametersHistoryResponseBody</p>
 */
public class DescribeParametersHistoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Respond")
    private java.util.List < Respond> respond;

    private DescribeParametersHistoryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.respond = builder.respond;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeParametersHistoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return respond
     */
    public java.util.List < Respond> getRespond() {
        return this.respond;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Respond> respond; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The list of parameter modification records.
         */
        public Builder respond(java.util.List < Respond> respond) {
            this.respond = respond;
            return this;
        }

        public DescribeParametersHistoryResponseBody build() {
            return new DescribeParametersHistoryResponseBody(this);
        } 

    } 

    public static class Parameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DimensionValue")
        private String dimensionValue;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NewValue")
        private String newValue;

        @com.aliyun.core.annotation.NameInMap("OldValue")
        private String oldValue;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private Parameters(Builder builder) {
            this.createTime = builder.createTime;
            this.dimensionValue = builder.dimensionValue;
            this.name = builder.name;
            this.newValue = builder.newValue;
            this.oldValue = builder.oldValue;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dimensionValue
         */
        public String getDimensionValue() {
            return this.dimensionValue;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return newValue
         */
        public String getNewValue() {
            return this.newValue;
        }

        /**
         * @return oldValue
         */
        public String getOldValue() {
            return this.oldValue;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private String dimensionValue; 
            private String name; 
            private String newValue; 
            private String oldValue; 
            private String status; 
            private String updateTime; 

            /**
             * The time when the parameter modification was initiated.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The resource ID of the parameter type.    
             * <p>
             * - When you called this operation to query the modification history of cluster parameters, the value is DEFAULT_DIMENSION_VALUE.   
             * - When you called this operation to query the modification history of tenant parameters, the value is the tenant ID.
             */
            public Builder dimensionValue(String dimensionValue) {
                this.dimensionValue = dimensionValue;
                return this;
            }

            /**
             * The name of the parameter.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The value of the parameter after the modification.
             */
            public Builder newValue(String newValue) {
                this.newValue = newValue;
                return this;
            }

            /**
             * The parameter value before modification.
             */
            public Builder oldValue(String oldValue) {
                this.oldValue = oldValue;
                return this;
            }

            /**
             * The modification status. Valid values:    
             * <p>
             * - APPLIED: The modification was successful.   
             * - SCHEDULING: The modification was to be made.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The time when the parameter modification took effect.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
    public static class Respond extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("Parameters")
        private java.util.List < Parameters> parameters;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Respond(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.parameters = builder.parameters;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Respond create() {
            return builder().build();
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return parameters
         */
        public java.util.List < Parameters> getParameters() {
            return this.parameters;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private java.util.List < Parameters> parameters; 
            private Integer totalCount; 

            /**
             * The number of returned entries on each page.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The parameter modification history.
             */
            public Builder parameters(java.util.List < Parameters> parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * The number of parameter modification records.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Respond build() {
                return new Respond(this);
            } 

        } 

    }
}
