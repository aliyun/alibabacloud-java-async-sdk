// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

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
 * {@link ListContactFlowsResponseBody} extends {@link TeaModel}
 *
 * <p>ListContactFlowsResponseBody</p>
 */
public class ListContactFlowsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ContactFlows")
    private ContactFlows contactFlows;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListContactFlowsResponseBody(Builder builder) {
        this.code = builder.code;
        this.contactFlows = builder.contactFlows;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListContactFlowsResponseBody create() {
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
     * @return contactFlows
     */
    public ContactFlows getContactFlows() {
        return this.contactFlows;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private ContactFlows contactFlows; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListContactFlowsResponseBody model) {
            this.code = model.code;
            this.contactFlows = model.contactFlows;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * ContactFlows.
         */
        public Builder contactFlows(ContactFlows contactFlows) {
            this.contactFlows = contactFlows;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListContactFlowsResponseBody build() {
            return new ListContactFlowsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListContactFlowsResponseBody} extends {@link TeaModel}
     *
     * <p>ListContactFlowsResponseBody</p>
     */
    public static class PhoneNumber extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowOutbound")
        private Boolean allowOutbound;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Number")
        private String number;

        @com.aliyun.core.annotation.NameInMap("PhoneNumberDescription")
        private String phoneNumberDescription;

        @com.aliyun.core.annotation.NameInMap("PhoneNumberId")
        private String phoneNumberId;

        @com.aliyun.core.annotation.NameInMap("RemainingTime")
        private Integer remainingTime;

        @com.aliyun.core.annotation.NameInMap("TestOnly")
        private Boolean testOnly;

        @com.aliyun.core.annotation.NameInMap("Trunks")
        private Integer trunks;

        @com.aliyun.core.annotation.NameInMap("Usage")
        private String usage;

        private PhoneNumber(Builder builder) {
            this.allowOutbound = builder.allowOutbound;
            this.instanceId = builder.instanceId;
            this.number = builder.number;
            this.phoneNumberDescription = builder.phoneNumberDescription;
            this.phoneNumberId = builder.phoneNumberId;
            this.remainingTime = builder.remainingTime;
            this.testOnly = builder.testOnly;
            this.trunks = builder.trunks;
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PhoneNumber create() {
            return builder().build();
        }

        /**
         * @return allowOutbound
         */
        public Boolean getAllowOutbound() {
            return this.allowOutbound;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return number
         */
        public String getNumber() {
            return this.number;
        }

        /**
         * @return phoneNumberDescription
         */
        public String getPhoneNumberDescription() {
            return this.phoneNumberDescription;
        }

        /**
         * @return phoneNumberId
         */
        public String getPhoneNumberId() {
            return this.phoneNumberId;
        }

        /**
         * @return remainingTime
         */
        public Integer getRemainingTime() {
            return this.remainingTime;
        }

        /**
         * @return testOnly
         */
        public Boolean getTestOnly() {
            return this.testOnly;
        }

        /**
         * @return trunks
         */
        public Integer getTrunks() {
            return this.trunks;
        }

        /**
         * @return usage
         */
        public String getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private Boolean allowOutbound; 
            private String instanceId; 
            private String number; 
            private String phoneNumberDescription; 
            private String phoneNumberId; 
            private Integer remainingTime; 
            private Boolean testOnly; 
            private Integer trunks; 
            private String usage; 

            private Builder() {
            } 

            private Builder(PhoneNumber model) {
                this.allowOutbound = model.allowOutbound;
                this.instanceId = model.instanceId;
                this.number = model.number;
                this.phoneNumberDescription = model.phoneNumberDescription;
                this.phoneNumberId = model.phoneNumberId;
                this.remainingTime = model.remainingTime;
                this.testOnly = model.testOnly;
                this.trunks = model.trunks;
                this.usage = model.usage;
            } 

            /**
             * AllowOutbound.
             */
            public Builder allowOutbound(Boolean allowOutbound) {
                this.allowOutbound = allowOutbound;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Number.
             */
            public Builder number(String number) {
                this.number = number;
                return this;
            }

            /**
             * PhoneNumberDescription.
             */
            public Builder phoneNumberDescription(String phoneNumberDescription) {
                this.phoneNumberDescription = phoneNumberDescription;
                return this;
            }

            /**
             * PhoneNumberId.
             */
            public Builder phoneNumberId(String phoneNumberId) {
                this.phoneNumberId = phoneNumberId;
                return this;
            }

            /**
             * RemainingTime.
             */
            public Builder remainingTime(Integer remainingTime) {
                this.remainingTime = remainingTime;
                return this;
            }

            /**
             * TestOnly.
             */
            public Builder testOnly(Boolean testOnly) {
                this.testOnly = testOnly;
                return this;
            }

            /**
             * Trunks.
             */
            public Builder trunks(Integer trunks) {
                this.trunks = trunks;
                return this;
            }

            /**
             * Usage.
             */
            public Builder usage(String usage) {
                this.usage = usage;
                return this;
            }

            public PhoneNumber build() {
                return new PhoneNumber(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListContactFlowsResponseBody} extends {@link TeaModel}
     *
     * <p>ListContactFlowsResponseBody</p>
     */
    public static class PhoneNumbers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PhoneNumber")
        private java.util.List<PhoneNumber> phoneNumber;

        private PhoneNumbers(Builder builder) {
            this.phoneNumber = builder.phoneNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PhoneNumbers create() {
            return builder().build();
        }

        /**
         * @return phoneNumber
         */
        public java.util.List<PhoneNumber> getPhoneNumber() {
            return this.phoneNumber;
        }

        public static final class Builder {
            private java.util.List<PhoneNumber> phoneNumber; 

            private Builder() {
            } 

            private Builder(PhoneNumbers model) {
                this.phoneNumber = model.phoneNumber;
            } 

            /**
             * PhoneNumber.
             */
            public Builder phoneNumber(java.util.List<PhoneNumber> phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            public PhoneNumbers build() {
                return new PhoneNumbers(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListContactFlowsResponseBody} extends {@link TeaModel}
     *
     * <p>ListContactFlowsResponseBody</p>
     */
    public static class ContactFlowVersion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactFlowVersionDescription")
        private String contactFlowVersionDescription;

        @com.aliyun.core.annotation.NameInMap("ContactFlowVersionId")
        private String contactFlowVersionId;

        @com.aliyun.core.annotation.NameInMap("LastModified")
        private String lastModified;

        @com.aliyun.core.annotation.NameInMap("LastModifiedBy")
        private String lastModifiedBy;

        @com.aliyun.core.annotation.NameInMap("LockedBy")
        private String lockedBy;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private ContactFlowVersion(Builder builder) {
            this.contactFlowVersionDescription = builder.contactFlowVersionDescription;
            this.contactFlowVersionId = builder.contactFlowVersionId;
            this.lastModified = builder.lastModified;
            this.lastModifiedBy = builder.lastModifiedBy;
            this.lockedBy = builder.lockedBy;
            this.status = builder.status;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContactFlowVersion create() {
            return builder().build();
        }

        /**
         * @return contactFlowVersionDescription
         */
        public String getContactFlowVersionDescription() {
            return this.contactFlowVersionDescription;
        }

        /**
         * @return contactFlowVersionId
         */
        public String getContactFlowVersionId() {
            return this.contactFlowVersionId;
        }

        /**
         * @return lastModified
         */
        public String getLastModified() {
            return this.lastModified;
        }

        /**
         * @return lastModifiedBy
         */
        public String getLastModifiedBy() {
            return this.lastModifiedBy;
        }

        /**
         * @return lockedBy
         */
        public String getLockedBy() {
            return this.lockedBy;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String contactFlowVersionDescription; 
            private String contactFlowVersionId; 
            private String lastModified; 
            private String lastModifiedBy; 
            private String lockedBy; 
            private String status; 
            private String version; 

            private Builder() {
            } 

            private Builder(ContactFlowVersion model) {
                this.contactFlowVersionDescription = model.contactFlowVersionDescription;
                this.contactFlowVersionId = model.contactFlowVersionId;
                this.lastModified = model.lastModified;
                this.lastModifiedBy = model.lastModifiedBy;
                this.lockedBy = model.lockedBy;
                this.status = model.status;
                this.version = model.version;
            } 

            /**
             * ContactFlowVersionDescription.
             */
            public Builder contactFlowVersionDescription(String contactFlowVersionDescription) {
                this.contactFlowVersionDescription = contactFlowVersionDescription;
                return this;
            }

            /**
             * ContactFlowVersionId.
             */
            public Builder contactFlowVersionId(String contactFlowVersionId) {
                this.contactFlowVersionId = contactFlowVersionId;
                return this;
            }

            /**
             * LastModified.
             */
            public Builder lastModified(String lastModified) {
                this.lastModified = lastModified;
                return this;
            }

            /**
             * LastModifiedBy.
             */
            public Builder lastModifiedBy(String lastModifiedBy) {
                this.lastModifiedBy = lastModifiedBy;
                return this;
            }

            /**
             * LockedBy.
             */
            public Builder lockedBy(String lockedBy) {
                this.lockedBy = lockedBy;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public ContactFlowVersion build() {
                return new ContactFlowVersion(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListContactFlowsResponseBody} extends {@link TeaModel}
     *
     * <p>ListContactFlowsResponseBody</p>
     */
    public static class Versions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactFlowVersion")
        private java.util.List<ContactFlowVersion> contactFlowVersion;

        private Versions(Builder builder) {
            this.contactFlowVersion = builder.contactFlowVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Versions create() {
            return builder().build();
        }

        /**
         * @return contactFlowVersion
         */
        public java.util.List<ContactFlowVersion> getContactFlowVersion() {
            return this.contactFlowVersion;
        }

        public static final class Builder {
            private java.util.List<ContactFlowVersion> contactFlowVersion; 

            private Builder() {
            } 

            private Builder(Versions model) {
                this.contactFlowVersion = model.contactFlowVersion;
            } 

            /**
             * ContactFlowVersion.
             */
            public Builder contactFlowVersion(java.util.List<ContactFlowVersion> contactFlowVersion) {
                this.contactFlowVersion = contactFlowVersion;
                return this;
            }

            public Versions build() {
                return new Versions(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListContactFlowsResponseBody} extends {@link TeaModel}
     *
     * <p>ListContactFlowsResponseBody</p>
     */
    public static class ContactFlow extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppliedVersion")
        private String appliedVersion;

        @com.aliyun.core.annotation.NameInMap("ContactFlowDescription")
        private String contactFlowDescription;

        @com.aliyun.core.annotation.NameInMap("ContactFlowId")
        private String contactFlowId;

        @com.aliyun.core.annotation.NameInMap("ContactFlowName")
        private String contactFlowName;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("PhoneNumbers")
        private PhoneNumbers phoneNumbers;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Versions")
        private Versions versions;

        private ContactFlow(Builder builder) {
            this.appliedVersion = builder.appliedVersion;
            this.contactFlowDescription = builder.contactFlowDescription;
            this.contactFlowId = builder.contactFlowId;
            this.contactFlowName = builder.contactFlowName;
            this.instanceId = builder.instanceId;
            this.phoneNumbers = builder.phoneNumbers;
            this.type = builder.type;
            this.versions = builder.versions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContactFlow create() {
            return builder().build();
        }

        /**
         * @return appliedVersion
         */
        public String getAppliedVersion() {
            return this.appliedVersion;
        }

        /**
         * @return contactFlowDescription
         */
        public String getContactFlowDescription() {
            return this.contactFlowDescription;
        }

        /**
         * @return contactFlowId
         */
        public String getContactFlowId() {
            return this.contactFlowId;
        }

        /**
         * @return contactFlowName
         */
        public String getContactFlowName() {
            return this.contactFlowName;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return phoneNumbers
         */
        public PhoneNumbers getPhoneNumbers() {
            return this.phoneNumbers;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return versions
         */
        public Versions getVersions() {
            return this.versions;
        }

        public static final class Builder {
            private String appliedVersion; 
            private String contactFlowDescription; 
            private String contactFlowId; 
            private String contactFlowName; 
            private String instanceId; 
            private PhoneNumbers phoneNumbers; 
            private String type; 
            private Versions versions; 

            private Builder() {
            } 

            private Builder(ContactFlow model) {
                this.appliedVersion = model.appliedVersion;
                this.contactFlowDescription = model.contactFlowDescription;
                this.contactFlowId = model.contactFlowId;
                this.contactFlowName = model.contactFlowName;
                this.instanceId = model.instanceId;
                this.phoneNumbers = model.phoneNumbers;
                this.type = model.type;
                this.versions = model.versions;
            } 

            /**
             * AppliedVersion.
             */
            public Builder appliedVersion(String appliedVersion) {
                this.appliedVersion = appliedVersion;
                return this;
            }

            /**
             * ContactFlowDescription.
             */
            public Builder contactFlowDescription(String contactFlowDescription) {
                this.contactFlowDescription = contactFlowDescription;
                return this;
            }

            /**
             * ContactFlowId.
             */
            public Builder contactFlowId(String contactFlowId) {
                this.contactFlowId = contactFlowId;
                return this;
            }

            /**
             * ContactFlowName.
             */
            public Builder contactFlowName(String contactFlowName) {
                this.contactFlowName = contactFlowName;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * PhoneNumbers.
             */
            public Builder phoneNumbers(PhoneNumbers phoneNumbers) {
                this.phoneNumbers = phoneNumbers;
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
             * Versions.
             */
            public Builder versions(Versions versions) {
                this.versions = versions;
                return this;
            }

            public ContactFlow build() {
                return new ContactFlow(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListContactFlowsResponseBody} extends {@link TeaModel}
     *
     * <p>ListContactFlowsResponseBody</p>
     */
    public static class ContactFlows extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContactFlow")
        private java.util.List<ContactFlow> contactFlow;

        private ContactFlows(Builder builder) {
            this.contactFlow = builder.contactFlow;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContactFlows create() {
            return builder().build();
        }

        /**
         * @return contactFlow
         */
        public java.util.List<ContactFlow> getContactFlow() {
            return this.contactFlow;
        }

        public static final class Builder {
            private java.util.List<ContactFlow> contactFlow; 

            private Builder() {
            } 

            private Builder(ContactFlows model) {
                this.contactFlow = model.contactFlow;
            } 

            /**
             * ContactFlow.
             */
            public Builder contactFlow(java.util.List<ContactFlow> contactFlow) {
                this.contactFlow = contactFlow;
                return this;
            }

            public ContactFlows build() {
                return new ContactFlows(this);
            } 

        } 

    }
}
