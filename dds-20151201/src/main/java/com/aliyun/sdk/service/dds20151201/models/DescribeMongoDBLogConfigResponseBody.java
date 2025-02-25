// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
 * {@link DescribeMongoDBLogConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMongoDBLogConfigResponseBody</p>
 */
public class DescribeMongoDBLogConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EnableAudit")
    private Boolean enableAudit;

    @com.aliyun.core.annotation.NameInMap("IsEtlMetaExist")
    private Integer isEtlMetaExist;

    @com.aliyun.core.annotation.NameInMap("IsUserProjectLogstoreExist")
    private Integer isUserProjectLogstoreExist;

    @com.aliyun.core.annotation.NameInMap("PreserveStorageForStandard")
    private Long preserveStorageForStandard;

    @com.aliyun.core.annotation.NameInMap("PreserveStorageForTrail")
    private Long preserveStorageForTrail;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceType")
    private String serviceType;

    @com.aliyun.core.annotation.NameInMap("TtlForStandard")
    private Long ttlForStandard;

    @com.aliyun.core.annotation.NameInMap("TtlForTrail")
    private Long ttlForTrail;

    @com.aliyun.core.annotation.NameInMap("UsedStorageForStandard")
    private Long usedStorageForStandard;

    @com.aliyun.core.annotation.NameInMap("UsedStorageForTrail")
    private Long usedStorageForTrail;

    @com.aliyun.core.annotation.NameInMap("UserProjectName")
    private String userProjectName;

    private DescribeMongoDBLogConfigResponseBody(Builder builder) {
        this.enableAudit = builder.enableAudit;
        this.isEtlMetaExist = builder.isEtlMetaExist;
        this.isUserProjectLogstoreExist = builder.isUserProjectLogstoreExist;
        this.preserveStorageForStandard = builder.preserveStorageForStandard;
        this.preserveStorageForTrail = builder.preserveStorageForTrail;
        this.requestId = builder.requestId;
        this.serviceType = builder.serviceType;
        this.ttlForStandard = builder.ttlForStandard;
        this.ttlForTrail = builder.ttlForTrail;
        this.usedStorageForStandard = builder.usedStorageForStandard;
        this.usedStorageForTrail = builder.usedStorageForTrail;
        this.userProjectName = builder.userProjectName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMongoDBLogConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return enableAudit
     */
    public Boolean getEnableAudit() {
        return this.enableAudit;
    }

    /**
     * @return isEtlMetaExist
     */
    public Integer getIsEtlMetaExist() {
        return this.isEtlMetaExist;
    }

    /**
     * @return isUserProjectLogstoreExist
     */
    public Integer getIsUserProjectLogstoreExist() {
        return this.isUserProjectLogstoreExist;
    }

    /**
     * @return preserveStorageForStandard
     */
    public Long getPreserveStorageForStandard() {
        return this.preserveStorageForStandard;
    }

    /**
     * @return preserveStorageForTrail
     */
    public Long getPreserveStorageForTrail() {
        return this.preserveStorageForTrail;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceType
     */
    public String getServiceType() {
        return this.serviceType;
    }

    /**
     * @return ttlForStandard
     */
    public Long getTtlForStandard() {
        return this.ttlForStandard;
    }

    /**
     * @return ttlForTrail
     */
    public Long getTtlForTrail() {
        return this.ttlForTrail;
    }

    /**
     * @return usedStorageForStandard
     */
    public Long getUsedStorageForStandard() {
        return this.usedStorageForStandard;
    }

    /**
     * @return usedStorageForTrail
     */
    public Long getUsedStorageForTrail() {
        return this.usedStorageForTrail;
    }

    /**
     * @return userProjectName
     */
    public String getUserProjectName() {
        return this.userProjectName;
    }

    public static final class Builder {
        private Boolean enableAudit; 
        private Integer isEtlMetaExist; 
        private Integer isUserProjectLogstoreExist; 
        private Long preserveStorageForStandard; 
        private Long preserveStorageForTrail; 
        private String requestId; 
        private String serviceType; 
        private Long ttlForStandard; 
        private Long ttlForTrail; 
        private Long usedStorageForStandard; 
        private Long usedStorageForTrail; 
        private String userProjectName; 

        /**
         * <p>Indicates whether to enable the audit log feature.</p>
         * <ul>
         * <li><strong>true</strong>: The audit log feature is enabled.</li>
         * <li><strong>false</strong>: The audit log feature is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableAudit(Boolean enableAudit) {
            this.enableAudit = enableAudit;
            return this;
        }

        /**
         * <p>Indicates whether a rule to distribute logs to Logtail is created. For more information, see <a href="https://help.aliyun.com/document_detail/28979.html">Logtail overview</a>. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: A rule to distribute logs to Logtail is created.</li>
         * <li><strong>0</strong> or <strong>null</strong>: A rule to distribute logs to Logtail is not created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder isEtlMetaExist(Integer isEtlMetaExist) {
            this.isEtlMetaExist = isEtlMetaExist;
            return this;
        }

        /**
         * <p>Indicates whether a project exists in the current region. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: A logging project exists in the current region.</li>
         * <li><strong>0</strong> or <strong>null</strong>: A logging project does not exist in the current region.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder isUserProjectLogstoreExist(Integer isUserProjectLogstoreExist) {
            this.isUserProjectLogstoreExist = isUserProjectLogstoreExist;
            return this;
        }

        /**
         * <p>The maximum storage capacity for the formal edition of the audit log feature. If the value is -1, no maximum storage capacity is set.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        public Builder preserveStorageForStandard(Long preserveStorageForStandard) {
            this.preserveStorageForStandard = preserveStorageForStandard;
            return this;
        }

        /**
         * <p>The maximum storage capacity for the free trial edition of the audit log feature. Unit: bytes. You can set the maximum storage capacity to 107,374,182,400 bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>107374182400</p>
         */
        public Builder preserveStorageForTrail(Long preserveStorageForTrail) {
            this.preserveStorageForTrail = preserveStorageForTrail;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>664ECE26-658A-47C5-88F6-870B0132E8D2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The type of the audit log feature. Valid values:</p>
         * <ul>
         * <li><strong>Trail</strong>: the free trial edition</li>
         * <li><strong>Standard</strong>: the official edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        public Builder serviceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }

        /**
         * <p>The retention period for the official edition of the audit log feature. Valid values: 1 to 365. Unit: day.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder ttlForStandard(Long ttlForStandard) {
            this.ttlForStandard = ttlForStandard;
            return this;
        }

        /**
         * <p>The retention period for the free trial edition of the audit log feature.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ttlForTrail(Long ttlForTrail) {
            this.ttlForTrail = ttlForTrail;
            return this;
        }

        /**
         * <p>The used storage capacity for the formal edition of the audit log feature. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>20163</p>
         */
        public Builder usedStorageForStandard(Long usedStorageForStandard) {
            this.usedStorageForStandard = usedStorageForStandard;
            return this;
        }

        /**
         * <p>The used storage capacity for the free trial edition of the audit log feature. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>12548178759</p>
         */
        public Builder usedStorageForTrail(Long usedStorageForTrail) {
            this.usedStorageForTrail = usedStorageForTrail;
            return this;
        }

        /**
         * <p>The name of the project.</p>
         * 
         * <strong>example:</strong>
         * <p>nosql-176498472570****-cn-hangzhou</p>
         */
        public Builder userProjectName(String userProjectName) {
            this.userProjectName = userProjectName;
            return this;
        }

        public DescribeMongoDBLogConfigResponseBody build() {
            return new DescribeMongoDBLogConfigResponseBody(this);
        } 

    } 

}
