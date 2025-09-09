// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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
 * {@link GetNetworkAvailableZonesResponseBody} extends {@link TeaModel}
 *
 * <p>GetNetworkAvailableZonesResponseBody</p>
 */
public class GetNetworkAvailableZonesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetNetworkAvailableZonesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNetworkAvailableZonesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetNetworkAvailableZonesResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetNetworkAvailableZonesResponseBody build() {
            return new GetNetworkAvailableZonesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetNetworkAvailableZonesResponseBody} extends {@link TeaModel}
     *
     * <p>GetNetworkAvailableZonesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ZoneIdList")
        private java.util.List<String> zoneIdList;

        private Data(Builder builder) {
            this.zoneIdList = builder.zoneIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return zoneIdList
         */
        public java.util.List<String> getZoneIdList() {
            return this.zoneIdList;
        }

        public static final class Builder {
            private java.util.List<String> zoneIdList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.zoneIdList = model.zoneIdList;
            } 

            /**
             * ZoneIdList.
             */
            public Builder zoneIdList(java.util.List<String> zoneIdList) {
                this.zoneIdList = zoneIdList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
