// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateABTestExperimentResponseBody} extends {@link TeaModel}
 *
 * <p>CreateABTestExperimentResponseBody</p>
 */
public class CreateABTestExperimentResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private Result result;

    private CreateABTestExperimentResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateABTestExperimentResponseBody create() {
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
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public CreateABTestExperimentResponseBody build() {
            return new CreateABTestExperimentResponseBody(this);
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
             * created.
             */
            public Builder created(Integer created) {
                this.created = created;
                return this;
            }

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * online.
             */
            public Builder online(Boolean online) {
                this.online = online;
                return this;
            }

            /**
             * params.
             */
            public Builder params(java.util.Map < String, ? > params) {
                this.params = params;
                return this;
            }

            /**
             * traffic.
             */
            public Builder traffic(Integer traffic) {
                this.traffic = traffic;
                return this;
            }

            /**
             * updated.
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
