// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveVpcAccessResponseBody} extends {@link TeaModel}
 *
 * <p>RemoveVpcAccessResponseBody</p>
 */
public class RemoveVpcAccessResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Apis")
    private Apis apis;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RemoveVpcAccessResponseBody(Builder builder) {
        this.apis = builder.apis;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveVpcAccessResponseBody create() {
        return builder().build();
    }

    /**
     * @return apis
     */
    public Apis getApis() {
        return this.apis;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Apis apis; 
        private String requestId; 

        /**
         * API operations
         */
        public Builder apis(Apis apis) {
            this.apis = apis;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RemoveVpcAccessResponseBody build() {
            return new RemoveVpcAccessResponseBody(this);
        } 

    } 

    public static class Api extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiId")
        private String apiId;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("StageId")
        private String stageId;

        private Api(Builder builder) {
            this.apiId = builder.apiId;
            this.groupId = builder.groupId;
            this.stageId = builder.stageId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Api create() {
            return builder().build();
        }

        /**
         * @return apiId
         */
        public String getApiId() {
            return this.apiId;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return stageId
         */
        public String getStageId() {
            return this.stageId;
        }

        public static final class Builder {
            private String apiId; 
            private String groupId; 
            private String stageId; 

            /**
             * API Id
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * The ID of the API group.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The ID of the runtime environment.
             */
            public Builder stageId(String stageId) {
                this.stageId = stageId;
                return this;
            }

            public Api build() {
                return new Api(this);
            } 

        } 

    }
    public static class Apis extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Api")
        private java.util.List < Api> api;

        private Apis(Builder builder) {
            this.api = builder.api;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Apis create() {
            return builder().build();
        }

        /**
         * @return api
         */
        public java.util.List < Api> getApi() {
            return this.api;
        }

        public static final class Builder {
            private java.util.List < Api> api; 

            /**
             * Api.
             */
            public Builder api(java.util.List < Api> api) {
                this.api = api;
                return this;
            }

            public Apis build() {
                return new Apis(this);
            } 

        } 

    }
}
