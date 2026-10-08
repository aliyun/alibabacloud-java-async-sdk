// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(SaveDomainGroupResponseBody model) {
            this.beingDeleted = model.beingDeleted;
            this.creationDate = model.creationDate;
            this.domainGroupId = model.domainGroupId;
            this.domainGroupName = model.domainGroupName;
            this.domainGroupStatus = model.domainGroupStatus;
            this.modificationDate = model.modificationDate;
            this.requestId = model.requestId;
            this.totalNumber = model.totalNumber;
        } 

        /**
         * <p>Indicates whether the group is being deleted.  </p>
         * <blockquote>
         * <p>For groups containing more than 1,000 domain names, deletion is an asynchronous procedure that requires some time for the system to process. During this period, this field is <strong>true</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder beingDeleted(Boolean beingDeleted) {
            this.beingDeleted = beingDeleted;
            return this;
        }

        /**
         * <p>Creation Time of the domain name group.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-04-02 15:59:06</p>
         */
        public Builder creationDate(String creationDate) {
            this.creationDate = creationDate;
            return this;
        }

        /**
         * <p>Domain group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder domainGroupId(Long domainGroupId) {
            this.domainGroupId = domainGroupId;
            return this;
        }

        /**
         * <p>Domain Name Group Name.</p>
         * 
         * <strong>example:</strong>
         * <p>测试分组</p>
         */
        public Builder domainGroupName(String domainGroupName) {
            this.domainGroupName = domainGroupName;
            return this;
        }

        /**
         * <p>Status of the domain name group. Valid values:  </p>
         * <ul>
         * <li><strong>PROCESSING</strong>: Processing;  </li>
         * <li><strong>COMPLETE</strong>: Complete.</li>
         * </ul>
         * <blockquote>
         * <p>In cases such as setting a group via a file or replacing a group with more than 1,000 domain names, the operation is asynchronous and requires waiting for system processing. During this time, this field is <strong>PROCESSING</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>COMPLETE</p>
         */
        public Builder domainGroupStatus(String domainGroupStatus) {
            this.domainGroupStatus = domainGroupStatus;
            return this;
        }

        /**
         * <p>Updated At time of the domain name group.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-04-02 15:59:06</p>
         */
        public Builder modificationDate(String modificationDate) {
            this.modificationDate = modificationDate;
            return this;
        }

        /**
         * <p>Unique request identity.</p>
         * 
         * <strong>example:</strong>
         * <p>80011ABC-F573-4795-B0E8-377BFBBA3422</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Quantity of domain names.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
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
