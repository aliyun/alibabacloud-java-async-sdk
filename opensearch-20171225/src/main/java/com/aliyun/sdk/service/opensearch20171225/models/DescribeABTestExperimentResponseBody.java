// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeABTestExperimentResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeABTestExperimentResponseBody</p>
 */
public class DescribeABTestExperimentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private DescribeABTestExperimentResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeABTestExperimentResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The details of the test.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public DescribeABTestExperimentResponseBody build() {
            return new DescribeABTestExperimentResponseBody(this);
        } 

    } 

    public static class Params extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("first_formula_name")
        private String firstFormulaName;

        private Params(Builder builder) {
            this.firstFormulaName = builder.firstFormulaName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Params create() {
            return builder().build();
        }

        /**
         * @return firstFormulaName
         */
        public String getFirstFormulaName() {
            return this.firstFormulaName;
        }

        public static final class Builder {
            private String firstFormulaName; 

            /**
             * The name of the rough sort policy.
             */
            public Builder firstFormulaName(String firstFormulaName) {
                this.firstFormulaName = firstFormulaName;
                return this;
            }

            public Params build() {
                return new Params(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("created")
        private Integer created;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("online")
        private Boolean online;

        @com.aliyun.core.annotation.NameInMap("params")
        private Params params;

        @com.aliyun.core.annotation.NameInMap("traffic")
        private Integer traffic;

        @com.aliyun.core.annotation.NameInMap("updated")
        private Integer updated;

        private Result(Builder builder) {
            this.created = builder.created;
            this.id = builder.id;
            this.name = builder.name;
            this.online = builder.online;
            this.params = builder.params;
            this.traffic = builder.traffic;
            this.updated = builder.updated;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return created
         */
        public Integer getCreated() {
            return this.created;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return online
         */
        public Boolean getOnline() {
            return this.online;
        }

        /**
         * @return params
         */
        public Params getParams() {
            return this.params;
        }

        /**
         * @return traffic
         */
        public Integer getTraffic() {
            return this.traffic;
        }

        /**
         * @return updated
         */
        public Integer getUpdated() {
            return this.updated;
        }

        public static final class Builder {
            private Integer created; 
            private String id; 
            private String name; 
            private Boolean online; 
            private Params params; 
            private Integer traffic; 
            private Integer updated; 

            /**
             * The time when the test was created.
             */
            public Builder created(Integer created) {
                this.created = created;
                return this;
            }

            /**
             * The ID of the test.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the test.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The status of the test. Valid values:
             * <p>
             * 
             * *   true: in effect
             * *   false: not in effect
             */
            public Builder online(Boolean online) {
                this.online = online;
                return this;
            }

            /**
             * The parameters of the test.
             */
            public Builder params(Params params) {
                this.params = params;
                return this;
            }

            /**
             * The percentage of traffic that is routed to the test.
             */
            public Builder traffic(Integer traffic) {
                this.traffic = traffic;
                return this;
            }

            /**
             * The time when the test was last modified.
             */
            public Builder updated(Integer updated) {
                this.updated = updated;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
