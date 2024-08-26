// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveDomainGroupResponseBody} extends {@link TeaModel}
 *
 * <p>SaveDomainGroupResponseBody</p>
 */
public class SaveDomainGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BeingDeleted")
    private Boolean beingDeleted;

    @com.aliyun.core.annotation.NameInMap("CreationDate")
    private String creationDate;

    @com.aliyun.core.annotation.NameInMap("DomainGroupId")
    private Long domainGroupId;

    @com.aliyun.core.annotation.NameInMap("DomainGroupName")
    private String domainGroupName;

    @com.aliyun.core.annotation.NameInMap("DomainGroupStatus")
    private String domainGroupStatus;

    @com.aliyun.core.annotation.NameInMap("ModificationDate")
    private String modificationDate;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalNumber")
    private Integer totalNumber;

    private SaveDomainGroupResponseBody(Builder builder) {
        this.beingDeleted = builder.beingDeleted;
        this.creationDate = builder.creationDate;
        this.domainGroupId = builder.domainGroupId;
        this.domainGroupName = builder.domainGroupName;
        this.domainGroupStatus = builder.domainGroupStatus;
        this.modificationDate = builder.modificationDate;
        this.requestId = builder.requestId;
        this.totalNumber = builder.totalNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveDomainGroupResponseBody create() {
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
    public Long getDomainGroupId() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private Long domainGroupId; 
        private String domainGroupName; 
        private String domainGroupStatus; 
        private String modificationDate; 
        private String requestId; 
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
        public Builder domainGroupId(Long domainGroupId) {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalNumber.
         */
        public Builder totalNumber(Integer totalNumber) {
            this.totalNumber = totalNumber;
            return this;
        }

        public SaveDomainGroupResponseBody build() {
            return new SaveDomainGroupResponseBody(this);
        } 

    } 

}
