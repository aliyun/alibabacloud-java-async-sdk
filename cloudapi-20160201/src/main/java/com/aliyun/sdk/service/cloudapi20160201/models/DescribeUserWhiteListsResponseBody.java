// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserWhiteListsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserWhiteListsResponseBody</p>
 */
public class DescribeUserWhiteListsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("UserWhiteListInfos")
    private UserWhiteListInfos userWhiteListInfos;

    private DescribeUserWhiteListsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.userWhiteListInfos = builder.userWhiteListInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserWhiteListsResponseBody create() {
        return builder().build();
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

    /**
     * @return userWhiteListInfos
     */
    public UserWhiteListInfos getUserWhiteListInfos() {
        return this.userWhiteListInfos;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private UserWhiteListInfos userWhiteListInfos; 

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

        /**
         * UserWhiteListInfos.
         */
        public Builder userWhiteListInfos(UserWhiteListInfos userWhiteListInfos) {
            this.userWhiteListInfos = userWhiteListInfos;
            return this;
        }

        public DescribeUserWhiteListsResponseBody build() {
            return new DescribeUserWhiteListsResponseBody(this);
        } 

    } 

    public static class UserWhiteListInfo extends TeaModel {
        @NameInMap("AoneId")
        private String aoneId;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("Id")
        private Long id;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("Type")
        private String type;

        @NameInMap("Uid")
        private Long uid;

        @NameInMap("Value")
        private String value;

        private UserWhiteListInfo(Builder builder) {
            this.aoneId = builder.aoneId;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.id = builder.id;
            this.modifiedTime = builder.modifiedTime;
            this.type = builder.type;
            this.uid = builder.uid;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserWhiteListInfo create() {
            return builder().build();
        }

        /**
         * @return aoneId
         */
        public String getAoneId() {
            return this.aoneId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return uid
         */
        public Long getUid() {
            return this.uid;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String aoneId; 
            private String createTime; 
            private String description; 
            private Long id; 
            private String modifiedTime; 
            private String type; 
            private Long uid; 
            private String value; 

            /**
             * AoneId.
             */
            public Builder aoneId(String aoneId) {
                this.aoneId = aoneId;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Uid.
             */
            public Builder uid(Long uid) {
                this.uid = uid;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public UserWhiteListInfo build() {
                return new UserWhiteListInfo(this);
            } 

        } 

    }
    public static class UserWhiteListInfos extends TeaModel {
        @NameInMap("UserWhiteListInfo")
        private java.util.List < UserWhiteListInfo> userWhiteListInfo;

        private UserWhiteListInfos(Builder builder) {
            this.userWhiteListInfo = builder.userWhiteListInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserWhiteListInfos create() {
            return builder().build();
        }

        /**
         * @return userWhiteListInfo
         */
        public java.util.List < UserWhiteListInfo> getUserWhiteListInfo() {
            return this.userWhiteListInfo;
        }

        public static final class Builder {
            private java.util.List < UserWhiteListInfo> userWhiteListInfo; 

            /**
             * UserWhiteListInfo.
             */
            public Builder userWhiteListInfo(java.util.List < UserWhiteListInfo> userWhiteListInfo) {
                this.userWhiteListInfo = userWhiteListInfo;
                return this;
            }

            public UserWhiteListInfos build() {
                return new UserWhiteListInfos(this);
            } 

        } 

    }
}
