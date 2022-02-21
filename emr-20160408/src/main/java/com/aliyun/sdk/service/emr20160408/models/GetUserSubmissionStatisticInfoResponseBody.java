// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserSubmissionStatisticInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserSubmissionStatisticInfoResponseBody</p>
 */
public class GetUserSubmissionStatisticInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UserSubmissionList")
    private UserSubmissionList userSubmissionList;

    private GetUserSubmissionStatisticInfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.userSubmissionList = builder.userSubmissionList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserSubmissionStatisticInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userSubmissionList
     */
    public UserSubmissionList getUserSubmissionList() {
        return this.userSubmissionList;
    }

    public static final class Builder {
        private String requestId; 
        private UserSubmissionList userSubmissionList; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UserSubmissionList.
         */
        public Builder userSubmissionList(UserSubmissionList userSubmissionList) {
            this.userSubmissionList = userSubmissionList;
            return this;
        }

        public GetUserSubmissionStatisticInfoResponseBody build() {
            return new GetUserSubmissionStatisticInfoResponseBody(this);
        } 

    } 

    public static class ClusterStatUserSubmission extends TeaModel {
        @NameInMap("Submission")
        private Long submission;

        @NameInMap("User")
        private String user;

        private ClusterStatUserSubmission(Builder builder) {
            this.submission = builder.submission;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterStatUserSubmission create() {
            return builder().build();
        }

        /**
         * @return submission
         */
        public Long getSubmission() {
            return this.submission;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        public static final class Builder {
            private Long submission; 
            private String user; 

            /**
             * Submission.
             */
            public Builder submission(Long submission) {
                this.submission = submission;
                return this;
            }

            /**
             * User.
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            public ClusterStatUserSubmission build() {
                return new ClusterStatUserSubmission(this);
            } 

        } 

    }
    public static class UserSubmissionList extends TeaModel {
        @NameInMap("ClusterStatUserSubmission")
        private java.util.List < ClusterStatUserSubmission> clusterStatUserSubmission;

        private UserSubmissionList(Builder builder) {
            this.clusterStatUserSubmission = builder.clusterStatUserSubmission;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserSubmissionList create() {
            return builder().build();
        }

        /**
         * @return clusterStatUserSubmission
         */
        public java.util.List < ClusterStatUserSubmission> getClusterStatUserSubmission() {
            return this.clusterStatUserSubmission;
        }

        public static final class Builder {
            private java.util.List < ClusterStatUserSubmission> clusterStatUserSubmission; 

            /**
             * ClusterStatUserSubmission.
             */
            public Builder clusterStatUserSubmission(java.util.List < ClusterStatUserSubmission> clusterStatUserSubmission) {
                this.clusterStatUserSubmission = clusterStatUserSubmission;
                return this;
            }

            public UserSubmissionList build() {
                return new UserSubmissionList(this);
            } 

        } 

    }
}
