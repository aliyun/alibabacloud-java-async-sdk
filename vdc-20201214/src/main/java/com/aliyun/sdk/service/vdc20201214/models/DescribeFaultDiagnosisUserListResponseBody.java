// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vdc20201214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFaultDiagnosisUserListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFaultDiagnosisUserListResponseBody</p>
 */
public class DescribeFaultDiagnosisUserListResponseBody extends TeaModel {
    @NameInMap("PageNo")
    private Integer pageNo;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCnt")
    private Integer totalCnt;

    @NameInMap("UserList")
    private java.util.List < UserList> userList;

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
    public java.util.List < UserList> getUserList() {
        return this.userList;
    }

    public static final class Builder {
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCnt; 
        private java.util.List < UserList> userList; 

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
        public Builder userList(java.util.List < UserList> userList) {
            this.userList = userList;
            return this;
        }

        public DescribeFaultDiagnosisUserListResponseBody build() {
            return new DescribeFaultDiagnosisUserListResponseBody(this);
        } 

    } 

    public static class FaultList extends TeaModel {
        @NameInMap("FaultType")
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
    public static class UserList extends TeaModel {
        @NameInMap("ChannelCreatedTs")
        private Long channelCreatedTs;

        @NameInMap("ChannelId")
        private String channelId;

        @NameInMap("CreatedTs")
        private Long createdTs;

        @NameInMap("DestroyedTs")
        private Long destroyedTs;

        @NameInMap("FaultList")
        private java.util.List < FaultList> faultList;

        @NameInMap("UserId")
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
        public java.util.List < FaultList> getFaultList() {
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
            private java.util.List < FaultList> faultList; 
            private String userId; 

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
            public Builder faultList(java.util.List < FaultList> faultList) {
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
