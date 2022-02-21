// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserInputStatisticInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserInputStatisticInfoResponseBody</p>
 */
public class GetUserInputStatisticInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UserInputList")
    private UserInputList userInputList;

    private GetUserInputStatisticInfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.userInputList = builder.userInputList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserInputStatisticInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userInputList
     */
    public UserInputList getUserInputList() {
        return this.userInputList;
    }

    public static final class Builder {
        private String requestId; 
        private UserInputList userInputList; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UserInputList.
         */
        public Builder userInputList(UserInputList userInputList) {
            this.userInputList = userInputList;
            return this;
        }

        public GetUserInputStatisticInfoResponseBody build() {
            return new GetUserInputStatisticInfoResponseBody(this);
        } 

    } 

    public static class ClusterStatUserInput extends TeaModel {
        @NameInMap("BytesInput")
        private Long bytesInput;

        @NameInMap("User")
        private String user;

        private ClusterStatUserInput(Builder builder) {
            this.bytesInput = builder.bytesInput;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterStatUserInput create() {
            return builder().build();
        }

        /**
         * @return bytesInput
         */
        public Long getBytesInput() {
            return this.bytesInput;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        public static final class Builder {
            private Long bytesInput; 
            private String user; 

            /**
             * BytesInput.
             */
            public Builder bytesInput(Long bytesInput) {
                this.bytesInput = bytesInput;
                return this;
            }

            /**
             * User.
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            public ClusterStatUserInput build() {
                return new ClusterStatUserInput(this);
            } 

        } 

    }
    public static class UserInputList extends TeaModel {
        @NameInMap("ClusterStatUserInput")
        private java.util.List < ClusterStatUserInput> clusterStatUserInput;

        private UserInputList(Builder builder) {
            this.clusterStatUserInput = builder.clusterStatUserInput;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserInputList create() {
            return builder().build();
        }

        /**
         * @return clusterStatUserInput
         */
        public java.util.List < ClusterStatUserInput> getClusterStatUserInput() {
            return this.clusterStatUserInput;
        }

        public static final class Builder {
            private java.util.List < ClusterStatUserInput> clusterStatUserInput; 

            /**
             * ClusterStatUserInput.
             */
            public Builder clusterStatUserInput(java.util.List < ClusterStatUserInput> clusterStatUserInput) {
                this.clusterStatUserInput = clusterStatUserInput;
                return this;
            }

            public UserInputList build() {
                return new UserInputList(this);
            } 

        } 

    }
}
