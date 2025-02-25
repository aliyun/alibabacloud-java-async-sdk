// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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
 * {@link ListUserSuppressionResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserSuppressionResponseBody</p>
 */
public class ListUserSuppressionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>Returned results.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Page number</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>Page size</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>1A846D66-5EC7-551B-9687-5BF1963DCFC1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total count</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListUserSuppressionResponseBody build() {
            return new ListUserSuppressionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUserSuppressionResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserSuppressionResponseBody</p>
     */
    public static class UserSuppressions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Integer createTime;

        @com.aliyun.core.annotation.NameInMap("LastBounceTime")
        private Integer lastBounceTime;

        @com.aliyun.core.annotation.NameInMap("SuppressionId")
        private Integer suppressionId;

        @com.aliyun.core.annotation.NameInMap("Type")
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
             * <p>Email address or domain name</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:test@example.net">test@example.net</a></p>
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * <p>Creation time, timestamp, accurate to the second.</p>
             * 
             * <strong>example:</strong>
             * <p>1715667435</p>
             */
            public Builder createTime(Integer createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Last bounce hit time, timestamp, accurate to the second.</p>
             * 
             * <strong>example:</strong>
             * <p>1715667451</p>
             */
            public Builder lastBounceTime(Integer lastBounceTime) {
                this.lastBounceTime = lastBounceTime;
                return this;
            }

            /**
             * <p>Invalid address ID</p>
             * 
             * <strong>example:</strong>
             * <p>59511</p>
             */
            public Builder suppressionId(Integer suppressionId) {
                this.suppressionId = suppressionId;
                return this;
            }

            /**
             * <p>Source of entry, invalid address type</p>
             * <ul>
             * <li>system</li>
             * <li>user</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>user</p>
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
    /**
     * 
     * {@link ListUserSuppressionResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserSuppressionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserSuppressions")
        private java.util.List<UserSuppressions> userSuppressions;

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
        public java.util.List<UserSuppressions> getUserSuppressions() {
            return this.userSuppressions;
        }

        public static final class Builder {
            private java.util.List<UserSuppressions> userSuppressions; 

            /**
             * UserSuppressions.
             */
            public Builder userSuppressions(java.util.List<UserSuppressions> userSuppressions) {
                this.userSuppressions = userSuppressions;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
