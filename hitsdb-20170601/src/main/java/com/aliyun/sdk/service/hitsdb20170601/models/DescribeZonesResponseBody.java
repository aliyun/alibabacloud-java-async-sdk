// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20170601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeZonesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeZonesResponseBody</p>
 */
public class DescribeZonesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ZoneList")
    private ZoneList zoneList;

    private DescribeZonesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.zoneList = builder.zoneList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeZonesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return zoneList
     */
    public ZoneList getZoneList() {
        return this.zoneList;
    }

    public static final class Builder {
        private String requestId; 
        private ZoneList zoneList; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ZoneList.
         */
        public Builder zoneList(ZoneList zoneList) {
            this.zoneList = zoneList;
            return this;
        }

        public DescribeZonesResponseBody build() {
            return new DescribeZonesResponseBody(this);
        } 

    } 

    public static class ZoneModel extends TeaModel {
        @NameInMap("LocalName")
        private String localName;

        @NameInMap("ZoneId")
        private String zoneId;

        private ZoneModel(Builder builder) {
            this.localName = builder.localName;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZoneModel create() {
            return builder().build();
        }

        /**
         * @return localName
         */
        public String getLocalName() {
            return this.localName;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String localName; 
            private String zoneId; 

            /**
             * LocalName.
             */
            public Builder localName(String localName) {
                this.localName = localName;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public ZoneModel build() {
                return new ZoneModel(this);
            } 

        } 

    }
    public static class ZoneList extends TeaModel {
        @NameInMap("ZoneModel")
        private java.util.List < ZoneModel> zoneModel;

        private ZoneList(Builder builder) {
            this.zoneModel = builder.zoneModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZoneList create() {
            return builder().build();
        }

        /**
         * @return zoneModel
         */
        public java.util.List < ZoneModel> getZoneModel() {
            return this.zoneModel;
        }

        public static final class Builder {
            private java.util.List < ZoneModel> zoneModel; 

            /**
             * ZoneModel.
             */
            public Builder zoneModel(java.util.List < ZoneModel> zoneModel) {
                this.zoneModel = zoneModel;
                return this;
            }

            public ZoneList build() {
                return new ZoneList(this);
            } 

        } 

    }
}
