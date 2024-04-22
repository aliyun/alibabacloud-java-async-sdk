// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserSuppressionResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserSuppressionResponseBody</p>
 */
public class ListUserSuppressionResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListUserSuppressionResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserSuppressionResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Data data; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListUserSuppressionResponseBody build() {
            return new ListUserSuppressionResponseBody(this);
        } 

    } 

    public static class UserSuppressions extends TeaModel {
        @NameInMap("Address")
        private String address;

        @NameInMap("CreateTime")
        private Integer createTime;

        @NameInMap("LastBounceTime")
        private Integer lastBounceTime;

        @NameInMap("SuppressionId")
        private Integer suppressionId;

        @NameInMap("Type")
        private String type;

        private UserSuppressions(Builder builder) {
            this.address = builder.address;
            this.createTime = builder.createTime;
            this.lastBounceTime = builder.lastBounceTime;
            this.suppressionId = builder.suppressionId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserSuppressions create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return createTime
         */
        public Integer getCreateTime() {
            return this.createTime;
        }

        /**
         * @return lastBounceTime
         */
        public Integer getLastBounceTime() {
            return this.lastBounceTime;
        }

        /**
         * @return suppressionId
         */
        public Integer getSuppressionId() {
            return this.suppressionId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String address; 
            private Integer createTime; 
            private Integer lastBounceTime; 
            private Integer suppressionId; 
            private String type; 

            /**
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Integer createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * LastBounceTime.
             */
            public Builder lastBounceTime(Integer lastBounceTime) {
                this.lastBounceTime = lastBounceTime;
                return this;
            }

            /**
             * SuppressionId.
             */
            public Builder suppressionId(Integer suppressionId) {
                this.suppressionId = suppressionId;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public UserSuppressions build() {
                return new UserSuppressions(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("UserSuppressions")
        private java.util.List < UserSuppressions> userSuppressions;

        private Data(Builder builder) {
            this.userSuppressions = builder.userSuppressions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return userSuppressions
         */
        public java.util.List < UserSuppressions> getUserSuppressions() {
            return this.userSuppressions;
        }

        public static final class Builder {
            private java.util.List < UserSuppressions> userSuppressions; 

            /**
             * UserSuppressions.
             */
            public Builder userSuppressions(java.util.List < UserSuppressions> userSuppressions) {
                this.userSuppressions = userSuppressions;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
