// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link ListInstallableGatewaysResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstallableGatewaysResponseBody</p>
 */
public class ListInstallableGatewaysResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListInstallableGatewaysResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstallableGatewaysResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListInstallableGatewaysResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListInstallableGatewaysResponseBody build() {
            return new ListInstallableGatewaysResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstallableGatewaysResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstallableGatewaysResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("engineVersion")
        private String engineVersion;

        @com.aliyun.core.annotation.NameInMap("gatewayId")
        private String gatewayId;

        @com.aliyun.core.annotation.NameInMap("gatewayPhase")
        private String gatewayPhase;

        @com.aliyun.core.annotation.NameInMap("installable")
        private Boolean installable;

        @com.aliyun.core.annotation.NameInMap("installableFalseReasonType")
        private String installableFalseReasonType;

        @com.aliyun.core.annotation.NameInMap("installedPluginVersion")
        private String installedPluginVersion;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Items(Builder builder) {
            this.engineVersion = builder.engineVersion;
            this.gatewayId = builder.gatewayId;
            this.gatewayPhase = builder.gatewayPhase;
            this.installable = builder.installable;
            this.installableFalseReasonType = builder.installableFalseReasonType;
            this.installedPluginVersion = builder.installedPluginVersion;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return engineVersion
         */
        public String getEngineVersion() {
            return this.engineVersion;
        }

        /**
         * @return gatewayId
         */
        public String getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return gatewayPhase
         */
        public String getGatewayPhase() {
            return this.gatewayPhase;
        }

        /**
         * @return installable
         */
        public Boolean getInstallable() {
            return this.installable;
        }

        /**
         * @return installableFalseReasonType
         */
        public String getInstallableFalseReasonType() {
            return this.installableFalseReasonType;
        }

        /**
         * @return installedPluginVersion
         */
        public String getInstalledPluginVersion() {
            return this.installedPluginVersion;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String engineVersion; 
            private String gatewayId; 
            private String gatewayPhase; 
            private Boolean installable; 
            private String installableFalseReasonType; 
            private String installedPluginVersion; 
            private String name; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.engineVersion = model.engineVersion;
                this.gatewayId = model.gatewayId;
                this.gatewayPhase = model.gatewayPhase;
                this.installable = model.installable;
                this.installableFalseReasonType = model.installableFalseReasonType;
                this.installedPluginVersion = model.installedPluginVersion;
                this.name = model.name;
            } 

            /**
             * engineVersion.
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * gatewayId.
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * gatewayPhase.
             */
            public Builder gatewayPhase(String gatewayPhase) {
                this.gatewayPhase = gatewayPhase;
                return this;
            }

            /**
             * installable.
             */
            public Builder installable(Boolean installable) {
                this.installable = installable;
                return this;
            }

            /**
             * installableFalseReasonType.
             */
            public Builder installableFalseReasonType(String installableFalseReasonType) {
                this.installableFalseReasonType = installableFalseReasonType;
                return this;
            }

            /**
             * installedPluginVersion.
             */
            public Builder installedPluginVersion(String installedPluginVersion) {
                this.installedPluginVersion = installedPluginVersion;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstallableGatewaysResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstallableGatewaysResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<Items> items;

        @com.aliyun.core.annotation.NameInMap("pageNumber")
        private String pageNumber;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private String pageSize;

        @com.aliyun.core.annotation.NameInMap("totalSize")
        private String totalSize;

        private Data(Builder builder) {
            this.items = builder.items;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
        }

        /**
         * @return pageNumber
         */
        public String getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public String getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalSize
         */
        public String getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private java.util.List<Items> items; 
            private String pageNumber; 
            private String pageSize; 
            private String totalSize; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.items = model.items;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalSize = model.totalSize;
            } 

            /**
             * items.
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * pageNumber.
             */
            public Builder pageNumber(String pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * pageSize.
             */
            public Builder pageSize(String pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * totalSize.
             */
            public Builder totalSize(String totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
