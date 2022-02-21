// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeParametersHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeParametersHistoryResponseBody</p>
 */
public class DescribeParametersHistoryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Respond")
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
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 参数修改历史列表。
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
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DimensionValue")
        private String dimensionValue;

        @NameInMap("Name")
        private String name;

        @NameInMap("NewValue")
        private String newValue;

        @NameInMap("OldValue")
        private String oldValue;

        @NameInMap("Status")
        private String status;

        @NameInMap("UpdateTime")
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
             * 参数修改的发起时间。
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 参数类型的资源标识。 如果为集群则为DEFAULT_DIMENSION_VALUE，若为租户的参数，则传入租户的TenantId。
             */
            public Builder dimensionValue(String dimensionValue) {
                this.dimensionValue = dimensionValue;
                return this;
            }

            /**
             * 参数名称。
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 参数修改后的值.
             */
            public Builder newValue(String newValue) {
                this.newValue = newValue;
                return this;
            }

            /**
             * 参数修改前的值。
             */
            public Builder oldValue(String oldValue) {
                this.oldValue = oldValue;
                return this;
            }

            /**
             * 修改状态。 - APPLIED：成功 - SCHEDULING：待修改。
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * 参数修改的生效时间。
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
        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("Parameters")
        private java.util.List < Parameters> parameters;

        @NameInMap("TotalCount")
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
             * 每页记录数。
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * 参数修改历史信息。
             */
            public Builder parameters(java.util.List < Parameters> parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * 查询到的参数修改历史记录数。
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
