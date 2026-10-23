// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

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
 * {@link DescribeHanaInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHanaInstancesResponseBody</p>
 */
public class DescribeHanaInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Hanas")
    private Hanas hanas;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeHanaInstancesResponseBody model) {
            this.code = model.code;
            this.hanas = model.hanas;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The response code. The status code 200 indicates that the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Hanas.
         */
        public Builder hanas(Hanas hanas) {
            this.hanas = hanas;
            return this;
        }

        /**
         * <p>The returned message. If the request was successful, &quot;successful&quot; is returned. If the request failed, an error message is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 99. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4003DD68-3C3C-5071-B4FC-631A6C1BAC1C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>21</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeHanaInstancesResponseBody build() {
            return new DescribeHanaInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeHanaInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHanaInstancesResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
    /**
     * 
     * {@link DescribeHanaInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHanaInstancesResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

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
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tag = model.tag;
            } 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeHanaInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHanaInstancesResponseBody</p>
     */
    public static class Hana extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertSetting")
        private String alertSetting;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("CrossAccountRoleName")
        private String crossAccountRoleName;

        @com.aliyun.core.annotation.NameInMap("CrossAccountType")
        private String crossAccountType;

        @com.aliyun.core.annotation.NameInMap("CrossAccountUserId")
        private Long crossAccountUserId;

        @com.aliyun.core.annotation.NameInMap("HanaName")
        private String hanaName;

        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("InstanceNumber")
        private Integer instanceNumber;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Long status;

        @com.aliyun.core.annotation.NameInMap("StatusMessage")
        private String statusMessage;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("UseSsl")
        private Boolean useSsl;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        @com.aliyun.core.annotation.NameInMap("ValidateCertificate")
        private Boolean validateCertificate;

        @com.aliyun.core.annotation.NameInMap("VaultId")
        private String vaultId;

        private Hana(Builder builder) {
            this.alertSetting = builder.alertSetting;
            this.clusterId = builder.clusterId;
            this.crossAccountRoleName = builder.crossAccountRoleName;
            this.crossAccountType = builder.crossAccountType;
            this.crossAccountUserId = builder.crossAccountUserId;
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
         * @return crossAccountRoleName
         */
        public String getCrossAccountRoleName() {
            return this.crossAccountRoleName;
        }

        /**
         * @return crossAccountType
         */
        public String getCrossAccountType() {
            return this.crossAccountType;
        }

        /**
         * @return crossAccountUserId
         */
        public Long getCrossAccountUserId() {
            return this.crossAccountUserId;
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
            private String crossAccountRoleName; 
            private String crossAccountType; 
            private Long crossAccountUserId; 
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

            private Builder() {
            } 

            private Builder(Hana model) {
                this.alertSetting = model.alertSetting;
                this.clusterId = model.clusterId;
                this.crossAccountRoleName = model.crossAccountRoleName;
                this.crossAccountType = model.crossAccountType;
                this.crossAccountUserId = model.crossAccountUserId;
                this.hanaName = model.hanaName;
                this.host = model.host;
                this.instanceNumber = model.instanceNumber;
                this.resourceGroupId = model.resourceGroupId;
                this.status = model.status;
                this.statusMessage = model.statusMessage;
                this.tags = model.tags;
                this.useSsl = model.useSsl;
                this.userName = model.userName;
                this.validateCertificate = model.validateCertificate;
                this.vaultId = model.vaultId;
            } 

            /**
             * AlertSetting.
             */
            public Builder alertSetting(String alertSetting) {
                this.alertSetting = alertSetting;
                return this;
            }

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * CrossAccountRoleName.
             */
            public Builder crossAccountRoleName(String crossAccountRoleName) {
                this.crossAccountRoleName = crossAccountRoleName;
                return this;
            }

            /**
             * CrossAccountType.
             */
            public Builder crossAccountType(String crossAccountType) {
                this.crossAccountType = crossAccountType;
                return this;
            }

            /**
             * CrossAccountUserId.
             */
            public Builder crossAccountUserId(Long crossAccountUserId) {
                this.crossAccountUserId = crossAccountUserId;
                return this;
            }

            /**
             * HanaName.
             */
            public Builder hanaName(String hanaName) {
                this.hanaName = hanaName;
                return this;
            }

            /**
             * Host.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * InstanceNumber.
             */
            public Builder instanceNumber(Integer instanceNumber) {
                this.instanceNumber = instanceNumber;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * StatusMessage.
             */
            public Builder statusMessage(String statusMessage) {
                this.statusMessage = statusMessage;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * UseSsl.
             */
            public Builder useSsl(Boolean useSsl) {
                this.useSsl = useSsl;
                return this;
            }

            /**
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * ValidateCertificate.
             */
            public Builder validateCertificate(Boolean validateCertificate) {
                this.validateCertificate = validateCertificate;
                return this;
            }

            /**
             * VaultId.
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
    /**
     * 
     * {@link DescribeHanaInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHanaInstancesResponseBody</p>
     */
    public static class Hanas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Hana")
        private java.util.List<Hana> hana;

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
        public java.util.List<Hana> getHana() {
            return this.hana;
        }

        public static final class Builder {
            private java.util.List<Hana> hana; 

            private Builder() {
            } 

            private Builder(Hanas model) {
                this.hana = model.hana;
            } 

            /**
             * Hana.
             */
            public Builder hana(java.util.List<Hana> hana) {
                this.hana = hana;
                return this;
            }

            public Hanas build() {
                return new Hanas(this);
            } 

        } 

    }
}
