// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link LocationTransferType} extends {@link TeaModel}
 *
 * <p>LocationTransferType</p>
 */
public class LocationTransferType extends TeaModel {
    @NameInMap("Location")
    private String location;

    @NameInMap("TransferTypes")
    private TransferTypes transferTypes;

    private LocationTransferType(Builder builder) {
        this.location = builder.location;
        this.transferTypes = builder.transferTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LocationTransferType create() {
        return builder().build();
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @return transferTypes
     */
    public TransferTypes getTransferTypes() {
        return this.transferTypes;
    }

    public static final class Builder {
        private String location; 
        private TransferTypes transferTypes; 

        /**
         * The region in which the destination bucket can be located
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * The container that stores the transmission type
         */
        public Builder transferTypes(TransferTypes transferTypes) {
            this.transferTypes = transferTypes;
            return this;
        }

        public LocationTransferType build() {
            return new LocationTransferType(this);
        } 

    } 

    public static class TransferTypes extends TeaModel {
        @NameInMap("Type")
        private String type;

        private TransferTypes(Builder builder) {
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TransferTypes create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String type; 

            /**
             * The link used to transfer data in Cross-region replication
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public TransferTypes build() {
                return new TransferTypes(this);
            } 

        } 

    }
}
