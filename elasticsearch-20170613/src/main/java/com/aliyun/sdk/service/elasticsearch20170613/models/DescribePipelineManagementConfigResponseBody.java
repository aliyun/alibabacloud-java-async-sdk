// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePipelineManagementConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePipelineManagementConfigResponseBody</p>
 */
public class DescribePipelineManagementConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private DescribePipelineManagementConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePipelineManagementConfigResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public DescribePipelineManagementConfigResponseBody build() {
            return new DescribePipelineManagementConfigResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("endpoints")
        private String endpoints;

        @NameInMap("esInstanceId")
        private String esInstanceId;

        @NameInMap("pipelineIds")
        private java.util.List < String > pipelineIds;

        @NameInMap("pipelineManagementType")
        private String pipelineManagementType;

        @NameInMap("userName")
        private String userName;

        private Result(Builder builder) {
            this.endpoints = builder.endpoints;
            this.esInstanceId = builder.esInstanceId;
            this.pipelineIds = builder.pipelineIds;
            this.pipelineManagementType = builder.pipelineManagementType;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return endpoints
         */
        public String getEndpoints() {
            return this.endpoints;
        }

        /**
         * @return esInstanceId
         */
        public String getEsInstanceId() {
            return this.esInstanceId;
        }

        /**
         * @return pipelineIds
         */
        public java.util.List < String > getPipelineIds() {
            return this.pipelineIds;
        }

        /**
         * @return pipelineManagementType
         */
        public String getPipelineManagementType() {
            return this.pipelineManagementType;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String endpoints; 
            private String esInstanceId; 
            private java.util.List < String > pipelineIds; 
            private String pipelineManagementType; 
            private String userName; 

            /**
             * endpoints.
             */
            public Builder endpoints(String endpoints) {
                this.endpoints = endpoints;
                return this;
            }

            /**
             * esInstanceId.
             */
            public Builder esInstanceId(String esInstanceId) {
                this.esInstanceId = esInstanceId;
                return this;
            }

            /**
             * pipelineIds.
             */
            public Builder pipelineIds(java.util.List < String > pipelineIds) {
                this.pipelineIds = pipelineIds;
                return this;
            }

            /**
             * pipelineManagementType.
             */
            public Builder pipelineManagementType(String pipelineManagementType) {
                this.pipelineManagementType = pipelineManagementType;
                return this;
            }

            /**
             * userName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
