// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHanaInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHanaInstancesResponseBody</p>
 */
public class DescribeHanaInstancesResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Hanas")
    private Hanas hanas;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeHanaInstancesResponseBody(Builder builder) {
        this.code = builder.code;
        this.hanas = builder.hanas;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHanaInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return hanas
     */
    public Hanas getHanas() {
        return this.hanas;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private Hanas hanas; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        /**
         * The HTTP status code. The status code 200 indicates that the call is successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The information about the SAP HANA instances.
         */
        public Builder hanas(Hanas hanas) {
            this.hanas = hanas;
            return this;
        }

        /**
         * The message that is returned. If the call is successful, "successful" is returned. If the call fails, an error message is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The page number of the returned page. Pages start from page 1. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned on each page. Valid values: 1 to 99. Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the call is successful. Valid values:
         * <p>
         * 
         * *   true: The call is successful.
         * *   false: The call fails.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The total number of returned entries.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeHanaInstancesResponseBody build() {
            return new DescribeHanaInstancesResponseBody(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Tag")
        private java.util.List < Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class Hana extends TeaModel {
        @NameInMap("AlertSetting")
        private String alertSetting;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("HanaName")
        private String hanaName;

        @NameInMap("Host")
        private String host;

        @NameInMap("InstanceNumber")
        private Integer instanceNumber;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Status")
        private Long status;

        @NameInMap("StatusMessage")
        private String statusMessage;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("UseSsl")
        private Boolean useSsl;

        @NameInMap("UserName")
        private String userName;

        @NameInMap("ValidateCertificate")
        private Boolean validateCertificate;

        @NameInMap("VaultId")
        private String vaultId;

        private Hana(Builder builder) {
            this.alertSetting = builder.alertSetting;
            this.clusterId = builder.clusterId;
            this.hanaName = builder.hanaName;
            this.host = builder.host;
            this.instanceNumber = builder.instanceNumber;
            this.resourceGroupId = builder.resourceGroupId;
            this.status = builder.status;
            this.statusMessage = builder.statusMessage;
            this.tags = builder.tags;
            this.useSsl = builder.useSsl;
            this.userName = builder.userName;
            this.validateCertificate = builder.validateCertificate;
            this.vaultId = builder.vaultId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Hana create() {
            return builder().build();
        }

        /**
         * @return alertSetting
         */
        public String getAlertSetting() {
            return this.alertSetting;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return hanaName
         */
        public String getHanaName() {
            return this.hanaName;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return instanceNumber
         */
        public Integer getInstanceNumber() {
            return this.instanceNumber;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        /**
         * @return statusMessage
         */
        public String getStatusMessage() {
            return this.statusMessage;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return useSsl
         */
        public Boolean getUseSsl() {
            return this.useSsl;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        /**
         * @return validateCertificate
         */
        public Boolean getValidateCertificate() {
            return this.validateCertificate;
        }

        /**
         * @return vaultId
         */
        public String getVaultId() {
            return this.vaultId;
        }

        public static final class Builder {
            private String alertSetting; 
            private String clusterId; 
            private String hanaName; 
            private String host; 
            private Integer instanceNumber; 
            private String resourceGroupId; 
            private Long status; 
            private String statusMessage; 
            private Tags tags; 
            private Boolean useSsl; 
            private String userName; 
            private Boolean validateCertificate; 
            private String vaultId; 

            /**
             * The alert settings. Valid value: INHERITED, which indicates that the backup client sends alert notifications in the same way as the backup vault.
             */
            public Builder alertSetting(String alertSetting) {
                this.alertSetting = alertSetting;
                return this;
            }

            /**
             * The ID of the SAP HANA instance.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The name of the SAP HANA instance.
             */
            public Builder hanaName(String hanaName) {
                this.hanaName = hanaName;
                return this;
            }

            /**
             * The private or internal IP address of the host where the primary node of the SAP HANA instance resides.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * The instance number of the SAP HANA system.
             */
            public Builder instanceNumber(Integer instanceNumber) {
                this.instanceNumber = instanceNumber;
                return this;
            }

            /**
             * The ID of resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The status of the SAP HANA instance. Valid values:
             * <p>
             * 
             * *   INITIALIZING: The instance is being initialized.
             * *   INITIALIZED: The instance is registered.
             * *   INVALID_HANA_NODE: The instance is invalid.
             * *   INITIALIZE_FAILED: The client fails to be installed on the instance.
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * The status information.
             */
            public Builder statusMessage(String statusMessage) {
                this.statusMessage = statusMessage;
                return this;
            }

            /**
             * The tags of the SAP HANA instance.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * Indicates whether the SAP HANA instance is connected over Secure Sockets Layer (SSL). Valid values:
             * <p>
             * 
             * *   true: The SAP HANA instance is connected over SSL.
             * *   false: The SAP HANA instance is not connected over SSL.
             */
            public Builder useSsl(Boolean useSsl) {
                this.useSsl = useSsl;
                return this;
            }

            /**
             * The username of the SYSTEMDB database.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * Indicates whether the SSL certificate of the SAP HANA instance is verified.
             */
            public Builder validateCertificate(Boolean validateCertificate) {
                this.validateCertificate = validateCertificate;
                return this;
            }

            /**
             * The ID of the backup vault.
             */
            public Builder vaultId(String vaultId) {
                this.vaultId = vaultId;
                return this;
            }

            public Hana build() {
                return new Hana(this);
            } 

        } 

    }
    public static class Hanas extends TeaModel {
        @NameInMap("Hana")
        private java.util.List < Hana> hana;

        private Hanas(Builder builder) {
            this.hana = builder.hana;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Hanas create() {
            return builder().build();
        }

        /**
         * @return hana
         */
        public java.util.List < Hana> getHana() {
            return this.hana;
        }

        public static final class Builder {
            private java.util.List < Hana> hana; 

            /**
             * Hana.
             */
            public Builder hana(java.util.List < Hana> hana) {
                this.hana = hana;
                return this;
            }

            public Hanas build() {
                return new Hanas(this);
            } 

        } 

    }
}
