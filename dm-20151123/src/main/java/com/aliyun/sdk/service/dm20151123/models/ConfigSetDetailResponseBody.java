// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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
 * {@link ConfigSetDetailResponseBody} extends {@link TeaModel}
 *
 * <p>ConfigSetDetailResponseBody</p>
 */
public class ConfigSetDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Detail")
    private Detail detail;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ConfigSetDetailResponseBody(Builder builder) {
        this.detail = builder.detail;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigSetDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return detail
     */
    public Detail getDetail() {
        return this.detail;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Detail detail; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ConfigSetDetailResponseBody model) {
            this.detail = model.detail;
            this.requestId = model.requestId;
        } 

        /**
         * Detail.
         */
        public Builder detail(Detail detail) {
            this.detail = detail;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ConfigSetDetailResponseBody build() {
            return new ConfigSetDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ConfigSetDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ConfigSetDetailResponseBody</p>
     */
    public static class IpPool extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IpPoolId")
        private String ipPoolId;

        @com.aliyun.core.annotation.NameInMap("IpPoolName")
        private String ipPoolName;

        private IpPool(Builder builder) {
            this.ipPoolId = builder.ipPoolId;
            this.ipPoolName = builder.ipPoolName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpPool create() {
            return builder().build();
        }

        /**
         * @return ipPoolId
         */
        public String getIpPoolId() {
            return this.ipPoolId;
        }

        /**
         * @return ipPoolName
         */
        public String getIpPoolName() {
            return this.ipPoolName;
        }

        public static final class Builder {
            private String ipPoolId; 
            private String ipPoolName; 

            private Builder() {
            } 

            private Builder(IpPool model) {
                this.ipPoolId = model.ipPoolId;
                this.ipPoolName = model.ipPoolName;
            } 

            /**
             * IpPoolId.
             */
            public Builder ipPoolId(String ipPoolId) {
                this.ipPoolId = ipPoolId;
                return this;
            }

            /**
             * IpPoolName.
             */
            public Builder ipPoolName(String ipPoolName) {
                this.ipPoolName = ipPoolName;
                return this;
            }

            public IpPool build() {
                return new IpPool(this);
            } 

        } 

    }
    /**
     * 
     * {@link ConfigSetDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ConfigSetDetailResponseBody</p>
     */
    public static class ValidationOption extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("ForbiddenStatusList")
        private java.util.List<String> forbiddenStatusList;

        @com.aliyun.core.annotation.NameInMap("ForbiddenSubStatusList")
        private java.util.List<String> forbiddenSubStatusList;

        private ValidationOption(Builder builder) {
            this.enabled = builder.enabled;
            this.forbiddenStatusList = builder.forbiddenStatusList;
            this.forbiddenSubStatusList = builder.forbiddenSubStatusList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ValidationOption create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return forbiddenStatusList
         */
        public java.util.List<String> getForbiddenStatusList() {
            return this.forbiddenStatusList;
        }

        /**
         * @return forbiddenSubStatusList
         */
        public java.util.List<String> getForbiddenSubStatusList() {
            return this.forbiddenSubStatusList;
        }

        public static final class Builder {
            private Boolean enabled; 
            private java.util.List<String> forbiddenStatusList; 
            private java.util.List<String> forbiddenSubStatusList; 

            private Builder() {
            } 

            private Builder(ValidationOption model) {
                this.enabled = model.enabled;
                this.forbiddenStatusList = model.forbiddenStatusList;
                this.forbiddenSubStatusList = model.forbiddenSubStatusList;
            } 

            /**
             * Enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * ForbiddenStatusList.
             */
            public Builder forbiddenStatusList(java.util.List<String> forbiddenStatusList) {
                this.forbiddenStatusList = forbiddenStatusList;
                return this;
            }

            /**
             * ForbiddenSubStatusList.
             */
            public Builder forbiddenSubStatusList(java.util.List<String> forbiddenSubStatusList) {
                this.forbiddenSubStatusList = forbiddenSubStatusList;
                return this;
            }

            public ValidationOption build() {
                return new ValidationOption(this);
            } 

        } 

    }
    /**
     * 
     * {@link ConfigSetDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ConfigSetDetailResponseBody</p>
     */
    public static class Detail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IpPool")
        private IpPool ipPool;

        @com.aliyun.core.annotation.NameInMap("IsPublicChannelBackoff")
        private Boolean isPublicChannelBackoff;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ValidationOption")
        private ValidationOption validationOption;

        private Detail(Builder builder) {
            this.description = builder.description;
            this.id = builder.id;
            this.ipPool = builder.ipPool;
            this.isPublicChannelBackoff = builder.isPublicChannelBackoff;
            this.name = builder.name;
            this.validationOption = builder.validationOption;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Detail create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return ipPool
         */
        public IpPool getIpPool() {
            return this.ipPool;
        }

        /**
         * @return isPublicChannelBackoff
         */
        public Boolean getIsPublicChannelBackoff() {
            return this.isPublicChannelBackoff;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return validationOption
         */
        public ValidationOption getValidationOption() {
            return this.validationOption;
        }

        public static final class Builder {
            private String description; 
            private String id; 
            private IpPool ipPool; 
            private Boolean isPublicChannelBackoff; 
            private String name; 
            private ValidationOption validationOption; 

            private Builder() {
            } 

            private Builder(Detail model) {
                this.description = model.description;
                this.id = model.id;
                this.ipPool = model.ipPool;
                this.isPublicChannelBackoff = model.isPublicChannelBackoff;
                this.name = model.name;
                this.validationOption = model.validationOption;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * IpPool.
             */
            public Builder ipPool(IpPool ipPool) {
                this.ipPool = ipPool;
                return this;
            }

            /**
             * IsPublicChannelBackoff.
             */
            public Builder isPublicChannelBackoff(Boolean isPublicChannelBackoff) {
                this.isPublicChannelBackoff = isPublicChannelBackoff;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ValidationOption.
             */
            public Builder validationOption(ValidationOption validationOption) {
                this.validationOption = validationOption;
                return this;
            }

            public Detail build() {
                return new Detail(this);
            } 

        } 

    }
}
