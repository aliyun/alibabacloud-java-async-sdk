// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetOSSFlowStatisResponseBody} extends {@link TeaModel}
 *
 * <p>GetOSSFlowStatisResponseBody</p>
 */
public class GetOSSFlowStatisResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OSSFlowStatisList")
    private java.util.List<OSSFlowStatisList> OSSFlowStatisList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetOSSFlowStatisResponseBody(Builder builder) {
        this.OSSFlowStatisList = builder.OSSFlowStatisList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOSSFlowStatisResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return OSSFlowStatisList
     */
    public java.util.List<OSSFlowStatisList> getOSSFlowStatisList() {
        return this.OSSFlowStatisList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<OSSFlowStatisList> OSSFlowStatisList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetOSSFlowStatisResponseBody model) {
            this.OSSFlowStatisList = model.OSSFlowStatisList;
            this.requestId = model.requestId;
        } 

        /**
         * OSSFlowStatisList.
         */
        public Builder OSSFlowStatisList(java.util.List<OSSFlowStatisList> OSSFlowStatisList) {
            this.OSSFlowStatisList = OSSFlowStatisList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetOSSFlowStatisResponseBody build() {
            return new GetOSSFlowStatisResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetOSSFlowStatisResponseBody} extends {@link TeaModel}
     *
     * <p>GetOSSFlowStatisResponseBody</p>
     */
    public static class OSSFlowStatisList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NetworkOut")
        private Long networkOut;

        @com.aliyun.core.annotation.NameInMap("StatTime")
        private String statTime;

        @com.aliyun.core.annotation.NameInMap("StatTimeUTC")
        private String statTimeUTC;

        private OSSFlowStatisList(Builder builder) {
            this.networkOut = builder.networkOut;
            this.statTime = builder.statTime;
            this.statTimeUTC = builder.statTimeUTC;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OSSFlowStatisList create() {
            return builder().build();
        }

        /**
         * @return networkOut
         */
        public Long getNetworkOut() {
            return this.networkOut;
        }

        /**
         * @return statTime
         */
        public String getStatTime() {
            return this.statTime;
        }

        /**
         * @return statTimeUTC
         */
        public String getStatTimeUTC() {
            return this.statTimeUTC;
        }

        public static final class Builder {
            private Long networkOut; 
            private String statTime; 
            private String statTimeUTC; 

            private Builder() {
            } 

            private Builder(OSSFlowStatisList model) {
                this.networkOut = model.networkOut;
                this.statTime = model.statTime;
                this.statTimeUTC = model.statTimeUTC;
            } 

            /**
             * NetworkOut.
             */
            public Builder networkOut(Long networkOut) {
                this.networkOut = networkOut;
                return this;
            }

            /**
             * StatTime.
             */
            public Builder statTime(String statTime) {
                this.statTime = statTime;
                return this;
            }

            /**
             * StatTimeUTC.
             */
            public Builder statTimeUTC(String statTimeUTC) {
                this.statTimeUTC = statTimeUTC;
                return this;
            }

            public OSSFlowStatisList build() {
                return new OSSFlowStatisList(this);
            } 

        } 

    }
}
