// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vdc20201214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCallUserExpResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCallUserExpResponseBody</p>
 */
public class DescribeCallUserExpResponseBody extends TeaModel {
    @NameInMap("ExpInfoList")
    private java.util.List < ExpInfoList> expInfoList;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeCallUserExpResponseBody(Builder builder) {
        this.expInfoList = builder.expInfoList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCallUserExpResponseBody create() {
        return builder().build();
    }

    /**
     * @return expInfoList
     */
    public java.util.List < ExpInfoList> getExpInfoList() {
        return this.expInfoList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ExpInfoList> expInfoList; 
        private String requestId; 

        /**
         * ExpInfoList.
         */
        public Builder expInfoList(java.util.List < ExpInfoList> expInfoList) {
            this.expInfoList = expInfoList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCallUserExpResponseBody build() {
            return new DescribeCallUserExpResponseBody(this);
        } 

    } 

    public static class ExpInfoList extends TeaModel {
        @NameInMap("CallExp")
        private String callExp;

        @NameInMap("UserId")
        private String userId;

        private ExpInfoList(Builder builder) {
            this.callExp = builder.callExp;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExpInfoList create() {
            return builder().build();
        }

        /**
         * @return callExp
         */
        public String getCallExp() {
            return this.callExp;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String callExp; 
            private String userId; 

            /**
             * CallExp.
             */
            public Builder callExp(String callExp) {
                this.callExp = callExp;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public ExpInfoList build() {
                return new ExpInfoList(this);
            } 

        } 

    }
}
