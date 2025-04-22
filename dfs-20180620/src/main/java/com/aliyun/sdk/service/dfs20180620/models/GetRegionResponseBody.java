// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dfs20180620.models;

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
 * {@link GetRegionResponseBody} extends {@link TeaModel}
 *
 * <p>GetRegionResponseBody</p>
 */
public class GetRegionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AvailableZones")
    private java.util.List<AvailableZones> availableZones;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetRegionResponseBody(Builder builder) {
        this.availableZones = builder.availableZones;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRegionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return availableZones
     */
    public java.util.List<AvailableZones> getAvailableZones() {
        return this.availableZones;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<AvailableZones> availableZones; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetRegionResponseBody model) {
            this.availableZones = model.availableZones;
            this.requestId = model.requestId;
        } 

        /**
         * AvailableZones.
         */
        public Builder availableZones(java.util.List<AvailableZones> availableZones) {
            this.availableZones = availableZones;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetRegionResponseBody build() {
            return new GetRegionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRegionResponseBody} extends {@link TeaModel}
     *
     * <p>GetRegionResponseBody</p>
     */
    public static class Options extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProtocolType")
        private String protocolType;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        private Options(Builder builder) {
            this.protocolType = builder.protocolType;
            this.storageType = builder.storageType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Options create() {
            return builder().build();
        }

        /**
         * @return protocolType
         */
        public String getProtocolType() {
            return this.protocolType;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        public static final class Builder {
            private String protocolType; 
            private String storageType; 

            private Builder() {
            } 

            private Builder(Options model) {
                this.protocolType = model.protocolType;
                this.storageType = model.storageType;
            } 

            /**
             * ProtocolType.
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * StorageType.
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            public Options build() {
                return new Options(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRegionResponseBody} extends {@link TeaModel}
     *
     * <p>GetRegionResponseBody</p>
     */
    public static class AvailableZones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Options")
        private java.util.List<Options> options;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private AvailableZones(Builder builder) {
            this.options = builder.options;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableZones create() {
            return builder().build();
        }

        /**
         * @return options
         */
        public java.util.List<Options> getOptions() {
            return this.options;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private java.util.List<Options> options; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(AvailableZones model) {
                this.options = model.options;
                this.zoneId = model.zoneId;
            } 

            /**
             * Options.
             */
            public Builder options(java.util.List<Options> options) {
                this.options = options;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public AvailableZones build() {
                return new AvailableZones(this);
            } 

        } 

    }
}
