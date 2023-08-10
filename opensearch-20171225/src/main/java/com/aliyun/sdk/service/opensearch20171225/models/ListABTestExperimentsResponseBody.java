// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListABTestExperimentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListABTestExperimentsResponseBody</p>
 */
public class ListABTestExperimentsResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private java.util.List < Result> result;

    private ListABTestExperimentsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListABTestExperimentsResponseBody create() {
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
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The details of the tests.
         * <p>
         * 
         * For more information, see [ABTestExperiment](~~173617~~).
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListABTestExperimentsResponseBody build() {
            return new ListABTestExperimentsResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("created")
        private Integer created;

        @NameInMap("id")
        private String id;

        @NameInMap("name")
        private String name;

        @NameInMap("online")
        private Boolean online;

        @NameInMap("params")
        private java.util.Map < String, ? > params;

        @NameInMap("traffic")
        private Integer traffic;

        @NameInMap("updated")
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
        public java.util.Map < String, ? > getParams() {
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
            private java.util.Map < String, ? > params; 
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
             * The ID of the test group.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the test group.
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
            public Builder params(java.util.Map < String, ? > params) {
                this.params = params;
                return this;
            }

            /**
             * The percentage of traffic that is routed to the test.
             * <p>
             * 
             * Valid values: \[0,100].
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
