// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

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
 * {@link DescribeFaultDiagnosisUserListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFaultDiagnosisUserListResponseBody</p>
 */
public class DescribeFaultDiagnosisUserListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCnt")
    private Integer totalCnt;

    @com.aliyun.core.annotation.NameInMap("UserList")
    private java.util.List<UserList> userList;

    private DescribeFaultDiagnosisUserListResponseBody(Builder builder) {
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCnt = builder.totalCnt;
        this.userList = builder.userList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFaultDiagnosisUserListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
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
     * @return totalCnt
     */
    public Integer getTotalCnt() {
        return this.totalCnt;
    }

    /**
     * @return userList
     */
    public java.util.List<UserList> getUserList() {
        return this.userList;
    }

    public static final class Builder {
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCnt; 
        private java.util.List<UserList> userList; 

        private Builder() {
        } 

        private Builder(DescribeFaultDiagnosisUserListResponseBody model) {
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCnt = model.totalCnt;
            this.userList = model.userList;
        } 

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
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
         * TotalCnt.
         */
        public Builder totalCnt(Integer totalCnt) {
            this.totalCnt = totalCnt;
            return this;
        }

        /**
         * UserList.
         */
        public Builder userList(java.util.List<UserList> userList) {
            this.userList = userList;
            return this;
        }

        public DescribeFaultDiagnosisUserListResponseBody build() {
            return new DescribeFaultDiagnosisUserListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFaultDiagnosisUserListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFaultDiagnosisUserListResponseBody</p>
     */
    public static class FaultList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FaultType")
        private String faultType;

        private FaultList(Builder builder) {
            this.faultType = builder.faultType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FaultList create() {
            return builder().build();
        }

        /**
         * @return faultType
         */
        public String getFaultType() {
            return this.faultType;
        }

        public static final class Builder {
            private String faultType; 

            private Builder() {
            } 

            private Builder(FaultList model) {
                this.faultType = model.faultType;
            } 

            /**
             * FaultType.
             */
            public Builder faultType(String faultType) {
                this.faultType = faultType;
                return this;
            }

            public FaultList build() {
                return new FaultList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeFaultDiagnosisUserListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFaultDiagnosisUserListResponseBody</p>
     */
    public static class UserList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelCreatedTs")
        private Long channelCreatedTs;

        @com.aliyun.core.annotation.NameInMap("ChannelId")
        private String channelId;

        @com.aliyun.core.annotation.NameInMap("CreatedTs")
        private Long createdTs;

        @com.aliyun.core.annotation.NameInMap("DestroyedTs")
        private Long destroyedTs;

        @com.aliyun.core.annotation.NameInMap("FaultList")
        private java.util.List<FaultList> faultList;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private UserList(Builder builder) {
            this.channelCreatedTs = builder.channelCreatedTs;
            this.channelId = builder.channelId;
            this.createdTs = builder.createdTs;
            this.destroyedTs = builder.destroyedTs;
            this.faultList = builder.faultList;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserList create() {
            return builder().build();
        }

        /**
         * @return channelCreatedTs
         */
        public Long getChannelCreatedTs() {
            return this.channelCreatedTs;
        }

        /**
         * @return channelId
         */
        public String getChannelId() {
            return this.channelId;
        }

        /**
         * @return createdTs
         */
        public Long getCreatedTs() {
            return this.createdTs;
        }

        /**
         * @return destroyedTs
         */
        public Long getDestroyedTs() {
            return this.destroyedTs;
        }

        /**
         * @return faultList
         */
        public java.util.List<FaultList> getFaultList() {
            return this.faultList;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Long channelCreatedTs; 
            private String channelId; 
            private Long createdTs; 
            private Long destroyedTs; 
            private java.util.List<FaultList> faultList; 
            private String userId; 

            private Builder() {
            } 

            private Builder(UserList model) {
                this.channelCreatedTs = model.channelCreatedTs;
                this.channelId = model.channelId;
                this.createdTs = model.createdTs;
                this.destroyedTs = model.destroyedTs;
                this.faultList = model.faultList;
                this.userId = model.userId;
            } 

            /**
             * ChannelCreatedTs.
             */
            public Builder channelCreatedTs(Long channelCreatedTs) {
                this.channelCreatedTs = channelCreatedTs;
                return this;
            }

            /**
             * ChannelId.
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * CreatedTs.
             */
            public Builder createdTs(Long createdTs) {
                this.createdTs = createdTs;
                return this;
            }

            /**
             * DestroyedTs.
             */
            public Builder destroyedTs(Long destroyedTs) {
                this.destroyedTs = destroyedTs;
                return this;
            }

            /**
             * FaultList.
             */
            public Builder faultList(java.util.List<FaultList> faultList) {
                this.faultList = faultList;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public UserList build() {
                return new UserList(this);
            } 

        } 

    }
}
