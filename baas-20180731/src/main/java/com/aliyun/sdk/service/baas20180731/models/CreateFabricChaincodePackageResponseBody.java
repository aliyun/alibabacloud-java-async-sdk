// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFabricChaincodePackageResponseBody} extends {@link TeaModel}
 *
 * <p>CreateFabricChaincodePackageResponseBody</p>
 */
public class CreateFabricChaincodePackageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private Integer errorCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateFabricChaincodePackageResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFabricChaincodePackageResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public Integer getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer errorCode; 
        private String message; 
        private String requestId; 
        private Result result; 
        private Boolean success; 

        /**
         * ErrorCode.
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateFabricChaincodePackageResponseBody build() {
            return new CreateFabricChaincodePackageResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChaincodePackageId")
        private Integer chaincodePackageId;

        @com.aliyun.core.annotation.NameInMap("Checksum")
        private String checksum;

        @com.aliyun.core.annotation.NameInMap("DeleteTime")
        private Long deleteTime;

        @com.aliyun.core.annotation.NameInMap("Deleted")
        private Boolean deleted;

        @com.aliyun.core.annotation.NameInMap("InstallTime")
        private Long installTime;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Md5sum")
        private String md5sum;

        @com.aliyun.core.annotation.NameInMap("OrganizationId")
        private String organizationId;

        @com.aliyun.core.annotation.NameInMap("OssBucket")
        private String ossBucket;

        @com.aliyun.core.annotation.NameInMap("OssURL")
        private String ossURL;

        @com.aliyun.core.annotation.NameInMap("ProviderBid")
        private String providerBid;

        @com.aliyun.core.annotation.NameInMap("ProviderUid")
        private Long providerUid;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("TypeString")
        private Boolean typeString;

        @com.aliyun.core.annotation.NameInMap("UploadTime")
        private Long uploadTime;

        private Result(Builder builder) {
            this.chaincodePackageId = builder.chaincodePackageId;
            this.checksum = builder.checksum;
            this.deleteTime = builder.deleteTime;
            this.deleted = builder.deleted;
            this.installTime = builder.installTime;
            this.label = builder.label;
            this.md5sum = builder.md5sum;
            this.organizationId = builder.organizationId;
            this.ossBucket = builder.ossBucket;
            this.ossURL = builder.ossURL;
            this.providerBid = builder.providerBid;
            this.providerUid = builder.providerUid;
            this.state = builder.state;
            this.type = builder.type;
            this.typeString = builder.typeString;
            this.uploadTime = builder.uploadTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return chaincodePackageId
         */
        public Integer getChaincodePackageId() {
            return this.chaincodePackageId;
        }

        /**
         * @return checksum
         */
        public String getChecksum() {
            return this.checksum;
        }

        /**
         * @return deleteTime
         */
        public Long getDeleteTime() {
            return this.deleteTime;
        }

        /**
         * @return deleted
         */
        public Boolean getDeleted() {
            return this.deleted;
        }

        /**
         * @return installTime
         */
        public Long getInstallTime() {
            return this.installTime;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return md5sum
         */
        public String getMd5sum() {
            return this.md5sum;
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        /**
         * @return ossBucket
         */
        public String getOssBucket() {
            return this.ossBucket;
        }

        /**
         * @return ossURL
         */
        public String getOssURL() {
            return this.ossURL;
        }

        /**
         * @return providerBid
         */
        public String getProviderBid() {
            return this.providerBid;
        }

        /**
         * @return providerUid
         */
        public Long getProviderUid() {
            return this.providerUid;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return typeString
         */
        public Boolean getTypeString() {
            return this.typeString;
        }

        /**
         * @return uploadTime
         */
        public Long getUploadTime() {
            return this.uploadTime;
        }

        public static final class Builder {
            private Integer chaincodePackageId; 
            private String checksum; 
            private Long deleteTime; 
            private Boolean deleted; 
            private Long installTime; 
            private String label; 
            private String md5sum; 
            private String organizationId; 
            private String ossBucket; 
            private String ossURL; 
            private String providerBid; 
            private Long providerUid; 
            private String state; 
            private String type; 
            private Boolean typeString; 
            private Long uploadTime; 

            /**
             * ChaincodePackageId.
             */
            public Builder chaincodePackageId(Integer chaincodePackageId) {
                this.chaincodePackageId = chaincodePackageId;
                return this;
            }

            /**
             * Checksum.
             */
            public Builder checksum(String checksum) {
                this.checksum = checksum;
                return this;
            }

            /**
             * DeleteTime.
             */
            public Builder deleteTime(Long deleteTime) {
                this.deleteTime = deleteTime;
                return this;
            }

            /**
             * Deleted.
             */
            public Builder deleted(Boolean deleted) {
                this.deleted = deleted;
                return this;
            }

            /**
             * InstallTime.
             */
            public Builder installTime(Long installTime) {
                this.installTime = installTime;
                return this;
            }

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * Md5sum.
             */
            public Builder md5sum(String md5sum) {
                this.md5sum = md5sum;
                return this;
            }

            /**
             * OrganizationId.
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            /**
             * OssBucket.
             */
            public Builder ossBucket(String ossBucket) {
                this.ossBucket = ossBucket;
                return this;
            }

            /**
             * OssURL.
             */
            public Builder ossURL(String ossURL) {
                this.ossURL = ossURL;
                return this;
            }

            /**
             * ProviderBid.
             */
            public Builder providerBid(String providerBid) {
                this.providerBid = providerBid;
                return this;
            }

            /**
             * ProviderUid.
             */
            public Builder providerUid(Long providerUid) {
                this.providerUid = providerUid;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
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
             * TypeString.
             */
            public Builder typeString(Boolean typeString) {
                this.typeString = typeString;
                return this;
            }

            /**
             * UploadTime.
             */
            public Builder uploadTime(Long uploadTime) {
                this.uploadTime = uploadTime;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
