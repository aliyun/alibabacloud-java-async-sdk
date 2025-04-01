// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link DescribeParametersHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeParametersHistoryResponseBody</p>
 */
public class DescribeParametersHistoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Respond")
    private Respond respond;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public Respond getRespond() {
        return this.respond;
    }

    public static final class Builder {
        private String requestId; 
        private Respond respond; 

        private Builder() {
        } 

        private Builder(DescribeParametersHistoryResponseBody model) {
            this.requestId = model.requestId;
            this.respond = model.respond;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of parameter modification records.</p>
         */
        public Builder respond(Respond respond) {
            this.respond = respond;
            return this;
        }

        public DescribeParametersHistoryResponseBody build() {
            return new DescribeParametersHistoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeParametersHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeParametersHistoryResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Parameters model) {
                this.createTime = model.createTime;
                this.dimensionValue = model.dimensionValue;
                this.name = model.name;
                this.newValue = model.newValue;
                this.oldValue = model.oldValue;
                this.status = model.status;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The time when the parameter modification was initiated.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-11-26T08:03:34Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The resource ID of the parameter type. When you called this operation to query the modification history of cluster parameters, the value is DEFAULT_DIMENSION_VALUE. When you called this operation to query the modification history of tenant parameters, the value is the tenant ID.</p>
             * 
             * <strong>example:</strong>
             * <p>t69uo********</p>
             */
            public Builder dimensionValue(String dimensionValue) {
                this.dimensionValue = dimensionValue;
                return this;
            }

            /**
             * <p>The name of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>connect_timeout</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The value of the parameter after the modification.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder newValue(String newValue) {
                this.newValue = newValue;
                return this;
            }

            /**
             * <p>The value of the parameter before the modification.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder oldValue(String oldValue) {
                this.oldValue = oldValue;
                return this;
            }

            /**
             * <p>The modification status of the parameter. Valid values: </p>
             * <ul>
             * <li>APPLIED: The parameter was modified.</li>
             * <li>SCHEDULING: The parameter was to be modified.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>APPLIED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time when the parameter modification took effect.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-11-26T08:03:34Z</p>
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
    /**
     * 
     * {@link DescribeParametersHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeParametersHistoryResponseBody</p>
     */
    public static class Respond extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("Parameters")
        private java.util.List<Parameters> parameters;

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
        public java.util.List<Parameters> getParameters() {
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
            private java.util.List<Parameters> parameters; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Respond model) {
                this.pageNumber = model.pageNumber;
                this.parameters = model.parameters;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The number of the page to return.    </p>
             * <ul>
             * <li>Start value: 1   </li>
             * <li>Default value: 1</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The information about parameters.</p>
             */
            public Builder parameters(java.util.List<Parameters> parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * <p>The total count, which takes effect in a pagination query.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
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
