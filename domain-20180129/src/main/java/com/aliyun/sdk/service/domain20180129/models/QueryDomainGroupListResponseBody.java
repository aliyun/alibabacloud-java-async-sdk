// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryDomainGroupListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDomainGroupListResponseBody</p>
 */
public class QueryDomainGroupListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryDomainGroupListResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDomainGroupListResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryDomainGroupListResponseBody build() {
            return new QueryDomainGroupListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDomainGroupListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDomainGroupListResponseBody</p>
     */
    public static class DomainGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BeingDeleted")
        private Boolean beingDeleted;

        @com.aliyun.core.annotation.NameInMap("CreationDate")
        private String creationDate;

        @com.aliyun.core.annotation.NameInMap("DomainGroupId")
        private String domainGroupId;

        @com.aliyun.core.annotation.NameInMap("DomainGroupName")
        private String domainGroupName;

        @com.aliyun.core.annotation.NameInMap("DomainGroupStatus")
        private String domainGroupStatus;

        @com.aliyun.core.annotation.NameInMap("ModificationDate")
        private String modificationDate;

        @com.aliyun.core.annotation.NameInMap("TotalNumber")
        private Integer totalNumber;

        private DomainGroup(Builder builder) {
            this.beingDeleted = builder.beingDeleted;
            this.creationDate = builder.creationDate;
            this.domainGroupId = builder.domainGroupId;
            this.domainGroupName = builder.domainGroupName;
            this.domainGroupStatus = builder.domainGroupStatus;
            this.modificationDate = builder.modificationDate;
            this.totalNumber = builder.totalNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainGroup create() {
            return builder().build();
        }

        /**
         * @return beingDeleted
         */
        public Boolean getBeingDeleted() {
            return this.beingDeleted;
        }

        /**
         * @return creationDate
         */
        public String getCreationDate() {
            return this.creationDate;
        }

        /**
         * @return domainGroupId
         */
        public String getDomainGroupId() {
            return this.domainGroupId;
        }

        /**
         * @return domainGroupName
         */
        public String getDomainGroupName() {
            return this.domainGroupName;
        }

        /**
         * @return domainGroupStatus
         */
        public String getDomainGroupStatus() {
            return this.domainGroupStatus;
        }

        /**
         * @return modificationDate
         */
        public String getModificationDate() {
            return this.modificationDate;
        }

        /**
         * @return totalNumber
         */
        public Integer getTotalNumber() {
            return this.totalNumber;
        }

        public static final class Builder {
            private Boolean beingDeleted; 
            private String creationDate; 
            private String domainGroupId; 
            private String domainGroupName; 
            private String domainGroupStatus; 
            private String modificationDate; 
            private Integer totalNumber; 

            /**
             * BeingDeleted.
             */
            public Builder beingDeleted(Boolean beingDeleted) {
                this.beingDeleted = beingDeleted;
                return this;
            }

            /**
             * CreationDate.
             */
            public Builder creationDate(String creationDate) {
                this.creationDate = creationDate;
                return this;
            }

            /**
             * DomainGroupId.
             */
            public Builder domainGroupId(String domainGroupId) {
                this.domainGroupId = domainGroupId;
                return this;
            }

            /**
             * DomainGroupName.
             */
            public Builder domainGroupName(String domainGroupName) {
                this.domainGroupName = domainGroupName;
                return this;
            }

            /**
             * DomainGroupStatus.
             */
            public Builder domainGroupStatus(String domainGroupStatus) {
                this.domainGroupStatus = domainGroupStatus;
                return this;
            }

            /**
             * ModificationDate.
             */
            public Builder modificationDate(String modificationDate) {
                this.modificationDate = modificationDate;
                return this;
            }

            /**
             * TotalNumber.
             */
            public Builder totalNumber(Integer totalNumber) {
                this.totalNumber = totalNumber;
                return this;
            }

            public DomainGroup build() {
                return new DomainGroup(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryDomainGroupListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDomainGroupListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainGroup")
        private java.util.List < DomainGroup> domainGroup;

        private Data(Builder builder) {
            this.domainGroup = builder.domainGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return domainGroup
         */
        public java.util.List < DomainGroup> getDomainGroup() {
            return this.domainGroup;
        }

        public static final class Builder {
            private java.util.List < DomainGroup> domainGroup; 

            /**
             * DomainGroup.
             */
            public Builder domainGroup(java.util.List < DomainGroup> domainGroup) {
                this.domainGroup = domainGroup;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
