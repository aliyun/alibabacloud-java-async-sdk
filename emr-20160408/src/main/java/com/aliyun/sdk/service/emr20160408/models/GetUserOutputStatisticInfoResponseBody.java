// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserOutputStatisticInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserOutputStatisticInfoResponseBody</p>
 */
public class GetUserOutputStatisticInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UserOutputList")
    private UserOutputList userOutputList;

    private GetUserOutputStatisticInfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.userOutputList = builder.userOutputList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserOutputStatisticInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userOutputList
     */
    public UserOutputList getUserOutputList() {
        return this.userOutputList;
    }

    public static final class Builder {
        private String requestId; 
        private UserOutputList userOutputList; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UserOutputList.
         */
        public Builder userOutputList(UserOutputList userOutputList) {
            this.userOutputList = userOutputList;
            return this;
        }

        public GetUserOutputStatisticInfoResponseBody build() {
            return new GetUserOutputStatisticInfoResponseBody(this);
        } 

    } 

    public static class ClusterStatUserOutput extends TeaModel {
        @NameInMap("BytesOutput")
        private Long bytesOutput;

        @NameInMap("User")
        private String user;

        private ClusterStatUserOutput(Builder builder) {
            this.bytesOutput = builder.bytesOutput;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterStatUserOutput create() {
            return builder().build();
        }

        /**
         * @return bytesOutput
         */
        public Long getBytesOutput() {
            return this.bytesOutput;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        public static final class Builder {
            private Long bytesOutput; 
            private String user; 

            /**
             * BytesOutput.
             */
            public Builder bytesOutput(Long bytesOutput) {
                this.bytesOutput = bytesOutput;
                return this;
            }

            /**
             * User.
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            public ClusterStatUserOutput build() {
                return new ClusterStatUserOutput(this);
            } 

        } 

    }
    public static class UserOutputList extends TeaModel {
        @NameInMap("ClusterStatUserOutput")
        private java.util.List < ClusterStatUserOutput> clusterStatUserOutput;

        private UserOutputList(Builder builder) {
            this.clusterStatUserOutput = builder.clusterStatUserOutput;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserOutputList create() {
            return builder().build();
        }

        /**
         * @return clusterStatUserOutput
         */
        public java.util.List < ClusterStatUserOutput> getClusterStatUserOutput() {
            return this.clusterStatUserOutput;
        }

        public static final class Builder {
            private java.util.List < ClusterStatUserOutput> clusterStatUserOutput; 

            /**
             * ClusterStatUserOutput.
             */
            public Builder clusterStatUserOutput(java.util.List < ClusterStatUserOutput> clusterStatUserOutput) {
                this.clusterStatUserOutput = clusterStatUserOutput;
                return this;
            }

            public UserOutputList build() {
                return new UserOutputList(this);
            } 

        } 

    }
}
