// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProblemSubtotalsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProblemSubtotalsResponseBody</p>
 */
public class ListProblemSubtotalsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListProblemSubtotalsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProblemSubtotalsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * data
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListProblemSubtotalsResponseBody build() {
            return new ListProblemSubtotalsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createRamName")
        private String createRamName;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("createUserId")
        private Long createUserId;

        @com.aliyun.core.annotation.NameInMap("createUserPhone")
        private String createUserPhone;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        private Data(Builder builder) {
            this.createRamName = builder.createRamName;
            this.createTime = builder.createTime;
            this.createUserId = builder.createUserId;
            this.createUserPhone = builder.createUserPhone;
            this.description = builder.description;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createRamName
         */
        public String getCreateRamName() {
            return this.createRamName;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createUserId
         */
        public Long getCreateUserId() {
            return this.createUserId;
        }

        /**
         * @return createUserPhone
         */
        public String getCreateUserPhone() {
            return this.createUserPhone;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        public static final class Builder {
            private String createRamName; 
            private String createTime; 
            private Long createUserId; 
            private String createUserPhone; 
            private String description; 

            /**
             * createRamName.
             */
            public Builder createRamName(String createRamName) {
                this.createRamName = createRamName;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * createUserId.
             */
            public Builder createUserId(Long createUserId) {
                this.createUserId = createUserId;
                return this;
            }

            /**
             * createUserPhone.
             */
            public Builder createUserPhone(String createUserPhone) {
                this.createUserPhone = createUserPhone;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
