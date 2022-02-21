// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMongoDBLogConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMongoDBLogConfigResponseBody</p>
 */
public class DescribeMongoDBLogConfigResponseBody extends TeaModel {
    @NameInMap("EnableAudit")
    private Boolean enableAudit;

    @NameInMap("IsEtlMetaExist")
    private Integer isEtlMetaExist;

    @NameInMap("IsUserProjectLogstoreExist")
    private Integer isUserProjectLogstoreExist;

    @NameInMap("PreserveStorageForStandard")
    private Long preserveStorageForStandard;

    @NameInMap("PreserveStorageForTrail")
    private Long preserveStorageForTrail;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ServiceType")
    private String serviceType;

    @NameInMap("TtlForStandard")
    private Long ttlForStandard;

    @NameInMap("TtlForTrail")
    private Long ttlForTrail;

    @NameInMap("UsedStorageForStandard")
    private Long usedStorageForStandard;

    @NameInMap("UsedStorageForTrail")
    private Long usedStorageForTrail;

    @NameInMap("UserProjectName")
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
         * EnableAudit.
         */
        public Builder enableAudit(Boolean enableAudit) {
            this.enableAudit = enableAudit;
            return this;
        }

        /**
         * IsEtlMetaExist.
         */
        public Builder isEtlMetaExist(Integer isEtlMetaExist) {
            this.isEtlMetaExist = isEtlMetaExist;
            return this;
        }

        /**
         * IsUserProjectLogstoreExist.
         */
        public Builder isUserProjectLogstoreExist(Integer isUserProjectLogstoreExist) {
            this.isUserProjectLogstoreExist = isUserProjectLogstoreExist;
            return this;
        }

        /**
         * PreserveStorageForStandard.
         */
        public Builder preserveStorageForStandard(Long preserveStorageForStandard) {
            this.preserveStorageForStandard = preserveStorageForStandard;
            return this;
        }

        /**
         * PreserveStorageForTrail.
         */
        public Builder preserveStorageForTrail(Long preserveStorageForTrail) {
            this.preserveStorageForTrail = preserveStorageForTrail;
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
         * ServiceType.
         */
        public Builder serviceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }

        /**
         * TtlForStandard.
         */
        public Builder ttlForStandard(Long ttlForStandard) {
            this.ttlForStandard = ttlForStandard;
            return this;
        }

        /**
         * TtlForTrail.
         */
        public Builder ttlForTrail(Long ttlForTrail) {
            this.ttlForTrail = ttlForTrail;
            return this;
        }

        /**
         * UsedStorageForStandard.
         */
        public Builder usedStorageForStandard(Long usedStorageForStandard) {
            this.usedStorageForStandard = usedStorageForStandard;
            return this;
        }

        /**
         * UsedStorageForTrail.
         */
        public Builder usedStorageForTrail(Long usedStorageForTrail) {
            this.usedStorageForTrail = usedStorageForTrail;
            return this;
        }

        /**
         * UserProjectName.
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
