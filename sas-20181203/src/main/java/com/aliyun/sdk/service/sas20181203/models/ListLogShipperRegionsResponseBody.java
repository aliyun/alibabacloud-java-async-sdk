// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListLogShipperRegionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListLogShipperRegionsResponseBody</p>
 */
public class ListLogShipperRegionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LogShipperRegionList")
    private java.util.List<LogShipperRegionList> logShipperRegionList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListLogShipperRegionsResponseBody(Builder builder) {
        this.logShipperRegionList = builder.logShipperRegionList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLogShipperRegionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return logShipperRegionList
     */
    public java.util.List<LogShipperRegionList> getLogShipperRegionList() {
        return this.logShipperRegionList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<LogShipperRegionList> logShipperRegionList; 
        private String requestId; 

        /**
         * <p>The regions supported by the log delivery feature.</p>
         */
        public Builder logShipperRegionList(java.util.List<LogShipperRegionList> logShipperRegionList) {
            this.logShipperRegionList = logShipperRegionList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F9C4DE22-D242-5ABA-87EC-325ECBDC****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListLogShipperRegionsResponseBody build() {
            return new ListLogShipperRegionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListLogShipperRegionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListLogShipperRegionsResponseBody</p>
     */
    public static class LogShipperRegionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private LogShipperRegionList(Builder builder) {
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LogShipperRegionList create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String regionId; 

            /**
             * <p>The ID of the region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public LogShipperRegionList build() {
                return new LogShipperRegionList(this);
            } 

        } 

    }
}
