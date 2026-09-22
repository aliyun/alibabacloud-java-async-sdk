// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ListZonesResponseBody} extends {@link TeaModel}
 *
 * <p>ListZonesResponseBody</p>
 */
public class ListZonesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ListZonesModel")
    private ListZonesModel listZonesModel;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListZonesResponseBody(Builder builder) {
        this.listZonesModel = builder.listZonesModel;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListZonesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return listZonesModel
     */
    public ListZonesModel getListZonesModel() {
        return this.listZonesModel;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ListZonesModel listZonesModel; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListZonesResponseBody model) {
            this.listZonesModel = model.listZonesModel;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The zone query result.</p>
         */
        public Builder listZonesModel(ListZonesModel listZonesModel) {
            this.listZonesModel = listZonesModel;
            return this;
        }

        /**
         * <p>The request ID. You can use this ID to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListZonesResponseBody build() {
            return new ListZonesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListZonesResponseBody} extends {@link TeaModel}
     *
     * <p>ListZonesResponseBody</p>
     */
    public static class ListZonesModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Zones")
        private java.util.List<String> zones;

        private ListZonesModel(Builder builder) {
            this.zones = builder.zones;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListZonesModel create() {
            return builder().build();
        }

        /**
         * @return zones
         */
        public java.util.List<String> getZones() {
            return this.zones;
        }

        public static final class Builder {
            private java.util.List<String> zones; 

            private Builder() {
            } 

            private Builder(ListZonesModel model) {
                this.zones = model.zones;
            } 

            /**
             * <p>The list of available zone IDs for the specified product type and operating system type in the current region. When creating a resource that requires a vSwitch, select a vSwitch in one of these zones.</p>
             */
            public Builder zones(java.util.List<String> zones) {
                this.zones = zones;
                return this;
            }

            public ListZonesModel build() {
                return new ListZonesModel(this);
            } 

        } 

    }
}
