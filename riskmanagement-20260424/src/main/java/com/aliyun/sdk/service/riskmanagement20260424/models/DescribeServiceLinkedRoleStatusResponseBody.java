// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.riskmanagement20260424.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeServiceLinkedRoleStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServiceLinkedRoleStatusResponseBody</p>
 */
public class DescribeServiceLinkedRoleStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeServiceLinkedRoleStatusResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceLinkedRoleStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeServiceLinkedRoleStatusResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeServiceLinkedRoleStatusResponseBody build() {
            return new DescribeServiceLinkedRoleStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeServiceLinkedRoleStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceLinkedRoleStatusResponseBody</p>
     */
    public static class RoleStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Status")
        private Boolean status;

        private RoleStatus(Builder builder) {
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoleStatus create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public Boolean getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Boolean status; 

            private Builder() {
            } 

            private Builder(RoleStatus model) {
                this.status = model.status;
            } 

            /**
             * Status.
             */
            public Builder status(Boolean status) {
                this.status = status;
                return this;
            }

            public RoleStatus build() {
                return new RoleStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeServiceLinkedRoleStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceLinkedRoleStatusResponseBody</p>
     */
    public static class DataBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("RoleStatus")
        private RoleStatus roleStatus;

        private DataBody(Builder builder) {
            this.requestId = builder.requestId;
            this.roleStatus = builder.roleStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataBody create() {
            return builder().build();
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return roleStatus
         */
        public RoleStatus getRoleStatus() {
            return this.roleStatus;
        }

        public static final class Builder {
            private String requestId; 
            private RoleStatus roleStatus; 

            private Builder() {
            } 

            private Builder(DataBody model) {
                this.requestId = model.requestId;
                this.roleStatus = model.roleStatus;
            } 

            /**
             * RequestId.
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * RoleStatus.
             */
            public Builder roleStatus(RoleStatus roleStatus) {
                this.roleStatus = roleStatus;
                return this;
            }

            public DataBody build() {
                return new DataBody(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeServiceLinkedRoleStatusResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceLinkedRoleStatusResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Body")
        private DataBody body;

        private Data(Builder builder) {
            this.body = builder.body;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return body
         */
        public DataBody getBody() {
            return this.body;
        }

        public static final class Builder {
            private DataBody body; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.body = model.body;
            } 

            /**
             * Body.
             */
            public Builder body(DataBody body) {
                this.body = body;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
