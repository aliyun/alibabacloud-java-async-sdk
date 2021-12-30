// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DetachHostGroupAccountsFromUserResponseBody} extends {@link TeaModel}
 *
 * <p>DetachHostGroupAccountsFromUserResponseBody</p>
 */
public class DetachHostGroupAccountsFromUserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Results")
    private java.util.List < Results> results;


    private DetachHostGroupAccountsFromUserResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.results = builder.results;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachHostGroupAccountsFromUserResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return results
     */
    public java.util.List < Results> getResults() {
        return this.results;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Results> results; 

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Results.</p>
         */
        public Builder results(java.util.List < Results> results) {
            this.results = results;
            return this;
        }

        public DetachHostGroupAccountsFromUserResponseBody build() {
            return new DetachHostGroupAccountsFromUserResponseBody(this);
        } 

    } 

    public static class HostAccountNames extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("HostAccountName")
        private String hostAccountName;

        @NameInMap("Message")
        private String message;


        private HostAccountNames(Builder builder) {
            this.code = builder.code;
            this.hostAccountName = builder.hostAccountName;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostAccountNames create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return hostAccountName
         */
        public String getHostAccountName() {
            return this.hostAccountName;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String code; 
            private String hostAccountName; 
            private String message; 

            /**
             * <p>Code.</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>HostAccountName.</p>
             */
            public Builder hostAccountName(String hostAccountName) {
                this.hostAccountName = hostAccountName;
                return this;
            }

            /**
             * <p>Message.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public HostAccountNames build() {
                return new HostAccountNames(this);
            } 

        } 

    }
    public static class Results extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("HostAccountNames")
        private java.util.List < HostAccountNames> hostAccountNames;

        @NameInMap("HostGroupId")
        private String hostGroupId;

        @NameInMap("Message")
        private String message;

        @NameInMap("UserId")
        private String userId;


        private Results(Builder builder) {
            this.code = builder.code;
            this.hostAccountNames = builder.hostAccountNames;
            this.hostGroupId = builder.hostGroupId;
            this.message = builder.message;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return hostAccountNames
         */
        public java.util.List < HostAccountNames> getHostAccountNames() {
            return this.hostAccountNames;
        }

        /**
         * @return hostGroupId
         */
        public String getHostGroupId() {
            return this.hostGroupId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String code; 
            private java.util.List < HostAccountNames> hostAccountNames; 
            private String hostGroupId; 
            private String message; 
            private String userId; 

            /**
             * <p>Code.</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>HostAccountNames.</p>
             */
            public Builder hostAccountNames(java.util.List < HostAccountNames> hostAccountNames) {
                this.hostAccountNames = hostAccountNames;
                return this;
            }

            /**
             * <p>HostGroupId.</p>
             */
            public Builder hostGroupId(String hostGroupId) {
                this.hostGroupId = hostGroupId;
                return this;
            }

            /**
             * <p>Message.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>UserId.</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
